package com.fit2cloud.qcloud;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.URL;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TreeMap;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fit2cloud.qcloud.exceptions.QCloudClientException;
import com.fit2cloud.qcloud.exceptions.QCloudServiceException;
import com.fit2cloud.qcloud.util.GlobalConst;
import com.fit2cloud.qcloud.util.QSign;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class BaseModuleRequest {
	
	protected static final String	ISO8601_DATE_FORMAT	= "yyyy-MM-dd'T'HH:mm:ss'Z'";
	protected static final Gson		gson				= new GsonBuilder().setDateFormat(ISO8601_DATE_FORMAT).create();
	
	protected String	endpoint;
	protected String	httpMethod	= GlobalConst.DEFAULT_HTTPS_METHOD;
	
	protected QCloudCredential credentials;
	
	public BaseModuleRequest(QCloudCredential credentials, String endpoint) {
		this.credentials = credentials;
		// this.endpoint = URI.create(endpoint);
		this.endpoint = endpoint;
	}
	
	public String execute(String action, Map<String, String> parameters)
	        throws QCloudClientException, QCloudServiceException {
		assert (action != null && action.length() > 0);
		if (parameters == null) {
			parameters = new HashMap<String, String>();
		}
		addCommonParams(action, parameters);
		return sendRequest(action, parameters);
	}
	
	private String sendRequest(String action, Map<String, String> parameters)
	        throws QCloudClientException, QCloudServiceException {
		InputStream stream = null;
		try {
			String query = paramsToQueryString(parameters);
			URL url = new URL("https://" + endpoint + "?" + query);
			DefaultHttpClient client = new DefaultHttpClient();
			if (System.getProperty("http.proxyHost") != null && !System.getProperty("http.proxyHost").equals("")) {
				HttpHost proxy = new HttpHost(System.getProperty("http.proxyHost"),
				        Integer.valueOf(System.getProperty("http.proxyPort")).intValue());
				client.getParams().setParameter(ConnRouteParams.DEFAULT_PROXY, proxy);
			}
			HttpGet request = new HttpGet(url.toString());
			HttpResponse response = client.execute(request);
			if (response.getStatusLine().getStatusCode() >= 400) {
				stream = response.getEntity().getContent();
				String message = readContent(stream);
				CommonErrorResponse error = gson.fromJson(message, CommonErrorResponse.class);
				QCloudServiceException exception = new QCloudServiceException(error.getMessage());
				exception.setErrorCode(error.getCode());
				exception.setService(action);
				throw exception;
			} else {
				stream = response.getEntity().getContent();
				String message = readContent(stream);
				System.out.println("message: " + message);
				return message;
			}
		} catch (IOException e) {
			throw new QCloudClientException("Failed to connect to QCloud:" + e.getMessage());
		} finally {
			safeClose(stream);
		}
	}
	
	protected void addCommonParams(String action, Map<String, String> parameters) {
		parameters.put("Action", action);
		parameters.put("SecretId", credentials.getSecretId());
		parameters.put("Timestamp", String.valueOf(new Date().getTime()).substring(0, 10));
		parameters.put("Nonce", String.valueOf(new Random().nextInt(Integer.MAX_VALUE)));
		parameters.put("Signature", computeSignature(parameters, credentials.getSecretKey()));
	}
	
	protected String computeSignature(Map<String, String> parameters, String privateKey) {
		final StringBuilder sb = new StringBuilder();
		sb.append(this.httpMethod).append(this.endpoint).append("?");
		TreeMap<String, String> sortParams = new TreeMap<String, String>(parameters);
		for (Entry<String, String> entry : sortParams.entrySet()) {
			sb.append(entry.getKey()).append("=").append(entry.getValue()).append("&");
		}
		sb.deleteCharAt(sb.length() - 1);
		// System.out.println(sb.toString());
		try {
			return QSign.sign(sb.toString(), privateKey);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private String paramsToQueryString(Map<String, String> params) throws UnsupportedEncodingException {
		if (params == null || params.size() == 0) {
			return null;
		}
		
		StringBuilder paramString = new StringBuilder();
		boolean first = true;
		for (Entry<String, String> p : params.entrySet()) {
			String key = p.getKey();
			String val = p.getValue();
			if (!first) {
				paramString.append("&");
			}
			paramString.append(URLEncoder.encode(key, GlobalConst.CHARSET));
			
			if (val != null) {
				paramString.append("=").append(URLEncoder.encode(val, GlobalConst.CHARSET));
			}
			first = false;
		}
		return paramString.toString();
	}
	
	private String readContent(InputStream content) throws IOException {
		if (content == null)
			return "";
		
		Reader reader = null;
		Writer writer = new StringWriter();
		String result;
		
		char[] buffer = new char[1024];
		try {
			reader = new BufferedReader(new InputStreamReader(content, GlobalConst.CHARSET));
			int n;
			while ((n = reader.read(buffer)) > 0) {
				writer.write(buffer, 0, n);
			}
			result = writer.toString();
		} finally {
			content.close();
			if (reader != null) {
				reader.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
		return result;
	}
	
	private void safeClose(InputStream inputStream) {
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
			}
		}
	}
}
