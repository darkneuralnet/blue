package p000;
/* renamed from: JI2 */
/* loaded from: classes4.dex */
public final class JI2 implements InterfaceC48812sj1<XF1> {

    /* renamed from: a */
    public final VH2 f17315a;

    /* renamed from: b */
    public final Y94<InterfaceC44647lh6> f17316b;

    /* renamed from: c */
    public final Y94<InterfaceC39640dF1> f17317c;

    /* renamed from: d */
    public final Y94<AbstractC42604iF1> f17318d;

    /* renamed from: e */
    public final Y94<AbstractC44401lH1> f17319e;

    /* renamed from: f */
    public final Y94<C22454gl> f17320f;

    public JI2(VH2 vh2, Y94<InterfaceC44647lh6> y94, Y94<InterfaceC39640dF1> y942, Y94<AbstractC42604iF1> y943, Y94<AbstractC44401lH1> y944, Y94<C22454gl> y945) {
        this.f17315a = vh2;
        this.f17316b = y94;
        this.f17317c = y942;
        this.f17318d = y943;
        this.f17319e = y944;
        this.f17320f = y945;
    }

    /* renamed from: a */
    public static JI2 m100727a(VH2 vh2, Y94<InterfaceC44647lh6> y94, Y94<InterfaceC39640dF1> y942, Y94<AbstractC42604iF1> y943, Y94<AbstractC44401lH1> y944, Y94<C22454gl> y945) {
        return new JI2(vh2, y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static XF1 m100725c(VH2 vh2, InterfaceC44647lh6 interfaceC44647lh6, InterfaceC39640dF1 interfaceC39640dF1, AbstractC42604iF1 abstractC42604iF1, AbstractC44401lH1 abstractC44401lH1, C22454gl c22454gl) {
        return (XF1) C51679xZ3.m5002e(vh2.m80092O(interfaceC44647lh6, interfaceC39640dF1, abstractC42604iF1, abstractC44401lH1, c22454gl));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public XF1 get() {
        return m100725c(this.f17315a, this.f17316b.get(), this.f17317c.get(), this.f17318d.get(), this.f17319e.get(), this.f17320f.get());
    }
}
