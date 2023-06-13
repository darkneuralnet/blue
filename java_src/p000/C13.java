package p000;

import dagger.MembersInjector;
/* renamed from: C13 */
/* loaded from: classes2.dex */
public final class C13 implements MembersInjector<B13> {

    /* renamed from: a */
    public final Y94<D13> f3289a;

    /* renamed from: b */
    public static void m113001b(B13 b13, D13 d13) {
        b13.f1539b = d13;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(B13 b13) {
        m113001b(b13, this.f3289a.get());
    }
}
