package p000;

import dagger.MembersInjector;
/* renamed from: fM1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40888fM1 implements MembersInjector<C40295eM1> {

    /* renamed from: a */
    public final Y94<C50374vM1> f79913a;

    /* renamed from: b */
    public static void m41534b(C40295eM1 c40295eM1, C50374vM1 c50374vM1) {
        c40295eM1.f78256e = c50374vM1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C40295eM1 c40295eM1) {
        m41534b(c40295eM1, this.f79913a.get());
    }
}
