package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
/* renamed from: lr7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44748lr7 {
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
        if (r3 == false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00dc  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m26733a(C32809Fc8 c32809Fc8, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws SQLiteException {
        SQLiteException e;
        Cursor cursor;
        String[] split;
        if (c32809Fc8 != null) {
            Cursor cursor2 = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    try {
                        boolean moveToFirst = cursor.moveToFirst();
                        cursor.close();
                    } catch (SQLiteException e2) {
                        e = e2;
                        c32809Fc8.m106888t().m42706c("Error querying for table", str, e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.execSQL(str2);
                        try {
                            HashSet hashSet = new HashSet();
                            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            for (String str4 : str3.split(",")) {
                                if (!hashSet.remove(str4)) {
                                    throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                                }
                            }
                            if (strArr != null) {
                                for (int i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (!hashSet.isEmpty()) {
                                c32809Fc8.m106888t().m42706c("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                            }
                        } catch (SQLiteException e3) {
                            c32809Fc8.m106893o().m42707b("Failed to verify columns on table that was just created", str);
                            throw e3;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    /* renamed from: b */
    public static void m26732b(C32809Fc8 c32809Fc8, SQLiteDatabase sQLiteDatabase) {
        if (c32809Fc8 != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                c32809Fc8.m106888t().m42708a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                c32809Fc8.m106888t().m42708a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                c32809Fc8.m106888t().m42708a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                c32809Fc8.m106888t().m42708a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
