package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p000.AbstractC33774Jg1;
import p000.BX5;
import p000.C33809Jk0;
import p000.C46582ox2;
/* renamed from: Zg5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C37522Zg5 implements InterfaceC35412Qg1, BX5, InterfaceC33107Gk0 {

    /* renamed from: g */
    public static final C35142Pc1 f48940g = C35142Pc1.m90060b("proto");

    /* renamed from: b */
    public final C35704Rm5 f48941b;

    /* renamed from: c */
    public final InterfaceC38734bl0 f48942c;

    /* renamed from: d */
    public final InterfaceC38734bl0 f48943d;

    /* renamed from: e */
    public final AbstractC35646Rg1 f48944e;

    /* renamed from: f */
    public final Y94<String> f48945f;

    /* renamed from: Zg5$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC10328b<T, U> {
        U apply(T t);
    }

    /* renamed from: Zg5$c */
    /* loaded from: classes5.dex */
    public static class C10329c {

        /* renamed from: a */
        public final String f48946a;

        /* renamed from: b */
        public final String f48947b;

        public C10329c(String str, String str2) {
            this.f48946a = str;
            this.f48947b = str2;
        }
    }

    /* renamed from: Zg5$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC10330d<T> {
        /* renamed from: a */
        T mo72692a();
    }

    public C37522Zg5(InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, AbstractC35646Rg1 abstractC35646Rg1, C35704Rm5 c35704Rm5, Y94<String> y94) {
        this.f48941b = c35704Rm5;
        this.f48942c = interfaceC38734bl0;
        this.f48943d = interfaceC38734bl02;
        this.f48944e = abstractC35646Rg1;
        this.f48945f = y94;
    }

    /* renamed from: B0 */
    public static /* synthetic */ byte[] m72775B0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C0 */
    public /* synthetic */ Object m72773C0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo72731d(i, C46582ox2.EnumC27110b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D0 */
    public /* synthetic */ Object m72771D0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m72738Z0(sQLiteDatabase.rawQuery(str2, null), new InterfaceC10328b() { // from class: Eg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72773C0;
                m72773C0 = C37522Zg5.this.m72773C0((Cursor) obj);
                return m72773C0;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* renamed from: E0 */
    public static /* synthetic */ Boolean m72768E0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* renamed from: H0 */
    public static /* synthetic */ Object m72763H0(String str, C46582ox2.EnumC27110b enumC27110b, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m72738Z0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC27110b.getNumber())}), new InterfaceC10328b() { // from class: Dg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Boolean m72768E0;
                m72768E0 = C37522Zg5.m72768E0((Cursor) obj);
                return m72768E0;
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC27110b.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC27110b.getNumber())});
        }
        return null;
    }

    /* renamed from: I0 */
    public static /* synthetic */ Object m72761I0(long j, T96 t96, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{t96.mo16804b(), String.valueOf(R24.m87395a(t96.mo16802d()))}) < 1) {
            contentValues.put("backend_name", t96.mo16804b());
            contentValues.put("priority", Integer.valueOf(R24.m87395a(t96.mo16802d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J0 */
    public /* synthetic */ Object m72760J0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f48942c.mo64040a()).execute();
        return null;
    }

    /* renamed from: P0 */
    public static byte[] m72752P0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: W0 */
    public static C35142Pc1 m72741W0(String str) {
        if (str == null) {
            return f48940g;
        }
        return C35142Pc1.m90060b(str);
    }

    /* renamed from: Y0 */
    public static String m72739Y0(Iterable<AbstractC43900kR3> iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator<AbstractC43900kR3> it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo28960c());
            if (it.hasNext()) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    /* renamed from: Z0 */
    public static <T> T m72738Z0(Cursor cursor, InterfaceC10328b<Cursor, T> interfaceC10328b) {
        try {
            return interfaceC10328b.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ Object m72732c0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo72731d(i, C46582ox2.EnumC27110b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ Integer m72729f0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m72738Z0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC10328b() { // from class: Pg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72732c0;
                m72732c0 = C37522Zg5.this.m72732c0((Cursor) obj);
                return m72732c0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* renamed from: i0 */
    public static /* synthetic */ Object m72725i0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th);
    }

    /* renamed from: j0 */
    public static /* synthetic */ SQLiteDatabase m72724j0(Throwable th) {
        throw new SynchronizationException("Timed out while trying to open db.", th);
    }

    /* renamed from: k0 */
    public static /* synthetic */ Long m72722k0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* renamed from: l0 */
    public static /* synthetic */ C47248q46 m72720l0(long j, Cursor cursor) {
        cursor.moveToNext();
        return C47248q46.m18237c().m18234c(cursor.getLong(0)).m18235b(j).m18236a();
    }

    /* renamed from: m0 */
    public static /* synthetic */ C47248q46 m72718m0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C47248q46) m72738Z0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC10328b() { // from class: Qg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                C47248q46 m72720l0;
                m72720l0 = C37522Zg5.m72720l0(j, (Cursor) obj);
                return m72720l0;
            }
        });
    }

    /* renamed from: n0 */
    public static /* synthetic */ Long m72716n0(Cursor cursor) {
        if (!cursor.moveToNext()) {
            return null;
        }
        return Long.valueOf(cursor.getLong(0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ Boolean m72715o0(T96 t96, SQLiteDatabase sQLiteDatabase) {
        Long m72742W = m72742W(sQLiteDatabase, t96);
        if (m72742W == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m72738Z0(m72751Q().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m72742W.toString()}), new InterfaceC10328b() { // from class: Gg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    /* renamed from: p0 */
    public static /* synthetic */ List m72713p0(SQLiteDatabase sQLiteDatabase) {
        return (List) m72738Z0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new InterfaceC10328b() { // from class: Mg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                List m72708r0;
                m72708r0 = C37522Zg5.m72708r0((Cursor) obj);
                return m72708r0;
            }
        });
    }

    /* renamed from: r0 */
    public static /* synthetic */ List m72708r0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(T96.m84269a().mo16800b(cursor.getString(1)).mo16798d(R24.m87394b(cursor.getInt(2))).mo16799c(m72752P0(cursor.getString(3))).mo16801a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ List m72705t0(T96 t96, SQLiteDatabase sQLiteDatabase) {
        N24[] values;
        List<AbstractC43900kR3> m72758K0 = m72758K0(sQLiteDatabase, t96, this.f48944e.mo86460d());
        for (N24 n24 : N24.values()) {
            if (n24 != t96.mo16802d()) {
                int mo86460d = this.f48944e.mo86460d() - m72758K0.size();
                if (mo86460d <= 0) {
                    break;
                }
                m72758K0.addAll(m72758K0(sQLiteDatabase, t96.m84267f(n24), mo86460d));
            }
        }
        return m72734b0(m72758K0, m72756N0(sQLiteDatabase, m72758K0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u0 */
    public /* synthetic */ C33809Jk0 m72703u0(Map map, C33809Jk0.C4215a c4215a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C46582ox2.EnumC27110b m72759K = m72759K(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C46582ox2.m20241c().m20238c(m72759K).m20239b(j).m20240a());
        }
        m72750Q0(c4215a, map);
        c4215a.m99890e(m72744V());
        c4215a.m99891d(m72749R());
        c4215a.m99892c(this.f48945f.get());
        return c4215a.m99893b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v0 */
    public /* synthetic */ C33809Jk0 m72701v0(String str, final Map map, final C33809Jk0.C4215a c4215a, SQLiteDatabase sQLiteDatabase) {
        return (C33809Jk0) m72738Z0(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC10328b() { // from class: Ig5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                C33809Jk0 m72703u0;
                m72703u0 = C37522Zg5.this.m72703u0(map, c4215a, (Cursor) obj);
                return m72703u0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ Object m72700w0(List list, T96 t96, Cursor cursor) {
        while (cursor.moveToNext()) {
            boolean z = false;
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            }
            AbstractC33774Jg1.AbstractC4179a mo174k = AbstractC33774Jg1.m100041a().mo175j(cursor.getString(1)).mo176i(cursor.getLong(2)).mo174k(cursor.getLong(3));
            if (z) {
                mo174k.mo177h(new C43989kb1(m72741W0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo174k.mo177h(new C43989kb1(m72741W0(cursor.getString(4)), m72748R0(j)));
            }
            if (!cursor.isNull(6)) {
                mo174k.mo178g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC43900kR3.m28962a(j, t96, mo174k.mo181d()));
        }
        return null;
    }

    /* renamed from: y0 */
    public static /* synthetic */ Object m72695y0(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C10329c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z0 */
    public /* synthetic */ Long m72693z0(AbstractC33774Jg1 abstractC33774Jg1, T96 t96, SQLiteDatabase sQLiteDatabase) {
        boolean z;
        byte[] bArr;
        if (m72736a0()) {
            mo72731d(1L, C46582ox2.EnumC27110b.CACHE_FULL, abstractC33774Jg1.mo183j());
            return -1L;
        }
        long m72755O = m72755O(sQLiteDatabase, t96);
        int mo86459e = this.f48944e.mo86459e();
        byte[] m28811a = abstractC33774Jg1.mo185e().m28811a();
        if (m28811a.length <= mo86459e) {
            z = true;
        } else {
            z = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m72755O));
        contentValues.put("transport_name", abstractC33774Jg1.mo183j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC33774Jg1.mo184f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC33774Jg1.mo182k()));
        contentValues.put("payload_encoding", abstractC33774Jg1.mo185e().m28810b().m90061a());
        contentValues.put(PaymentMethodOptionsParams.Blik.PARAM_CODE, abstractC33774Jg1.mo186d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        if (z) {
            bArr = m28811a;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(m28811a.length / mo86459e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(m28811a, (i - 1) * mo86459e, Math.min(i * mo86459e, m28811a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(AnalyticsRequestV2.PARAM_EVENT_ID, Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC33774Jg1.m100037i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put(AnalyticsRequestV2.PARAM_EVENT_ID, Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: D1 */
    public void mo72770D1(Iterable<AbstractC43900kR3> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        m72751Q().compileStatement("DELETE FROM events WHERE _id in " + m72739Y0(iterable)).execute();
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: E1 */
    public Iterable<AbstractC43900kR3> mo72767E1(final T96 t96) {
        return (Iterable) m72740X(new InterfaceC10328b() { // from class: Yg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                List m72705t0;
                m72705t0 = C37522Zg5.this.m72705t0(t96, (SQLiteDatabase) obj);
                return m72705t0;
            }
        });
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: H */
    public int mo72764H() {
        final long mo64040a = this.f48942c.mo64040a() - this.f48944e.mo86461c();
        return ((Integer) m72740X(new InterfaceC10328b() { // from class: Lg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Integer m72729f0;
                m72729f0 = C37522Zg5.this.m72729f0(mo64040a, (SQLiteDatabase) obj);
                return m72729f0;
            }
        })).intValue();
    }

    /* renamed from: K */
    public final C46582ox2.EnumC27110b m72759K(int i) {
        C46582ox2.EnumC27110b enumC27110b = C46582ox2.EnumC27110b.REASON_UNKNOWN;
        if (i == enumC27110b.getNumber()) {
            return enumC27110b;
        }
        C46582ox2.EnumC27110b enumC27110b2 = C46582ox2.EnumC27110b.MESSAGE_TOO_OLD;
        if (i == enumC27110b2.getNumber()) {
            return enumC27110b2;
        }
        C46582ox2.EnumC27110b enumC27110b3 = C46582ox2.EnumC27110b.CACHE_FULL;
        if (i == enumC27110b3.getNumber()) {
            return enumC27110b3;
        }
        C46582ox2.EnumC27110b enumC27110b4 = C46582ox2.EnumC27110b.PAYLOAD_TOO_BIG;
        if (i == enumC27110b4.getNumber()) {
            return enumC27110b4;
        }
        C46582ox2.EnumC27110b enumC27110b5 = C46582ox2.EnumC27110b.MAX_RETRIES_REACHED;
        if (i == enumC27110b5.getNumber()) {
            return enumC27110b5;
        }
        C46582ox2.EnumC27110b enumC27110b6 = C46582ox2.EnumC27110b.INVALID_PAYLOD;
        if (i == enumC27110b6.getNumber()) {
            return enumC27110b6;
        }
        C46582ox2.EnumC27110b enumC27110b7 = C46582ox2.EnumC27110b.SERVER_ERROR;
        if (i == enumC27110b7.getNumber()) {
            return enumC27110b7;
        }
        C35800Rx2.m86172b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC27110b;
    }

    /* renamed from: K0 */
    public final List<AbstractC43900kR3> m72758K0(SQLiteDatabase sQLiteDatabase, final T96 t96, int i) {
        final ArrayList arrayList = new ArrayList();
        Long m72742W = m72742W(sQLiteDatabase, t96);
        if (m72742W == null) {
            return arrayList;
        }
        m72738Z0(sQLiteDatabase.query("events", new String[]{TransferTable.COLUMN_ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", PaymentMethodOptionsParams.Blik.PARAM_CODE, "inline"}, "context_id = ?", new String[]{m72742W.toString()}, null, null, null, String.valueOf(i)), new InterfaceC10328b() { // from class: Fg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72700w0;
                m72700w0 = C37522Zg5.this.m72700w0(arrayList, t96, (Cursor) obj);
                return m72700w0;
            }
        });
        return arrayList;
    }

    /* renamed from: L */
    public final void m72757L(final SQLiteDatabase sQLiteDatabase) {
        m72743V0(new InterfaceC10330d() { // from class: Wg5
            @Override // p000.C37522Zg5.InterfaceC10330d
            /* renamed from: a */
            public final Object mo72692a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, new InterfaceC10328b() { // from class: Xg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72725i0;
                m72725i0 = C37522Zg5.m72725i0((Throwable) obj);
                return m72725i0;
            }
        });
    }

    /* renamed from: N0 */
    public final Map<Long, Set<C10329c>> m72756N0(SQLiteDatabase sQLiteDatabase, List<AbstractC43900kR3> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i).mo28960c());
            if (i < list.size() - 1) {
                sb.append(CoreConstants.COMMA_CHAR);
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        m72738Z0(sQLiteDatabase.query("event_metadata", new String[]{AnalyticsRequestV2.PARAM_EVENT_ID, "name", "value"}, sb.toString(), null, null, null, null), new InterfaceC10328b() { // from class: Ag5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72695y0;
                m72695y0 = C37522Zg5.m72695y0(hashMap, (Cursor) obj);
                return m72695y0;
            }
        });
        return hashMap;
    }

    /* renamed from: O */
    public final long m72755O(SQLiteDatabase sQLiteDatabase, T96 t96) {
        Long m72742W = m72742W(sQLiteDatabase, t96);
        if (m72742W != null) {
            return m72742W.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", t96.mo16804b());
        contentValues.put("priority", Integer.valueOf(R24.m87395a(t96.mo16802d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (t96.mo16803c() != null) {
            contentValues.put("extras", Base64.encodeToString(t96.mo16803c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: O0 */
    public long mo72754O0(T96 t96) {
        return ((Long) m72738Z0(m72751Q().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{t96.mo16804b(), String.valueOf(R24.m87395a(t96.mo16802d()))}), new InterfaceC10328b() { // from class: Tg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Long m72722k0;
                m72722k0 = C37522Zg5.m72722k0((Cursor) obj);
                return m72722k0;
            }
        })).longValue();
    }

    /* renamed from: P */
    public long m72753P() {
        return m72747S() * m72745T();
    }

    /* renamed from: Q */
    public SQLiteDatabase m72751Q() {
        final C35704Rm5 c35704Rm5 = this.f48941b;
        Objects.requireNonNull(c35704Rm5);
        return (SQLiteDatabase) m72743V0(new InterfaceC10330d() { // from class: Rg5
            @Override // p000.C37522Zg5.InterfaceC10330d
            /* renamed from: a */
            public final Object mo72692a() {
                return C35704Rm5.this.getWritableDatabase();
            }
        }, new InterfaceC10328b() { // from class: Sg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                SQLiteDatabase m72724j0;
                m72724j0 = C37522Zg5.m72724j0((Throwable) obj);
                return m72724j0;
            }
        });
    }

    /* renamed from: Q0 */
    public final void m72750Q0(C33809Jk0.C4215a c4215a, Map<String, List<C46582ox2>> map) {
        for (Map.Entry<String, List<C46582ox2>> entry : map.entrySet()) {
            c4215a.m99894a(C48953sx2.m13366c().m13363c(entry.getKey()).m13364b(entry.getValue()).m13365a());
        }
    }

    /* renamed from: R */
    public final SC1 m72749R() {
        return SC1.m85850b().m85848b(C39752dR5.m44262c().m44260b(m72753P()).m44259c(AbstractC35646Rg1.f32438a.mo86458f()).m44261a()).m85849a();
    }

    /* renamed from: R0 */
    public final byte[] m72748R0(long j) {
        return (byte[]) m72738Z0(m72751Q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), new InterfaceC10328b() { // from class: Hg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                byte[] m72775B0;
                m72775B0 = C37522Zg5.m72775B0((Cursor) obj);
                return m72775B0;
            }
        });
    }

    /* renamed from: S */
    public final long m72747S() {
        return m72751Q().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: S1 */
    public Iterable<T96> mo72746S1() {
        return (Iterable) m72740X(new InterfaceC10328b() { // from class: Cg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                List m72713p0;
                m72713p0 = C37522Zg5.m72713p0((SQLiteDatabase) obj);
                return m72713p0;
            }
        });
    }

    /* renamed from: T */
    public final long m72745T() {
        return m72751Q().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: V */
    public final C47248q46 m72744V() {
        final long mo64040a = this.f48942c.mo64040a();
        return (C47248q46) m72740X(new InterfaceC10328b() { // from class: Og5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                C47248q46 m72718m0;
                m72718m0 = C37522Zg5.m72718m0(mo64040a, (SQLiteDatabase) obj);
                return m72718m0;
            }
        });
    }

    /* renamed from: V0 */
    public final <T> T m72743V0(InterfaceC10330d<T> interfaceC10330d, InterfaceC10328b<Throwable, T> interfaceC10328b) {
        long mo64040a = this.f48943d.mo64040a();
        while (true) {
            try {
                return interfaceC10330d.mo72692a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f48943d.mo64040a() >= this.f48944e.mo86462b() + mo64040a) {
                    return interfaceC10328b.apply(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: W */
    public final Long m72742W(SQLiteDatabase sQLiteDatabase, T96 t96) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(t96.mo16804b(), String.valueOf(R24.m87395a(t96.mo16802d()))));
        if (t96.mo16803c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(t96.mo16803c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) m72738Z0(sQLiteDatabase.query("transport_contexts", new String[]{TransferTable.COLUMN_ID}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new InterfaceC10328b() { // from class: Ng5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Long m72716n0;
                m72716n0 = C37522Zg5.m72716n0((Cursor) obj);
                return m72716n0;
            }
        });
    }

    /* renamed from: X */
    public <T> T m72740X(InterfaceC10328b<SQLiteDatabase, T> interfaceC10328b) {
        SQLiteDatabase m72751Q = m72751Q();
        m72751Q.beginTransaction();
        try {
            T apply = interfaceC10328b.apply(m72751Q);
            m72751Q.setTransactionSuccessful();
            return apply;
        } finally {
            m72751Q.endTransaction();
        }
    }

    @Override // p000.InterfaceC33107Gk0
    /* renamed from: a */
    public void mo72737a() {
        m72740X(new InterfaceC10328b() { // from class: Vg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72760J0;
                m72760J0 = C37522Zg5.this.m72760J0((SQLiteDatabase) obj);
                return m72760J0;
            }
        });
    }

    /* renamed from: a0 */
    public final boolean m72736a0() {
        if (m72747S() * m72745T() >= this.f48944e.mo86458f()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC33107Gk0
    /* renamed from: b */
    public C33809Jk0 mo72735b() {
        final C33809Jk0.C4215a m99896e = C33809Jk0.m99896e();
        final HashMap hashMap = new HashMap();
        return (C33809Jk0) m72740X(new InterfaceC10328b() { // from class: Bg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                C33809Jk0 m72701v0;
                m72701v0 = C37522Zg5.this.m72701v0(r2, hashMap, m99896e, (SQLiteDatabase) obj);
                return m72701v0;
            }
        });
    }

    /* renamed from: b0 */
    public final List<AbstractC43900kR3> m72734b0(List<AbstractC43900kR3> list, Map<Long, Set<C10329c>> map) {
        ListIterator<AbstractC43900kR3> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC43900kR3 next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo28960c()))) {
                AbstractC33774Jg1.AbstractC4179a m100036l = next.mo28961b().m100036l();
                for (C10329c c10329c : map.get(Long.valueOf(next.mo28960c()))) {
                    m100036l.m100033c(c10329c.f48946a, c10329c.f48947b);
                }
                listIterator.set(AbstractC43900kR3.m28962a(next.mo28960c(), next.mo28959d(), m100036l.mo181d()));
            }
        }
        return list;
    }

    @Override // p000.BX5
    /* renamed from: c */
    public <T> T mo72733c(BX5.InterfaceC0634a<T> interfaceC0634a) {
        SQLiteDatabase m72751Q = m72751Q();
        m72757L(m72751Q);
        try {
            T execute = interfaceC0634a.execute();
            m72751Q.setTransactionSuccessful();
            return execute;
        } finally {
            m72751Q.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f48941b.close();
    }

    @Override // p000.InterfaceC33107Gk0
    /* renamed from: d */
    public void mo72731d(final long j, final C46582ox2.EnumC27110b enumC27110b, final String str) {
        m72740X(new InterfaceC10328b() { // from class: Jg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72763H0;
                m72763H0 = C37522Zg5.m72763H0(str, enumC27110b, j, (SQLiteDatabase) obj);
                return m72763H0;
            }
        });
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: p1 */
    public AbstractC43900kR3 mo72712p1(final T96 t96, final AbstractC33774Jg1 abstractC33774Jg1) {
        C35800Rx2.m86171c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", t96.mo16802d(), abstractC33774Jg1.mo183j(), t96.mo16804b());
        long longValue = ((Long) m72740X(new InterfaceC10328b() { // from class: Kg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Long m72693z0;
                m72693z0 = C37522Zg5.this.m72693z0(abstractC33774Jg1, t96, (SQLiteDatabase) obj);
                return m72693z0;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC43900kR3.m28962a(longValue, t96, abstractC33774Jg1);
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: q2 */
    public boolean mo72710q2(final T96 t96) {
        return ((Boolean) m72740X(new InterfaceC10328b() { // from class: yg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Boolean m72715o0;
                m72715o0 = C37522Zg5.this.m72715o0(t96, (SQLiteDatabase) obj);
                return m72715o0;
            }
        })).booleanValue();
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: w1 */
    public void mo72699w1(final T96 t96, final long j) {
        m72740X(new InterfaceC10328b() { // from class: Ug5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72761I0;
                m72761I0 = C37522Zg5.m72761I0(j, t96, (SQLiteDatabase) obj);
                return m72761I0;
            }
        });
    }

    @Override // p000.InterfaceC35412Qg1
    /* renamed from: w2 */
    public void mo72698w2(Iterable<AbstractC43900kR3> iterable) {
        if (!iterable.iterator().hasNext()) {
            return;
        }
        final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m72739Y0(iterable);
        m72740X(new InterfaceC10328b() { // from class: zg5
            @Override // p000.C37522Zg5.InterfaceC10328b
            public final Object apply(Object obj) {
                Object m72771D0;
                m72771D0 = C37522Zg5.this.m72771D0(str, r3, (SQLiteDatabase) obj);
                return m72771D0;
            }
        });
    }
}
