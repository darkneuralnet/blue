package p000;

import dagger.MembersInjector;
/* renamed from: zZ */
/* loaded from: classes2.dex */
public final class C31039zZ implements MembersInjector<C30619yZ> {

    /* renamed from: a */
    public final Y94<C1865EZ> f121523a;

    /* renamed from: b */
    public static void m1116b(C30619yZ c30619yZ, C1865EZ c1865ez) {
        c30619yZ.f119736b = c1865ez;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C30619yZ c30619yZ) {
        m1116b(c30619yZ, this.f121523a.get());
    }
}
