package com.amazonaws.services.p026s3;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p026s3.internal.PartCreationEvent;
import com.amazonaws.services.p026s3.internal.S3DirectSpi;
import com.amazonaws.services.p026s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.p026s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.PartETag;
import com.amazonaws.services.p026s3.model.UploadObjectRequest;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import com.amazonaws.services.p026s3.model.UploadPartResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* renamed from: com.amazonaws.services.s3.UploadObjectObserver */
/* loaded from: classes3.dex */
public class UploadObjectObserver {

    /* renamed from: es */
    private ExecutorService f68578es;
    private final List<Future<UploadPartResult>> futures = new ArrayList();
    private UploadObjectRequest req;

    /* renamed from: s3 */
    private AmazonS3 f68579s3;
    private S3DirectSpi s3direct;
    private String uploadId;

    public <X extends AmazonWebServiceRequest> X appendUserAgent(X x, String str) {
        x.getRequestClientOptions().appendUserAgent(str);
        return x;
    }

    public AmazonS3 getAmazonS3() {
        return this.f68579s3;
    }

    public ExecutorService getExecutorService() {
        return this.f68578es;
    }

    public List<Future<UploadPartResult>> getFutures() {
        return this.futures;
    }

    public UploadObjectRequest getRequest() {
        return this.req;
    }

    public S3DirectSpi getS3DirectSpi() {
        return this.s3direct;
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public UploadObjectObserver init(UploadObjectRequest uploadObjectRequest, S3DirectSpi s3DirectSpi, AmazonS3 amazonS3, ExecutorService executorService) {
        this.req = uploadObjectRequest;
        this.s3direct = s3DirectSpi;
        this.f68579s3 = amazonS3;
        this.f68578es = executorService;
        return this;
    }

    public InitiateMultipartUploadRequest newInitiateMultipartUploadRequest(UploadObjectRequest uploadObjectRequest) {
        return (InitiateMultipartUploadRequest) new EncryptedInitiateMultipartUploadRequest(uploadObjectRequest.getBucketName(), uploadObjectRequest.getKey(), uploadObjectRequest.getMetadata()).withMaterialsDescription(uploadObjectRequest.getMaterialsDescription()).withRedirectLocation(uploadObjectRequest.getRedirectLocation()).withSSEAwsKeyManagementParams(uploadObjectRequest.getSSEAwsKeyManagementParams()).withSSECustomerKey(uploadObjectRequest.getSSECustomerKey()).withStorageClass(uploadObjectRequest.getStorageClass()).withAccessControlList(uploadObjectRequest.getAccessControlList()).withCannedACL(uploadObjectRequest.getCannedAcl()).withGeneralProgressListener(uploadObjectRequest.getGeneralProgressListener()).withRequestMetricCollector(uploadObjectRequest.getRequestMetricCollector());
    }

    public UploadPartRequest newUploadPartRequest(PartCreationEvent partCreationEvent, File file) {
        return new UploadPartRequest().withBucketName(this.req.getBucketName()).withFile(file).withKey(this.req.getKey()).withPartNumber(partCreationEvent.getPartNumber()).withPartSize(file.length()).withLastPart(partCreationEvent.isLastPart()).withUploadId(this.uploadId).withObjectMetadata(this.req.getUploadPartMetadata());
    }

    public void onAbort() {
        for (Future<UploadPartResult> future : getFutures()) {
            future.cancel(true);
        }
        if (this.uploadId != null) {
            try {
                this.f68579s3.abortMultipartUpload(new AbortMultipartUploadRequest(this.req.getBucketName(), this.req.getKey(), this.uploadId));
            } catch (Exception e) {
                Log log = LogFactory.getLog(getClass());
                log.debug("Failed to abort multi-part upload: " + this.uploadId, e);
            }
        }
    }

    public CompleteMultipartUploadResult onCompletion(List<PartETag> list) {
        return this.f68579s3.completeMultipartUpload(new CompleteMultipartUploadRequest(this.req.getBucketName(), this.req.getKey(), this.uploadId, list));
    }

    public void onPartCreate(PartCreationEvent partCreationEvent) {
        final File part = partCreationEvent.getPart();
        final UploadPartRequest newUploadPartRequest = newUploadPartRequest(partCreationEvent, part);
        final OnFileDelete fileDeleteObserver = partCreationEvent.getFileDeleteObserver();
        appendUserAgent(newUploadPartRequest, AmazonS3EncryptionClient.USER_AGENT);
        this.futures.add(this.f68578es.submit(new Callable<UploadPartResult>() { // from class: com.amazonaws.services.s3.UploadObjectObserver.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public UploadPartResult call() {
                try {
                    UploadPartResult uploadPart = UploadObjectObserver.this.uploadPart(newUploadPartRequest);
                    if (!part.delete()) {
                        Log log = LogFactory.getLog(getClass());
                        log.debug("Ignoring failure to delete file " + part + " which has already been uploaded");
                    } else {
                        OnFileDelete onFileDelete = fileDeleteObserver;
                        if (onFileDelete != null) {
                            onFileDelete.onFileDelete(null);
                        }
                    }
                    return uploadPart;
                } catch (Throwable th) {
                    if (part.delete()) {
                        OnFileDelete onFileDelete2 = fileDeleteObserver;
                        if (onFileDelete2 != null) {
                            onFileDelete2.onFileDelete(null);
                        }
                    } else {
                        Log log2 = LogFactory.getLog(getClass());
                        log2.debug("Ignoring failure to delete file " + part + " which has already been uploaded");
                    }
                    throw th;
                }
            }
        }));
    }

    public String onUploadInitiation(UploadObjectRequest uploadObjectRequest) {
        String uploadId = this.f68579s3.initiateMultipartUpload(newInitiateMultipartUploadRequest(uploadObjectRequest)).getUploadId();
        this.uploadId = uploadId;
        return uploadId;
    }

    public UploadPartResult uploadPart(UploadPartRequest uploadPartRequest) {
        return this.s3direct.uploadPart(uploadPartRequest);
    }
}