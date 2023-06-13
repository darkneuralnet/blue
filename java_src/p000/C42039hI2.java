package p000;
/* renamed from: hI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42039hI2 implements InterfaceC48812sj1<InterfaceC25136kJ> {

    /* renamed from: a */
    public final VH2 f84968a;

    /* renamed from: b */
    public final Y94<InterfaceC8601VK> f84969b;

    public C42039hI2(VH2 vh2, Y94<InterfaceC8601VK> y94) {
        this.f84968a = vh2;
        this.f84969b = y94;
    }

    /* renamed from: a */
    public static C42039hI2 m36556a(VH2 vh2, Y94<InterfaceC8601VK> y94) {
        return new C42039hI2(vh2, y94);
    }

    /* renamed from: c */
    public static InterfaceC25136kJ m36554c(VH2 vh2, InterfaceC8601VK interfaceC8601VK) {
        return (InterfaceC25136kJ) C51679xZ3.m5002e(vh2.m80051l(interfaceC8601VK));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC25136kJ get() {
        return m36554c(this.f84968a, this.f84969b.get());
    }
}
