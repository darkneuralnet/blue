package p000;
/* renamed from: R63 */
/* loaded from: classes4.dex */
public final class R63 implements InterfaceC48812sj1<InterfaceC47232q30> {

    /* renamed from: a */
    public final P43 f31529a;

    /* renamed from: b */
    public final Y94<MN4> f31530b;

    public R63(P43 p43, Y94<MN4> y94) {
        this.f31529a = p43;
        this.f31530b = y94;
    }

    /* renamed from: a */
    public static R63 m87318a(P43 p43, Y94<MN4> y94) {
        return new R63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC47232q30 m87316c(P43 p43, MN4 mn4) {
        return (InterfaceC47232q30) C51679xZ3.m5002e(p43.m90942f1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47232q30 get() {
        return m87316c(this.f31529a, this.f31530b.get());
    }
}
