package com.fit2cloud.qcloud.ui.model;

import com.google.gson.Gson;

/**
 * Created by chixq on 14-11-19.
 */
public class RunInstancesResponse extends CommonResponse {
    private int dealId;

    public int getDealId() {
        return dealId;
    }

    public void setDealId(int dealId) {
        this.dealId = dealId;
    }

    public static RunInstancesResponse fromJson(String json){
        return new Gson().fromJson(json, RunInstancesResponse.class);

    }
}
