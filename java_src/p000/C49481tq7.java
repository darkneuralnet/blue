package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: tq7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C49481tq7 extends TR8 {

    /* renamed from: f */
    public static final String[] f111103f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f111104g = {AnalyticsRequestV2.HEADER_ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f111105h = {AnalyticsFields.APP_VERSION, "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};

    /* renamed from: i */
    public static final String[] f111106i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f111107j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f111108k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f111109l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f111110m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    public final C31989Bp7 f111111d;

    /* renamed from: e */
    public final C45091mR8 f111112e;

    public C49481tq7(C42162hV8 c42162hV8) {
        super(c42162hV8);
        this.f111112e = new C45091mR8(this.f100966a.mo22260A());
        this.f100966a.m89751w();
        this.f111111d = new C31989Bp7(this, this.f100966a.mo22255z(), "google_app_measurement.db");
    }

    /* renamed from: H */
    public static final void m11682H(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0227: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0227 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* renamed from: G */
    public final void m11683G(String str, long j, long j2, JU8 ju8) {
        ?? r4;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        int i;
        String str2;
        String[] strArr;
        Preconditions.checkNotNull(ju8);
        mo19953e();
        m83601f();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m11674P = m11674P();
                r4 = TextUtils.isEmpty(null);
                String str4 = "";
                try {
                    if (r4 != 0) {
                        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        String[] strArr2 = i2 != 0 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        if (i2 != 0) {
                            str4 = "rowid <= ? and ";
                        }
                        rawQuery = m11674P.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        String[] strArr3 = i3 != 0 ? new String[]{null, String.valueOf(j2)} : new String[]{null};
                        if (i3 != 0) {
                            str4 = " and rowid <= ?";
                        }
                        rawQuery = m11674P.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = m11674P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f100966a.mo22258a().m106893o().m42707b("Raw event metadata record is missing. appId", C32809Fc8.m106885w(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C32206Cn8 c32206Cn8 = (C32206Cn8) ((C47674qn8) DV8.m110342B(C32206Cn8.m111630S1(), query.getBlob(0))).m81476q();
                                    if (query.moveToNext()) {
                                        this.f100966a.mo22258a().m106888t().m42707b("Get multiple raw event metadata records, expected one. appId", C32809Fc8.m106885w(str3));
                                    }
                                    query.close();
                                    Preconditions.checkNotNull(c32206Cn8);
                                    ju8.f17696a = c32206Cn8;
                                    if (j2 != -1) {
                                        i = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str5, String.valueOf(j2)};
                                    } else {
                                        i = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str5};
                                    }
                                    Cursor query2 = m11674P.query("raw_events", new String[]{"rowid", "name", FraudDetectionData.KEY_TIMESTAMP, MessageExtension.FIELD_DATA}, str2, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j3 = query2.getLong(0);
                                            try {
                                                C39936dk8 c39936dk8 = (C39936dk8) DV8.m110342B(C47051pk8.m18861F(), query2.getBlob(3));
                                                c39936dk8.m43800I(query2.getString(i));
                                                c39936dk8.m43796O(query2.getLong(2));
                                                if (!ju8.m100321a(j3, (C47051pk8) c39936dk8.m81476q())) {
                                                    query2.close();
                                                    return;
                                                }
                                            } catch (IOException e) {
                                                this.f100966a.mo22258a().m106893o().m42706c("Data loss. Failed to merge raw event. appId", C32809Fc8.m106885w(str3), e);
                                            }
                                        } while (query2.moveToNext());
                                        query2.close();
                                        return;
                                    }
                                    this.f100966a.mo22258a().m106888t().m42707b("Raw event data disappeared while in transaction. appId", C32809Fc8.m106885w(str3));
                                    query2.close();
                                } catch (IOException e2) {
                                    this.f100966a.mo22258a().m106893o().m42706c("Data loss. Failed to merge raw event metadata. appId", C32809Fc8.m106885w(str3), e2);
                                    query.close();
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                r4 = str5;
                                this.f100966a.mo22258a().m106893o().m42706c("Data loss. Error selecting raw event. appId", C32809Fc8.m106885w(str3), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = str5;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            str5 = query;
                        } catch (Throwable th2) {
                            th = th2;
                            str5 = query;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        r4 = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e7) {
            e = e7;
            r4 = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* renamed from: I */
    public final long m11681I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m11674P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42706c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: J */
    public final int m11680J(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m83601f();
        try {
            return m11674P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42705d("Error deleting conditional property", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17330f(str2), e);
            return 0;
        }
    }

    /* renamed from: K */
    public final long m11679K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m11674P().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    cursor.close();
                    return j2;
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42706c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: L */
    public final long m11678L(String str, String str2) {
        long j;
        SQLiteException e;
        ContentValues contentValues;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        mo19953e();
        m83601f();
        SQLiteDatabase m11674P = m11674P();
        m11674P.beginTransaction();
        try {
            try {
                j = m11679K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (j == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (m11674P.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f100966a.mo22258a().m106893o().m42706c("Failed to insert column (got -1). appId", C32809Fc8.m106885w(str), "first_open_count");
                        return -1L;
                    }
                    j = 0;
                }
            } catch (SQLiteException e2) {
                j = 0;
                e = e2;
            }
            try {
                contentValues = new ContentValues();
                contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
                contentValues.put("first_open_count", Long.valueOf(1 + j));
            } catch (SQLiteException e3) {
                e = e3;
                this.f100966a.mo22258a().m106893o().m42705d("Error inserting column. appId", C32809Fc8.m106885w(str), "first_open_count", e);
                return j;
            }
            if (m11674P.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                this.f100966a.mo22258a().m106893o().m42706c("Failed to update column (got 0). appId", C32809Fc8.m106885w(str), "first_open_count");
                return -1L;
            }
            m11674P.setTransactionSuccessful();
            return j;
        } finally {
            m11674P.endTransaction();
        }
    }

    /* renamed from: M */
    public final long m11677M() {
        return m11679K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: N */
    public final long m11676N() {
        return m11679K("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: O */
    public final long m11675O(String str) {
        Preconditions.checkNotEmpty(str);
        return m11679K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    /* renamed from: P */
    public final SQLiteDatabase m11674P() {
        mo19953e();
        try {
            return this.f111111d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106888t().m42707b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle m11673Q(String str) {
        Cursor cursor;
        Cursor cursor2;
        mo19953e();
        m83601f();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m11674P().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursor.moveToFirst()) {
                        this.f100966a.mo22258a().m106889s().m42708a("Default event parameters not found");
                        cursor.close();
                        return null;
                    }
                    try {
                        C47051pk8 c47051pk8 = (C47051pk8) ((C39936dk8) DV8.m110342B(C47051pk8.m18861F(), cursor.getBlob(0))).m81476q();
                        this.f15489b.m36285g0();
                        List<C47061pl8> m18857J = c47051pk8.m18857J();
                        Bundle bundle = new Bundle();
                        for (C47061pl8 c47061pl8 : m18857J) {
                            String m18780H = c47061pl8.m18780H();
                            if (c47061pl8.m18767V()) {
                                bundle.putDouble(m18780H, c47061pl8.m18786B());
                            } else if (c47061pl8.m18766W()) {
                                bundle.putFloat(m18780H, c47061pl8.m18785C());
                            } else if (c47061pl8.m18763Z()) {
                                bundle.putString(m18780H, c47061pl8.m18779I());
                            } else if (c47061pl8.m18765X()) {
                                bundle.putLong(m18780H, c47061pl8.m18783E());
                            }
                        }
                        cursor.close();
                        return bundle;
                    } catch (IOException e) {
                        this.f100966a.mo22258a().m106893o().m42706c("Failed to retrieve default event parameters. appId", C32809Fc8.m106885w(str), e);
                        cursor.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f100966a.mo22258a().m106893o().m42707b("Error selecting default event parameters", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x023d: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:66:0x023d */
    /* JADX WARN: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0121 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0176 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0185 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a8 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d0 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f4 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0206 A[Catch: SQLiteException -> 0x021d, all -> 0x023c, TRY_LEAVE, TryCatch #1 {all -> 0x023c, blocks: (B:4:0x0065, B:8:0x006f, B:10:0x00d2, B:15:0x00dc, B:19:0x0126, B:21:0x0155, B:26:0x015f, B:30:0x017a, B:32:0x0185, B:33:0x0197, B:35:0x01a8, B:38:0x01bf, B:40:0x01d0, B:42:0x01d8, B:46:0x01e0, B:47:0x01e3, B:49:0x01f4, B:50:0x01fd, B:52:0x0206, B:37:0x01b6, B:29:0x0176, B:18:0x0121, B:61:0x0223), top: B:70:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0240  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47141pt8 m11672R(String str) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        long j;
        boolean z2;
        long j2;
        Preconditions.checkNotEmpty(str);
        mo19953e();
        m83601f();
        Cursor cursor3 = null;
        try {
            try {
                boolean z3 = true;
                cursor = m11674P().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", AnalyticsFields.APP_VERSION, "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    C47141pt8 c47141pt8 = new C47141pt8(this.f15489b.m36293c0(), str);
                    c47141pt8.m18473i(cursor.getString(0));
                    c47141pt8.m18452x(cursor.getString(1));
                    c47141pt8.m18509G(cursor.getString(2));
                    c47141pt8.m18513C(cursor.getLong(3));
                    c47141pt8.m18512D(cursor.getLong(4));
                    c47141pt8.m18514B(cursor.getLong(5));
                    c47141pt8.m18469k(cursor.getString(6));
                    c47141pt8.m18471j(cursor.getString(7));
                    c47141pt8.m18451y(cursor.getLong(8));
                    c47141pt8.m18456t(cursor.getLong(9));
                    if (!cursor.isNull(10) && cursor.getInt(10) == 0) {
                        z = false;
                        c47141pt8.m18511E(z);
                        c47141pt8.m18457s(cursor.getLong(11));
                        c47141pt8.m18459q(cursor.getLong(12));
                        c47141pt8.m18460p(cursor.getLong(13));
                        c47141pt8.m18463n(cursor.getLong(14));
                        c47141pt8.m18465m(cursor.getLong(15));
                        c47141pt8.m18454v(cursor.getLong(16));
                        if (!cursor.isNull(17)) {
                            j = -2147483648L;
                        } else {
                            j = cursor.getInt(17);
                        }
                        c47141pt8.m18467l(j);
                        c47141pt8.m18453w(cursor.getString(18));
                        c47141pt8.m18461o(cursor.getLong(19));
                        c47141pt8.m18458r(cursor.getLong(20));
                        c47141pt8.m18450z(cursor.getString(21));
                        if (!cursor.isNull(23) && cursor.getInt(23) == 0) {
                            z2 = false;
                            c47141pt8.m18475h(z2);
                            c47141pt8.m18477g(cursor.getString(24));
                            if (!cursor.isNull(25)) {
                                j2 = 0;
                            } else {
                                j2 = cursor.getLong(25);
                            }
                            c47141pt8.m18455u(j2);
                            if (!cursor.isNull(26)) {
                                c47141pt8.m18508H(Arrays.asList(cursor.getString(26).split(",", -1)));
                            }
                            C49423tk9.m11813b();
                            if (!this.f100966a.m89751w().m37502y(str, C37795a98.f49992q0) || this.f100966a.m89751w().m37502y(null, C37795a98.f49988o0)) {
                                c47141pt8.m18507I(cursor.getString(28));
                            }
                            Wl9.m77848b();
                            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49996s0)) {
                                if (cursor.isNull(29) || cursor.getInt(29) == 0) {
                                    z3 = false;
                                }
                                c47141pt8.m18506J(z3);
                            }
                            Yg9.m74465b();
                            if (this.f100966a.m89751w().m37502y(null, C37795a98.f49936G0)) {
                                c47141pt8.m18505K(cursor.getLong(30));
                            }
                            c47141pt8.m18481e();
                            if (cursor.moveToNext()) {
                                this.f100966a.mo22258a().m106893o().m42707b("Got multiple records for app, expected one. appId", C32809Fc8.m106885w(str));
                            }
                            cursor.close();
                            return c47141pt8;
                        }
                        z2 = true;
                        c47141pt8.m18475h(z2);
                        c47141pt8.m18477g(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                        }
                        c47141pt8.m18455u(j2);
                        if (!cursor.isNull(26)) {
                        }
                        C49423tk9.m11813b();
                        if (!this.f100966a.m89751w().m37502y(str, C37795a98.f49992q0)) {
                        }
                        c47141pt8.m18507I(cursor.getString(28));
                        Wl9.m77848b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49996s0)) {
                        }
                        Yg9.m74465b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49936G0)) {
                        }
                        c47141pt8.m18481e();
                        if (cursor.moveToNext()) {
                        }
                        cursor.close();
                        return c47141pt8;
                    }
                    z = true;
                    c47141pt8.m18511E(z);
                    c47141pt8.m18457s(cursor.getLong(11));
                    c47141pt8.m18459q(cursor.getLong(12));
                    c47141pt8.m18460p(cursor.getLong(13));
                    c47141pt8.m18463n(cursor.getLong(14));
                    c47141pt8.m18465m(cursor.getLong(15));
                    c47141pt8.m18454v(cursor.getLong(16));
                    if (!cursor.isNull(17)) {
                    }
                    c47141pt8.m18467l(j);
                    c47141pt8.m18453w(cursor.getString(18));
                    c47141pt8.m18461o(cursor.getLong(19));
                    c47141pt8.m18458r(cursor.getLong(20));
                    c47141pt8.m18450z(cursor.getString(21));
                    if (!cursor.isNull(23)) {
                        z2 = false;
                        c47141pt8.m18475h(z2);
                        c47141pt8.m18477g(cursor.getString(24));
                        if (!cursor.isNull(25)) {
                        }
                        c47141pt8.m18455u(j2);
                        if (!cursor.isNull(26)) {
                        }
                        C49423tk9.m11813b();
                        if (!this.f100966a.m89751w().m37502y(str, C37795a98.f49992q0)) {
                        }
                        c47141pt8.m18507I(cursor.getString(28));
                        Wl9.m77848b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49996s0)) {
                        }
                        Yg9.m74465b();
                        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49936G0)) {
                        }
                        c47141pt8.m18481e();
                        if (cursor.moveToNext()) {
                        }
                        cursor.close();
                        return c47141pt8;
                    }
                    z2 = true;
                    c47141pt8.m18475h(z2);
                    c47141pt8.m18477g(cursor.getString(24));
                    if (!cursor.isNull(25)) {
                    }
                    c47141pt8.m18455u(j2);
                    if (!cursor.isNull(26)) {
                    }
                    C49423tk9.m11813b();
                    if (!this.f100966a.m89751w().m37502y(str, C37795a98.f49992q0)) {
                    }
                    c47141pt8.m18507I(cursor.getString(28));
                    Wl9.m77848b();
                    if (this.f100966a.m89751w().m37502y(null, C37795a98.f49996s0)) {
                    }
                    Yg9.m74465b();
                    if (this.f100966a.m89751w().m37502y(null, C37795a98.f49936G0)) {
                    }
                    c47141pt8.m18481e();
                    if (cursor.moveToNext()) {
                    }
                    cursor.close();
                    return c47141pt8;
                } catch (SQLiteException e) {
                    e = e;
                    this.f100966a.mo22258a().m106893o().m42706c("Error querying app. appId", C32809Fc8.m106885w(str), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzac m11671S(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        boolean z;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m83601f();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m11674P().query("conditional_properties", new String[]{AnalyticsRequestV2.HEADER_ORIGIN, "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object m11665Y = m11665Y(cursor, 1);
                    if (cursor.getInt(2) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String string2 = cursor.getString(3);
                    long j = cursor.getLong(4);
                    DV8 m36285g0 = this.f15489b.m36285g0();
                    byte[] blob = cursor.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzlj(str2, cursor.getLong(8), m11665Y, str3), cursor.getLong(6), z, string2, (zzaw) m36285g0.m110315w(blob, creator), j, (zzaw) this.f15489b.m36285g0().m110315w(cursor.getBlob(7), creator), cursor.getLong(9), (zzaw) this.f15489b.m36285g0().m110315w(cursor.getBlob(10), creator));
                    if (cursor.moveToNext()) {
                        this.f100966a.mo22258a().m106893o().m42706c("Got multiple records for conditional property, expected one", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17330f(str2));
                    }
                    cursor.close();
                    return zzacVar;
                } catch (SQLiteException e) {
                    e = e;
                    this.f100966a.mo22258a().m106893o().m42705d("Error querying conditional property", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17330f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    /* renamed from: T */
    public final C34086Ko7 m11670T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m11669U(j, str, 1L, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C34086Ko7 m11669U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Preconditions.checkNotEmpty(str);
        mo19953e();
        m83601f();
        String[] strArr = {str};
        C34086Ko7 c34086Ko7 = new C34086Ko7();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m11674P = m11674P();
                Cursor query = m11674P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f100966a.mo22258a().m106888t().m42707b("Not updating daily counts, app is not known. appId", C32809Fc8.m106885w(str));
                    query.close();
                    return c34086Ko7;
                }
                if (query.getLong(0) == j) {
                    c34086Ko7.f20249b = query.getLong(1);
                    c34086Ko7.f20248a = query.getLong(2);
                    c34086Ko7.f20250c = query.getLong(3);
                    c34086Ko7.f20251d = query.getLong(4);
                    c34086Ko7.f20252e = query.getLong(5);
                }
                if (z) {
                    c34086Ko7.f20249b += j2;
                }
                if (z2) {
                    c34086Ko7.f20248a += j2;
                }
                if (z3) {
                    c34086Ko7.f20250c += j2;
                }
                if (z4) {
                    c34086Ko7.f20251d += j2;
                }
                if (z5) {
                    c34086Ko7.f20252e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c34086Ko7.f20248a));
                contentValues.put("daily_events_count", Long.valueOf(c34086Ko7.f20249b));
                contentValues.put("daily_conversions_count", Long.valueOf(c34086Ko7.f20250c));
                contentValues.put("daily_error_events_count", Long.valueOf(c34086Ko7.f20251d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c34086Ko7.f20252e));
                m11674P.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c34086Ko7;
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42706c("Error updating daily counts. appId", C32809Fc8.m106885w(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c34086Ko7;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47160pv7 m11668V(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        long j;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Boolean bool;
        long j2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m83601f();
        Cursor cursor3 = null;
        try {
            boolean z = false;
            Cursor query = m11674P().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                long j3 = query.getLong(0);
                long j4 = query.getLong(1);
                long j5 = query.getLong(2);
                if (query.isNull(3)) {
                    j = 0;
                } else {
                    j = query.getLong(3);
                }
                if (query.isNull(4)) {
                    valueOf = null;
                } else {
                    valueOf = Long.valueOf(query.getLong(4));
                }
                if (query.isNull(5)) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Long.valueOf(query.getLong(5));
                }
                if (query.isNull(6)) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Long.valueOf(query.getLong(6));
                }
                if (!query.isNull(7)) {
                    if (query.getLong(7) == 1) {
                        z = true;
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                if (query.isNull(8)) {
                    j2 = 0;
                } else {
                    j2 = query.getLong(8);
                }
                cursor2 = query;
                try {
                    C47160pv7 c47160pv7 = new C47160pv7(str, str2, j3, j4, j2, j5, j, valueOf, valueOf2, valueOf3, bool);
                    if (cursor2.moveToNext()) {
                        this.f100966a.mo22258a().m106893o().m42707b("Got multiple records for event aggregates, expected one. appId", C32809Fc8.m106885w(str));
                    }
                    cursor2.close();
                    return c47160pv7;
                } catch (SQLiteException e) {
                    e = e;
                    cursor = cursor2;
                    try {
                        this.f100966a.mo22258a().m106893o().m42705d("Error querying events. appId", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17332d(str2), e);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        cursor3 = cursor;
                        if (cursor3 != null) {
                            cursor3.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursor2 = query;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = query;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C47508qW8 m11666X(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m83601f();
        Cursor cursor3 = null;
        try {
            try {
                cursor = m11674P().query("user_attributes", new String[]{"set_timestamp", "value", AnalyticsRequestV2.HEADER_ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return null;
                    }
                    long j = cursor.getLong(0);
                    Object m11665Y = m11665Y(cursor, 1);
                    if (m11665Y == null) {
                        cursor.close();
                        return null;
                    }
                    C47508qW8 c47508qW8 = new C47508qW8(str, cursor.getString(2), str2, j, m11665Y);
                    if (cursor.moveToNext()) {
                        this.f100966a.mo22258a().m106893o().m42707b("Got multiple records for user property, expected one. appId", C32809Fc8.m106885w(str));
                    }
                    cursor.close();
                    return c47508qW8;
                } catch (SQLiteException e) {
                    e = e;
                    this.f100966a.mo22258a().m106893o().m42705d("Error querying user property. appId", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17330f(str2), e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
    }

    @VisibleForTesting
    /* renamed from: Y */
    public final Object m11665Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            this.f100966a.mo22258a().m106893o().m42707b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                            return null;
                        }
                        this.f100966a.mo22258a().m106893o().m42708a("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i);
                }
                return Double.valueOf(cursor.getDouble(i));
            }
            return Long.valueOf(cursor.getLong(i));
        }
        this.f100966a.mo22258a().m106893o().m42708a("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m11664Z() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase m11674P = m11674P();
        ?? r1 = 0;
        try {
            try {
                cursor = m11674P.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                    cursor.close();
                    return null;
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f100966a.mo22258a().m106893o().m42707b("Database error getting next bundle app id", e);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = m11674P;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
    }

    /* renamed from: a0 */
    public final List m11663a0(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo19953e();
        m83601f();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m11662b0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f100966a.mo22258a().m106893o();
        r27.f100966a.m89751w();
        r2.m42707b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m11662b0(String str, String[] strArr) {
        boolean z;
        mo19953e();
        m83601f();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m11674P = m11674P();
                String[] strArr2 = {PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, AnalyticsRequestV2.HEADER_ORIGIN, "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
                this.f100966a.m89751w();
                cursor = m11674P.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        int size = arrayList.size();
                        this.f100966a.m89751w();
                        if (size < 1000) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            String string3 = cursor.getString(2);
                            Object m11665Y = m11665Y(cursor, 3);
                            if (cursor.getInt(4) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String string4 = cursor.getString(5);
                            long j = cursor.getLong(6);
                            DV8 m36285g0 = this.f15489b.m36285g0();
                            byte[] blob = cursor.getBlob(7);
                            Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                            arrayList.add(new zzac(string, string2, new zzlj(string3, cursor.getLong(10), m11665Y, string2), cursor.getLong(8), z, string4, (zzaw) m36285g0.m110315w(blob, creator), j, (zzaw) this.f15489b.m36285g0().m110315w(cursor.getBlob(9), creator), cursor.getLong(11), (zzaw) this.f15489b.m36285g0().m110315w(cursor.getBlob(12), creator)));
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42707b("Error querying conditional user property value", e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c0 */
    public final List m11661c0(String str) {
        Preconditions.checkNotEmpty(str);
        mo19953e();
        m83601f();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f100966a.m89751w();
                cursor = m11674P().query("user_attributes", new String[]{"name", AnalyticsRequestV2.HEADER_ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str2 = string2;
                        long j = cursor.getLong(2);
                        Object m11665Y = m11665Y(cursor, 3);
                        if (m11665Y == null) {
                            this.f100966a.mo22258a().m106893o().m42707b("Read invalid user property value, ignoring it. appId", C32809Fc8.m106885w(str));
                        } else {
                            arrayList.add(new C47508qW8(str, str2, string, j, m11665Y));
                        }
                    } while (cursor.moveToNext());
                    cursor.close();
                    return arrayList;
                }
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42706c("Error querying user properties. appId", C32809Fc8.m106885w(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
        r0 = r17.f100966a.mo22258a().m106893o();
        r17.f100966a.m89751w();
        r0.m42707b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123 A[DONT_GENERATE] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m11660d0(String str, String str2, String str3) {
        String str4;
        Preconditions.checkNotEmpty(str);
        mo19953e();
        m83601f();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb = new StringBuilder("app_id=?");
                    if (!TextUtils.isEmpty(str2)) {
                        str4 = str2;
                        try {
                            arrayList2.add(str4);
                            sb.append(" and origin=?");
                        } catch (SQLiteException e) {
                            e = e;
                            this.f100966a.mo22258a().m106893o().m42705d("(2)Error querying user properties", C32809Fc8.m106885w(str), str4, e);
                            return Collections.emptyList();
                        }
                    } else {
                        str4 = str2;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + "*");
                        sb.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase m11674P = m11674P();
                    String[] strArr2 = {"name", "set_timestamp", "value", AnalyticsRequestV2.HEADER_ORIGIN};
                    String sb2 = sb.toString();
                    this.f100966a.m89751w();
                    cursor = m11674P.query("user_attributes", strArr2, sb2, strArr, null, null, "rowid", "1001");
                    if (!cursor.moveToFirst()) {
                        cursor.close();
                        return arrayList;
                    }
                    while (true) {
                        int size = arrayList.size();
                        this.f100966a.m89751w();
                        if (size < 1000) {
                            String string = cursor.getString(0);
                            long j = cursor.getLong(1);
                            Object m11665Y = m11665Y(cursor, 2);
                            str4 = cursor.getString(3);
                            if (m11665Y == null) {
                                this.f100966a.mo22258a().m106893o().m42705d("(2)Read invalid user property value, ignoring it", C32809Fc8.m106885w(str), str4, str3);
                            } else {
                                arrayList.add(new C47508qW8(str, str4, string, j, m11665Y));
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    cursor.close();
                    return arrayList;
                } catch (SQLiteException e2) {
                    e = e2;
                    str4 = str2;
                    this.f100966a.mo22258a().m106893o().m42705d("(2)Error querying user properties", C32809Fc8.m106885w(str), str4, e);
                    return Collections.emptyList();
                }
            } finally {
                if (0 != 0) {
                    cursor.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
        }
    }

    /* renamed from: e0 */
    public final void m11659e0() {
        m83601f();
        m11674P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void m11658f0() {
        m83601f();
        m11674P().endTransaction();
    }

    @VisibleForTesting
    /* renamed from: g0 */
    public final void m11657g0(List list) {
        mo19953e();
        m83601f();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (!m11646r()) {
            return;
        }
        String str = "(" + TextUtils.join(",", list) + ")";
        if (m11681I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
            this.f100966a.mo22258a().m106888t().m42708a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            m11674P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42707b("Error incrementing retry count. error", e);
        }
    }

    /* renamed from: h0 */
    public final void m11656h0() {
        mo19953e();
        m83601f();
        if (m11646r()) {
            long m564a = this.f15489b.m36289e0().f39035e.m564a();
            long elapsedRealtime = this.f100966a.mo22260A().elapsedRealtime();
            long abs = Math.abs(elapsedRealtime - m564a);
            this.f100966a.m89751w();
            if (abs > ((Long) C37795a98.f49923A.m97658a(null)).longValue()) {
                this.f15489b.m36289e0().f39035e.m563b(elapsedRealtime);
                mo19953e();
                m83601f();
                if (m11646r()) {
                    SQLiteDatabase m11674P = m11674P();
                    this.f100966a.m89751w();
                    int delete = m11674P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f100966a.mo22260A().currentTimeMillis()), String.valueOf(C41723gl7.m37521f())});
                    if (delete > 0) {
                        this.f100966a.mo22258a().m106889s().m42707b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // p000.TR8
    /* renamed from: i */
    public final boolean mo11655i() {
        return false;
    }

    /* renamed from: j */
    public final void m11654j(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo19953e();
        m83601f();
        try {
            m11674P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42705d("Error deleting user property. appId", C32809Fc8.m106885w(str), this.f100966a.m89786D().m17330f(str2), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0347, code lost:
        if (m11674P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0349, code lost:
        r23.f100966a.mo22258a().m106893o().m42707b("Failed to insert property filter (got -1). appId", p000.C32809Fc8.m106885w(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x035d, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0361, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0362, code lost:
        r23.f100966a.mo22258a().m106893o().m42706c("Error storing property filter. appId", p000.C32809Fc8.m106885w(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0375, code lost:
        m83601f();
        mo19953e();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        r0 = m11674P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x03ac, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017a, code lost:
        r11 = r0.m12972I().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0186, code lost:
        if (r11.hasNext() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0192, code lost:
        if (((p000.C50527vc8) r11.next()).m8340K() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0194, code lost:
        r23.f100966a.mo22258a().m106888t().m42706c("Property filter with no ID. Audience definition ignored. appId, audienceId", p000.C32809Fc8.m106885w(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ad, code lost:
        r11 = r0.m12973H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c3, code lost:
        if (r11.hasNext() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01c5, code lost:
        r12 = (p000.Y98) r11.next();
        m83601f();
        mo19953e();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01df, code lost:
        if (r12.m75488H().isEmpty() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01e1, code lost:
        r0 = r23.f100966a.mo22258a().m106888t();
        r9 = p000.C32809Fc8.m106885w(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01f9, code lost:
        if (r12.m75480Q() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fb, code lost:
        r20 = java.lang.Integer.valueOf(r12.m75493C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0206, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0208, code lost:
        r0.m42705d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r9, r11, java.lang.String.valueOf(r20));
        r21 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0213, code lost:
        r3 = r12.m88653c();
        r21 = r7;
        r7 = new android.content.ContentValues();
        r7.put(com.stripe.android.model.PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, r24);
        r7.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x022c, code lost:
        if (r12.m75480Q() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x022e, code lost:
        r9 = java.lang.Integer.valueOf(r12.m75493C());
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0237, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0238, code lost:
        r7.put("filter_id", r9);
        r7.put(com.stripe.android.core.networking.AnalyticsRequestV2.PARAM_EVENT_NAME, r12.m75488H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0248, code lost:
        if (r12.m75479R() == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024a, code lost:
        r9 = java.lang.Boolean.valueOf(r12.m75482O());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0253, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0254, code lost:
        r7.put("session_scoped", r9);
        r7.put(com.stripe.android.stripe3ds2.transactions.MessageExtension.FIELD_DATA, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0268, code lost:
        if (m11674P().insertWithOnConflict("event_filters", null, r7, 5) != (-1)) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x026a, code lost:
        r23.f100966a.mo22258a().m106893o().m42707b("Failed to insert event filter (got -1). appId", p000.C32809Fc8.m106885w(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027d, code lost:
        r7 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0284, code lost:
        r23.f100966a.mo22258a().m106893o().m42706c("Error storing event filter. appId", p000.C32809Fc8.m106885w(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0299, code lost:
        r21 = r7;
        r0 = r0.m12972I().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02a7, code lost:
        if (r0.hasNext() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a9, code lost:
        r3 = (p000.C50527vc8) r0.next();
        m83601f();
        mo19953e();
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r24);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02c3, code lost:
        if (r3.m8345F().isEmpty() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02c5, code lost:
        r0 = r23.f100966a.mo22258a().m106888t();
        r8 = p000.C32809Fc8.m106885w(r24);
        r9 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02dd, code lost:
        if (r3.m8340K() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02df, code lost:
        r3 = java.lang.Integer.valueOf(r3.m8349B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02e8, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02e9, code lost:
        r0.m42705d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r9, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f2, code lost:
        r7 = r3.m88653c();
        r11 = new android.content.ContentValues();
        r11.put(com.stripe.android.model.PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0309, code lost:
        if (r3.m8340K() == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x030b, code lost:
        r12 = java.lang.Integer.valueOf(r3.m8349B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0314, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0315, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.m8345F());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0327, code lost:
        if (r3.m8339M() == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0329, code lost:
        r0 = java.lang.Boolean.valueOf(r3.m8341J());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0332, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0333, code lost:
        r11.put("session_scoped", r0);
        r11.put(com.stripe.android.stripe3ds2.transactions.MessageExtension.FIELD_DATA, r7);
     */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m11653k(String str, List list) {
        Integer num;
        boolean z;
        String str2 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i = 0;
        while (i < list.size()) {
            C39592d98 c39592d98 = (C39592d98) ((C49078t98) list.get(i)).m19208j();
            if (c39592d98.m44568y() != 0) {
                int i2 = 0;
                while (i2 < c39592d98.m44568y()) {
                    I98 i98 = (I98) c39592d98.m44570C(i2).m19208j();
                    I98 i982 = (I98) i98.mo81483h();
                    String m42393b = C40628eu8.m42393b(i98.m102846C());
                    if (m42393b != null) {
                        i982.m102844z(m42393b);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i3 = 0;
                    while (i3 < i98.m102845y()) {
                        C32323Da8 m102847B = i98.m102847B(i3);
                        I98 i983 = i98;
                        String str3 = str2;
                        String m30954b = C43195jE8.m30954b(m102847B.m110141F(), C48337ru8.f107886a, C48337ru8.f107887b);
                        if (m30954b != null) {
                            C46358oa8 c46358oa8 = (C46358oa8) m102847B.m19208j();
                            c46358oa8.m20825y(m30954b);
                            i982.m102848A(i3, (C32323Da8) c46358oa8.m81476q());
                            z = true;
                        }
                        i3++;
                        i98 = i983;
                        str2 = str3;
                    }
                    String str4 = str2;
                    if (z) {
                        c39592d98.m44572A(i2, i982);
                        list.set(i, (C49078t98) c39592d98.m81476q());
                    }
                    i2++;
                    str2 = str4;
                }
            }
            String str5 = str2;
            if (c39592d98.m44567z() != 0) {
                for (int i4 = 0; i4 < c39592d98.m44567z(); i4++) {
                    C50527vc8 m44569D = c39592d98.m44569D(i4);
                    String m30954b2 = C43195jE8.m30954b(m44569D.m8345F(), C32971Fu8.f10510a, C32971Fu8.f10511b);
                    if (m30954b2 != null) {
                        C41634gc8 c41634gc8 = (C41634gc8) m44569D.m19208j();
                        c41634gc8.m37972y(m30954b2);
                        c39592d98.m44571B(i4, c41634gc8);
                        list.set(i, (C49078t98) c39592d98.m81476q());
                    }
                }
            }
            i++;
            str2 = str5;
        }
        String str6 = str2;
        m83601f();
        mo19953e();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase m11674P = m11674P();
        m11674P.beginTransaction();
        try {
            m83601f();
            mo19953e();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase m11674P2 = m11674P();
            m11674P2.delete("property_filters", "app_id=?", new String[]{str});
            m11674P2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C49078t98 c49078t98 = (C49078t98) it.next();
                m83601f();
                mo19953e();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(c49078t98);
                if (!c49078t98.m12969M()) {
                    this.f100966a.mo22258a().m106888t().m42707b("Audience with no ID. appId", C32809Fc8.m106885w(str));
                } else {
                    int m12979B = c49078t98.m12979B();
                    Iterator it2 = c49078t98.m12973H().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (!((Y98) it2.next()).m75480Q()) {
                                this.f100966a.mo22258a().m106888t().m42706c("Event filter with no ID. Audience definition ignored. appId, audienceId", C32809Fc8.m106885w(str), Integer.valueOf(m12979B));
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C49078t98 c49078t982 = (C49078t98) it3.next();
                if (c49078t982.m12969M()) {
                    num = Integer.valueOf(c49078t982.m12979B());
                } else {
                    num = null;
                }
                arrayList.add(num);
            }
            Preconditions.checkNotEmpty(str);
            m83601f();
            mo19953e();
            SQLiteDatabase m11674P3 = m11674P();
            try {
                long m11681I = m11681I("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int max = Math.max(0, Math.min((int) CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, this.f100966a.m89751w().m37515l(str, C37795a98.f49937H)));
                if (m11681I > max) {
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList.size()) {
                            Integer num2 = (Integer) arrayList.get(i5);
                            if (num2 == null) {
                                break;
                            }
                            arrayList2.add(Integer.toString(num2.intValue()));
                            i5++;
                        } else {
                            m11674P3.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList2) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                this.f100966a.mo22258a().m106893o().m42706c("Database error querying filters. appId", C32809Fc8.m106885w(str), e);
            }
            m11674P.setTransactionSuccessful();
        } finally {
            m11674P.endTransaction();
        }
    }

    /* renamed from: l */
    public final void m11652l() {
        m83601f();
        m11674P().setTransactionSuccessful();
    }

    /* renamed from: m */
    public final void m11651m(C47141pt8 c47141pt8) {
        Preconditions.checkNotNull(c47141pt8);
        mo19953e();
        m83601f();
        String m18472i0 = c47141pt8.m18472i0();
        Preconditions.checkNotNull(m18472i0);
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, m18472i0);
        contentValues.put("app_instance_id", c47141pt8.m18470j0());
        contentValues.put("gmp_app_id", c47141pt8.m18462n0());
        contentValues.put("resettable_device_id_hash", c47141pt8.m18487b());
        contentValues.put("last_bundle_index", Long.valueOf(c47141pt8.m18484c0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c47141pt8.m18482d0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c47141pt8.m18486b0()));
        contentValues.put(AnalyticsFields.APP_VERSION, c47141pt8.m18466l0());
        contentValues.put("app_store", c47141pt8.m18468k0());
        contentValues.put("gmp_version", Long.valueOf(c47141pt8.m18488a0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c47141pt8.m18492X()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c47141pt8.m18503M()));
        contentValues.put("day", Long.valueOf(c47141pt8.m18493W()));
        contentValues.put("daily_public_events_count", Long.valueOf(c47141pt8.m18495U()));
        contentValues.put("daily_events_count", Long.valueOf(c47141pt8.m18496T()));
        contentValues.put("daily_conversions_count", Long.valueOf(c47141pt8.m18498R()));
        contentValues.put("config_fetched_time", Long.valueOf(c47141pt8.m18499Q()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c47141pt8.m18490Z()));
        contentValues.put("app_version_int", Long.valueOf(c47141pt8.m18500P()));
        contentValues.put("firebase_instance_id", c47141pt8.m18464m0());
        contentValues.put("daily_error_events_count", Long.valueOf(c47141pt8.m18497S()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c47141pt8.m18494V()));
        contentValues.put("health_monitor_sample", c47141pt8.m18489a());
        c47141pt8.m18515A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c47141pt8.m18504L()));
        contentValues.put("admob_app_id", c47141pt8.m18476g0());
        contentValues.put("dynamite_version", Long.valueOf(c47141pt8.m18491Y()));
        contentValues.put("session_stitching_token", c47141pt8.m18485c());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c47141pt8.m18501O()));
        contentValues.put("target_os_version", Long.valueOf(c47141pt8.m18480e0()));
        List m18483d = c47141pt8.m18483d();
        if (m18483d != null) {
            if (m18483d.isEmpty()) {
                this.f100966a.mo22258a().m106888t().m42707b("Safelisted events should not be an empty list. appId", m18472i0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m18483d));
            }
        }
        Nb9.m93712b();
        if (this.f100966a.m89751w().m37502y(null, C37795a98.f49984m0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m11674P = m11674P();
            if (m11674P.update("apps", contentValues, "app_id = ?", new String[]{m18472i0}) == 0 && m11674P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to insert/update app (got -1). appId", C32809Fc8.m106885w(m18472i0));
            }
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42706c("Error storing app. appId", C32809Fc8.m106885w(m18472i0), e);
        }
    }

    /* renamed from: n */
    public final void m11650n(C47160pv7 c47160pv7) {
        Long l;
        Preconditions.checkNotNull(c47160pv7);
        mo19953e();
        m83601f();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, c47160pv7.f104324a);
        contentValues.put("name", c47160pv7.f104325b);
        contentValues.put("lifetime_count", Long.valueOf(c47160pv7.f104326c));
        contentValues.put("current_bundle_count", Long.valueOf(c47160pv7.f104327d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c47160pv7.f104329f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c47160pv7.f104330g));
        contentValues.put("last_bundled_day", c47160pv7.f104331h);
        contentValues.put("last_sampled_complex_event_id", c47160pv7.f104332i);
        contentValues.put("last_sampling_rate", c47160pv7.f104333j);
        contentValues.put("current_session_count", Long.valueOf(c47160pv7.f104328e));
        Boolean bool = c47160pv7.f104334k;
        if (bool != null && bool.booleanValue()) {
            l = 1L;
        } else {
            l = null;
        }
        contentValues.put("last_exempt_from_sampling", l);
        try {
            if (m11674P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to insert/update event aggregates (got -1). appId", C32809Fc8.m106885w(c47160pv7.f104324a));
            }
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42706c("Error storing event aggregates. appId", C32809Fc8.m106885w(c47160pv7.f104324a), e);
        }
    }

    /* renamed from: o */
    public final boolean m11649o() {
        if (m11681I("select count(1) > 0 from raw_events", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final boolean m11648p() {
        if (m11681I("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    public final boolean m11647q() {
        if (m11681I("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    /* renamed from: r */
    public final boolean m11646r() {
        Context mo22255z = this.f100966a.mo22255z();
        this.f100966a.m89751w();
        return mo22255z.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: s */
    public final boolean m11645s(String str, Long l, long j, C47051pk8 c47051pk8) {
        mo19953e();
        m83601f();
        Preconditions.checkNotNull(c47051pk8);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l);
        byte[] m88653c = c47051pk8.m88653c();
        this.f100966a.mo22258a().m106889s().m42706c("Saving complex main event, appId, data size", this.f100966a.m89786D().m17332d(str), Integer.valueOf(m88653c.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
        contentValues.put(AnalyticsRequestV2.PARAM_EVENT_ID, l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", m88653c);
        try {
            if (m11674P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to insert complex main event (got -1). appId", C32809Fc8.m106885w(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42706c("Error storing complex main event. appId", C32809Fc8.m106885w(str), e);
            return false;
        }
    }

    /* renamed from: t */
    public final boolean m11644t(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        mo19953e();
        m83601f();
        String str = zzacVar.f71517b;
        Preconditions.checkNotNull(str);
        if (m11666X(str, zzacVar.f71519d.f71534c) == null) {
            long m11681I = m11681I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f100966a.m89751w();
            if (m11681I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
        contentValues.put(AnalyticsRequestV2.HEADER_ORIGIN, zzacVar.f71518c);
        contentValues.put("name", zzacVar.f71519d.f71534c);
        m11682H(contentValues, "value", Preconditions.checkNotNull(zzacVar.f71519d.m50581s()));
        contentValues.put("active", Boolean.valueOf(zzacVar.f71521f));
        contentValues.put("trigger_event_name", zzacVar.f71522g);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f71524i));
        contentValues.put("timed_out_event", this.f100966a.m89776N().m92074e0(zzacVar.f71523h));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f71520e));
        contentValues.put("triggered_event", this.f100966a.m89776N().m92074e0(zzacVar.f71525j));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.f71519d.f71535d));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f71526k));
        contentValues.put("expired_event", this.f100966a.m89776N().m92074e0(zzacVar.f71527l));
        try {
            if (m11674P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to insert/update conditional user property (got -1)", C32809Fc8.m106885w(str));
            }
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42706c("Error storing conditional user property", C32809Fc8.m106885w(str), e);
        }
        return true;
    }

    /* renamed from: u */
    public final boolean m11643u(C47508qW8 c47508qW8) {
        Preconditions.checkNotNull(c47508qW8);
        mo19953e();
        m83601f();
        if (m11666X(c47508qW8.f105371a, c47508qW8.f105373c) == null) {
            if (OW8.m92079Z(c47508qW8.f105373c)) {
                if (m11681I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c47508qW8.f105371a}) >= this.f100966a.m89751w().m37514m(c47508qW8.f105371a, C37795a98.f49939I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c47508qW8.f105373c)) {
                long m11681I = m11681I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c47508qW8.f105371a, c47508qW8.f105372b});
                this.f100966a.m89751w();
                if (m11681I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, c47508qW8.f105371a);
        contentValues.put(AnalyticsRequestV2.HEADER_ORIGIN, c47508qW8.f105372b);
        contentValues.put("name", c47508qW8.f105373c);
        contentValues.put("set_timestamp", Long.valueOf(c47508qW8.f105374d));
        m11682H(contentValues, "value", c47508qW8.f105375e);
        try {
            if (m11674P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f100966a.mo22258a().m106893o().m42707b("Failed to insert/update user property (got -1). appId", C32809Fc8.m106885w(c47508qW8.f105371a));
            }
        } catch (SQLiteException e) {
            this.f100966a.mo22258a().m106893o().m42706c("Error storing user property. appId", C32809Fc8.m106885w(c47508qW8.f105371a), e);
        }
        return true;
    }
}
