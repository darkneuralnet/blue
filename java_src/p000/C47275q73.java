package p000;
/* renamed from: q73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47275q73 implements InterfaceC48812sj1<InterfaceC41405gD6> {

    /* renamed from: a */
    public final P43 f104749a;

    /* renamed from: b */
    public final Y94<MN4> f104750b;

    public C47275q73(P43 p43, Y94<MN4> y94) {
        this.f104749a = p43;
        this.f104750b = y94;
    }

    /* renamed from: a */
    public static C47275q73 m18109a(P43 p43, Y94<MN4> y94) {
        return new C47275q73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC41405gD6 m18107c(P43 p43, MN4 mn4) {
        return (InterfaceC41405gD6) C51679xZ3.m5002e(p43.m91003F1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC41405gD6 get() {
        return m18107c(this.f104749a, this.f104750b.get());
    }
}
