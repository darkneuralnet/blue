package p000;

import android.app.admin.DevicePolicyManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import co.bird.android.manager.analytics.persistence.AnalyticsDatabase;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import dagger.Lazy;
/* renamed from: ZH2 */
/* loaded from: classes4.dex */
public final class ZH2 implements InterfaceC48812sj1<InterfaceC1880Ea> {

    /* renamed from: a */
    public final VH2 f48146a;

    /* renamed from: b */
    public final Y94<InterfaceC6097Oh> f48147b;

    /* renamed from: c */
    public final Y94<InterfaceC10121Z9> f48148c;

    /* renamed from: d */
    public final Y94<InterfaceC10736ab> f48149d;

    /* renamed from: e */
    public final Y94<C22454gl> f48150e;

    /* renamed from: f */
    public final Y94<InterfaceC44257l20> f48151f;

    /* renamed from: g */
    public final Y94<AbstractC39873de5> f48152g;

    /* renamed from: h */
    public final Y94<InterfaceC0650Bc> f48153h;

    /* renamed from: i */
    public final Y94<LifecycleOwner> f48154i;

    /* renamed from: j */
    public final Y94<C36207Tq4> f48155j;

    /* renamed from: k */
    public final Y94<InterfaceC49820uQ3> f48156k;

    /* renamed from: l */
    public final Y94<GI3> f48157l;

    /* renamed from: m */
    public final Y94<ConnectivityManager> f48158m;

    /* renamed from: n */
    public final Y94<InterfaceC46037o21> f48159n;

    /* renamed from: o */
    public final Y94<DevicePolicyManager> f48160o;

    /* renamed from: p */
    public final Y94<WifiManager> f48161p;

    /* renamed from: q */
    public final Y94<TelephonyManager> f48162q;

    /* renamed from: r */
    public final Y94<AnalyticsDatabase> f48163r;

    /* renamed from: s */
    public final Y94<InterfaceC42524i66> f48164s;

    /* renamed from: t */
    public final Y94<InterfaceC35660Rh6> f48165t;

    /* renamed from: u */
    public final Y94<InterfaceC44662lj1> f48166u;

    /* renamed from: v */
    public final Y94<InterfaceC51213wm1> f48167v;

    /* renamed from: w */
    public final Y94<FirebaseCrashlytics> f48168w;

    /* renamed from: x */
    public final Y94<ZC6> f48169x;

    /* renamed from: y */
    public final Y94<InterfaceC40001dr4> f48170y;

    public ZH2(VH2 vh2, Y94<InterfaceC6097Oh> y94, Y94<InterfaceC10121Z9> y942, Y94<InterfaceC10736ab> y943, Y94<C22454gl> y944, Y94<InterfaceC44257l20> y945, Y94<AbstractC39873de5> y946, Y94<InterfaceC0650Bc> y947, Y94<LifecycleOwner> y948, Y94<C36207Tq4> y949, Y94<InterfaceC49820uQ3> y9410, Y94<GI3> y9411, Y94<ConnectivityManager> y9412, Y94<InterfaceC46037o21> y9413, Y94<DevicePolicyManager> y9414, Y94<WifiManager> y9415, Y94<TelephonyManager> y9416, Y94<AnalyticsDatabase> y9417, Y94<InterfaceC42524i66> y9418, Y94<InterfaceC35660Rh6> y9419, Y94<InterfaceC44662lj1> y9420, Y94<InterfaceC51213wm1> y9421, Y94<FirebaseCrashlytics> y9422, Y94<ZC6> y9423, Y94<InterfaceC40001dr4> y9424) {
        this.f48146a = vh2;
        this.f48147b = y94;
        this.f48148c = y942;
        this.f48149d = y943;
        this.f48150e = y944;
        this.f48151f = y945;
        this.f48152g = y946;
        this.f48153h = y947;
        this.f48154i = y948;
        this.f48155j = y949;
        this.f48156k = y9410;
        this.f48157l = y9411;
        this.f48158m = y9412;
        this.f48159n = y9413;
        this.f48160o = y9414;
        this.f48161p = y9415;
        this.f48162q = y9416;
        this.f48163r = y9417;
        this.f48164s = y9418;
        this.f48165t = y9419;
        this.f48166u = y9420;
        this.f48167v = y9421;
        this.f48168w = y9422;
        this.f48169x = y9423;
        this.f48170y = y9424;
    }

