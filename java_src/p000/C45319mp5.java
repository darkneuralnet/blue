package p000;
/* renamed from: mp5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C45319mp5 implements InterfaceC48812sj1<C44726lp5> {

    /* renamed from: a */
    public final Y94<AbstractC42354hp5> f98859a;

    /* renamed from: b */
    public final Y94<InterfaceC41951h86> f98860b;

    public C45319mp5(Y94<AbstractC42354hp5> y94, Y94<InterfaceC41951h86> y942) {
        this.f98859a = y94;
        this.f98860b = y942;
    }

    /* renamed from: a */
    public static C45319mp5 m24883a(Y94<AbstractC42354hp5> y94, Y94<InterfaceC41951h86> y942) {
        return new C45319mp5(y94, y942);
    }

    /* renamed from: c */
    public static C44726lp5 m24881c(AbstractC42354hp5 abstractC42354hp5, InterfaceC41951h86 interfaceC41951h86) {
        return new C44726lp5(abstractC42354hp5, interfaceC41951h86);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44726lp5 get() {
        return m24881c(this.f98859a.get(), this.f98860b.get());
    }
}
