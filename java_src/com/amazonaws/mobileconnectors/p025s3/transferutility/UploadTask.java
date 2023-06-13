package com.amazonaws.mobileconnectors.p025s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.CannedAccessControlList;
import com.amazonaws.services.p026s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.p026s3.model.ObjectMetadata;
import com.amazonaws.services.p026s3.model.ObjectTagging;
import com.amazonaws.services.p026s3.model.PutObjectRequest;
import com.amazonaws.services.p026s3.model.SSEAwsKeyManagementParams;
import com.amazonaws.services.p026s3.model.Tag;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import com.amazonaws.services.p026s3.util.Mimetypes;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.UploadTask */
/* loaded from: classes2.dex */
public class UploadTask implements Callable<Boolean> {
    private static final String OBJECT_TAGS_DELIMITER = "&";
    private static final String OBJECT_TAG_KEY_VALUE_SEPARATOR = "=";
    private static final String REQUESTER_PAYS = "requester";
    private final TransferDBUtil dbUtil;
    private List<UploadPartRequest> requestList;

    /* renamed from: s3 */
    private final AmazonS3 f68576s3;
    private final TransferStatusUpdater updater;
    private final TransferRecord upload;
    Map<Integer, UploadPartTaskMetadata> uploadPartTasks = new HashMap();
    private static final Log LOGGER = LogFactory.getLog(UploadTask.class);
    private static final Map<String, CannedAccessControlList> CANNED_ACL_MAP = new HashMap();

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadPartTaskMetadata */
    /* loaded from: classes2.dex */
    public class UploadPartTaskMetadata {
        long bytesTransferredSoFar;
        TransferState state;
        UploadPartRequest uploadPartRequest;
        Future<Boolean> uploadPartTask;

        public UploadPartTaskMetadata() {
        }
    }

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.UploadTask$UploadTaskProgressListener */
    /* loaded from: classes2.dex */
    public class UploadTaskProgressListener implements ProgressListener {
        private long prevTotalBytesTransferredOfAllParts;

        public UploadTaskProgressListener(TransferRecord transferRecord) {
            this.prevTotalBytesTransferredOfAllParts = transferRecord.bytesCurrent;
        }

        public synchronized void onProgressChanged(int i, long j) {
            UploadPartTaskMetadata uploadPartTaskMetadata = UploadTask.this.uploadPartTasks.get(Integer.valueOf(i));
            if (uploadPartTaskMetadata == null) {
                UploadTask.LOGGER.info("Update received for unknown part. Ignoring.");
                return;
            }
            uploadPartTaskMetadata.bytesTransferredSoFar = j;
            long j2 = 0;
            for (Map.Entry<Integer, UploadPartTaskMetadata> entry : UploadTask.this.uploadPartTasks.entrySet()) {
                j2 += entry.getValue().bytesTransferredSoFar;
            }
            if (j2 > this.prevTotalBytesTransferredOfAllParts) {
                UploadTask.this.updater.updateProgress(UploadTask.this.upload.f68572id, j2, UploadTask.this.upload.bytesTotal, true);
                this.prevTotalBytesTransferredOfAllParts = j2;
            }
        }

        @Override // com.amazonaws.event.ProgressListener
        public void progressChanged(ProgressEvent progressEvent) {
        }
    }

    static {
        CannedAccessControlList[] values;
        for (CannedAccessControlList cannedAccessControlList : CannedAccessControlList.values()) {
            CANNED_ACL_MAP.put(cannedAccessControlList.toString(), cannedAccessControlList);
        }
    }

