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
/* renamed from: en9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40559en9 {

    /* renamed from: k */
    public static DR7 f78869k;

    /* renamed from: l */
    public static final AbstractC42727iS7 f78870l = AbstractC42727iS7.m33901c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f78871a;

    /* renamed from: b */
    public final String f78872b;

    /* renamed from: c */
    public final Xl9 f78873c;

    /* renamed from: d */
    public final C37684Zy5 f78874d;

    /* renamed from: e */
    public final Task f78875e;

    /* renamed from: f */
    public final Task f78876f;

    /* renamed from: g */
    public final String f78877g;

    /* renamed from: h */
    public final int f78878h;

    /* renamed from: i */
    public final Map f78879i = new HashMap();

    /* renamed from: j */
    public final Map f78880j = new HashMap();

    public C40559en9(Context context, final C37684Zy5 c37684Zy5, Xl9 xl9, String str) {
        int i;
        this.f78871a = context.getPackageName();
        this.f78872b = C32216Cp0.m111503a(context);
        this.f78874d = c37684Zy5;
        this.f78873c = xl9;
        C47685qo9.m16960a();
        this.f78877g = str;
        this.f78875e = ME2.m95480a().m95479b(new Callable() { // from class: vm9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C40559en9.this.m42552b();
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f78876f = m95480a.m95479b(new Callable() { // from class: Am9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC42727iS7 abstractC42727iS7 = f78870l;
        if (abstractC42727iS7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC42727iS7.get(str));
        } else {
            i = -1;
        }
        this.f78878h = i;
    }

    /* renamed from: a */
    public static long m42553a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: i */
    public static synchronized DR7 m42545i() {
        synchronized (C40559en9.class) {
            DR7 dr7 = f78869k;
            if (dr7 != null) {
                return dr7;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            JQ7 jq7 = new JQ7();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                jq7.m100496e(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            DR7 m100494g = jq7.m100494g();
            f78869k = m100494g;
            return m100494g;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m42552b() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f78877g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m42551c(Rl9 rl9, O59 o59, String str) {
        String m72165a;
        rl9.mo6316b(o59);
        String zzd = rl9.zzd();
        C38110ah9 c38110ah9 = new C38110ah9();
        c38110ah9.m70854b(this.f78871a);
        c38110ah9.m70853c(this.f78872b);
        c38110ah9.m70848h(m42545i());
        c38110ah9.m70849g(Boolean.TRUE);
        c38110ah9.m70844l(zzd);
        c38110ah9.m70846j(str);
        if (this.f78876f.isSuccessful()) {
            m72165a = (String) this.f78876f.getResult();
        } else {
            m72165a = this.f78874d.m72165a();
        }
        c38110ah9.m70847i(m72165a);
        c38110ah9.m70852d(10);
        c38110ah9.m70845k(Integer.valueOf(this.f78878h));
        rl9.mo6315c(c38110ah9);
        this.f78873c.mo18710a(rl9);
    }

    /* renamed from: d */
    public final void m42550d(Rl9 rl9, O59 o59) {
        m42549e(rl9, o59, m42544j());
    }

    /* renamed from: e */
    public final void m42549e(final Rl9 rl9, final O59 o59, final String str) {
        ME2.m95477d().execute(new Runnable() { // from class: Gm9
            @Override // java.lang.Runnable
            public final void run() {
                C40559en9.this.m42551c(rl9, o59, str);
            }
        });
    }

    /* renamed from: f */
    public final void m42548f(Ym9 ym9, O59 o59) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m42543k(o59, elapsedRealtime, 30L)) {
            return;
        }
        this.f78879i.put(o59, Long.valueOf(elapsedRealtime));
        m42549e(ym9.zza(), o59, m42544j());
    }

    /* renamed from: g */
    public final /* synthetic */ void m42547g(O59 o59, C53069zt8 c53069zt8) {
        InterfaceC39161cT7 interfaceC39161cT7 = (InterfaceC39161cT7) this.f78880j.get(o59);
        if (interfaceC39161cT7 != null) {
            for (Object obj : interfaceC39161cT7.mo39238f()) {
                ArrayList<Long> arrayList = new ArrayList(interfaceC39161cT7.zzc(obj));
                Collections.sort(arrayList);
                Z09 z09 = new Z09();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                z09.m73861a(Long.valueOf(j / arrayList.size()));
                z09.m73859c(Long.valueOf(m42553a(arrayList, 100.0d)));
                z09.m73856f(Long.valueOf(m42553a(arrayList, 75.0d)));
                z09.m73858d(Long.valueOf(m42553a(arrayList, 50.0d)));
                z09.m73860b(Long.valueOf(m42553a(arrayList, 25.0d)));
                z09.m73857e(Long.valueOf(m42553a(arrayList, 0.0d)));
                m42549e(c53069zt8.m151a(obj, arrayList.size(), z09.m73855g()), o59, m42544j());
            }
            this.f78880j.remove(o59);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m42546h(final O59 o59, Object obj, long j, final C53069zt8 c53069zt8) {
        if (!this.f78880j.containsKey(o59)) {
            this.f78880j.put(o59, KI7.m99019o());
        }
        ((InterfaceC39161cT7) this.f78880j.get(o59)).mo34274a(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m42543k(o59, elapsedRealtime, 30L)) {
            return;
        }
        this.f78879i.put(o59, Long.valueOf(elapsedRealtime));
        ME2.m95477d().execute(new Runnable() { // from class: Sm9
            @Override // java.lang.Runnable
            public final void run() {
                C40559en9.this.m42547g(o59, c53069zt8);
            }
        });
    }

    /* renamed from: j */
    public final String m42544j() {
        if (this.f78875e.isSuccessful()) {
            return (String) this.f78875e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f78877g);
    }

    /* renamed from: k */
    public final boolean m42543k(O59 o59, long j, long j2) {
        if (this.f78879i.get(o59) == null || j - ((Long) this.f78879i.get(o59)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
