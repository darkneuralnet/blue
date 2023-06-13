package p000;

import com.stripe.android.Stripe;
/* renamed from: sJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48570sJ2 implements InterfaceC48812sj1<InterfaceC47178px5> {

    /* renamed from: a */
    public final VH2 f108576a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f108577b;

    /* renamed from: c */
    public final Y94<LL3> f108578c;

    /* renamed from: d */
    public final Y94<Stripe> f108579d;

    /* renamed from: e */
    public final Y94<AM3> f108580e;

    /* renamed from: f */
    public final Y94<InterfaceC44647lh6> f108581f;

    /* renamed from: g */
    public final Y94<C36207Tq4> f108582g;

    /* renamed from: h */
    public final Y94<InterfaceC1880Ea> f108583h;

    /* renamed from: i */
    public final Y94<C22454gl> f108584i;

    /* renamed from: j */
    public final Y94<InterfaceC20357fL> f108585j;

    public C48570sJ2(VH2 vh2, Y94<InterfaceC35660Rh6> y94, Y94<LL3> y942, Y94<Stripe> y943, Y94<AM3> y944, Y94<InterfaceC44647lh6> y945, Y94<C36207Tq4> y946, Y94<InterfaceC1880Ea> y947, Y94<C22454gl> y948, Y94<InterfaceC20357fL> y949) {
        this.f108576a = vh2;
        this.f108577b = y94;
        this.f108578c = y942;
        this.f108579d = y943;
        this.f108580e = y944;
        this.f108581f = y945;
        this.f108582g = y946;
        this.f108583h = y947;
        this.f108584i = y948;
        this.f108585j = y949;
    }

    /* renamed from: a */
    public static C48570sJ2 m14448a(VH2 vh2, Y94<InterfaceC35660Rh6> y94, Y94<LL3> y942, Y94<Stripe> y943, Y94<AM3> y944, Y94<InterfaceC44647lh6> y945, Y94<C36207Tq4> y946, Y94<InterfaceC1880Ea> y947, Y94<C22454gl> y948, Y94<InterfaceC20357fL> y949) {
        return new C48570sJ2(vh2, y94, y942, y943, y944, y945, y946, y947, y948, y949);
    }

    /* renamed from: c */
    public static InterfaceC47178px5 m14446c(VH2 vh2, InterfaceC35660Rh6 interfaceC35660Rh6, LL3 ll3, Stripe stripe, AM3 am3, InterfaceC44647lh6 interfaceC44647lh6, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, C22454gl c22454gl, InterfaceC20357fL interfaceC20357fL) {
        return (InterfaceC47178px5) C51679xZ3.m5002e(vh2.m80024y0(interfaceC35660Rh6, ll3, stripe, am3, interfaceC44647lh6, c36207Tq4, interfaceC1880Ea, c22454gl, interfaceC20357fL));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47178px5 get() {
        return m14446c(this.f108576a, this.f108577b.get(), this.f108578c.get(), this.f108579d.get(), this.f108580e.get(), this.f108581f.get(), this.f108582g.get(), this.f108583h.get(), this.f108584i.get(), this.f108585j.get());
    }
}