    public UploadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferDBUtil transferDBUtil, TransferStatusUpdater transferStatusUpdater) {
        this.upload = transferRecord;
        this.f68576s3 = amazonS3;
        this.dbUtil = transferDBUtil;
        this.updater = transferStatusUpdater;
    }

    private void abortMultiPartUpload(int i, String str, String str2, String str3) {
        Log log = LOGGER;
        log.info("Aborting the multipart since complete multipart failed.");
        try {
            this.f68576s3.abortMultipartUpload(new AbortMultipartUploadRequest(str, str2, str3));
            log.debug("Successfully aborted multipart upload: " + i);
        } catch (AmazonClientException e) {
            Log log2 = LOGGER;
            log2.debug("Failed to abort the multipart upload: " + i, e);
        }
    }

    private void completeMultiPartUpload(int i, String str, String str2, String str3) throws AmazonClientException, AmazonServiceException {
        CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(str, str2, str3, this.dbUtil.queryPartETagsOfUpload(i));
        TransferUtility.appendMultipartTransferServiceUserAgentString(completeMultipartUploadRequest);
        this.f68576s3.completeMultipartUpload(completeMultipartUploadRequest);
    }

    private PutObjectRequest createPutObjectRequest(TransferRecord transferRecord) {
        File file = new File(transferRecord.file);
        PutObjectRequest putObjectRequest = new PutObjectRequest(transferRecord.bucketName, transferRecord.key, file);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentLength(file.length());
        String str = transferRecord.headerCacheControl;
        if (str != null) {
            objectMetadata.setCacheControl(str);
        }
        String str2 = transferRecord.headerContentDisposition;
        if (str2 != null) {
            objectMetadata.setContentDisposition(str2);
        }
        String str3 = transferRecord.headerContentEncoding;
        if (str3 != null) {
            objectMetadata.setContentEncoding(str3);
        }
        String str4 = transferRecord.headerContentType;
        if (str4 != null) {
            objectMetadata.setContentType(str4);
        } else {
            objectMetadata.setContentType(Mimetypes.getInstance().getMimetype(file));
        }
        String str5 = transferRecord.headerStorageClass;
        if (str5 != null) {
            putObjectRequest.setStorageClass(str5);
        }
        String str6 = transferRecord.expirationTimeRuleId;
        if (str6 != null) {
            objectMetadata.setExpirationTimeRuleId(str6);
        }
        if (transferRecord.httpExpires != null) {
            objectMetadata.setHttpExpiresDate(new Date(Long.valueOf(transferRecord.httpExpires).longValue()));
        }
        String str7 = transferRecord.sseAlgorithm;
        if (str7 != null) {
            objectMetadata.setSSEAlgorithm(str7);
        }
        Map<String, String> map = transferRecord.userMetadata;
        if (map != null) {
            objectMetadata.setUserMetadata(map);
            String str8 = transferRecord.userMetadata.get(Headers.S3_TAGGING);
            if (str8 != null) {
                try {
                    String[] split = str8.split(OBJECT_TAGS_DELIMITER);
                    ArrayList arrayList = new ArrayList();
                    for (String str9 : split) {
                        String[] split2 = str9.split(OBJECT_TAG_KEY_VALUE_SEPARATOR);
                        arrayList.add(new Tag(split2[0], split2[1]));
                    }
                    putObjectRequest.setTagging(new ObjectTagging(arrayList));
                } catch (Exception e) {
                    LOGGER.error("Error in passing the object tags as request headers.", e);
                }
            }
            String str10 = transferRecord.userMetadata.get(Headers.REDIRECT_LOCATION);
            if (str10 != null) {
                putObjectRequest.setRedirectLocation(str10);
            }
            String str11 = transferRecord.userMetadata.get(Headers.REQUESTER_PAYS_HEADER);
            if (str11 != null) {
                putObjectRequest.setRequesterPays("requester".equals(str11));
            }
        }
        String str12 = transferRecord.md5;
        if (str12 != null) {
            objectMetadata.setContentMD5(str12);
        }
        String str13 = transferRecord.sseKMSKey;
        if (str13 != null) {
            putObjectRequest.setSSEAwsKeyManagementParams(new SSEAwsKeyManagementParams(str13));
        }
        putObjectRequest.setMetadata(objectMetadata);
        putObjectRequest.setCannedAcl(getCannedAclFromString(transferRecord.cannedAcl));
        return putObjectRequest;
    }

    private static CannedAccessControlList getCannedAclFromString(String str) {
        if (str == null) {
            return null;
        }
        return CANNED_ACL_MAP.get(str);
    }

    private String initiateMultipartUpload(PutObjectRequest putObjectRequest) {
        InitiateMultipartUploadRequest withTagging = new InitiateMultipartUploadRequest(putObjectRequest.getBucketName(), putObjectRequest.getKey()).withCannedACL(putObjectRequest.getCannedAcl()).withObjectMetadata(putObjectRequest.getMetadata()).withSSEAwsKeyManagementParams(putObjectRequest.getSSEAwsKeyManagementParams()).withTagging(putObjectRequest.getTagging());
        TransferUtility.appendMultipartTransferServiceUserAgentString(withTagging);
        return this.f68576s3.initiateMultipartUpload(withTagging).getUploadId();
    }

    private Boolean uploadMultipartAndWaitForCompletion() throws ExecutionException {
        long j;
        String str = this.upload.multipartId;
        if (str != null && !str.isEmpty()) {
            long queryBytesTransferredByMainUploadId = this.dbUtil.queryBytesTransferredByMainUploadId(this.upload.f68572id);
            if (queryBytesTransferredByMainUploadId > 0) {
                LOGGER.info(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.upload.f68572id), Long.valueOf(queryBytesTransferredByMainUploadId)));
            }
            j = queryBytesTransferredByMainUploadId;
        } else {
            PutObjectRequest createPutObjectRequest = createPutObjectRequest(this.upload);
            TransferUtility.appendMultipartTransferServiceUserAgentString(createPutObjectRequest);
            try {
                this.upload.multipartId = initiateMultipartUpload(createPutObjectRequest);
                TransferDBUtil transferDBUtil = this.dbUtil;
                TransferRecord transferRecord = this.upload;
                transferDBUtil.updateMultipartId(transferRecord.f68572id, transferRecord.multipartId);
                j = 0;
            } catch (AmazonClientException e) {
                LOGGER.error("Error initiating multipart upload: " + this.upload.f68572id + " due to " + e.getMessage(), e);
                this.updater.throwError(this.upload.f68572id, e);
                this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
        UploadTaskProgressListener uploadTaskProgressListener = new UploadTaskProgressListener(this.upload);
        TransferStatusUpdater transferStatusUpdater = this.updater;
        TransferRecord transferRecord2 = this.upload;
        transferStatusUpdater.updateProgress(transferRecord2.f68572id, j, transferRecord2.bytesTotal, false);
        TransferDBUtil transferDBUtil2 = this.dbUtil;
        TransferRecord transferRecord3 = this.upload;
        this.requestList = transferDBUtil2.getNonCompletedPartRequestsFromDB(transferRecord3.f68572id, transferRecord3.multipartId);
        LOGGER.info("Multipart upload " + this.upload.f68572id + " in " + this.requestList.size() + " parts.");
        for (UploadPartRequest uploadPartRequest : this.requestList) {
            TransferUtility.appendMultipartTransferServiceUserAgentString(uploadPartRequest);
            UploadPartTaskMetadata uploadPartTaskMetadata = new UploadPartTaskMetadata();
            uploadPartTaskMetadata.uploadPartRequest = uploadPartRequest;
            uploadPartTaskMetadata.bytesTransferredSoFar = 0L;
            uploadPartTaskMetadata.state = TransferState.WAITING;
            this.uploadPartTasks.put(Integer.valueOf(uploadPartRequest.getPartNumber()), uploadPartTaskMetadata);
            uploadPartTaskMetadata.uploadPartTask = TransferThreadPool.submitTask(new UploadPartTask(uploadPartTaskMetadata, uploadTaskProgressListener, uploadPartRequest, this.f68576s3, this.dbUtil));
        }
        try {
            boolean z = true;
            for (UploadPartTaskMetadata uploadPartTaskMetadata2 : this.uploadPartTasks.values()) {
                z &= uploadPartTaskMetadata2.uploadPartTask.get().booleanValue();
            }
            if (!z) {
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        this.updater.updateState(this.upload.f68572id, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    LOGGER.error("TransferUtilityException: [" + e2 + "]");
                }
            }
            LOGGER.info("Completing the multi-part upload transfer for " + this.upload.f68572id);
            try {
                TransferRecord transferRecord4 = this.upload;
                completeMultiPartUpload(transferRecord4.f68572id, transferRecord4.bucketName, transferRecord4.key, transferRecord4.multipartId);
                TransferStatusUpdater transferStatusUpdater2 = this.updater;
                TransferRecord transferRecord5 = this.upload;
                int i = transferRecord5.f68572id;
                long j2 = transferRecord5.bytesTotal;
                transferStatusUpdater2.updateProgress(i, j2, j2, true);
                this.updater.updateState(this.upload.f68572id, TransferState.COMPLETED);
                return Boolean.TRUE;
            } catch (AmazonClientException e3) {
                LOGGER.error("Failed to complete multipart: " + this.upload.f68572id + " due to " + e3.getMessage(), e3);
                TransferRecord transferRecord6 = this.upload;
                abortMultiPartUpload(transferRecord6.f68572id, transferRecord6.bucketName, transferRecord6.key, transferRecord6.multipartId);
                this.updater.throwError(this.upload.f68572id, e3);
                this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        } catch (Exception e4) {
            Log log = LOGGER;
            log.error("Upload resulted in an exception. " + e4);
            if (!TransferState.CANCELED.equals(this.upload.state) && !TransferState.PAUSED.equals(this.upload.state)) {
                for (UploadPartTaskMetadata uploadPartTaskMetadata3 : this.uploadPartTasks.values()) {
                    uploadPartTaskMetadata3.uploadPartTask.cancel(true);
                }
                for (UploadPartTaskMetadata uploadPartTaskMetadata4 : this.uploadPartTasks.values()) {
                    TransferState transferState = TransferState.WAITING_FOR_NETWORK;
                    if (transferState.equals(uploadPartTaskMetadata4.state)) {
                        LOGGER.info("Individual part is WAITING_FOR_NETWORK.");
                        this.updater.updateState(this.upload.f68572id, transferState);
                        return Boolean.FALSE;
                    }
                }
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                        this.updater.updateState(this.upload.f68572id, TransferState.WAITING_FOR_NETWORK);
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e5) {
                    LOGGER.error("TransferUtilityException: [" + e5 + "]");
                }
                if (RetryUtils.isInterrupted(e4)) {
                    LOGGER.info("Transfer is interrupted. " + e4);
                    this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                LOGGER.error("Error encountered during multi-part upload: " + this.upload.f68572id + " due to " + e4.getMessage(), e4);
                this.updater.throwError(this.upload.f68572id, e4);
                this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
            log.info("Transfer is " + this.upload.state);
            return Boolean.FALSE;
        }
    }

    private Boolean uploadSinglePartAndWaitForCompletion() {
        PutObjectRequest createPutObjectRequest = createPutObjectRequest(this.upload);
        ProgressListener newProgressListener = this.updater.newProgressListener(this.upload.f68572id);
        long length = createPutObjectRequest.getFile().length();
        TransferUtility.appendTransferServiceUserAgentString(createPutObjectRequest);
        createPutObjectRequest.setGeneralProgressListener(newProgressListener);
        try {
            this.f68576s3.putObject(createPutObjectRequest);
            this.updater.updateProgress(this.upload.f68572id, length, length, true);
            this.updater.updateState(this.upload.f68572id, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e) {
            if (TransferState.CANCELED.equals(this.upload.state)) {
                Log log = LOGGER;
                log.info("Transfer is " + this.upload.state);
                return Boolean.FALSE;
            } else if (TransferState.PAUSED.equals(this.upload.state)) {
                Log log2 = LOGGER;
                log2.info("Transfer is " + this.upload.state);
                new ProgressEvent(0L).setEventCode(32);
                newProgressListener.progressChanged(new ProgressEvent(0L));
                return Boolean.FALSE;
            } else {
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        Log log3 = LOGGER;
                        log3.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.updater.updateState(this.upload.f68572id, TransferState.WAITING_FOR_NETWORK);
                        log3.debug("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).setEventCode(32);
                        newProgressListener.progressChanged(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e2) {
                    Log log4 = LOGGER;
                    log4.error("TransferUtilityException: [" + e2 + "]");
                }
                if (RetryUtils.isInterrupted(e)) {
                    Log log5 = LOGGER;
                    log5.info("Transfer is interrupted. " + e);
                    this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                Log log6 = LOGGER;
                log6.debug("Failed to upload: " + this.upload.f68572id + " due to " + e.getMessage());
                this.updater.throwError(this.upload.f68572id, e);
                this.updater.updateState(this.upload.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        try {
            if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                LOGGER.info("Network not connected. Setting the state to WAITING_FOR_NETWORK.");
                this.updater.updateState(this.upload.f68572id, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            Log log = LOGGER;
            log.error("TransferUtilityException: [" + e + "]");
        }
        this.updater.updateState(this.upload.f68572id, TransferState.IN_PROGRESS);
        TransferRecord transferRecord = this.upload;
        int i = transferRecord.isMultipart;
        if (i == 1 && transferRecord.partNumber == 0) {
            return uploadMultipartAndWaitForCompletion();
        }
        if (i == 0) {
            return uploadSinglePartAndWaitForCompletion();
        }
        return Boolean.FALSE;
    }
}
