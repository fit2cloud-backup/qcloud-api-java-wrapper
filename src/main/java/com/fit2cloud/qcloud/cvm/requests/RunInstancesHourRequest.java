package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 5/9/16.
 */
public class RunInstancesHourRequest extends CommonRequest {
    private int imageType;
    private String imageId;
    private int cpu;
    private int mem;
    private int bandwidth;
    private String bandwidthType;
    private int storageType;
    private int storageSize;
    private int rootSize;
    private int goodsNum;
    private int zoneId;
    private String vpcId;
    private String subnetId;
    private int isVpcGateway;
    private String password;
    private int needSecurityAgent;
    private int needMonitorAgent;
    private int projectId;
    private int wanIp;
    private String keyId;

    public int getImageType() {
        return imageType;
    }

    public String getImageId() {
        return imageId;
    }

    public int getCpu() {
        return cpu;
    }

    public int getMem() {
        return mem;
    }

    public int getBandwidth() {
        return bandwidth;
    }

    public String getBandwidthType() {
        return bandwidthType;
    }

    public int getStorageType() {
        return storageType;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public int getRootSize() {
        return rootSize;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public int getZoneId() {
        return zoneId;
    }

    public String getVpcId() {
        return vpcId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public int getIsVpcGateway() {
        return isVpcGateway;
    }

    public String getPassword() {
        return password;
    }

    public int getNeedSecurityAgent() {
        return needSecurityAgent;
    }

    public int getNeedMonitorAgent() {
        return needMonitorAgent;
    }

    public int getProjectId() {
        return projectId;
    }

    public int getWanIp() {
        return wanIp;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setImageType(int imageType) {
        this.imageType = imageType;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }

    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }

    public void setBandwidthType(String bandwidthType) {
        this.bandwidthType = bandwidthType;
    }

    public void setStorageType(int storageType) {
        this.storageType = storageType;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public void setRootSize(int rootSize) {
        this.rootSize = rootSize;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public void setZoneId(int zoneId) {
        this.zoneId = zoneId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public void setIsVpcGateway(int isVpcGateway) {
        this.isVpcGateway = isVpcGateway;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNeedSecurityAgent(int needSecurityAgent) {
        this.needSecurityAgent = needSecurityAgent;
    }

    public void setNeedMonitorAgent(int needMonitorAgent) {
        this.needMonitorAgent = needMonitorAgent;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public void setWanIp(int wanIp) {
        this.wanIp = wanIp;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    @Override
    public String toString() {
        return "RunInstancesHourRequest{" +
                "imageType='" + imageType + '\'' +
                ", imageId='" + imageId + '\'' +
                ", cpu=" + cpu +
                ", mem=" + mem +
                ", bandwidth=" + bandwidth +
                ", bandwidthType='" + bandwidthType + '\'' +
                ", storageType=" + storageType +
                ", storageSize=" + storageSize +
                ", rootSize=" + rootSize +
                ", goodsNum=" + goodsNum +
                ", zoneId=" + zoneId +
                ", vpcId='" + vpcId + '\'' +
                ", subnetId='" + subnetId + '\'' +
                ", isVpcGateway=" + isVpcGateway +
                ", password='" + password + '\'' +
                ", needSecurityAgent=" + needSecurityAgent +
                ", needMonitorAgent=" + needMonitorAgent +
                ", projectId=" + projectId +
                ", wanIp=" + wanIp +
                ", keyId='" + keyId + '\'' +
                '}';
    }
}
