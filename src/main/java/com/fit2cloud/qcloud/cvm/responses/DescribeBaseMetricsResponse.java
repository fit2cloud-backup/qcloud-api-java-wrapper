package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.List;

/**
 * Created by linjinbo on 2018/2/2.
 */
public class DescribeBaseMetricsResponse extends CommonResponse {

    private String metricSet;

    public String getMetricSet() {
        return metricSet;
    }

    public void setMetricSet(String metricSet) {
        this.metricSet = metricSet;
    }

    @Override
    public String toString() {
        return "GetMonitorDataResponse{" +
                "metricSet=" + metricSet +
                '}';
    }
}
