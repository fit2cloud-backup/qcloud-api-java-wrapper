package com.fit2cloud.qcloud.cvm.responses;

import java.util.List;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.ImageSetNew;

/**
 * Created by chixq on 9/8/15.
 */
public class DescribeImagesResponseNew extends CommonResponse {
	private int					TotalCount;
	private List<ImageSetNew>	ImageSet;
	
	public int getTotalCount() {
		return TotalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.TotalCount = totalCount;
	}
	
	public List<ImageSetNew> getImageSet() {
		return ImageSet;
	}
	
	public void setImageSet(List<ImageSetNew> imageSet) {
		this.ImageSet = imageSet;
	}
}
