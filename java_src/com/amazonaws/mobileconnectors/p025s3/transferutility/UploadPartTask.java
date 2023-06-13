package com.amazonaws.mobileconnectors.p025s3.transferutility;

import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.p025s3.transferutility.UploadTask;
import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.model.UploadPartRequest;
import com.amazonaws.services.p026s3.model.UploadPartResult;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.UploadPartTask */
/* loaded from: classes2.dex */
public class UploadPartTask implements Callable<Boolean> {
    private static final Log LOGGER = LogFactory.getLog(UploadPartTask.class);
    private final TransferDBUtil dbUtil;

    /* renamed from: s3 */
    private final AmazonS3 f68575s3;
    private final UploadPartRequest uploadPartRequest;
    private final UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata;
    private final UploadTask.UploadTaskProgressListener uploadTaskProgressListener;

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.UploadPartTask$UploadPartTaskProgressListener */
    /* loaded from: classes2.dex */
    public class UploadPartTaskProgressListener implements ProgressListener {
        private long bytesTransferredSoFar;
        private UploadTask.UploadTaskProgressListener uploadTaskProgressListener;

        public UploadPartTaskProgressListener(UploadTask.UploadTaskProgressListener uploadTaskProgressListener) {
            this.uploadTaskProgressListener = uploadTaskProgressListener;
        }

        @Override // com.amazonaws.event.ProgressListener
        public void progressChanged(ProgressEvent progressEvent) {
            if (32 == progressEvent.getEventCode()) {
                UploadPartTask.LOGGER.info("Reset Event triggerred. Resetting the bytesCurrent to 0.");
                this.bytesTransferredSoFar = 0L;
            } else {
                this.bytesTransferredSoFar += progressEvent.getBytesTransferred();
            }
            this.uploadTaskProgressListener.onProgressChanged(UploadPartTask.this.uploadPartRequest.getPartNumber(), this.bytesTransferredSoFar);
        }
    }

    public UploadPartTask(UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata, UploadTask.UploadTaskProgressListener uploadTaskProgressListener, UploadPartRequest uploadPartRequest, AmazonS3 amazonS3, TransferDBUtil transferDBUtil) {
        this.uploadPartTaskMetadata = uploadPartTaskMetadata;
        this.uploadTaskProgressListener = uploadTaskProgressListener;
        this.uploadPartRequest = uploadPartRequest;
        this.f68575s3 = amazonS3;
        this.dbUtil = transferDBUtil;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() throws Exception {
        try {
            this.uploadPartTaskMetadata.state = TransferState.IN_PROGRESS;
            this.uploadPartRequest.setGeneralProgressListener(new UploadPartTaskProgressListener(this.uploadTaskProgressListener));
            UploadPartResult uploadPart = this.f68575s3.uploadPart(this.uploadPartRequest);
            UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata = this.uploadPartTaskMetadata;
            TransferState transferState = TransferState.PART_COMPLETED;
            uploadPartTaskMetadata.state = transferState;
            this.dbUtil.updateState(this.uploadPartRequest.getId(), transferState);
            this.dbUtil.updateETag(this.uploadPartRequest.getId(), uploadPart.getETag());
            return Boolean.TRUE;
        } catch (Exception e) {
            Log log = LOGGER;
            log.error("Upload part interrupted: " + e);
            new ProgressEvent(0L).setEventCode(32);
            this.uploadTaskProgressListener.progressChanged(new ProgressEvent(0L));
            try {
                if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                    log.info("Thread: [" + Thread.currentThread().getId() + "]: Network wasn't available.");
                    UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata2 = this.uploadPartTaskMetadata;
                    TransferState transferState2 = TransferState.WAITING_FOR_NETWORK;
                    uploadPartTaskMetadata2.state = transferState2;
                    this.dbUtil.updateState(this.uploadPartRequest.getId(), transferState2);
                    log.info("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                    return Boolean.FALSE;
                }
            } catch (TransferUtilityException e2) {
                Log log2 = LOGGER;
                log2.error("TransferUtilityException: [" + e2 + "]");
            }
            UploadTask.UploadPartTaskMetadata uploadPartTaskMetadata3 = this.uploadPartTaskMetadata;
            TransferState transferState3 = TransferState.FAILED;
            uploadPartTaskMetadata3.state = transferState3;
            this.dbUtil.updateState(this.uploadPartRequest.getId(), transferState3);
            LOGGER.error("Encountered error uploading part ", e);
            throw e;
        }
    }
}
