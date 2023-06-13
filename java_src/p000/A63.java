package p000;
/* renamed from: A63 */
/* loaded from: classes4.dex */
public final class A63 implements InterfaceC48812sj1<InterfaceC46663p54> {

    /* renamed from: a */
    public final P43 f146a;

    /* renamed from: b */
    public final Y94<MN4> f147b;

    public A63(P43 p43, Y94<MN4> y94) {
        this.f146a = p43;
        this.f147b = y94;
    }

    /* renamed from: a */
    public static A63 m116097a(P43 p43, Y94<MN4> y94) {
        return new A63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC46663p54 m116095c(P43 p43, MN4 mn4) {
        return (InterfaceC46663p54) C51679xZ3.m5002e(p43.m90982O0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46663p54 get() {
        return m116095c(this.f146a, this.f147b.get());
    }
}
