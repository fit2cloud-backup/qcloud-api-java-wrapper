package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.HashMap;

/**
 * Created by chixq on 5/9/16.
 */
public class StartInstancesResponse extends CommonResponse {
    private HashMap<String, AsyncResponse> detail;

    public HashMap<String, AsyncResponse> getDetail() {
        return detail;
    }

    public void setDetail(HashMap<String, AsyncResponse> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "StartInstanceResponse{" +
                "detail=" + detail +
                '}';
    }

}
