package p000;
/* renamed from: V53 */
/* loaded from: classes4.dex */
public final class V53 implements InterfaceC48812sj1<InterfaceC39766dT1> {

    /* renamed from: a */
    public final P43 f38590a;

    /* renamed from: b */
    public final Y94<MN4> f38591b;

    public V53(P43 p43, Y94<MN4> y94) {
        this.f38590a = p43;
        this.f38591b = y94;
    }

    /* renamed from: a */
    public static V53 m80426a(P43 p43, Y94<MN4> y94) {
        return new V53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC39766dT1 m80424c(P43 p43, MN4 mn4) {
        return (InterfaceC39766dT1) C51679xZ3.m5002e(p43.m90934i0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC39766dT1 get() {
        return m80424c(this.f38590a, this.f38591b.get());
    }
}
