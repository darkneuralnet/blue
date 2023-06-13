package p000;

import dagger.MembersInjector;
/* renamed from: En5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32671En5 implements MembersInjector<C32437Dn5> {

    /* renamed from: a */
    public final Y94<InterfaceC32905Fn5> f8133a;

    /* renamed from: b */
    public static void m108359b(C32437Dn5 c32437Dn5, InterfaceC32905Fn5 interfaceC32905Fn5) {
        c32437Dn5.f6329b = interfaceC32905Fn5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C32437Dn5 c32437Dn5) {
        m108359b(c32437Dn5, this.f8133a.get());
    }
}
