package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/10/14
 * Time: 2:38 PM
 * Email: zhcloud@fit2cloud.com
 */
public class DescribeInstancesRequest extends CommonRequest {

    private List<String> instanceIds;
    private String searchWord;
    private List<String> lanIps;
    private int offset;
    private int limit = 20;
    private int status;


    public String getSearchWord() {
        return searchWord;
    }

    public void setSearchWord(String searchWord) {
        this.searchWord = searchWord;
    }

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
    }

    public List<String> getLanIps() {
        return lanIps;
    }

    public void setLanIps(List<String> lanIps) {
        this.lanIps = lanIps;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {

        this.status = status;
    }
    @Override
    public String toString() {
        return "DescribeInstancesRequest{" +
                "instanceIds=" + instanceIds +
                ", searchWord='" + searchWord + '\'' +
                ", lanIps=" + lanIps +
                ", offset=" + offset +
                ", limit=" + limit +
                ", status=" + status +
                '}';
    }
}
