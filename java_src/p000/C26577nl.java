package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000.C34872Ny1;
import p000.C41338g66;
/* renamed from: nl */
/* loaded from: classes6.dex */
public class C26577nl implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public static final C10776ad f100446s = C10776ad.m71007e();

    /* renamed from: t */
    public static volatile C26577nl f100447t;

    /* renamed from: b */
    public final WeakHashMap<Activity, Boolean> f100448b;

    /* renamed from: c */
    public final WeakHashMap<Activity, C35106Oy1> f100449c;

    /* renamed from: d */
    public final WeakHashMap<Activity, C51926xy1> f100450d;

    /* renamed from: e */
    public final WeakHashMap<Activity, Trace> f100451e;

    /* renamed from: f */
    public final Map<String, Long> f100452f;

    /* renamed from: g */
    public final Set<WeakReference<InterfaceC26579b>> f100453g;

    /* renamed from: h */
    public Set<InterfaceC26578a> f100454h;

    /* renamed from: i */
    public final AtomicInteger f100455i;

    /* renamed from: j */
    public final C41612ga6 f100456j;

    /* renamed from: k */
    public final C32036Bv0 f100457k;

    /* renamed from: l */
    public final C38141al0 f100458l;

    /* renamed from: m */
    public final boolean f100459m;

    /* renamed from: n */
    public Timer f100460n;

    /* renamed from: o */
    public Timer f100461o;

    /* renamed from: p */
    public EnumC23350im f100462p;

    /* renamed from: q */
    public boolean f100463q;

    /* renamed from: r */
    public boolean f100464r;

    /* renamed from: nl$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC26578a {
        /* renamed from: a */
        void mo445a();
    }

    /* renamed from: nl$b */
    /* loaded from: classes6.dex */
    public interface InterfaceC26579b {
        void onUpdateAppState(EnumC23350im enumC23350im);
    }

    public C26577nl(C41612ga6 c41612ga6, C38141al0 c38141al0) {
        this(c41612ga6, c38141al0, C32036Bv0.m113351g(), m23234g());
    }

    /* renamed from: b */
    public static C26577nl m23239b() {
        if (f100447t == null) {
            synchronized (C26577nl.class) {
                if (f100447t == null) {
                    f100447t = new C26577nl(C41612ga6.m39128k(), new C38141al0());
                }
            }
        }
        return f100447t;
    }

    /* renamed from: c */
    public static String m23238c(Activity activity) {
        return "_st_" + activity.getClass().getSimpleName();
    }

    /* renamed from: g */
    public static boolean m23234g() {
        return C35106Oy1.m91138a();
    }

    /* renamed from: a */
    public EnumC23350im m23240a() {
        return this.f100462p;
    }

    /* renamed from: d */
    public void m23237d(String str, long j) {
        synchronized (this.f100452f) {
            Long l = this.f100452f.get(str);
            if (l == null) {
                this.f100452f.put(str, Long.valueOf(j));
            } else {
                this.f100452f.put(str, Long.valueOf(l.longValue() + j));
            }
        }
    }

    /* renamed from: e */
    public void m23236e(int i) {
        this.f100455i.addAndGet(i);
    }

    /* renamed from: f */
    public boolean m23235f() {
        return this.f100464r;
    }

    /* renamed from: h */
    public boolean m23233h() {
        return this.f100459m;
    }

    /* renamed from: i */
    public synchronized void m23232i(Context context) {
        if (this.f100463q) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            this.f100463q = true;
        }
    }

    /* renamed from: j */
    public void m23231j(InterfaceC26578a interfaceC26578a) {
        synchronized (this.f100454h) {
            this.f100454h.add(interfaceC26578a);
        }
    }

    /* renamed from: k */
    public void m23230k(WeakReference<InterfaceC26579b> weakReference) {
        synchronized (this.f100453g) {
            this.f100453g.add(weakReference);
        }
    }

    /* renamed from: l */
    public final void m23229l() {
        synchronized (this.f100454h) {
            for (InterfaceC26578a interfaceC26578a : this.f100454h) {
                if (interfaceC26578a != null) {
                    interfaceC26578a.mo445a();
                }
            }
        }
    }

    /* renamed from: m */
    public final void m23228m(Activity activity) {
        Trace trace = this.f100451e.get(activity);
        if (trace == null) {
            return;
        }
        this.f100451e.remove(activity);
        C43628jy3<C34872Ny1.C5752a> m91134e = this.f100449c.get(activity).m91134e();
        if (!m91134e.m29582d()) {
            f100446s.m71001k("Failed to record frame data for %s.", activity.getClass().getSimpleName());
            return;
        }
        C34327Lp5.m96313a(trace, m91134e.m29583c());
        trace.stop();
    }

    /* renamed from: n */
    public final void m23227n(String str, Timer timer, Timer timer2) {
        if (!this.f100457k.m113363K()) {
            return;
        }
        C41338g66.C20751b m40016O = C41338g66.m40054A0().m40008Y(str).m40010W(timer.m47034e()).m40009X(timer.m47035d(timer2)).m40016O(SessionManager.getInstance().perfSession().m47055a());
        int andSet = this.f100455i.getAndSet(0);
        synchronized (this.f100452f) {
            m40016O.m40014Q(this.f100452f);
            if (andSet != 0) {
                m40016O.m40012U(EnumC36041Sy0.TRACE_STARTED_NOT_STOPPED.toString(), andSet);
            }
            this.f100452f.clear();
        }
        this.f100456j.m39144C(m40016O.build(), EnumC23350im.FOREGROUND_BACKGROUND);
    }

    /* renamed from: o */
    public final void m23226o(Activity activity) {
        if (m23233h() && this.f100457k.m113363K()) {
            C35106Oy1 c35106Oy1 = new C35106Oy1(activity);
            this.f100449c.put(activity, c35106Oy1);
            if (activity instanceof FragmentActivity) {
                C51926xy1 c51926xy1 = new C51926xy1(this.f100458l, this.f100456j, this, c35106Oy1);
                this.f100450d.put(activity, c51926xy1);
                ((FragmentActivity) activity).getSupportFragmentManager().m67315o1(c51926xy1, true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m23226o(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f100449c.remove(activity);
        if (this.f100450d.containsKey(activity)) {
            ((FragmentActivity) activity).getSupportFragmentManager().m67395I1(this.f100450d.remove(activity));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (this.f100448b.isEmpty()) {
            this.f100460n = this.f100458l.m70796a();
            this.f100448b.put(activity, Boolean.TRUE);
            if (this.f100464r) {
                m23224q(EnumC23350im.FOREGROUND);
                m23229l();
                this.f100464r = false;
            } else {
                m23227n(EnumC36275Ty0.BACKGROUND_TRACE_NAME.toString(), this.f100461o, this.f100460n);
                m23224q(EnumC23350im.FOREGROUND);
            }
        } else {
            this.f100448b.put(activity, Boolean.TRUE);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (m23233h() && this.f100457k.m113363K()) {
            if (!this.f100449c.containsKey(activity)) {
                m23226o(activity);
            }
            this.f100449c.get(activity).m91136c();
            Trace trace = new Trace(m23238c(activity), this.f100456j, this.f100458l, this);
            trace.start();
            this.f100451e.put(activity, trace);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStopped(Activity activity) {
        if (m23233h()) {
            m23228m(activity);
        }
        if (this.f100448b.containsKey(activity)) {
            this.f100448b.remove(activity);
            if (this.f100448b.isEmpty()) {
                this.f100461o = this.f100458l.m70796a();
                m23227n(EnumC36275Ty0.FOREGROUND_TRACE_NAME.toString(), this.f100460n, this.f100461o);
                m23224q(EnumC23350im.BACKGROUND);
            }
        }
    }

    /* renamed from: p */
    public void m23225p(WeakReference<InterfaceC26579b> weakReference) {
        synchronized (this.f100453g) {
            this.f100453g.remove(weakReference);
        }
    }

    /* renamed from: q */
    public final void m23224q(EnumC23350im enumC23350im) {
        this.f100462p = enumC23350im;
        synchronized (this.f100453g) {
            Iterator<WeakReference<InterfaceC26579b>> it = this.f100453g.iterator();
            while (it.hasNext()) {
                InterfaceC26579b interfaceC26579b = it.next().get();
                if (interfaceC26579b != null) {
                    interfaceC26579b.onUpdateAppState(this.f100462p);
                } else {
                    it.remove();
                }
            }
        }
    }

    @VisibleForTesting
    public C26577nl(C41612ga6 c41612ga6, C38141al0 c38141al0, C32036Bv0 c32036Bv0, boolean z) {
        this.f100448b = new WeakHashMap<>();
        this.f100449c = new WeakHashMap<>();
        this.f100450d = new WeakHashMap<>();
        this.f100451e = new WeakHashMap<>();
        this.f100452f = new HashMap();
        this.f100453g = new HashSet();
        this.f100454h = new HashSet();
        this.f100455i = new AtomicInteger(0);
        this.f100462p = EnumC23350im.BACKGROUND;
        this.f100463q = false;
        this.f100464r = true;
        this.f100456j = c41612ga6;
        this.f100458l = c38141al0;
        this.f100457k = c32036Bv0;
        this.f100459m = z;
    }
}
