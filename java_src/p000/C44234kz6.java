package p000;

import dagger.MembersInjector;
/* renamed from: kz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44234kz6 implements MembersInjector<C43641jz6> {

    /* renamed from: a */
    public final Y94<InterfaceC44827lz6> f95331a;

    /* renamed from: b */
    public static void m28040b(C43641jz6 c43641jz6, InterfaceC44827lz6 interfaceC44827lz6) {
        c43641jz6.f93710b = interfaceC44827lz6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C43641jz6 c43641jz6) {
        m28040b(c43641jz6, this.f95331a.get());
    }
}
