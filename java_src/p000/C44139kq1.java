package p000;
/* renamed from: kq1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44139kq1 implements InterfaceC48812sj1<C43546jq1> {

    /* renamed from: a */
    public final Y94<InterfaceC50650vp1> f95048a;

    /* renamed from: b */
    public final Y94<AbstractC53022zp1> f95049b;

    /* renamed from: c */
    public final Y94<AbstractC34791Np1> f95050c;

    public C44139kq1(Y94<InterfaceC50650vp1> y94, Y94<AbstractC53022zp1> y942, Y94<AbstractC34791Np1> y943) {
        this.f95048a = y94;
        this.f95049b = y942;
        this.f95050c = y943;
    }

    /* renamed from: a */
    public static C44139kq1 m28377a(Y94<InterfaceC50650vp1> y94, Y94<AbstractC53022zp1> y942, Y94<AbstractC34791Np1> y943) {
        return new C44139kq1(y94, y942, y943);
    }

    /* renamed from: c */
    public static C43546jq1 m28375c(InterfaceC50650vp1 interfaceC50650vp1, AbstractC53022zp1 abstractC53022zp1, AbstractC34791Np1 abstractC34791Np1) {
        return new C43546jq1(interfaceC50650vp1, abstractC53022zp1, abstractC34791Np1);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43546jq1 get() {
        return m28375c(this.f95048a.get(), this.f95049b.get(), this.f95050c.get());
    }
}
