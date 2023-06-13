package com.amazonaws.services.p026s3.model;

import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.BucketLoggingConfiguration */
/* loaded from: classes3.dex */
public class BucketLoggingConfiguration implements Serializable {
    private String destinationBucketName = null;
    private String logFilePrefix = null;

    public BucketLoggingConfiguration() {
    }

    public String getDestinationBucketName() {
        return this.destinationBucketName;
    }

    public String getLogFilePrefix() {
        return this.logFilePrefix;
    }

    public boolean isLoggingEnabled() {
        return (this.destinationBucketName == null || this.logFilePrefix == null) ? false : true;
    }

    public void setDestinationBucketName(String str) {
        this.destinationBucketName = str;
    }

    public void setLogFilePrefix(String str) {
        if (str == null) {
            str = "";
        }
        this.logFilePrefix = str;
    }

    public String toString() {
        String str = "LoggingConfiguration enabled=" + isLoggingEnabled();
        if (isLoggingEnabled()) {
            return str + ", destinationBucketName=" + getDestinationBucketName() + ", logFilePrefix=" + getLogFilePrefix();
        }
        return str;
    }

    public BucketLoggingConfiguration(String str, String str2) {
        setLogFilePrefix(str2);
        setDestinationBucketName(str);
    }
}
