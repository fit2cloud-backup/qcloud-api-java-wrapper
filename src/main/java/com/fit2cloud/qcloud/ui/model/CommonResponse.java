package com.fit2cloud.qcloud.ui.model;

import com.google.gson.Gson;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:37 PM
 * Email: zhcloud@fit2cloud.com
 */
public class CommonResponse {
    private int httpCode;
    private int errorCode;
    private String errorMessage;

    public CommonResponse() {
    }

    public CommonResponse(int httpCode, int errorCode, String errorMessage) {
        this.httpCode = httpCode;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public int getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(int httpCode) {
        this.httpCode = httpCode;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {

        this.errorMessage = errorMessage;
    }


    public static CommonResponse fromJson(String json) {
        return new Gson().fromJson(json, CommonResponse.class);
    }
}
