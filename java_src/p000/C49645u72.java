package p000;

import dagger.MembersInjector;
/* renamed from: u72  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49645u72 implements MembersInjector<C49052t72> {

    /* renamed from: a */
    public final Y94<P72> f111765a;

    /* renamed from: b */
    public static void m10845b(C49052t72 c49052t72, P72 p72) {
        c49052t72.f109888b = p72;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C49052t72 c49052t72) {
        m10845b(c49052t72, this.f111765a.get());
    }
}
