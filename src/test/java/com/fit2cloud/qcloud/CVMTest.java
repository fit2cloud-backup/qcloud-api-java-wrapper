package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.DescribeAvailabilityZonesRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeInstancesRequest;
import com.fit2cloud.qcloud.cvm.requests.ReturnInstanceRequest;
import com.fit2cloud.qcloud.cvm.requests.RunInstancesHourRequest;
import com.fit2cloud.qcloud.cvm.responses.DescribeAvailabilityZonesResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeInstancesResponse;
import com.fit2cloud.qcloud.cvm.responses.ReturnInstanceResponse;
import com.fit2cloud.qcloud.cvm.responses.RunInstancesHourResponse;
import com.fit2cloud.qcloud.exceptions.QCloudClientException;
import com.fit2cloud.qcloud.exceptions.QCloudServiceException;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Test;

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
    public void testDescribeInstance() throws QCloudClientException, QCloudServiceException {
        DescribeInstancesRequest describeInstancesRequest = new DescribeInstancesRequest();
        describeInstancesRequest.setRegion("sh");
        DescribeInstancesResponse describeInstancesResponse = new DescribeInstancesResponse();
        describeInstancesResponse = client.DescribeInstances(describeInstancesRequest);
        System.out.println(new Gson().toJson(describeInstancesResponse));
    }

    @Test
    public void testRunInstanceHour() throws QCloudClientException, QCloudServiceException {
        RunInstancesHourRequest runInstancesHourRequest = new RunInstancesHourRequest();
        runInstancesHourRequest.setRegion("sh");
        runInstancesHourRequest.setImageType(2);
        runInstancesHourRequest.setImageId(1);
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
    public void testReturnInstance() throws QCloudClientException, QCloudServiceException {
        ReturnInstanceRequest returnInstanceRequest = new ReturnInstanceRequest();
        returnInstanceRequest.setInstanceId("ins-pwamztyh");
        returnInstanceRequest.setRegion("sh");
        ReturnInstanceResponse returnInstanceResponse = this.client.ReturnInstance(returnInstanceRequest);
        System.out.println(new Gson().toJson(returnInstanceResponse));
    }
}
