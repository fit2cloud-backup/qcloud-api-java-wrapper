package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.ui.model.DescribeInstancesRequest;
import com.fit2cloud.qcloud.ui.model.transform.DescribeInstancesRequestMarshaller;
import com.fit2cloud.qcloud.util.QSign;
import com.fit2cloud.qcloud.ui.model.DescribeInstancesResponse;
import org.apache.commons.lang.StringEscapeUtils;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.ws.rs.HttpMethod;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by chixq on 14-11-17.
 */
public class QCloudClient {

    private static final String END_POINT = "cvm.api.qcloud.com/v2/index.php";
    private static final String REGION = "gz";
    public QCloudCredential credential;

    public QCloudClient(QCloudCredential credential) {
        this.credential = credential;
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) {
        try {
            String requestMethod = request.getMethod();
            String requestAction = request.getAction();
            TreeMap<String, String> requestParams = new DescribeInstancesRequestMarshaller().marshall(request);
            String retStr = _sendRequest(requestParams, requestMethod, requestAction);
            return DescribeInstancesResponse.fromJson(retStr);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;
    }

    protected String _sendRequest(TreeMap<String, String> requestParams, String requestMethod, String action) {
        return this._sendRequest(END_POINT, requestParams, requestMethod, action);
    }

    protected String _sendRequest(String url, TreeMap<String, String> requestParams, String requestMethod, String action) {
        requestParams.put("SecretId", credential.getSecretId());
        requestParams.put("Region", REGION);
        requestParams.put("Timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        Random rand = new Random();
        requestParams.put("Nonce", String.valueOf(rand.nextInt(Integer.MAX_VALUE)));
        requestParams.put("Action", action);
        if (requestParams.containsKey("action")) {
            requestParams.remove("action");
        }
        if (requestParams.containsKey("method")) {
            requestParams.remove("method");
        }
        String plainText = QSign.makeSignPlainText(requestParams, requestMethod, END_POINT);
        String signature;
        try {
            signature = QSign.sign(plainText, credential.getSecretKey());
            if (requestMethod.equalsIgnoreCase(HttpMethod.GET)) {
                requestParams.put("Signature", java.net.URLEncoder.encode(signature, "UTF-8"));
            } else {
                requestParams.put("Signature", signature);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }


        String result = "";
        BufferedReader in = null;
        StringBuilder paramStr = new StringBuilder();

        for (Map.Entry entry : requestParams.entrySet()) {
            if (paramStr.length() != 0) {
                paramStr.append("&");
            }
            paramStr.append(entry.getKey()).append("=").append(entry.getValue());
        }

        try {
            if (requestMethod.equals("GET")) {
                if (url.indexOf("?") > 0) {
                    url += "&" + paramStr;
                } else {
                    url += "?" + paramStr;
                }
            }
            URL realUrl = new URL("https://" + url);
            URLConnection connection;
            if (url.substring(0, 5).toUpperCase().equals("HTTPS")) {
                HttpsURLConnection httpsConn = (HttpsURLConnection) realUrl.openConnection();

                httpsConn.setHostnameVerifier(new HostnameVerifier() {
                    public boolean verify(String hostname, SSLSession session) {
                        return true;
                    }
                });
                connection = httpsConn;
            } else {
                connection = realUrl.openConnection();
            }

            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");

            if (requestMethod.equals("POST")) {
                connection.setDoOutput(true);
                connection.setDoInput(true);
                PrintWriter out = new PrintWriter(connection.getOutputStream());
                out.print(paramStr);
                out.flush();
            }
            connection.connect();

            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(), "UTF-8"));

            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        System.out.println("Response: " + StringEscapeUtils.unescapeJava(result));
        return result;
    }
}
