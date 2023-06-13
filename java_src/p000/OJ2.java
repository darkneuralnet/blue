package p000;
/* renamed from: OJ2 */
/* loaded from: classes4.dex */
public final class OJ2 implements InterfaceC48812sj1<InterfaceC46194oI6> {

    /* renamed from: a */
    public final VH2 f26379a;

    /* renamed from: b */
    public final Y94<InterfaceC45008mI6> f26380b;

    public OJ2(VH2 vh2, Y94<InterfaceC45008mI6> y94) {
        this.f26379a = vh2;
        this.f26380b = y94;
    }

    /* renamed from: a */
    public static OJ2 m92419a(VH2 vh2, Y94<InterfaceC45008mI6> y94) {
        return new OJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC46194oI6 m92417c(VH2 vh2, InterfaceC45008mI6 interfaceC45008mI6) {
        return (InterfaceC46194oI6) C51679xZ3.m5002e(vh2.m80079U0(interfaceC45008mI6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46194oI6 get() {
        return m92417c(this.f26379a, this.f26380b.get());
    }
}
