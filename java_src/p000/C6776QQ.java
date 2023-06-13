package p000;
/* renamed from: QQ */
/* loaded from: classes4.dex */
public final class C6776QQ implements InterfaceC48812sj1<C6337PQ> {

    /* renamed from: a */
    public final Y94<InterfaceC26980oR> f30338a;

    /* renamed from: b */
    public final Y94<C36207Tq4> f30339b;

    /* renamed from: c */
    public final Y94<InterfaceC35660Rh6> f30340c;

    public C6776QQ(Y94<InterfaceC26980oR> y94, Y94<C36207Tq4> y942, Y94<InterfaceC35660Rh6> y943) {
        this.f30338a = y94;
        this.f30339b = y942;
        this.f30340c = y943;
    }

    /* renamed from: a */
    public static C6776QQ m88512a(Y94<InterfaceC26980oR> y94, Y94<C36207Tq4> y942, Y94<InterfaceC35660Rh6> y943) {
        return new C6776QQ(y94, y942, y943);
    }

    /* renamed from: c */
    public static C6337PQ m88510c(InterfaceC26980oR interfaceC26980oR, C36207Tq4 c36207Tq4, InterfaceC35660Rh6 interfaceC35660Rh6) {
        return new C6337PQ(interfaceC26980oR, c36207Tq4, interfaceC35660Rh6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C6337PQ get() {
        return m88510c(this.f30338a.get(), this.f30339b.get(), this.f30340c.get());
    }
}
