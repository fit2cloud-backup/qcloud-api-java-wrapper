package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 5/9/16.
 */
public class StartInstancesRequest extends CommonRequest {
    private List<String> instanceIds;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    @Override
    public String toString() {
        return "StartInstancesRequest{" +
                "instanceIds='" + instanceIds + '\'' +
                '}';
    }

    @Override
    public Map toMap() {
        Map<String, String> map = new Gson().fromJson(new Gson().toJson(this), new TypeToken<Map<String, String>>() {
        }.getType());
        if (instanceIds != null) {
            int i = 1;
            for (String instance : instanceIds) {
                map.put("instanceIds." + i, String.valueOf(instance));
                i++;
            }
            map.remove("instanceIds");
        }

        return map;
    }
}
