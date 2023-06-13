package p000;
/* renamed from: pI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46783pI2 implements InterfaceC48812sj1<InterfaceC44257l20> {

    /* renamed from: a */
    public final VH2 f103439a;

    /* renamed from: b */
    public final Y94<P10> f103440b;

    public C46783pI2(VH2 vh2, Y94<P10> y94) {
        this.f103439a = vh2;
        this.f103440b = y94;
    }

    /* renamed from: a */
    public static C46783pI2 m19563a(VH2 vh2, Y94<P10> y94) {
        return new C46783pI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC44257l20 m19561c(VH2 vh2, P10 p10) {
        return (InterfaceC44257l20) C51679xZ3.m5002e(vh2.m80035t(p10));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44257l20 get() {
        return m19561c(this.f103439a, this.f103440b.get());
    }
}
