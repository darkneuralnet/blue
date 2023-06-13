package p000;
/* renamed from: or1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C46521or1 implements InterfaceC48812sj1<C45928nr1> {

    /* renamed from: a */
    public final Y94<InterfaceC49475tq1> f102558a;

    /* renamed from: b */
    public final Y94<AbstractC51253wq1> f102559b;

    /* renamed from: c */
    public final Y94<AbstractC50670vr1> f102560c;

    /* renamed from: d */
    public final Y94<AbstractC51233wo1> f102561d;

    /* renamed from: e */
    public final Y94<AbstractC37122Xo1> f102562e;

    /* renamed from: f */
    public final Y94<AbstractC41164fp1> f102563f;

    public C46521or1(Y94<InterfaceC49475tq1> y94, Y94<AbstractC51253wq1> y942, Y94<AbstractC50670vr1> y943, Y94<AbstractC51233wo1> y944, Y94<AbstractC37122Xo1> y945, Y94<AbstractC41164fp1> y946) {
        this.f102558a = y94;
        this.f102559b = y942;
        this.f102560c = y943;
        this.f102561d = y944;
        this.f102562e = y945;
        this.f102563f = y946;
    }

    /* renamed from: a */
    public static C46521or1 m20459a(Y94<InterfaceC49475tq1> y94, Y94<AbstractC51253wq1> y942, Y94<AbstractC50670vr1> y943, Y94<AbstractC51233wo1> y944, Y94<AbstractC37122Xo1> y945, Y94<AbstractC41164fp1> y946) {
        return new C46521or1(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C45928nr1 m20457c(InterfaceC49475tq1 interfaceC49475tq1, AbstractC51253wq1 abstractC51253wq1, AbstractC50670vr1 abstractC50670vr1, AbstractC51233wo1 abstractC51233wo1, AbstractC37122Xo1 abstractC37122Xo1, AbstractC41164fp1 abstractC41164fp1) {
        return new C45928nr1(interfaceC49475tq1, abstractC51253wq1, abstractC50670vr1, abstractC51233wo1, abstractC37122Xo1, abstractC41164fp1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C45928nr1 get() {
        return m20457c(this.f102558a.get(), this.f102559b.get(), this.f102560c.get(), this.f102561d.get(), this.f102562e.get(), this.f102563f.get());
    }
}
