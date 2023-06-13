package p000;
/* renamed from: aY2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38015aY2 implements InterfaceC48812sj1<ZX2> {

    /* renamed from: a */
    public final Y94<InterfaceC47256q54> f50631a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f50632b;

    public C38015aY2(Y94<InterfaceC47256q54> y94, Y94<C36207Tq4> y942) {
        this.f50631a = y94;
        this.f50632b = y942;
    }

    /* renamed from: a */
    public static C38015aY2 m71238a(Y94<InterfaceC47256q54> y94, Y94<C36207Tq4> y942) {
        return new C38015aY2(y94, y942);
    }

    /* renamed from: c */
    public static ZX2 m71236c(InterfaceC47256q54 interfaceC47256q54, C36207Tq4 c36207Tq4) {
        return new ZX2(interfaceC47256q54, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public ZX2 get() {
        return m71236c(this.f50631a.get(), this.f50632b.get());
    }
}
