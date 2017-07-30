package com.fit2cloud.qcloud.cvm.model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:42 PM
 * Email: zhcloud@fit2cloud.com
 */
public class newInstanceSet {

    private String CreatedTime;
    private String InstanceId;
    private String regionId;
    private List<String> PrivateIpAddresses;
    private int Memory;
    private String InstanceChargeType;
    private String OsName;
    private String status;
    private int CPU;
    private String InstanceName;
    private String ExpiredTime;
    private String ImageId;
    private String InstanceType;
    private List<String> PublicIpAddresses;
    private InternetAccessible InternetAccessible;
    private SystemDisk SystemDisk;
    private DataDisks[] DataDisks;
    private VirtualPrivateCloud VirtualPrivateCloud;
    private Placement Placement;


    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public Placement gePlacement() {
        return Placement;
    }

    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    public VirtualPrivateCloud getVirtualPrivateCloudt() {
        return VirtualPrivateCloud;
    }

    public void seVirtualPrivateCloudt(VirtualPrivateCloud VirtualPrivateCloud) {
        this.VirtualPrivateCloud = VirtualPrivateCloud;
    }

    public DataDisks[] geDataDiskst() {
        return DataDisks;
    }

    public void seDataDiskst(DataDisks[] DataDisks) {
        this.DataDisks = DataDisks;
    }

    public SystemDisk geSystemDiskt() {
        return SystemDisk;
    }

    public void seSystemDiskt(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }
    
    
    public InternetAccessible getInternetAccessible() {
        return InternetAccessible;
    }

    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }
    public List<String> gePublicIpAddressest() {
        return PublicIpAddresses;
    }

    public void sePublicIpAddressest(List<String> PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    public String geInstanceTypet() {
        return InstanceType;
    }

    public void seInstanceTypet(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public String geImageIdt() {
        return ImageId;
    }

    public void seImageIdt(String ImageId) {
        this.ImageId = ImageId;
    }

    public String geExpiredTimet() {
        return ExpiredTime;
    }

    public void seExpiredTimet(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public String geInstanceNamet() {
        return InstanceName;
    }

    public void seInstanceNamet(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    public int geCPUt() {
        return CPU;
    }

    public void seCPUt(int CPU) {
        this.CPU = CPU;
    }

    public String geOsNamet() {
        return OsName;
    }

    public void seOsNamet(String OsName) {
        this.OsName = OsName;
    }

    public String geInstanceChargeTypet() {
        return InstanceChargeType;
    }

    public void seInstanceChargeTypet(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    public int geMemoryt() {
        return Memory;
    }

    public void seMemoryt(int Memory) {
        this.Memory = Memory;
    }
    


    public List<String> gePrivateIpAddressest() {
        return PrivateIpAddresses;
    }

    public void sePrivateIpAddressest( List<String> PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }
    
    public String geInstanceIdt() {
        return InstanceId;
    }

    public void seInstanceIdt(String InstanceId) {
        this.InstanceId = InstanceId;
    }
    
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }
    
    
    public String getCreatedTime() {
        return CreatedTime;
    }

    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }


    @Override
    public String toString() {
        return "InstanceSet{" +
                "InstanceName='" + InstanceName + '\'' +
                ", InstanceId='" + InstanceId + '\'' +
                '}';
    }
}
