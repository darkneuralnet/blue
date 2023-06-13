package p000;
/* renamed from: u10  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49583u10 implements InterfaceC48812sj1<C48990t10> {

    /* renamed from: a */
    public final Y94<InterfaceC43061j10> f111483a;

    /* renamed from: b */
    public final Y94<AbstractC44247l10> f111484b;

    public C49583u10(Y94<InterfaceC43061j10> y94, Y94<AbstractC44247l10> y942) {
        this.f111483a = y94;
        this.f111484b = y942;
    }

    /* renamed from: a */
    public static C49583u10 m11064a(Y94<InterfaceC43061j10> y94, Y94<AbstractC44247l10> y942) {
        return new C49583u10(y94, y942);
    }

    /* renamed from: c */
    public static C48990t10 m11062c(InterfaceC43061j10 interfaceC43061j10, AbstractC44247l10 abstractC44247l10) {
        return new C48990t10(interfaceC43061j10, abstractC44247l10);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C48990t10 get() {
        return m11062c(this.f111483a.get(), this.f111484b.get());
    }
}
