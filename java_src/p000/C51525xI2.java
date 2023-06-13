package p000;
/* renamed from: xI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C51525xI2 implements InterfaceC48812sj1<JT0> {

    /* renamed from: a */
    public final VH2 f117349a;

    /* renamed from: b */
    public final Y94<IT0> f117350b;

    /* renamed from: c */
    public final Y94<C22454gl> f117351c;

    /* renamed from: d */
    public final Y94<InterfaceC35660Rh6> f117352d;

    public C51525xI2(VH2 vh2, Y94<IT0> y94, Y94<C22454gl> y942, Y94<InterfaceC35660Rh6> y943) {
        this.f117349a = vh2;
        this.f117350b = y94;
        this.f117351c = y942;
        this.f117352d = y943;
    }

    /* renamed from: a */
    public static C51525xI2 m5569a(VH2 vh2, Y94<IT0> y94, Y94<C22454gl> y942, Y94<InterfaceC35660Rh6> y943) {
        return new C51525xI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static JT0 m5567c(VH2 vh2, IT0 it0, C22454gl c22454gl, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (JT0) C51679xZ3.m5002e(vh2.m80116C(it0, c22454gl, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public JT0 get() {
        return m5567c(this.f117349a, this.f117350b.get(), this.f117351c.get(), this.f117352d.get());
    }
}
