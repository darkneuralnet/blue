package p000;
/* renamed from: gq */
/* loaded from: classes2.dex */
public final class C22484gq implements InterfaceC48812sj1<InterfaceC36655Vo2> {

    /* renamed from: a */
    public final C19865dq f84335a;

    /* renamed from: b */
    public final Y94<MN4> f84336b;

    public C22484gq(C19865dq c19865dq, Y94<MN4> y94) {
        this.f84335a = c19865dq;
        this.f84336b = y94;
    }

    /* renamed from: a */
    public static C22484gq m37431a(C19865dq c19865dq, Y94<MN4> y94) {
        return new C22484gq(c19865dq, y94);
    }

    /* renamed from: c */
    public static InterfaceC36655Vo2 m37429c(C19865dq c19865dq, MN4 mn4) {
        return (InterfaceC36655Vo2) C51679xZ3.m5002e(c19865dq.m43671c(mn4));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC36655Vo2 get() {
        return m37429c(this.f84335a, this.f84336b.get());
    }
}
