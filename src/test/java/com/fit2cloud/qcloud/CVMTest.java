package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.*;
import com.fit2cloud.qcloud.cvm.responses.*;
import com.fit2cloud.qcloud.exceptions.QCloudClientException;
import com.fit2cloud.qcloud.exceptions.QCloudServiceException;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Collections;

/**
 * Created by chixq on 8/17/15.
 */
public class CVMTest extends TestCase {
    private QCloudClient client;

    @Override
    public void setUp() throws Exception {
        String secretId = System.getenv("QCLOUD_SECRET_ID");
        String secretKey = System.getenv("QCLOUD_SECRET_KEY");
        QCloudCredential qCloudCredential = new QCloudCredential(secretId, secretKey);
        client = new QCloudClient(qCloudCredential, "cvm.api.qcloud.com/v2/index.php");
    }

    @Override
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeAvailableZones() throws Exception {
        DescribeAvailabilityZonesRequest describeAvailabilityZonesRequest = new DescribeAvailabilityZonesRequest();
        describeAvailabilityZonesRequest.setRegion("sh");
        DescribeAvailabilityZonesResponse describeAvailabilityZonesResponse = this.client.DescribeAvailabilityZones(describeAvailabilityZonesRequest);
        System.out.println(new Gson().toJson(describeAvailabilityZonesResponse));

    }

    @Test
    public void testDescribeKeypair() throws QCloudClientException, QCloudServiceException {
        DescribeKeyPairsRequest describeKeyPairsRequest = new DescribeKeyPairsRequest();
        describeKeyPairsRequest.setRegion("sh");
        describeKeyPairsRequest.setLimit(20);
        describeKeyPairsRequest.setOffset(0);
        DescribeKeyPairsResponse describeKeyPairsResponse = client.DescribeKeyPairs(describeKeyPairsRequest);
        System.out.println(new Gson().toJson(describeKeyPairsResponse));
    }

    @Test
    public void testDescribeSecurityGroups() throws QCloudClientException, QCloudServiceException {
        DescribeSecurityGroupsRequest describeSecurityGroupsRequest = new DescribeSecurityGroupsRequest();
        describeSecurityGroupsRequest.setRegion("sh");
        DescribeSecurityGroupsResponse describeSecurityGroupsResponse = client.DescribeSecurityGroups(describeSecurityGroupsRequest);
        System.out.println(new Gson().toJson(describeSecurityGroupsResponse));


    }

    @Test
    public void testDescribeInstance() throws QCloudClientException, QCloudServiceException {
        DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest();
        describeInstancesRequest.setRegion("sh");
        describeInstancesRequest.setInstanceIds(Collections.singletonList("ins-897e5ofb"));
        DescribeInstancesResponse describeInstancesResponse = new DescribeInstancesResponse();
        describeInstancesResponse = client.DescribeInstances(describeInstancesRequest);
        System.out.println(new Gson().toJson(describeInstancesResponse));
    }

    @Test
    public void testRunInstanceHour() throws QCloudClientException, QCloudServiceException {
        RunInstancesHourRequest runInstancesHourRequest = new RunInstancesHourRequest();
        runInstancesHourRequest.setRegion("sh");
        runInstancesHourRequest.setImageType(2);
        runInstancesHourRequest.setImageId("1");
        runInstancesHourRequest.setBandwidth(1);
        runInstancesHourRequest.setCpu(1);
        runInstancesHourRequest.setMem(1);
        runInstancesHourRequest.setGoodsNum(1);
        runInstancesHourRequest.setStorageType(1);
        runInstancesHourRequest.setStorageSize(20);
        runInstancesHourRequest.setZoneId(200001);
        RunInstancesHourResponse runInstancesHourResponse = this.client.RunInstancesHour(runInstancesHourRequest);
        System.out.println(new Gson().toJson(runInstancesHourResponse));
    }

    @Test
    public void testStopInstance() throws QCloudClientException, QCloudServiceException {
        StopInstancesRequest stopInstancesRequest = new StopInstancesRequest();
        stopInstancesRequest.setForceStop("1");
        stopInstancesRequest.setInstanceIds(Collections.singletonList("ins-etj2spif"));
        stopInstancesRequest.setRegion("sh");
        StopInstancesResponse stopInstancesResponse = client.StopInstances(stopInstancesRequest);
        System.out.println(new Gson().toJson(stopInstancesResponse));
    }

    @Test
    public void testReturnInstance() throws QCloudClientException, QCloudServiceException {
        ReturnInstanceRequest returnInstanceRequest = new ReturnInstanceRequest();
        returnInstanceRequest.setInstanceId("qcvm3eaff96a31c8c5b39aec42d7f4fa9a7e");
        returnInstanceRequest.setRegion("sh");
        ReturnInstanceResponse returnInstanceResponse = this.client.ReturnInstance(returnInstanceRequest);
        System.out.println(new Gson().toJson(returnInstanceResponse));
    }
}
