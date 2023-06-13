package p000;
/* renamed from: gj3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41699gj3 implements InterfaceC48812sj1<C41106fj3> {

    /* renamed from: a */
    public final Y94<InterfaceC41951h86> f84075a;

    /* renamed from: b */
    public final Y94<AbstractC48212ri3> f84076b;

    public C41699gj3(Y94<InterfaceC41951h86> y94, Y94<AbstractC48212ri3> y942) {
        this.f84075a = y94;
        this.f84076b = y942;
    }

    /* renamed from: a */
    public static C41699gj3 m37868a(Y94<InterfaceC41951h86> y94, Y94<AbstractC48212ri3> y942) {
        return new C41699gj3(y94, y942);
    }

    /* renamed from: c */
    public static C41106fj3 m37866c(InterfaceC41951h86 interfaceC41951h86, AbstractC48212ri3 abstractC48212ri3) {
        return new C41106fj3(interfaceC41951h86, abstractC48212ri3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41106fj3 get() {
        return m37866c(this.f84075a.get(), this.f84076b.get());
    }
}
