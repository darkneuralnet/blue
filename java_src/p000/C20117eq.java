package p000;
/* renamed from: eq */
/* loaded from: classes2.dex */
public final class C20117eq implements InterfaceC48812sj1<InterfaceC5093Lp> {

    /* renamed from: a */
    public final C19865dq f78971a;

    /* renamed from: b */
    public final Y94<C22454gl> f78972b;

    /* renamed from: c */
    public final Y94<MN4> f78973c;

    public C20117eq(C19865dq c19865dq, Y94<C22454gl> y94, Y94<MN4> y942) {
        this.f78971a = c19865dq;
        this.f78972b = y94;
        this.f78973c = y942;
    }

    /* renamed from: a */
    public static C20117eq m42505a(C19865dq c19865dq, Y94<C22454gl> y94, Y94<MN4> y942) {
        return new C20117eq(c19865dq, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC5093Lp m42503c(C19865dq c19865dq, C22454gl c22454gl, MN4 mn4) {
        return (InterfaceC5093Lp) C51679xZ3.m5002e(c19865dq.m43673a(c22454gl, mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC5093Lp get() {
        return m42503c(this.f78971a, this.f78972b.get(), this.f78973c.get());
    }
}
