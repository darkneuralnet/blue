package p000;

import dagger.MembersInjector;
/* renamed from: Y23 */
/* loaded from: classes2.dex */
public final class Y23 implements MembersInjector<X23> {

    /* renamed from: a */
    public final Y94<C42491i33> f44471a;

    /* renamed from: b */
    public static void m75802b(X23 x23, C42491i33 c42491i33) {
        x23.f42553b = c42491i33;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(X23 x23) {
        m75802b(x23, this.f44471a.get());
    }
}
