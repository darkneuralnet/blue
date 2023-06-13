package p000;

import dagger.MembersInjector;
/* renamed from: Y86 */
/* loaded from: classes4.dex */
public final class Y86 implements MembersInjector<X86> {

    /* renamed from: a */
    public final Y94<C40775f96> f44700a;

    /* renamed from: b */
    public static void m75542b(X86 x86, C40775f96 c40775f96) {
        x86.f42726e = c40775f96;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(X86 x86) {
        m75542b(x86, this.f44700a.get());
    }
}
