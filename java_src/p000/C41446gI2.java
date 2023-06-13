package p000;
/* renamed from: gI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41446gI2 implements InterfaceC48812sj1<InterfaceC10163ZF> {

    /* renamed from: a */
    public final VH2 f81937a;

    /* renamed from: b */
    public final Y94<InterfaceC9749YF> f81938b;

    /* renamed from: c */
    public final Y94<InterfaceC38127aj6> f81939c;

    public C41446gI2(VH2 vh2, Y94<InterfaceC9749YF> y94, Y94<InterfaceC38127aj6> y942) {
        this.f81937a = vh2;
        this.f81938b = y94;
        this.f81939c = y942;
    }

    /* renamed from: a */
    public static C41446gI2 m39686a(VH2 vh2, Y94<InterfaceC9749YF> y94, Y94<InterfaceC38127aj6> y942) {
        return new C41446gI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC10163ZF m39684c(VH2 vh2, InterfaceC9749YF interfaceC9749YF, InterfaceC38127aj6 interfaceC38127aj6) {
        return (InterfaceC10163ZF) C51679xZ3.m5002e(vh2.m80053k(interfaceC9749YF, interfaceC38127aj6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC10163ZF get() {
        return m39684c(this.f81937a, this.f81938b.get(), this.f81939c.get());
    }
}
