package p000;
/* renamed from: H53 */
/* loaded from: classes4.dex */
public final class H53 implements InterfaceC48812sj1<AD0> {

    /* renamed from: a */
    public final P43 f12823a;

    /* renamed from: b */
    public final Y94<MN4> f12824b;

    public H53(P43 p43, Y94<MN4> y94) {
        this.f12823a = p43;
        this.f12824b = y94;
    }

    /* renamed from: a */
    public static H53 m104427a(P43 p43, Y94<MN4> y94) {
        return new H53(p43, y94);
    }

    /* renamed from: c */
    public static AD0 m104425c(P43 p43, MN4 mn4) {
        return (AD0) C51679xZ3.m5002e(p43.m90975S(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public AD0 get() {
        return m104425c(this.f12823a, this.f12824b.get());
    }
}
