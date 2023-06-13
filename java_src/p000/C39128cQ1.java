package p000;

import dagger.MembersInjector;
/* renamed from: cQ1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39128cQ1 implements MembersInjector<C38535bQ1> {

    /* renamed from: a */
    public final Y94<InterfaceC39739dQ1> f60611a;

    /* renamed from: b */
    public static void m61420b(C38535bQ1 c38535bQ1, InterfaceC39739dQ1 interfaceC39739dQ1) {
        c38535bQ1.f57473b = interfaceC39739dQ1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C38535bQ1 c38535bQ1) {
        m61420b(c38535bQ1, this.f60611a.get());
    }
}
