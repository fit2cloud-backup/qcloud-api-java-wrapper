package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;

/**
 * Created by chixq on 5/9/16.
 */
public class CreateImageRequest extends CommonRequest {
    private String instanceId;
    private String imageName;
    private String imageDescription;

    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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

    @Override
    public String toString() {
        return "CreateImageRequest{" +
                "instanceId='" + instanceId + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageDescription='" + imageDescription + '\'' +
                '}';
    }
}
