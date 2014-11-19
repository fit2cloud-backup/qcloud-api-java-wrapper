package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.ui.model.DescribeInstancesRequest;
import com.fit2cloud.qcloud.ui.model.DescribeInstancesResponse;
import com.fit2cloud.qcloud.ui.model.RunInstancesRequest;
import com.fit2cloud.qcloud.ui.model.RunInstancesResponse;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.HttpMethod;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/11/14
 * Time: 6:17 PM
 * Email: zhcloud@fit2cloud.com
 */
public class QCloudClientTest {

    private QCloudClient client;
    
    @Before
    public void setUp(){
        String secretId = "YOUR_SECRET_ID";
        String secretKey = "YOUR_SECRET_KEY";
        client = new QCloudClient(new QCloudCredential(secretId, secretKey));
    }

    @Test
    public void describeInstancesTest() throws Exception {
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        request.setMethod(HttpMethod.GET);
        request.setAction("DescribeInstances");
        System.out.println("Request: " + DescribeInstancesRequest.toJson(request));
        DescribeInstancesResponse response =  client.describeInstances(request);
        assert response.getCode() == 0;
    }

    @Test
    public void runInstancesTest() throws Exception {
        RunInstancesRequest request = new RunInstancesRequest();
        request.setMethod("RunInstances");
        request.setAction(HttpMethod.POST);
        System.out.println("Request: " + RunInstancesRequest.toJson(request));
        RunInstancesResponse response = client.runInstancesResponse(request);
        assert response.getCode() == 0;

    }

}
