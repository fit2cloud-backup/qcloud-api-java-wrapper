package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 14-11-15.
 */
public class InstanceStatusSet {
    private String InstanceState;
    private String InstanceId;

    public String getInstanceState() {
        return InstanceState;
    }

    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }
}
