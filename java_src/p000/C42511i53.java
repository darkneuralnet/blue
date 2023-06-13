package p000;
/* renamed from: i53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42511i53 implements InterfaceC48812sj1<InterfaceC8580VE> {

    /* renamed from: a */
    public final P43 f86720a;

    /* renamed from: b */
    public final Y94<MN4> f86721b;

    public C42511i53(P43 p43, Y94<MN4> y94) {
        this.f86720a = p43;
        this.f86721b = y94;
    }

    /* renamed from: a */
    public static C42511i53 m34483a(P43 p43, Y94<MN4> y94) {
        return new C42511i53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC8580VE m34481c(P43 p43, MN4 mn4) {
        return (InterfaceC8580VE) C51679xZ3.m5002e(p43.m90902t(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC8580VE get() {
        return m34481c(this.f86720a, this.f86721b.get());
    }
}
