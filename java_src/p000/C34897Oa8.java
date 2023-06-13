package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import java.util.ArrayList;
import java.util.List;
/* renamed from: Oa8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C34897Oa8 extends AbstractC51140we8 {

    /* renamed from: c */
    public final C31621Aa8 f26798c;

    /* renamed from: d */
    public boolean f26799d;

    public C34897Oa8(C35248Pn8 c35248Pn8) {
        super(c35248Pn8);
        Context mo22255z = this.f100966a.mo22255z();
        this.f100966a.m89751w();
        this.f26798c = new C31621Aa8(this, mo22255z, "google_app_measurement_local.db");
    }

    @Override // p000.AbstractC51140we8
    /* renamed from: k */
    public final boolean mo6546k() {
        return false;
    }

    @VisibleForTesting
    /* renamed from: l */
    public final SQLiteDatabase m92002l() throws SQLiteException {
        if (this.f26799d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f26798c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f26799d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0248 A[SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m92001m(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor2;
        long j;
        String str;
        String[] strArr;
        zzlj zzljVar;
        zzac zzacVar;
        mo19953e();
        Cursor cursor3 = null;
        if (this.f26799d) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (m91998p()) {
            int i2 = 5;
            for (int i3 = 0; i3 < 5; i3++) {
                try {
                    SQLiteDatabase m92002l = m92002l();
                    try {
                        if (m92002l == null) {
                            this.f26799d = true;
                            return null;
                        }
                        m92002l.beginTransaction();
                        try {
                            try {
                                cursor2 = m92002l.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                try {
                                    long j2 = -1;
                                    if (cursor2.moveToFirst()) {
                                        j = cursor2.getLong(0);
                                        try {
                                            cursor2.close();
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            sQLiteDatabase2 = m92002l;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            sQLiteDatabase2 = m92002l;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                            this.f26799d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            sQLiteDatabase2 = m92002l;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                            this.f26799d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase2 = m92002l;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        cursor2.close();
                                        j = -1;
                                    }
                                    if (j != -1) {
                                        str = "rowid<?";
                                        strArr = new String[]{String.valueOf(j)};
                                    } else {
                                        str = null;
                                        strArr = null;
                                    }
                                    cursor = m92002l.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                    while (cursor.moveToNext()) {
                                        try {
                                            j2 = cursor.getLong(0);
                                            int i4 = cursor.getInt(1);
                                            byte[] blob = cursor.getBlob(2);
                                            if (i4 == 0) {
                                                Parcel obtain = Parcel.obtain();
                                                try {
                                                    obtain.unmarshall(blob, 0, blob.length);
                                                    obtain.setDataPosition(0);
                                                    zzaw createFromParcel = zzaw.CREATOR.createFromParcel(obtain);
                                                    obtain.recycle();
                                                    if (createFromParcel != null) {
                                                        arrayList.add(createFromParcel);
                                                    }
                                                } catch (SafeParcelReader.ParseException unused2) {
                                                    this.f100966a.mo22258a().m106893o().m42708a("Failed to load event from local database");
                                                    obtain.recycle();
                                                }
                                            } else if (i4 == 1) {
                                                Parcel obtain2 = Parcel.obtain();
                                                try {
                                                    obtain2.unmarshall(blob, 0, blob.length);
                                                    obtain2.setDataPosition(0);
                                                    zzljVar = zzlj.CREATOR.createFromParcel(obtain2);
                                                    obtain2.recycle();
                                                } catch (SafeParcelReader.ParseException unused3) {
                                                    this.f100966a.mo22258a().m106893o().m42708a("Failed to load user property from local database");
                                                    obtain2.recycle();
                                                    zzljVar = null;
                                                }
                                                if (zzljVar != null) {
                                                    arrayList.add(zzljVar);
                                                }
                                            } else if (i4 == 2) {
                                                Parcel obtain3 = Parcel.obtain();
                                                try {
                                                    obtain3.unmarshall(blob, 0, blob.length);
                                                    obtain3.setDataPosition(0);
                                                    zzacVar = zzac.CREATOR.createFromParcel(obtain3);
                                                    obtain3.recycle();
                                                } catch (SafeParcelReader.ParseException unused4) {
                                                    this.f100966a.mo22258a().m106893o().m42708a("Failed to load conditional user property from local database");
                                                    obtain3.recycle();
                                                    zzacVar = null;
                                                }
                                                if (zzacVar != null) {
                                                    arrayList.add(zzacVar);
                                                }
                                            } else if (i4 == 3) {
                                                this.f100966a.mo22258a().m106888t().m42708a("Skipping app launch break");
                                            } else {
                                                this.f100966a.mo22258a().m106893o().m42708a("Unknown record type in local database");
                                            }
                                        } catch (SQLiteDatabaseLockedException unused5) {
                                            sQLiteDatabase2 = m92002l;
                                        } catch (SQLiteFullException e3) {
                                            e = e3;
                                            sQLiteDatabase2 = m92002l;
                                        } catch (SQLiteException e4) {
                                            e = e4;
                                            sQLiteDatabase2 = m92002l;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteDatabase2 = m92002l;
                                        }
                                    }
                                    sQLiteDatabase2 = m92002l;
                                    try {
                                        if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                            this.f100966a.mo22258a().m106893o().m42708a("Fewer entries removed from local database than expected");
                                        }
                                        sQLiteDatabase2.setTransactionSuccessful();
                                        sQLiteDatabase2.endTransaction();
                                        cursor.close();
                                        sQLiteDatabase2.close();
                                        return arrayList;
                                    } catch (SQLiteDatabaseLockedException unused6) {
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                        this.f26799d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor3 = cursor;
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                        this.f26799d = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                    } catch (Throwable th4) {
                                        th = th4;
                                        cursor3 = cursor;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor3 != null) {
                                        }
                                        if (sQLiteDatabase != null) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    sQLiteDatabase2 = m92002l;
                                    if (cursor2 != null) {
                                        try {
                                            cursor2.close();
                                        } catch (SQLiteDatabaseLockedException unused7) {
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteFullException e7) {
                                            e = e7;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                            this.f26799d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (SQLiteException e8) {
                                            e = e8;
                                            cursor = null;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (sQLiteDatabase != null) {
                                            }
                                            this.f100966a.mo22258a().m106893o().m42707b("Error reading entries from local database", e);
                                            this.f26799d = true;
                                            if (cursor != null) {
                                            }
                                            if (sQLiteDatabase == null) {
                                            }
                                            sQLiteDatabase.close();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            sQLiteDatabase = sQLiteDatabase2;
                                            if (cursor3 != null) {
                                            }
                                            if (sQLiteDatabase != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                    throw th;
                                    break;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteDatabase2 = m92002l;
                                cursor2 = null;
                                if (cursor2 != null) {
                                }
                                throw th;
                                break;
                                break;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteDatabase2 = m92002l;
                        }
                    } catch (SQLiteDatabaseLockedException unused8) {
                        sQLiteDatabase2 = m92002l;
                    } catch (SQLiteFullException e9) {
                        e = e9;
                        sQLiteDatabase2 = m92002l;
                    } catch (SQLiteException e10) {
                        e = e10;
                        sQLiteDatabase2 = m92002l;
                    } catch (Throwable th9) {
                        th = th9;
                        sQLiteDatabase2 = m92002l;
                    }
                } catch (SQLiteDatabaseLockedException unused9) {
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteFullException e11) {
                    e = e11;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (SQLiteException e12) {
                    e = e12;
                    cursor = null;
                    sQLiteDatabase = null;
                } catch (Throwable th10) {
                    th = th10;
                    sQLiteDatabase = null;
                }
            }
            this.f100966a.mo22258a().m106888t().m42708a("Failed to read events from database in reasonable time");
            return null;
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void m92000n() {
        int delete;
        mo19953e();
        try {
            SQLiteDatabase m92002l = m92002l();
            if (m92002l != null && (delete = m92002l.delete("messages", null, null)) > 0) {
                this.f100966a.mo22258a().m106889s().m42707b("Reset local analytics data. records", Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: o */
    public final boolean m91999o() {
        return m91993u(3, new byte[0]);
    }

    @VisibleForTesting
    /* renamed from: p */
    public final boolean m91998p() {
        Context mo22255z = this.f100966a.mo22255z();
        this.f100966a.m89751w();
        return mo22255z.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: q */
    public final boolean m91997q() {
        mo19953e();
        if (!this.f26799d && m91998p()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m92002l = m92002l();
                    if (m92002l == null) {
                        this.f26799d = true;
                        return false;
                    }
                    m92002l.beginTransaction();
                    m92002l.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m92002l.setTransactionSuccessful();
                    m92002l.endTransaction();
                    m92002l.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.f100966a.mo22258a().m106893o().m42707b("Error deleting app launch break from local database", e);
                    this.f26799d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.f100966a.mo22258a().m106893o().m42707b("Error deleting app launch break from local database", e2);
                    this.f26799d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f100966a.mo22258a().m106888t().m42708a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: r */
    public final boolean m91996r(zzac zzacVar) {
        byte[] m92074e0 = this.f100966a.m89776N().m92074e0(zzacVar);
        if (m92074e0.length > 131072) {
            this.f100966a.mo22258a().m106891q().m42708a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m91993u(2, m92074e0);
    }

    /* renamed from: s */
    public final boolean m91995s(zzaw zzawVar) {
        Parcel obtain = Parcel.obtain();
        C46014nz7.m22032a(zzawVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f100966a.mo22258a().m106891q().m42708a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m91993u(0, marshall);
    }

    /* renamed from: t */
    public final boolean m91994t(zzlj zzljVar) {
        Parcel obtain = Parcel.obtain();
        C41578gW8.m39199a(zzljVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f100966a.mo22258a().m106891q().m42708a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m91993u(1, marshall);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m91993u(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor;
        mo19953e();
        ?? r2 = 0;
        if (this.f26799d) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.f100966a.m89751w();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            Cursor cursor2 = null;
            cursor2 = null;
            cursor2 = null;
            r8 = null;
            SQLiteDatabase sQLiteDatabase2 = null;
            try {
                sQLiteDatabase = m92002l();
                try {
                    if (sQLiteDatabase == null) {
                        this.f26799d = true;
                        return r2;
                    }
                    sQLiteDatabase.beginTransaction();
                    cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (cursor != null) {
                        try {
                            if (cursor.moveToFirst()) {
                                j = cursor.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            cursor2 = cursor;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase2 = sQLiteDatabase;
                            this.f100966a.mo22258a().m106893o().m42707b("Error writing entry; local database full", e);
                            this.f26799d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            if (sQLiteDatabase2 != null) {
                                try {
                                    if (sQLiteDatabase2.inTransaction()) {
                                        sQLiteDatabase2.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    cursor2 = cursor;
                                    if (cursor2 != null) {
                                    }
                                    if (sQLiteDatabase != null) {
                                    }
                                    throw th;
                                }
                            }
                            this.f100966a.mo22258a().m106893o().m42707b("Error writing entry to local database", e);
                            this.f26799d = true;
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabase2 == null) {
                                i2++;
                                r2 = 0;
                            }
                            sQLiteDatabase2.close();
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursor;
                            if (cursor2 != null) {
                            }
                            if (sQLiteDatabase != null) {
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.f100966a.mo22258a().m106893o().m42708a("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j2 = (100000 - j) + 1;
                        strArr[r2] = Long.toString(j2);
                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (delete != j2) {
                            this.f100966a.mo22258a().m106893o().m42705d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                        }
                    }
                    sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    if (cursor != 0) {
                        cursor.close();
                    }
                    sQLiteDatabase.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    cursor = null;
                } catch (SQLiteException e4) {
                    e = e4;
                    cursor = null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabase = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                cursor = null;
            } catch (SQLiteException e6) {
                e = e6;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabase = null;
                if (cursor2 != null) {
                }
                if (sQLiteDatabase != null) {
                }
                throw th;
            }
        }
        this.f100966a.mo22258a().m106889s().m42708a("Failed to write entry to local database");
        return false;
    }
}
