package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.cvm.model.InstanceStatusSet;
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
public class DescribeInstancesStatusResponse extends CommonResponse {
    private int TotalCount;
    private List<InstanceStatusSet> InstanceStatusSet;

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int TotalCount) {
        this.TotalCount = TotalCount;
    }

    public List<InstanceStatusSet> getInstanceStatusSet() {
        return InstanceStatusSet;
    }

    public void setInstanceStatusSet(List<InstanceStatusSet> InstanceStatusSet) {

        this.InstanceStatusSet = InstanceStatusSet;
    }

    public static DescribeInstancesStatusResponse fromJson(String json){
        return new Gson().fromJson(json, DescribeInstancesStatusResponse.class);
    }

    @Override
    public String toString() {
        return "DescribeInstancesResponse{" +
                "TotalCount=" + TotalCount +
                ", InstanceStatusSet=" + InstanceStatusSet +
                '}';
    }
}
