package com.fit2cloud.qcloud;

import com.fit2cloud.qcloud.cvm.model.InstanceType;
import com.fit2cloud.qcloud.cvm.requests.DescribeProductRegionListRequest;
import com.fit2cloud.qcloud.cvm.responses.DescribeProductRegionListResponse;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by chixq on 8/17/15.
 */
public class TradeTest extends TestCase {
    private QCloudClient client;

    @Override
    public void setUp() throws Exception {
        String secretId = System.getenv("QCLOUD_SECRET_ID");
        String secretKey = System.getenv("QCLOUD_SECRET_KEY");
        QCloudCredential qCloudCredential = new QCloudCredential(secretId, secretKey);
        client = new QCloudClient(qCloudCredential, "trade.api.qcloud.com/v2/index.php");
    }

    @Override
    public void tearDown() throws Exception {
    }

    @Test
    public void testDescribeProductRegionList() throws Exception {
        DescribeProductRegionListRequest request = new DescribeProductRegionListRequest();
        request.setInstanceType(InstanceType.HOST);
        DescribeProductRegionListResponse response = client.DescribeProductRegionList(request);
        System.out.println(new Gson().toJson(response));
    }

}
