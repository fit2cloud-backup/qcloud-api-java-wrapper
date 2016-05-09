package com.fit2cloud.qcloud.cvm.requests;

import com.fit2cloud.qcloud.CommonRequest;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;
import java.util.Map;

/**
 * Created by chixq on 5/9/16.
 */
public class DeleteImagesRequest extends CommonRequest {
    private List<String> instanceIds;
    private String imageName;
    private String imageDescription;

    public List<String> getInstanceIds() {
        return instanceIds;
    }

    public void setInstanceIds(List<String> instanceIds) {
        this.instanceIds = instanceIds;
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
        return "DeleteImagesRequest{" +
                "instanceIds=" + instanceIds +
                ", imageName='" + imageName + '\'' +
                ", imageDescription='" + imageDescription + '\'' +
                '}';
    }

    @Override
    public Map toMap() {
        Map<String, String> map = new Gson().fromJson(new Gson().toJson(this), new TypeToken<Map<String, String>>() {
        }.getType());

        if (instanceIds != null) {
            int i = 0;
            for (String imageId : instanceIds) {
                map.put("instanceIds." + i, String.valueOf(imageId));
                i++;
            }
            map.remove("instanceIds");
        }
        return map;
    }
}
