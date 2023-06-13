package p000;

import dagger.MembersInjector;
/* renamed from: xI3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C51526xI3 implements MembersInjector<C50933wI3> {

    /* renamed from: a */
    public final Y94<BI3> f117353a;

    /* renamed from: b */
    public static void m5565b(C50933wI3 c50933wI3, BI3 bi3) {
        c50933wI3.f115771b = bi3;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C50933wI3 c50933wI3) {
        m5565b(c50933wI3, this.f117353a.get());
    }
}
