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
/* renamed from: mm9  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C45293mm9 {

    /* renamed from: k */
    public static AbstractC51557xL7 f98737k;

    /* renamed from: l */
    public static final AbstractC39709dM7 f98738l = AbstractC39709dM7.m44345c("optional-module-barcode", "com.google.android.gms.vision.barcode");

    /* renamed from: a */
    public final String f98739a;

    /* renamed from: b */
    public final String f98740b;

    /* renamed from: c */
    public final Dk9 f98741c;

    /* renamed from: d */
    public final C37684Zy5 f98742d;

    /* renamed from: e */
    public final Task f98743e;

    /* renamed from: f */
    public final Task f98744f;

    /* renamed from: g */
    public final String f98745g;

    /* renamed from: h */
    public final int f98746h;

    /* renamed from: i */
    public final Map f98747i = new HashMap();

    /* renamed from: j */
    public final Map f98748j = new HashMap();

    public C45293mm9(Context context, final C37684Zy5 c37684Zy5, Dk9 dk9, String str) {
        int i;
        this.f98739a = context.getPackageName();
        this.f98740b = C32216Cp0.m111503a(context);
        this.f98742d = c37684Zy5;
        this.f98741c = dk9;
        En9.m108355a();
        this.f98745g = str;
        this.f98743e = ME2.m95480a().m95479b(new Callable() { // from class: al9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C45293mm9.this.m25020b();
            }
        });
        ME2 m95480a = ME2.m95480a();
        c37684Zy5.getClass();
        this.f98744f = m95480a.m95479b(new Callable() { // from class: gl9
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C37684Zy5.this.m72165a();
            }
        });
        AbstractC39709dM7 abstractC39709dM7 = f98738l;
        if (abstractC39709dM7.containsKey(str)) {
            i = DynamiteModule.m51593c(context, (String) abstractC39709dM7.get(str));
        } else {
            i = -1;
        }
        this.f98746h = i;
    }

    /* renamed from: a */
    public static long m25021a(List list, double d) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    /* renamed from: i */
    public static synchronized AbstractC51557xL7 m25013i() {
        synchronized (C45293mm9.class) {
            AbstractC51557xL7 abstractC51557xL7 = f98737k;
            if (abstractC51557xL7 != null) {
                return abstractC51557xL7;
            }
            C50711vv2 m40423a = C41243fx0.m40423a(Resources.getSystem().getConfiguration());
            DK7 dk7 = new DK7();
            for (int i = 0; i < m40423a.m7766h(); i++) {
                dk7.m110573a(C32216Cp0.m111502b(m40423a.m7771c(i)));
            }
            AbstractC51557xL7 m110572b = dk7.m110572b();
            f98737k = m110572b;
            return m110572b;
        }
    }

    /* renamed from: b */
    public final /* synthetic */ String m25020b() throws Exception {
        return LibraryVersion.getInstance().getVersion(this.f98745g);
    }

    /* renamed from: c */
    public final /* synthetic */ void m25019c(InterfaceC51794xk9 interfaceC51794xk9, EnumC40135e49 enumC40135e49, String str) {
        String m72165a;
        interfaceC51794xk9.mo4748c(enumC40135e49);
        String zzd = interfaceC51794xk9.zzd();
        C48790sg9 c48790sg9 = new C48790sg9();
        c48790sg9.m13846b(this.f98739a);
        c48790sg9.m13845c(this.f98740b);
        c48790sg9.m13840h(m25013i());
        c48790sg9.m13841g(Boolean.TRUE);
        c48790sg9.m13836l(zzd);
        c48790sg9.m13838j(str);
        if (this.f98744f.isSuccessful()) {
            m72165a = (String) this.f98744f.getResult();
        } else {
            m72165a = this.f98742d.m72165a();
        }
        c48790sg9.m13839i(m72165a);
        c48790sg9.m13844d(10);
        c48790sg9.m13837k(Integer.valueOf(this.f98746h));
        interfaceC51794xk9.mo4749b(c48790sg9);
        this.f98741c.mo35862a(interfaceC51794xk9);
    }

    /* renamed from: d */
    public final void m25018d(InterfaceC51794xk9 interfaceC51794xk9, EnumC40135e49 enumC40135e49) {
        m25017e(interfaceC51794xk9, enumC40135e49, m25012j());
    }

    /* renamed from: e */
    public final void m25017e(final InterfaceC51794xk9 interfaceC51794xk9, final EnumC40135e49 enumC40135e49, final String str) {
        ME2.m95477d().execute(new Runnable() { // from class: ml9
            @Override // java.lang.Runnable
            public final void run() {
                C45293mm9.this.m25019c(interfaceC51794xk9, enumC40135e49, str);
            }
        });
    }

    /* renamed from: f */
    public final void m25016f(InterfaceC41735gm9 interfaceC41735gm9, EnumC40135e49 enumC40135e49) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m25011k(enumC40135e49, elapsedRealtime, 30L)) {
            return;
        }
        this.f98747i.put(enumC40135e49, Long.valueOf(elapsedRealtime));
        m25017e(interfaceC41735gm9.zza(), enumC40135e49, m25012j());
    }

    /* renamed from: g */
    public final /* synthetic */ void m25015g(EnumC40135e49 enumC40135e49, C50538vd9 c50538vd9) {
        InterfaceC37921aN7 interfaceC37921aN7 = (InterfaceC37921aN7) this.f98748j.get(enumC40135e49);
        if (interfaceC37921aN7 != null) {
            for (Object obj : interfaceC37921aN7.mo64522f()) {
                ArrayList<Long> arrayList = new ArrayList(interfaceC37921aN7.zzc(obj));
                Collections.sort(arrayList);
                ZY8 zy8 = new ZY8();
                long j = 0;
                for (Long l : arrayList) {
                    j += l.longValue();
                }
                zy8.m72938a(Long.valueOf(j / arrayList.size()));
                zy8.m72936c(Long.valueOf(m25021a(arrayList, 100.0d)));
                zy8.m72933f(Long.valueOf(m25021a(arrayList, 75.0d)));
                zy8.m72935d(Long.valueOf(m25021a(arrayList, 50.0d)));
                zy8.m72937b(Long.valueOf(m25021a(arrayList, 25.0d)));
                zy8.m72934e(Long.valueOf(m25021a(arrayList, 0.0d)));
                m25017e(c50538vd9.m8325a(obj, arrayList.size(), zy8.m72932g()), enumC40135e49, m25012j());
            }
            this.f98748j.remove(enumC40135e49);
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m25014h(final EnumC40135e49 enumC40135e49, Object obj, long j, final C50538vd9 c50538vd9) {
        if (!this.f98748j.containsKey(enumC40135e49)) {
            this.f98748j.put(enumC40135e49, C48928su7.m13402o());
        }
        ((InterfaceC37921aN7) this.f98748j.get(enumC40135e49)).mo64524a(obj, Long.valueOf(j));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!m25011k(enumC40135e49, elapsedRealtime, 30L)) {
            return;
        }
        this.f98747i.put(enumC40135e49, Long.valueOf(elapsedRealtime));
        ME2.m95477d().execute(new Runnable() { // from class: am9
            @Override // java.lang.Runnable
            public final void run() {
                C45293mm9.this.m25015g(enumC40135e49, c50538vd9);
            }
        });
    }

    /* renamed from: j */
    public final String m25012j() {
        if (this.f98743e.isSuccessful()) {
            return (String) this.f98743e.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.f98745g);
    }

    /* renamed from: k */
    public final boolean m25011k(EnumC40135e49 enumC40135e49, long j, long j2) {
        if (this.f98747i.get(enumC40135e49) == null || j - ((Long) this.f98747i.get(enumC40135e49)).longValue() > TimeUnit.SECONDS.toMillis(30L)) {
            return true;
        }
        return false;
    }
}
