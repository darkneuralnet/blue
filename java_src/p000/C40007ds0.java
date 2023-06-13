package p000;
/* renamed from: ds0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C40007ds0 implements InterfaceC48812sj1<C39415cs0> {

    /* renamed from: a */
    public final Y94<InterfaceC37130Xp0> f77317a;

    /* renamed from: b */
    public final Y94<AbstractC35033Oq0> f77318b;

    /* renamed from: c */
    public final Y94<AbstractC34565Mq0> f77319c;

    public C40007ds0(Y94<InterfaceC37130Xp0> y94, Y94<AbstractC35033Oq0> y942, Y94<AbstractC34565Mq0> y943) {
        this.f77317a = y94;
        this.f77318b = y942;
        this.f77319c = y943;
    }

    /* renamed from: a */
    public static C40007ds0 m43583a(Y94<InterfaceC37130Xp0> y94, Y94<AbstractC35033Oq0> y942, Y94<AbstractC34565Mq0> y943) {
        return new C40007ds0(y94, y942, y943);
    }

    /* renamed from: c */
    public static C39415cs0 m43581c(InterfaceC37130Xp0 interfaceC37130Xp0, AbstractC35033Oq0 abstractC35033Oq0, AbstractC34565Mq0 abstractC34565Mq0) {
        return new C39415cs0(interfaceC37130Xp0, abstractC35033Oq0, abstractC34565Mq0);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C39415cs0 get() {
        return m43581c(this.f77317a.get(), this.f77318b.get(), this.f77319c.get());
    }
}
