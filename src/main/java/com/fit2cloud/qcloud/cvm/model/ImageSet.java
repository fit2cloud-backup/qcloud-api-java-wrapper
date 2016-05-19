package com.fit2cloud.qcloud.cvm.model;

/**
 * Created by chixq on 9/8/15.
 */
public class ImageSet {
    private int imageId;
    private String unImgId;
    private String imageName;
    private String imageDescription;
    private int imageType;
    private String osName;
    private String createTime;
    private int creator;
    private int status;

    public String getUnImgId() {
        return unImgId;
    }

    public void setUnImgId(String unImgId) {
        this.unImgId = unImgId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
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
