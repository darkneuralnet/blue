package p000;
/* renamed from: l53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44290l53 implements InterfaceC48812sj1<InterfaceC7378SL> {

    /* renamed from: a */
    public final P43 f95462a;

    /* renamed from: b */
    public final Y94<MN4> f95463b;

    public C44290l53(P43 p43, Y94<MN4> y94) {
        this.f95462a = p43;
        this.f95463b = y94;
    }

    /* renamed from: a */
    public static C44290l53 m27884a(P43 p43, Y94<MN4> y94) {
        return new C44290l53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC7378SL m27882c(P43 p43, MN4 mn4) {
        return (InterfaceC7378SL) C51679xZ3.m5002e(p43.m90893w(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC7378SL get() {
        return m27882c(this.f95462a, this.f95463b.get());
    }
}
