package p000;
/* renamed from: aq3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38194aq3 implements InterfaceC48812sj1<C37601Zp3> {

    /* renamed from: a */
    public final Y94<InterfaceC41951h86> f56405a;

    /* renamed from: b */
    public final Y94<AbstractC38787bq3> f56406b;

    /* renamed from: c */
    public final Y94<AbstractC35963Sp3> f56407c;

    public C38194aq3(Y94<InterfaceC41951h86> y94, Y94<AbstractC38787bq3> y942, Y94<AbstractC35963Sp3> y943) {
        this.f56405a = y94;
        this.f56406b = y942;
        this.f56407c = y943;
    }

    /* renamed from: a */
    public static C38194aq3 m65393a(Y94<InterfaceC41951h86> y94, Y94<AbstractC38787bq3> y942, Y94<AbstractC35963Sp3> y943) {
        return new C38194aq3(y94, y942, y943);
    }

    /* renamed from: c */
    public static C37601Zp3 m65391c(InterfaceC41951h86 interfaceC41951h86, AbstractC38787bq3 abstractC38787bq3, AbstractC35963Sp3 abstractC35963Sp3) {
        return new C37601Zp3(interfaceC41951h86, abstractC38787bq3, abstractC35963Sp3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37601Zp3 get() {
        return m65391c(this.f56405a.get(), this.f56406b.get(), this.f56407c.get());
    }
}
