package p000;

import co.bird.android.core.mrp.BaseActivityLite;
import dagger.MembersInjector;
/* renamed from: Ky */
/* loaded from: classes2.dex */
public final class C4650Ky implements MembersInjector<BaseActivityLite> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f20456a;

    /* renamed from: b */
    public final Y94<C22454gl> f20457b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f20458c;

    /* renamed from: b */
    public static void m98043b(BaseActivityLite baseActivityLite, InterfaceC40099e13 interfaceC40099e13) {
        baseActivityLite.f63088d = interfaceC40099e13;
    }

    /* renamed from: c */
    public static void m98042c(BaseActivityLite baseActivityLite, C22454gl c22454gl) {
        baseActivityLite.f63089e = c22454gl;
    }

    /* renamed from: d */
    public static void m98041d(BaseActivityLite baseActivityLite, C36207Tq4 c36207Tq4) {
        baseActivityLite.f63090f = c36207Tq4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(BaseActivityLite baseActivityLite) {
        m98043b(baseActivityLite, this.f20456a.get());
        m98042c(baseActivityLite, this.f20457b.get());
        m98041d(baseActivityLite, this.f20458c.get());
    }
}
