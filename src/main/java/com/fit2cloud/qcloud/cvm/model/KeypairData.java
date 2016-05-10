package com.fit2cloud.qcloud.cvm.model;

import java.util.List;

public class KeypairData {
    private int totalCount;
    private List<SSHSet> sshSet;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<SSHSet> getSshSet() {
        return sshSet;
    }

    public void setSshSet(List<SSHSet> sshSet) {
        this.sshSet = sshSet;
    }

    @Override
    public String toString() {
        return "KeypairData{" +
                "totalCount=" + totalCount +
                ", sshSet=" + sshSet +
                '}';
    }
}
