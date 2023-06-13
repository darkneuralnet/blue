package p000;
/* renamed from: Y53 */
/* loaded from: classes4.dex */
public final class Y53 implements InterfaceC48812sj1<I32> {

    /* renamed from: a */
    public final P43 f44509a;

    /* renamed from: b */
    public final Y94<MN4> f44510b;

    public Y53(P43 p43, Y94<MN4> y94) {
        this.f44509a = p43;
        this.f44510b = y94;
    }

    /* renamed from: a */
    public static Y53 m75755a(P43 p43, Y94<MN4> y94) {
        return new Y53(p43, y94);
    }

    /* renamed from: c */
    public static I32 m75753c(P43 p43, MN4 mn4) {
        return (I32) C51679xZ3.m5002e(p43.m90925l0(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public I32 get() {
        return m75753c(this.f44509a, this.f44510b.get());
    }
}
