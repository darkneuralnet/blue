package p000;
/* renamed from: o53  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46069o53 implements InterfaceC48812sj1<InterfaceC27906rP> {

    /* renamed from: a */
    public final P43 f101344a;

    /* renamed from: b */
    public final Y94<MN4> f101345b;

    public C46069o53(P43 p43, Y94<MN4> y94) {
        this.f101344a = p43;
        this.f101345b = y94;
    }

    /* renamed from: a */
    public static C46069o53 m21813a(P43 p43, Y94<MN4> y94) {
        return new C46069o53(p43, y94);
    }

    /* renamed from: c */
    public static InterfaceC27906rP m21811c(P43 p43, MN4 mn4) {
        return (InterfaceC27906rP) C51679xZ3.m5002e(p43.m90884z(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC27906rP get() {
        return m21811c(this.f101344a, this.f101345b.get());
    }
}
