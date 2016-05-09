package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;

import java.util.List;

/**
 * Created by chixq on 5/9/16.
 */
public class RunInstancesHourResponse extends CommonResponse {
    private List<String> unInstanceIds;

    public List<String> getUnInstanceIds() {
        return unInstanceIds;
    }

    public void setUnInstanceIds(List<String> unInstanceIds) {
        this.unInstanceIds = unInstanceIds;
    }

    @Override
    public String toString() {
        return "RunInstancesHourResponse{" +
                "unInstanceIds=" + unInstanceIds +
                '}';
    }
}
