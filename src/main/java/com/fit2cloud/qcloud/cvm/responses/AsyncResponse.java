package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

/**
 * Created by chixq on 5/9/16.
 */
public class AsyncResponse extends CommonResponse {
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public String toString() {
        return "AsyncResponse{" +
                "requestId='" + requestId + '\'' +
                '}';
    }
}
