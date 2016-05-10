package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.KeypairData;

/**
 * Created by chixq on 5/9/16.
 */
public class DescribeKeyPairsResponse extends CommonResponse {
    private KeypairData keypairData;

    public KeypairData getKeypairData() {
        return keypairData;
    }

    public void setKeypairData(KeypairData keypairData) {
        this.keypairData = keypairData;
    }

    @Override
    public String toString() {
        return "DescribeKeyPairsResponse{" +
                ", data=" + keypairData +
                '}';
    }
}

