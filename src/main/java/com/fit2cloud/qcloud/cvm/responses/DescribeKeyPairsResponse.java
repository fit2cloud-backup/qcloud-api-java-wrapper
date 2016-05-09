package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class DescribeKeyPairsResponse extends CommonResponse {
    private String keyId;
    private String keyName;
    private String pubkey;
    private int status;
    private List<String> bindIps;
    private String createTime;
    private List<String> bindUnInstanceIds;

    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<String> getBindIps() {
        return bindIps;
    }

    public void setBindIps(List<String> bindIps) {
        this.bindIps = bindIps;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<String> getBindUnInstanceIds() {
        return bindUnInstanceIds;
    }

    public void setBindUnInstanceIds(List<String> bindUnInstanceIds) {
        this.bindUnInstanceIds = bindUnInstanceIds;
    }

    @Override
    public String toString() {
        return "DescribeKeyPairsResponse{" +
                "keyId='" + keyId + '\'' +
                ", keyName='" + keyName + '\'' +
                ", pubkey='" + pubkey + '\'' +
                ", status=" + status +
                ", bindIps=" + bindIps +
                ", createTime='" + createTime + '\'' +
                ", bindUnInstanceIds=" + bindUnInstanceIds +
                '}';
    }
}
