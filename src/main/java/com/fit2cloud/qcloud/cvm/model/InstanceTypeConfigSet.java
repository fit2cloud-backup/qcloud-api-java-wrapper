package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 5/11/16.
 */
public class InstanceTypeConfigSet {
    private String Zone;
    private String InstanceFamily;
    private String InstanceType;
    private String CPU;
    private String Memory;
    

    public String getZone() {
        return Zone;
    }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public String getInstanceFamily() {
        return InstanceFamily;
    }
    
    public void setInstanceFamily(String InstanceFamily ) {
         this.InstanceFamily = InstanceFamily;
    }

    public String getInstanceType() {
        return InstanceType;
    }

    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }
    
    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String Memory) {
        this.Memory = Memory;
    }
}
