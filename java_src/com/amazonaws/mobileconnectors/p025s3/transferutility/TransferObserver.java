package com.amazonaws.mobileconnectors.p025s3.transferutility;

import android.database.Cursor;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver */
/* loaded from: classes2.dex */
public class TransferObserver {
    private String bucket;
    private long bytesTotal;
    private long bytesTransferred;
    private final TransferDBUtil dbUtil;
    private String filePath;

    /* renamed from: id */
    private final int f68571id;
    private String key;
    private TransferStatusListener statusListener;
    private TransferListener transferListener;
    private TransferState transferState;

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver$TransferStatusListener */
    /* loaded from: classes2.dex */
    public class TransferStatusListener implements TransferListener {
        private TransferStatusListener() {
        }

        @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
        public void onError(int i, Exception exc) {
        }

        @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
        public void onProgressChanged(int i, long j, long j2) {
            TransferObserver.this.bytesTransferred = j;
            TransferObserver.this.bytesTotal = j2;
        }

        @Override // com.amazonaws.mobileconnectors.p025s3.transferutility.TransferListener
        public void onStateChanged(int i, TransferState transferState) {
            TransferObserver.this.transferState = transferState;
        }
    }

    public TransferObserver(int i, TransferDBUtil transferDBUtil, String str, String str2, File file) {
        this.f68571id = i;
        this.dbUtil = transferDBUtil;
        this.bucket = str;
        this.key = str2;
        this.filePath = file.getAbsolutePath();
        this.bytesTotal = file.length();
        this.transferState = TransferState.WAITING;
    }

    public void cleanTransferListener() {
        synchronized (this) {
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                TransferStatusUpdater.unregisterListener(this.f68571id, transferListener);
                this.transferListener = null;
            }
            TransferStatusListener transferStatusListener = this.statusListener;
            if (transferStatusListener != null) {
                TransferStatusUpdater.unregisterListener(this.f68571id, transferStatusListener);
                this.statusListener = null;
            }
        }
    }

    public String getAbsoluteFilePath() {
        return this.filePath;
    }

    public String getBucket() {
        return this.bucket;
    }

    public long getBytesTotal() {
        return this.bytesTotal;
    }

    public long getBytesTransferred() {
        return this.bytesTransferred;
    }

    public int getId() {
        return this.f68571id;
    }

    public String getKey() {
        return this.key;
    }

    public TransferState getState() {
        return this.transferState;
    }

    public void refresh() {
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryTransferById(this.f68571id);
            if (cursor.moveToFirst()) {
                updateFromDB(cursor);
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public void setTransferListener(TransferListener transferListener) {
        if (transferListener != null) {
            synchronized (this) {
                cleanTransferListener();
                TransferStatusListener transferStatusListener = new TransferStatusListener();
                this.statusListener = transferStatusListener;
                TransferStatusUpdater.registerListener(this.f68571id, transferStatusListener);
                this.transferListener = transferListener;
                TransferStatusUpdater.registerListener(this.f68571id, transferListener);
            }
        }
    }

    public String toString() {
        return "TransferObserver{id=" + this.f68571id + ", bucket='" + this.bucket + CoreConstants.SINGLE_QUOTE_CHAR + ", key='" + this.key + CoreConstants.SINGLE_QUOTE_CHAR + ", bytesTotal=" + this.bytesTotal + ", bytesTransferred=" + this.bytesTransferred + ", transferState=" + this.transferState + ", filePath='" + this.filePath + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public void updateFromDB(Cursor cursor) {
        this.bucket = cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BUCKET_NAME));
        this.key = cursor.getString(cursor.getColumnIndexOrThrow("key"));
        this.bytesTotal = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_TOTAL));
        this.bytesTransferred = cursor.getLong(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_BYTES_CURRENT));
        this.transferState = TransferState.getState(cursor.getString(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_STATE)));
        this.filePath = cursor.getString(cursor.getColumnIndexOrThrow("file"));
    }

    public TransferObserver(int i, TransferDBUtil transferDBUtil, String str, String str2, File file, TransferListener transferListener) {
        this(i, transferDBUtil, str, str2, file);
        setTransferListener(transferListener);
    }

    public TransferObserver(int i, TransferDBUtil transferDBUtil) {
        this.f68571id = i;
        this.dbUtil = transferDBUtil;
    }
}
