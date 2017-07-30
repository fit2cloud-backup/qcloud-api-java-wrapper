package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.Vpc;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeIVpc extends CommonResponse {
    private List<Vpc> data;

    public List<Vpc> getVpcs() {
        return data;
    }

    public void setData(List<Vpc> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DescribeVpc{" +
                "DescribeVpc=" + data +
                '}';
    }
}
