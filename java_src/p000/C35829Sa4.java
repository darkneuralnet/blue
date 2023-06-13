package p000;

import dagger.MembersInjector;
/* renamed from: Sa4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35829Sa4 implements MembersInjector<C35595Ra4> {

    /* renamed from: a */
    public final Y94<InterfaceC36999Xa4> f33934a;

    /* renamed from: b */
    public static void m85218b(C35595Ra4 c35595Ra4, InterfaceC36999Xa4 interfaceC36999Xa4) {
        c35595Ra4.f32244b = interfaceC36999Xa4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C35595Ra4 c35595Ra4) {
        m85218b(c35595Ra4, this.f33934a.get());
    }
}
