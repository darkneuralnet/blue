package p000;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.classic.spi.CallerData;
import ch.qos.logback.core.CoreConstants;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.amazonaws.services.p026s3.Headers;
import com.amazonaws.services.p026s3.model.InstructionFileId;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlj;
import com.google.android.gms.measurement.internal.zzq;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.LongCompanionObject;
import org.joda.time.DateTimeConstants;
/* renamed from: hV8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C42162hV8 implements InterfaceC35527Qs8 {

    /* renamed from: F */
    public static volatile C42162hV8 f85302F;

    /* renamed from: A */
    public final Map f85303A;

    /* renamed from: B */
    public final Map f85304B;

    /* renamed from: C */
    public C50902wE8 f85305C;

    /* renamed from: D */
    public String f85306D;

    /* renamed from: a */
    public final C34987Ok8 f85308a;

    /* renamed from: b */
    public final C38682bf8 f85309b;

    /* renamed from: c */
    public C49481tq7 f85310c;

    /* renamed from: d */
    public C32602Ef8 f85311d;

    /* renamed from: e */
    public GR8 f85312e;

    /* renamed from: f */
    public C32835Ff7 f85313f;

    /* renamed from: g */
    public final DV8 f85314g;

    /* renamed from: h */
    public YD8 f85315h;

    /* renamed from: i */
    public VN8 f85316i;

    /* renamed from: j */
    public final C51621xS8 f85317j;

    /* renamed from: k */
    public C51773xi8 f85318k;

    /* renamed from: l */
    public final C35248Pn8 f85319l;

    /* renamed from: n */
    public boolean f85321n;
    @VisibleForTesting

    /* renamed from: o */
    public long f85322o;

    /* renamed from: p */
    public List f85323p;

    /* renamed from: q */
    public int f85324q;

    /* renamed from: r */
    public int f85325r;

    /* renamed from: s */
    public boolean f85326s;

    /* renamed from: t */
    public boolean f85327t;

    /* renamed from: u */
    public boolean f85328u;

    /* renamed from: v */
    public FileLock f85329v;

    /* renamed from: w */
    public FileChannel f85330w;

    /* renamed from: x */
    public List f85331x;

    /* renamed from: y */
    public List f85332y;

    /* renamed from: z */
    public long f85333z;

    /* renamed from: m */
    public boolean f85320m = false;

    /* renamed from: E */
    public final DW8 f85307E = new C40967fU8(this);

    public C42162hV8(C48684sV8 c48684sV8, C35248Pn8 c35248Pn8) {
        Preconditions.checkNotNull(c48684sV8);
        this.f85319l = C35248Pn8.m89782H(c48684sV8.f108892a, null, null);
        this.f85333z = -1L;
        this.f85317j = new C51621xS8(this);
        DV8 dv8 = new DV8(this);
        dv8.m83600g();
        this.f85314g = dv8;
        C38682bf8 c38682bf8 = new C38682bf8(this);
        c38682bf8.m83600g();
        this.f85309b = c38682bf8;
        C34987Ok8 c34987Ok8 = new C34987Ok8(this);
        c34987Ok8.m83600g();
        this.f85308a = c34987Ok8;
        this.f85303A = new HashMap();
        this.f85304B = new HashMap();
        mo22257c().m43695w(new RunnableC52807zS8(this, c48684sV8));
    }

    @VisibleForTesting
    /* renamed from: G */
    public static final void m36316G(C39936dk8 c39936dk8, int i, String str) {
        List m43793S = c39936dk8.m43793S();
        for (int i2 = 0; i2 < m43793S.size(); i2++) {
            if ("_err".equals(((C47061pl8) m43793S.get(i2)).m18780H())) {
                return;
            }
        }
        C39946dl8 m18782F = C47061pl8.m18782F();
        m18782F.m43763J("_err");
        m18782F.m43764I(Long.valueOf(i).longValue());
        C39946dl8 m18782F2 = C47061pl8.m18782F();
        m18782F2.m43763J("_ev");
        m18782F2.m43762M(str);
        c39936dk8.m43803D((C47061pl8) m18782F.m81476q());
        c39936dk8.m43803D((C47061pl8) m18782F2.m81476q());
    }

    @VisibleForTesting
    /* renamed from: H */
    public static final void m36315H(C39936dk8 c39936dk8, String str) {
        List m43793S = c39936dk8.m43793S();
        for (int i = 0; i < m43793S.size(); i++) {
            if (str.equals(((C47061pl8) m43793S.get(i)).m18780H())) {
                c39936dk8.m43801H(i);
                return;
            }
        }
    }

    /* renamed from: Q */
    public static final boolean m36306Q(zzq zzqVar) {
        return (TextUtils.isEmpty(zzqVar.f71542c) && TextUtils.isEmpty(zzqVar.f71557r)) ? false : true;
    }

    /* renamed from: R */
    public static final TR8 m36305R(TR8 tr8) {
        if (tr8 != null) {
            if (tr8.m83599h()) {
                return tr8;
            }
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(tr8.getClass())));
        }
        throw new IllegalStateException("Upload Component not created");
    }

    /* renamed from: f0 */
    public static C42162hV8 m36287f0(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f85302F == null) {
            synchronized (C42162hV8.class) {
                if (f85302F == null) {
                    f85302F = new C42162hV8((C48684sV8) Preconditions.checkNotNull(new C48684sV8(context)), null);
                }
            }
        }
        return f85302F;
    }

    /* renamed from: k0 */
    public static /* bridge */ /* synthetic */ void m36277k0(C42162hV8 c42162hV8, C48684sV8 c48684sV8) {
        c42162hV8.mo22257c().mo19953e();
        c42162hV8.f85318k = new C51773xi8(c42162hV8);
        C49481tq7 c49481tq7 = new C49481tq7(c42162hV8);
        c49481tq7.m83600g();
        c42162hV8.f85310c = c49481tq7;
        c42162hV8.m36302U().m37504w((InterfaceC44085kk7) Preconditions.checkNotNull(c42162hV8.f85308a));
        VN8 vn8 = new VN8(c42162hV8);
        vn8.m83600g();
        c42162hV8.f85316i = vn8;
        C32835Ff7 c32835Ff7 = new C32835Ff7(c42162hV8);
        c32835Ff7.m83600g();
        c42162hV8.f85313f = c32835Ff7;
        YD8 yd8 = new YD8(c42162hV8);
        yd8.m83600g();
        c42162hV8.f85315h = yd8;
        GR8 gr8 = new GR8(c42162hV8);
        gr8.m83600g();
        c42162hV8.f85312e = gr8;
        c42162hV8.f85311d = new C32602Ef8(c42162hV8);
        if (c42162hV8.f85324q != c42162hV8.f85325r) {
            c42162hV8.mo22258a().m106893o().m42706c("Not all upload components initialized", Integer.valueOf(c42162hV8.f85324q), Integer.valueOf(c42162hV8.f85325r));
        }
        c42162hV8.f85320m = true;
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: A */
    public final Clock mo22260A() {
        return ((C35248Pn8) Preconditions.checkNotNull(this.f85319l)).mo22260A();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x02f6, code lost:
        r0 = r0.subList(0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02fb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02fc, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x050e, code lost:
        if (r3 == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0126, code lost:
        if (r11 == null) goto L220;
     */
    /* JADX WARN: Removed duplicated region for block: B:132:0x029d A[Catch: all -> 0x0533, TryCatch #11 {all -> 0x0533, blocks: (B:130:0x0297, B:132:0x029d, B:134:0x02a9, B:135:0x02ad, B:137:0x02b3, B:139:0x02c7, B:143:0x02d0, B:145:0x02d6, B:148:0x02eb, B:156:0x0302, B:158:0x031d, B:162:0x032c, B:164:0x0350, B:168:0x038a, B:170:0x038f, B:172:0x0397, B:173:0x039a, B:175:0x039f, B:176:0x03a2, B:178:0x03ae, B:179:0x03c4, B:182:0x03d0, B:184:0x03e1, B:186:0x03f2, B:187:0x0407, B:189:0x0414, B:191:0x0429, B:195:0x0439, B:196:0x043d, B:190:0x0422, B:198:0x048c, B:117:0x0268, B:129:0x0294, B:202:0x04a7, B:203:0x04aa, B:204:0x04ab, B:209:0x04eb, B:225:0x0512, B:227:0x0518, B:229:0x0523, B:213:0x04f4, B:234:0x052f, B:235:0x0532, B:194:0x0435), top: B:255:0x00eb, inners: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0518 A[Catch: all -> 0x0533, TryCatch #11 {all -> 0x0533, blocks: (B:130:0x0297, B:132:0x029d, B:134:0x02a9, B:135:0x02ad, B:137:0x02b3, B:139:0x02c7, B:143:0x02d0, B:145:0x02d6, B:148:0x02eb, B:156:0x0302, B:158:0x031d, B:162:0x032c, B:164:0x0350, B:168:0x038a, B:170:0x038f, B:172:0x0397, B:173:0x039a, B:175:0x039f, B:176:0x03a2, B:178:0x03ae, B:179:0x03c4, B:182:0x03d0, B:184:0x03e1, B:186:0x03f2, B:187:0x0407, B:189:0x0414, B:191:0x0429, B:195:0x0439, B:196:0x043d, B:190:0x0422, B:198:0x048c, B:117:0x0268, B:129:0x0294, B:202:0x04a7, B:203:0x04aa, B:204:0x04ab, B:209:0x04eb, B:225:0x0512, B:227:0x0518, B:229:0x0523, B:213:0x04f4, B:234:0x052f, B:235:0x0532, B:194:0x0435), top: B:255:0x00eb, inners: #21 }] */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36320B() {
        boolean z;
        Cursor cursor;
        C49481tq7 c49481tq7;
        long m37522I;
        Cursor cursor2;
        String str;
        C49481tq7 c49481tq72;
        Cursor cursor3;
        boolean z2;
        boolean z3;
        Cursor cursor4;
        long j;
        Cursor cursor5;
        List emptyList;
        boolean z4;
        String str2;
        String str3;
        byte[] byteArray;
        mo22257c().mo19953e();
        m36292d();
        int i = 1;
        this.f85328u = true;
        int i2 = 0;
        try {
            this.f85319l.mo22259C();
            Boolean m88571J = this.f85319l.m89778L().m88571J();
            if (m88571J == null) {
                mo22258a().m106888t().m42708a("Upload data called on the client side before use of service was decided");
                this.f85328u = false;
            } else if (m88571J.booleanValue()) {
                mo22258a().m106893o().m42708a("Upload called in the client side when service should be used");
                this.f85328u = false;
            } else if (this.f85322o > 0) {
                m36310M();
                this.f85328u = false;
            } else {
                mo22257c().mo19953e();
                if (this.f85331x != null) {
                    mo22258a().m106889s().m42708a("Uploading requested multiple times");
                    this.f85328u = false;
                } else {
                    C38682bf8 c38682bf8 = this.f85309b;
                    m36305R(c38682bf8);
                    if (!c38682bf8.m64190j()) {
                        mo22258a().m106889s().m42708a("Network not connected, ignoring upload request");
                        m36310M();
                        this.f85328u = false;
                    } else {
                        long currentTimeMillis = mo22260A().currentTimeMillis();
                        Cursor cursor6 = null;
                        int m37515l = m36302U().m37515l(null, C37795a98.f49952T);
                        m36302U();
                        long m37522I2 = currentTimeMillis - C41723gl7.m37522I();
                        for (int i3 = 0; i3 < m37515l && m36309N(null, m37522I2); i3++) {
                        }
                        long m564a = this.f85316i.f39037g.m564a();
                        if (m564a != 0) {
                            mo22258a().m106894n().m42707b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - m564a)));
                        }
                        C49481tq7 c49481tq73 = this.f85310c;
                        m36305R(c49481tq73);
                        String m11664Z = c49481tq73.m11664Z();
                        long j2 = -1;
                        try {
                            if (!TextUtils.isEmpty(m11664Z)) {
                                if (this.f85333z == -1) {
                                    try {
                                        c49481tq72 = this.f85310c;
                                        m36305R(c49481tq72);
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor6 = cursor3;
                                    }
                                    try {
                                        cursor3 = c49481tq72.m11674P().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                j2 = cursor3.getLong(0);
                                            }
                                        } catch (SQLiteException e) {
                                            e = e;
                                            c49481tq72.f100966a.mo22258a().m106893o().m42707b("Error querying raw events", e);
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor3 = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (cursor6 != null) {
                                            cursor6.close();
                                        }
                                        throw th;
                                    }
                                    cursor3.close();
                                    this.f85333z = j2;
                                }
                                int m37515l2 = m36302U().m37515l(m11664Z, C37795a98.f49975i);
                                int max = Math.max(0, m36302U().m37515l(m11664Z, C37795a98.f49977j));
                                C49481tq7 c49481tq74 = this.f85310c;
                                m36305R(c49481tq74);
                                c49481tq74.mo19953e();
                                c49481tq74.m83601f();
                                if (m37515l2 > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Preconditions.checkArgument(z2);
                                if (max > 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                try {
                                    Preconditions.checkArgument(z3);
                                    Preconditions.checkNotEmpty(m11664Z);
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor4 = cursor3;
                                }
                                try {
                                    cursor5 = c49481tq74.m11674P().query("queue", new String[]{"rowid", MessageExtension.FIELD_DATA, "retry_count"}, "app_id=?", new String[]{m11664Z}, null, null, "rowid", String.valueOf(m37515l2));
                                    try {
                                        if (!cursor5.moveToFirst()) {
                                            emptyList = Collections.emptyList();
                                            cursor5.close();
                                            j = currentTimeMillis;
                                        } else {
                                            ArrayList arrayList = new ArrayList();
                                            int i4 = 0;
                                            while (true) {
                                                long j3 = cursor5.getLong(i2);
                                                try {
                                                    byte[] blob = cursor5.getBlob(i);
                                                    DV8 dv8 = c49481tq74.f15489b.f85314g;
                                                    m36305R(dv8);
                                                    try {
                                                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                                                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                        byte[] bArr = new byte[1024];
                                                        j = currentTimeMillis;
                                                        while (true) {
                                                            try {
                                                                try {
                                                                    int read = gZIPInputStream.read(bArr);
                                                                    if (read <= 0) {
                                                                        break;
                                                                    }
                                                                    byteArrayOutputStream.write(bArr, 0, read);
                                                                } catch (IOException e3) {
                                                                    e = e3;
                                                                    try {
                                                                        dv8.f100966a.mo22258a().m106893o().m42707b("Failed to ungzip content", e);
                                                                        throw e;
                                                                        break;
                                                                    } catch (IOException e4) {
                                                                        e = e4;
                                                                        c49481tq74.f100966a.mo22258a().m106893o().m42706c("Failed to unzip queued bundle. appId", C32809Fc8.m106885w(m11664Z), e);
                                                                        if (cursor5.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        currentTimeMillis = j;
                                                                        i = 1;
                                                                        i2 = 0;
                                                                        cursor5.close();
                                                                        emptyList = arrayList;
                                                                        if (!emptyList.isEmpty()) {
                                                                        }
                                                                        this.f85328u = false;
                                                                        m36312K();
                                                                    }
                                                                }
                                                            } catch (SQLiteException e5) {
                                                                e = e5;
                                                                c49481tq74.f100966a.mo22258a().m106893o().m42706c("Error querying bundles. appId", C32809Fc8.m106885w(m11664Z), e);
                                                                emptyList = Collections.emptyList();
                                                                if (cursor5 != null) {
                                                                    cursor5.close();
                                                                }
                                                                if (!emptyList.isEmpty()) {
                                                                }
                                                                this.f85328u = false;
                                                                m36312K();
                                                            }
                                                        }
                                                        gZIPInputStream.close();
                                                        byteArrayInputStream.close();
                                                        byteArray = byteArrayOutputStream.toByteArray();
                                                    } catch (IOException e6) {
                                                        e = e6;
                                                        j = currentTimeMillis;
                                                    }
                                                } catch (IOException e7) {
                                                    e = e7;
                                                    j = currentTimeMillis;
                                                }
                                                if (!arrayList.isEmpty() && byteArray.length + i4 > max) {
                                                    break;
                                                }
                                                try {
                                                    C47674qn8 c47674qn8 = (C47674qn8) DV8.m110342B(C32206Cn8.m111630S1(), byteArray);
                                                    if (!cursor5.isNull(2)) {
                                                        c47674qn8.m16987l0(cursor5.getInt(2));
                                                    }
                                                    i4 += byteArray.length;
                                                    arrayList.add(Pair.create((C32206Cn8) c47674qn8.m81476q(), Long.valueOf(j3)));
                                                } catch (IOException e8) {
                                                    c49481tq74.f100966a.mo22258a().m106893o().m42706c("Failed to merge queued bundle. appId", C32809Fc8.m106885w(m11664Z), e8);
                                                }
                                                if (cursor5.moveToNext() || i4 > max) {
                                                    break;
                                                    break;
                                                }
                                                currentTimeMillis = j;
                                                i = 1;
                                                i2 = 0;
                                            }
                                        }
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        j = currentTimeMillis;
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    j = currentTimeMillis;
                                    cursor5 = null;
                                } catch (Throwable th4) {
                                    th = th4;
                                    cursor4 = null;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    throw th;
                                }
                                if (!emptyList.isEmpty()) {
                                    if (m36301V(m11664Z).m76357i(EnumC39344cm7.AD_STORAGE)) {
                                        Iterator it = emptyList.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                C32206Cn8 c32206Cn8 = (C32206Cn8) ((Pair) it.next()).first;
                                                if (!c32206Cn8.m111649M().isEmpty()) {
                                                    str3 = c32206Cn8.m111649M();
                                                    break;
                                                }
                                            } else {
                                                str3 = null;
                                                break;
                                            }
                                        }
                                        if (str3 != null) {
                                            int i5 = 0;
                                            while (true) {
                                                if (i5 >= emptyList.size()) {
                                                    break;
                                                }
                                                C32206Cn8 c32206Cn82 = (C32206Cn8) ((Pair) emptyList.get(i5)).first;
                                                if (!c32206Cn82.m111649M().isEmpty() && !c32206Cn82.m111649M().equals(str3)) {
                                                    break;
                                                }
                                                i5++;
                                            }
                                        }
                                    }
                                    C35941Sm8 m40816B = C41151fn8.m40816B();
                                    int size = emptyList.size();
                                    ArrayList arrayList2 = new ArrayList(emptyList.size());
                                    if (m36302U().m37528B(m11664Z) && m36301V(m11664Z).m76357i(EnumC39344cm7.AD_STORAGE)) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolean m76357i = m36301V(m11664Z).m76357i(EnumC39344cm7.AD_STORAGE);
                                    boolean m76357i2 = m36301V(m11664Z).m76357i(EnumC39344cm7.ANALYTICS_STORAGE);
                                    C49423tk9.m11813b();
                                    boolean m37502y = m36302U().m37502y(m11664Z, C37795a98.f49992q0);
                                    int i6 = 0;
                                    while (i6 < size) {
                                        C47674qn8 c47674qn82 = (C47674qn8) ((C32206Cn8) ((Pair) emptyList.get(i6)).first).m19208j();
                                        arrayList2.add((Long) ((Pair) emptyList.get(i6)).second);
                                        m36302U().m37513n();
                                        c47674qn82.m16980u0(77000L);
                                        long j4 = j;
                                        c47674qn82.m16981t0(j4);
                                        this.f85319l.mo22259C();
                                        try {
                                            c47674qn82.m16986n0(false);
                                            if (!z4) {
                                                c47674qn82.m17011V0();
                                            }
                                            if (!m76357i) {
                                                c47674qn82.m16995e1();
                                                c47674qn82.m17003a1();
                                            }
                                            if (!m76357i2) {
                                                c47674qn82.m17016S0();
                                            }
                                            m36290e(m11664Z, c47674qn82);
                                            if (!m37502y) {
                                                c47674qn82.m16993f1();
                                            }
                                            if (m36302U().m37502y(m11664Z, C37795a98.f49956X)) {
                                                byte[] m88653c = ((C32206Cn8) c47674qn82.m81476q()).m88653c();
                                                DV8 dv82 = this.f85314g;
                                                m36305R(dv82);
                                                c47674qn82.m17031J(dv82.m110317u(m88653c));
                                            }
                                            m40816B.m84847y(c47674qn82);
                                            i6++;
                                            j = j4;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            z = false;
                                            this.f85328u = z;
                                            m36312K();
                                            throw th;
                                        }
                                    }
                                    long j5 = j;
                                    if (Log.isLoggable(mo22258a().m106900D(), 2)) {
                                        DV8 dv83 = this.f85314g;
                                        m36305R(dv83);
                                        str2 = dv83.m110341D((C41151fn8) m40816B.m81476q());
                                    } else {
                                        str2 = null;
                                    }
                                    m36305R(this.f85314g);
                                    byte[] m88653c2 = ((C41151fn8) m40816B.m81476q()).m88653c();
                                    C40356eS8 m5241f = this.f85317j.m5241f(m11664Z);
                                    try {
                                        Preconditions.checkArgument(!arrayList2.isEmpty());
                                        if (this.f85331x != null) {
                                            mo22258a().m106893o().m42708a("Set uploading progress before finishing the previous upload");
                                        } else {
                                            this.f85331x = new ArrayList(arrayList2);
                                        }
                                        this.f85316i.f39038h.m563b(j5);
                                        String str4 = CallerData.f61059NA;
                                        if (size > 0) {
                                            str4 = m40816B.m84846z(0).m111618W1();
                                        }
                                        mo22258a().m106889s().m42705d("Uploading data. app, uncompressed size, data", str4, Integer.valueOf(m88653c2.length), str2);
                                        this.f85327t = true;
                                        C38682bf8 c38682bf82 = this.f85309b;
                                        m36305R(c38682bf82);
                                        URL url = new URL(m5241f.m42873a());
                                        Map m42872b = m5241f.m42872b();
                                        KS8 ks8 = new KS8(this, m11664Z);
                                        c38682bf82.mo19953e();
                                        c38682bf82.m83601f();
                                        Preconditions.checkNotNull(url);
                                        Preconditions.checkNotNull(m88653c2);
                                        Preconditions.checkNotNull(ks8);
                                        c38682bf82.f100966a.mo22257c().m43696v(new RunnableC36328Ud8(c38682bf82, m11664Z, url, m88653c2, m42872b, ks8));
                                    } catch (MalformedURLException unused) {
                                        mo22258a().m106893o().m42706c("Failed to parse upload URL. Not uploading. appId", C32809Fc8.m106885w(m11664Z), m5241f.m42873a());
                                    }
                                }
                            } else {
                                try {
                                    this.f85333z = -1L;
                                    c49481tq7 = this.f85310c;
                                    m36305R(c49481tq7);
                                    m36302U();
                                    m37522I = currentTimeMillis - C41723gl7.m37522I();
                                    c49481tq7.mo19953e();
                                    c49481tq7.m83601f();
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor = null;
                                }
                                try {
                                    cursor2 = c49481tq7.m11674P().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(m37522I)});
                                    try {
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        c49481tq7.f100966a.mo22258a().m106893o().m42707b("Error selecting expired configs", e);
                                    }
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    cursor2 = null;
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor = null;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    throw th;
                                }
                                if (!cursor2.moveToFirst()) {
                                    c49481tq7.f100966a.mo22258a().m106889s().m42708a("No expired configs for apps with pending events");
                                    cursor2.close();
                                    str = null;
                                    if (!TextUtils.isEmpty(str)) {
                                        C49481tq7 c49481tq75 = this.f85310c;
                                        m36305R(c49481tq75);
                                        C47141pt8 m11672R = c49481tq75.m11672R(str);
                                        if (m11672R != null) {
                                            m36288f(m11672R);
                                        }
                                    }
                                } else {
                                    str = cursor2.getString(0);
                                    cursor2.close();
                                    if (!TextUtils.isEmpty(str)) {
                                    }
                                }
                            }
                            this.f85328u = false;
                        } catch (Throwable th8) {
                            th = th8;
                            z = false;
                        }
                    }
                }
            }
            m36312K();
        } catch (Throwable th9) {
            th = th9;
            z = false;
        }
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: C */
    public final C32844Fg7 mo22259C() {
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:93:0x02f6
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: D */
    public final void m36319D(com.google.android.gms.measurement.internal.zzaw r36, com.google.android.gms.measurement.internal.zzq r37) {
        /*
            Method dump skipped, instructions count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C42162hV8.m36319D(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    @VisibleForTesting
    /* renamed from: E */
    public final boolean m36318E() {
        mo22257c().mo19953e();
        FileLock fileLock = this.f85329v;
        if (fileLock != null && fileLock.isValid()) {
            mo22258a().m106889s().m42708a("Storage concurrent access okay");
            return true;
        }
        this.f85310c.f100966a.m89751w();
        try {
            FileChannel channel = new RandomAccessFile(new File(this.f85319l.mo22255z().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.f85330w = channel;
            FileLock tryLock = channel.tryLock();
            this.f85329v = tryLock;
            if (tryLock != null) {
                mo22258a().m106889s().m42708a("Storage concurrent access okay");
                return true;
            }
            mo22258a().m106893o().m42708a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            mo22258a().m106893o().m42707b("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            mo22258a().m106893o().m42707b("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            mo22258a().m106888t().m42707b("Storage lock already acquired", e3);
            return false;
        }
    }

    /* renamed from: F */
    public final long m36317F() {
        long currentTimeMillis = mo22260A().currentTimeMillis();
        VN8 vn8 = this.f85316i;
        vn8.m83601f();
        vn8.mo19953e();
        long m564a = vn8.f39039i.m564a();
        if (m564a == 0) {
            m564a = vn8.f100966a.m89776N().m92054r().nextInt(DateTimeConstants.MILLIS_PER_DAY) + 1;
            vn8.f39039i.m563b(m564a);
        }
        return ((((currentTimeMillis + m564a) / 1000) / 60) / 60) / 24;
    }

    /* renamed from: I */
    public final zzq m36314I(String str) {
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        C47141pt8 m11672R = c49481tq7.m11672R(str);
        if (m11672R != null && !TextUtils.isEmpty(m11672R.m18466l0())) {
            Boolean m36313J = m36313J(m11672R);
            if (m36313J != null && !m36313J.booleanValue()) {
                mo22258a().m106893o().m42707b("App version does not match; dropping. appId", C32809Fc8.m106885w(str));
                return null;
            }
            String m18462n0 = m11672R.m18462n0();
            String m18466l0 = m11672R.m18466l0();
            long m18500P = m11672R.m18500P();
            String m18468k0 = m11672R.m18468k0();
            long m18488a0 = m11672R.m18488a0();
            long m18492X = m11672R.m18492X();
            boolean m18503M = m11672R.m18503M();
            String m18464m0 = m11672R.m18464m0();
            m11672R.m18515A();
            return new zzq(str, m18462n0, m18466l0, m18500P, m18468k0, m18488a0, m18492X, (String) null, m18503M, false, m18464m0, 0L, 0L, 0, m11672R.m18504L(), false, m11672R.m18476g0(), m11672R.m18478f0(), m11672R.m18491Y(), m11672R.m18483d(), (String) null, m36301V(str).m76358h(), "", (String) null, m11672R.m18501O(), m11672R.m18480e0());
        }
        mo22258a().m106894n().m42707b("No app data available; dropping", str);
        return null;
    }

    /* renamed from: J */
    public final Boolean m36313J(C47141pt8 c47141pt8) {
        try {
            if (c47141pt8.m18500P() != -2147483648L) {
                if (c47141pt8.m18500P() == Wrappers.packageManager(this.f85319l.mo22255z()).getPackageInfo(c47141pt8.m18472i0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = Wrappers.packageManager(this.f85319l.mo22255z()).getPackageInfo(c47141pt8.m18472i0(), 0).versionName;
                String m18466l0 = c47141pt8.m18466l0();
                if (m18466l0 != null && m18466l0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: K */
    public final void m36312K() {
        mo22257c().mo19953e();
        if (!this.f85326s && !this.f85327t && !this.f85328u) {
            mo22258a().m106889s().m42708a("Stopping uploading service(s)");
            List<Runnable> list = this.f85323p;
            if (list == null) {
                return;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            ((List) Preconditions.checkNotNull(this.f85323p)).clear();
            return;
        }
        mo22258a().m106889s().m42705d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f85326s), Boolean.valueOf(this.f85327t), Boolean.valueOf(this.f85328u));
    }

    @VisibleForTesting
    /* renamed from: L */
    public final void m36311L(C47674qn8 c47674qn8, long j, boolean z) {
        String str;
        C47508qW8 c47508qW8;
        String str2;
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C47508qW8 m11666X = c49481tq7.m11666X(c47674qn8.m16975y0(), str);
        if (m11666X != null && m11666X.f105375e != null) {
            c47508qW8 = new C47508qW8(c47674qn8.m16975y0(), "auto", str, mo22260A().currentTimeMillis(), Long.valueOf(((Long) m11666X.f105375e).longValue() + j));
        } else {
            c47508qW8 = new C47508qW8(c47674qn8.m16975y0(), "auto", str, mo22260A().currentTimeMillis(), Long.valueOf(j));
        }
        C52436yp8 m98256E = C34096Kp8.m98256E();
        m98256E.m2515D(str);
        m98256E.m2514G(mo22260A().currentTimeMillis());
        m98256E.m2516C(((Long) c47508qW8.f105375e).longValue());
        C34096Kp8 c34096Kp8 = (C34096Kp8) m98256E.m81476q();
        int m110318t = DV8.m110318t(c47674qn8, str);
        if (m110318t >= 0) {
            c47674qn8.m16979v0(m110318t, c34096Kp8);
        } else {
            c47674qn8.m17018R0(c34096Kp8);
        }
        if (j > 0) {
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            c49481tq72.m11643u(c47508qW8);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            mo22258a().m106889s().m42706c("Updated engagement user property. scope, value", str2, c47508qW8.f105375e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0238  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36310M() {
        long max;
        long j;
        mo22257c().mo19953e();
        m36292d();
        if (this.f85322o > 0) {
            long abs = CoreConstants.MILLIS_IN_ONE_HOUR - Math.abs(mo22260A().elapsedRealtime() - this.f85322o);
            if (abs > 0) {
                mo22258a().m106889s().m42707b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                m36297Z().m108587c();
                GR8 gr8 = this.f85312e;
                m36305R(gr8);
                gr8.m105089j();
                return;
            }
            this.f85322o = 0L;
        }
        if (this.f85319l.m89759o() && m36308O()) {
            long currentTimeMillis = mo22260A().currentTimeMillis();
            m36302U();
            long max2 = Math.max(0L, ((Long) C37795a98.f49927C.m97658a(null)).longValue());
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            boolean z = true;
            if (!c49481tq7.m11647q()) {
                C49481tq7 c49481tq72 = this.f85310c;
                m36305R(c49481tq72);
                if (!c49481tq72.m11648p()) {
                    z = false;
                }
            }
            if (z) {
                String m37509r = m36302U().m37509r();
                if (!TextUtils.isEmpty(m37509r) && !".none.".equals(m37509r)) {
                    m36302U();
                    max = Math.max(0L, ((Long) C37795a98.f50005x.m97658a(null)).longValue());
                } else {
                    m36302U();
                    max = Math.max(0L, ((Long) C37795a98.f50003w.m97658a(null)).longValue());
                }
            } else {
                m36302U();
                max = Math.max(0L, ((Long) C37795a98.f50001v.m97658a(null)).longValue());
            }
            long m564a = this.f85316i.f39037g.m564a();
            long m564a2 = this.f85316i.f39038h.m564a();
            C49481tq7 c49481tq73 = this.f85310c;
            m36305R(c49481tq73);
            boolean z2 = z;
            long m11677M = c49481tq73.m11677M();
            C49481tq7 c49481tq74 = this.f85310c;
            m36305R(c49481tq74);
            long max3 = Math.max(m11677M, c49481tq74.m11676N());
            if (max3 != 0) {
                long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
                long abs3 = currentTimeMillis - Math.abs(m564a - currentTimeMillis);
                long abs4 = currentTimeMillis - Math.abs(m564a2 - currentTimeMillis);
                j = abs2 + max2;
                long max4 = Math.max(abs3, abs4);
                if (z2 && max4 > 0) {
                    j = Math.min(abs2, max4) + max;
                }
                DV8 dv8 = this.f85314g;
                m36305R(dv8);
                if (!dv8.m110332M(max4, max)) {
                    j = max4 + max;
                }
                if (abs4 != 0 && abs4 >= abs2) {
                    int i = 0;
                    while (true) {
                        m36302U();
                        if (i >= Math.min(20, Math.max(0, ((Integer) C37795a98.f49931E.m97658a(null)).intValue()))) {
                            break;
                        }
                        m36302U();
                        j += Math.max(0L, ((Long) C37795a98.f49929D.m97658a(null)).longValue()) * (1 << i);
                        if (j > abs4) {
                            break;
                        }
                        i++;
                    }
                }
                if (j == 0) {
                    C38682bf8 c38682bf8 = this.f85309b;
                    m36305R(c38682bf8);
                    if (c38682bf8.m64190j()) {
                        long m564a3 = this.f85316i.f39036f.m564a();
                        m36302U();
                        long max5 = Math.max(0L, ((Long) C37795a98.f49997t.m97658a(null)).longValue());
                        DV8 dv82 = this.f85314g;
                        m36305R(dv82);
                        if (!dv82.m110332M(m564a3, max5)) {
                            j = Math.max(j, m564a3 + max5);
                        }
                        m36297Z().m108587c();
                        long currentTimeMillis2 = j - mo22260A().currentTimeMillis();
                        if (currentTimeMillis2 <= 0) {
                            m36302U();
                            currentTimeMillis2 = Math.max(0L, ((Long) C37795a98.f50007y.m97658a(null)).longValue());
                            this.f85316i.f39037g.m563b(mo22260A().currentTimeMillis());
                        }
                        mo22258a().m106889s().m42707b("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
                        GR8 gr82 = this.f85312e;
                        m36305R(gr82);
                        gr82.m105088k(currentTimeMillis2);
                        return;
                    }
                    mo22258a().m106889s().m42708a("No network");
                    m36297Z().m108588b();
                    GR8 gr83 = this.f85312e;
                    m36305R(gr83);
                    gr83.m105089j();
                    return;
                }
                mo22258a().m106889s().m42708a("Next upload time is 0");
                m36297Z().m108587c();
                GR8 gr84 = this.f85312e;
                m36305R(gr84);
                gr84.m105089j();
                return;
            }
            j = 0;
            if (j == 0) {
            }
        } else {
            mo22258a().m106889s().m42708a("Nothing to upload or uploading impossible");
            m36297Z().m108587c();
            GR8 gr85 = this.f85312e;
            m36305R(gr85);
            gr85.m105089j();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:353:0x0b33, code lost:
        if (r10 > (p000.C41723gl7.m37521f() + r8)) goto L384;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0447 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0489 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x07d7 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0820 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0843 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x08c4 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x08f0 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0b23 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0baa A[Catch: all -> 0x0ccc, TRY_LEAVE, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0bc6 A[Catch: SQLiteException -> 0x0bde, all -> 0x0ccc, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0bde, blocks: (B:360:0x0bb7, B:362:0x0bc6), top: B:398:0x0bb7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0383 A[Catch: all -> 0x0ccc, TryCatch #2 {all -> 0x0ccc, blocks: (B:3:0x000e, B:5:0x0026, B:8:0x002e, B:9:0x0040, B:12:0x0054, B:15:0x007b, B:17:0x00b1, B:20:0x00c3, B:22:0x00cd, B:154:0x04ee, B:24:0x00f7, B:26:0x0105, B:29:0x0125, B:31:0x012b, B:33:0x013d, B:35:0x014b, B:37:0x015b, B:38:0x0168, B:39:0x016d, B:42:0x0186, B:97:0x0383, B:98:0x038f, B:101:0x0399, B:107:0x03bc, B:104:0x03ab, B:129:0x043b, B:131:0x0447, B:134:0x045c, B:136:0x046d, B:138:0x0479, B:153:0x04da, B:141:0x0489, B:143:0x0495, B:146:0x04aa, B:148:0x04bb, B:150:0x04c7, B:111:0x03c4, B:113:0x03d0, B:115:0x03dc, B:127:0x0421, B:119:0x03f9, B:122:0x040b, B:124:0x0411, B:126:0x041b, B:54:0x01c0, B:57:0x01ca, B:59:0x01d8, B:63:0x021f, B:60:0x01f5, B:62:0x0206, B:67:0x022e, B:69:0x025a, B:70:0x0284, B:72:0x02ba, B:74:0x02c0, B:77:0x02cc, B:79:0x0302, B:80:0x031d, B:82:0x0323, B:84:0x0331, B:88:0x0344, B:85:0x0339, B:91:0x034b, B:94:0x0352, B:95:0x036a, B:157:0x0506, B:159:0x0514, B:161:0x051f, B:172:0x0551, B:162:0x0527, B:164:0x0532, B:166:0x0538, B:169:0x0544, B:171:0x054c, B:173:0x0554, B:174:0x0560, B:177:0x0568, B:179:0x057a, B:180:0x0586, B:182:0x058e, B:186:0x05b3, B:188:0x05d8, B:190:0x05e9, B:192:0x05ef, B:194:0x05fb, B:195:0x062c, B:197:0x0632, B:199:0x0640, B:200:0x0644, B:201:0x0647, B:202:0x064a, B:203:0x0658, B:205:0x065e, B:207:0x066e, B:208:0x0675, B:210:0x0681, B:211:0x0688, B:212:0x068b, B:214:0x06cb, B:215:0x06de, B:217:0x06e4, B:220:0x06fe, B:222:0x0719, B:224:0x0732, B:226:0x0737, B:228:0x073b, B:230:0x073f, B:232:0x0749, B:233:0x0753, B:235:0x0757, B:237:0x075d, B:238:0x076b, B:239:0x0774, B:307:0x09c6, B:241:0x0780, B:243:0x0797, B:249:0x07b3, B:251:0x07d7, B:252:0x07df, B:254:0x07e5, B:256:0x07f7, B:263:0x0820, B:264:0x0843, B:266:0x084f, B:268:0x0864, B:270:0x08a5, B:274:0x08bd, B:276:0x08c4, B:278:0x08d3, B:280:0x08d7, B:282:0x08db, B:284:0x08df, B:285:0x08eb, B:286:0x08f0, B:288:0x08f6, B:290:0x0912, B:291:0x0917, B:306:0x09c3, B:292:0x0931, B:294:0x0939, B:298:0x0960, B:300:0x098e, B:301:0x0995, B:302:0x09a7, B:304:0x09b3, B:295:0x0946, B:261:0x080b, B:247:0x079e, B:308:0x09d1, B:310:0x09de, B:311:0x09e4, B:312:0x09ec, B:314:0x09f2, B:316:0x0a08, B:318:0x0a19, B:338:0x0a8d, B:340:0x0a93, B:342:0x0aab, B:345:0x0ab2, B:350:0x0ae1, B:352:0x0b23, B:355:0x0b58, B:356:0x0b5c, B:357:0x0b67, B:359:0x0baa, B:360:0x0bb7, B:362:0x0bc6, B:366:0x0be0, B:368:0x0bf9, B:354:0x0b35, B:346:0x0aba, B:348:0x0ac6, B:349:0x0aca, B:369:0x0c11, B:370:0x0c29, B:373:0x0c31, B:374:0x0c36, B:375:0x0c46, B:377:0x0c60, B:378:0x0c7b, B:379:0x0c84, B:384:0x0ca8, B:383:0x0c95, B:319:0x0a31, B:321:0x0a37, B:323:0x0a41, B:325:0x0a48, B:331:0x0a58, B:333:0x0a5f, B:335:0x0a7e, B:337:0x0a85, B:336:0x0a82, B:332:0x0a5c, B:324:0x0a45, B:183:0x0593, B:185:0x0599, B:387:0x0cba), top: B:397:0x000e, inners: #0, #1, #3, #4 }] */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m36309N(String str, long j) {
        int i;
        C47674qn8 c47674qn8;
        C49481tq7 c49481tq7;
        C32206Cn8 c32206Cn8;
        long currentTimeMillis;
        long m111658I1;
        ContentValues contentValues;
        long parseLong;
        int m91569o;
        long j2;
        SecureRandom secureRandom;
        Long l;
        C47674qn8 c47674qn82;
        HashMap hashMap;
        ArrayList arrayList;
        long m92047u0;
        HashMap hashMap2;
        ArrayList arrayList2;
        C47674qn8 c47674qn83;
        String str2;
        int i2;
        int i3;
        C39936dk8 c39936dk8;
        String str3;
        C47674qn8 c47674qn84;
        String str4;
        C47674qn8 c47674qn85;
        String str5;
        int i4;
        String str6 = "_npa";
        String str7 = "_ai";
        C49481tq7 c49481tq72 = this.f85310c;
        m36305R(c49481tq72);
        c49481tq72.m11659e0();
        try {
            JU8 ju8 = new JU8(this, null);
            C49481tq7 c49481tq73 = this.f85310c;
            m36305R(c49481tq73);
            c49481tq73.m11683G(null, j, this.f85333z, ju8);
            List list = ju8.f17698c;
            if (list != null && !list.isEmpty()) {
                C47674qn8 c47674qn86 = (C47674qn8) ju8.f17696a.m19208j();
                c47674qn86.m17008X0();
                C39936dk8 c39936dk82 = null;
                C39936dk8 c39936dk83 = null;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = -1;
                int i9 = -1;
                while (true) {
                    String str8 = "_fr";
                    String str9 = "_et";
                    i = i7;
                    int i10 = i8;
                    C39936dk8 c39936dk84 = c39936dk83;
                    if (i5 >= ju8.f17698c.size()) {
                        break;
                    }
                    C39936dk8 c39936dk85 = (C39936dk8) ((C47051pk8) ju8.f17698c.get(i5)).m19208j();
                    C34987Ok8 c34987Ok8 = this.f85308a;
                    m36305R(c34987Ok8);
                    String str10 = str6;
                    if (c34987Ok8.m91583F(ju8.f17696a.m111618W1(), c39936dk85.m43794Q())) {
                        mo22258a().m106888t().m42706c("Dropping blocked raw event. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()), this.f85319l.m89786D().m17332d(c39936dk85.m43794Q()));
                        C34987Ok8 c34987Ok82 = this.f85308a;
                        m36305R(c34987Ok82);
                        if (!c34987Ok82.m91585D(ju8.f17696a.m111618W1())) {
                            C34987Ok8 c34987Ok83 = this.f85308a;
                            m36305R(c34987Ok83);
                            if (!c34987Ok83.m91582G(ju8.f17696a.m111618W1()) && !"_err".equals(c39936dk85.m43794Q())) {
                                m36283h0().m92102B(this.f85307E, ju8.f17696a.m111618W1(), 11, "_ev", c39936dk85.m43794Q(), 0);
                            }
                        }
                        str2 = str7;
                        i4 = i5;
                        c39936dk8 = c39936dk82;
                        i7 = i;
                        i8 = i10;
                        c39936dk83 = c39936dk84;
                        c47674qn84 = c47674qn86;
                    } else {
                        if (c39936dk85.m43794Q().equals(C40628eu8.m42394a(str7))) {
                            c39936dk85.m43800I(str7);
                            mo22258a().m106889s().m42708a("Renaming ad_impression to _ai");
                            if (Log.isLoggable(mo22258a().m106900D(), 5)) {
                                int i11 = 0;
                                while (i11 < c39936dk85.m43791y()) {
                                    String str11 = str7;
                                    if ("ad_platform".equals(c39936dk85.m43795P(i11).m18780H()) && !c39936dk85.m43795P(i11).m18779I().isEmpty() && "admob".equalsIgnoreCase(c39936dk85.m43795P(i11).m18779I())) {
                                        mo22258a().m106887u().m42708a("AdMob ad impression logged from app. Potentially duplicative.");
                                    }
                                    i11++;
                                    str7 = str11;
                                }
                            }
                        }
                        str2 = str7;
                        C34987Ok8 c34987Ok84 = this.f85308a;
                        m36305R(c34987Ok84);
                        boolean m91584E = c34987Ok84.m91584E(ju8.f17696a.m111618W1(), c39936dk85.m43794Q());
                        if (m91584E) {
                            i2 = i5;
                            i3 = i6;
                        } else {
                            m36305R(this.f85314g);
                            String m43794Q = c39936dk85.m43794Q();
                            Preconditions.checkNotEmpty(m43794Q);
                            i3 = i6;
                            i2 = i5;
                            if (((m43794Q.hashCode() == 95027 && m43794Q.equals("_ui")) ? (char) 0 : (char) 65535) != 0) {
                                str4 = "_fr";
                                str3 = "_et";
                                c39936dk8 = c39936dk82;
                                m91584E = false;
                                c47674qn84 = c47674qn86;
                                if (m91584E) {
                                    ArrayList arrayList3 = new ArrayList(c39936dk85.m43793S());
                                    int i12 = -1;
                                    int i13 = -1;
                                    for (int i14 = 0; i14 < arrayList3.size(); i14++) {
                                        if ("value".equals(((C47061pl8) arrayList3.get(i14)).m18780H())) {
                                            i12 = i14;
                                        } else if ("currency".equals(((C47061pl8) arrayList3.get(i14)).m18780H())) {
                                            i13 = i14;
                                        }
                                    }
                                    if (i12 != -1) {
                                        if (!((C47061pl8) arrayList3.get(i12)).m18765X() && !((C47061pl8) arrayList3.get(i12)).m18767V()) {
                                            mo22258a().m106887u().m42708a("Value must be specified with a numeric type.");
                                            c39936dk85.m43801H(i12);
                                            m36315H(c39936dk85, "_c");
                                            m36316G(c39936dk85, 18, "value");
                                        } else {
                                            if (i13 != -1) {
                                                String m18779I = ((C47061pl8) arrayList3.get(i13)).m18779I();
                                                if (m18779I.length() == 3) {
                                                    int i15 = 0;
                                                    while (i15 < m18779I.length()) {
                                                        int codePointAt = m18779I.codePointAt(i15);
                                                        if (Character.isLetter(codePointAt)) {
                                                            i15 += Character.charCount(codePointAt);
                                                        }
                                                    }
                                                }
                                            }
                                            mo22258a().m106887u().m42708a("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                            c39936dk85.m43801H(i12);
                                            m36315H(c39936dk85, "_c");
                                            m36316G(c39936dk85, 19, "currency");
                                            break;
                                        }
                                    }
                                    if ("_e".equals(c39936dk85.m43794Q())) {
                                        m36305R(this.f85314g);
                                        if (DV8.m110327k((C47051pk8) c39936dk85.m81476q(), str4) == null) {
                                            if (c39936dk84 != null && Math.abs(c39936dk84.m43806A() - c39936dk85.m43806A()) <= 1000) {
                                                C39936dk8 c39936dk86 = (C39936dk8) c39936dk84.mo81483h();
                                                if (m36307P(c39936dk85, c39936dk86)) {
                                                    c47674qn84.m17010W(i9, c39936dk86);
                                                    i8 = i10;
                                                    c39936dk83 = null;
                                                    c39936dk8 = null;
                                                    i4 = i2;
                                                    ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                                    i6 = i3 + 1;
                                                    c47674qn84.m17021P0(c39936dk85);
                                                    i7 = i;
                                                }
                                            }
                                            c39936dk8 = c39936dk85;
                                            c39936dk83 = c39936dk84;
                                            i8 = i3;
                                            i4 = i2;
                                            ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                            i6 = i3 + 1;
                                            c47674qn84.m17021P0(c39936dk85);
                                            i7 = i;
                                        }
                                        i8 = i10;
                                        c39936dk83 = c39936dk84;
                                        i4 = i2;
                                        ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                        i6 = i3 + 1;
                                        c47674qn84.m17021P0(c39936dk85);
                                        i7 = i;
                                    } else {
                                        if ("_vs".equals(c39936dk85.m43794Q())) {
                                            m36305R(this.f85314g);
                                            if (DV8.m110327k((C47051pk8) c39936dk85.m81476q(), str3) == null) {
                                                if (c39936dk8 != null && Math.abs(c39936dk8.m43806A() - c39936dk85.m43806A()) <= 1000) {
                                                    C39936dk8 c39936dk87 = (C39936dk8) c39936dk8.mo81483h();
                                                    if (m36307P(c39936dk87, c39936dk85)) {
                                                        c47674qn84.m17010W(i10, c39936dk87);
                                                        i8 = i10;
                                                        c39936dk83 = null;
                                                        c39936dk8 = null;
                                                        i4 = i2;
                                                        ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                                        i6 = i3 + 1;
                                                        c47674qn84.m17021P0(c39936dk85);
                                                        i7 = i;
                                                    }
                                                }
                                                i8 = i10;
                                                c39936dk83 = c39936dk85;
                                                i9 = i3;
                                                i4 = i2;
                                                ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                                i6 = i3 + 1;
                                                c47674qn84.m17021P0(c39936dk85);
                                                i7 = i;
                                            }
                                        }
                                        i8 = i10;
                                        c39936dk83 = c39936dk84;
                                        i4 = i2;
                                        ju8.f17698c.set(i4, (C47051pk8) c39936dk85.m81476q());
                                        i6 = i3 + 1;
                                        c47674qn84.m17021P0(c39936dk85);
                                        i7 = i;
                                    }
                                }
                                if ("_e".equals(c39936dk85.m43794Q())) {
                                }
                            }
                        }
                        c39936dk8 = c39936dk82;
                        int i16 = 0;
                        boolean z = false;
                        boolean z2 = false;
                        while (true) {
                            str3 = str9;
                            if (i16 >= c39936dk85.m43791y()) {
                                break;
                            }
                            if ("_c".equals(c39936dk85.m43795P(i16).m18780H())) {
                                C39946dl8 c39946dl8 = (C39946dl8) c39936dk85.m43795P(i16).m19208j();
                                c47674qn85 = c47674qn86;
                                str5 = str8;
                                c39946dl8.m43764I(1L);
                                c39936dk85.m43798M(i16, (C47061pl8) c39946dl8.m81476q());
                                z = true;
                            } else {
                                c47674qn85 = c47674qn86;
                                str5 = str8;
                                if ("_r".equals(c39936dk85.m43795P(i16).m18780H())) {
                                    C39946dl8 c39946dl82 = (C39946dl8) c39936dk85.m43795P(i16).m19208j();
                                    c39946dl82.m43764I(1L);
                                    c39936dk85.m43798M(i16, (C47061pl8) c39946dl82.m81476q());
                                    z2 = true;
                                }
                            }
                            i16++;
                            c47674qn86 = c47674qn85;
                            str9 = str3;
                            str8 = str5;
                        }
                        c47674qn84 = c47674qn86;
                        str4 = str8;
                        if (!z && m91584E) {
                            mo22258a().m106889s().m42707b("Marking event as conversion", this.f85319l.m89786D().m17332d(c39936dk85.m43794Q()));
                            C39946dl8 m18782F = C47061pl8.m18782F();
                            m18782F.m43763J("_c");
                            m18782F.m43764I(1L);
                            c39936dk85.m43804C(m18782F);
                        }
                        if (!z2) {
                            mo22258a().m106889s().m42707b("Marking event as real-time", this.f85319l.m89786D().m17332d(c39936dk85.m43794Q()));
                            C39946dl8 m18782F2 = C47061pl8.m18782F();
                            m18782F2.m43763J("_r");
                            m18782F2.m43764I(1L);
                            c39936dk85.m43804C(m18782F2);
                        }
                        C49481tq7 c49481tq74 = this.f85310c;
                        m36305R(c49481tq74);
                        if (c49481tq74.m11670T(m36317F(), ju8.f17696a.m111618W1(), false, false, false, false, true).f20252e > m36302U().m37515l(ju8.f17696a.m111618W1(), C37795a98.f49991q)) {
                            m36315H(c39936dk85, "_r");
                        } else {
                            i = 1;
                        }
                        if (OW8.m92079Z(c39936dk85.m43794Q()) && m91584E) {
                            C49481tq7 c49481tq75 = this.f85310c;
                            m36305R(c49481tq75);
                            if (c49481tq75.m11670T(m36317F(), ju8.f17696a.m111618W1(), false, false, true, false, false).f20250c > m36302U().m37515l(ju8.f17696a.m111618W1(), C37795a98.f49989p)) {
                                mo22258a().m106888t().m42707b("Too many conversions. Not logging as conversion. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()));
                                C39946dl8 c39946dl83 = null;
                                boolean z3 = false;
                                int i17 = -1;
                                for (int i18 = 0; i18 < c39936dk85.m43791y(); i18++) {
                                    C47061pl8 m43795P = c39936dk85.m43795P(i18);
                                    if ("_c".equals(m43795P.m18780H())) {
                                        c39946dl83 = (C39946dl8) m43795P.m19208j();
                                        i17 = i18;
                                    } else if ("_err".equals(m43795P.m18780H())) {
                                        z3 = true;
                                    }
                                }
                                if (z3) {
                                    if (c39946dl83 != null) {
                                        c39936dk85.m43801H(i17);
                                    } else {
                                        c39946dl83 = null;
                                    }
                                }
                                if (c39946dl83 != null) {
                                    C39946dl8 c39946dl84 = (C39946dl8) c39946dl83.mo81483h();
                                    c39946dl84.m43763J("_err");
                                    c39946dl84.m43764I(10L);
                                    c39936dk85.m43798M(i17, (C47061pl8) c39946dl84.m81476q());
                                } else {
                                    mo22258a().m106893o().m42707b("Did not find conversion parameter. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()));
                                }
                            }
                        }
                        if (m91584E) {
                        }
                        if ("_e".equals(c39936dk85.m43794Q())) {
                        }
                    }
                    i5 = i4 + 1;
                    c47674qn86 = c47674qn84;
                    str6 = str10;
                    str7 = str2;
                    c39936dk82 = c39936dk8;
                }
                String str12 = str6;
                C47674qn8 c47674qn87 = c47674qn86;
                long j3 = 0;
                int i19 = 0;
                while (i19 < i6) {
                    C47051pk8 m17032I0 = c47674qn87.m17032I0(i19);
                    if ("_e".equals(m17032I0.m18858I())) {
                        m36305R(this.f85314g);
                        if (DV8.m110327k(m17032I0, "_fr") != null) {
                            c47674qn87.m16976y(i19);
                            i6--;
                            i19--;
                            i19++;
                        }
                    }
                    m36305R(this.f85314g);
                    C47061pl8 m110327k = DV8.m110327k(m17032I0, "_et");
                    if (m110327k != null) {
                        Long valueOf = m110327k.m18765X() ? Long.valueOf(m110327k.m18783E()) : null;
                        if (valueOf != null && valueOf.longValue() > 0) {
                            j3 += valueOf.longValue();
                        }
                    }
                    i19++;
                }
                m36311L(c47674qn87, j3, false);
                Iterator it = c47674qn87.m17042B0().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("_s".equals(((C47051pk8) it.next()).m18858I())) {
                            C49481tq7 c49481tq76 = this.f85310c;
                            m36305R(c49481tq76);
                            c49481tq76.m11654j(c47674qn87.m16975y0(), "_se");
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (DV8.m110318t(c47674qn87, "_sid") >= 0) {
                    m36311L(c47674qn87, j3, true);
                } else {
                    int m110318t = DV8.m110318t(c47674qn87, "_se");
                    if (m110318t >= 0) {
                        c47674qn87.m16974z(m110318t);
                        mo22258a().m106893o().m42707b("Session engagement user property is in the bundle without session ID. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()));
                    }
                }
                DV8 dv8 = this.f85314g;
                m36305R(dv8);
                dv8.f100966a.mo22258a().m106889s().m42708a("Checking account type status for ad personalization signals");
                C34987Ok8 c34987Ok85 = dv8.f15489b.f85308a;
                m36305R(c34987Ok85);
                if (c34987Ok85.m91559y(c47674qn87.m16975y0())) {
                    C49481tq7 c49481tq77 = dv8.f15489b.f85310c;
                    m36305R(c49481tq77);
                    C47141pt8 m11672R = c49481tq77.m11672R(c47674qn87.m16975y0());
                    if (m11672R != null && m11672R.m18504L() && dv8.f100966a.m89750x().m99590p()) {
                        dv8.f100966a.mo22258a().m106894n().m42708a("Turning off ad personalization due to account type");
                        C52436yp8 m98256E = C34096Kp8.m98256E();
                        m98256E.m2515D(str12);
                        m98256E.m2514G(dv8.f100966a.m89750x().m99594l());
                        m98256E.m2516C(1L);
                        C34096Kp8 c34096Kp8 = (C34096Kp8) m98256E.m81476q();
                        int i20 = 0;
                        while (true) {
                            if (i20 < c47674qn87.m17038F0()) {
                                if (str12.equals(c47674qn87.m16977x0(i20).m98254G())) {
                                    c47674qn87.m16979v0(i20, c34096Kp8);
                                    break;
                                }
                                i20++;
                            } else {
                                c47674qn87.m17018R0(c34096Kp8);
                                break;
                            }
                        }
                    }
                }
                c47674qn87.m16984q0(LongCompanionObject.MAX_VALUE);
                c47674qn87.m17014U(Long.MIN_VALUE);
                for (int i21 = 0; i21 < c47674qn87.m16996e0(); i21++) {
                    C47051pk8 m17032I02 = c47674qn87.m17032I0(i21);
                    if (m17032I02.m18862E() < c47674qn87.m17034H0()) {
                        c47674qn87.m16984q0(m17032I02.m18862E());
                    }
                    if (m17032I02.m18862E() > c47674qn87.m17036G0()) {
                        c47674qn87.m17014U(m17032I02.m18862E());
                    }
                }
                c47674qn87.m16991g1();
                c47674qn87.m17015T0();
                C32835Ff7 c32835Ff7 = this.f85313f;
                m36305R(c32835Ff7);
                c47674qn87.m17030J0(c32835Ff7.m106760j(c47674qn87.m16975y0(), c47674qn87.m17042B0(), c47674qn87.m17040C0(), Long.valueOf(c47674qn87.m17034H0()), Long.valueOf(c47674qn87.m17036G0())));
                if (m36302U().m37525F(ju8.f17696a.m111618W1())) {
                    HashMap hashMap3 = new HashMap();
                    ArrayList arrayList4 = new ArrayList();
                    SecureRandom m92054r = m36283h0().m92054r();
                    int i22 = 0;
                    while (i22 < c47674qn87.m16996e0()) {
                        C39936dk8 c39936dk88 = (C39936dk8) c47674qn87.m17032I0(i22).m19208j();
                        if (c39936dk88.m43794Q().equals("_ep")) {
                            m36305R(this.f85314g);
                            String str13 = (String) DV8.m110326l((C47051pk8) c39936dk88.m81476q(), "_en");
                            C47160pv7 c47160pv7 = (C47160pv7) hashMap3.get(str13);
                            if (c47160pv7 == null) {
                                C49481tq7 c49481tq78 = this.f85310c;
                                m36305R(c49481tq78);
                                c47160pv7 = c49481tq78.m11668V(ju8.f17696a.m111618W1(), (String) Preconditions.checkNotNull(str13));
                                if (c47160pv7 != null) {
                                    hashMap3.put(str13, c47160pv7);
                                }
                            }
                            if (c47160pv7 != null && c47160pv7.f104332i == null) {
                                Long l2 = c47160pv7.f104333j;
                                if (l2 != null && l2.longValue() > 1) {
                                    m36305R(this.f85314g);
                                    DV8.m110329P(c39936dk88, "_sr", c47160pv7.f104333j);
                                }
                                Boolean bool = c47160pv7.f104334k;
                                if (bool != null && bool.booleanValue()) {
                                    m36305R(this.f85314g);
                                    DV8.m110329P(c39936dk88, "_efs", 1L);
                                }
                                arrayList4.add((C47051pk8) c39936dk88.m81476q());
                            }
                            c47674qn87.m17010W(i22, c39936dk88);
                        } else {
                            C34987Ok8 c34987Ok86 = this.f85308a;
                            m36305R(c34987Ok86);
                            String m111618W1 = ju8.f17696a.m111618W1();
                            String mo18891b = c34987Ok86.mo18891b(m111618W1, "measurement.account.time_zone_offset_minutes");
                            if (!TextUtils.isEmpty(mo18891b)) {
                                try {
                                    parseLong = Long.parseLong(mo18891b);
                                } catch (NumberFormatException e) {
                                    c34987Ok86.f100966a.mo22258a().m106888t().m42706c("Unable to parse timezone offset. appId", C32809Fc8.m106885w(m111618W1), e);
                                }
                                long m92047u02 = m36283h0().m92047u0(c39936dk88.m43806A(), parseLong);
                                C47051pk8 c47051pk8 = (C47051pk8) c39936dk88.m81476q();
                                Long l3 = 1L;
                                long j4 = parseLong;
                                if (!TextUtils.isEmpty("_dbg")) {
                                    Iterator it2 = c47051pk8.m18857J().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        C47061pl8 c47061pl8 = (C47061pl8) it2.next();
                                        Iterator it3 = it2;
                                        if (!"_dbg".equals(c47061pl8.m18780H())) {
                                            it2 = it3;
                                        } else if (l3.equals(Long.valueOf(c47061pl8.m18783E()))) {
                                            m91569o = 1;
                                        }
                                    }
                                }
                                C34987Ok8 c34987Ok87 = this.f85308a;
                                m36305R(c34987Ok87);
                                m91569o = c34987Ok87.m91569o(ju8.f17696a.m111618W1(), c39936dk88.m43794Q());
                                if (m91569o > 0) {
                                    mo22258a().m106888t().m42706c("Sample rate must be positive. event, rate", c39936dk88.m43794Q(), Integer.valueOf(m91569o));
                                    arrayList4.add((C47051pk8) c39936dk88.m81476q());
                                    c47674qn87.m17010W(i22, c39936dk88);
                                } else {
                                    C47160pv7 c47160pv72 = (C47160pv7) hashMap3.get(c39936dk88.m43794Q());
                                    if (c47160pv72 == null) {
                                        C49481tq7 c49481tq79 = this.f85310c;
                                        m36305R(c49481tq79);
                                        c47160pv72 = c49481tq79.m11668V(ju8.f17696a.m111618W1(), c39936dk88.m43794Q());
                                        if (c47160pv72 == null) {
                                            j2 = m92047u02;
                                            mo22258a().m106888t().m42706c("Event being bundled has no eventAggregate. appId, eventName", ju8.f17696a.m111618W1(), c39936dk88.m43794Q());
                                            c47160pv72 = new C47160pv7(ju8.f17696a.m111618W1(), c39936dk88.m43794Q(), 1L, 1L, 1L, c39936dk88.m43806A(), 0L, null, null, null, null);
                                            m36305R(this.f85314g);
                                            Long l4 = (Long) DV8.m110326l((C47051pk8) c39936dk88.m81476q(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l4 == null);
                                            if (m91569o != 1) {
                                                arrayList4.add((C47051pk8) c39936dk88.m81476q());
                                                if (valueOf2.booleanValue() && (c47160pv72.f104332i != null || c47160pv72.f104333j != null || c47160pv72.f104334k != null)) {
                                                    hashMap3.put(c39936dk88.m43794Q(), c47160pv72.m18425a(null, null, null));
                                                }
                                                c47674qn87.m17010W(i22, c39936dk88);
                                            } else {
                                                if (m92054r.nextInt(m91569o) == 0) {
                                                    m36305R(this.f85314g);
                                                    Long valueOf3 = Long.valueOf(m91569o);
                                                    DV8.m110329P(c39936dk88, "_sr", valueOf3);
                                                    arrayList4.add((C47051pk8) c39936dk88.m81476q());
                                                    if (valueOf2.booleanValue()) {
                                                        c47160pv72 = c47160pv72.m18425a(null, valueOf3, null);
                                                    }
                                                    hashMap3.put(c39936dk88.m43794Q(), c47160pv72.m18424b(c39936dk88.m43806A(), j2));
                                                    arrayList2 = arrayList4;
                                                    secureRandom = m92054r;
                                                    c47674qn83 = c47674qn87;
                                                    hashMap2 = hashMap3;
                                                } else {
                                                    long j5 = j2;
                                                    secureRandom = m92054r;
                                                    Long l5 = c47160pv72.f104331h;
                                                    if (l5 != null) {
                                                        m92047u0 = l5.longValue();
                                                        hashMap = hashMap3;
                                                        arrayList = arrayList4;
                                                        l = l4;
                                                        c47674qn82 = c47674qn87;
                                                    } else {
                                                        l = l4;
                                                        c47674qn82 = c47674qn87;
                                                        hashMap = hashMap3;
                                                        arrayList = arrayList4;
                                                        m92047u0 = m36283h0().m92047u0(c39936dk88.m43790z(), j4);
                                                    }
                                                    if (m92047u0 != j5) {
                                                        m36305R(this.f85314g);
                                                        DV8.m110329P(c39936dk88, "_efs", 1L);
                                                        m36305R(this.f85314g);
                                                        Long valueOf4 = Long.valueOf(m91569o);
                                                        DV8.m110329P(c39936dk88, "_sr", valueOf4);
                                                        arrayList2 = arrayList;
                                                        arrayList2.add((C47051pk8) c39936dk88.m81476q());
                                                        if (valueOf2.booleanValue()) {
                                                            c47160pv72 = c47160pv72.m18425a(null, valueOf4, Boolean.TRUE);
                                                        }
                                                        hashMap2 = hashMap;
                                                        hashMap2.put(c39936dk88.m43794Q(), c47160pv72.m18424b(c39936dk88.m43806A(), j5));
                                                    } else {
                                                        hashMap2 = hashMap;
                                                        arrayList2 = arrayList;
                                                        if (valueOf2.booleanValue()) {
                                                            hashMap2.put(c39936dk88.m43794Q(), c47160pv72.m18425a(l, null, null));
                                                        }
                                                    }
                                                    c47674qn83 = c47674qn82;
                                                }
                                                c47674qn83.m17010W(i22, c39936dk88);
                                                i22++;
                                                c47674qn87 = c47674qn83;
                                                hashMap3 = hashMap2;
                                                arrayList4 = arrayList2;
                                                m92054r = secureRandom;
                                            }
                                        }
                                    }
                                    j2 = m92047u02;
                                    m36305R(this.f85314g);
                                    Long l42 = (Long) DV8.m110326l((C47051pk8) c39936dk88.m81476q(), "_eid");
                                    Boolean valueOf22 = Boolean.valueOf(l42 == null);
                                    if (m91569o != 1) {
                                    }
                                }
                            }
                            parseLong = 0;
                            long m92047u022 = m36283h0().m92047u0(c39936dk88.m43806A(), parseLong);
                            C47051pk8 c47051pk82 = (C47051pk8) c39936dk88.m81476q();
                            Long l32 = 1L;
                            long j42 = parseLong;
                            if (!TextUtils.isEmpty("_dbg")) {
                            }
                            C34987Ok8 c34987Ok872 = this.f85308a;
                            m36305R(c34987Ok872);
                            m91569o = c34987Ok872.m91569o(ju8.f17696a.m111618W1(), c39936dk88.m43794Q());
                            if (m91569o > 0) {
                            }
                        }
                        arrayList2 = arrayList4;
                        secureRandom = m92054r;
                        c47674qn83 = c47674qn87;
                        hashMap2 = hashMap3;
                        i22++;
                        c47674qn87 = c47674qn83;
                        hashMap3 = hashMap2;
                        arrayList4 = arrayList2;
                        m92054r = secureRandom;
                    }
                    HashMap hashMap4 = hashMap3;
                    ArrayList arrayList5 = arrayList4;
                    c47674qn8 = c47674qn87;
                    if (arrayList5.size() < c47674qn8.m16996e0()) {
                        c47674qn8.m17008X0();
                        c47674qn8.m17029K0(arrayList5);
                    }
                    for (Map.Entry entry : hashMap4.entrySet()) {
                        C49481tq7 c49481tq710 = this.f85310c;
                        m36305R(c49481tq710);
                        c49481tq710.m11650n((C47160pv7) entry.getValue());
                    }
                } else {
                    c47674qn8 = c47674qn87;
                }
                String m111618W12 = ju8.f17696a.m111618W1();
                C49481tq7 c49481tq711 = this.f85310c;
                m36305R(c49481tq711);
                C47141pt8 m11672R2 = c49481tq711.m11672R(m111618W12);
                if (m11672R2 == null) {
                    mo22258a().m106893o().m42707b("Bundling raw events w/o app info. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()));
                } else if (c47674qn8.m16996e0() > 0) {
                    long m18486b0 = m11672R2.m18486b0();
                    if (m18486b0 != 0) {
                        c47674qn8.m16992g0(m18486b0);
                    } else {
                        c47674qn8.m16999c1();
                    }
                    long m18482d0 = m11672R2.m18482d0();
                    if (m18482d0 != 0) {
                        m18486b0 = m18482d0;
                    }
                    if (m18486b0 != 0) {
                        c47674qn8.m16990h0(m18486b0);
                    } else {
                        c47674qn8.m16997d1();
                    }
                    m11672R2.m18479f();
                    c47674qn8.m17033I((int) m11672R2.m18484c0());
                    m11672R2.m18512D(c47674qn8.m17034H0());
                    m11672R2.m18514B(c47674qn8.m17036G0());
                    String m18474h0 = m11672R2.m18474h0();
                    if (m18474h0 != null) {
                        c47674qn8.m17004a0(m18474h0);
                    } else {
                        c47674qn8.m17005Z0();
                    }
                    C49481tq7 c49481tq712 = this.f85310c;
                    m36305R(c49481tq712);
                    c49481tq712.m11651m(m11672R2);
                }
                if (c47674qn8.m16996e0() > 0) {
                    this.f85319l.mo22259C();
                    C34987Ok8 c34987Ok88 = this.f85308a;
                    m36305R(c34987Ok88);
                    C32143Cg8 m91567q = c34987Ok88.m91567q(ju8.f17696a.m111618W1());
                    try {
                        try {
                            if (m91567q != null && m91567q.m111880V()) {
                                c47674qn8.m17027M(m91567q.m111897D());
                                c49481tq7 = this.f85310c;
                                m36305R(c49481tq7);
                                c32206Cn8 = (C32206Cn8) c47674qn8.m81476q();
                                c49481tq7.mo19953e();
                                c49481tq7.m83601f();
                                Preconditions.checkNotNull(c32206Cn8);
                                Preconditions.checkNotEmpty(c32206Cn8.m111618W1());
                                Preconditions.checkState(c32206Cn8.m111585m1());
                                c49481tq7.m11656h0();
                                currentTimeMillis = c49481tq7.f100966a.mo22260A().currentTimeMillis();
                                m111658I1 = c32206Cn8.m111658I1();
                                c49481tq7.f100966a.m89751w();
                                if (m111658I1 >= currentTimeMillis - C41723gl7.m37521f()) {
                                    long m111658I12 = c32206Cn8.m111658I1();
                                    c49481tq7.f100966a.m89751w();
                                }
                                c49481tq7.f100966a.mo22258a().m106888t().m42705d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C32809Fc8.m106885w(c32206Cn8.m111618W1()), Long.valueOf(currentTimeMillis), Long.valueOf(c32206Cn8.m111658I1()));
                                byte[] m88653c = c32206Cn8.m88653c();
                                DV8 dv82 = c49481tq7.f15489b.f85314g;
                                m36305R(dv82);
                                byte[] m110330O = dv82.m110330O(m88653c);
                                c49481tq7.f100966a.mo22258a().m106889s().m42707b("Saving bundle, size", Integer.valueOf(m110330O.length));
                                contentValues = new ContentValues();
                                contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, c32206Cn8.m111618W1());
                                contentValues.put("bundle_end_timestamp", Long.valueOf(c32206Cn8.m111658I1()));
                                contentValues.put(MessageExtension.FIELD_DATA, m110330O);
                                contentValues.put("has_realtime", Integer.valueOf(i));
                                if (c32206Cn8.m111573s1()) {
                                    contentValues.put("retry_count", Integer.valueOf(c32206Cn8.m111676C1()));
                                }
                                if (c49481tq7.m11674P().insert("queue", null, contentValues) == -1) {
                                    c49481tq7.f100966a.mo22258a().m106893o().m42707b("Failed to insert bundle (got -1). appId", C32809Fc8.m106885w(c32206Cn8.m111618W1()));
                                }
                            }
                            if (c49481tq7.m11674P().insert("queue", null, contentValues) == -1) {
                            }
                        } catch (SQLiteException e2) {
                            c49481tq7.f100966a.mo22258a().m106893o().m42706c("Error storing bundle. appId", C32809Fc8.m106885w(c32206Cn8.m111618W1()), e2);
                        }
                        DV8 dv822 = c49481tq7.f15489b.f85314g;
                        m36305R(dv822);
                        byte[] m110330O2 = dv822.m110330O(m88653c);
                        c49481tq7.f100966a.mo22258a().m106889s().m42707b("Saving bundle, size", Integer.valueOf(m110330O2.length));
                        contentValues = new ContentValues();
                        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, c32206Cn8.m111618W1());
                        contentValues.put("bundle_end_timestamp", Long.valueOf(c32206Cn8.m111658I1()));
                        contentValues.put(MessageExtension.FIELD_DATA, m110330O2);
                        contentValues.put("has_realtime", Integer.valueOf(i));
                        if (c32206Cn8.m111573s1()) {
                        }
                    } catch (IOException e3) {
                        c49481tq7.f100966a.mo22258a().m106893o().m42706c("Data loss. Failed to serialize bundle. appId", C32809Fc8.m106885w(c32206Cn8.m111618W1()), e3);
                    }
                    if (ju8.f17696a.m111663H().isEmpty()) {
                        c47674qn8.m17027M(-1L);
                    } else {
                        mo22258a().m106888t().m42707b("Did not find measurement config or missing version info. appId", C32809Fc8.m106885w(ju8.f17696a.m111618W1()));
                    }
                    c49481tq7 = this.f85310c;
                    m36305R(c49481tq7);
                    c32206Cn8 = (C32206Cn8) c47674qn8.m81476q();
                    c49481tq7.mo19953e();
                    c49481tq7.m83601f();
                    Preconditions.checkNotNull(c32206Cn8);
                    Preconditions.checkNotEmpty(c32206Cn8.m111618W1());
                    Preconditions.checkState(c32206Cn8.m111585m1());
                    c49481tq7.m11656h0();
                    currentTimeMillis = c49481tq7.f100966a.mo22260A().currentTimeMillis();
                    m111658I1 = c32206Cn8.m111658I1();
                    c49481tq7.f100966a.m89751w();
                    if (m111658I1 >= currentTimeMillis - C41723gl7.m37521f()) {
                    }
                    c49481tq7.f100966a.mo22258a().m106888t().m42705d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C32809Fc8.m106885w(c32206Cn8.m111618W1()), Long.valueOf(currentTimeMillis), Long.valueOf(c32206Cn8.m111658I1()));
                    byte[] m88653c2 = c32206Cn8.m88653c();
                }
                C49481tq7 c49481tq713 = this.f85310c;
                m36305R(c49481tq713);
                List list2 = ju8.f17697b;
                Preconditions.checkNotNull(list2);
                c49481tq713.mo19953e();
                c49481tq713.m83601f();
                StringBuilder sb = new StringBuilder("rowid in (");
                for (int i23 = 0; i23 < list2.size(); i23++) {
                    if (i23 != 0) {
                        sb.append(",");
                    }
                    sb.append(((Long) list2.get(i23)).longValue());
                }
                sb.append(")");
                int delete = c49481tq713.m11674P().delete("raw_events", sb.toString(), null);
                if (delete != list2.size()) {
                    c49481tq713.f100966a.mo22258a().m106893o().m42706c("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                }
                C49481tq7 c49481tq714 = this.f85310c;
                m36305R(c49481tq714);
                try {
                    c49481tq714.m11674P().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{m111618W12, m111618W12});
                } catch (SQLiteException e4) {
                    c49481tq714.f100966a.mo22258a().m106893o().m42706c("Failed to remove unused event metadata. appId", C32809Fc8.m106885w(m111618W12), e4);
                }
                C49481tq7 c49481tq715 = this.f85310c;
                m36305R(c49481tq715);
                c49481tq715.m11652l();
                C49481tq7 c49481tq716 = this.f85310c;
                m36305R(c49481tq716);
                c49481tq716.m11658f0();
                return true;
            }
            C49481tq7 c49481tq717 = this.f85310c;
            m36305R(c49481tq717);
            c49481tq717.m11652l();
            C49481tq7 c49481tq718 = this.f85310c;
            m36305R(c49481tq718);
            c49481tq718.m11658f0();
            return false;
        } catch (Throwable th) {
            C49481tq7 c49481tq719 = this.f85310c;
            m36305R(c49481tq719);
            c49481tq719.m11658f0();
            throw th;
        }
    }

    /* renamed from: O */
    public final boolean m36308O() {
        mo22257c().mo19953e();
        m36292d();
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        if (!c49481tq7.m11649o()) {
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            if (TextUtils.isEmpty(c49481tq72.m11664Z())) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: P */
    public final boolean m36307P(C39936dk8 c39936dk8, C39936dk8 c39936dk82) {
        String m18779I;
        Preconditions.checkArgument("_e".equals(c39936dk8.m43794Q()));
        m36305R(this.f85314g);
        C47061pl8 m110327k = DV8.m110327k((C47051pk8) c39936dk8.m81476q(), "_sc");
        String str = null;
        if (m110327k == null) {
            m18779I = null;
        } else {
            m18779I = m110327k.m18779I();
        }
        m36305R(this.f85314g);
        C47061pl8 m110327k2 = DV8.m110327k((C47051pk8) c39936dk82.m81476q(), "_pc");
        if (m110327k2 != null) {
            str = m110327k2.m18779I();
        }
        if (str != null && str.equals(m18779I)) {
            Preconditions.checkArgument("_e".equals(c39936dk8.m43794Q()));
            m36305R(this.f85314g);
            C47061pl8 m110327k3 = DV8.m110327k((C47051pk8) c39936dk8.m81476q(), "_et");
            if (m110327k3 != null && m110327k3.m18765X() && m110327k3.m18783E() > 0) {
                long m18783E = m110327k3.m18783E();
                m36305R(this.f85314g);
                C47061pl8 m110327k4 = DV8.m110327k((C47051pk8) c39936dk82.m81476q(), "_et");
                if (m110327k4 != null && m110327k4.m18783E() > 0) {
                    m18783E += m110327k4.m18783E();
                }
                m36305R(this.f85314g);
                DV8.m110329P(c39936dk82, "_et", Long.valueOf(m18783E));
                m36305R(this.f85314g);
                DV8.m110329P(c39936dk8, "_fr", 1L);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: S */
    public final C47141pt8 m36304S(zzq zzqVar) {
        String str;
        mo22257c().mo19953e();
        m36292d();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        if (!zzqVar.f71563x.isEmpty()) {
            this.f85304B.put(zzqVar.f71541b, new WU8(this, zzqVar.f71563x));
        }
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        C47141pt8 m11672R = c49481tq7.m11672R(zzqVar.f71541b);
        C37110Xm7 m76363c = m36301V(zzqVar.f71541b).m76363c(C37110Xm7.m76364b(zzqVar.f71562w));
        EnumC39344cm7 enumC39344cm7 = EnumC39344cm7.AD_STORAGE;
        if (m76363c.m76357i(enumC39344cm7)) {
            str = this.f85316i.m79905l(zzqVar.f71541b, zzqVar.f71555p);
        } else {
            str = "";
        }
        if (m11672R == null) {
            m11672R = new C47141pt8(this.f85319l, zzqVar.f71541b);
            if (m76363c.m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
                m11672R.m18473i(m36281i0(m76363c));
            }
            if (m76363c.m76357i(enumC39344cm7)) {
                m11672R.m18509G(str);
            }
        } else if (m76363c.m76357i(enumC39344cm7) && str != null && !str.equals(m11672R.m18487b())) {
            m11672R.m18509G(str);
            if (zzqVar.f71555p && !"00000000-0000-0000-0000-000000000000".equals(this.f85316i.m79906k(zzqVar.f71541b, m76363c).first)) {
                m11672R.m18473i(m36281i0(m76363c));
                C49481tq7 c49481tq72 = this.f85310c;
                m36305R(c49481tq72);
                if (c49481tq72.m11666X(zzqVar.f71541b, TransferTable.COLUMN_ID) != null) {
                    C49481tq7 c49481tq73 = this.f85310c;
                    m36305R(c49481tq73);
                    if (c49481tq73.m11666X(zzqVar.f71541b, "_lair") == null) {
                        C47508qW8 c47508qW8 = new C47508qW8(zzqVar.f71541b, "auto", "_lair", mo22260A().currentTimeMillis(), 1L);
                        C49481tq7 c49481tq74 = this.f85310c;
                        m36305R(c49481tq74);
                        c49481tq74.m11643u(c47508qW8);
                    }
                }
            }
        } else if (TextUtils.isEmpty(m11672R.m18470j0()) && m76363c.m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
            m11672R.m18473i(m36281i0(m76363c));
        }
        m11672R.m18452x(zzqVar.f71542c);
        m11672R.m18477g(zzqVar.f71557r);
        if (!TextUtils.isEmpty(zzqVar.f71551l)) {
            m11672R.m18453w(zzqVar.f71551l);
        }
        long j = zzqVar.f71545f;
        if (j != 0) {
            m11672R.m18451y(j);
        }
        if (!TextUtils.isEmpty(zzqVar.f71543d)) {
            m11672R.m18469k(zzqVar.f71543d);
        }
        m11672R.m18467l(zzqVar.f71550k);
        String str2 = zzqVar.f71544e;
        if (str2 != null) {
            m11672R.m18471j(str2);
        }
        m11672R.m18456t(zzqVar.f71546g);
        m11672R.m18511E(zzqVar.f71548i);
        if (!TextUtils.isEmpty(zzqVar.f71547h)) {
            m11672R.m18450z(zzqVar.f71547h);
        }
        m11672R.m18475h(zzqVar.f71555p);
        m11672R.m18510F(zzqVar.f71558s);
        m11672R.m18455u(zzqVar.f71559t);
        C49423tk9.m11813b();
        if (m36302U().m37502y(null, C37795a98.f49988o0) || m36302U().m37502y(zzqVar.f71541b, C37795a98.f49992q0)) {
            m11672R.m18507I(zzqVar.f71564y);
        }
        Nb9.m93712b();
        if (m36302U().m37502y(null, C37795a98.f49986n0)) {
            m11672R.m18508H(zzqVar.f71560u);
        } else {
            Nb9.m93712b();
            if (m36302U().m37502y(null, C37795a98.f49984m0)) {
                m11672R.m18508H(null);
            }
        }
        Wl9.m77848b();
        if (m36302U().m37502y(null, C37795a98.f49996s0)) {
            m11672R.m18506J(zzqVar.f71565z);
        }
        Yg9.m74465b();
        if (m36302U().m37502y(null, C37795a98.f49936G0)) {
            m11672R.m18505K(zzqVar.f71540A);
        }
        if (m11672R.m18502N()) {
            C49481tq7 c49481tq75 = this.f85310c;
            m36305R(c49481tq75);
            c49481tq75.m11651m(m11672R);
        }
        return m11672R;
    }

    /* renamed from: T */
    public final C32835Ff7 m36303T() {
        C32835Ff7 c32835Ff7 = this.f85313f;
        m36305R(c32835Ff7);
        return c32835Ff7;
    }

    /* renamed from: U */
    public final C41723gl7 m36302U() {
        return ((C35248Pn8) Preconditions.checkNotNull(this.f85319l)).m89751w();
    }

    /* renamed from: V */
    public final C37110Xm7 m36301V(String str) {
        String str2;
        C37110Xm7 c37110Xm7 = C37110Xm7.f43902b;
        mo22257c().mo19953e();
        m36292d();
        C37110Xm7 c37110Xm72 = (C37110Xm7) this.f85303A.get(str);
        if (c37110Xm72 == null) {
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            Preconditions.checkNotNull(str);
            c49481tq7.mo19953e();
            c49481tq7.m83601f();
            Cursor cursor = null;
            try {
                try {
                    cursor = c49481tq7.m11674P().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    C37110Xm7 m76364b = C37110Xm7.m76364b(str2);
                    m36263x(str, m76364b);
                    return m76364b;
                } catch (SQLiteException e) {
                    c49481tq7.f100966a.mo22258a().m106893o().m42706c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e);
                    throw e;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return c37110Xm72;
    }

    /* renamed from: W */
    public final C49481tq7 m36300W() {
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        return c49481tq7;
    }

    /* renamed from: X */
    public final C47554qb8 m36299X() {
        return this.f85319l.m89786D();
    }

    /* renamed from: Y */
    public final C38682bf8 m36298Y() {
        C38682bf8 c38682bf8 = this.f85309b;
        m36305R(c38682bf8);
        return c38682bf8;
    }

    /* renamed from: Z */
    public final C32602Ef8 m36297Z() {
        C32602Ef8 c32602Ef8 = this.f85311d;
        if (c32602Ef8 != null) {
            return c32602Ef8;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: a */
    public final C32809Fc8 mo22258a() {
        return ((C35248Pn8) Preconditions.checkNotNull(this.f85319l)).mo22258a();
    }

    /* renamed from: a0 */
    public final C34987Ok8 m36296a0() {
        C34987Ok8 c34987Ok8 = this.f85308a;
        m36305R(c34987Ok8);
        return c34987Ok8;
    }

    @VisibleForTesting
    /* renamed from: b */
    public final void m36295b() {
        mo22257c().mo19953e();
        m36292d();
        if (!this.f85321n) {
            this.f85321n = true;
            if (m36318E()) {
                FileChannel fileChannel = this.f85330w;
                mo22257c().mo19953e();
                int i = 0;
                if (fileChannel != null && fileChannel.isOpen()) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    try {
                        fileChannel.position(0L);
                        int read = fileChannel.read(allocate);
                        if (read != 4) {
                            if (read != -1) {
                                mo22258a().m106888t().m42707b("Unexpected data length. Bytes read", Integer.valueOf(read));
                            }
                        } else {
                            allocate.flip();
                            i = allocate.getInt();
                        }
                    } catch (IOException e) {
                        mo22258a().m106893o().m42707b("Failed to read from channel", e);
                    }
                } else {
                    mo22258a().m106893o().m42708a("Bad channel to read from");
                }
                int m27129m = this.f85319l.m89749y().m27129m();
                mo22257c().mo19953e();
                if (i > m27129m) {
                    mo22258a().m106893o().m42706c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(m27129m));
                } else if (i < m27129m) {
                    FileChannel fileChannel2 = this.f85330w;
                    mo22257c().mo19953e();
                    if (fileChannel2 != null && fileChannel2.isOpen()) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(4);
                        allocate2.putInt(m27129m);
                        allocate2.flip();
                        try {
                            fileChannel2.truncate(0L);
                            fileChannel2.write(allocate2);
                            fileChannel2.force(true);
                            if (fileChannel2.size() != 4) {
                                mo22258a().m106893o().m42707b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                            }
                            mo22258a().m106889s().m42706c("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(m27129m));
                            return;
                        } catch (IOException e2) {
                            mo22258a().m106893o().m42707b("Failed to write to channel", e2);
                        }
                    } else {
                        mo22258a().m106893o().m42708a("Bad channel to read from");
                    }
                    mo22258a().m106893o().m42706c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(m27129m));
                }
            }
        }
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: c */
    public final C39965dn8 mo22257c() {
        return ((C35248Pn8) Preconditions.checkNotNull(this.f85319l)).mo22257c();
    }

    /* renamed from: c0 */
    public final C35248Pn8 m36293c0() {
        return this.f85319l;
    }

    /* renamed from: d */
    public final void m36292d() {
        if (!this.f85320m) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* renamed from: d0 */
    public final YD8 m36291d0() {
        YD8 yd8 = this.f85315h;
        m36305R(yd8);
        return yd8;
    }

    /* renamed from: e */
    public final void m36290e(String str, C47674qn8 c47674qn8) {
        int m110318t;
        int indexOf;
        C34987Ok8 c34987Ok8 = this.f85308a;
        m36305R(c34987Ok8);
        Set m91562v = c34987Ok8.m91562v(str);
        if (m91562v != null) {
            c47674qn8.m17026M0(m91562v);
        }
        C34987Ok8 c34987Ok82 = this.f85308a;
        m36305R(c34987Ok82);
        if (c34987Ok82.m91579J(str)) {
            c47674qn8.m17013U0();
        }
        C34987Ok8 c34987Ok83 = this.f85308a;
        m36305R(c34987Ok83);
        if (c34987Ok83.m91576M(str)) {
            if (m36302U().m37502y(str, C37795a98.f49998t0)) {
                String m17044A0 = c47674qn8.m17044A0();
                if (!TextUtils.isEmpty(m17044A0) && (indexOf = m17044A0.indexOf(InstructionFileId.DOT)) != -1) {
                    c47674qn8.m17000c0(m17044A0.substring(0, indexOf));
                }
            } else {
                c47674qn8.m17001b1();
            }
        }
        C34987Ok8 c34987Ok84 = this.f85308a;
        m36305R(c34987Ok84);
        if (c34987Ok84.m91575N(str) && (m110318t = DV8.m110318t(c47674qn8, TransferTable.COLUMN_ID)) != -1) {
            c47674qn8.m16974z(m110318t);
        }
        C34987Ok8 c34987Ok85 = this.f85308a;
        m36305R(c34987Ok85);
        if (c34987Ok85.m91577L(str)) {
            c47674qn8.m17011V0();
        }
        C34987Ok8 c34987Ok86 = this.f85308a;
        m36305R(c34987Ok86);
        if (c34987Ok86.m91580I(str)) {
            c47674qn8.m17016S0();
            WU8 wu8 = (WU8) this.f85304B.get(str);
            if (wu8 == null || wu8.f41163b + m36302U().m37512o(str, C37795a98.f49954V) < mo22260A().elapsedRealtime()) {
                wu8 = new WU8(this);
                this.f85304B.put(str, wu8);
            }
            c47674qn8.m17012V(wu8.f41162a);
        }
        C34987Ok8 c34987Ok87 = this.f85308a;
        m36305R(c34987Ok87);
        if (c34987Ok87.m91578K(str)) {
            c47674qn8.m16993f1();
        }
    }

    /* renamed from: e0 */
    public final VN8 m36289e0() {
        return this.f85316i;
    }

    /* renamed from: f */
    public final void m36288f(C47141pt8 c47141pt8) {
        mo22257c().mo19953e();
        if (TextUtils.isEmpty(c47141pt8.m18462n0()) && TextUtils.isEmpty(c47141pt8.m18476g0())) {
            m36278k((String) Preconditions.checkNotNull(c47141pt8.m18472i0()), 204, null, null, null);
            return;
        }
        C51621xS8 c51621xS8 = this.f85317j;
        Uri.Builder builder = new Uri.Builder();
        String m18462n0 = c47141pt8.m18462n0();
        if (TextUtils.isEmpty(m18462n0)) {
            m18462n0 = c47141pt8.m18476g0();
        }
        C28385so c28385so = null;
        Uri.Builder appendQueryParameter = builder.scheme((String) C37795a98.f49971g.m97658a(null)).encodedAuthority((String) C37795a98.f49973h.m97658a(null)).path("config/app/".concat(String.valueOf(m18462n0))).appendQueryParameter("platform", "android");
        c51621xS8.f100966a.m89751w().m37513n();
        appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(77000L)).appendQueryParameter("runtime_version", "0");
        String uri = builder.build().toString();
        try {
            String str = (String) Preconditions.checkNotNull(c47141pt8.m18472i0());
            URL url = new URL(uri);
            mo22258a().m106889s().m42707b("Fetching remote configuration", str);
            C34987Ok8 c34987Ok8 = this.f85308a;
            m36305R(c34987Ok8);
            C32143Cg8 m91567q = c34987Ok8.m91567q(str);
            C34987Ok8 c34987Ok82 = this.f85308a;
            m36305R(c34987Ok82);
            String m91565s = c34987Ok82.m91565s(str);
            if (m91567q != null) {
                if (!TextUtils.isEmpty(m91565s)) {
                    C28385so c28385so2 = new C28385so();
                    c28385so2.put(Headers.GET_OBJECT_IF_MODIFIED_SINCE, m91565s);
                    c28385so = c28385so2;
                }
                C34987Ok8 c34987Ok83 = this.f85308a;
                m36305R(c34987Ok83);
                String m91566r = c34987Ok83.m91566r(str);
                if (!TextUtils.isEmpty(m91566r)) {
                    if (c28385so == null) {
                        c28385so = new C28385so();
                    }
                    c28385so.put(Headers.GET_OBJECT_IF_NONE_MATCH, m91566r);
                }
            }
            this.f85326s = true;
            C38682bf8 c38682bf8 = this.f85309b;
            m36305R(c38682bf8);
            VS8 vs8 = new VS8(this);
            c38682bf8.mo19953e();
            c38682bf8.m83601f();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(vs8);
            c38682bf8.f100966a.mo22257c().m43696v(new RunnableC36328Ud8(c38682bf8, str, url, null, c28385so, vs8));
        } catch (MalformedURLException unused) {
            mo22258a().m106893o().m42706c("Failed to parse config URL. Not fetching. appId", C32809Fc8.m106885w(c47141pt8.m18472i0()), uri);
        }
    }

    /* renamed from: g */
    public final void m36286g(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> m11662b0;
        List<zzac> m11662b02;
        List<zzac> m11662b03;
        String str;
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        mo22257c().mo19953e();
        m36292d();
        String str2 = zzqVar.f71541b;
        long j = zzawVar.f71532e;
        C36319Uc8 m81227b = C36319Uc8.m81227b(zzawVar);
        mo22257c().mo19953e();
        C50902wE8 c50902wE8 = null;
        if (this.f85305C != null && (str = this.f85306D) != null && str.equals(str2)) {
            c50902wE8 = this.f85305C;
        }
        OW8.m92046v(c50902wE8, m81227b.f37693d, false);
        zzaw m81228a = m81227b.m81228a();
        m36305R(this.f85314g);
        if (!DV8.m110328j(m81228a, zzqVar)) {
            return;
        }
        if (!zzqVar.f71548i) {
            m36304S(zzqVar);
            return;
        }
        List list = zzqVar.f71560u;
        if (list != null) {
            if (list.contains(m81228a.f71529b)) {
                Bundle m50583u = m81228a.f71530c.m50583u();
                m50583u.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(m81228a.f71529b, new zzau(m50583u), m81228a.f71531d, m81228a.f71532e);
            } else {
                mo22258a().m106894n().m42705d("Dropping non-safelisted event. appId, event name, origin", str2, m81228a.f71529b, m81228a.f71531d);
                return;
            }
        } else {
            zzawVar2 = m81228a;
        }
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        c49481tq7.m11659e0();
        try {
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            Preconditions.checkNotEmpty(str2);
            c49481tq72.mo19953e();
            c49481tq72.m83601f();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i < 0) {
                c49481tq72.f100966a.mo22258a().m106888t().m42706c("Invalid time querying timed out conditional properties", C32809Fc8.m106885w(str2), Long.valueOf(j));
                m11662b0 = Collections.emptyList();
            } else {
                m11662b0 = c49481tq72.m11662b0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            }
            for (zzac zzacVar : m11662b0) {
                if (zzacVar != null) {
                    mo22258a().m106889s().m42705d("User property timed out", zzacVar.f71517b, this.f85319l.m89786D().m17330f(zzacVar.f71519d.f71534c), zzacVar.f71519d.m50581s());
                    zzaw zzawVar3 = zzacVar.f71523h;
                    if (zzawVar3 != null) {
                        m36319D(new zzaw(zzawVar3, j), zzqVar);
                    }
                    C49481tq7 c49481tq73 = this.f85310c;
                    m36305R(c49481tq73);
                    c49481tq73.m11680J(str2, zzacVar.f71519d.f71534c);
                }
            }
            C49481tq7 c49481tq74 = this.f85310c;
            m36305R(c49481tq74);
            Preconditions.checkNotEmpty(str2);
            c49481tq74.mo19953e();
            c49481tq74.m83601f();
            if (i < 0) {
                c49481tq74.f100966a.mo22258a().m106888t().m42706c("Invalid time querying expired conditional properties", C32809Fc8.m106885w(str2), Long.valueOf(j));
                m11662b02 = Collections.emptyList();
            } else {
                m11662b02 = c49481tq74.m11662b0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            }
            ArrayList<zzaw> arrayList = new ArrayList(m11662b02.size());
            for (zzac zzacVar2 : m11662b02) {
                if (zzacVar2 != null) {
                    mo22258a().m106889s().m42705d("User property expired", zzacVar2.f71517b, this.f85319l.m89786D().m17330f(zzacVar2.f71519d.f71534c), zzacVar2.f71519d.m50581s());
                    C49481tq7 c49481tq75 = this.f85310c;
                    m36305R(c49481tq75);
                    c49481tq75.m11654j(str2, zzacVar2.f71519d.f71534c);
                    zzaw zzawVar4 = zzacVar2.f71527l;
                    if (zzawVar4 != null) {
                        arrayList.add(zzawVar4);
                    }
                    C49481tq7 c49481tq76 = this.f85310c;
                    m36305R(c49481tq76);
                    c49481tq76.m11680J(str2, zzacVar2.f71519d.f71534c);
                }
            }
            for (zzaw zzawVar5 : arrayList) {
                m36319D(new zzaw(zzawVar5, j), zzqVar);
            }
            C49481tq7 c49481tq77 = this.f85310c;
            m36305R(c49481tq77);
            String str3 = zzawVar2.f71529b;
            Preconditions.checkNotEmpty(str2);
            Preconditions.checkNotEmpty(str3);
            c49481tq77.mo19953e();
            c49481tq77.m83601f();
            if (i < 0) {
                c49481tq77.f100966a.mo22258a().m106888t().m42705d("Invalid time querying triggered conditional properties", C32809Fc8.m106885w(str2), c49481tq77.f100966a.m89786D().m17332d(str3), Long.valueOf(j));
                m11662b03 = Collections.emptyList();
            } else {
                m11662b03 = c49481tq77.m11662b0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
            }
            ArrayList<zzaw> arrayList2 = new ArrayList(m11662b03.size());
            for (zzac zzacVar3 : m11662b03) {
                if (zzacVar3 != null) {
                    zzlj zzljVar = zzacVar3.f71519d;
                    C47508qW8 c47508qW8 = new C47508qW8((String) Preconditions.checkNotNull(zzacVar3.f71517b), zzacVar3.f71518c, zzljVar.f71534c, j, Preconditions.checkNotNull(zzljVar.m50581s()));
                    C49481tq7 c49481tq78 = this.f85310c;
                    m36305R(c49481tq78);
                    if (c49481tq78.m11643u(c47508qW8)) {
                        mo22258a().m106889s().m42705d("User property triggered", zzacVar3.f71517b, this.f85319l.m89786D().m17330f(c47508qW8.f105373c), c47508qW8.f105375e);
                    } else {
                        mo22258a().m106893o().m42705d("Too many active user properties, ignoring", C32809Fc8.m106885w(zzacVar3.f71517b), this.f85319l.m89786D().m17330f(c47508qW8.f105373c), c47508qW8.f105375e);
                    }
                    zzaw zzawVar6 = zzacVar3.f71525j;
                    if (zzawVar6 != null) {
                        arrayList2.add(zzawVar6);
                    }
                    zzacVar3.f71519d = new zzlj(c47508qW8);
                    zzacVar3.f71521f = true;
                    C49481tq7 c49481tq79 = this.f85310c;
                    m36305R(c49481tq79);
                    c49481tq79.m11644t(zzacVar3);
                }
            }
            m36319D(zzawVar2, zzqVar);
            for (zzaw zzawVar7 : arrayList2) {
                m36319D(new zzaw(zzawVar7, j), zzqVar);
            }
            C49481tq7 c49481tq710 = this.f85310c;
            m36305R(c49481tq710);
            c49481tq710.m11652l();
        } finally {
            C49481tq7 c49481tq711 = this.f85310c;
            m36305R(c49481tq711);
            c49481tq711.m11658f0();
        }
    }

    /* renamed from: g0 */
    public final DV8 m36285g0() {
        DV8 dv8 = this.f85314g;
        m36305R(dv8);
        return dv8;
    }

    /* renamed from: h */
    public final void m36284h(zzaw zzawVar, String str) {
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        C47141pt8 m11672R = c49481tq7.m11672R(str);
        if (m11672R != null && !TextUtils.isEmpty(m11672R.m18466l0())) {
            Boolean m36313J = m36313J(m11672R);
            if (m36313J == null) {
                if (!"_ui".equals(zzawVar.f71529b)) {
                    mo22258a().m106888t().m42707b("Could not find package. appId", C32809Fc8.m106885w(str));
                }
            } else if (!m36313J.booleanValue()) {
                mo22258a().m106893o().m42707b("App version does not match; dropping event. appId", C32809Fc8.m106885w(str));
                return;
            }
            String m18462n0 = m11672R.m18462n0();
            String m18466l0 = m11672R.m18466l0();
            long m18500P = m11672R.m18500P();
            String m18468k0 = m11672R.m18468k0();
            long m18488a0 = m11672R.m18488a0();
            long m18492X = m11672R.m18492X();
            boolean m18503M = m11672R.m18503M();
            String m18464m0 = m11672R.m18464m0();
            m11672R.m18515A();
            m36282i(zzawVar, new zzq(str, m18462n0, m18466l0, m18500P, m18468k0, m18488a0, m18492X, (String) null, m18503M, false, m18464m0, 0L, 0L, 0, m11672R.m18504L(), false, m11672R.m18476g0(), m11672R.m18478f0(), m11672R.m18491Y(), m11672R.m18483d(), (String) null, m36301V(str).m76358h(), "", (String) null, m11672R.m18501O(), m11672R.m18480e0()));
            return;
        }
        mo22258a().m106894n().m42707b("No app data available; dropping event", str);
    }

    /* renamed from: h0 */
    public final OW8 m36283h0() {
        return ((C35248Pn8) Preconditions.checkNotNull(this.f85319l)).m89776N();
    }

    /* renamed from: i */
    public final void m36282i(zzaw zzawVar, zzq zzqVar) {
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        C36319Uc8 m81227b = C36319Uc8.m81227b(zzawVar);
        OW8 m36283h0 = m36283h0();
        Bundle bundle = m81227b.f37693d;
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        m36283h0.m92044w(bundle, c49481tq7.m11673Q(zzqVar.f71541b));
        m36283h0().m92040y(m81227b, m36302U().m37516k(zzqVar.f71541b));
        zzaw m81228a = m81227b.m81228a();
        if ("_cmp".equals(m81228a.f71529b) && "referrer API v2".equals(m81228a.f71530c.m50585K("_cis"))) {
            String m50585K = m81228a.f71530c.m50585K("gclid");
            if (!TextUtils.isEmpty(m50585K)) {
                m36262y(new zzlj("_lgclid", m81228a.f71532e, m50585K, "auto"), zzqVar);
            }
        }
        m36286g(m81228a, zzqVar);
    }

    /* renamed from: i0 */
    public final String m36281i0(C37110Xm7 c37110Xm7) {
        if (c37110Xm7.m76357i(EnumC39344cm7.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            m36283h0().m92054r().nextBytes(bArr);
            return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        return null;
    }

    /* renamed from: j */
    public final void m36280j() {
        this.f85325r++;
    }

    /* renamed from: j0 */
    public final String m36279j0(zzq zzqVar) {
        try {
            return (String) mo22257c().m43702p(new CallableC41551gT8(this, zzqVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            mo22258a().m106893o().m42706c("Failed to get app instance id. appId", C32809Fc8.m106885w(zzqVar.f71541b), e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137 A[Catch: all -> 0x0176, TryCatch #2 {all -> 0x0180, blocks: (B:4:0x0010, B:5:0x0012, B:62:0x0168, B:6:0x002c, B:16:0x0049, B:61:0x0160, B:21:0x0063, B:26:0x00b5, B:25:0x00a6, B:29:0x00bd, B:32:0x00c9, B:34:0x00cf, B:37:0x00d9, B:40:0x00e5, B:42:0x00eb, B:47:0x00f8, B:51:0x0114, B:53:0x0129, B:55:0x0148, B:57:0x0153, B:59:0x0159, B:60:0x015d, B:54:0x0137, B:48:0x0101, B:50:0x010c), top: B:71:0x0010 }] */
    @VisibleForTesting
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36278k(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        List list;
        String str2;
        List list2;
        String str3;
        C38682bf8 c38682bf8;
        mo22257c().mo19953e();
        m36292d();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f85326s = false;
                m36312K();
            }
        }
        C40448ec8 m106889s = mo22258a().m106889s();
        Integer valueOf = Integer.valueOf(bArr.length);
        m106889s.m42707b("onConfigFetched. Response size", valueOf);
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        c49481tq7.m11659e0();
        C49481tq7 c49481tq72 = this.f85310c;
        m36305R(c49481tq72);
        C47141pt8 m11672R = c49481tq72.m11672R(str);
        if (i != 200 && i != 204) {
            if (i == 304) {
                i = 304;
            }
            z = false;
            if (m11672R == null) {
                mo22258a().m106888t().m42707b("App does not exist in onConfigFetched. appId", C32809Fc8.m106885w(str));
            } else {
                if (!z && i != 404) {
                    m11672R.m18454v(mo22260A().currentTimeMillis());
                    C49481tq7 c49481tq73 = this.f85310c;
                    m36305R(c49481tq73);
                    c49481tq73.m11651m(m11672R);
                    mo22258a().m106889s().m42706c("Fetching config failed. code, error", Integer.valueOf(i), th);
                    C34987Ok8 c34987Ok8 = this.f85308a;
                    m36305R(c34987Ok8);
                    c34987Ok8.m91561w(str);
                    this.f85316i.f39038h.m563b(mo22260A().currentTimeMillis());
                    if (i == 503 || i == 429) {
                        this.f85316i.f39036f.m563b(mo22260A().currentTimeMillis());
                    }
                    m36310M();
                }
                if (map != null) {
                    list = (List) map.get(Headers.LAST_MODIFIED);
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    str2 = (String) list.get(0);
                } else {
                    str2 = null;
                }
                if (map != null) {
                    list2 = (List) map.get(Headers.ETAG);
                } else {
                    list2 = null;
                }
                if (list2 != null && !list2.isEmpty()) {
                    str3 = (String) list2.get(0);
                } else {
                    str3 = null;
                }
                if (i != 404 && i != 304) {
                    C34987Ok8 c34987Ok82 = this.f85308a;
                    m36305R(c34987Ok82);
                    c34987Ok82.m91581H(str, bArr, str2, str3);
                    m11672R.m18465m(mo22260A().currentTimeMillis());
                    C49481tq7 c49481tq74 = this.f85310c;
                    m36305R(c49481tq74);
                    c49481tq74.m11651m(m11672R);
                    if (i != 404) {
                        mo22258a().m106887u().m42707b("Config not found. Using empty config. appId", str);
                    } else {
                        mo22258a().m106889s().m42706c("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                    }
                    c38682bf8 = this.f85309b;
                    m36305R(c38682bf8);
                    if (!c38682bf8.m64190j() && m36308O()) {
                        m36320B();
                    } else {
                        m36310M();
                    }
                }
                C34987Ok8 c34987Ok83 = this.f85308a;
                m36305R(c34987Ok83);
                if (c34987Ok83.m91567q(str) == null) {
                    C34987Ok8 c34987Ok84 = this.f85308a;
                    m36305R(c34987Ok84);
                    c34987Ok84.m91581H(str, null, null, null);
                }
                m11672R.m18465m(mo22260A().currentTimeMillis());
                C49481tq7 c49481tq742 = this.f85310c;
                m36305R(c49481tq742);
                c49481tq742.m11651m(m11672R);
                if (i != 404) {
                }
                c38682bf8 = this.f85309b;
                m36305R(c38682bf8);
                if (!c38682bf8.m64190j()) {
                }
                m36310M();
            }
            C49481tq7 c49481tq75 = this.f85310c;
            m36305R(c49481tq75);
            c49481tq75.m11652l();
            C49481tq7 c49481tq76 = this.f85310c;
            m36305R(c49481tq76);
            c49481tq76.m11658f0();
        }
        if (th == null) {
            z = true;
            if (m11672R == null) {
            }
            C49481tq7 c49481tq752 = this.f85310c;
            m36305R(c49481tq752);
            c49481tq752.m11652l();
            C49481tq7 c49481tq762 = this.f85310c;
            m36305R(c49481tq762);
            c49481tq762.m11658f0();
        }
        z = false;
        if (m11672R == null) {
        }
        C49481tq7 c49481tq7522 = this.f85310c;
        m36305R(c49481tq7522);
        c49481tq7522.m11652l();
        C49481tq7 c49481tq7622 = this.f85310c;
        m36305R(c49481tq7622);
        c49481tq7622.m11658f0();
    }

    /* renamed from: l */
    public final void m36276l(boolean z) {
        m36310M();
    }

    /* renamed from: l0 */
    public final void m36275l0(Runnable runnable) {
        mo22257c().mo19953e();
        if (this.f85323p == null) {
            this.f85323p = new ArrayList();
        }
        this.f85323p.add(runnable);
    }

    @VisibleForTesting
    /* renamed from: m */
    public final void m36274m(int i, Throwable th, byte[] bArr, String str) {
        C49481tq7 c49481tq7;
        long longValue;
        mo22257c().mo19953e();
        m36292d();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.f85327t = false;
                m36312K();
            }
        }
        List<Long> list = (List) Preconditions.checkNotNull(this.f85331x);
        this.f85331x = null;
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            mo22258a().m106889s().m42706c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.f85316i.f39038h.m563b(mo22260A().currentTimeMillis());
            if (i != 503 || i == 429) {
                this.f85316i.f39036f.m563b(mo22260A().currentTimeMillis());
            }
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            c49481tq72.m11657g0(list);
            m36310M();
        }
        if (th == null) {
            try {
                this.f85316i.f39037g.m563b(mo22260A().currentTimeMillis());
                this.f85316i.f39038h.m563b(0L);
                m36310M();
                mo22258a().m106889s().m42706c("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                C49481tq7 c49481tq73 = this.f85310c;
                m36305R(c49481tq73);
                c49481tq73.m11659e0();
            } catch (SQLiteException e) {
                mo22258a().m106893o().m42707b("Database error while trying to delete uploaded bundles", e);
                this.f85322o = mo22260A().elapsedRealtime();
                mo22258a().m106889s().m42707b("Disable upload, time", Long.valueOf(this.f85322o));
            }
            try {
                for (Long l : list) {
                    try {
                        c49481tq7 = this.f85310c;
                        m36305R(c49481tq7);
                        longValue = l.longValue();
                        c49481tq7.mo19953e();
                        c49481tq7.m83601f();
                    } catch (SQLiteException e2) {
                        List list2 = this.f85332y;
                        if (list2 == null || !list2.contains(l)) {
                            throw e2;
                        }
                    }
                    try {
                        if (c49481tq7.m11674P().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                            break;
                        }
                    } catch (SQLiteException e3) {
                        c49481tq7.f100966a.mo22258a().m106893o().m42707b("Failed to delete a bundle in a queue table", e3);
                        throw e3;
                        break;
                    }
                }
                C49481tq7 c49481tq74 = this.f85310c;
                m36305R(c49481tq74);
                c49481tq74.m11652l();
                C49481tq7 c49481tq75 = this.f85310c;
                m36305R(c49481tq75);
                c49481tq75.m11658f0();
                this.f85332y = null;
                C38682bf8 c38682bf8 = this.f85309b;
                m36305R(c38682bf8);
                if (c38682bf8.m64190j() && m36308O()) {
                    m36320B();
                } else {
                    this.f85333z = -1L;
                    m36310M();
                }
                this.f85322o = 0L;
            } catch (Throwable th2) {
                C49481tq7 c49481tq76 = this.f85310c;
                m36305R(c49481tq76);
                c49481tq76.m11658f0();
                throw th2;
            }
        }
        mo22258a().m106889s().m42706c("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
        this.f85316i.f39038h.m563b(mo22260A().currentTimeMillis());
        if (i != 503) {
        }
        this.f85316i.f39036f.m563b(mo22260A().currentTimeMillis());
        C49481tq7 c49481tq722 = this.f85310c;
        m36305R(c49481tq722);
        c49481tq722.m11657g0(list);
        m36310M();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:96|97|(2:99|(8:101|(3:103|(2:105|(1:107))(1:126)|108)(1:127)|109|(1:111)(1:125)|112|113|114|(4:116|(1:118)|119|(1:121))))|128|113|114|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x04a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04a6, code lost:
        mo22258a().m106893o().m42706c("Application info is null, first open report might be inaccurate. appId", p000.C32809Fc8.m106885w(r3), r0);
        r3 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03d7 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0403 A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04ba A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04da A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x053f A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0418 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f5 A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024e A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025d A[Catch: all -> 0x056f, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026d A[Catch: all -> 0x056f, TRY_LEAVE, TryCatch #6 {all -> 0x056f, blocks: (B:23:0x00a6, B:25:0x00b6, B:43:0x00fd, B:45:0x0110, B:47:0x0126, B:48:0x014d, B:50:0x01a7, B:52:0x01ac, B:54:0x01b2, B:56:0x01bb, B:68:0x01f5, B:70:0x0200, B:74:0x020d, B:77:0x021b, B:81:0x0226, B:83:0x0229, B:84:0x0249, B:86:0x024e, B:89:0x026d, B:92:0x0280, B:94:0x02a7, B:97:0x02af, B:99:0x02be, B:127:0x03a3, B:129:0x03d7, B:130:0x03da, B:132:0x0403, B:171:0x04da, B:172:0x04dd, B:180:0x055e, B:134:0x0418, B:139:0x043d, B:141:0x0445, B:143:0x044f, B:147:0x0462, B:151:0x0473, B:155:0x047f, B:158:0x0495, B:161:0x04a6, B:163:0x04ba, B:165:0x04c0, B:166:0x04c7, B:168:0x04cd, B:149:0x046b, B:137:0x0429, B:100:0x02cf, B:102:0x02fa, B:103:0x030b, B:105:0x0312, B:107:0x0318, B:109:0x0322, B:111:0x0328, B:113:0x032e, B:115:0x0334, B:116:0x0339, B:120:0x035b, B:123:0x0360, B:124:0x0374, B:125:0x0384, B:126:0x0394, B:173:0x04f4, B:175:0x0525, B:176:0x0528, B:177:0x053f, B:179:0x0543, B:87:0x025d, B:64:0x01da, B:29:0x00c3, B:31:0x00c7, B:35:0x00d8, B:37:0x00e9, B:39:0x00f3, B:42:0x00fa), top: B:199:0x00a6, inners: #0, #1, #4 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m36273n(zzq zzqVar) {
        long j;
        C47141pt8 m11672R;
        String str;
        String str2;
        C47160pv7 m11668V;
        boolean z;
        long m11678L;
        PackageInfo packageInfo;
        String str3;
        String str4;
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        boolean z2;
        long j2;
        String str5;
        boolean z3;
        boolean z4;
        mo22257c().mo19953e();
        m36292d();
        Preconditions.checkNotNull(zzqVar);
        Preconditions.checkNotEmpty(zzqVar.f71541b);
        if (m36306Q(zzqVar)) {
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            C47141pt8 m11672R2 = c49481tq7.m11672R(zzqVar.f71541b);
            if (m11672R2 != null && TextUtils.isEmpty(m11672R2.m18462n0()) && !TextUtils.isEmpty(zzqVar.f71542c)) {
                m11672R2.m18465m(0L);
                C49481tq7 c49481tq72 = this.f85310c;
                m36305R(c49481tq72);
                c49481tq72.m11651m(m11672R2);
                C34987Ok8 c34987Ok8 = this.f85308a;
                m36305R(c34987Ok8);
                c34987Ok8.m91560x(zzqVar.f71541b);
            }
            if (!zzqVar.f71548i) {
                m36304S(zzqVar);
                return;
            }
            long j3 = zzqVar.f71553n;
            if (j3 == 0) {
                j3 = mo22260A().currentTimeMillis();
            }
            this.f85319l.m89750x().m99591o();
            int i = zzqVar.f71554o;
            if (i != 0 && i != 1) {
                mo22258a().m106888t().m42706c("Incorrect app type, assuming installed app. appId, appType", C32809Fc8.m106885w(zzqVar.f71541b), Integer.valueOf(i));
                i = 0;
            }
            C49481tq7 c49481tq73 = this.f85310c;
            m36305R(c49481tq73);
            c49481tq73.m11659e0();
            try {
                C49481tq7 c49481tq74 = this.f85310c;
                m36305R(c49481tq74);
                C47508qW8 m11666X = c49481tq74.m11666X(zzqVar.f71541b, "_npa");
                if (m11666X != null && !"auto".equals(m11666X.f105372b)) {
                    C49481tq7 c49481tq75 = this.f85310c;
                    m36305R(c49481tq75);
                    m11672R = c49481tq75.m11672R((String) Preconditions.checkNotNull(zzqVar.f71541b));
                    if (m11672R != null || !m36283h0().m92075d0(zzqVar.f71542c, m11672R.m18462n0(), zzqVar.f71557r, m11672R.m18476g0())) {
                        str = "_pfo";
                        str2 = "_sysu";
                    } else {
                        mo22258a().m106888t().m42707b("New GMP App Id passed in. Removing cached database data. appId", C32809Fc8.m106885w(m11672R.m18472i0()));
                        C49481tq7 c49481tq76 = this.f85310c;
                        m36305R(c49481tq76);
                        String m18472i0 = m11672R.m18472i0();
                        c49481tq76.m83601f();
                        c49481tq76.mo19953e();
                        Preconditions.checkNotEmpty(m18472i0);
                        try {
                            SQLiteDatabase m11674P = c49481tq76.m11674P();
                            String[] strArr = {m18472i0};
                            int delete = m11674P.delete("events", "app_id=?", strArr) + m11674P.delete("user_attributes", "app_id=?", strArr) + m11674P.delete("conditional_properties", "app_id=?", strArr) + m11674P.delete("apps", "app_id=?", strArr) + m11674P.delete("raw_events", "app_id=?", strArr) + m11674P.delete("raw_events_metadata", "app_id=?", strArr) + m11674P.delete("event_filters", "app_id=?", strArr) + m11674P.delete("property_filters", "app_id=?", strArr) + m11674P.delete("audience_filter_values", "app_id=?", strArr) + m11674P.delete("consent_settings", "app_id=?", strArr);
                            Oe9.m91741b();
                            str2 = "_sysu";
                            try {
                                str = "_pfo";
                                try {
                                    if (c49481tq76.f100966a.m89751w().m37502y(null, C37795a98.f50002v0)) {
                                        delete += m11674P.delete("default_event_params", "app_id=?", strArr);
                                    }
                                    if (delete > 0) {
                                        c49481tq76.f100966a.mo22258a().m106889s().m42706c("Deleted application data. app, records", m18472i0, Integer.valueOf(delete));
                                    }
                                } catch (SQLiteException e) {
                                    e = e;
                                    c49481tq76.f100966a.mo22258a().m106893o().m42706c("Error deleting application data. appId, error", C32809Fc8.m106885w(m18472i0), e);
                                    m11672R = null;
                                    if (m11672R != null) {
                                    }
                                    m36304S(zzqVar);
                                    if (i == 0) {
                                    }
                                    if (m11668V == null) {
                                    }
                                    C49481tq7 c49481tq77 = this.f85310c;
                                    m36305R(c49481tq77);
                                    c49481tq77.m11652l();
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                str = "_pfo";
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            str = "_pfo";
                            str2 = "_sysu";
                        }
                        m11672R = null;
                    }
                    if (m11672R != null) {
                        if (m11672R.m18500P() != -2147483648L && m11672R.m18500P() != zzqVar.f71550k) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String m18466l0 = m11672R.m18466l0();
                        if (m11672R.m18500P() == -2147483648L && m18466l0 != null && !m18466l0.equals(zzqVar.f71543d)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 | z3) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", m18466l0);
                            m36286g(new zzaw("_au", new zzau(bundle), "auto", j3), zzqVar);
                        }
                    }
                    m36304S(zzqVar);
                    if (i == 0) {
                        C49481tq7 c49481tq78 = this.f85310c;
                        m36305R(c49481tq78);
                        m11668V = c49481tq78.m11668V(zzqVar.f71541b, "_f");
                        z = false;
                    } else {
                        C49481tq7 c49481tq79 = this.f85310c;
                        m36305R(c49481tq79);
                        m11668V = c49481tq79.m11668V(zzqVar.f71541b, "_v");
                        z = true;
                    }
                    if (m11668V == null) {
                        long j4 = ((j3 / CoreConstants.MILLIS_IN_ONE_HOUR) + 1) * CoreConstants.MILLIS_IN_ONE_HOUR;
                        if (!z) {
                            m36262y(new zzlj("_fot", j3, Long.valueOf(j4), "auto"), zzqVar);
                            mo22257c().mo19953e();
                            C51773xi8 c51773xi8 = (C51773xi8) Preconditions.checkNotNull(this.f85318k);
                            String str6 = zzqVar.f71541b;
                            if (str6 != null && !str6.isEmpty()) {
                                c51773xi8.f118008a.mo22257c().mo19953e();
                                if (!c51773xi8.m4801a()) {
                                    c51773xi8.f118008a.mo22258a().m106890r().m42708a("Install Referrer Reporter is not available");
                                } else {
                                    ServiceConnectionC44066ki8 serviceConnectionC44066ki8 = new ServiceConnectionC44066ki8(c51773xi8, str6);
                                    c51773xi8.f118008a.mo22257c().mo19953e();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = c51773xi8.f118008a.mo22255z().getPackageManager();
                                    if (packageManager == null) {
                                        c51773xi8.f118008a.mo22258a().m106886v().m42708a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str7 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str7) && c51773xi8.m4801a()) {
                                                    try {
                                                        boolean bindService = ConnectionTracker.getInstance().bindService(c51773xi8.f118008a.mo22255z(), new Intent(intent), serviceConnectionC44066ki8, 1);
                                                        C40448ec8 m106889s = c51773xi8.f118008a.mo22258a().m106889s();
                                                        if (bindService) {
                                                            str5 = "available";
                                                        } else {
                                                            str5 = "not available";
                                                        }
                                                        m106889s.m42707b("Install Referrer Service is", str5);
                                                    } catch (RuntimeException e4) {
                                                        c51773xi8.f118008a.mo22258a().m106893o().m42707b("Exception occurred while binding to Install Referrer Service", e4.getMessage());
                                                    }
                                                } else {
                                                    c51773xi8.f118008a.mo22258a().m106888t().m42708a("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        } else {
                                            c51773xi8.f118008a.mo22258a().m106890r().m42708a("Play Service for fetching Install Referrer is unavailable on device");
                                        }
                                    }
                                }
                                mo22257c().mo19953e();
                                m36292d();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("_c", 1L);
                                bundle2.putLong("_r", 1L);
                                bundle2.putLong("_uwa", 0L);
                                String str8 = str;
                                bundle2.putLong(str8, 0L);
                                bundle2.putLong("_sys", 0L);
                                String str9 = str2;
                                bundle2.putLong(str9, 0L);
                                bundle2.putLong("_et", 1L);
                                if (zzqVar.f71556q) {
                                    bundle2.putLong("_dac", 1L);
                                }
                                String str10 = (String) Preconditions.checkNotNull(zzqVar.f71541b);
                                C49481tq7 c49481tq710 = this.f85310c;
                                m36305R(c49481tq710);
                                Preconditions.checkNotEmpty(str10);
                                c49481tq710.mo19953e();
                                c49481tq710.m83601f();
                                m11678L = c49481tq710.m11678L(str10, "first_open_count");
                                if (this.f85319l.mo22255z().getPackageManager() != null) {
                                    mo22258a().m106893o().m42707b("PackageManager is null, first open report might be inaccurate. appId", C32809Fc8.m106885w(str10));
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(this.f85319l.mo22255z()).getPackageInfo(str10, 0);
                                    } catch (PackageManager.NameNotFoundException e5) {
                                        mo22258a().m106893o().m42706c("Package info is null, first open report might be inaccurate. appId", C32809Fc8.m106885w(str10), e5);
                                        packageInfo = null;
                                    }
                                    if (packageInfo != null) {
                                        long j5 = packageInfo.firstInstallTime;
                                        if (j5 != 0) {
                                            str3 = "_sys";
                                            str4 = str9;
                                            if (j5 != packageInfo.lastUpdateTime) {
                                                applicationInfo = null;
                                                if (m36302U().m37502y(null, C37795a98.f49970f0)) {
                                                    if (m11678L == 0) {
                                                        bundle2.putLong("_uwa", 1L);
                                                        m11678L = 0;
                                                    }
                                                } else {
                                                    bundle2.putLong("_uwa", 1L);
                                                }
                                                z2 = false;
                                            } else {
                                                applicationInfo = null;
                                                z2 = true;
                                            }
                                            if (true != z2) {
                                                j2 = 0;
                                            } else {
                                                j2 = 1;
                                            }
                                            m36262y(new zzlj("_fi", j3, Long.valueOf(j2), "auto"), zzqVar);
                                            applicationInfo2 = Wrappers.packageManager(this.f85319l.mo22255z()).getApplicationInfo(str10, 0);
                                            if (applicationInfo2 != null) {
                                                if ((applicationInfo2.flags & 1) != 0) {
                                                    bundle2.putLong(str3, 1L);
                                                }
                                                if ((applicationInfo2.flags & 128) != 0) {
                                                    bundle2.putLong(str4, 1L);
                                                }
                                            }
                                        }
                                    }
                                    str3 = "_sys";
                                    str4 = str9;
                                    applicationInfo = null;
                                    applicationInfo2 = Wrappers.packageManager(this.f85319l.mo22255z()).getApplicationInfo(str10, 0);
                                    if (applicationInfo2 != null) {
                                    }
                                }
                                if (m11678L >= 0) {
                                    bundle2.putLong(str8, m11678L);
                                }
                                m36282i(new zzaw("_f", new zzau(bundle2), "auto", j3), zzqVar);
                            }
                            c51773xi8.f118008a.mo22258a().m106886v().m42708a("Install Referrer Reporter was called with invalid app package name");
                            mo22257c().mo19953e();
                            m36292d();
                            Bundle bundle22 = new Bundle();
                            bundle22.putLong("_c", 1L);
                            bundle22.putLong("_r", 1L);
                            bundle22.putLong("_uwa", 0L);
                            String str82 = str;
                            bundle22.putLong(str82, 0L);
                            bundle22.putLong("_sys", 0L);
                            String str92 = str2;
                            bundle22.putLong(str92, 0L);
                            bundle22.putLong("_et", 1L);
                            if (zzqVar.f71556q) {
                            }
                            String str102 = (String) Preconditions.checkNotNull(zzqVar.f71541b);
                            C49481tq7 c49481tq7102 = this.f85310c;
                            m36305R(c49481tq7102);
                            Preconditions.checkNotEmpty(str102);
                            c49481tq7102.mo19953e();
                            c49481tq7102.m83601f();
                            m11678L = c49481tq7102.m11678L(str102, "first_open_count");
                            if (this.f85319l.mo22255z().getPackageManager() != null) {
                            }
                            if (m11678L >= 0) {
                            }
                            m36282i(new zzaw("_f", new zzau(bundle22), "auto", j3), zzqVar);
                        } else {
                            m36262y(new zzlj("_fvt", j3, Long.valueOf(j4), "auto"), zzqVar);
                            mo22257c().mo19953e();
                            m36292d();
                            Bundle bundle3 = new Bundle();
                            bundle3.putLong("_c", 1L);
                            bundle3.putLong("_r", 1L);
                            bundle3.putLong("_et", 1L);
                            if (zzqVar.f71556q) {
                                bundle3.putLong("_dac", 1L);
                            }
                            m36282i(new zzaw("_v", new zzau(bundle3), "auto", j3), zzqVar);
                        }
                    } else if (zzqVar.f71549j) {
                        m36282i(new zzaw("_cd", new zzau(new Bundle()), "auto", j3), zzqVar);
                    }
                    C49481tq7 c49481tq772 = this.f85310c;
                    m36305R(c49481tq772);
                    c49481tq772.m11652l();
                }
                if (zzqVar.f71558s != null) {
                    if (true != zzqVar.f71558s.booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    zzlj zzljVar = new zzlj("_npa", j3, Long.valueOf(j), "auto");
                    if (m11666X == null || !m11666X.f105375e.equals(zzljVar.f71536e)) {
                        m36262y(zzljVar, zzqVar);
                    }
                } else if (m11666X != null) {
                    m36269r("_npa", zzqVar);
                }
                C49481tq7 c49481tq752 = this.f85310c;
                m36305R(c49481tq752);
                m11672R = c49481tq752.m11672R((String) Preconditions.checkNotNull(zzqVar.f71541b));
                if (m11672R != null) {
                }
                str = "_pfo";
                str2 = "_sysu";
                if (m11672R != null) {
                }
                m36304S(zzqVar);
                if (i == 0) {
                }
                if (m11668V == null) {
                }
                C49481tq7 c49481tq7722 = this.f85310c;
                m36305R(c49481tq7722);
                c49481tq7722.m11652l();
            } finally {
                C49481tq7 c49481tq711 = this.f85310c;
                m36305R(c49481tq711);
                c49481tq711.m11658f0();
            }
        }
    }

    /* renamed from: o */
    public final void m36272o() {
        this.f85324q++;
    }

    /* renamed from: p */
    public final void m36271p(zzac zzacVar) {
        zzq m36314I = m36314I((String) Preconditions.checkNotNull(zzacVar.f71517b));
        if (m36314I != null) {
            m36270q(zzacVar, m36314I);
        }
    }

    /* renamed from: q */
    public final void m36270q(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.f71517b);
        Preconditions.checkNotNull(zzacVar.f71519d);
        Preconditions.checkNotEmpty(zzacVar.f71519d.f71534c);
        mo22257c().mo19953e();
        m36292d();
        if (!m36306Q(zzqVar)) {
            return;
        }
        if (zzqVar.f71548i) {
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            c49481tq7.m11659e0();
            try {
                m36304S(zzqVar);
                String str = (String) Preconditions.checkNotNull(zzacVar.f71517b);
                C49481tq7 c49481tq72 = this.f85310c;
                m36305R(c49481tq72);
                zzac m11671S = c49481tq72.m11671S(str, zzacVar.f71519d.f71534c);
                if (m11671S != null) {
                    mo22258a().m106894n().m42706c("Removing conditional user property", zzacVar.f71517b, this.f85319l.m89786D().m17330f(zzacVar.f71519d.f71534c));
                    C49481tq7 c49481tq73 = this.f85310c;
                    m36305R(c49481tq73);
                    c49481tq73.m11680J(str, zzacVar.f71519d.f71534c);
                    if (m11671S.f71521f) {
                        C49481tq7 c49481tq74 = this.f85310c;
                        m36305R(c49481tq74);
                        c49481tq74.m11654j(str, zzacVar.f71519d.f71534c);
                    }
                    zzaw zzawVar = zzacVar.f71527l;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.f71530c;
                        if (zzauVar != null) {
                            bundle = zzauVar.m50583u();
                        } else {
                            bundle = null;
                        }
                        m36319D((zzaw) Preconditions.checkNotNull(m36283h0().m92039y0(str, ((zzaw) Preconditions.checkNotNull(zzacVar.f71527l)).f71529b, bundle, m11671S.f71518c, zzacVar.f71527l.f71532e, true, true)), zzqVar);
                    }
                } else {
                    mo22258a().m106888t().m42706c("Conditional user property doesn't exist", C32809Fc8.m106885w(zzacVar.f71517b), this.f85319l.m89786D().m17330f(zzacVar.f71519d.f71534c));
                }
                C49481tq7 c49481tq75 = this.f85310c;
                m36305R(c49481tq75);
                c49481tq75.m11652l();
                return;
            } finally {
                C49481tq7 c49481tq76 = this.f85310c;
                m36305R(c49481tq76);
                c49481tq76.m11658f0();
            }
        }
        m36304S(zzqVar);
    }

    /* renamed from: r */
    public final void m36269r(String str, zzq zzqVar) {
        long j;
        mo22257c().mo19953e();
        m36292d();
        if (!m36306Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f71548i) {
            m36304S(zzqVar);
        } else if ("_npa".equals(str) && zzqVar.f71558s != null) {
            mo22258a().m106894n().m42708a("Falling back to manifest metadata value for ad personalization");
            long currentTimeMillis = mo22260A().currentTimeMillis();
            if (true != zzqVar.f71558s.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            m36262y(new zzlj("_npa", currentTimeMillis, Long.valueOf(j), "auto"), zzqVar);
        } else {
            mo22258a().m106894n().m42707b("Removing user property", this.f85319l.m89786D().m17330f(str));
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            c49481tq7.m11659e0();
            try {
                m36304S(zzqVar);
                if (TransferTable.COLUMN_ID.equals(str)) {
                    C49481tq7 c49481tq72 = this.f85310c;
                    m36305R(c49481tq72);
                    c49481tq72.m11654j((String) Preconditions.checkNotNull(zzqVar.f71541b), "_lair");
                }
                C49481tq7 c49481tq73 = this.f85310c;
                m36305R(c49481tq73);
                c49481tq73.m11654j((String) Preconditions.checkNotNull(zzqVar.f71541b), str);
                C49481tq7 c49481tq74 = this.f85310c;
                m36305R(c49481tq74);
                c49481tq74.m11652l();
                mo22258a().m106894n().m42707b("User property removed", this.f85319l.m89786D().m17330f(str));
            } finally {
                C49481tq7 c49481tq75 = this.f85310c;
                m36305R(c49481tq75);
                c49481tq75.m11658f0();
            }
        }
    }

    @VisibleForTesting
    /* renamed from: s */
    public final void m36268s(zzq zzqVar) {
        if (this.f85331x != null) {
            ArrayList arrayList = new ArrayList();
            this.f85332y = arrayList;
            arrayList.addAll(this.f85331x);
        }
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        String str = (String) Preconditions.checkNotNull(zzqVar.f71541b);
        Preconditions.checkNotEmpty(str);
        c49481tq7.mo19953e();
        c49481tq7.m83601f();
        try {
            SQLiteDatabase m11674P = c49481tq7.m11674P();
            String[] strArr = {str};
            int delete = m11674P.delete("apps", "app_id=?", strArr) + m11674P.delete("events", "app_id=?", strArr) + m11674P.delete("user_attributes", "app_id=?", strArr) + m11674P.delete("conditional_properties", "app_id=?", strArr) + m11674P.delete("raw_events", "app_id=?", strArr) + m11674P.delete("raw_events_metadata", "app_id=?", strArr) + m11674P.delete("queue", "app_id=?", strArr) + m11674P.delete("audience_filter_values", "app_id=?", strArr) + m11674P.delete("main_event_params", "app_id=?", strArr) + m11674P.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                c49481tq7.f100966a.mo22258a().m106889s().m42706c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            c49481tq7.f100966a.mo22258a().m106893o().m42706c("Error resetting analytics data. appId, error", C32809Fc8.m106885w(str), e);
        }
        if (zzqVar.f71548i) {
            m36273n(zzqVar);
        }
    }

    /* renamed from: t */
    public final void m36267t(String str, C50902wE8 c50902wE8) {
        mo22257c().mo19953e();
        String str2 = this.f85306D;
        if (str2 != null && !str2.equals(str) && c50902wE8 == null) {
            return;
        }
        this.f85306D = str;
        this.f85305C = c50902wE8;
    }

    /* renamed from: u */
    public final void m36266u() {
        mo22257c().mo19953e();
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        c49481tq7.m11656h0();
        if (this.f85316i.f39037g.m564a() == 0) {
            this.f85316i.f39037g.m563b(mo22260A().currentTimeMillis());
        }
        m36310M();
    }

    /* renamed from: v */
    public final void m36265v(zzac zzacVar) {
        zzq m36314I = m36314I((String) Preconditions.checkNotNull(zzacVar.f71517b));
        if (m36314I != null) {
            m36264w(zzacVar, m36314I);
        }
    }

    /* renamed from: w */
    public final void m36264w(zzac zzacVar, zzq zzqVar) {
        Preconditions.checkNotNull(zzacVar);
        Preconditions.checkNotEmpty(zzacVar.f71517b);
        Preconditions.checkNotNull(zzacVar.f71518c);
        Preconditions.checkNotNull(zzacVar.f71519d);
        Preconditions.checkNotEmpty(zzacVar.f71519d.f71534c);
        mo22257c().mo19953e();
        m36292d();
        if (!m36306Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f71548i) {
            m36304S(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z = false;
        zzacVar2.f71521f = false;
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        c49481tq7.m11659e0();
        try {
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            zzac m11671S = c49481tq72.m11671S((String) Preconditions.checkNotNull(zzacVar2.f71517b), zzacVar2.f71519d.f71534c);
            if (m11671S != null && !m11671S.f71518c.equals(zzacVar2.f71518c)) {
                mo22258a().m106888t().m42705d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f85319l.m89786D().m17330f(zzacVar2.f71519d.f71534c), zzacVar2.f71518c, m11671S.f71518c);
            }
            if (m11671S != null && m11671S.f71521f) {
                zzacVar2.f71518c = m11671S.f71518c;
                zzacVar2.f71520e = m11671S.f71520e;
                zzacVar2.f71524i = m11671S.f71524i;
                zzacVar2.f71522g = m11671S.f71522g;
                zzacVar2.f71525j = m11671S.f71525j;
                zzacVar2.f71521f = true;
                zzlj zzljVar = zzacVar2.f71519d;
                zzacVar2.f71519d = new zzlj(zzljVar.f71534c, m11671S.f71519d.f71535d, zzljVar.m50581s(), m11671S.f71519d.f71538g);
            } else if (TextUtils.isEmpty(zzacVar2.f71522g)) {
                zzlj zzljVar2 = zzacVar2.f71519d;
                zzacVar2.f71519d = new zzlj(zzljVar2.f71534c, zzacVar2.f71520e, zzljVar2.m50581s(), zzacVar2.f71519d.f71538g);
                zzacVar2.f71521f = true;
                z = true;
            }
            if (zzacVar2.f71521f) {
                zzlj zzljVar3 = zzacVar2.f71519d;
                C47508qW8 c47508qW8 = new C47508qW8((String) Preconditions.checkNotNull(zzacVar2.f71517b), zzacVar2.f71518c, zzljVar3.f71534c, zzljVar3.f71535d, Preconditions.checkNotNull(zzljVar3.m50581s()));
                C49481tq7 c49481tq73 = this.f85310c;
                m36305R(c49481tq73);
                if (c49481tq73.m11643u(c47508qW8)) {
                    mo22258a().m106894n().m42705d("User property updated immediately", zzacVar2.f71517b, this.f85319l.m89786D().m17330f(c47508qW8.f105373c), c47508qW8.f105375e);
                } else {
                    mo22258a().m106893o().m42705d("(2)Too many active user properties, ignoring", C32809Fc8.m106885w(zzacVar2.f71517b), this.f85319l.m89786D().m17330f(c47508qW8.f105373c), c47508qW8.f105375e);
                }
                if (z && zzacVar2.f71525j != null) {
                    m36319D(new zzaw(zzacVar2.f71525j, zzacVar2.f71520e), zzqVar);
                }
            }
            C49481tq7 c49481tq74 = this.f85310c;
            m36305R(c49481tq74);
            if (c49481tq74.m11644t(zzacVar2)) {
                mo22258a().m106894n().m42705d("Conditional property added", zzacVar2.f71517b, this.f85319l.m89786D().m17330f(zzacVar2.f71519d.f71534c), zzacVar2.f71519d.m50581s());
            } else {
                mo22258a().m106893o().m42705d("Too many conditional properties, ignoring", C32809Fc8.m106885w(zzacVar2.f71517b), this.f85319l.m89786D().m17330f(zzacVar2.f71519d.f71534c), zzacVar2.f71519d.m50581s());
            }
            C49481tq7 c49481tq75 = this.f85310c;
            m36305R(c49481tq75);
            c49481tq75.m11652l();
        } finally {
            C49481tq7 c49481tq76 = this.f85310c;
            m36305R(c49481tq76);
            c49481tq76.m11658f0();
        }
    }

    /* renamed from: x */
    public final void m36263x(String str, C37110Xm7 c37110Xm7) {
        mo22257c().mo19953e();
        m36292d();
        this.f85303A.put(str, c37110Xm7);
        C49481tq7 c49481tq7 = this.f85310c;
        m36305R(c49481tq7);
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(c37110Xm7);
        c49481tq7.mo19953e();
        c49481tq7.m83601f();
        ContentValues contentValues = new ContentValues();
        contentValues.put(PaymentMethodOptionsParams.WeChatPay.PARAM_APP_ID, str);
        contentValues.put("consent_state", c37110Xm7.m76358h());
        try {
            if (c49481tq7.m11674P().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c49481tq7.f100966a.mo22258a().m106893o().m42707b("Failed to insert/update consent setting (got -1). appId", C32809Fc8.m106885w(str));
            }
        } catch (SQLiteException e) {
            c49481tq7.f100966a.mo22258a().m106893o().m42706c("Error storing consent setting. appId, error", C32809Fc8.m106885w(str), e);
        }
    }

    /* renamed from: y */
    public final void m36262y(zzlj zzljVar, zzq zzqVar) {
        long j;
        int i;
        mo22257c().mo19953e();
        m36292d();
        if (!m36306Q(zzqVar)) {
            return;
        }
        if (!zzqVar.f71548i) {
            m36304S(zzqVar);
            return;
        }
        int m92057p0 = m36283h0().m92057p0(zzljVar.f71534c);
        int i2 = 0;
        if (m92057p0 != 0) {
            OW8 m36283h0 = m36283h0();
            String str = zzljVar.f71534c;
            m36302U();
            String m92060o = m36283h0.m92060o(str, 24, true);
            String str2 = zzljVar.f71534c;
            if (str2 != null) {
                i = str2.length();
            } else {
                i = 0;
            }
            m36283h0().m92102B(this.f85307E, zzqVar.f71541b, m92057p0, "_ev", m92060o, i);
            return;
        }
        int m92065l0 = m36283h0().m92065l0(zzljVar.f71534c, zzljVar.m50581s());
        if (m92065l0 != 0) {
            OW8 m36283h02 = m36283h0();
            String str3 = zzljVar.f71534c;
            m36302U();
            String m92060o2 = m36283h02.m92060o(str3, 24, true);
            Object m50581s = zzljVar.m50581s();
            if (m50581s != null && ((m50581s instanceof String) || (m50581s instanceof CharSequence))) {
                i2 = m50581s.toString().length();
            }
            m36283h0().m92102B(this.f85307E, zzqVar.f71541b, m92065l0, "_ev", m92060o2, i2);
            return;
        }
        Object m92064m = m36283h0().m92064m(zzljVar.f71534c, zzljVar.m50581s());
        if (m92064m == null) {
            return;
        }
        if ("_sid".equals(zzljVar.f71534c)) {
            long j2 = zzljVar.f71535d;
            String str4 = zzljVar.f71538g;
            String str5 = (String) Preconditions.checkNotNull(zzqVar.f71541b);
            C49481tq7 c49481tq7 = this.f85310c;
            m36305R(c49481tq7);
            C47508qW8 m11666X = c49481tq7.m11666X(str5, "_sno");
            if (m11666X != null) {
                Object obj = m11666X.f105375e;
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                    m36262y(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
                }
            }
            if (m11666X != null) {
                mo22258a().m106888t().m42707b("Retrieved last session number from database does not contain a valid (long) value", m11666X.f105375e);
            }
            C49481tq7 c49481tq72 = this.f85310c;
            m36305R(c49481tq72);
            C47160pv7 m11668V = c49481tq72.m11668V(str5, "_s");
            if (m11668V != null) {
                j = m11668V.f104326c;
                mo22258a().m106889s().m42707b("Backfill the session number. Last used session number", Long.valueOf(j));
            } else {
                j = 0;
            }
            m36262y(new zzlj("_sno", j2, Long.valueOf(j + 1), str4), zzqVar);
        }
        C47508qW8 c47508qW8 = new C47508qW8((String) Preconditions.checkNotNull(zzqVar.f71541b), (String) Preconditions.checkNotNull(zzljVar.f71538g), zzljVar.f71534c, zzljVar.f71535d, m92064m);
        mo22258a().m106889s().m42706c("Setting user property", this.f85319l.m89786D().m17330f(c47508qW8.f105373c), m92064m);
        C49481tq7 c49481tq73 = this.f85310c;
        m36305R(c49481tq73);
        c49481tq73.m11659e0();
        try {
            if (TransferTable.COLUMN_ID.equals(c47508qW8.f105373c)) {
                C49481tq7 c49481tq74 = this.f85310c;
                m36305R(c49481tq74);
                C47508qW8 m11666X2 = c49481tq74.m11666X(zzqVar.f71541b, TransferTable.COLUMN_ID);
                if (m11666X2 != null && !c47508qW8.f105375e.equals(m11666X2.f105375e)) {
                    C49481tq7 c49481tq75 = this.f85310c;
                    m36305R(c49481tq75);
                    c49481tq75.m11654j(zzqVar.f71541b, "_lair");
                }
            }
            m36304S(zzqVar);
            C49481tq7 c49481tq76 = this.f85310c;
            m36305R(c49481tq76);
            boolean m11643u = c49481tq76.m11643u(c47508qW8);
            C49481tq7 c49481tq77 = this.f85310c;
            m36305R(c49481tq77);
            c49481tq77.m11652l();
            if (!m11643u) {
                mo22258a().m106893o().m42706c("Too many unique user properties are set. Ignoring user property", this.f85319l.m89786D().m17330f(c47508qW8.f105373c), c47508qW8.f105375e);
                m36283h0().m92102B(this.f85307E, zzqVar.f71541b, 9, null, null, 0);
            }
        } finally {
            C49481tq7 c49481tq78 = this.f85310c;
            m36305R(c49481tq78);
            c49481tq78.m11658f0();
        }
    }

    @Override // p000.InterfaceC35527Qs8
    /* renamed from: z */
    public final Context mo22255z() {
        return this.f85319l.mo22255z();
    }
}
