package com.google.android.gms.tagmanager;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes6.dex */
public final class zzbc extends SQLiteOpenHelper {
    final /* synthetic */ zzbe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbc(zzbe zzbeVar, Context context, String str) {
        super(context, "google_tagmanager.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.zza = zzbeVar;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        Context context;
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = super.getWritableDatabase();
        } catch (SQLiteException unused) {
            context = this.zza.zzc;
            context.getDatabasePath("google_tagmanager.db").delete();
            sQLiteDatabase = null;
        }
        if (sQLiteDatabase == null) {
            return super.getWritableDatabase();
        }
        return sQLiteDatabase;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        zzbv.zza(sQLiteDatabase.getPath());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String str;
        Cursor query;
        Cursor cursor = null;
        try {
            try {
                query = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{"datalayer"}, null, null, null);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException unused) {
        }
        try {
            boolean moveToFirst = query.moveToFirst();
            query.close();
            if (moveToFirst) {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM datalayer WHERE 0", null);
                HashSet hashSet = new HashSet();
                try {
                    for (String str2 : rawQuery.getColumnNames()) {
                        hashSet.add(str2);
                    }
                    rawQuery.close();
                    if (hashSet.remove("key") && hashSet.remove("value") && hashSet.remove("ID") && hashSet.remove("expires")) {
                        if (hashSet.isEmpty()) {
                            return;
                        }
                        throw new SQLiteException("Database has extra columns");
                    }
                    throw new SQLiteException("Database column missing");
                } catch (Throwable th2) {
                    rawQuery.close();
                    throw th2;
                }
            }
        } catch (SQLiteException unused2) {
            cursor = query;
            zzdh.zzc("Error querying for table datalayer");
            if (cursor != null) {
                cursor.close();
            }
            str = zzbe.zza;
            sQLiteDatabase.execSQL(str);
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        str = zzbe.zza;
        sQLiteDatabase.execSQL(str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
