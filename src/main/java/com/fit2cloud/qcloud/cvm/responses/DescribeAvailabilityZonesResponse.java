package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.ZoneSet;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class DescribeAvailabilityZonesResponse extends CommonResponse{
    private int TotalCount;
    private List<ZoneSet> zoneSet;

    public int getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(int totalCount) {
        this.TotalCount = totalCount;
    }

    public List<ZoneSet> getZoneSet() {
        return zoneSet;
    }

    public void setZoneSet(List<ZoneSet> zoneSet) {
        this.zoneSet = zoneSet;
    }

    @Override
    public String toString() {
        return "DescribeAvailabilityZonesResponse{" +
                "totalCount=" + TotalCount +
                ", zoneSet=" + zoneSet +
                '}';
    }
}
