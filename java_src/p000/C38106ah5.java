package p000;
/* renamed from: ah5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C38106ah5 implements InterfaceC48220rj1<C37522Zg5> {

    /* renamed from: a */
    public final Y94<InterfaceC38734bl0> f50950a;

    /* renamed from: b */
    public final Y94<InterfaceC38734bl0> f50951b;

    /* renamed from: c */
    public final Y94<AbstractC35646Rg1> f50952c;

    /* renamed from: d */
    public final Y94<C35704Rm5> f50953d;

    /* renamed from: e */
    public final Y94<String> f50954e;

    public C38106ah5(Y94<InterfaceC38734bl0> y94, Y94<InterfaceC38734bl0> y942, Y94<AbstractC35646Rg1> y943, Y94<C35704Rm5> y944, Y94<String> y945) {
        this.f50950a = y94;
        this.f50951b = y942;
        this.f50952c = y943;
        this.f50953d = y944;
        this.f50954e = y945;
    }

    /* renamed from: a */
    public static C38106ah5 m70858a(Y94<InterfaceC38734bl0> y94, Y94<InterfaceC38734bl0> y942, Y94<AbstractC35646Rg1> y943, Y94<C35704Rm5> y944, Y94<String> y945) {
        return new C38106ah5(y94, y942, y943, y944, y945);
    }

    /* renamed from: c */
    public static C37522Zg5 m70856c(InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, Object obj, Object obj2, Y94<String> y94) {
        return new C37522Zg5(interfaceC38734bl0, interfaceC38734bl02, (AbstractC35646Rg1) obj, (C35704Rm5) obj2, y94);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C37522Zg5 get() {
        return m70856c(this.f50950a.get(), this.f50951b.get(), this.f50952c.get(), this.f50953d.get(), this.f50954e);
    }
}
