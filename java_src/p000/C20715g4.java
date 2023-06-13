package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.C17216a;
import com.facebook.share.internal.C17296a;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p000.C32172Ck1;
import p000.C32992Fx2;
@Metadata(m28433d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b?\u0010@J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007J\n\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u001b\u001a\n \u0018*\u0004\u0018\u00010\u00170\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010\u0015R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001e\u0010;\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, m28432d2 = {"Lg4;", "", "Landroid/app/Application;", "application", "", "appId", "", "x", "", "s", "Ljava/util/UUID;", "q", "Landroid/app/Activity;", "activity", "t", "w", "p", "v", "u", "o", C17296a.f69688o, "Ljava/lang/String;", "TAG", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "b", "Ljava/util/concurrent/ScheduledExecutorService;", "singleThreadExecutor", "Ljava/util/concurrent/ScheduledFuture;", "c", "Ljava/util/concurrent/ScheduledFuture;", "currentFuture", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "currentFutureLock", "Ljava/util/concurrent/atomic/AtomicInteger;", "e", "Ljava/util/concurrent/atomic/AtomicInteger;", "foregroundActivityCount", "Lvv5;", "f", "Lvv5;", "currentSession", "Ljava/util/concurrent/atomic/AtomicBoolean;", "g", "Ljava/util/concurrent/atomic/AtomicBoolean;", "tracking", "h", "", "i", "J", "currentActivityAppearTime", "", "j", "I", "activityReferences", "Ljava/lang/ref/WeakReference;", "k", "Ljava/lang/ref/WeakReference;", "currActivity", "r", "()I", "sessionTimeoutInSeconds", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: g4 */
/* loaded from: classes5.dex */
public final class C20715g4 {

    /* renamed from: a */
    public static final String f81498a;

    /* renamed from: b */
    public static final ScheduledExecutorService f81499b;

    /* renamed from: c */
    public static volatile ScheduledFuture<?> f81500c;

    /* renamed from: d */
    public static final Object f81501d;

    /* renamed from: e */
    public static final AtomicInteger f81502e;

    /* renamed from: f */
    public static volatile C50714vv5 f81503f;

    /* renamed from: g */
    public static final AtomicBoolean f81504g;

    /* renamed from: h */
    public static String f81505h;

    /* renamed from: i */
    public static long f81506i;

    /* renamed from: j */
    public static int f81507j;

    /* renamed from: k */
    public static WeakReference<Activity> f81508k;

    /* renamed from: l */
    public static final C20715g4 f81509l = new C20715g4();

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: g4$a */
    /* loaded from: classes5.dex */
    public static final class RunnableC20716a implements Runnable {

        /* renamed from: b */
        public static final RunnableC20716a f81510b = new RunnableC20716a();

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C20715g4 c20715g4 = C20715g4.f81509l;
                if (C20715g4.f81503f == null) {
                    C20715g4.f81503f = C50714vv5.f114909g.m7743b();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: g4$b */
    /* loaded from: classes5.dex */
    public static final class RunnableC20717b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f81511b;

        /* renamed from: c */
        public final /* synthetic */ String f81512c;

        @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
        /* renamed from: g4$b$a */
        /* loaded from: classes5.dex */
        public static final class RunnableC20718a implements Runnable {
            public RunnableC20718a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (TD0.m84203d(this)) {
                    return;
                }
                try {
                    if (TD0.m84203d(this)) {
                        return;
                    }
                    C20715g4 c20715g4 = C20715g4.f81509l;
                    if (C20715g4.f81503f == null) {
                        C20715g4.f81503f = new C50714vv5(Long.valueOf(RunnableC20717b.this.f81511b), null, null, 4, null);
                    }
                    if (C20715g4.f81502e.get() <= 0) {
                        C51307wv5.m6097e(RunnableC20717b.this.f81512c, C20715g4.f81503f, C20715g4.f81505h);
                        C50714vv5.f114909g.m7744a();
                        C20715g4.f81503f = null;
                    }
                    synchronized (C20715g4.f81501d) {
                        C20715g4.f81500c = null;
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th) {
                    TD0.m84205b(th, this);
                }
            }
        }

        public RunnableC20717b(long j, String str) {
            this.f81511b = j;
            this.f81512c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C20715g4 c20715g4 = C20715g4.f81509l;
                if (C20715g4.f81503f == null) {
                    C20715g4.f81503f = new C50714vv5(Long.valueOf(this.f81511b), null, null, 4, null);
                }
                C50714vv5 c50714vv5 = C20715g4.f81503f;
                if (c50714vv5 != null) {
                    c50714vv5.m7747k(Long.valueOf(this.f81511b));
                }
                if (C20715g4.f81502e.get() <= 0) {
                    RunnableC20718a runnableC20718a = new RunnableC20718a();
                    synchronized (C20715g4.f81501d) {
                        C20715g4.f81500c = C20715g4.f81499b.schedule(runnableC20718a, c20715g4.m40174r(), TimeUnit.SECONDS);
                        Unit unit = Unit.INSTANCE;
                    }
                }
                long j = C20715g4.f81506i;
                long j2 = 0;
                if (j > 0) {
                    j2 = (this.f81511b - j) / 1000;
                }
                C7580Su.m84662e(this.f81512c, j2);
                C50714vv5 c50714vv52 = C20715g4.f81503f;
                if (c50714vv52 != null) {
                    c50714vv52.m7745m();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28434bv = {1, 0, 3}, m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "", "run"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: g4$c */
    /* loaded from: classes5.dex */
    public static final class RunnableC20719c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ long f81514b;

        /* renamed from: c */
        public final /* synthetic */ String f81515c;

        /* renamed from: d */
        public final /* synthetic */ Context f81516d;

        public RunnableC20719c(long j, String str, Context context) {
            this.f81514b = j;
            this.f81515c = str;
            this.f81516d = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Long l;
            C50714vv5 c50714vv5;
            if (TD0.m84203d(this)) {
                return;
            }
            try {
                if (TD0.m84203d(this)) {
                    return;
                }
                C20715g4 c20715g4 = C20715g4.f81509l;
                C50714vv5 c50714vv52 = C20715g4.f81503f;
                if (c50714vv52 != null) {
                    l = c50714vv52.m7753e();
                } else {
                    l = null;
                }
                if (C20715g4.f81503f == null) {
                    C20715g4.f81503f = new C50714vv5(Long.valueOf(this.f81514b), null, null, 4, null);
                    String str = this.f81515c;
                    String str2 = C20715g4.f81505h;
                    Context appContext = this.f81516d;
                    Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
                    C51307wv5.m6099c(str, null, str2, appContext);
                } else if (l != null) {
                    long longValue = this.f81514b - l.longValue();
                    if (longValue > c20715g4.m40174r() * 1000) {
                        C51307wv5.m6097e(this.f81515c, C20715g4.f81503f, C20715g4.f81505h);
                        String str3 = this.f81515c;
                        String str4 = C20715g4.f81505h;
                        Context appContext2 = this.f81516d;
                        Intrinsics.checkNotNullExpressionValue(appContext2, "appContext");
                        C51307wv5.m6099c(str3, null, str4, appContext2);
                        C20715g4.f81503f = new C50714vv5(Long.valueOf(this.f81514b), null, null, 4, null);
                    } else if (longValue > 1000 && (c50714vv5 = C20715g4.f81503f) != null) {
                        c50714vv5.m7750h();
                    }
                }
                C50714vv5 c50714vv53 = C20715g4.f81503f;
                if (c50714vv53 != null) {
                    c50714vv53.m7747k(Long.valueOf(this.f81514b));
                }
                C50714vv5 c50714vv54 = C20715g4.f81503f;
                if (c50714vv54 != null) {
                    c50714vv54.m7745m();
                }
            } catch (Throwable th) {
                TD0.m84205b(th, this);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"", "enabled", "", C17296a.f69688o, "(Z)V"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: g4$d */
    /* loaded from: classes5.dex */
    public static final class C20720d implements C32172Ck1.InterfaceC1164a {

        /* renamed from: a */
        public static final C20720d f81517a = new C20720d();

        @Override // p000.C32172Ck1.InterfaceC1164a
        /* renamed from: a */
        public final void mo16504a(boolean z) {
            if (z) {
                C35690Rl0.m86343h();
            } else {
                C35690Rl0.m86344g();
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000f"}, m28432d2 = {"g4$e", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityCreated", "onActivityStarted", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: g4$e */
    /* loaded from: classes5.dex */
    public static final class C20721e implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivityCreated");
            C9155Wi.m77979a();
            C20715g4.m40172t(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivityDestroyed");
            c20715g4.m40171u(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivityPaused");
            C9155Wi.m77979a();
            c20715g4.m40170v(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivityResumed");
            C9155Wi.m77979a();
            C20715g4.m40169w(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(outState, "outState");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivitySaveInstanceState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C20715g4 c20715g4 = C20715g4.f81509l;
            C20715g4.f81507j++;
            C32992Fx2.f10539f.m106214c(EnumC36034Sx2.APP_EVENTS, C20715g4.f81498a, "onActivityStarted");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
            EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.APP_EVENTS;
            C20715g4 c20715g4 = C20715g4.f81509l;
            c2516a.m106214c(enumC36034Sx2, C20715g4.f81498a, "onActivityStopped");
            C9459Xi.m76549i();
            C20715g4.f81507j--;
        }
    }

    static {
        String canonicalName = C20715g4.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.internal.ActivityLifecycleTracker";
        }
        f81498a = canonicalName;
        f81499b = Executors.newSingleThreadScheduledExecutor();
        f81501d = new Object();
        f81502e = new AtomicInteger(0);
        f81504g = new AtomicBoolean(false);
    }

    private C20715g4() {
    }

    @JvmStatic
    /* renamed from: p */
    public static final Activity m40176p() {
        WeakReference<Activity> weakReference = f81508k;
        if (weakReference == null || weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    /* renamed from: q */
    public static final UUID m40175q() {
        C50714vv5 c50714vv5;
        if (f81503f == null || (c50714vv5 = f81503f) == null) {
            return null;
        }
        return c50714vv5.m7754d();
    }

    @JvmStatic
    /* renamed from: s */
    public static final boolean m40173s() {
        return f81507j == 0;
    }

    @JvmStatic
    /* renamed from: t */
    public static final void m40172t(Activity activity) {
        f81499b.execute(RunnableC20716a.f81510b);
    }

    @JvmStatic
    /* renamed from: w */
    public static final void m40169w(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f81508k = new WeakReference<>(activity);
        f81502e.incrementAndGet();
        f81509l.m40177o();
        long currentTimeMillis = System.currentTimeMillis();
        f81506i = currentTimeMillis;
        String m2819q = C52364yi6.m2819q(activity);
        C35690Rl0.m86337n(activity);
        KT2.m98851d(activity);
        QU5.m88463h(activity);
        MZ1.m95164b();
        f81499b.execute(new RunnableC20719c(currentTimeMillis, m2819q, activity.getApplicationContext()));
    }

    @JvmStatic
    /* renamed from: x */
    public static final void m40168x(Application application, String str) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (!f81504g.compareAndSet(false, true)) {
            return;
        }
        C32172Ck1.m111760a(C32172Ck1.EnumC1165b.CodelessEvents, C20720d.f81517a);
        f81505h = str;
        application.registerActivityLifecycleCallbacks(new C20721e());
    }

    /* renamed from: o */
    public final void m40177o() {
        ScheduledFuture<?> scheduledFuture;
        synchronized (f81501d) {
            if (f81500c != null && (scheduledFuture = f81500c) != null) {
                scheduledFuture.cancel(false);
            }
            f81500c = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    /* renamed from: r */
    public final int m40174r() {
        C34512Mk1 m93522j = C34746Nk1.m93522j(C17216a.m52740f());
        if (m93522j != null) {
            return m93522j.m94969m();
        }
        return C36509Uy0.m80579a();
    }

    /* renamed from: u */
    public final void m40171u(Activity activity) {
        C35690Rl0.m86339l(activity);
    }

    /* renamed from: v */
    public final void m40170v(Activity activity) {
        AtomicInteger atomicInteger = f81502e;
        if (atomicInteger.decrementAndGet() < 0) {
            atomicInteger.set(0);
            Log.w(f81498a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        m40177o();
        long currentTimeMillis = System.currentTimeMillis();
        String m2819q = C52364yi6.m2819q(activity);
        C35690Rl0.m86338m(activity);
        f81499b.execute(new RunnableC20717b(currentTimeMillis, m2819q));
    }
}
