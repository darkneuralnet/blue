package p000;
/* renamed from: kg5  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C44043kg5 implements InterfaceC48812sj1<C43450jg5> {

    /* renamed from: a */
    public final Y94<InterfaceC41078fg5> f94775a;

    public C44043kg5(Y94<InterfaceC41078fg5> y94) {
        this.f94775a = y94;
    }

    /* renamed from: a */
    public static C44043kg5 m28651a(Y94<InterfaceC41078fg5> y94) {
        return new C44043kg5(y94);
    }

    /* renamed from: c */
    public static C43450jg5 m28649c(InterfaceC41078fg5 interfaceC41078fg5) {
        return new C43450jg5(interfaceC41078fg5);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C43450jg5 get() {
        return m28649c(this.f94775a.get());
    }
}