    /* renamed from: a */
    public static ZH2 m73372a(VH2 vh2, Y94<InterfaceC6097Oh> y94, Y94<InterfaceC10121Z9> y942, Y94<InterfaceC10736ab> y943, Y94<C22454gl> y944, Y94<InterfaceC44257l20> y945, Y94<AbstractC39873de5> y946, Y94<InterfaceC0650Bc> y947, Y94<LifecycleOwner> y948, Y94<C36207Tq4> y949, Y94<InterfaceC49820uQ3> y9410, Y94<GI3> y9411, Y94<ConnectivityManager> y9412, Y94<InterfaceC46037o21> y9413, Y94<DevicePolicyManager> y9414, Y94<WifiManager> y9415, Y94<TelephonyManager> y9416, Y94<AnalyticsDatabase> y9417, Y94<InterfaceC42524i66> y9418, Y94<InterfaceC35660Rh6> y9419, Y94<InterfaceC44662lj1> y9420, Y94<InterfaceC51213wm1> y9421, Y94<FirebaseCrashlytics> y9422, Y94<ZC6> y9423, Y94<InterfaceC40001dr4> y9424) {
        return new ZH2(vh2, y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413, y9414, y9415, y9416, y9417, y9418, y9419, y9420, y9421, y9422, y9423, y9424);
    }

    /* renamed from: c */
    public static InterfaceC1880Ea m73370c(VH2 vh2, InterfaceC6097Oh interfaceC6097Oh, InterfaceC10121Z9 interfaceC10121Z9, InterfaceC10736ab interfaceC10736ab, C22454gl c22454gl, InterfaceC44257l20 interfaceC44257l20, AbstractC39873de5 abstractC39873de5, InterfaceC0650Bc interfaceC0650Bc, LifecycleOwner lifecycleOwner, C36207Tq4 c36207Tq4, InterfaceC49820uQ3 interfaceC49820uQ3, GI3 gi3, ConnectivityManager connectivityManager, InterfaceC46037o21 interfaceC46037o21, DevicePolicyManager devicePolicyManager, WifiManager wifiManager, TelephonyManager telephonyManager, AnalyticsDatabase analyticsDatabase, InterfaceC42524i66 interfaceC42524i66, InterfaceC35660Rh6 interfaceC35660Rh6, InterfaceC44662lj1 interfaceC44662lj1, InterfaceC51213wm1 interfaceC51213wm1, FirebaseCrashlytics firebaseCrashlytics, Lazy<ZC6> lazy, InterfaceC40001dr4 interfaceC40001dr4) {
        return (InterfaceC1880Ea) C51679xZ3.m5002e(vh2.m80067d(interfaceC6097Oh, interfaceC10121Z9, interfaceC10736ab, c22454gl, interfaceC44257l20, abstractC39873de5, interfaceC0650Bc, lifecycleOwner, c36207Tq4, interfaceC49820uQ3, gi3, connectivityManager, interfaceC46037o21, devicePolicyManager, wifiManager, telephonyManager, analyticsDatabase, interfaceC42524i66, interfaceC35660Rh6, interfaceC44662lj1, interfaceC51213wm1, firebaseCrashlytics, lazy, interfaceC40001dr4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC1880Ea get() {
        return m73370c(this.f48146a, this.f48147b.get(), this.f48148c.get(), this.f48149d.get(), this.f48150e.get(), this.f48151f.get(), this.f48152g.get(), this.f48153h.get(), this.f48154i.get(), this.f48155j.get(), this.f48156k.get(), this.f48157l.get(), this.f48158m.get(), this.f48159n.get(), this.f48160o.get(), this.f48161p.get(), this.f48162q.get(), this.f48163r.get(), this.f48164s.get(), this.f48165t.get(), this.f48166u.get(), this.f48167v.get(), this.f48168w.get(), V51.m80430a(this.f48169x), this.f48170y.get());
    }
}
