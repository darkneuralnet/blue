package com.amazonaws.services.p026s3.model;
/* renamed from: com.amazonaws.services.s3.model.ReplicationDestinationConfig */
/* loaded from: classes3.dex */
public class ReplicationDestinationConfig {
    private String bucketARN;
    private String storageClass;

    public String getBucketARN() {
        return this.bucketARN;
    }

    public String getStorageClass() {
        return this.storageClass;
    }

    public void setBucketARN(String str) {
        if (str != null) {
            this.bucketARN = str;
            return;
        }
        throw new IllegalArgumentException("Bucket name cannot be null");
    }

    public void setStorageClass(String str) {
        this.storageClass = str;
    }

    public ReplicationDestinationConfig withBucketARN(String str) {
        setBucketARN(str);
        return this;
    }

    public ReplicationDestinationConfig withStorageClass(String str) {
        setStorageClass(str);
        return this;
    }

    public void setStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? null : storageClass.toString());
    }

    public ReplicationDestinationConfig withStorageClass(StorageClass storageClass) {
        setStorageClass(storageClass == null ? null : storageClass.toString());
        return this;
    }
}
