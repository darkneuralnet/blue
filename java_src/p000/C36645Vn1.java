package p000;
/* renamed from: Vn1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36645Vn1 implements InterfaceC48812sj1<C36411Un1> {

    /* renamed from: a */
    public final Y94<C51816xn1> f39765a;

    public C36645Vn1(Y94<C51816xn1> y94) {
        this.f39765a = y94;
    }

    /* renamed from: a */
    public static C36645Vn1 m79421a(Y94<C51816xn1> y94) {
        return new C36645Vn1(y94);
    }

    /* renamed from: c */
    public static C36411Un1 m79419c(C51816xn1 c51816xn1) {
        return new C36411Un1(c51816xn1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36411Un1 get() {
        return m79419c(this.f39765a.get());
    }
}
