package p000;
/* renamed from: d53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39547d53 implements InterfaceC48812sj1<InterfaceC41078fg5> {

    /* renamed from: a */
    public final P43 f76111a;

    /* renamed from: b */
    public final Y94<MN4> f76112b;

    public C39547d53(P43 p43, Y94<MN4> y94) {
        this.f76111a = p43;
        this.f76112b = y94;
    }

    /* renamed from: a */
    public static C39547d53 m44618a(P43 p43, Y94<MN4> y94) {
        return new C39547d53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC41078fg5 m44616c(P43 p43, MN4 mn4) {
        return (InterfaceC41078fg5) C51679xZ3.m5002e(p43.m90917o(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41078fg5 get() {
        return m44616c(this.f76111a, this.f76112b.get());
    }
}
