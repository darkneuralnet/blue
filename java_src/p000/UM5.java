package p000;

import co.bird.android.feature.sober.SoberStartActivity;
import dagger.MembersInjector;
/* renamed from: UM5 */
/* loaded from: classes3.dex */
public final class UM5 implements MembersInjector<SoberStartActivity> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f37304a;

    /* renamed from: b */
    public final Y94<C22454gl> f37305b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f37306c;

    /* renamed from: d */
    public final Y94<C40308eN5> f37307d;

    /* renamed from: b */
    public static void m81585b(SoberStartActivity soberStartActivity, C40308eN5 c40308eN5) {
        soberStartActivity.f65627j = c40308eN5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(SoberStartActivity soberStartActivity) {
        C4650Ky.m98043b(soberStartActivity, this.f37304a.get());
        C4650Ky.m98042c(soberStartActivity, this.f37305b.get());
        C4650Ky.m98041d(soberStartActivity, this.f37306c.get());
        m81585b(soberStartActivity, this.f37307d.get());
    }
}
