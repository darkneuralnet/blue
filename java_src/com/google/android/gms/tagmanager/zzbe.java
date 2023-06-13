package com.google.android.gms.tagmanager;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.gtm.zzfz;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class zzbe implements zzax {
    private static final String zza = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' STRING NOT NULL, '%s' BLOB NOT NULL, '%s' INTEGER NOT NULL);", "datalayer", "ID", "key", "value", "expires");
    private final Executor zzb;
    private final Context zzc;
    private final zzbc zzd;
    private final Clock zze;

    public zzbe(Context context) {
        Clock defaultClock = DefaultClock.getInstance();
        ExecutorService zza2 = zzfz.zza().zza(2);
        this.zzc = context;
        this.zze = defaultClock;
        this.zzb = zza2;
        this.zzd = new zzbc(this, context, "google_tagmanager.db");
    }

    public static /* bridge */ /* synthetic */ List zzf(zzbe zzbeVar) {
        ObjectInputStream objectInputStream;
        try {
            zzbeVar.zzk(zzbeVar.zze.currentTimeMillis());
            SQLiteDatabase zzi = zzbeVar.zzi("Error opening database for loadSerialized.");
            ArrayList<zzbd> arrayList = new ArrayList();
            if (zzi != null) {
                Cursor query = zzi.query("datalayer", new String[]{"key", "value"}, null, null, null, null, "ID", null);
                while (query.moveToNext()) {
                    arrayList.add(new zzbd(query.getString(0), query.getBlob(1)));
                }
                query.close();
            }
            ArrayList arrayList2 = new ArrayList();
            for (zzbd zzbdVar : arrayList) {
                String str = zzbdVar.zza;
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(zzbdVar.zzb);
                ObjectInputStream objectInputStream2 = null;
                r2 = null;
                r2 = null;
                r2 = null;
                Object obj = null;
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                } catch (IOException unused) {
                    objectInputStream = null;
                } catch (ClassNotFoundException unused2) {
                    objectInputStream = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    obj = objectInputStream.readObject();
                    try {
                        objectInputStream.close();
                    } catch (IOException unused3) {
                    }
                } catch (IOException unused4) {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    arrayList2.add(new zzau(str, obj));
                } catch (ClassNotFoundException unused5) {
                    if (objectInputStream != null) {
                        objectInputStream.close();
                    }
                    byteArrayInputStream.close();
                    arrayList2.add(new zzau(str, obj));
                } catch (Throwable th2) {
                    th = th2;
                    objectInputStream2 = objectInputStream;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException unused6) {
                            throw th;
                        }
                    }
                    byteArrayInputStream.close();
                    throw th;
                }
                byteArrayInputStream.close();
                arrayList2.add(new zzau(str, obj));
            }
            return arrayList2;
        } finally {
            zzbeVar.zzj();
        }
    }

    private final SQLiteDatabase zzi(String str) {
        try {
            return this.zzd.getWritableDatabase();
        } catch (SQLiteException unused) {
            zzdh.zzc(str);
            return null;
        }
    }

    private final void zzj() {
        try {
            this.zzd.close();
        } catch (SQLiteException unused) {
        }
    }

    private final void zzk(long j) {
        SQLiteDatabase zzi = zzi("Error opening database for deleteOlderThan.");
        if (zzi == null) {
            return;
        }
        try {
            int delete = zzi.delete("datalayer", "expires <= ?", new String[]{Long.toString(j)});
            StringBuilder sb = new StringBuilder(33);
            sb.append("Deleted ");
            sb.append(delete);
            sb.append(" expired items");
            zzdh.zzb.zzd(sb.toString());
        } catch (SQLiteException unused) {
            zzdh.zzc("Error deleting old entries.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:
        if (r8 != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047 A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #9 {, blocks: (B:85:0x017e, B:4:0x0003, B:22:0x0042, B:24:0x0047, B:57:0x00c3, B:59:0x00ee, B:62:0x00f2, B:64:0x00fa, B:65:0x0115, B:67:0x011b, B:69:0x012b, B:71:0x0135, B:70:0x0130, B:37:0x0092, B:75:0x013d, B:76:0x0140, B:77:0x0141, B:80:0x014c, B:81:0x0150, B:83:0x0156, B:14:0x002f, B:21:0x003e, B:91:0x0187, B:92:0x018a), top: B:113:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3 A[Catch: all -> 0x0139, TryCatch #11 {all -> 0x0139, blocks: (B:33:0x007b, B:35:0x0081, B:50:0x00a3, B:52:0x00b3, B:54:0x00bd, B:53:0x00b8), top: B:107:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b8 A[Catch: all -> 0x0139, TryCatch #11 {all -> 0x0139, blocks: (B:33:0x007b, B:35:0x0081, B:50:0x00a3, B:52:0x00b3, B:54:0x00bd, B:53:0x00b8), top: B:107:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d A[Catch: all -> 0x018b, TryCatch #9 {, blocks: (B:85:0x017e, B:4:0x0003, B:22:0x0042, B:24:0x0047, B:57:0x00c3, B:59:0x00ee, B:62:0x00f2, B:64:0x00fa, B:65:0x0115, B:67:0x011b, B:69:0x012b, B:71:0x0135, B:70:0x0130, B:37:0x0092, B:75:0x013d, B:76:0x0140, B:77:0x0141, B:80:0x014c, B:81:0x0150, B:83:0x0156, B:14:0x002f, B:21:0x003e, B:91:0x0187, B:92:0x018a), top: B:113:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c A[Catch: all -> 0x018b, TryCatch #9 {, blocks: (B:85:0x017e, B:4:0x0003, B:22:0x0042, B:24:0x0047, B:57:0x00c3, B:59:0x00ee, B:62:0x00f2, B:64:0x00fa, B:65:0x0115, B:67:0x011b, B:69:0x012b, B:71:0x0135, B:70:0x0130, B:37:0x0092, B:75:0x013d, B:76:0x0140, B:77:0x0141, B:80:0x014c, B:81:0x0150, B:83:0x0156, B:14:0x002f, B:21:0x003e, B:91:0x0187, B:92:0x018a), top: B:113:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187 A[Catch: all -> 0x018b, TRY_ENTER, TryCatch #9 {, blocks: (B:85:0x017e, B:4:0x0003, B:22:0x0042, B:24:0x0047, B:57:0x00c3, B:59:0x00ee, B:62:0x00f2, B:64:0x00fa, B:65:0x0115, B:67:0x011b, B:69:0x012b, B:71:0x0135, B:70:0x0130, B:37:0x0092, B:75:0x013d, B:76:0x0140, B:77:0x0141, B:80:0x014c, B:81:0x0150, B:83:0x0156, B:14:0x002f, B:21:0x003e, B:91:0x0187, B:92:0x018a), top: B:113:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzl(List<zzbd> list, long j) {
        Cursor cursor;
        int i;
        int i2;
        SQLiteDatabase zzi;
        char c;
        Cursor cursor2;
        String valueOf;
        String str;
        int length;
        SQLiteDatabase zzi2;
        String str2;
        long currentTimeMillis = this.zze.currentTimeMillis();
        zzk(currentTimeMillis);
        int size = list.size();
        SQLiteDatabase zzi3 = zzi("Error opening database for getNumStoredEntries.");
        Cursor cursor3 = null;
        if (zzi3 != null) {
            try {
                cursor = zzi3.rawQuery("SELECT COUNT(*) from datalayer", null);
                try {
                    try {
                        if (cursor.moveToFirst()) {
                            i = (int) cursor.getLong(0);
                        } else {
                            i = 0;
                        }
                        cursor.close();
                    } catch (SQLiteException unused) {
                        zzdh.zzc("Error getting numStoredEntries");
                        if (cursor != null) {
                            cursor.close();
                        }
                        i = 0;
                        i2 = (i - 2000) + size;
                        if (i2 > 0) {
                        }
                        long j2 = currentTimeMillis + j;
                        zzi = zzi("Error opening database for writeEntryToDatabase.");
                        if (zzi != null) {
                        }
                        zzj();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException unused2) {
                cursor = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor3 != null) {
                }
                throw th;
            }
            i2 = (i - 2000) + size;
            if (i2 > 0) {
                ArrayList arrayList = new ArrayList();
                SQLiteDatabase zzi4 = zzi("Error opening database for peekEntryIds.");
                if (zzi4 == null) {
                    c = 1;
                } else {
                    try {
                        try {
                            String[] strArr = {"ID"};
                            try {
                                String format = String.format("%s ASC", "ID");
                                String num = Integer.toString(i2);
                                c = 1;
                                try {
                                    cursor2 = zzi4.query("datalayer", strArr, null, null, null, null, format, num);
                                } catch (SQLiteException e) {
                                    e = e;
                                    cursor2 = null;
                                    valueOf = String.valueOf(e.getMessage());
                                    if (valueOf.length() == 0) {
                                        str = "Error in peekEntries fetching entryIds: ".concat(valueOf);
                                    } else {
                                        str = new String("Error in peekEntries fetching entryIds: ");
                                    }
                                    zzdh.zzc(str);
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                c = 1;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            c = 1;
                        }
                        try {
                            try {
                                if (cursor2.moveToFirst()) {
                                    do {
                                        arrayList.add(String.valueOf(cursor2.getLong(0)));
                                    } while (cursor2.moveToNext());
                                }
                            } catch (SQLiteException e4) {
                                e = e4;
                                valueOf = String.valueOf(e.getMessage());
                                if (valueOf.length() == 0) {
                                }
                                zzdh.zzc(str);
                            }
                            cursor2.close();
                        } catch (Throwable th3) {
                            th = th3;
                            cursor3 = cursor2;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                }
                int size2 = arrayList.size();
                StringBuilder sb = new StringBuilder(64);
                sb.append("DataLayer store full, deleting ");
                sb.append(size2);
                sb.append(" entries to make room.");
                zzdh.zzb.zzb(sb.toString());
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                if (strArr2 != null && (length = strArr2.length) != 0 && (zzi2 = zzi("Error opening database for deleteEntries.")) != null) {
                    Object[] objArr = new Object[2];
                    objArr[0] = "ID";
                    objArr[c] = TextUtils.join(",", Collections.nCopies(length, CallerData.f61059NA));
                    try {
                        zzi2.delete("datalayer", String.format("%s in (%s)", objArr), strArr2);
                    } catch (SQLiteException unused3) {
                        String valueOf2 = String.valueOf(Arrays.toString(strArr2));
                        if (valueOf2.length() != 0) {
                            str2 = "Error deleting entries ".concat(valueOf2);
                        } else {
                            str2 = new String("Error deleting entries ");
                        }
                        zzdh.zzc(str2);
                    }
                }
            }
            long j22 = currentTimeMillis + j;
            zzi = zzi("Error opening database for writeEntryToDatabase.");
            if (zzi != null) {
                for (zzbd zzbdVar : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("expires", Long.valueOf(j22));
                    contentValues.put("key", zzbdVar.zza);
                    contentValues.put("value", zzbdVar.zzb);
                    zzi.insert("datalayer", null, contentValues);
                }
            }
            zzj();
        }
        i = 0;
        i2 = (i - 2000) + size;
        if (i2 > 0) {
        }
        long j222 = currentTimeMillis + j;
        zzi = zzi("Error opening database for writeEntryToDatabase.");
        if (zzi != null) {
        }
        zzj();
    }

    @Override // com.google.android.gms.tagmanager.zzax
    public final void zzb(zzaw zzawVar) {
        this.zzb.execute(new zzba(this, zzawVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r6 == null) goto L11;
     */
    @Override // com.google.android.gms.tagmanager.zzax
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(List<zzau> list, long j) {
        ObjectOutputStream objectOutputStream;
        ArrayList arrayList = new ArrayList();
        for (zzau zzauVar : list) {
            String str = zzauVar.zza;
            Object obj = zzauVar.zzb;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream2 = null;
            r5 = null;
            byte[] bArr = null;
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream2 = objectOutputStream;
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException unused2) {
                            throw th;
                        }
                    }
                    byteArrayOutputStream.close();
                    throw th;
                }
            } catch (IOException unused3) {
                objectOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                objectOutputStream.close();
                byteArrayOutputStream.close();
            } catch (IOException unused4) {
            }
            arrayList.add(new zzbd(str, bArr));
        }
        this.zzb.execute(new zzaz(this, arrayList, j));
    }
}
