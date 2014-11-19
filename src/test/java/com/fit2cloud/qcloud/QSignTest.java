package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.util.QSign;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

/**
 * Created by chixq on 14-11-14.
 */
public class QSignTest {

    private static final String SECRET_ID = "YOUR_SECRET_ID";
    private static final String SECRET_KEY = "YOUR_SECRET_KEY";

    public static void main(String[] args) {

        TreeMap<String, String> requestParams = new TreeMap<String, String>();
        requestParams.put("SecretId", SECRET_ID);
        requestParams.put("Region", "gz");
        requestParams.put("Timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        Random rand = new Random();
        requestParams.put("Nonce", String.valueOf(rand.nextInt(Integer.MAX_VALUE)));

        requestParams.put("Action", "DescribeInstances");

        String requestMethod = "POST";
        String requestEndpoint = "cvm.api.qcloud.com/v2/index.php";

        try {
            String plainText = QSign.makeSignPlainText(requestParams, requestMethod, requestEndpoint);
            String sign = QSign.sign(plainText, SECRET_KEY);
            System.out.println("PlainTest: " + plainText);
            System.out.println("Sign: " + sign);

            if (requestMethod.equals("GET")) {
                requestParams.put("Signature", java.net.URLEncoder.encode(sign, "UTF-8"));
            } else {
                requestParams.put("Signature", sign);
            }

            String retStr = _sendRequest("https://" +requestEndpoint, requestParams, requestMethod);
            System.out.println(retStr);

        } catch(Exception e) {
            System.out.println(e);
        }

    }

    protected static String _sendRequest(String url,
                                         Map<String, String> requestParams, String requestMethod)
    {
        String result = "";
        BufferedReader in = null;
        String paramStr = "";

        for(String key: requestParams.keySet()) {
            if (!paramStr.isEmpty()) {
                paramStr += '&';
            }
            paramStr += key + '=' + requestParams.get(key).toString();
        }

        try {

            if (requestMethod.equals("GET")) {
                if (url.indexOf('?') > 0)
                {
                    url += '&' + paramStr;
                } else {
                    url += '?' + paramStr;
                }
            }

            URL realUrl = new URL(url);
            URLConnection connection = null;
            if (url.substring(0, 5).toUpperCase().equals("HTTPS")) {
                HttpsURLConnection httpsConn = (HttpsURLConnection)realUrl.openConnection();

                httpsConn.setHostnameVerifier(new HostnameVerifier(){
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
                    connection.getInputStream()));

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
        return result;
    }
}
