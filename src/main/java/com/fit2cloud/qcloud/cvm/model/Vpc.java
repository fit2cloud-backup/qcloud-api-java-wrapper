package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 5/11/16.
 */
public class Vpc {
    private String vpcId;
    private String unVpcId;
    private String vpcName;
    private String cidrBlock;
    private String subnetNum;
    private String routeTableNum;
    private String vpnGwNum;
    private String vpcPeerNum;
    private String vpcDeviceNum;
    private String classicLinkNum;
    private String vpgNum;
    private String natNum;
    private String isDefault;
    private String isMulticast;
    private String createTime;
    
    public String getcreateTime() {
        return createTime;
    }

    public void setcreateTime(String createTime) {
        this.createTime = createTime;
    }
    
    public String getisMulticast() {
        return isMulticast;
    }

    public void setisMulticast(String isMulticast) {
        this.isMulticast = isMulticast;
    }
    
    public String getisDefault() {
        return isDefault;
    }

    public void setisDefault(String isDefault) {
        this.isDefault = isDefault;
    }
    
    public String getnatNum() {
        return natNum;
    }

    public void setnatNum(String natNum) {
        this.natNum = natNum;
    }
    
    public String getvpgNum() {
        return vpgNum;
    }

    public void setvpgNum(String vpgNum) {
        this.vpgNum = vpgNum;
    }
    
    public String getclassicLinkNum() {
        return classicLinkNum;
    }

    public void setclassicLinkNum(String classicLinkNum) {
        this.classicLinkNum = classicLinkNum;
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
    
    public String getsubnetNum() {
        return subnetNum;
    }

    public void setsubnetNum(String subnetNum) {
        this.subnetNum = subnetNum;
    }
    
    public String getrouteTableNum() {
        return routeTableNum;
    }

    public void setrouteTableNum(String routeTableNum) {
        this.routeTableNum = routeTableNum;
    }
    
    public String getvpnGwNum() {
        return vpnGwNum;
    }

    public void setvpnGwNum(String vpnGwNum) {
        this.vpnGwNum = vpnGwNum;
    }
    
    public String getvpcPeerNum() {
        return vpcPeerNum;
    }

    public void setvpcPeerNum(String vpcPeerNum) {
        this.vpcPeerNum = vpcPeerNum;
    }
    
    public String getvpcDeviceNum() {
        return vpcDeviceNum;
    }

    public void setvpcDeviceNum(String vpcDeviceNum) {
        this.vpcDeviceNum = vpcDeviceNum;
    }
}
