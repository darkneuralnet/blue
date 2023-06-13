package p000;

import p000.MN4;
/* renamed from: N53 */
/* loaded from: classes4.dex */
public final class N53 implements InterfaceC48812sj1<MN4> {

    /* renamed from: a */
    public final P43 f24137a;

    /* renamed from: b */
    public final Y94<MN4.C5282b> f24138b;

    public N53(P43 p43, Y94<MN4.C5282b> y94) {
        this.f24137a = p43;
        this.f24138b = y94;
    }

    /* renamed from: a */
    public static N53 m94383a(P43 p43, Y94<MN4.C5282b> y94) {
        return new N53(p43, y94);
    }

    /* renamed from: c */
    public static MN4 m94381c(P43 p43, MN4.C5282b c5282b) {
        return (MN4) C51679xZ3.m5002e(p43.m90963Y(c5282b));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public MN4 get() {
        return m94381c(this.f24137a, this.f24138b.get());
    }
}
