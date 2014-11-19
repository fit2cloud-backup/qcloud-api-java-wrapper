package com.fit2cloud.qcloud.ui.model.transform;

import com.fit2cloud.qcloud.ui.model.DescribeInstancesRequest;
import org.codehaus.jackson.map.ObjectMapper;

import java.util.List;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/19/14
 * Time: 3:05 PM
 * Email: zhcloud@fit2cloud.com
 */
public class DescribeInstancesRequestMarshaller implements Marshaller<DescribeInstancesRequest> {
    public TreeMap<String, String> marshall(DescribeInstancesRequest originalRequest) throws Exception {
        TreeMap<String, String> request = new TreeMap<String, String>();
        ObjectMapper mapper = new ObjectMapper();
        request.putAll(mapper.convertValue(originalRequest, TreeMap.class));
        if(request.containsKey("instanceIds")){
            request.remove("instanceIds");
        }
        if(request.containsKey("lanIps")){
            request.remove("lanIps");
        }
        List<String> instanceIdsList = originalRequest.getInstanceIds();
        if(instanceIdsList != null) {
            int instanceIdsListIndex = 1;
            for (String instanceIdsListValue : instanceIdsList) {
                if (instanceIdsListValue != null) {
                    request.put("instanceIds." + instanceIdsListIndex, instanceIdsListValue);
                }
                instanceIdsListIndex++;
            }
        }

        List<String> lanIpsList = originalRequest.getInstanceIds();
        if(lanIpsList!=null) {
            int lanIpsListIndex = 1;
            for (String lanIpsListValue : lanIpsList) {
                if (lanIpsListValue != null) {
                    request.put("lanIps." + lanIpsListIndex, lanIpsListValue);
                }
                lanIpsListIndex++;
            }
        }

        return request;
    }
}
