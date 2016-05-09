package com.fit2cloud.qcloud.cvm.model;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class ZoneSet {
    private String zoneName;
    private List<IDCList> idcList;
    private int zoneId;

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public List<IDCList> getIdcList() {
        return idcList;
    }

    public void setIdcList(List<IDCList> idcList) {
        this.idcList = idcList;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    @Override
    public String toString() {
        return "ZoneSet{" +
                "zoneName='" + zoneName + '\'' +
                ", idcList=" + idcList +
                ", zoneId=" + zoneId +
                '}';
    }
}
