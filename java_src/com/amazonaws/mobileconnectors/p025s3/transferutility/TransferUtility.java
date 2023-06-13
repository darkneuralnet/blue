package com.amazonaws.mobileconnectors.p025s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobile.config.AWSConfiguration;
import com.amazonaws.regions.Region;
import com.amazonaws.services.p026s3.AmazonS3;
import com.amazonaws.services.p026s3.S3ClientOptions;
import com.amazonaws.services.p026s3.internal.Constants;
import com.amazonaws.services.p026s3.model.CannedAccessControlList;
import com.amazonaws.services.p026s3.model.ObjectMetadata;
import com.amazonaws.util.VersionInfoUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility */
/* loaded from: classes2.dex */
public class TransferUtility {
    static final int MINIMUM_UPLOAD_PART_SIZE = 5242880;
    private static final String TRANSFER_ADD = "add_transfer";
    private static final String TRANSFER_CANCEL = "cancel_transfer";
    private static final String TRANSFER_PAUSE = "pause_transfer";
    private static final String TRANSFER_RESUME = "resume_transfer";
    final ConnectivityManager connManager;
    private TransferDBUtil dbUtil;
    private final String defaultBucket;

    /* renamed from: s3 */
    private final AmazonS3 f68573s3;
    private final TransferUtilityOptions transferUtilityOptions;
    private TransferStatusUpdater updater;
    private static final Log LOGGER = LogFactory.getLog(TransferUtility.class);
    private static final Object LOCK = new Object();
    private static String userAgentFromConfig = "";

    /* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility$Builder */
    /* loaded from: classes2.dex */
    public static class Builder {
        private Context appContext;
        private AWSConfiguration awsConfig;
        private String defaultBucket;

        /* renamed from: s3 */
        private AmazonS3 f68574s3;
        private TransferUtilityOptions transferUtilityOptions;

        public Builder awsConfiguration(AWSConfiguration aWSConfiguration) {
            this.awsConfig = aWSConfiguration;
            return this;
        }

        public TransferUtility build() {
            boolean z;
            if (this.f68574s3 != null) {
                if (this.appContext != null) {
                    AWSConfiguration aWSConfiguration = this.awsConfig;
                    if (aWSConfiguration != null) {
                        try {
                            JSONObject optJsonObject = aWSConfiguration.optJsonObject("S3TransferUtility");
                            this.f68574s3.setRegion(Region.getRegion(optJsonObject.getString("Region")));
                            this.defaultBucket = optJsonObject.getString("Bucket");
                            if (optJsonObject.has(Constants.LOCAL_TESTING_FLAG_NAME)) {
                                z = optJsonObject.getBoolean(Constants.LOCAL_TESTING_FLAG_NAME);
                            } else {
                                z = false;
                            }
                            if (z) {
                                this.f68574s3.setEndpoint(Constants.LOCAL_TESTING_ENDPOINT);
                                this.f68574s3.setS3ClientOptions(S3ClientOptions.builder().setPathStyleAccess(true).skipContentMd5Check(true).build());
                            }
                            TransferUtility.setUserAgentFromConfig(this.awsConfig.getUserAgent());
                        } catch (Exception e) {
                            throw new IllegalArgumentException("Failed to read S3TransferUtility please check your setup or awsconfiguration.json file", e);
                        }
                    }
                    if (this.transferUtilityOptions == null) {
                        this.transferUtilityOptions = new TransferUtilityOptions();
                    }
                    return new TransferUtility(this.f68574s3, this.appContext, this.defaultBucket, this.transferUtilityOptions);
                }
                throw new IllegalArgumentException("Context is required please set using .context(applicationContext)");
            }
            throw new IllegalArgumentException("AmazonS3 client is required please set using .s3Client(yourClient)");
        }

        public Builder context(Context context) {
            this.appContext = context.getApplicationContext();
            return this;
        }

        public Builder defaultBucket(String str) {
            this.defaultBucket = str;
            return this;
        }

        public Builder s3Client(AmazonS3 amazonS3) {
            this.f68574s3 = amazonS3;
            return this;
        }

        public Builder transferUtilityOptions(TransferUtilityOptions transferUtilityOptions) {
            this.transferUtilityOptions = transferUtilityOptions;
            return this;
        }
    }

