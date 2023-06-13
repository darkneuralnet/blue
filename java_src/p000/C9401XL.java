package p000;
/* renamed from: XL */
/* loaded from: classes4.dex */
public final class C9401XL implements InterfaceC48812sj1<C8984WL> {

    /* renamed from: a */
    public final Y94<C36207Tq4> f42988a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f42989b;

    /* renamed from: c */
    public final Y94<YR4> f42990c;

    public C9401XL(Y94<C36207Tq4> y94, Y94<InterfaceC40001dr4> y942, Y94<YR4> y943) {
        this.f42988a = y94;
        this.f42989b = y942;
        this.f42990c = y943;
    }

    /* renamed from: a */
    public static C9401XL m77108a(Y94<C36207Tq4> y94, Y94<InterfaceC40001dr4> y942, Y94<YR4> y943) {
        return new C9401XL(y94, y942, y943);
    }

    /* renamed from: c */
    public static C8984WL m77106c(C36207Tq4 c36207Tq4, InterfaceC40001dr4 interfaceC40001dr4, YR4 yr4) {
        return new C8984WL(c36207Tq4, interfaceC40001dr4, yr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C8984WL get() {
        return m77106c(this.f42988a.get(), this.f42989b.get(), this.f42990c.get());
    }
}
