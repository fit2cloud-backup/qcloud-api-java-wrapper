package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.cvm.model.newInstanceSet;
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
public class DescribeInstances extends CommonResponse {
    private int TotalCount;
    private List<newInstanceSet> InstanceSet;

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public List<newInstanceSet> getInstanceSet() {
        return InstanceSet;
    }

    public void setInstanceSet(List<newInstanceSet> InstanceSet) {

        this.InstanceSet = InstanceSet;
    }

    public static DescribeInstances fromJson(String json){
        return new Gson().fromJson(json, DescribeInstances.class);
    }

    @Override
    public String toString() {
        return "DescribeInstancesResponse{" +
                "TotalCount=" + TotalCount +
                ", newInstanceSet=" + InstanceSet +
                '}';
    }
}
