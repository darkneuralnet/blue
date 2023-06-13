package com.amazonaws.mobileconnectors.p025s3.transferutility;

import com.amazonaws.AmazonClientException;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.event.ProgressListener;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.model.GetObjectRequest;
import com.amazonaws.services.p026s3.model.S3Object;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.DownloadTask */
/* loaded from: classes2.dex */
public class DownloadTask implements Callable<Boolean> {
    private static final Log LOGGER = LogFactory.getLog(DownloadTask.class);
    private static final int SIXTEEN_KB = 16384;
    private final TransferRecord download;

    /* renamed from: s3 */
    private final AmazonS3 f68570s3;
    private final TransferStatusUpdater updater;

    public DownloadTask(TransferRecord transferRecord, AmazonS3 amazonS3, TransferStatusUpdater transferStatusUpdater) {
        this.download = transferRecord;
        this.f68570s3 = amazonS3;
        this.updater = transferStatusUpdater;
    }

    private void saveToFile(InputStream inputStream, File file) {
        boolean z;
        BufferedOutputStream bufferedOutputStream;
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        if (file.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file, z));
            } catch (Throwable th) {
                th = th;
            }
        } catch (SocketTimeoutException e) {
            e = e;
        } catch (IOException e2) {
            e = e2;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException e3) {
                        LOGGER.warn("got exception", e3);
                    }
                }
            }
            bufferedOutputStream.close();
            try {
                inputStream.close();
            } catch (IOException e4) {
                LOGGER.warn("got exception", e4);
            }
        } catch (SocketTimeoutException e5) {
            e = e5;
            String str = "SocketTimeoutException: Unable to retrieve contents over network: " + e.getMessage();
            LOGGER.error(str);
            throw new AmazonClientException(str, e);
        } catch (IOException e6) {
            e = e6;
            throw new AmazonClientException("Unable to store object contents to disk: " + e.getMessage(), e);
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream2 = bufferedOutputStream;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException e7) {
                    LOGGER.warn("got exception", e7);
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e8) {
                    LOGGER.warn("got exception", e8);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.concurrent.Callable
    public Boolean call() {
        try {
            if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                Log log = LOGGER;
                log.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                this.updater.updateState(this.download.f68572id, TransferState.WAITING_FOR_NETWORK);
                return Boolean.FALSE;
            }
        } catch (TransferUtilityException e) {
            Log log2 = LOGGER;
            log2.error("TransferUtilityException: [" + e + "]");
        }
        this.updater.updateState(this.download.f68572id, TransferState.IN_PROGRESS);
        ProgressListener newProgressListener = this.updater.newProgressListener(this.download.f68572id);
        try {
            TransferRecord transferRecord = this.download;
            GetObjectRequest getObjectRequest = new GetObjectRequest(transferRecord.bucketName, transferRecord.key);
            TransferUtility.appendTransferServiceUserAgentString(getObjectRequest);
            File file = new File(this.download.file);
            long length = file.length();
            if (length > 0) {
                LOGGER.debug(String.format("Resume transfer %d from %d bytes", Integer.valueOf(this.download.f68572id), Long.valueOf(length)));
                getObjectRequest.setRange(length, -1L);
            }
            getObjectRequest.setGeneralProgressListener(newProgressListener);
            S3Object object = this.f68570s3.getObject(getObjectRequest);
            if (object == null) {
                this.updater.throwError(this.download.f68572id, new IllegalStateException("AmazonS3.getObject returns null"));
                this.updater.updateState(this.download.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
            long instanceLength = object.getObjectMetadata().getInstanceLength();
            this.updater.updateProgress(this.download.f68572id, length, instanceLength, true);
            saveToFile(object.getObjectContent(), file);
            this.updater.updateProgress(this.download.f68572id, instanceLength, instanceLength, true);
            this.updater.updateState(this.download.f68572id, TransferState.COMPLETED);
            return Boolean.TRUE;
        } catch (Exception e2) {
            if (TransferState.CANCELED.equals(this.download.state)) {
                Log log3 = LOGGER;
                log3.info("Transfer is " + this.download.state);
                return Boolean.FALSE;
            } else if (TransferState.PAUSED.equals(this.download.state)) {
                Log log4 = LOGGER;
                log4.info("Transfer is " + this.download.state);
                new ProgressEvent(0L).setEventCode(32);
                newProgressListener.progressChanged(new ProgressEvent(0L));
                return Boolean.FALSE;
            } else {
                try {
                    if (TransferNetworkLossHandler.getInstance() != null && !TransferNetworkLossHandler.getInstance().isNetworkConnected()) {
                        Log log5 = LOGGER;
                        log5.info("Thread:[" + Thread.currentThread().getId() + "]: Network wasn't available.");
                        this.updater.updateState(this.download.f68572id, TransferState.WAITING_FOR_NETWORK);
                        log5.debug("Network Connection Interrupted: Moving the TransferState to WAITING_FOR_NETWORK");
                        new ProgressEvent(0L).setEventCode(32);
                        newProgressListener.progressChanged(new ProgressEvent(0L));
                        return Boolean.FALSE;
                    }
                } catch (TransferUtilityException e3) {
                    Log log6 = LOGGER;
                    log6.error("TransferUtilityException: [" + e3 + "]");
                }
                if (RetryUtils.isInterrupted(e2)) {
                    Log log7 = LOGGER;
                    log7.info("Transfer is interrupted. " + e2);
                    this.updater.updateState(this.download.f68572id, TransferState.FAILED);
                    return Boolean.FALSE;
                }
                Log log8 = LOGGER;
                log8.debug("Failed to download: " + this.download.f68572id + " due to " + e2.getMessage());
                this.updater.throwError(this.download.f68572id, e2);
                this.updater.updateState(this.download.f68572id, TransferState.FAILED);
                return Boolean.FALSE;
            }
        }
    }
}
