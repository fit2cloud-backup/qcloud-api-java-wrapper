package com.fit2cloud.qcloud.cvm.responses;

import java.util.List;

import com.fit2cloud.qcloud.CommonResponse;
import com.fit2cloud.qcloud.cvm.model.RegionSet;

/**
 * Created by chixq on 5/9/16.
 */
public class DescribeAvailabilityRegionsResponse extends CommonResponse {
	private int				TotalCount;
	private List<RegionSet>	regionSet;
	
	public int getTotalCount() {
		return TotalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.TotalCount = totalCount;
	}
	
	public List<RegionSet> getRegionSet() {
		return regionSet;
	}
	
	public void setRegionSet(List<RegionSet> regionSet) {
		this.regionSet = regionSet;
	}
	
}
