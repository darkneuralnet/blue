package com.google.firebase.perf.metrics;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11736n;
import androidx.lifecycle.InterfaceC11733l;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C41338g66;
/* loaded from: classes6.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, InterfaceC32929Fq2 {

    /* renamed from: B */
    public static volatile AppStartTrace f74353B;

    /* renamed from: C */
    public static ExecutorService f74354C;

    /* renamed from: c */
    public final C41612ga6 f74357c;

    /* renamed from: d */
    public final C38141al0 f74358d;

    /* renamed from: e */
    public final C32036Bv0 f74359e;

    /* renamed from: f */
    public final C41338g66.C20751b f74360f;

    /* renamed from: g */
    public Context f74361g;

    /* renamed from: h */
    public WeakReference<Activity> f74362h;

    /* renamed from: i */
    public WeakReference<Activity> f74363i;

    /* renamed from: k */
    public final Timer f74365k;

    /* renamed from: l */
    public final Timer f74366l;

    /* renamed from: u */
    public PerfSession f74375u;

    /* renamed from: z */
    public static final Timer f74355z = new C38141al0().m70796a();

    /* renamed from: A */
    public static final long f74352A = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: b */
    public boolean f74356b = false;

    /* renamed from: j */
    public boolean f74364j = false;

    /* renamed from: m */
    public Timer f74367m = null;

    /* renamed from: n */
    public Timer f74368n = null;

    /* renamed from: o */
    public Timer f74369o = null;

    /* renamed from: p */
    public Timer f74370p = null;

    /* renamed from: q */
    public Timer f74371q = null;

    /* renamed from: r */
    public Timer f74372r = null;

    /* renamed from: s */
    public Timer f74373s = null;

    /* renamed from: t */
    public Timer f74374t = null;

    /* renamed from: v */
    public boolean f74376v = false;

    /* renamed from: w */
    public int f74377w = 0;

    /* renamed from: x */
    public final ViewTreeObserver$OnDrawListenerC18367b f74378x = new ViewTreeObserver$OnDrawListenerC18367b();

    /* renamed from: y */
    public boolean f74379y = false;

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$b */
    /* loaded from: classes6.dex */
    public final class ViewTreeObserver$OnDrawListenerC18367b implements ViewTreeObserver.OnDrawListener {
        public ViewTreeObserver$OnDrawListenerC18367b() {
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            AppStartTrace.m47103l(AppStartTrace.this);
        }
    }

    /* renamed from: com.google.firebase.perf.metrics.AppStartTrace$c */
    /* loaded from: classes6.dex */
    public static class RunnableC18368c implements Runnable {

        /* renamed from: b */
        public final AppStartTrace f74381b;

        public RunnableC18368c(AppStartTrace appStartTrace) {
            this.f74381b = appStartTrace;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f74381b.f74367m == null) {
                this.f74381b.f74376v = true;
            }
        }
    }

    public AppStartTrace(C41612ga6 c41612ga6, C38141al0 c38141al0, C32036Bv0 c32036Bv0, ExecutorService executorService) {
        this.f74357c = c41612ga6;
        this.f74358d = c38141al0;
        this.f74359e = c32036Bv0;
        f74354C = executorService;
        this.f74360f = C41338g66.m40054A0().m40008Y("_experiment_app_start_ttid");
        this.f74365k = Timer.m47033g(Process.getStartElapsedRealtime());
        AbstractC46849pP5 abstractC46849pP5 = (AbstractC46849pP5) C31722Am1.m115292k().m115294i(AbstractC46849pP5.class);
        this.f74366l = abstractC46849pP5 != null ? Timer.m47033g(abstractC46849pP5.mo19335b()) : null;
    }

    /* renamed from: l */
    public static /* synthetic */ int m47103l(AppStartTrace appStartTrace) {
        int i = appStartTrace.f74377w;
        appStartTrace.f74377w = i + 1;
        return i;
    }

    /* renamed from: o */
    public static AppStartTrace m47101o() {
        return f74353B != null ? f74353B : m47100p(C41612ga6.m39128k(), new C38141al0());
    }

    @SuppressLint({"ThreadPoolCreation"})
    /* renamed from: p */
    public static AppStartTrace m47100p(C41612ga6 c41612ga6, C38141al0 c38141al0) {
        if (f74353B == null) {
            synchronized (AppStartTrace.class) {
                if (f74353B == null) {
                    f74353B = new AppStartTrace(c41612ga6, c38141al0, C32036Bv0.m113351g(), new ThreadPoolExecutor(0, 1, f74352A + 10, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                }
            }
        }
        return f74353B;
    }

    /* renamed from: s */
    public static boolean m47098s(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return true;
        }
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
        if (runningAppProcesses != null) {
            String packageName = context.getPackageName();
            String str = packageName + ":";
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(str))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m47097t(C41338g66.C20751b c20751b) {
        this.f74357c.m39144C(c20751b.build(), EnumC23350im.FOREGROUND_BACKGROUND);
    }

    /* renamed from: A */
    public synchronized void m47111A() {
        if (!this.f74356b) {
            return;
        }
        C11736n.m66967l().getLifecycle().mo67006d(this);
        ((Application) this.f74361g).unregisterActivityLifecycleCallbacks(this);
        this.f74356b = false;
    }

    /* renamed from: n */
    public final Timer m47102n() {
        Timer timer = this.f74366l;
        if (timer != null) {
            return timer;
        }
        return f74355z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:15:0x001b, B:17:0x003c), top: B:25:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z;
        if (!this.f74376v && this.f74367m == null) {
            if (!this.f74379y && !m47098s(this.f74361g)) {
                z = false;
                this.f74379y = z;
                this.f74362h = new WeakReference<>(activity);
                this.f74367m = this.f74358d.m70796a();
                if (m47099q().m47035d(this.f74367m) > f74352A) {
                    this.f74364j = true;
                }
            }
            z = true;
            this.f74379y = z;
            this.f74362h = new WeakReference<>(activity);
            this.f74367m = this.f74358d.m70796a();
            if (m47099q().m47035d(this.f74367m) > f74352A) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        if (!this.f74376v && !this.f74364j && this.f74359e.m113350h()) {
            activity.findViewById(16908290).getViewTreeObserver().removeOnDrawListener(this.f74378x);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityResumed(Activity activity) {
        if (!this.f74376v && !this.f74364j) {
            boolean m113350h = this.f74359e.m113350h();
            if (m113350h) {
                View findViewById = activity.findViewById(16908290);
                findViewById.getViewTreeObserver().addOnDrawListener(this.f74378x);
                ViewTreeObserver$OnDrawListenerC37581Zn1.m72521e(findViewById, new Runnable() { // from class: il
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.m47094w();
                    }
                });
                ViewTreeObserver$OnPreDrawListenerC38025aZ3.m71216a(findViewById, new Runnable() { // from class: jl
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.m47093x();
                    }
                }, new Runnable() { // from class: kl
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppStartTrace.this.m47092y();
                    }
                });
            }
            if (this.f74369o != null) {
                return;
            }
            this.f74363i = new WeakReference<>(activity);
            this.f74369o = this.f74358d.m70796a();
            this.f74375u = SessionManager.getInstance().perfSession();
            C10776ad m71007e = C10776ad.m71007e();
            m71007e.m71011a("onResume(): " + activity.getClass().getName() + ": " + m47102n().m47035d(this.f74369o) + " microseconds");
            f74354C.execute(new Runnable() { // from class: ll
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.m47096u();
                }
            });
            if (!m113350h) {
                m47111A();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public synchronized void onActivityStarted(Activity activity) {
        if (!this.f74376v && this.f74368n == null && !this.f74364j) {
            this.f74368n = this.f74358d.m70796a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Keep
    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_STOP)
    public void onAppEnteredBackground() {
        if (!this.f74376v && !this.f74364j && this.f74371q == null) {
            this.f74371q = this.f74358d.m70796a();
            this.f74360f.m40015P(C41338g66.m40054A0().m40008Y("_experiment_firstBackgrounding").m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(this.f74371q)).build());
        }
    }

    @Keep
    @InterfaceC11733l(AbstractC11719f.EnumC11720a.ON_START)
    public void onAppEnteredForeground() {
        if (!this.f74376v && !this.f74364j && this.f74370p == null) {
            this.f74370p = this.f74358d.m70796a();
            this.f74360f.m40015P(C41338g66.m40054A0().m40008Y("_experiment_firstForegrounding").m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(this.f74370p)).build());
        }
    }

    /* renamed from: q */
    public final Timer m47099q() {
        Timer timer = this.f74365k;
        if (timer != null) {
            return timer;
        }
        return m47102n();
    }

    /* renamed from: u */
    public final void m47096u() {
        C41338g66.C20751b m40009X = C41338g66.m40054A0().m40008Y(EnumC36275Ty0.APP_START_TRACE_NAME.toString()).m40010W(m47102n().m47034e()).m40009X(m47102n().m47035d(this.f74369o));
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(C41338g66.m40054A0().m40008Y(EnumC36275Ty0.ON_CREATE_TRACE_NAME.toString()).m40010W(m47102n().m47034e()).m40009X(m47102n().m47035d(this.f74367m)).build());
        C41338g66.C20751b m40054A0 = C41338g66.m40054A0();
        m40054A0.m40008Y(EnumC36275Ty0.ON_START_TRACE_NAME.toString()).m40010W(this.f74367m.m47034e()).m40009X(this.f74367m.m47035d(this.f74368n));
        arrayList.add(m40054A0.build());
        C41338g66.C20751b m40054A02 = C41338g66.m40054A0();
        m40054A02.m40008Y(EnumC36275Ty0.ON_RESUME_TRACE_NAME.toString()).m40010W(this.f74368n.m47034e()).m40009X(this.f74368n.m47035d(this.f74369o));
        arrayList.add(m40054A02.build());
        m40009X.m40017N(arrayList).m40016O(this.f74375u.m47055a());
        this.f74357c.m39144C(m40009X.build(), EnumC23350im.FOREGROUND_BACKGROUND);
    }

    /* renamed from: v */
    public final void m47095v(final C41338g66.C20751b c20751b) {
        if (this.f74372r != null && this.f74373s != null && this.f74374t != null) {
            f74354C.execute(new Runnable() { // from class: ml
                @Override // java.lang.Runnable
                public final void run() {
                    AppStartTrace.this.m47097t(c20751b);
                }
            });
            m47111A();
        }
    }

    /* renamed from: w */
    public final void m47094w() {
        String str;
        if (this.f74374t != null) {
            return;
        }
        this.f74374t = this.f74358d.m70796a();
        this.f74360f.m40015P(C41338g66.m40054A0().m40008Y("_experiment_onDrawFoQ").m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(this.f74374t)).build());
        if (this.f74365k != null) {
            this.f74360f.m40015P(C41338g66.m40054A0().m40008Y("_experiment_procStart_to_classLoad").m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(m47102n())).build());
        }
        C41338g66.C20751b c20751b = this.f74360f;
        if (this.f74379y) {
            str = "true";
        } else {
            str = "false";
        }
        c20751b.m40011V("systemDeterminedForeground", str);
        this.f74360f.m40012U("onDrawCount", this.f74377w);
        this.f74360f.m40016O(this.f74375u.m47055a());
        m47095v(this.f74360f);
    }

    /* renamed from: x */
    public final void m47093x() {
        if (this.f74372r != null) {
            return;
        }
        this.f74372r = this.f74358d.m70796a();
        this.f74360f.m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(this.f74372r));
        m47095v(this.f74360f);
    }

    /* renamed from: y */
    public final void m47092y() {
        if (this.f74373s != null) {
            return;
        }
        this.f74373s = this.f74358d.m70796a();
        this.f74360f.m40015P(C41338g66.m40054A0().m40008Y("_experiment_preDrawFoQ").m40010W(m47099q().m47034e()).m40009X(m47099q().m47035d(this.f74373s)).build());
        m47095v(this.f74360f);
    }

    /* renamed from: z */
    public synchronized void m47091z(Context context) {
        boolean z;
        if (this.f74356b) {
            return;
        }
        C11736n.m66967l().getLifecycle().mo67008a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.f74379y && !m47098s(applicationContext)) {
                z = false;
                this.f74379y = z;
                this.f74356b = true;
                this.f74361g = applicationContext;
            }
            z = true;
            this.f74379y = z;
            this.f74356b = true;
            this.f74361g = applicationContext;
        }
    }
}
