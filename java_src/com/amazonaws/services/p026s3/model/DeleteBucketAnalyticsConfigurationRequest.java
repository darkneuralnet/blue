package com.amazonaws.services.p026s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.DeleteBucketAnalyticsConfigurationRequest */
/* loaded from: classes3.dex */
public class DeleteBucketAnalyticsConfigurationRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;

    /* renamed from: id */
    private String f68594id;

    public DeleteBucketAnalyticsConfigurationRequest() {
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public String getId() {
        return this.f68594id;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setId(String str) {
        this.f68594id = str;
    }

    public DeleteBucketAnalyticsConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public DeleteBucketAnalyticsConfigurationRequest withId(String str) {
        setId(str);
        return this;
    }

    public DeleteBucketAnalyticsConfigurationRequest(String str, String str2) {
        this.bucketName = str;
        this.f68594id = str2;
    }
}