    public static <X extends AmazonWebServiceRequest> X appendMultipartTransferServiceUserAgentString(X x) {
        RequestClientOptions requestClientOptions = x.getRequestClientOptions();
        requestClientOptions.appendUserAgent("TransferService_multipart/" + getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return x;
    }

    public static <X extends AmazonWebServiceRequest> X appendTransferServiceUserAgentString(X x) {
        RequestClientOptions requestClientOptions = x.getRequestClientOptions();
        requestClientOptions.appendUserAgent("TransferService/" + getUserAgentFromConfig() + VersionInfoUtils.getVersion());
        return x;
    }

    public static Builder builder() {
        return new Builder();
    }

    private int createMultipartUploadRecords(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        int i;
        long length = file.length();
        double d = length;
        long max = (long) Math.max(Math.ceil(d / 10000.0d), 5242880.0d);
        int ceil = ((int) Math.ceil(d / max)) + 1;
        ContentValues[] contentValuesArr = new ContentValues[ceil];
        contentValuesArr[0] = this.dbUtil.generateContentValuesForMultiPartUpload(str, str2, file, 0L, 0, "", file.length(), 0, objectMetadata, cannedAccessControlList, this.transferUtilityOptions);
        long j = 0;
        int i2 = 1;
        for (int i3 = 1; i3 < ceil; i3++) {
            long min = Math.min(max, length);
            TransferDBUtil transferDBUtil = this.dbUtil;
            length -= max;
            if (length <= 0) {
                i = 1;
            } else {
                i = 0;
            }
            contentValuesArr[i3] = transferDBUtil.generateContentValuesForMultiPartUpload(str, str2, file, j, i2, "", min, i, objectMetadata, cannedAccessControlList, this.transferUtilityOptions);
            j += max;
            i2++;
        }
        return this.dbUtil.bulkInsertTransferRecords(contentValuesArr);
    }

    private String getDefaultBucketOrThrow() {
        String str = this.defaultBucket;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("TransferUtility has not been configured with a default bucket. Please use the corresponding method that specifies bucket name or configure the default bucket name in construction of the object. See TransferUtility.builder().defaultBucket() or TransferUtility.builder().awsConfiguration()");
    }

    private List<Integer> getTransferIdsWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryTransfersWithTypeAndStates(transferType, transferStateArr);
            while (cursor.moveToNext()) {
                if (cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)) == 0) {
                    arrayList.add(Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID))));
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static String getUserAgentFromConfig() {
        synchronized (LOCK) {
            String str = userAgentFromConfig;
            if (str != null && !str.trim().isEmpty()) {
                return userAgentFromConfig.trim() + "/";
            }
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setUserAgentFromConfig(String str) {
        synchronized (LOCK) {
            userAgentFromConfig = str;
        }
    }

    private boolean shouldUploadInMultipart(File file) {
        return file != null && file.length() > 5242880;
    }

    private synchronized void submitTransferJob(String str, int i) {
        S3ClientReference.put(Integer.valueOf(i), this.f68573s3);
        TransferRecord transfer = this.updater.getTransfer(i);
        if (transfer == null) {
            transfer = this.dbUtil.getTransferById(i);
            if (transfer == null) {
                Log log = LOGGER;
                log.error("Cannot find transfer with id: " + i);
                return;
            }
            this.updater.addTransfer(transfer);
        } else if (TRANSFER_ADD.equals(str)) {
            Log log2 = LOGGER;
            log2.warn("Transfer has already been added: " + i);
            return;
        }
        if (!TRANSFER_ADD.equals(str) && !TRANSFER_RESUME.equals(str)) {
            if (TRANSFER_PAUSE.equals(str)) {
                transfer.pause(this.f68573s3, this.updater);
            } else if (TRANSFER_CANCEL.equals(str)) {
                transfer.cancel(this.f68573s3, this.updater);
            } else {
                Log log3 = LOGGER;
                log3.error("Unknown action: " + str);
            }
        }
        transfer.start(this.f68573s3, this.dbUtil, this.updater, this.connManager);
    }

    public boolean cancel(int i) {
        submitTransferJob(TRANSFER_CANCEL, i);
        return true;
    }

    public void cancelAllWithType(TransferType transferType) {
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursor.moveToNext()) {
                cancel(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean deleteTransferRecord(int i) {
        cancel(i);
        if (this.dbUtil.deleteTransferRecords(i) > 0) {
            return true;
        }
        return false;
    }

    public TransferObserver download(String str, String str2, File file) {
        return download(str, str2, file, null);
    }

    public TransferDBUtil getDbUtil() {
        return this.dbUtil;
    }

    public TransferObserver getTransferById(int i) {
        Cursor queryTransferById;
        Cursor cursor = null;
        try {
            queryTransferById = this.dbUtil.queryTransferById(i);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (queryTransferById.moveToNext()) {
                TransferObserver transferObserver = new TransferObserver(i, this.dbUtil);
                transferObserver.updateFromDB(queryTransferById);
                queryTransferById.close();
                return transferObserver;
            }
            queryTransferById.close();
            return null;
        } catch (Throwable th2) {
            th = th2;
            cursor = queryTransferById;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<TransferObserver> getTransfersWithType(TransferType transferType) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursor.moveToNext()) {
                TransferObserver transferObserver = new TransferObserver(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)), this.dbUtil);
                transferObserver.updateFromDB(cursor);
                arrayList.add(transferObserver);
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public List<TransferObserver> getTransfersWithTypeAndState(TransferType transferType, TransferState transferState) {
        return getTransfersWithTypeAndStates(transferType, new TransferState[]{transferState});
    }

    public List<TransferObserver> getTransfersWithTypeAndStates(TransferType transferType, TransferState[] transferStateArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryTransfersWithTypeAndStates(transferType, transferStateArr);
            while (cursor.moveToNext()) {
                if (cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_PART_NUM)) == 0) {
                    TransferObserver transferObserver = new TransferObserver(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)), this.dbUtil);
                    transferObserver.updateFromDB(cursor);
                    arrayList.add(transferObserver);
                }
            }
            cursor.close();
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public boolean pause(int i) {
        submitTransferJob(TRANSFER_PAUSE, i);
        return true;
    }

    public void pauseAllWithType(TransferType transferType) {
        Cursor cursor = null;
        try {
            cursor = this.dbUtil.queryAllTransfersWithType(transferType);
            while (cursor.moveToNext()) {
                pause(cursor.getInt(cursor.getColumnIndexOrThrow(TransferTable.COLUMN_ID)));
            }
            cursor.close();
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public TransferObserver resume(int i) {
        submitTransferJob(TRANSFER_RESUME, i);
        return getTransferById(i);
    }

    public List<TransferObserver> resumeAllWithType(TransferType transferType) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : getTransferIdsWithTypeAndStates(transferType, new TransferState[]{TransferState.PAUSED, TransferState.FAILED, TransferState.CANCELED})) {
            arrayList.add(resume(num.intValue()));
        }
        return arrayList;
    }

    public TransferObserver upload(String str, String str2, File file) {
        return upload(str, str2, file, new ObjectMetadata());
    }

    private TransferUtility(AmazonS3 amazonS3, Context context, String str, TransferUtilityOptions transferUtilityOptions) {
        this.f68573s3 = amazonS3;
        this.defaultBucket = str;
        this.transferUtilityOptions = transferUtilityOptions;
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(transferUtilityOptions.getTransferThreadPoolSize());
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public TransferObserver download(String str, File file) {
        return download(getDefaultBucketOrThrow(), str, file, null);
    }

    public TransferObserver upload(String str, File file) {
        return upload(getDefaultBucketOrThrow(), str, file, new ObjectMetadata());
    }

    public TransferObserver download(String str, String str2, File file, TransferListener transferListener) {
        if (file != null && !file.isDirectory()) {
            int parseInt = Integer.parseInt(this.dbUtil.insertSingleTransferRecord(TransferType.DOWNLOAD, str, str2, file, this.transferUtilityOptions).getLastPathSegment());
            if (file.isFile()) {
                Log log = LOGGER;
                log.warn("Overwrite existing file: " + file);
                file.delete();
            }
            TransferObserver transferObserver = new TransferObserver(parseInt, this.dbUtil, str, str2, file, transferListener);
            submitTransferJob(TRANSFER_ADD, parseInt);
            return transferObserver;
        }
        throw new IllegalArgumentException("Invalid file: " + file);
    }

    public TransferObserver upload(String str, String str2, File file, CannedAccessControlList cannedAccessControlList) {
        return upload(str, str2, file, new ObjectMetadata(), cannedAccessControlList);
    }

    public TransferObserver upload(String str, File file, CannedAccessControlList cannedAccessControlList) {
        return upload(getDefaultBucketOrThrow(), str, file, new ObjectMetadata(), cannedAccessControlList);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata) {
        return upload(str, str2, file, objectMetadata, (CannedAccessControlList) null);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, (CannedAccessControlList) null);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        return upload(str, str2, file, objectMetadata, cannedAccessControlList, null);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, cannedAccessControlList, null);
    }

    public TransferObserver upload(String str, String str2, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferListener transferListener) {
        int parseInt;
        if (file != null && !file.isDirectory() && file.exists()) {
            if (shouldUploadInMultipart(file)) {
                parseInt = createMultipartUploadRecords(str, str2, file, objectMetadata, cannedAccessControlList);
            } else {
                parseInt = Integer.parseInt(this.dbUtil.insertSingleTransferRecord(TransferType.UPLOAD, str, str2, file, objectMetadata, cannedAccessControlList, this.transferUtilityOptions).getLastPathSegment());
            }
            TransferObserver transferObserver = new TransferObserver(parseInt, this.dbUtil, str, str2, file, transferListener);
            submitTransferJob(TRANSFER_ADD, parseInt);
            return transferObserver;
        }
        throw new IllegalArgumentException("Invalid file: " + file);
    }

    @Deprecated
    public TransferUtility(AmazonS3 amazonS3, Context context) {
        this.f68573s3 = amazonS3;
        this.defaultBucket = null;
        TransferUtilityOptions transferUtilityOptions = new TransferUtilityOptions();
        this.transferUtilityOptions = transferUtilityOptions;
        this.dbUtil = new TransferDBUtil(context.getApplicationContext());
        this.updater = TransferStatusUpdater.getInstance(context.getApplicationContext());
        TransferThreadPool.init(transferUtilityOptions.getTransferThreadPoolSize());
        this.connManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public TransferObserver download(String str, File file, TransferListener transferListener) {
        return download(getDefaultBucketOrThrow(), str, file, transferListener);
    }

    public TransferObserver upload(String str, File file, ObjectMetadata objectMetadata, CannedAccessControlList cannedAccessControlList, TransferListener transferListener) {
        return upload(getDefaultBucketOrThrow(), str, file, objectMetadata, cannedAccessControlList, transferListener);
    }
}
