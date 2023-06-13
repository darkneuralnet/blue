package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.session.SessionManager;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C19853dm;
import p000.C26577nl;
import p000.C43891kQ3;
/* renamed from: ga6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41612ga6 implements C26577nl.InterfaceC26579b {

    /* renamed from: s */
    public static final C10776ad f82440s = C10776ad.m71007e();

    /* renamed from: t */
    public static final C41612ga6 f82441t = new C41612ga6();

    /* renamed from: b */
    public final Map<String, Integer> f82442b;

    /* renamed from: e */
    public C31722Am1 f82445e;

    /* renamed from: f */
    public C51816xn1 f82446f;

    /* renamed from: g */
    public InterfaceC35934Sm1 f82447g;

    /* renamed from: h */
    public X94<U96> f82448h;

    /* renamed from: i */
    public C37383Yr1 f82449i;

    /* renamed from: k */
    public Context f82451k;

    /* renamed from: l */
    public C32036Bv0 f82452l;

    /* renamed from: m */
    public C44705ln4 f82453m;

    /* renamed from: n */
    public C26577nl f82454n;

    /* renamed from: o */
    public C19853dm.C19855b f82455o;

    /* renamed from: p */
    public String f82456p;

    /* renamed from: q */
    public String f82457q;

    /* renamed from: c */
    public final ConcurrentLinkedQueue<C39741dQ3> f82443c = new ConcurrentLinkedQueue<>();

    /* renamed from: d */
    public final AtomicBoolean f82444d = new AtomicBoolean(false);

    /* renamed from: r */
    public boolean f82458r = false;

    /* renamed from: j */
    public ExecutorService f82450j = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @SuppressLint({"ThreadPoolCreation"})
    private C41612ga6() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f82442b = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    /* renamed from: k */
    public static C41612ga6 m39128k() {
        return f82441t;
    }

    /* renamed from: l */
    public static String m39127l(C41382gB1 c41382gB1) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(c41382gB1.m39935g0()), Integer.valueOf(c41382gB1.m39938d0()), Integer.valueOf(c41382gB1.m39939c0()));
    }

    /* renamed from: m */
    public static String m39126m(L73 l73) {
        long j;
        String str;
        if (l73.m97751D0()) {
            j = l73.m97711u0();
        } else {
            j = 0;
        }
        if (l73.m97706z0()) {
            str = String.valueOf(l73.m97717o0());
        } else {
            str = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", l73.m97709w0(), str, new DecimalFormat("#.####").format(j / 1000.0d));
    }

    /* renamed from: n */
    public static String m39125n(InterfaceC44484lQ3 interfaceC44484lQ3) {
        if (interfaceC44484lQ3.mo27313k()) {
            return m39124o(interfaceC44484lQ3.mo27312l());
        }
        if (interfaceC44484lQ3.mo27314j()) {
            return m39126m(interfaceC44484lQ3.mo27317e());
        }
        if (interfaceC44484lQ3.mo27315h()) {
            return m39127l(interfaceC44484lQ3.mo27316g());
        }
        return "log";
    }

    /* renamed from: o */
    public static String m39124o(C41338g66 c41338g66) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", c41338g66.m40026s0(), new DecimalFormat("#.####").format(c41338g66.m40029p0() / 1000.0d));
    }

    /* renamed from: p */
    public static String m39123p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (str == null) {
                return "";
            }
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m39117v(C39741dQ3 c39741dQ3) {
        m39141F(c39741dQ3.f76576a, c39741dQ3.f76577b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m39116w(C41338g66 c41338g66, EnumC23350im enumC23350im) {
        m39141F(C43891kQ3.m28984a0().m28976P(c41338g66), enumC23350im);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m39115x(L73 l73, EnumC23350im enumC23350im) {
        m39141F(C43891kQ3.m28984a0().m28977O(l73), enumC23350im);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m39114y(C41382gB1 c41382gB1, EnumC23350im enumC23350im) {
        m39141F(C43891kQ3.m28984a0().m28978N(c41382gB1), enumC23350im);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m39113z() {
        this.f82453m.m26831a(this.f82458r);
    }

    /* renamed from: A */
    public void m39146A(final C41382gB1 c41382gB1, final EnumC23350im enumC23350im) {
        this.f82450j.execute(new Runnable() { // from class: ea6
            @Override // java.lang.Runnable
            public final void run() {
                C41612ga6.this.m39114y(c41382gB1, enumC23350im);
            }
        });
    }

    /* renamed from: B */
    public void m39145B(final L73 l73, final EnumC23350im enumC23350im) {
        this.f82450j.execute(new Runnable() { // from class: ca6
            @Override // java.lang.Runnable
            public final void run() {
                C41612ga6.this.m39115x(l73, enumC23350im);
            }
        });
    }

    /* renamed from: C */
    public void m39144C(final C41338g66 c41338g66, final EnumC23350im enumC23350im) {
        this.f82450j.execute(new Runnable() { // from class: aa6
            @Override // java.lang.Runnable
            public final void run() {
                C41612ga6.this.m39116w(c41338g66, enumC23350im);
            }
        });
    }

    /* renamed from: D */
    public final C43891kQ3 m39143D(C43891kQ3.C25160b c25160b, EnumC23350im enumC23350im) {
        m39140G();
        C19853dm.C19855b m43736Q = this.f82455o.m43736Q(enumC23350im);
        if (c25160b.mo27313k() || c25160b.mo27314j()) {
            m43736Q = m43736Q.mo46027o().m43739N(m39129j());
        }
        return c25160b.m28979M(m43736Q).build();
    }

    /* renamed from: E */
    public final void m39142E() {
        Context m115293j = this.f82445e.m115293j();
        this.f82451k = m115293j;
        this.f82456p = m115293j.getPackageName();
        this.f82452l = C32036Bv0.m113351g();
        this.f82453m = new C44705ln4(this.f82451k, new C44112kn4(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f82454n = C26577nl.m23239b();
        this.f82449i = new C37383Yr1(this.f82448h, this.f82452l.m113357a());
        m39131h();
    }

    /* renamed from: F */
    public final void m39141F(C43891kQ3.C25160b c25160b, EnumC23350im enumC23350im) {
        if (!m39118u()) {
            if (m39120s(c25160b)) {
                f82440s.m71010b("Transport is not initialized yet, %s will be queued for to be dispatched later", m39125n(c25160b));
                this.f82443c.add(new C39741dQ3(c25160b, enumC23350im));
                return;
            }
            return;
        }
        C43891kQ3 m39143D = m39143D(c25160b, enumC23350im);
        if (m39119t(m39143D)) {
            m39132g(m39143D);
            SessionManager.getInstance().updatePerfSessionIfExpired();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m39140G() {
        String str;
        if (this.f82452l.m113363K()) {
            if (this.f82455o.m43740M() && !this.f82458r) {
                return;
            }
            try {
                str = (String) Tasks.await(this.f82447g.getId(), 60000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e) {
                f82440s.m71008d("Task to retrieve Installation Id is interrupted: %s", e.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            } catch (ExecutionException e2) {
                f82440s.m71008d("Unable to retrieve Installation Id: %s", e2.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            } catch (TimeoutException e3) {
                f82440s.m71008d("Task to retrieve Installation Id is timed out: %s", e3.getMessage());
                str = null;
                if (TextUtils.isEmpty(str)) {
                }
            }
            if (TextUtils.isEmpty(str)) {
                this.f82455o.m43737P(str);
            } else {
                f82440s.m71002j("Firebase Installation Id is empty, contact Firebase Support for debugging.");
            }
        }
    }

    /* renamed from: H */
    public final void m39139H() {
        if (this.f82446f == null && m39118u()) {
            this.f82446f = C51816xn1.m4710c();
        }
    }

    /* renamed from: g */
    public final void m39132g(C43891kQ3 c43891kQ3) {
        if (c43891kQ3.mo27313k()) {
            f82440s.m71005g("Logging %s. In a minute, visit the Firebase console to view your data: %s", m39125n(c43891kQ3), m39130i(c43891kQ3.mo27312l()));
        } else {
            f82440s.m71005g("Logging %s", m39125n(c43891kQ3));
        }
        this.f82449i.m74093b(c43891kQ3);
    }

    /* renamed from: h */
    public final void m39131h() {
        this.f82454n.m23230k(new WeakReference<>(f82441t));
        C19853dm.C19855b m43745h0 = C19853dm.m43745h0();
        this.f82455o = m43745h0;
        m43745h0.m43735S(this.f82445e.m115290m().m18705c()).m43738O(C26127mb.m25380a0().m25376M(this.f82456p).m25375N(U30.f36765b).m25374O(m39123p(this.f82451k)));
        this.f82444d.set(true);
        while (!this.f82443c.isEmpty()) {
            final C39741dQ3 poll = this.f82443c.poll();
            if (poll != null) {
                this.f82450j.execute(new Runnable() { // from class: fa6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C41612ga6.this.m39117v(poll);
                    }
                });
            }
        }
    }

    /* renamed from: i */
    public final String m39130i(C41338g66 c41338g66) {
        String m40026s0 = c41338g66.m40026s0();
        if (m40026s0.startsWith("_st_")) {
            return C34871Ny0.m93161c(this.f82457q, this.f82456p, m40026s0);
        }
        return C34871Ny0.m93163a(this.f82457q, this.f82456p, m40026s0);
    }

    /* renamed from: j */
    public final Map<String, String> m39129j() {
        m39139H();
        C51816xn1 c51816xn1 = this.f82446f;
        if (c51816xn1 != null) {
            return c51816xn1.m4711b();
        }
        return Collections.emptyMap();
    }

    @Override // p000.C26577nl.InterfaceC26579b
    public void onUpdateAppState(EnumC23350im enumC23350im) {
        boolean z;
        if (enumC23350im == EnumC23350im.FOREGROUND) {
            z = true;
        } else {
            z = false;
        }
        this.f82458r = z;
        if (m39118u()) {
            this.f82450j.execute(new Runnable() { // from class: da6
                @Override // java.lang.Runnable
                public final void run() {
                    C41612ga6.this.m39113z();
                }
            });
        }
    }

    /* renamed from: q */
    public final void m39122q(C43891kQ3 c43891kQ3) {
        if (c43891kQ3.mo27313k()) {
            this.f82454n.m23237d(EnumC36041Sy0.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (c43891kQ3.mo27314j()) {
            this.f82454n.m23237d(EnumC36041Sy0.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    /* renamed from: r */
    public void m39121r(C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, X94<U96> x94) {
        this.f82445e = c31722Am1;
        this.f82457q = c31722Am1.m115290m().m18703e();
        this.f82447g = interfaceC35934Sm1;
        this.f82448h = x94;
        this.f82450j.execute(new Runnable() { // from class: ba6
            @Override // java.lang.Runnable
            public final void run() {
                C41612ga6.this.m39142E();
            }
        });
    }

    /* renamed from: s */
    public final boolean m39120s(InterfaceC44484lQ3 interfaceC44484lQ3) {
        int intValue = this.f82442b.get("KEY_AVAILABLE_TRACES_FOR_CACHING").intValue();
        int intValue2 = this.f82442b.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING").intValue();
        int intValue3 = this.f82442b.get("KEY_AVAILABLE_GAUGES_FOR_CACHING").intValue();
        if (interfaceC44484lQ3.mo27313k() && intValue > 0) {
            this.f82442b.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(intValue - 1));
            return true;
        } else if (interfaceC44484lQ3.mo27314j() && intValue2 > 0) {
            this.f82442b.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(intValue2 - 1));
            return true;
        } else if (interfaceC44484lQ3.mo27315h() && intValue3 > 0) {
            this.f82442b.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(intValue3 - 1));
            return true;
        } else {
            f82440s.m71010b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", m39125n(interfaceC44484lQ3), Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(intValue3));
            return false;
        }
    }

    /* renamed from: t */
    public final boolean m39119t(C43891kQ3 c43891kQ3) {
        if (!this.f82452l.m113363K()) {
            f82440s.m71005g("Performance collection is not enabled, dropping %s", m39125n(c43891kQ3));
            return false;
        } else if (!c43891kQ3.m28986Y().m43749d0()) {
            f82440s.m71001k("App Instance ID is null or empty, dropping %s", m39125n(c43891kQ3));
            return false;
        } else if (!AbstractC45077mQ3.m25655b(c43891kQ3, this.f82451k)) {
            f82440s.m71001k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", m39125n(c43891kQ3));
            return false;
        } else if (!this.f82453m.m26824h(c43891kQ3)) {
            m39122q(c43891kQ3);
            f82440s.m71005g("Event dropped due to device sampling - %s", m39125n(c43891kQ3));
            return false;
        } else if (!this.f82453m.m26825g(c43891kQ3)) {
            return true;
        } else {
            m39122q(c43891kQ3);
            f82440s.m71005g("Rate limited (per device) - %s", m39125n(c43891kQ3));
            return false;
        }
    }

    /* renamed from: u */
    public boolean m39118u() {
        return this.f82444d.get();
    }
}
