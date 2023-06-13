package p000;

import co.bird.android.feature.payment.preload.p013v2.autoreload.AutoReloadV2Activity;
import dagger.MembersInjector;
/* renamed from: Bs */
/* loaded from: classes3.dex */
public final class C0754Bs implements MembersInjector<AutoReloadV2Activity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f2976a;

    /* renamed from: b */
    public final Y94<C22454gl> f2977b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f2978c;

    /* renamed from: d */
    public final Y94<C2966Gs> f2979d;

    /* renamed from: e */
    public final Y94<C8473Us> f2980e;

    /* renamed from: a */
    public static void m113429a(AutoReloadV2Activity autoReloadV2Activity, C2966Gs c2966Gs) {
        autoReloadV2Activity.f64419j = c2966Gs;
    }

    /* renamed from: c */
    public static void m113427c(AutoReloadV2Activity autoReloadV2Activity, C8473Us c8473Us) {
        autoReloadV2Activity.f64420k = c8473Us;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(AutoReloadV2Activity autoReloadV2Activity) {
        C4650Ky.m98043b(autoReloadV2Activity, this.f2976a.get());
        C4650Ky.m98042c(autoReloadV2Activity, this.f2977b.get());
        C4650Ky.m98041d(autoReloadV2Activity, this.f2978c.get());
        m113429a(autoReloadV2Activity, this.f2979d.get());
        m113427c(autoReloadV2Activity, this.f2980e.get());
    }
}
