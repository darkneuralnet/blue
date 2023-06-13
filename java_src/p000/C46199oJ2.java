package p000;
/* renamed from: oJ2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46199oJ2 implements InterfaceC48812sj1<InterfaceC49339tc5> {

    /* renamed from: a */
    public final VH2 f101770a;

    /* renamed from: b */
    public final Y94<InterfaceC45782nc5> f101771b;

    public C46199oJ2(VH2 vh2, Y94<InterfaceC45782nc5> y94) {
        this.f101770a = vh2;
        this.f101771b = y94;
    }

    /* renamed from: a */
    public static C46199oJ2 m21375a(VH2 vh2, Y94<InterfaceC45782nc5> y94) {
        return new C46199oJ2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC49339tc5 m21373c(VH2 vh2, InterfaceC45782nc5 interfaceC45782nc5) {
        return (InterfaceC49339tc5) C51679xZ3.m5002e(vh2.m80032u0(interfaceC45782nc5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC49339tc5 get() {
        return m21373c(this.f101770a, this.f101771b.get());
    }
}
