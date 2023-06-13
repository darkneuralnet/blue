package p000;
/* renamed from: fI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40853fI2 implements InterfaceC48812sj1<InterfaceC20340fF> {

    /* renamed from: a */
    public final VH2 f79808a;

    /* renamed from: b */
    public final Y94<InterfaceC8580VE> f79809b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f79810c;

    public C40853fI2(VH2 vh2, Y94<InterfaceC8580VE> y94, Y94<InterfaceC44647lh6> y942) {
        this.f79808a = vh2;
        this.f79809b = y94;
        this.f79810c = y942;
    }

    /* renamed from: a */
    public static C40853fI2 m41607a(VH2 vh2, Y94<InterfaceC8580VE> y94, Y94<InterfaceC44647lh6> y942) {
        return new C40853fI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC20340fF m41605c(VH2 vh2, InterfaceC8580VE interfaceC8580VE, InterfaceC44647lh6 interfaceC44647lh6) {
        return (InterfaceC20340fF) C51679xZ3.m5002e(vh2.m80055j(interfaceC8580VE, interfaceC44647lh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC20340fF get() {
        return m41605c(this.f79808a, this.f79809b.get(), this.f79810c.get());
    }
}
