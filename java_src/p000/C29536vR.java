package p000;
/* renamed from: vR */
/* loaded from: classes4.dex */
public final class C29536vR implements InterfaceC48812sj1<C29193uR> {

    /* renamed from: a */
    public final Y94<InterfaceC27906rP> f114061a;

    /* renamed from: b */
    public final Y94<AbstractC25698lR> f114062b;

    public C29536vR(Y94<InterfaceC27906rP> y94, Y94<AbstractC25698lR> y942) {
        this.f114061a = y94;
        this.f114062b = y942;
    }

    /* renamed from: a */
    public static C29536vR m8678a(Y94<InterfaceC27906rP> y94, Y94<AbstractC25698lR> y942) {
        return new C29536vR(y94, y942);
    }

    /* renamed from: c */
    public static C29193uR m8676c(InterfaceC27906rP interfaceC27906rP, AbstractC25698lR abstractC25698lR) {
        return new C29193uR(interfaceC27906rP, abstractC25698lR);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C29193uR get() {
        return m8676c(this.f114061a.get(), this.f114062b.get());
    }
}
