package p000;
/* renamed from: dI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C39668dI2 implements InterfaceC48812sj1<InterfaceC9184Wo> {

    /* renamed from: a */
    public final VH2 f76407a;

    /* renamed from: b */
    public final Y94<InterfaceC8797Vo> f76408b;

    public C39668dI2(VH2 vh2, Y94<InterfaceC8797Vo> y94) {
        this.f76407a = vh2;
        this.f76408b = y94;
    }

    /* renamed from: a */
    public static C39668dI2 m44411a(VH2 vh2, Y94<InterfaceC8797Vo> y94) {
        return new C39668dI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC9184Wo m44409c(VH2 vh2, InterfaceC8797Vo interfaceC8797Vo) {
        return (InterfaceC9184Wo) C51679xZ3.m5002e(vh2.m80059h(interfaceC8797Vo));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC9184Wo get() {
        return m44409c(this.f76407a, this.f76408b.get());
    }
}
