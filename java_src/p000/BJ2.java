package p000;
/* renamed from: BJ2 */
/* loaded from: classes4.dex */
public final class BJ2 implements InterfaceC48812sj1<InterfaceC44637lg6> {

    /* renamed from: a */
    public final VH2 f2191a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f2192b;

    /* renamed from: c */
    public final Y94<InterfaceC44044kg6> f2193c;

    /* renamed from: d */
    public final Y94<InterfaceC36587Vg6> f2194d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f2195e;

    /* renamed from: f */
    public final Y94<InterfaceC1880Ea> f2196f;

    /* renamed from: g */
    public final Y94<InterfaceC35660Rh6> f2197g;

    public BJ2(VH2 vh2, Y94<InterfaceC44647lh6> y94, Y94<InterfaceC44044kg6> y942, Y94<InterfaceC36587Vg6> y943, Y94<C36207Tq4> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC35660Rh6> y946) {
        this.f2191a = vh2;
        this.f2192b = y94;
        this.f2193c = y942;
        this.f2194d = y943;
        this.f2195e = y944;
        this.f2196f = y945;
        this.f2197g = y946;
    }

    /* renamed from: a */
    public static BJ2 m114110a(VH2 vh2, Y94<InterfaceC44647lh6> y94, Y94<InterfaceC44044kg6> y942, Y94<InterfaceC36587Vg6> y943, Y94<C36207Tq4> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC35660Rh6> y946) {
        return new BJ2(vh2, y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static InterfaceC44637lg6 m114108c(VH2 vh2, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC44044kg6 interfaceC44044kg6, InterfaceC36587Vg6 interfaceC36587Vg6, C36207Tq4 c36207Tq4, InterfaceC1880Ea interfaceC1880Ea, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return (InterfaceC44637lg6) C51679xZ3.m5002e(vh2.m80105H0(interfaceC44647lh6, interfaceC44044kg6, interfaceC36587Vg6, c36207Tq4, interfaceC1880Ea, interfaceC35660Rh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC44637lg6 get() {
        return m114108c(this.f2191a, this.f2192b.get(), this.f2193c.get(), this.f2194d.get(), this.f2195e.get(), this.f2196f.get(), this.f2197g.get());
    }
}
