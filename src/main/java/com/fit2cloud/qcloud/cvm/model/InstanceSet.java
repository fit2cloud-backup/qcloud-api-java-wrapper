package com.fit2cloud.qcloud.cvm.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:42 PM
 * Email: zhcloud@fit2cloud.com
 */
public class InstanceSet {

    private String instanceName;
    private String instanceId;
    private String lanIp;
    private List<String> wanIpSet;
    private int cpu;
    private int mem;
    private List<DiskInfo> diskInfo;
    private int bandwidth;
    private String deviceClass;
    private String imageId;
    private int status;
    private String projectId;
    private String Region;
    private String createTime;
    private String statusTime;
    private String deadlineTime;
    private int autoRenew;
    private int zoneId;
    private String zoneName;
    private String vpcId;
    private String subnetId;
    private String isVpcGateway;

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public String getLanIp() {
        return lanIp;
    }

    public void setLanIp(String lanIp) {
        this.lanIp = lanIp;
    }

    public List<String> getWanIpSet() {
        return wanIpSet;
    }

    public void setWanIpSet(List<String> wanIpSet) {
        this.wanIpSet = wanIpSet;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public List<DiskInfo> getDiskInfo() {
        return diskInfo;
    }

    public void setDiskInfo(List<DiskInfo> diskInfo) {
        this.diskInfo = diskInfo;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(String deviceClass) {
        this.deviceClass = deviceClass;
    }

    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getStatusTime() {
        return statusTime;
    }

    public void setStatusTime(String statusTime) {
        this.statusTime = statusTime;
    }

    public String getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(String deadlineTime) {
        this.deadlineTime = deadlineTime;
    }

    public int getAutoRenew() {
        return autoRenew;
    }

    public void setAutoRenew(int autoRenew) {
        this.autoRenew = autoRenew;
    }

    public int getZoneId() {
        return zoneId;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getIsVpcGateway() {
        return isVpcGateway;
    }

    public void setIsVpcGateway(String isVpcGateway) {
        this.isVpcGateway = isVpcGateway;
    }
}
