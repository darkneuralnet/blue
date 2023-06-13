package p000;
/* renamed from: qJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C47385qJ2 implements InterfaceC48812sj1<InterfaceC40565eo5> {

    /* renamed from: a */
    public final VH2 f105100a;

    /* renamed from: b */
    public final Y94<InterfaceC41741gn5> f105101b;

    public C47385qJ2(VH2 vh2, Y94<InterfaceC41741gn5> y94) {
        this.f105100a = vh2;
        this.f105101b = y94;
    }

    /* renamed from: a */
    public static C47385qJ2 m17633a(VH2 vh2, Y94<InterfaceC41741gn5> y94) {
        return new C47385qJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC40565eo5 m17631c(VH2 vh2, InterfaceC41741gn5 interfaceC41741gn5) {
        return (InterfaceC40565eo5) C51679xZ3.m5002e(vh2.m80028w0(interfaceC41741gn5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC40565eo5 get() {
        return m17631c(this.f105100a, this.f105101b.get());
    }
}
