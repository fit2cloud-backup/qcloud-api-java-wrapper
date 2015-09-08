package com.fit2cloud.qcloud.cvm.responses;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.ImageSet;

import java.util.List;

/**
 * Created by chixq on 9/8/15.
 */
public class DescribeImagesResponse extends CommonResponse {
    private int totalCount;
    private List<ImageSet> imageSet;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<ImageSet> getImageSet() {
        return imageSet;
    }

    public void setImageSet(List<ImageSet> imageSet) {
        this.imageSet = imageSet;
    }
}
