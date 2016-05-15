package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 5/15/16.
 */
public class ModifySecurityGroupsOfInstanceRequest extends CommonRequest{
    private String instanceId;
    private List<String> securityGroupIds;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    @Override
    public String toString() {
        return "ModifySecurityGroupsOfInstanceRequest{" +
                "instanceId='" + instanceId + '\'' +
                ", securityGroupIds=" + securityGroupIds +
                '}';
    }

    @Override
    public Map toMap() {
        Map<String, String> map = new Gson().fromJson(new Gson().toJson(this), new TypeToken<Map<String, String>>() {
        }.getType());

        if (instanceId != null) {
            map.put("instanceSet.0.instanceId", instanceId);
            map.remove("instanceId");
        }

        if (securityGroupIds != null) {
            int i = 0;
            for (String sg : securityGroupIds) {
                map.put("instanceSet.0.sgIds." + i, sg);
                i++;
            }
            map.remove("securityGroupIds");
        }
        return map;
    }
}
