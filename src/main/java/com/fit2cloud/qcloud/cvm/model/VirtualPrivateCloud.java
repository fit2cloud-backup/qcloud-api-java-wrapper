package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 14-11-15.
 */
public class VirtualPrivateCloud {
    private String VpcId;
    private boolean AsVpcGateway;
    private String SubnetId;

    public String getVpcId() {
        return VpcId;
    }

    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public boolean getAsVpcGateway() {
        return AsVpcGateway;
    }

    public void setAsVpcGateway(boolean AsVpcGateway) {
        this.AsVpcGateway = AsVpcGateway;
    }

    public String getSubnetId() {
        return SubnetId;
    }

    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }
}
