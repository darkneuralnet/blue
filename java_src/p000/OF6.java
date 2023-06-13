package p000;

import dagger.MembersInjector;
/* renamed from: OF6 */
/* loaded from: classes3.dex */
public final class OF6 implements MembersInjector<NF6> {

    /* renamed from: a */
    public final Y94<QF6> f26270a;

    /* renamed from: b */
    public static void m92585b(NF6 nf6, QF6 qf6) {
        nf6.f24353b = qf6;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(NF6 nf6) {
        m92585b(nf6, this.f26270a.get());
    }
}
