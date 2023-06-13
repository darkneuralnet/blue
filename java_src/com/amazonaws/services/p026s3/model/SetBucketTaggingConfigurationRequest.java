package com.amazonaws.services.p026s3.model;

import com.amazonaws.AmazonWebServiceRequest;
/* renamed from: com.amazonaws.services.s3.model.SetBucketTaggingConfigurationRequest */
/* loaded from: classes3.dex */
public class SetBucketTaggingConfigurationRequest extends AmazonWebServiceRequest {
    private String bucketName;
    private BucketTaggingConfiguration taggingConfiguration;

    public SetBucketTaggingConfigurationRequest(String str, BucketTaggingConfiguration bucketTaggingConfiguration) {
        this.bucketName = str;
        this.taggingConfiguration = bucketTaggingConfiguration;
    }

    public String getBucketName() {
        return this.bucketName;
    }

    public BucketTaggingConfiguration getTaggingConfiguration() {
        return this.taggingConfiguration;
    }

    public void setBucketName(String str) {
        this.bucketName = str;
    }

    public void setTaggingConfiguration(BucketTaggingConfiguration bucketTaggingConfiguration) {
        this.taggingConfiguration = bucketTaggingConfiguration;
    }

    public SetBucketTaggingConfigurationRequest withBucketName(String str) {
        setBucketName(str);
        return this;
    }

    public SetBucketTaggingConfigurationRequest withTaggingConfiguration(BucketTaggingConfiguration bucketTaggingConfiguration) {
        setTaggingConfiguration(bucketTaggingConfiguration);
        return this;
    }
}
