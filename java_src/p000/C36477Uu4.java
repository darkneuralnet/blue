package p000;

import co.bird.android.feature.release.ReleaseScanActivity;
import dagger.MembersInjector;
/* renamed from: Uu4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36477Uu4 implements MembersInjector<ReleaseScanActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f38242a;

    /* renamed from: b */
    public final Y94<C22454gl> f38243b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f38244c;

    /* renamed from: d */
    public final Y94<C31806Av4> f38245d;

    /* renamed from: e */
    public final Y94<C36945Wu4> f38246e;

    /* renamed from: a */
    public static void m80641a(ReleaseScanActivity releaseScanActivity, C36945Wu4 c36945Wu4) {
        releaseScanActivity.f64527m = c36945Wu4;
    }

    /* renamed from: c */
    public static void m80639c(ReleaseScanActivity releaseScanActivity, C31806Av4 c31806Av4) {
        releaseScanActivity.f64526l = c31806Av4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(ReleaseScanActivity releaseScanActivity) {
        C4650Ky.m98043b(releaseScanActivity, this.f38242a.get());
        C4650Ky.m98042c(releaseScanActivity, this.f38243b.get());
        C4650Ky.m98041d(releaseScanActivity, this.f38244c.get());
        m80639c(releaseScanActivity, this.f38245d.get());
        m80641a(releaseScanActivity, this.f38246e.get());
    }
}
