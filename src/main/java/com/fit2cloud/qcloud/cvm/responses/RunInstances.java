package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.InstanceIdSet;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class RunInstances extends CommonResponse {
    private List<String> InstanceIdSet;

    public List<String> getInstanceIdSets() {
        return InstanceIdSet;
    }

    public void setInstanceIdSet(List<String> InstanceIdSet) {
        this.InstanceIdSet = InstanceIdSet;
    }

    @Override
    public String toString() {
        return "DescribeInstanceIdSet{" +
                "DescribeInstanceIdSet=" + InstanceIdSet +
                '}';
    }
}
