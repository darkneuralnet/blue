package p000;

import dagger.MembersInjector;
/* renamed from: wn5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51227wn5 implements MembersInjector<C50634vn5> {

    /* renamed from: a */
    public final Y94<InterfaceC51820xn5> f116535a;

    /* renamed from: b */
    public static void m6319b(C50634vn5 c50634vn5, InterfaceC51820xn5 interfaceC51820xn5) {
        c50634vn5.f114665b = interfaceC51820xn5;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C50634vn5 c50634vn5) {
        m6319b(c50634vn5, this.f116535a.get());
    }
}
