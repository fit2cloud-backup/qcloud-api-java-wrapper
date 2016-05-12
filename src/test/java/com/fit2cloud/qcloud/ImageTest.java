package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.CreateImageRequest;
import com.fit2cloud.qcloud.cvm.requests.DescribeImagesRequest;
import com.fit2cloud.qcloud.cvm.responses.CreateImageResponse;
import com.fit2cloud.qcloud.cvm.responses.DescribeImagesResponse;
import com.fit2cloud.qcloud.exceptions.QCloudClientException;
import com.fit2cloud.qcloud.exceptions.QCloudServiceException;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by chixq on 8/17/15.
 */
public class ImageTest extends TestCase {
    private QCloudClient client;

    @Override
    public void setUp() throws Exception {
        String secretId = System.getenv("QCLOUD_SECRET_ID");
        String secretKey = System.getenv("QCLOUD_SECRET_KEY");
        QCloudCredential qCloudCredential = new QCloudCredential(secretId, secretKey);
        client = new QCloudClient(qCloudCredential, "image.api.qcloud.com/v2/index.php");
    }

    @Override
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeImages() throws QCloudClientException, QCloudServiceException {
        DescribeImagesRequest describeImagesRequest = new DescribeImagesRequest();
        describeImagesRequest.setRegion("sh");
        describeImagesRequest.setImageType(2);
        DescribeImagesResponse describeImagesResponse = client.DescribeImages(describeImagesRequest);
        System.out.println(new Gson().toJson(describeImagesResponse));
    }

    @Test
    public void testCreateImage() throws QCloudClientException, QCloudServiceException {
        CreateImageRequest createImageRequest = new CreateImageRequest();
        createImageRequest.setImageDescription("Test");
        createImageRequest.setImageName("Test");
        createImageRequest.setRegion("sh");
        createImageRequest.setInstanceId("ins-etj2spif");
        CreateImageResponse createImageResponse = client.CreateImage(createImageRequest);
        System.out.println(new Gson().toJson(createImageResponse));
    }
}
