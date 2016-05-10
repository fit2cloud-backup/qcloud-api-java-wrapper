package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 5/9/16.
 */
public class DescribeKeyPairsRequest extends CommonRequest {
    private List<String> keyIds;
    private String keyName;
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    private int limit;

    public List<String> getKeyIds() {
        return keyIds;
    }

    public void setKeyIds(List<String> keyIds) {
        this.keyIds = keyIds;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public int getOffset() {
        return offset;
    }

    @Override
    public String toString() {
        return "DescribeKeyPairsRequest{" +
                "keyIds=" + keyIds +
                ", keyName='" + keyName + '\'' +
                ", offset='" + offset + '\'' +
                ", limit='" + limit + '\'' +
                '}';
    }

    @Override
    public Map toMap() {
        Map<String, String> map = new Gson().fromJson(new Gson().toJson(this), new TypeToken<Map<String, String>>() {
        }.getType());

        if (keyIds != null) {
            int i = 0;
            for (String imageId : keyIds) {
                map.put("keyIds." + i, String.valueOf(imageId));
                i++;
            }
            map.remove("keyIds");
        }
        return map;
    }
}
