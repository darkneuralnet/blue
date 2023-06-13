package p000;
/* renamed from: j73  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43124j73 implements InterfaceC48812sj1<InterfaceC44044kg6> {

    /* renamed from: a */
    public final P43 f92181a;

    /* renamed from: b */
    public final Y94<MN4> f92182b;

    public C43124j73(P43 p43, Y94<MN4> y94) {
        this.f92181a = p43;
        this.f92182b = y94;
    }

    /* renamed from: a */
    public static C43124j73 m31075a(P43 p43, Y94<MN4> y94) {
        return new C43124j73(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC44044kg6 m31073c(P43 p43, MN4 mn4) {
        return (InterfaceC44044kg6) C51679xZ3.m5002e(p43.m90885y1(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44044kg6 get() {
        return m31073c(this.f92181a, this.f92182b.get());
    }
}
