package p000;
/* renamed from: hz6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C42455hz6 implements InterfaceC48812sj1<C41862gz6> {

    /* renamed from: a */
    public final Y94<InterfaceC36152Tk3> f86253a;

    /* renamed from: b */
    public final Y94<AbstractC36983Wy6> f86254b;

    public C42455hz6(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC36983Wy6> y942) {
        this.f86253a = y94;
        this.f86254b = y942;
    }

    /* renamed from: a */
    public static C42455hz6 m35416a(Y94<InterfaceC36152Tk3> y94, Y94<AbstractC36983Wy6> y942) {
        return new C42455hz6(y94, y942);
    }

    /* renamed from: c */
    public static C41862gz6 m35414c(InterfaceC36152Tk3 interfaceC36152Tk3, AbstractC36983Wy6 abstractC36983Wy6) {
        return new C41862gz6(interfaceC36152Tk3, abstractC36983Wy6);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C41862gz6 get() {
        return m35414c(this.f86253a.get(), this.f86254b.get());
    }
}
