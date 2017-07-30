package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 5/11/16.
 */
public class RegionData {
    private String Region;
    private String RegionName;
    private String RegionState;

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        this.Region = region;
    }

    public String getRegionName() {
        return RegionName;
    }
    
    public void setRegionName(String RegionName ) {
         this.RegionName = RegionName;
    }

    public String getSgRemark() {
        return RegionState;
    }

    public void setRegionState(String regionState) {
        this.RegionState = regionState;
    }

}
