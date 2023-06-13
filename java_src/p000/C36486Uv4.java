package p000;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.C18378b;
import com.google.firebase.remoteconfig.internal.C18381c;
import com.google.firebase.remoteconfig.internal.C18384d;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
@KeepForSdk
/* renamed from: Uv4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36486Uv4 {

    /* renamed from: j */
    public static final Clock f38264j = DefaultClock.getInstance();

    /* renamed from: k */
    public static final Random f38265k = new Random();

    /* renamed from: l */
    public static final Map<String, C34773Nn1> f38266l = new HashMap();

    /* renamed from: a */
    public final Map<String, C34773Nn1> f38267a;

    /* renamed from: b */
    public final Context f38268b;

    /* renamed from: c */
    public final ScheduledExecutorService f38269c;

    /* renamed from: d */
    public final C31722Am1 f38270d;

    /* renamed from: e */
    public final InterfaceC35934Sm1 f38271e;

    /* renamed from: f */
    public final C50620vm1 f38272f;

    /* renamed from: g */
    public final X94<InterfaceC12447ba> f38273g;

    /* renamed from: h */
    public final String f38274h;

    /* renamed from: i */
    public Map<String, String> f38275i;

    /* renamed from: Uv4$a */
    /* loaded from: classes6.dex */
    public static class C8501a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public static final AtomicReference<C8501a> f38276a = new AtomicReference<>();

        private C8501a() {
        }

        /* renamed from: b */
        public static void m80616b(Context context) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<C8501a> atomicReference = f38276a;
            if (atomicReference.get() == null) {
                C8501a c8501a = new C8501a();
                if (C42482i24.m35337a(atomicReference, null, c8501a)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(c8501a);
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            C36486Uv4.m80618p(z);
        }
    }

    public C36486Uv4(Context context, @InterfaceC8305UW ScheduledExecutorService scheduledExecutorService, C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C50620vm1 c50620vm1, X94<InterfaceC12447ba> x94) {
        this(context, scheduledExecutorService, c31722Am1, interfaceC35934Sm1, c50620vm1, x94, true);
    }

    /* renamed from: j */
    public static C18384d m80624j(Context context, String str, String str2) {
        return new C18384d(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    /* renamed from: k */
    public static C42723iS3 m80623k(C31722Am1 c31722Am1, String str, X94<InterfaceC12447ba> x94) {
        if (m80620n(c31722Am1) && str.equals("firebase")) {
            return new C42723iS3(x94);
        }
        return null;
    }

    /* renamed from: m */
    public static boolean m80621m(C31722Am1 c31722Am1, String str) {
        if (str.equals("firebase") && m80620n(c31722Am1)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m80620n(C31722Am1 c31722Am1) {
        return c31722Am1.m115291l().equals("[DEFAULT]");
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC12447ba m80619o() {
        return null;
    }

    /* renamed from: p */
    public static synchronized void m80618p(boolean z) {
        synchronized (C36486Uv4.class) {
            for (C34773Nn1 c34773Nn1 : f38266l.values()) {
                c34773Nn1.m93420o(z);
            }
        }
    }

    /* renamed from: c */
    public synchronized C34773Nn1 m80631c(C31722Am1 c31722Am1, String str, InterfaceC35934Sm1 interfaceC35934Sm1, C50620vm1 c50620vm1, Executor executor, C34601Mu0 c34601Mu0, C34601Mu0 c34601Mu02, C34601Mu0 c34601Mu03, C18381c c18381c, C45967nv0 c45967nv0, C18384d c18384d) {
        C50620vm1 c50620vm12;
        if (!this.f38267a.containsKey(str)) {
            Context context = this.f38268b;
            if (m80621m(c31722Am1, str)) {
                c50620vm12 = c50620vm1;
            } else {
                c50620vm12 = null;
            }
            C34773Nn1 c34773Nn1 = new C34773Nn1(context, c31722Am1, interfaceC35934Sm1, c50620vm12, executor, c34601Mu0, c34601Mu02, c34601Mu03, c18381c, c45967nv0, c18384d, m80622l(c31722Am1, interfaceC35934Sm1, c18381c, c34601Mu02, this.f38268b, str, c18384d));
            c34773Nn1.m93419p();
            this.f38267a.put(str, c34773Nn1);
            f38266l.put(str, c34773Nn1);
        }
        return this.f38267a.get(str);
    }

    @KeepForSdk
    /* renamed from: d */
    public synchronized C34773Nn1 m80630d(String str) {
        C34601Mu0 m80629e;
        C34601Mu0 m80629e2;
        C34601Mu0 m80629e3;
        C18384d m80624j;
        C45967nv0 m80625i;
        m80629e = m80629e(str, "fetch");
        m80629e2 = m80629e(str, "activate");
        m80629e3 = m80629e(str, "defaults");
        m80624j = m80624j(this.f38268b, this.f38274h, str);
        m80625i = m80625i(m80629e2, m80629e3);
        final C42723iS3 m80623k = m80623k(this.f38270d, str, this.f38273g);
        if (m80623k != null) {
            m80625i.m22189b(new BiConsumer() { // from class: Rv4
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    C42723iS3.this.m33907a((String) obj, (C18378b) obj2);
                }
            });
        }
        return m80631c(this.f38270d, str, this.f38271e, this.f38272f, this.f38269c, m80629e, m80629e2, m80629e3, m80627g(str, m80629e, m80624j), m80625i, m80624j);
    }

    /* renamed from: e */
    public final C34601Mu0 m80629e(String str, String str2) {
        return C34601Mu0.m94600h(this.f38269c, C32270Cv0.m111355c(this.f38268b, String.format("%s_%s_%s_%s.json", "frc", this.f38274h, str, str2)));
    }

    /* renamed from: f */
    public C34773Nn1 m80628f() {
        return m80630d("firebase");
    }

    /* renamed from: g */
    public synchronized C18381c m80627g(String str, C34601Mu0 c34601Mu0, C18384d c18384d) {
        InterfaceC35934Sm1 interfaceC35934Sm1;
        X94<InterfaceC12447ba> x94;
        interfaceC35934Sm1 = this.f38271e;
        if (m80620n(this.f38270d)) {
            x94 = this.f38273g;
        } else {
            x94 = new X94() { // from class: Tv4
                @Override // p000.X94
                public final Object get() {
                    InterfaceC12447ba m80619o;
                    m80619o = C36486Uv4.m80619o();
                    return m80619o;
                }
            };
        }
        return new C18381c(interfaceC35934Sm1, x94, this.f38269c, f38264j, f38265k, c34601Mu0, m80626h(this.f38270d.m115290m().m18706b(), str, c18384d), c18384d, this.f38275i);
    }

    /* renamed from: h */
    public ConfigFetchHttpClient m80626h(String str, String str2, C18384d c18384d) {
        return new ConfigFetchHttpClient(this.f38268b, this.f38270d.m115290m().m18705c(), str, str2, c18384d.m46946b(), c18384d.m46946b());
    }

    /* renamed from: i */
    public final C45967nv0 m80625i(C34601Mu0 c34601Mu0, C34601Mu0 c34601Mu02) {
        return new C45967nv0(this.f38269c, c34601Mu0, c34601Mu02);
    }

    /* renamed from: l */
    public synchronized C53081zv0 m80622l(C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C18381c c18381c, C34601Mu0 c34601Mu0, Context context, String str, C18384d c18384d) {
        return new C53081zv0(c31722Am1, interfaceC35934Sm1, c18381c, c34601Mu0, context, str, c18384d, this.f38269c);
    }

    public C36486Uv4(Context context, ScheduledExecutorService scheduledExecutorService, C31722Am1 c31722Am1, InterfaceC35934Sm1 interfaceC35934Sm1, C50620vm1 c50620vm1, X94<InterfaceC12447ba> x94, boolean z) {
        this.f38267a = new HashMap();
        this.f38275i = new HashMap();
        this.f38268b = context;
        this.f38269c = scheduledExecutorService;
        this.f38270d = c31722Am1;
        this.f38271e = interfaceC35934Sm1;
        this.f38272f = c50620vm1;
        this.f38273g = x94;
        this.f38274h = c31722Am1.m115290m().m18705c();
        C8501a.m80616b(context);
        if (z) {
            Tasks.call(scheduledExecutorService, new Callable() { // from class: Sv4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C36486Uv4.this.m80628f();
                }
            });
        }
    }
}
