package p000;

import dagger.MembersInjector;
/* renamed from: LF4 */
/* loaded from: classes3.dex */
public final class LF4 implements MembersInjector<KF4> {

    /* renamed from: a */
    public final Y94<QF4> f20971a;

    /* renamed from: b */
    public static void m97504b(KF4 kf4, QF4 qf4) {
        kf4.f19313b = qf4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(KF4 kf4) {
        m97504b(kf4, this.f20971a.get());
    }
}
