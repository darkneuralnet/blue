package p000;
/* renamed from: sI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48561sI2 implements InterfaceC48812sj1<InterfaceC34088Kp0> {

    /* renamed from: a */
    public final VH2 f108541a;

    /* renamed from: b */
    public final Y94<InterfaceC33854Jp0> f108542b;

    public C48561sI2(VH2 vh2, Y94<InterfaceC33854Jp0> y94) {
        this.f108541a = vh2;
        this.f108542b = y94;
    }

    /* renamed from: a */
    public static C48561sI2 m14478a(VH2 vh2, Y94<InterfaceC33854Jp0> y94) {
        return new C48561sI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC34088Kp0 m14476c(VH2 vh2, InterfaceC33854Jp0 interfaceC33854Jp0) {
        return (InterfaceC34088Kp0) C51679xZ3.m5002e(vh2.m80029w(interfaceC33854Jp0));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC34088Kp0 get() {
        return m14476c(this.f108541a, this.f108542b.get());
    }
}
