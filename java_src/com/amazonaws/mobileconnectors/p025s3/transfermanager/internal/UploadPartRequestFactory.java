package com.amazonaws.mobileconnectors.p025s3.transfermanager.internal;

import com.amazonaws.services.p026s3.internal.InputSubstream;
import com.amazonaws.services.p026s3.model.PutObjectRequest;
import com.amazonaws.services.p026s3.model.SSECustomerKey;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import java.io.File;
/* renamed from: com.amazonaws.mobileconnectors.s3.transfermanager.internal.UploadPartRequestFactory */
/* loaded from: classes2.dex */
public class UploadPartRequestFactory {
    private final String bucketName;
    private final File file;
    private final String key;
    private final long optimalPartSize;
    private final PutObjectRequest putObjectRequest;
    private long remainingBytes;
    private SSECustomerKey sseCustomerKey;
    private final String uploadId;
    private int partNumber = 1;
    private long offset = 0;

    public UploadPartRequestFactory(PutObjectRequest putObjectRequest, String str, long j) {
        this.putObjectRequest = putObjectRequest;
        this.uploadId = str;
        this.optimalPartSize = j;
        this.bucketName = putObjectRequest.getBucketName();
        this.key = putObjectRequest.getKey();
        this.file = TransferManagerUtils.getRequestFile(putObjectRequest);
        this.remainingBytes = TransferManagerUtils.getContentLength(putObjectRequest);
        this.sseCustomerKey = putObjectRequest.getSSECustomerKey();
    }

    public synchronized UploadPartRequest getNextUploadPartRequest() {
        boolean z;
        UploadPartRequest withPartSize;
        long min = Math.min(this.optimalPartSize, this.remainingBytes);
        if (this.remainingBytes - min <= 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.putObjectRequest.getInputStream() != null) {
            UploadPartRequest withInputStream = new UploadPartRequest().withBucketName(this.bucketName).withKey(this.key).withUploadId(this.uploadId).withInputStream(new InputSubstream(this.putObjectRequest.getInputStream(), 0L, min, z));
            int i = this.partNumber;
            this.partNumber = i + 1;
            withPartSize = withInputStream.withPartNumber(i).withPartSize(min);
        } else {
            UploadPartRequest withFileOffset = new UploadPartRequest().withBucketName(this.bucketName).withKey(this.key).withUploadId(this.uploadId).withFile(this.file).withFileOffset(this.offset);
            int i2 = this.partNumber;
            this.partNumber = i2 + 1;
            withPartSize = withFileOffset.withPartNumber(i2).withPartSize(min);
        }
        SSECustomerKey sSECustomerKey = this.sseCustomerKey;
        if (sSECustomerKey != null) {
            withPartSize.setSSECustomerKey(sSECustomerKey);
        }
        this.offset += min;
        this.remainingBytes -= min;
        withPartSize.setLastPart(z);
        withPartSize.setGeneralProgressListener(this.putObjectRequest.getGeneralProgressListener());
        return withPartSize;
    }

    public synchronized boolean hasMoreRequests() {
        boolean z;
        if (this.remainingBytes > 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }
}
