package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.InstanceTypeConfigSet;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeInstanceTypeConfig extends CommonResponse {
    private List<InstanceTypeConfigSet> InstanceTypeConfigSet;

    public List<InstanceTypeConfigSet> getInstanceTypeConfigSet() {
        return InstanceTypeConfigSet;
    }

    public void setRegionSet(List<InstanceTypeConfigSet> instanceTypeConfigSet) {
        this.InstanceTypeConfigSet = instanceTypeConfigSet;
    }

    @Override
    public String toString() {
        return "DescribeInstanceTypeConfig{" +
                "instanceTypeConfigSet=" + InstanceTypeConfigSet +
                '}';
    }
}
