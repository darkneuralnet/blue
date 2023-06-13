package p000;

import dagger.MembersInjector;
/* renamed from: Cr1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32235Cr1 implements MembersInjector<C53042zr1> {

    /* renamed from: a */
    public final Y94<C33171Gr1> f4809a;

    /* renamed from: b */
    public final Y94<C31767Ar1> f4810b;

    /* renamed from: a */
    public static void m111411a(C53042zr1 c53042zr1, C31767Ar1 c31767Ar1) {
        c53042zr1.f122380c = c31767Ar1;
    }

    /* renamed from: c */
    public static void m111409c(C53042zr1 c53042zr1, C33171Gr1 c33171Gr1) {
        c53042zr1.f122379b = c33171Gr1;
    }

    @Override // dagger.MembersInjector
    /* renamed from: b */
    public void injectMembers(C53042zr1 c53042zr1) {
        m111409c(c53042zr1, this.f4809a.get());
        m111411a(c53042zr1, this.f4810b.get());
    }
}
