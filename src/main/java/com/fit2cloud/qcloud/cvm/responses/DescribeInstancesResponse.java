package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.cvm.model.InstanceSet;
import com.fit2cloud.qcloud.CommonResponse;
import com.google.gson.Gson;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:40 PM
 * Email: zhcloud@fit2cloud.com
 */
public class DescribeInstancesResponse extends CommonResponse {
    private int totalCount;
    private List<InstanceSet> instanceSet;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<InstanceSet> getInstanceSet() {
        return instanceSet;
    }

    public void setInstanceSet(List<InstanceSet> instanceSet) {

        this.instanceSet = instanceSet;
    }

    public static DescribeInstancesResponse fromJson(String json){
        return new Gson().fromJson(json, DescribeInstancesResponse.class);
    }


}
