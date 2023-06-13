package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
/* renamed from: Rm5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35704Rm5 extends SQLiteOpenHelper {

    /* renamed from: d */
    public static final String f32594d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: e */
    public static int f32595e = 5;

    /* renamed from: f */
    public static final InterfaceC7274a f32596f;

    /* renamed from: g */
    public static final InterfaceC7274a f32597g;

    /* renamed from: h */
    public static final InterfaceC7274a f32598h;

    /* renamed from: i */
    public static final InterfaceC7274a f32599i;

    /* renamed from: j */
    public static final InterfaceC7274a f32600j;

    /* renamed from: k */
    public static final List<InterfaceC7274a> f32601k;

    /* renamed from: b */
    public final int f32602b;

    /* renamed from: c */
    public boolean f32603c;

    /* renamed from: Rm5$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC7274a {
        /* renamed from: a */
        void mo86307a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        InterfaceC7274a interfaceC7274a = new InterfaceC7274a() { // from class: Mm5
            @Override // p000.C35704Rm5.InterfaceC7274a
            /* renamed from: a */
            public final void mo86307a(SQLiteDatabase sQLiteDatabase) {
                C35704Rm5.m86314i(sQLiteDatabase);
            }
        };
        f32596f = interfaceC7274a;
        InterfaceC7274a interfaceC7274a2 = new InterfaceC7274a() { // from class: Nm5
            @Override // p000.C35704Rm5.InterfaceC7274a
            /* renamed from: a */
            public final void mo86307a(SQLiteDatabase sQLiteDatabase) {
                C35704Rm5.m86313k(sQLiteDatabase);
            }
        };
        f32597g = interfaceC7274a2;
        InterfaceC7274a interfaceC7274a3 = new InterfaceC7274a() { // from class: Om5
            @Override // p000.C35704Rm5.InterfaceC7274a
            /* renamed from: a */
            public final void mo86307a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f32598h = interfaceC7274a3;
        InterfaceC7274a interfaceC7274a4 = new InterfaceC7274a() { // from class: Pm5
            @Override // p000.C35704Rm5.InterfaceC7274a
            /* renamed from: a */
            public final void mo86307a(SQLiteDatabase sQLiteDatabase) {
                C35704Rm5.m86311m(sQLiteDatabase);
            }
        };
        f32599i = interfaceC7274a4;
        InterfaceC7274a interfaceC7274a5 = new InterfaceC7274a() { // from class: Qm5
            @Override // p000.C35704Rm5.InterfaceC7274a
            /* renamed from: a */
            public final void mo86307a(SQLiteDatabase sQLiteDatabase) {
                C35704Rm5.m86310n(sQLiteDatabase);
            }
        };
        f32600j = interfaceC7274a5;
        f32601k = Arrays.asList(interfaceC7274a, interfaceC7274a2, interfaceC7274a3, interfaceC7274a4, interfaceC7274a5);
    }

    public C35704Rm5(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f32603c = false;
        this.f32602b = i;
    }

    /* renamed from: i */
    public static /* synthetic */ void m86314i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: k */
    public static /* synthetic */ void m86313k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: m */
    public static /* synthetic */ void m86311m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: n */
    public static /* synthetic */ void m86310n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f32594d);
    }

    /* renamed from: g */
    public final void m86315g(SQLiteDatabase sQLiteDatabase) {
        if (!this.f32603c) {
            onConfigure(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f32603c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m86309p(sQLiteDatabase, this.f32602b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m86309p(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m86315g(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m86315g(sQLiteDatabase);
        m86308q(sQLiteDatabase, i, i2);
    }

    /* renamed from: p */
    public final void m86309p(SQLiteDatabase sQLiteDatabase, int i) {
        m86315g(sQLiteDatabase);
        m86308q(sQLiteDatabase, 0, i);
    }

    /* renamed from: q */
    public final void m86308q(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC7274a> list = f32601k;
        if (i2 <= list.size()) {
            while (i < i2) {
                f32601k.get(i).mo86307a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
