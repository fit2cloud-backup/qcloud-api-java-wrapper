package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 14-11-15.
 */
public class Placement {
    private String Zone;
    private int ProjectId;
    private String HostId;

    public String getZone() {
        return Zone;
    }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public int getProjectId() {
        return ProjectId;
    }

    public void setProjectId(int ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getHostId() {
        return HostId;
    }

    public void setHostId(String HostId) {
        this.HostId = HostId;
    }
}
