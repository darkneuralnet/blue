package p000;
/* renamed from: in0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42922in0 implements InterfaceC48812sj1<InterfaceC40550en0> {

    /* renamed from: a */
    public final C42329hn0 f87863a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f87864b;

    /* renamed from: c */
    public final Y94<InterfaceC33193Gt5> f87865c;

    /* renamed from: d */
    public final Y94<InterfaceC6097Oh> f87866d;

    public C42922in0(C42329hn0 c42329hn0, Y94<InterfaceC1880Ea> y94, Y94<InterfaceC33193Gt5> y942, Y94<InterfaceC6097Oh> y943) {
        this.f87863a = c42329hn0;
        this.f87864b = y94;
        this.f87865c = y942;
        this.f87866d = y943;
    }

    /* renamed from: a */
    public static InterfaceC40550en0 m33498a(C42329hn0 c42329hn0, InterfaceC1880Ea interfaceC1880Ea, InterfaceC33193Gt5 interfaceC33193Gt5, InterfaceC6097Oh interfaceC6097Oh) {
        return (InterfaceC40550en0) C51679xZ3.m5002e(c42329hn0.m35873a(interfaceC1880Ea, interfaceC33193Gt5, interfaceC6097Oh));
    }

    /* renamed from: b */
    public static C42922in0 m33497b(C42329hn0 c42329hn0, Y94<InterfaceC1880Ea> y94, Y94<InterfaceC33193Gt5> y942, Y94<InterfaceC6097Oh> y943) {
        return new C42922in0(c42329hn0, y94, y942, y943);
    }

    @Override // p000.Y94
    /* renamed from: c */
    public InterfaceC40550en0 get() {
        return m33498a(this.f87863a, this.f87864b.get(), this.f87865c.get(), this.f87866d.get());
    }
}
