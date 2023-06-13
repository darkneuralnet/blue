package p000;

import android.os.Handler;
import co.bird.android.App;
import co.bird.android.app.feature.locale.ApplicationForegroundLocaleUpdater;
import co.bird.android.app.feature.privatebirds.SmartlockBluetoothScanner;
import co.bird.android.foregroundservice.ForegroundServiceLifecycleObserver;
import co.bird.android.lib.shaketoreport.shakedetector.ShakeToReportDetector;
import co.bird.android.runtime.logging.ApplicationVisibilityTracker;
import co.bird.android.runtime.logging.CrashlyticsTree;
import co.bird.android.smartlock.impl.SmartLockGlobalBluetoothScanner;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.Lazy;
import dagger.MembersInjector;
/* renamed from: sl */
/* loaded from: classes.dex */
public final class C28378sl implements MembersInjector<App> {

    /* renamed from: a */
    public final Y94<C19957e4> f109193a;

    /* renamed from: b */
    public final Y94<YE0> f109194b;

    /* renamed from: c */
    public final Y94<FirebaseCrashlytics> f109195c;

    /* renamed from: d */
    public final Y94<CrashlyticsTree> f109196d;

    /* renamed from: e */
    public final Y94<ApplicationForegroundLocaleUpdater> f109197e;

    /* renamed from: f */
    public final Y94<ApplicationVisibilityTracker> f109198f;

    /* renamed from: g */
    public final Y94<ForegroundServiceLifecycleObserver> f109199g;

    /* renamed from: h */
    public final Y94<SmartlockBluetoothScanner> f109200h;

    /* renamed from: i */
    public final Y94<SmartLockGlobalBluetoothScanner> f109201i;

    /* renamed from: j */
    public final Y94<InterfaceC1880Ea> f109202j;

    /* renamed from: k */
    public final Y94<InterfaceC34406Ly3> f109203k;

    /* renamed from: l */
    public final Y94<C22454gl> f109204l;

    /* renamed from: m */
    public final Y94<ShakeToReportDetector> f109205m;

    /* renamed from: n */
    public final Y94<InterfaceC44257l20> f109206n;

    /* renamed from: o */
    public final Y94<Handler> f109207o;

    /* renamed from: p */
    public final Y94<LifecycleOwner> f109208p;

    /* renamed from: a */
    public static void m13733a(App app, Lazy<C19957e4> lazy) {
        app.f61254g = lazy;
    }

    /* renamed from: b */
    public static void m13732b(App app, Lazy<InterfaceC1880Ea> lazy) {
        app.f61263p = lazy;
    }

    /* renamed from: c */
    public static void m13731c(App app, Lazy<ApplicationVisibilityTracker> lazy) {
        app.f61259l = lazy;
    }

    /* renamed from: d */
    public static void m13730d(App app, Lazy<InterfaceC44257l20> lazy) {
        app.f61267t = lazy;
    }

    /* renamed from: e */
    public static void m13729e(App app, Lazy<FirebaseCrashlytics> lazy) {
        app.f61256i = lazy;
    }

    /* renamed from: f */
    public static void m13728f(App app, Lazy<CrashlyticsTree> lazy) {
        app.f61257j = lazy;
    }

    /* renamed from: g */
    public static void m13727g(App app, Lazy<YE0> lazy) {
        app.f61255h = lazy;
    }

    /* renamed from: h */
    public static void m13726h(App app, Lazy<ForegroundServiceLifecycleObserver> lazy) {
        app.f61260m = lazy;
    }

    /* renamed from: i */
    public static void m13725i(App app, Lazy<Handler> lazy) {
        app.f61268u = lazy;
    }

    /* renamed from: j */
    public static void m13724j(App app, Lazy<ApplicationForegroundLocaleUpdater> lazy) {
        app.f61258k = lazy;
    }

    /* renamed from: l */
    public static void m13722l(App app, Lazy<InterfaceC34406Ly3> lazy) {
        app.f61264q = lazy;
    }

    /* renamed from: m */
    public static void m13721m(App app, Lazy<C22454gl> lazy) {
        app.f61265r = lazy;
    }

    /* renamed from: n */
    public static void m13720n(App app, LifecycleOwner lifecycleOwner) {
        app.f61269v = lifecycleOwner;
    }

    /* renamed from: o */
    public static void m13719o(App app, Lazy<ShakeToReportDetector> lazy) {
        app.f61266s = lazy;
    }

    /* renamed from: p */
    public static void m13718p(App app, Lazy<SmartLockGlobalBluetoothScanner> lazy) {
        app.f61262o = lazy;
    }

    /* renamed from: q */
    public static void m13717q(App app, Lazy<SmartlockBluetoothScanner> lazy) {
        app.f61261n = lazy;
    }

    @Override // dagger.MembersInjector
    /* renamed from: k */
    public void injectMembers(App app) {
        m13733a(app, V51.m80430a(this.f109193a));
        m13727g(app, V51.m80430a(this.f109194b));
        m13729e(app, V51.m80430a(this.f109195c));
        m13728f(app, V51.m80430a(this.f109196d));
        m13724j(app, V51.m80430a(this.f109197e));
        m13731c(app, V51.m80430a(this.f109198f));
        m13726h(app, V51.m80430a(this.f109199g));
        m13717q(app, V51.m80430a(this.f109200h));
        m13718p(app, V51.m80430a(this.f109201i));
        m13732b(app, V51.m80430a(this.f109202j));
        m13722l(app, V51.m80430a(this.f109203k));
        m13721m(app, V51.m80430a(this.f109204l));
        m13719o(app, V51.m80430a(this.f109205m));
        m13730d(app, V51.m80430a(this.f109206n));
        m13725i(app, V51.m80430a(this.f109207o));
        m13720n(app, this.f109208p.get());
    }
}
