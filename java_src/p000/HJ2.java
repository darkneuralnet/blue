package p000;
/* renamed from: HJ2 */
/* loaded from: classes4.dex */
public final class HJ2 implements InterfaceC48812sj1<InterfaceC49430tl6> {

    /* renamed from: a */
    public final VH2 f13261a;

    /* renamed from: b */
    public final Y94<InterfaceC48837sl6> f13262b;

    public HJ2(VH2 vh2, Y94<InterfaceC48837sl6> y94) {
        this.f13261a = vh2;
        this.f13262b = y94;
    }

    /* renamed from: a */
    public static HJ2 m104038a(VH2 vh2, Y94<InterfaceC48837sl6> y94) {
        return new HJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC49430tl6 m104036c(VH2 vh2, InterfaceC48837sl6 interfaceC48837sl6) {
        return (InterfaceC49430tl6) C51679xZ3.m5002e(vh2.m80093N0(interfaceC48837sl6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49430tl6 get() {
        return m104036c(this.f13261a, this.f13262b.get());
    }
}
