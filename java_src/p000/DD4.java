package p000;

import dagger.MembersInjector;
/* renamed from: DD4 */
/* loaded from: classes3.dex */
public final class DD4 implements MembersInjector<CD4> {

    /* renamed from: a */
    public final Y94<ID4> f5397a;

    /* renamed from: b */
    public static void m110668b(CD4 cd4, ID4 id4) {
        cd4.f3627b = id4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(CD4 cd4) {
        m110668b(cd4, this.f5397a.get());
    }
}
