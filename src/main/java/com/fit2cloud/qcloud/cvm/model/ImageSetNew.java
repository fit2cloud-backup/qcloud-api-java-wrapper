package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 9/8/15.
 */
public class ImageSetNew {
	private String	ImageId;
	private String	ImageName;
	private String	imageDescription;
	private int		imageType;
	private String	osName;
	private String	createTime;
	private int		creator;
	private int		status;
	
	public String getImageId() {
		return ImageId;
	}
	
	public void setImageId(String imageId) {
		this.ImageId = imageId;
	}
	
	public String getImageName() {
		return ImageName;
	}
	
	public void setImageName(String imageName) {
		this.ImageName = imageName;
	}
	
	public String getImageDescription() {
		return imageDescription;
	}
	
	public void setImageDescription(String imageDescription) {
		this.imageDescription = imageDescription;
	}
	
	public int getImageType() {
		return imageType;
	}
	
	public void setImageType(int imageType) {
		this.imageType = imageType;
	}
	
	public String getOsName() {
		return osName;
	}
	
	public void setOsName(String osName) {
		this.osName = osName;
	}
	
	public String getCreateTime() {
		return createTime;
	}
	
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	
	public int getCreator() {
		return creator;
	}
	
	public void setCreator(int creator) {
		this.creator = creator;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
}
