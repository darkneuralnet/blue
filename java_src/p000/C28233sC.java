package p000;

import co.bird.android.feature.transferorder.scanner.outbound.base.BaseOutboundScanActivity;
import dagger.MembersInjector;
import p000.C33011Fz3;
/* renamed from: sC */
/* loaded from: classes3.dex */
public final class C28233sC<T extends C33011Fz3> implements MembersInjector<BaseOutboundScanActivity<T>> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f108434a;

    /* renamed from: b */
    public final Y94<C22454gl> f108435b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f108436c;

    /* renamed from: d */
    public final Y94<C38877bz3> f108437d;

    /* renamed from: e */
    public final Y94<C51174wi2> f108438e;

    /* renamed from: a */
    public static <T extends C33011Fz3> void m14569a(BaseOutboundScanActivity<T> baseOutboundScanActivity, C38877bz3 c38877bz3) {
        baseOutboundScanActivity.f65746l = c38877bz3;
    }

    /* renamed from: b */
    public static <T extends C33011Fz3> void m14568b(BaseOutboundScanActivity<T> baseOutboundScanActivity, C51174wi2 c51174wi2) {
        baseOutboundScanActivity.f65747m = c51174wi2;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(BaseOutboundScanActivity<T> baseOutboundScanActivity) {
        C4650Ky.m98043b(baseOutboundScanActivity, this.f108434a.get());
        C4650Ky.m98042c(baseOutboundScanActivity, this.f108435b.get());
        C4650Ky.m98041d(baseOutboundScanActivity, this.f108436c.get());
        m14569a(baseOutboundScanActivity, this.f108437d.get());
        m14568b(baseOutboundScanActivity, this.f108438e.get());
    }
}
