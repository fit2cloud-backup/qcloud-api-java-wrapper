package com.fit2cloud.qcloud.exceptions;

/**
 * Created with IntelliJ IDEA.
 * User: zhcloud
 * Date: 11/19/14
 * Time: 4:17 PM
 * Email: zhcloud@fit2cloud.com
 */
public class QCloudClientException extends Exception{
    private static final long serialVersionUID = -4776633044048303307L;
    public QCloudClientException() {
        super();
    }

    public QCloudClientException(String message) {
        super(message);
    }

    public QCloudClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public QCloudClientException(Throwable cause) {
        super(cause);
    }

    protected QCloudClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
