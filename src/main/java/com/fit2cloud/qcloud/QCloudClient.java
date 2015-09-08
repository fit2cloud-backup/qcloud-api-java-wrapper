package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.DescribeImagesRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeInstancesRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeProductRegionListRequest;
import com.fit2cloud.qcloud.cvm.requests.RunInstancesRequest;
import com.fit2cloud.qcloud.cvm.responses.DescribeImagesResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeInstancesResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeProductRegionListResponse;
import com.fit2cloud.qcloud.cvm.responses.RunInstancesResponse;
import com.fit2cloud.qcloud.exceptions.QCloudClientException;
import com.fit2cloud.qcloud.exceptions.QCloudServiceException;
import com.fit2cloud.qcloud.util.GlobalConst;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by chixq on 14-11-17.
 */
public class QCloudClient {

    private static final String REGION = "gz";

    private BaseModuleRequest request;
    private Gson gson = new GsonBuilder().create();

    public QCloudClient(QCloudCredential credential) {
        this.request = new BaseModuleRequest(credential, GlobalConst.DEFAULT_BASE_URL);
    }

    public QCloudClient(QCloudCredential credential, String apiEndpoint) {
        this.request = new BaseModuleRequest(credential, apiEndpoint);
    }

    public QCloudClient(String secretId, String secretKey) {
        QCloudCredential qcloudCredential = new QCloudCredential(secretId, secretKey);
        this.request = new BaseModuleRequest(qcloudCredential, GlobalConst.DEFAULT_BASE_URL);
    }

//   cvm API
    public DescribeProductRegionListResponse DescribeProductRegionList(DescribeProductRegionListRequest describeProductRegionListRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeProductRegionList", describeProductRegionListRequest.toMap()), DescribeProductRegionListResponse.class);
    }
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest describeInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeInstances", describeInstancesRequest.toMap()), DescribeInstancesResponse.class);
    }

    public RunInstancesResponse RunInstances(RunInstancesRequest runInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("RunInstances", runInstancesRequest.toMap()), RunInstancesResponse.class);
    }

    public DescribeImagesResponse DescribeImages(DescribeImagesRequest describeInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeImages", describeInstancesRequest.toMap()), DescribeImagesResponse.class);
    }
}

