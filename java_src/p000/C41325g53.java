package p000;
/* renamed from: g53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41325g53 implements InterfaceC48812sj1<InterfaceC10389Zo> {

    /* renamed from: a */
    public final P43 f81548a;

    /* renamed from: b */
    public final Y94<MN4> f81549b;

    public C41325g53(P43 p43, Y94<MN4> y94) {
        this.f81548a = p43;
        this.f81549b = y94;
    }

    /* renamed from: a */
    public static C41325g53 m40134a(P43 p43, Y94<MN4> y94) {
        return new C41325g53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC10389Zo m40132c(P43 p43, MN4 mn4) {
        return (InterfaceC10389Zo) C51679xZ3.m5002e(p43.m90908r(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC10389Zo get() {
        return m40132c(this.f81548a, this.f81549b.get());
    }
}
