package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class DeleteImagesResponse extends CommonResponse{
    private List<AsyncResponse> detail;

    public List<AsyncResponse> getDetail() {
        return detail;
    }

    public void setDetail(List<AsyncResponse> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "DeleteImagesResponse{" +
                "detail=" + detail +
                '}';
    }
}
