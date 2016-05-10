package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 5/11/16.
 */
public class SGData {
    private String sgId;
    private String sgName;
    private String sgRemark;
    private String createTime;
    private int projectId;
    private int sys;
    private int os;

    public String getSgId() {
        return sgId;
    }

    public void setSgId(String sgId) {
        this.sgId = sgId;
    }

    public String getSgName() {
        return sgName;
    }

    public void setSgName(String sgName) {
        this.sgName = sgName;
    }

    public String getSgRemark() {
        return sgRemark;
    }

    public void setSgRemark(String sgRemark) {
        this.sgRemark = sgRemark;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public int getSys() {
        return sys;
    }

    public void setSys(int sys) {
        this.sys = sys;
    }

    public int getOs() {
        return os;
    }

    public void setOs(int os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "SGData{" +
                "sgId='" + sgId + '\'' +
                ", sgName='" + sgName + '\'' +
                ", sgRemark='" + sgRemark + '\'' +
                ", createTime='" + createTime + '\'' +
                ", projectId=" + projectId +
                ", sys=" + sys +
                ", os=" + os +
                '}';
    }
}
