package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.Subnet;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeSubnet extends CommonResponse {
    private List<Subnet> data;

    public List<Subnet> getSubnets() {
        return data;
    }

    public void setData(List<Subnet> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DescribeSubnet{" +
                "DescribeSubnet=" + data +
                '}';
    }
}
