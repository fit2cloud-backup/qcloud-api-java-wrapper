package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 5/11/16.
 */
public class Subnet {
    private String vpcId;
    private String unVpcId;
    private String vpcName;
    private String vpcCidrBlock;
    private String subnetId;
    private String unSubnetId;
    private String subnetName;
    private String subnetCreateTime;
    private String routeTableId;    
    private String unRouteTableId;
    private String routeTableName;
    private String cidrBlock;
    private String zoneId;
    private String zone;
    private String vpcDevices;
    private String networkAclId;
    private String totalIPNum;
    private String availableIPNum;
    private String rtbNum;
    private String broadcast;
    private String isDefault;
    
    public String getsubnetName() {
        return subnetName;
    }

    public void setsubnetName(String subnetName) {
        this.subnetName = subnetName;
    }
    public String getunSubnetId() {
        return unSubnetId;
    }

    public void setunSubnetId(String unSubnetId) {
        this.unSubnetId = unSubnetId;
    }
    public String getsubnetId() {
        return subnetId;
    }

    public void setsubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    public String getvpcCidrBlock() {
        return vpcCidrBlock;
    }

    public void setvpcCidrBlock(String vpcCidrBlock) {
        this.vpcCidrBlock = vpcCidrBlock;
    }
    public String getsubnetCreateTime() {
        return subnetCreateTime;
    }

    public void setsubnetCreateTime(String subnetCreateTime) {
        this.subnetCreateTime = subnetCreateTime;
    }
    public String getrouteTableId() {
        return routeTableId;
    }

    public void setrouteTableId(String routeTableId) {
        this.routeTableId = vpcCidrBlock;
    }
    
    public String getzoneId() {
        return zoneId;
    }

    public void setzone(String zone) {
        this.zone = zone;
    }
    
    public String getzone() {
        return zone;
    }

    public void setzoneId(String zoneId) {
        this.zoneId = zoneId;
    }
    
    public String getunRouteTableId() {
        return unRouteTableId;
    }

    public void setunRouteTableId(String unRouteTableId) {
        this.unRouteTableId = unRouteTableId;
    }
    
    public String getrouteTableName() {
        return routeTableName;
    }

    public void setrouteTableName(String routeTableName) {
        this.routeTableName = routeTableName;
    }
    
    public String getbroadcast() {
        return broadcast;
    }

    public void setbroadcast(String broadcast) {
        this.broadcast = broadcast;
    }
    
    public String getrtbNum() {
        return rtbNum;
    }

    public void setrtbNum(String rtbNum) {
        this.rtbNum = rtbNum;
    }
    
    public String getisDefault() {
        return isDefault;
    }

    public void setisDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    
    public String getavailableIPNum() {
        return availableIPNum;
    }

    public void setavailableIPNum(String availableIPNum) {
        this.availableIPNum = availableIPNum;
    }
    
    public String gettotalIPNum() {
        return totalIPNum;
    }

    public void settotalIPNum(String totalIPNum) {
        this.totalIPNum = totalIPNum;
    }
    
    public String getvpcDevices() {
        return vpcDevices;
    }

    public void setvpcDevices(String vpcDevices) {
        this.vpcDevices = vpcDevices;
    }
    
    public String getunVpcId() {
        return unVpcId;
    }

    public void setunVpcId(String unVpcId) {
        this.unVpcId = unVpcId;
    }

    public String getupcId() {
        return vpcId;
    }
    
    public void setVpcId(String vpcId ) {
         this.vpcId = vpcId;
    }

    public String getVpcName() {
        return vpcName;
    }

    public void setVpcName(String vpcName) {
        this.vpcName = vpcName;
    }

    public String getcidrBlock() {
        return cidrBlock;
    }

    public void setcidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
    }
    
    public String getnetworkAclId() {
        return networkAclId;
    }

    public void setnetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }
    
}
