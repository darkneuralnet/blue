package p000;
/* renamed from: ka6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43984ka6 implements InterfaceC48220rj1<C42798ia6> {

    /* renamed from: a */
    public final Y94<InterfaceC38734bl0> f94541a;

    /* renamed from: b */
    public final Y94<InterfaceC38734bl0> f94542b;

    /* renamed from: c */
    public final Y94<InterfaceC51217wm5> f94543c;

    /* renamed from: d */
    public final Y94<C52334yf6> f94544d;

    /* renamed from: e */
    public final Y94<XC6> f94545e;

    public C43984ka6(Y94<InterfaceC38734bl0> y94, Y94<InterfaceC38734bl0> y942, Y94<InterfaceC51217wm5> y943, Y94<C52334yf6> y944, Y94<XC6> y945) {
        this.f94541a = y94;
        this.f94542b = y942;
        this.f94543c = y943;
        this.f94544d = y944;
        this.f94545e = y945;
    }

    /* renamed from: a */
    public static C43984ka6 m28819a(Y94<InterfaceC38734bl0> y94, Y94<InterfaceC38734bl0> y942, Y94<InterfaceC51217wm5> y943, Y94<C52334yf6> y944, Y94<XC6> y945) {
        return new C43984ka6(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C42798ia6 m28817c(InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, InterfaceC51217wm5 interfaceC51217wm5, C52334yf6 c52334yf6, XC6 xc6) {
        return new C42798ia6(interfaceC38734bl0, interfaceC38734bl02, interfaceC51217wm5, c52334yf6, xc6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C42798ia6 get() {
        return m28817c(this.f94541a.get(), this.f94542b.get(), this.f94543c.get(), this.f94544d.get(), this.f94545e.get());
    }
}
