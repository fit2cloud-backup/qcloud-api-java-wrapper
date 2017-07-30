package com.fit2cloud.qcloud.cvm.model;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class ZoneSet {
    private String zoneName;
    //private List<IDCList> idcList;
    private int zoneId;
    private String zone;
    private String zoneState;

    public String getzoneName() {
        return zoneName;
    }

    public void setzoneName(String zoneName) {
        this.zoneName = zoneName;
    }

//    public List<IDCList> getIdcList() {
//        return idcList;
//    }
//
//    public void setIdcList(List<IDCList> idcList) {
//        this.idcList = idcList;
//    }

    public int getzoneId() {
        return zoneId;
    }

    public void setzoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String Zone) {
        this.zone = Zone;
    }
    
    public String getzoneState() {
        return zoneState;
    }

    public void setzoneState(String zoneState) {
        this.zoneState = zoneState;
    }
    
    
    @Override
    public String toString() {
        return "ZoneSet{" +
                "zoneName='" + zoneName + '\'' +
                ", Zone=" + zone +
                ", zoneId=" + zoneId +
                '}';
    }
}
