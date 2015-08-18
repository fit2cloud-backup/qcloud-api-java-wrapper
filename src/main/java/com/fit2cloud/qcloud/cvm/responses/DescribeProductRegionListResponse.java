package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.Map;

/**
 * Created by chixq on 8/17/15.
 */
public class DescribeProductRegionListResponse extends CommonResponse{
    private Map<String, String> availableRegion;

    public Map<String, String> getAvailableRegion() {
        return availableRegion;
    }

    public void setAvailableRegion(Map<String, String> availableRegion) {
        this.availableRegion = availableRegion;
    }
}
