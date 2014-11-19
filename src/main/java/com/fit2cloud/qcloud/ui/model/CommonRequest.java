package com.fit2cloud.qcloud.ui.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:36 PM
 * Email: zhcloud@fit2cloud.com
 */
public class CommonRequest {

    private String method;
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {

        this.method = method;
    }

    public static <T> String toJson(T request) {
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        return gson.toJson(request);
    }
}

