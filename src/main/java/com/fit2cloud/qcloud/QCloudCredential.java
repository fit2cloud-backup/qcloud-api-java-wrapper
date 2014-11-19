package com.fit2cloud.qcloud;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/11/14
 * Time: 6:49 PM
 * Email: zhcloud@fit2cloud.com
 */
public class QCloudCredential {
    private String secretId;
    private String secretKey;

    public QCloudCredential(String secretId, String secretKey){
        this.secretId = secretId;
        this.secretKey = secretKey;
    }

    public QCloudCredential(){
    }

    public String getSecretId() {
        return secretId;
    }

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
