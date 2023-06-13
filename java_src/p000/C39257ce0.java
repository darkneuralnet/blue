package p000;

import dagger.MembersInjector;
/* renamed from: ce0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39257ce0 implements MembersInjector<C38664be0> {

    /* renamed from: a */
    public final Y94<InterfaceC41053fe0> f61009a;

    /* renamed from: b */
    public static void m61104b(C38664be0 c38664be0, InterfaceC41053fe0 interfaceC41053fe0) {
        c38664be0.f57796b = interfaceC41053fe0;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C38664be0 c38664be0) {
        m61104b(c38664be0, this.f61009a.get());
    }
}
