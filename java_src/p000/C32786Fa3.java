package p000;
/* renamed from: Fa3  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C32786Fa3 implements InterfaceC48812sj1<C32552Ea3> {

    /* renamed from: a */
    public final Y94<InterfaceC40433eb3> f9719a;

    public C32786Fa3(Y94<InterfaceC40433eb3> y94) {
        this.f9719a = y94;
    }

    /* renamed from: a */
    public static C32786Fa3 m106935a(Y94<InterfaceC40433eb3> y94) {
        return new C32786Fa3(y94);
    }

    /* renamed from: c */
    public static C32552Ea3 m106933c(InterfaceC40433eb3 interfaceC40433eb3) {
        return new C32552Ea3(interfaceC40433eb3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C32552Ea3 get() {
        return m106933c(this.f9719a.get());
    }
}
