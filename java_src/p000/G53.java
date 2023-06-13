package p000;
/* renamed from: G53 */
/* loaded from: classes4.dex */
public final class G53 implements InterfaceC48812sj1<OB0> {

    /* renamed from: a */
    public final P43 f10896a;

    /* renamed from: b */
    public final Y94<MN4> f10897b;

    public G53(P43 p43, Y94<MN4> y94) {
        this.f10896a = p43;
        this.f10897b = y94;
    }

    /* renamed from: a */
    public static G53 m105824a(P43 p43, Y94<MN4> y94) {
        return new G53(p43, y94);
    }

    /* renamed from: c */
    public static OB0 m105822c(P43 p43, MN4 mn4) {
        return (OB0) C51679xZ3.m5002e(p43.m90977R(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public OB0 get() {
        return m105822c(this.f10896a, this.f10897b.get());
    }
}
