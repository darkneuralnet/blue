package p000;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: y49  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C51993y49 {

    /* renamed from: k */
    public static HL7 f118718k;

    /* renamed from: l */
    public static final AbstractC46231oM7 f118719l = AbstractC46231oM7.m21254c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f118720a;

    /* renamed from: b */
    public final String f118721b;

    /* renamed from: c */
    public final InterfaceC47251q49 f118722c;

    /* renamed from: d */
    public final C37684Zy5 f118723d;

    /* renamed from: e */
    public final Task f118724e;

    /* renamed from: f */
    public final Task f118725f;

    /* renamed from: g */
    public final String f118726g;

    /* renamed from: h */
    public final int f118727h;

    /* renamed from: i */
    public final Map f118728i = new HashMap();

    /* renamed from: j */
    public final Map f118729j = new HashMap();

    public C51993y49(Context context, final C37684Zy5 c37684Zy5, InterfaceC47251q49 interfaceC47251q49, String str) {
        int i;
        this.f118720a = context.getPackageName();
        this.f118721b = C32216Cp0.m111503a(context);
        this.f118723d = c37684Zy5;
        this.f118722c = interfaceC47251q49;
        S69.m86000a();
        this.f118726g = str;
        this.f118724e = ME2.m95480a().m95479b(new Callable() { // from class: a49
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C51993y49.this.m4173b();
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f118725f = m95480a.m95479b(new Callable() { // from class: R39
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC46231oM7 abstractC46231oM7 = f118719l;
        if (abstractC46231oM7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC46231oM7.get(str));
        } else {
            i = -1;
        }
        this.f118727h = i;
    }

    /* renamed from: a */
    public static long m4174a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: i */
    public static synchronized HL7 m4166i() {
        synchronized (C51993y49.class) {
            HL7 hl7 = f118718k;
            if (hl7 != null) {
                return hl7;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            NK7 nk7 = new NK7();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                nk7.m94053c(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            HL7 m94052d = nk7.m94052d();
            f118718k = m94052d;
            return m94052d;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m4173b() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f118726g);
    }

    /* renamed from: c */
    public final void m4172c(InterfaceC42507i49 interfaceC42507i49, EnumC44471lO8 enumC44471lO8) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m4164k(enumC44471lO8, elapsedRealtime, 30L)) {
            return;
        }
        this.f118728i.put(enumC44471lO8, Long.valueOf(elapsedRealtime));
        m4167h(interfaceC42507i49.zza(), enumC44471lO8, m4165j());
    }

    /* renamed from: d */
    public final /* synthetic */ void m4171d(C52596z59 c52596z59, EnumC44471lO8 enumC44471lO8, String str) {
        String m72165a;
        c52596z59.m1825f(enumC44471lO8);
        String m1829b = c52596z59.m1829b();
        C50480vX8 c50480vX8 = new C50480vX8();
        c50480vX8.m8522b(this.f118720a);
        c50480vX8.m8521c(this.f118721b);
        c50480vX8.m8516h(m4166i());
        c50480vX8.m8517g(Boolean.TRUE);
        c50480vX8.m8512l(m1829b);
        c50480vX8.m8514j(str);
        if (this.f118725f.isSuccessful()) {
            m72165a = (String) this.f118725f.getResult();
        } else {
            m72165a = this.f118723d.m72165a();
        }
        c50480vX8.m8515i(m72165a);
        c50480vX8.m8520d(10);
        c50480vX8.m8513k(Integer.valueOf(this.f118727h));
        c52596z59.m1824g(c50480vX8);
        this.f118722c.mo18232a(c52596z59);
    }

    /* renamed from: e */
    public final /* synthetic */ void m4170e(EnumC44471lO8 enumC44471lO8, C34933Oe8 c34933Oe8) {
        InterfaceC45054mN7 interfaceC45054mN7 = (InterfaceC45054mN7) this.f118729j.get(enumC44471lO8);
        if (interfaceC45054mN7 != null) {
            for (Object obj : interfaceC45054mN7.mo95303h()) {
                ArrayList<Long> arrayList = new ArrayList(interfaceC45054mN7.zzc(obj));
                Collections.sort(arrayList);
                HH8 hh8 = new HH8();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                hh8.m104058a(Long.valueOf(j / arrayList.size()));
                hh8.m104056c(Long.valueOf(m4174a(arrayList, 100.0d)));
                hh8.m104053f(Long.valueOf(m4174a(arrayList, 75.0d)));
                hh8.m104055d(Long.valueOf(m4174a(arrayList, 50.0d)));
                hh8.m104057b(Long.valueOf(m4174a(arrayList, 25.0d)));
                hh8.m104054e(Long.valueOf(m4174a(arrayList, 0.0d)));
                m4167h(c34933Oe8.m91743a(obj, arrayList.size(), hh8.m104052g()), enumC44471lO8, m4165j());
            }
            this.f118729j.remove(enumC44471lO8);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void m4169f(final EnumC44471lO8 enumC44471lO8, Object obj, long j, final C34933Oe8 c34933Oe8) {
        if (!this.f118729j.containsKey(enumC44471lO8)) {
            this.f118729j.put(enumC44471lO8, C51309wv7.m6090q());
        }
        ((InterfaceC45054mN7) this.f118729j.get(enumC44471lO8)).mo62191i(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m4164k(enumC44471lO8, elapsedRealtime, 30L)) {
            return;
        }
        this.f118728i.put(enumC44471lO8, Long.valueOf(elapsedRealtime));
        ME2.m95477d().execute(new Runnable(enumC44471lO8, c34933Oe8, null) { // from class: q39

            /* renamed from: c */
            public final /* synthetic */ EnumC44471lO8 f104616c;

            /* renamed from: d */
            public final /* synthetic */ C34933Oe8 f104617d;

            @Override // java.lang.Runnable
            public final void run() {
                C51993y49.this.m4170e(this.f104616c, this.f104617d);
            }
        });
    }

    /* renamed from: g */
    public final void m4168g(C52596z59 c52596z59, EnumC44471lO8 enumC44471lO8) {
        m4167h(c52596z59, enumC44471lO8, m4165j());
    }

    /* renamed from: h */
    public final void m4167h(final C52596z59 c52596z59, final EnumC44471lO8 enumC44471lO8, final String str) {
        ME2.m95477d().execute(new Runnable(c52596z59, enumC44471lO8, str, null) { // from class: I39

            /* renamed from: c */
            public final /* synthetic */ EnumC44471lO8 f14419c;

            /* renamed from: d */
            public final /* synthetic */ String f14420d;

            /* renamed from: e */
            public final /* synthetic */ C52596z59 f14421e;

            @Override // java.lang.Runnable
            public final void run() {
                C51993y49.this.m4171d(this.f14421e, this.f14419c, this.f14420d);
            }
        });
    }

    /* renamed from: j */
    public final String m4165j() {
        if (this.f118724e.isSuccessful()) {
            return (String) this.f118724e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f118726g);
    }

    /* renamed from: k */
    public final boolean m4164k(EnumC44471lO8 enumC44471lO8, long j, long j2) {
        if (this.f118728i.get(enumC44471lO8) == null || j - ((Long) this.f118728i.get(enumC44471lO8)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
