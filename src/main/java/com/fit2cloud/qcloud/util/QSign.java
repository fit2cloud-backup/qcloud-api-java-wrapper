package com.fit2cloud.qcloud.util;

import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by chixq on 14-11-15.
 */
public class QSign {
    private static final String CONTENT_CHARSET = "UTF-8";
    private static final String HMAC_ALGORITHM = "HmacSHA1";

    public static String sign(String signStr, String secret) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {

        String signature = null;
        Mac mac = Mac.getInstance(HMAC_ALGORITHM);
        SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(CONTENT_CHARSET), mac.getAlgorithm());

        mac.init(secretKey);
        byte[] hash = mac.doFinal(signStr.getBytes(CONTENT_CHARSET));

        // base64
        signature = new String(new BASE64Encoder().encode(hash).getBytes());

        return signature;
    }


    public static String makeSignPlainText(TreeMap<String, String> requestParams, String requestMethod, String endPoint) {

        StringBuilder retStr = new StringBuilder();
        retStr.append(requestMethod);
        retStr.append(endPoint);
        retStr.append(_buildParamStr(requestParams));

        return retStr.toString();
    }

    protected static String _buildParamStr(TreeMap<String, String> requestParams) {

        StringBuilder retStr = new StringBuilder();
        for (String K : requestParams.keySet()) {
            if (K.equalsIgnoreCase("Signature")) {
                continue;
            }
            if (retStr.length() == 0) {
                retStr.append("?");
            } else {
                retStr.append("&");
            }
            retStr.append(K).append("=").append(String.valueOf(requestParams.get(K)));
        }

        return retStr.toString();
    }
}
