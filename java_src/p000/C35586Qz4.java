package p000;

import dagger.MembersInjector;
/* renamed from: Qz4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35586Qz4 implements MembersInjector<C35352Pz4> {

    /* renamed from: a */
    public final Y94<InterfaceC36054Sz4> f31379a;

    /* renamed from: b */
    public static void m87440b(C35352Pz4 c35352Pz4, InterfaceC36054Sz4 interfaceC36054Sz4) {
        c35352Pz4.f29605b = interfaceC36054Sz4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C35352Pz4 c35352Pz4) {
        m87440b(c35352Pz4, this.f31379a.get());
    }
}
