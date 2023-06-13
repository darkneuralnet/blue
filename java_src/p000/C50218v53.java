package p000;
/* renamed from: v53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50218v53 implements InterfaceC48812sj1<InterfaceC40470ef0> {

    /* renamed from: a */
    public final P43 f113511a;

    /* renamed from: b */
    public final Y94<MN4> f113512b;

    public C50218v53(P43 p43, Y94<MN4> y94) {
        this.f113511a = p43;
        this.f113512b = y94;
    }

    /* renamed from: a */
    public static C50218v53 m9201a(P43 p43, Y94<MN4> y94) {
        return new C50218v53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC40470ef0 m9199c(P43 p43, MN4 mn4) {
        return (InterfaceC40470ef0) C51679xZ3.m5002e(p43.m91002G(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40470ef0 get() {
        return m9199c(this.f113511a, this.f113512b.get());
    }
}
