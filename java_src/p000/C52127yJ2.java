package p000;
/* renamed from: yJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C52127yJ2 implements InterfaceC48812sj1<HZ5> {

    /* renamed from: a */
    public final VH2 f119339a;

    /* renamed from: b */
    public final Y94<GZ5> f119340b;

    public C52127yJ2(VH2 vh2, Y94<GZ5> y94) {
        this.f119339a = vh2;
        this.f119340b = y94;
    }

    /* renamed from: a */
    public static C52127yJ2 m3678a(VH2 vh2, Y94<GZ5> y94) {
        return new C52127yJ2(vh2, y94);
    }

    /* renamed from: c */
    public static HZ5 m3676c(VH2 vh2, GZ5 gz5) {
        return (HZ5) C51679xZ3.m5002e(vh2.m80111E0(gz5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public HZ5 get() {
        return m3676c(this.f119339a, this.f119340b.get());
    }
}
