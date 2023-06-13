package p000;
/* renamed from: XI2 */
/* loaded from: classes4.dex */
public final class XI2 implements InterfaceC48812sj1<InterfaceC37097Xl3> {

    /* renamed from: a */
    public final VH2 f42966a;

    /* renamed from: b */
    public final Y94<InterfaceC36863Wl3> f42967b;

    /* renamed from: c */
    public final Y94<InterfaceC44647lh6> f42968c;

    public XI2(VH2 vh2, Y94<InterfaceC36863Wl3> y94, Y94<InterfaceC44647lh6> y942) {
        this.f42966a = vh2;
        this.f42967b = y94;
        this.f42968c = y942;
    }

    /* renamed from: a */
    public static XI2 m77139a(VH2 vh2, Y94<InterfaceC36863Wl3> y94, Y94<InterfaceC44647lh6> y942) {
        return new XI2(vh2, y94, y942);
    }

    /* renamed from: c */
    public static InterfaceC37097Xl3 m77137c(VH2 vh2, InterfaceC36863Wl3 interfaceC36863Wl3, InterfaceC44647lh6 interfaceC44647lh6) {
        return (InterfaceC37097Xl3) C51679xZ3.m5002e(vh2.m80068c0(interfaceC36863Wl3, interfaceC44647lh6));
    }

    @Override // p000.Y94
    /* renamed from: b */
    public InterfaceC37097Xl3 get() {
        return m77137c(this.f42966a, this.f42967b.get(), this.f42968c.get());
    }
}
