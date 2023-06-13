package p000;

import dagger.MembersInjector;
/* renamed from: SH2 */
/* loaded from: classes3.dex */
public final class SH2 implements MembersInjector<C50923wH2> {

    /* renamed from: a */
    public final Y94<IH2> f33418a;

    /* renamed from: b */
    public static void m85781b(C50923wH2 c50923wH2, IH2 ih2) {
        c50923wH2.f115756b = ih2;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C50923wH2 c50923wH2) {
        m85781b(c50923wH2, this.f33418a.get());
    }
}
