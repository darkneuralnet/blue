package p000;

import co.bird.android.feature.payment.preload.p013v2.options.PreloadV2OptionsActivity;
import dagger.MembersInjector;
/* renamed from: V04 */
/* loaded from: classes3.dex */
public final class V04 implements MembersInjector<PreloadV2OptionsActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f38414a;

    /* renamed from: b */
    public final Y94<C22454gl> f38415b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f38416c;

    /* renamed from: d */
    public final Y94<Y04> f38417d;

    /* renamed from: e */
    public final Y94<J14> f38418e;

    /* renamed from: f */
    public final Y94<InterfaceC37711a14> f38419f;

    /* renamed from: a */
    public static void m80504a(PreloadV2OptionsActivity preloadV2OptionsActivity, Y04 y04) {
        preloadV2OptionsActivity.f64435j = y04;
    }

    /* renamed from: c */
    public static void m80502c(PreloadV2OptionsActivity preloadV2OptionsActivity, InterfaceC37711a14 interfaceC37711a14) {
        preloadV2OptionsActivity.f64437l = interfaceC37711a14;
    }

    /* renamed from: d */
    public static void m80501d(PreloadV2OptionsActivity preloadV2OptionsActivity, J14 j14) {
        preloadV2OptionsActivity.f64436k = j14;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(PreloadV2OptionsActivity preloadV2OptionsActivity) {
        C4650Ky.m98043b(preloadV2OptionsActivity, this.f38414a.get());
        C4650Ky.m98042c(preloadV2OptionsActivity, this.f38415b.get());
        C4650Ky.m98041d(preloadV2OptionsActivity, this.f38416c.get());
        m80504a(preloadV2OptionsActivity, this.f38417d.get());
        m80501d(preloadV2OptionsActivity, this.f38418e.get());
        m80502c(preloadV2OptionsActivity, this.f38419f.get());
    }
}
