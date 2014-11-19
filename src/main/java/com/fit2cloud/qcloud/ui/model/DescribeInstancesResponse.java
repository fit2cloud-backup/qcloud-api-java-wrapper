package com.fit2cloud.qcloud.ui.model;

import com.fit2cloud.qcloud.domain.model.InstanceInfo;
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
    private int code;
    private String message;
    private int totalCount;
    private List<InstanceInfo> instanceSet;

    public DescribeInstancesResponse() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<InstanceInfo> getInstanceSet() {
        return instanceSet;
    }

    public void setInstanceSet(List<InstanceInfo> instanceSet) {

        this.instanceSet = instanceSet;
    }

    public static DescribeInstancesResponse fromJson(String json){
        return new Gson().fromJson(json, DescribeInstancesResponse.class);
    }


}
