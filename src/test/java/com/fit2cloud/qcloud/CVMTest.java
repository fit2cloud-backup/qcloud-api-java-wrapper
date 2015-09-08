package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.model.InstanceType;
import com.fit2cloud.qcloud.cvm.requests.DescribeImagesRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeInstancesRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeProductRegionListRequest;
import com.fit2cloud.qcloud.cvm.responses.DescribeImagesResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeInstancesResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeProductRegionListResponse;
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
        String secretId = "";
        String secretKey = "";
        QCloudCredential qCloudCredential = new QCloudCredential(secretId, secretKey);
        client = new QCloudClient(qCloudCredential, "image.api.qcloud.com/v2/index.php");
    }

    @Override
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeProductRegionList() throws Exception {
        DescribeProductRegionListRequest request = new DescribeProductRegionListRequest();
        request.setInstanceType(InstanceType.HOST);
        DescribeProductRegionListResponse response = client.DescribeProductRegionList(request);
        System.out.println(response.getAvailableRegion().keySet());
        System.out.println(new Gson().toJson(response));
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
    public void testDescribeImages() throws QCloudClientException, QCloudServiceException {
        DescribeImagesRequest describeImagesRequest = new DescribeImagesRequest();
        describeImagesRequest.setImageType(2);
        describeImagesRequest.setRegion("sh");
        DescribeImagesResponse describeImagesResponse = client.DescribeImages(describeImagesRequest);
        System.out.println(new Gson().toJson(describeImagesResponse));
    }
}
