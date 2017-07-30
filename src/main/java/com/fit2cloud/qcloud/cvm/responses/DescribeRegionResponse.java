package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.RegionData;

import java.util.List;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeRegionResponse extends CommonResponse {
    private List<RegionData> RegionSet;

    public List<RegionData> getRegionSet() {
        return RegionSet;
    }

    public void setRegionSet(List<RegionData> RegionSet) {
        this.RegionSet = RegionSet;
    }

    @Override
    public String toString() {
        return "DescribeRegionResponse{" +
                "RegionSet=" + RegionSet +
                '}';
    }
}
