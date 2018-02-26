package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by linjinbo on 2018/2/2.
 */
public class DescribeBaseMetricsRequest extends CommonRequest{

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    @Override
    public String toString() {
        return "DescribeBaseMetricsRequest{" +
                "namespace=" + namespace +
                '}';
    }
}
