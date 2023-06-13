package p000;
/* renamed from: bz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38880bz6 implements InterfaceC48812sj1<C38287az6> {

    /* renamed from: a */
    public final Y94<InterfaceC46545ot5> f59850a;

    /* renamed from: b */
    public final Y94<InterfaceC39491cz6> f59851b;

    public C38880bz6(Y94<InterfaceC46545ot5> y94, Y94<InterfaceC39491cz6> y942) {
        this.f59850a = y94;
        this.f59851b = y942;
    }

    /* renamed from: a */
    public static C38880bz6 m62056a(Y94<InterfaceC46545ot5> y94, Y94<InterfaceC39491cz6> y942) {
        return new C38880bz6(y94, y942);
    }

    /* renamed from: c */
    public static C38287az6 m62054c(InterfaceC46545ot5 interfaceC46545ot5, InterfaceC39491cz6 interfaceC39491cz6) {
        return new C38287az6(interfaceC46545ot5, interfaceC39491cz6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C38287az6 get() {
        return m62054c(this.f59850a.get(), this.f59851b.get());
    }
}
