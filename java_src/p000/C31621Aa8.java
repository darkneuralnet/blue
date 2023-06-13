package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* renamed from: Aa8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31621Aa8 extends SQLiteOpenHelper {

    /* renamed from: b */
    public final /* synthetic */ C34897Oa8 f827b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31621Aa8(C34897Oa8 c34897Oa8, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f827b = c34897Oa8;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() throws SQLiteException {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e) {
            throw e;
        } catch (SQLiteException unused) {
            this.f827b.f100966a.mo22258a().m106893o().m42708a("Opening the local database failed, dropping and recreating it");
            this.f827b.f100966a.m89751w();
            if (!this.f827b.f100966a.mo22255z().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f827b.f100966a.mo22258a().m106893o().m42707b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e2) {
                this.f827b.f100966a.mo22258a().m106893o().m42707b("Failed to open local database. Events will bypass local storage", e2);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C44748lr7.m26732b(this.f827b.f100966a.mo22258a(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        C44748lr7.m26733a(this.f827b.f100966a.mo22258a(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
