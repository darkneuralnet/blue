package p000;

import co.bird.android.feature.payment.preload.p013v2.landing.PreloadV2Activity;
import dagger.MembersInjector;
/* renamed from: q04  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47206q04 implements MembersInjector<PreloadV2Activity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f104473a;

    /* renamed from: b */
    public final Y94<C22454gl> f104474b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f104475c;

    /* renamed from: d */
    public final Y94<C51355x04> f104476d;

    /* renamed from: b */
    public static void m18334b(PreloadV2Activity preloadV2Activity, C51355x04 c51355x04) {
        preloadV2Activity.f64424j = c51355x04;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(PreloadV2Activity preloadV2Activity) {
        C4650Ky.m98043b(preloadV2Activity, this.f104473a.get());
        C4650Ky.m98042c(preloadV2Activity, this.f104474b.get());
        C4650Ky.m98041d(preloadV2Activity, this.f104475c.get());
        m18334b(preloadV2Activity, this.f104476d.get());
    }
}
