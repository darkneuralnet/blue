package p000;
/* renamed from: j63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43114j63 implements InterfaceC48812sj1<InterfaceC47838r43> {

    /* renamed from: a */
    public final P43 f92151a;

    /* renamed from: b */
    public final Y94<MN4> f92152b;

    public C43114j63(P43 p43, Y94<MN4> y94) {
        this.f92151a = p43;
        this.f92152b = y94;
    }

    /* renamed from: a */
    public static C43114j63 m31120a(P43 p43, Y94<MN4> y94) {
        return new C43114j63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC47838r43 m31118c(P43 p43, MN4 mn4) {
        return (InterfaceC47838r43) C51679xZ3.m5002e(p43.m90892w0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47838r43 get() {
        return m31118c(this.f92151a, this.f92152b.get());
    }
}
