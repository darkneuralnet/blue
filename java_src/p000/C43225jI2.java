package p000;
/* renamed from: jI2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C43225jI2 implements InterfaceC48812sj1<InterfaceC30556yL> {

    /* renamed from: a */
    public final VH2 f92486a;

    /* renamed from: b */
    public final Y94<InterfaceC10636aM> f92487b;

    /* renamed from: c */
    public final Y94<InterfaceC44723lp2> f92488c;

    /* renamed from: d */
    public final Y94<AbstractC39873de5> f92489d;

    public C43225jI2(VH2 vh2, Y94<InterfaceC10636aM> y94, Y94<InterfaceC44723lp2> y942, Y94<AbstractC39873de5> y943) {
        this.f92486a = vh2;
        this.f92487b = y94;
        this.f92488c = y942;
        this.f92489d = y943;
    }

    /* renamed from: a */
    public static C43225jI2 m30819a(VH2 vh2, Y94<InterfaceC10636aM> y94, Y94<InterfaceC44723lp2> y942, Y94<AbstractC39873de5> y943) {
        return new C43225jI2(vh2, y94, y942, y943);
    }

    /* renamed from: c */
    public static InterfaceC30556yL m30817c(VH2 vh2, InterfaceC10636aM interfaceC10636aM, InterfaceC44723lp2 interfaceC44723lp2, AbstractC39873de5 abstractC39873de5) {
        return (InterfaceC30556yL) C51679xZ3.m5002e(vh2.m80047n(interfaceC10636aM, interfaceC44723lp2, abstractC39873de5));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC30556yL get() {
        return m30817c(this.f92486a, this.f92487b.get(), this.f92488c.get(), this.f92489d.get());
    }
}
