package p000;

import dagger.MembersInjector;
/* renamed from: f93  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40772f93 implements MembersInjector<C40179e93> {

    /* renamed from: a */
    public final Y94<C48480s93> f79543a;

    /* renamed from: b */
    public static void m41946b(C40179e93 c40179e93, C48480s93 c48480s93) {
        c40179e93.f78026b = c48480s93;
    }

    @Override // dagger.MembersInjector
    /* renamed from: a */
    public void injectMembers(C40179e93 c40179e93) {
        m41946b(c40179e93, this.f79543a.get());
    }
}
