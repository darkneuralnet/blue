package p000;
/* renamed from: Bk6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31943Bk6 implements InterfaceC48812sj1<C31709Ak6> {

    /* renamed from: a */
    public final Y94<C22454gl> f2813a;

    /* renamed from: b */
    public final Y94<InterfaceC10636aM> f2814b;

    public C31943Bk6(Y94<C22454gl> y94, Y94<InterfaceC10636aM> y942) {
        this.f2813a = y94;
        this.f2814b = y942;
    }

    /* renamed from: a */
    public static C31943Bk6 m113531a(Y94<C22454gl> y94, Y94<InterfaceC10636aM> y942) {
        return new C31943Bk6(y94, y942);
    }

    /* renamed from: c */
    public static C31709Ak6 m113529c(C22454gl c22454gl, InterfaceC10636aM interfaceC10636aM) {
        return new C31709Ak6(c22454gl, interfaceC10636aM);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C31709Ak6 get() {
        return m113529c(this.f2813a.get(), this.f2814b.get());
    }
}
