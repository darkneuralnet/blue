package p000;
/* renamed from: Xz1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C37221Xz1 implements InterfaceC48812sj1<C36519Uz1> {

    /* renamed from: a */
    public final Y94<InterfaceC35349Pz1> f44362a;

    /* renamed from: b */
    public final Y94<InterfaceC35660Rh6> f44363b;

    /* renamed from: c */
    public final Y94<C36207Tq4> f44364c;

    public C37221Xz1(Y94<InterfaceC35349Pz1> y94, Y94<InterfaceC35660Rh6> y942, Y94<C36207Tq4> y943) {
        this.f44362a = y94;
        this.f44363b = y942;
        this.f44364c = y943;
    }

    /* renamed from: a */
    public static C37221Xz1 m75929a(Y94<InterfaceC35349Pz1> y94, Y94<InterfaceC35660Rh6> y942, Y94<C36207Tq4> y943) {
        return new C37221Xz1(y94, y942, y943);
    }

    /* renamed from: c */
    public static C36519Uz1 m75927c(InterfaceC35349Pz1 interfaceC35349Pz1, InterfaceC35660Rh6 interfaceC35660Rh6, C36207Tq4 c36207Tq4) {
        return new C36519Uz1(interfaceC35349Pz1, interfaceC35660Rh6, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C36519Uz1 get() {
        return m75927c(this.f44362a.get(), this.f44363b.get(), this.f44364c.get());
    }
}
