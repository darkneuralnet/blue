package com.amazonaws.mobileconnectors.p025s3.transferutility;

import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
/* renamed from: com.amazonaws.mobileconnectors.s3.transferutility.TransferDBBase */
/* loaded from: classes2.dex */
class TransferDBBase {
    private static final String BASE_PATH = "transfers";
    private static final int TRANSFERS = 10;
    private static final int TRANSFER_ID = 20;
    private static final int TRANSFER_PART = 30;
    private static final int TRANSFER_STATE = 40;
    private final Uri contentUri;
    private final Context context;
    private SQLiteDatabase database;
    private final TransferDatabaseHelper databaseHelper;
    private final UriMatcher uriMatcher;
    private static final Log LOGGER = LogFactory.getLog(TransferDBBase.class);
    private static final Object LOCK = new Object();

    public TransferDBBase(Context context) {
        this.context = context;
        String packageName = context.getApplicationContext().getPackageName();
        TransferDatabaseHelper transferDatabaseHelper = new TransferDatabaseHelper(context);
        this.databaseHelper = transferDatabaseHelper;
        this.database = transferDatabaseHelper.getWritableDatabase();
        this.contentUri = Uri.parse("content://" + packageName + "/" + BASE_PATH);
        UriMatcher uriMatcher = new UriMatcher(-1);
        this.uriMatcher = uriMatcher;
        uriMatcher.addURI(packageName, BASE_PATH, 10);
        uriMatcher.addURI(packageName, "transfers/#", 20);
        uriMatcher.addURI(packageName, "transfers/part/#", 30);
        uriMatcher.addURI(packageName, "transfers/state/*", 40);
    }

    private void ensureDatabaseOpen() {
        synchronized (LOCK) {
            if (!this.database.isOpen()) {
                this.database = this.databaseHelper.getWritableDatabase();
            }
        }
    }

    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match == 10) {
            int i = 0;
            try {
                try {
                    this.database.beginTransaction();
                    i = (int) this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[0]);
                    for (int i2 = 1; i2 < contentValuesArr.length; i2++) {
                        contentValuesArr[i2].put(TransferTable.COLUMN_MAIN_UPLOAD_ID, Integer.valueOf(i));
                        this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValuesArr[i2]);
                    }
                    this.database.setTransactionSuccessful();
                } catch (Exception e) {
                    LOGGER.error("bulkInsert error : ", e);
                }
                return i;
            } finally {
                this.database.endTransaction();
            }
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public void closeDBHelper() {
        this.databaseHelper.close();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match != 10) {
            if (match == 20) {
                String lastPathSegment = uri.getLastPathSegment();
                if (TextUtils.isEmpty(str)) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    return sQLiteDatabase.delete(TransferTable.TABLE_TRANSFER, "_id=" + lastPathSegment, null);
                }
                SQLiteDatabase sQLiteDatabase2 = this.database;
                return sQLiteDatabase2.delete(TransferTable.TABLE_TRANSFER, "_id=" + lastPathSegment + " and " + str, strArr);
            }
            throw new IllegalArgumentException("Unknown URI: " + uri);
        }
        return this.database.delete(TransferTable.TABLE_TRANSFER, str, strArr);
    }

    public Uri getContentUri() {
        return this.contentUri;
    }

    public SQLiteDatabase getDatabase() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            sQLiteDatabase = this.database;
        }
        return sQLiteDatabase;
    }

    public TransferDatabaseHelper getDatabaseHelper() {
        return this.databaseHelper;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match == 10) {
            long insertOrThrow = this.database.insertOrThrow(TransferTable.TABLE_TRANSFER, null, contentValues);
            return Uri.parse("transfers/" + insertOrThrow);
        }
        throw new IllegalArgumentException("Unknown URI: " + uri);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(TransferTable.TABLE_TRANSFER);
        int match = this.uriMatcher.match(uri);
        if (match != 10) {
            if (match != 20) {
                if (match != 30) {
                    if (match == 40) {
                        sQLiteQueryBuilder.appendWhere("state=");
                        sQLiteQueryBuilder.appendWhereEscapeString(uri.getLastPathSegment());
                    } else {
                        throw new IllegalArgumentException("Unknown URI: " + uri);
                    }
                } else {
                    sQLiteQueryBuilder.appendWhere("main_upload_id=" + uri.getLastPathSegment());
                }
            } else {
                sQLiteQueryBuilder.appendWhere("_id=" + uri.getLastPathSegment());
            }
        } else {
            sQLiteQueryBuilder.appendWhere("part_num=0");
        }
        ensureDatabaseOpen();
        return sQLiteQueryBuilder.query(this.database, strArr, str, strArr2, null, null, str2);
    }

    public synchronized int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int update;
        int match = this.uriMatcher.match(uri);
        ensureDatabaseOpen();
        if (match != 10) {
            if (match == 20) {
                String lastPathSegment = uri.getLastPathSegment();
                if (TextUtils.isEmpty(str)) {
                    SQLiteDatabase sQLiteDatabase = this.database;
                    update = sQLiteDatabase.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment, null);
                } else {
                    SQLiteDatabase sQLiteDatabase2 = this.database;
                    update = sQLiteDatabase2.update(TransferTable.TABLE_TRANSFER, contentValues, "_id=" + lastPathSegment + " and " + str, strArr);
                }
            } else {
                throw new IllegalArgumentException("Unknown URI: " + uri);
            }
        } else {
            update = this.database.update(TransferTable.TABLE_TRANSFER, contentValues, str, strArr);
        }
        return update;
    }
}
