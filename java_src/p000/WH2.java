package p000;
/* renamed from: WH2 */
/* loaded from: classes4.dex */
public final class WH2 implements InterfaceC48812sj1<InterfaceC20792gH> {

    /* renamed from: a */
    public final VH2 f40735a;

    /* renamed from: b */
    public final Y94<C7708TH> f40736b;

    public WH2(VH2 vh2, Y94<C7708TH> y94) {
        this.f40735a = vh2;
        this.f40736b = y94;
    }

    /* renamed from: a */
    public static InterfaceC20792gH m78624a(VH2 vh2, C7708TH c7708th) {
        return (InterfaceC20792gH) C51679xZ3.m5002e(vh2.m80073a(c7708th));
    }

    /* renamed from: b */
    public static WH2 m78623b(VH2 vh2, Y94<C7708TH> y94) {
        return new WH2(vh2, y94);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC20792gH get() {
        return m78624a(this.f40735a, this.f40736b.get());
    }
}
