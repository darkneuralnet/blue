package p000;
/* renamed from: Pf6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35174Pf6 implements InterfaceC48812sj1<C34940Of6> {

    /* renamed from: a */
    public final Y94<InterfaceC40099e13> f28869a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f28870b;

    public C35174Pf6(Y94<InterfaceC40099e13> y94, Y94<C36207Tq4> y942) {
        this.f28869a = y94;
        this.f28870b = y942;
    }

    /* renamed from: a */
    public static C35174Pf6 m89966a(Y94<InterfaceC40099e13> y94, Y94<C36207Tq4> y942) {
        return new C35174Pf6(y94, y942);
    }

    /* renamed from: c */
    public static C34940Of6 m89964c(InterfaceC40099e13 interfaceC40099e13, C36207Tq4 c36207Tq4) {
        return new C34940Of6(interfaceC40099e13, c36207Tq4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C34940Of6 get() {
        return m89964c(this.f28869a.get(), this.f28870b.get());
    }
}
