package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 14-11-15.
 */
public class SystemDisk {
    private String DiskType;
    private int DiskSize;
    private String DiskId;

    public String getDiskType() {
        return DiskType;
    }

    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    public int getDiskSize() {
        return DiskSize;
    }

    public void setDiskSize(int DiskSize) {
        this.DiskSize = DiskSize;
    }

    public String getDiskId() {
        return DiskId;
    }

    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }
}
