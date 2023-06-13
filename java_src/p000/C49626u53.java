package p000;
/* renamed from: u53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49626u53 implements InterfaceC48812sj1<InterfaceC43061j10> {

    /* renamed from: a */
    public final P43 f111713a;

    /* renamed from: b */
    public final Y94<MN4> f111714b;

    public C49626u53(P43 p43, Y94<MN4> y94) {
        this.f111713a = p43;
        this.f111714b = y94;
    }

    /* renamed from: a */
    public static C49626u53 m10881a(P43 p43, Y94<MN4> y94) {
        return new C49626u53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC43061j10 m10879c(P43 p43, MN4 mn4) {
        return (InterfaceC43061j10) C51679xZ3.m5002e(p43.m91005F(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC43061j10 get() {
        return m10879c(this.f111713a, this.f111714b.get());
    }
}
