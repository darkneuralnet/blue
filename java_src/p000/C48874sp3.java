package p000;

import dagger.MembersInjector;
/* renamed from: sp3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C48874sp3 implements MembersInjector<C48282rp3> {

    /* renamed from: a */
    public final Y94<C32219Cp3> f109371a;

    /* renamed from: b */
    public static void m13600b(C48282rp3 c48282rp3, C32219Cp3 c32219Cp3) {
        c48282rp3.f107706b = c32219Cp3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C48282rp3 c48282rp3) {
        m13600b(c48282rp3, this.f109371a.get());
    }
}
