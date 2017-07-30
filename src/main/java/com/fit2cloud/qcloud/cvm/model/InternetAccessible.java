package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 14-11-15.
 */
public class InternetAccessible {
    private String InternetChargeType;
    private int InternetMaxBandwidthOut;

    public String getInternetChargeType() {
        return InternetChargeType;
    }

    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    public int getInternetMaxBandwidthOut() {
        return InternetMaxBandwidthOut;
    }

    public void setInternetMaxBandwidthOut(int InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }
}
