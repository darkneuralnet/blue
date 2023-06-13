package p000;
/* renamed from: R53 */
/* loaded from: classes4.dex */
public final class R53 implements InterfaceC48812sj1<InterfaceC35349Pz1> {

    /* renamed from: a */
    public final P43 f31509a;

    /* renamed from: b */
    public final Y94<MN4> f31510b;

    public R53(P43 p43, Y94<MN4> y94) {
        this.f31509a = p43;
        this.f31510b = y94;
    }

    /* renamed from: a */
    public static R53 m87326a(P43 p43, Y94<MN4> y94) {
        return new R53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC35349Pz1 m87324c(P43 p43, MN4 mn4) {
        return (InterfaceC35349Pz1) C51679xZ3.m5002e(p43.m90949d0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC35349Pz1 get() {
        return m87324c(this.f31509a, this.f31510b.get());
    }
}
