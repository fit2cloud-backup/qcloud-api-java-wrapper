package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.*;
import com.fit2cloud.qcloud.cvm.responses.*;
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

    //   trade API
    public DescribeProductRegionListResponse DescribeProductRegionList(DescribeProductRegionListRequest describeProductRegionListRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeProductRegionList", describeProductRegionListRequest.toMap()), DescribeProductRegionListResponse.class);
    }

    //   image API
    public DescribeImagesResponse DescribeImages(DescribeImagesRequest describeInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeImages", describeInstancesRequest.toMap()), DescribeImagesResponse.class);
    }

    public CreateImageResponse CreateImage(CreateImageRequest createImageRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("CreateImage", createImageRequest.toMap()), CreateImageResponse.class);
    }

    public DeleteImagesResponse DeleteImages(DeleteImagesRequest deleteImagesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DeleteImages", deleteImagesRequest.toMap()), DeleteImagesResponse.class);
    }


    //   cvm API
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest describeInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeInstances", describeInstancesRequest.toMap()), DescribeInstancesResponse.class);
    }

    public RunInstancesResponse RunInstances(RunInstancesRequest runInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("RunInstances", runInstancesRequest.toMap()), RunInstancesResponse.class);
    }


    public RunInstancesHourResponse RunInstancesHour(RunInstancesHourRequest runInstancesHourRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("RunInstancesHour", runInstancesHourRequest.toMap()), RunInstancesHourResponse.class);
    }

    public DescribeKeyPairsResponse DescribeKeyPairs(DescribeKeyPairsRequest describeKeyPairsRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeKeyPairs", describeKeyPairsRequest.toMap()), DescribeKeyPairsResponse.class);
    }

    public StartInstancesResponse StartInstance(StartInstancesRequest startInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("StartInstances", startInstancesRequest.toMap()), StartInstancesResponse.class);
    }

    public StopInstancesResponse StopInstances(StopInstancesRequest stopInstancesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("StopInstances", stopInstancesRequest.toMap()), StopInstancesResponse.class);
    }

    public DescribeAvailabilityZonesResponse DescribeAvailabilityZones(DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeAvailabilityZones", describeAvailabilityZonesRequest.toMap()), DescribeAvailabilityZonesResponse.class);
    }

    public ReturnInstanceResponse ReturnInstance(ReturnInstanceRequest returnInstanceRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("ReturnInstance", returnInstanceRequest.toMap()), ReturnInstanceResponse.class);
    }

    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest describeSecurityGroupsRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("DescribeSecurityGroups", describeSecurityGroupsRequest.toMap()), DescribeSecurityGroupsResponse.class);
    }

    public ModifySecurityGroupsOfInstanceResponse ModifySecurityGroupsOfInstance(ModifySecurityGroupsOfInstanceRequest modifySecurityGroupsOfInstanceRequest) throws QCloudClientException, QCloudServiceException {
        return gson.fromJson(this.request.execute("ModifySecurityGroupsOfInstance", modifySecurityGroupsOfInstanceRequest.toMap()), ModifySecurityGroupsOfInstanceResponse.class);
    }
}

