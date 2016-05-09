package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.DescribeImagesRequest;
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
        String secretId = "AKIDNzL48jKkp0meXdcdWtpMcoLSzCrh8Ycy";
        String secretKey = "uxdTovmCkJLogfgc5VQYBnga4uCSKbTz";
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
}
