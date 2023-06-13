package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* renamed from: Bp7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31989Bp7 extends SQLiteOpenHelper {

    /* renamed from: b */
    public final /* synthetic */ C49481tq7 f2937b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31989Bp7(C49481tq7 c49481tq7, Context context, String str) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f2937b = c49481tq7;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        C45091mR8 c45091mR8;
        C45091mR8 c45091mR82;
        C45091mR8 c45091mR83;
        C49481tq7 c49481tq7 = this.f2937b;
        c45091mR8 = c49481tq7.f111112e;
        c49481tq7.f100966a.m89751w();
        if (c45091mR8.m25614c(CoreConstants.MILLIS_IN_ONE_HOUR)) {
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                c45091mR82 = this.f2937b.f111112e;
                c45091mR82.m25615b();
                this.f2937b.f100966a.mo22258a().m106893o().m42708a("Opening the database failed, dropping and recreating it");
                this.f2937b.f100966a.m89751w();
                if (!this.f2937b.f100966a.mo22255z().getDatabasePath("google_app_measurement.db").delete()) {
                    this.f2937b.f100966a.mo22258a().m106893o().m42707b("Failed to delete corrupted db file", "google_app_measurement.db");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    c45091mR83 = this.f2937b.f111112e;
                    c45091mR83.m25616a();
                    return writableDatabase;
                } catch (SQLiteException e) {
                    this.f2937b.f100966a.mo22258a().m106893o().m42707b("Failed to open freshly created database", e);
                    throw e;
                }
            }
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C44748lr7.m26732b(this.f2937b.f100966a.mo22258a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String[] strArr5;
        String[] strArr6;
        String[] strArr7;
        String[] strArr8;
        C32809Fc8 mo22258a = this.f2937b.f100966a.mo22258a();
        strArr = C49481tq7.f111103f;
        C44748lr7.m26733a(mo22258a, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", strArr);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C32809Fc8 mo22258a2 = this.f2937b.f100966a.mo22258a();
        strArr2 = C49481tq7.f111104g;
        C44748lr7.m26733a(mo22258a2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", strArr2);
        C32809Fc8 mo22258a3 = this.f2937b.f100966a.mo22258a();
        strArr3 = C49481tq7.f111105h;
        C44748lr7.m26733a(mo22258a3, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", strArr3);
        C32809Fc8 mo22258a4 = this.f2937b.f100966a.mo22258a();
        strArr4 = C49481tq7.f111107j;
        C44748lr7.m26733a(mo22258a4, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", strArr4);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C32809Fc8 mo22258a5 = this.f2937b.f100966a.mo22258a();
        strArr5 = C49481tq7.f111106i;
        C44748lr7.m26733a(mo22258a5, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", strArr5);
        C32809Fc8 mo22258a6 = this.f2937b.f100966a.mo22258a();
        strArr6 = C49481tq7.f111108k;
        C44748lr7.m26733a(mo22258a6, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", strArr6);
        C32809Fc8 mo22258a7 = this.f2937b.f100966a.mo22258a();
        strArr7 = C49481tq7.f111109l;
        C44748lr7.m26733a(mo22258a7, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", strArr7);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C32809Fc8 mo22258a8 = this.f2937b.f100966a.mo22258a();
        strArr8 = C49481tq7.f111110m;
        C44748lr7.m26733a(mo22258a8, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", strArr8);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C44748lr7.m26733a(this.f2937b.f100966a.mo22258a(), sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
