package com.fit2cloud.qcloud.ui.model.transform;

import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/19/14
 * Time: 3:01 PM
 * Email: zhcloud@fit2cloud.com
 */
public interface Marshaller<T> {
    public TreeMap<String, String> marshall(T originalRequest) throws Exception;
}
