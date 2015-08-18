package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 8/17/15.
 */
public class DescribeProductRegionListRequest extends CommonRequest {
    private String instanceType;

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
}
