package com.amazonaws.services.p026s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
/* renamed from: com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsRequest */
/* loaded from: classes3.dex */
public class ListBucketMetricsConfigurationsRequest extends AmazonWebServiceRequest implements Serializable {
    private String bucketName;
    private String continuationToken;

    public String getBucketName() {
        return this.bucketName;
    }

    public String getContinuationToken() {
        return this.continuationToken;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setContinuationToken(String str) {
        this.continuationToken = str;
    }

    public ListBucketMetricsConfigurationsRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public ListBucketMetricsConfigurationsRequest withContinuationToken(String str) {
        setContinuationToken(str);
        return this;
    }
}
