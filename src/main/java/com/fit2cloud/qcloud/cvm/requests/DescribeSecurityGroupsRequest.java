package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 5/11/16.
 */
public class DescribeSecurityGroupsRequest extends CommonRequest {
    private String projectId;
    private String instanceId;
    private String sgId;
    private String sgName;

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

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
}
