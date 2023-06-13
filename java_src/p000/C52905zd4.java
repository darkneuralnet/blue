package p000;
/* renamed from: zd4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C52905zd4 implements InterfaceC48812sj1<C52312yd4> {

    /* renamed from: a */
    public final Y94<C38883c00> f121663a;

    public C52905zd4(Y94<C38883c00> y94) {
        this.f121663a = y94;
    }

    /* renamed from: a */
    public static C52905zd4 m957a(Y94<C38883c00> y94) {
        return new C52905zd4(y94);
    }

    /* renamed from: c */
    public static C52312yd4 m955c(C38883c00 c38883c00) {
        return new C52312yd4(c38883c00);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C52312yd4 get() {
        return m955c(this.f121663a.get());
    }
}
