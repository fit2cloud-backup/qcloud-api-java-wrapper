package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.requests.DescribeProductRegionListRequest;
import junit.framework.TestCase;

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
        client = new QCloudClient(qCloudCredential);
    }

    @Override
    public void tearDown() throws Exception {
    }

    public void testDescribeProductRegionList() throws Exception {
        DescribeProductRegionListRequest request = new DescribeProductRegionListRequest();
        request.setInstanceType("");
       client.DescribeProductRegionList()

    }
}
