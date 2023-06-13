package p000;

import dagger.MembersInjector;
/* renamed from: CQ5 */
/* loaded from: classes4.dex */
public final class CQ5 implements MembersInjector<C45672nQ5> {

    /* renamed from: a */
    public final Y94<InterfaceC46265oQ5> f4077a;

    /* renamed from: b */
    public final Y94<InterfaceC51600xQ5> f4078b;

    /* renamed from: b */
    public static void m112235b(C45672nQ5 c45672nQ5, InterfaceC46265oQ5 interfaceC46265oQ5) {
        c45672nQ5.f99922c = interfaceC46265oQ5;
    }

    /* renamed from: c */
    public static void m112234c(C45672nQ5 c45672nQ5, InterfaceC51600xQ5 interfaceC51600xQ5) {
        c45672nQ5.m23794B9(interfaceC51600xQ5);
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C45672nQ5 c45672nQ5) {
        m112235b(c45672nQ5, this.f4077a.get());
        m112234c(c45672nQ5, this.f4078b.get());
    }
}
