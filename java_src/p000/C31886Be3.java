package p000;
/* renamed from: Be3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31886Be3 implements InterfaceC48812sj1<InterfaceC46986pe3> {

    /* renamed from: a */
    public final Y94<MN4> f2627a;

    public C31886Be3(Y94<MN4> y94) {
        this.f2627a = y94;
    }

    /* renamed from: a */
    public static C31886Be3 m113742a(Y94<MN4> y94) {
        return new C31886Be3(y94);
    }

    /* renamed from: c */
    public static InterfaceC46986pe3 m113740c(MN4 mn4) {
        return (InterfaceC46986pe3) C51679xZ3.m5002e(AbstractC31652Ae3.m115418a(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC46986pe3 get() {
        return m113740c(this.f2627a.get());
    }
}
