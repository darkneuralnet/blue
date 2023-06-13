package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11736n;
import androidx.lifecycle.FragmentC11742o;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0002*\u000fB\t\b\u0002¢\u0006\u0004\b)\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, m28432d2 = {"Landroidx/lifecycle/n;", "LLifecycleOwner;", "", "f", "()V", "e", DateTokenConverter.CONVERTER_KEY, "g", "j", "k", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "h", "(Landroid/content/Context;)V", "", "b", "I", "startedCounter", "c", "resumedCounter", "", "Z", "pauseSent", "stopSent", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/lifecycle/j;", "Landroidx/lifecycle/j;", "registry", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "delayedPauseRunnable", "Landroidx/lifecycle/o$a;", "i", "Landroidx/lifecycle/o$a;", "initializationListener", "Landroidx/lifecycle/f;", "getLifecycle", "()Landroidx/lifecycle/f;", "lifecycle", "<init>", C17296a.f69688o, "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class C11736n implements LifecycleOwner {

    /* renamed from: j */
    public static final C11738b f54943j = new C11738b(null);

    /* renamed from: k */
    public static final C11736n f54944k = new C11736n();

    /* renamed from: b */
    public int f54945b;

    /* renamed from: c */
    public int f54946c;

    /* renamed from: f */
    public Handler f54949f;

    /* renamed from: d */
    public boolean f54947d = true;

    /* renamed from: e */
    public boolean f54948e = true;

    /* renamed from: g */
    public final C11729j f54950g = new C11729j(this);

    /* renamed from: h */
    public final Runnable f54951h = new Runnable() { // from class: M64
        @Override // java.lang.Runnable
        public final void run() {
            C11736n.m66970i(C11736n.this);
        }
    };

    /* renamed from: i */
    public final FragmentC11742o.InterfaceC11743a f54952i = new C11741d();

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, m28432d2 = {"Landroidx/lifecycle/n$a;", "", "Landroid/app/Activity;", "activity", "Landroid/app/Application$ActivityLifecycleCallbacks;", "callback", "", C17296a.f69688o, "<init>", "()V", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.n$a */
    /* loaded from: classes.dex */
    public static final class C11737a {

        /* renamed from: a */
        public static final C11737a f54953a = new C11737a();

        private C11737a() {
        }

        @JvmStatic
        /* renamed from: a */
        public static final void m66966a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0000X\u0081T¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m28432d2 = {"Landroidx/lifecycle/n$b;", "", "LLifecycleOwner;", C17296a.f69688o, "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "b", "(Landroid/content/Context;)V", "", "TIMEOUT_MS", "J", "getTIMEOUT_MS$lifecycle_process_release$annotations", "()V", "Landroidx/lifecycle/n;", "newInstance", "Landroidx/lifecycle/n;", "<init>", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.n$b */
    /* loaded from: classes.dex */
    public static final class C11738b {
        public /* synthetic */ C11738b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final LifecycleOwner m66965a() {
            return C11736n.f54944k;
        }

        @JvmStatic
        /* renamed from: b */
        public final void m66964b(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C11736n.f54944k.m66971h(context);
        }

        private C11738b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017J\u001a\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, m28432d2 = {"androidx/lifecycle/n$c", "LNa1;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "", "onActivityPreCreated", "onActivityCreated", "onActivityPaused", "onActivityStopped", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.n$c */
    /* loaded from: classes.dex */
    public static final class C11739c extends C34656Na1 {

        @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m28432d2 = {"androidx/lifecycle/n$c$a", "LNa1;", "Landroid/app/Activity;", "activity", "", "onActivityPostStarted", "onActivityPostResumed", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.n$c$a */
        /* loaded from: classes.dex */
        public static final class C11740a extends C34656Na1 {
            final /* synthetic */ C11736n this$0;

            public C11740a(C11736n c11736n) {
                this.this$0 = c11736n;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.m66974e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                this.this$0.m66973f();
            }
        }

        public C11739c() {
        }

        @Override // p000.C34656Na1, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC11742o.f54955c.m66955b(activity).m66958f(C11736n.this.f54952i);
            }
        }

        @Override // p000.C34656Na1, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C11736n.this.m66975d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C11737a.m66966a(activity, new C11740a(C11736n.this));
        }

        @Override // p000.C34656Na1, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            C11736n.this.m66972g();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m28432d2 = {"androidx/lifecycle/n$d", "Landroidx/lifecycle/o$a;", "", C17296a.f69688o, "onStart", "onResume", "lifecycle-process_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: androidx.lifecycle.n$d */
    /* loaded from: classes.dex */
    public static final class C11741d implements FragmentC11742o.InterfaceC11743a {
        public C11741d() {
        }

        @Override // androidx.lifecycle.FragmentC11742o.InterfaceC11743a
        /* renamed from: a */
        public void mo66957a() {
        }

        @Override // androidx.lifecycle.FragmentC11742o.InterfaceC11743a
        public void onResume() {
            C11736n.this.m66974e();
        }

        @Override // androidx.lifecycle.FragmentC11742o.InterfaceC11743a
        public void onStart() {
            C11736n.this.m66973f();
        }
    }

    private C11736n() {
    }

    /* renamed from: i */
    public static final void m66970i(C11736n this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m66969j();
        this$0.m66968k();
    }

    @JvmStatic
    /* renamed from: l */
    public static final LifecycleOwner m66967l() {
        return f54943j.m66965a();
    }

    /* renamed from: d */
    public final void m66975d() {
        int i = this.f54946c - 1;
        this.f54946c = i;
        if (i == 0) {
            Handler handler = this.f54949f;
            Intrinsics.checkNotNull(handler);
            handler.postDelayed(this.f54951h, 700L);
        }
    }

    /* renamed from: e */
    public final void m66974e() {
        int i = this.f54946c + 1;
        this.f54946c = i;
        if (i == 1) {
            if (this.f54947d) {
                this.f54950g.m67001i(AbstractC11719f.EnumC11720a.ON_RESUME);
                this.f54947d = false;
                return;
            }
            Handler handler = this.f54949f;
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacks(this.f54951h);
        }
    }

    /* renamed from: f */
    public final void m66973f() {
        int i = this.f54945b + 1;
        this.f54945b = i;
        if (i == 1 && this.f54948e) {
            this.f54950g.m67001i(AbstractC11719f.EnumC11720a.ON_START);
            this.f54948e = false;
        }
    }

    /* renamed from: g */
    public final void m66972g() {
        this.f54945b--;
        m66968k();
    }

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        return this.f54950g;
    }

    /* renamed from: h */
    public final void m66971h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f54949f = new Handler();
        this.f54950g.m67001i(AbstractC11719f.EnumC11720a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new C11739c());
    }

    /* renamed from: j */
    public final void m66969j() {
        if (this.f54946c == 0) {
            this.f54947d = true;
            this.f54950g.m67001i(AbstractC11719f.EnumC11720a.ON_PAUSE);
        }
    }

    /* renamed from: k */
    public final void m66968k() {
        if (this.f54945b == 0 && this.f54947d) {
            this.f54950g.m67001i(AbstractC11719f.EnumC11720a.ON_STOP);
            this.f54948e = true;
        }
    }
}
