package p000;
/* renamed from: uI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49747uI2 implements InterfaceC48812sj1<InterfaceC47153pv0> {

    /* renamed from: a */
    public final VH2 f112163a;

    /* renamed from: b */
    public final Y94<InterfaceC6097Oh> f112164b;

    /* renamed from: c */
    public final Y94<InterfaceC36119Tg6> f112165c;

    /* renamed from: d */
    public final Y94<C22454gl> f112166d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f112167e;

    /* renamed from: f */
    public final Y94<GI3> f112168f;

    /* renamed from: g */
    public final Y94<InterfaceC40001dr4> f112169g;

    public C49747uI2(VH2 vh2, Y94<InterfaceC6097Oh> y94, Y94<InterfaceC36119Tg6> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<GI3> y945, Y94<InterfaceC40001dr4> y946) {
        this.f112163a = vh2;
        this.f112164b = y94;
        this.f112165c = y942;
        this.f112166d = y943;
        this.f112167e = y944;
        this.f112168f = y945;
        this.f112169g = y946;
    }

    /* renamed from: a */
    public static C49747uI2 m10476a(VH2 vh2, Y94<InterfaceC6097Oh> y94, Y94<InterfaceC36119Tg6> y942, Y94<C22454gl> y943, Y94<C36207Tq4> y944, Y94<GI3> y945, Y94<InterfaceC40001dr4> y946) {
        return new C49747uI2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC47153pv0 m10474c(VH2 vh2, InterfaceC6097Oh interfaceC6097Oh, InterfaceC36119Tg6 interfaceC36119Tg6, C22454gl c22454gl, C36207Tq4 c36207Tq4, GI3 gi3, InterfaceC40001dr4 interfaceC40001dr4) {
        return (InterfaceC47153pv0) C51679xZ3.m5002e(vh2.m80025y(interfaceC6097Oh, interfaceC36119Tg6, c22454gl, c36207Tq4, gi3, interfaceC40001dr4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC47153pv0 get() {
        return m10474c(this.f112163a, this.f112164b.get(), this.f112165c.get(), this.f112166d.get(), this.f112167e.get(), this.f112168f.get(), this.f112169g.get());
    }
}
