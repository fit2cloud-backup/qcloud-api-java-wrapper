package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 8/17/15.
 */
public class DescribeProductRegionListRequest extends CommonRequest {
    private int instanceType=1;

    public int getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(int instanceType) {
        this.instanceType = instanceType;
    }
}
