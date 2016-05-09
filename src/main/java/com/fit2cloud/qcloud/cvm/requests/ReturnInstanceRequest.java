package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 5/9/16.
 */
public class ReturnInstanceRequest extends CommonRequest {
    private String instanceId;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public String toString() {
        return "ReturnInstanceRequest{" +
                "instanceId='" + instanceId + '\'' +
                '}';
    }
}
