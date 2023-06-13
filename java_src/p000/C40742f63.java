package p000;
/* renamed from: f63  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40742f63 implements InterfaceC48812sj1<InterfaceC33676Iv2> {

    /* renamed from: a */
    public final P43 f79440a;

    /* renamed from: b */
    public final Y94<MN4> f79441b;

    public C40742f63(P43 p43, Y94<MN4> y94) {
        this.f79440a = p43;
        this.f79441b = y94;
    }

    /* renamed from: a */
    public static C40742f63 m42090a(P43 p43, Y94<MN4> y94) {
        return new C40742f63(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC33676Iv2 m42088c(P43 p43, MN4 mn4) {
        return (InterfaceC33676Iv2) C51679xZ3.m5002e(p43.m90904s0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC33676Iv2 get() {
        return m42088c(this.f79440a, this.f79441b.get());
    }
}
