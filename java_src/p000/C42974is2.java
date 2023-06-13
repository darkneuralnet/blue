package p000;
/* renamed from: is2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42974is2 implements InterfaceC48812sj1<C42381hs2> {

    /* renamed from: a */
    public final Y94<InterfaceC48923su2> f91398a;

    public C42974is2(Y94<InterfaceC48923su2> y94) {
        this.f91398a = y94;
    }

    /* renamed from: a */
    public static C42974is2 m31744a(Y94<InterfaceC48923su2> y94) {
        return new C42974is2(y94);
    }

    /* renamed from: c */
    public static C42381hs2 m31742c(InterfaceC48923su2 interfaceC48923su2) {
        return new C42381hs2(interfaceC48923su2);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42381hs2 get() {
        return m31742c(this.f91398a.get());
    }
}
