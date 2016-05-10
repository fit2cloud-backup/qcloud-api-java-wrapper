package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.SGData;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeSecurityGroupsResponse extends CommonResponse {
    private List<SGData> data;

    public List<SGData> getData() {
        return data;
    }

    public void setData(List<SGData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DescribeSecurityGroupsResponse{" +
                "data=" + data +
                '}';
    }
}
