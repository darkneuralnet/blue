package p000;
/* renamed from: q53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47255q53 implements InterfaceC48812sj1<InterfaceC22675hX> {

    /* renamed from: a */
    public final P43 f104647a;

    /* renamed from: b */
    public final Y94<MN4> f104648b;

    public C47255q53(P43 p43, Y94<MN4> y94) {
        this.f104647a = p43;
        this.f104648b = y94;
    }

    /* renamed from: a */
    public static C47255q53 m18216a(P43 p43, Y94<MN4> y94) {
        return new C47255q53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC22675hX m18214c(P43 p43, MN4 mn4) {
        return (InterfaceC22675hX) C51679xZ3.m5002e(p43.m91017B(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC22675hX get() {
        return m18214c(this.f104647a, this.f104648b.get());
    }
}
