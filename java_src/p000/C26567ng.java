package p000;
/* renamed from: ng */
/* loaded from: classes4.dex */
public final class C26567ng implements InterfaceC48812sj1<C26161mg> {

    /* renamed from: a */
    public final Y94<InterfaceC27326pg> f100298a;

    /* renamed from: b */
    public final Y94<AbstractC20087eg> f100299b;

    public C26567ng(Y94<InterfaceC27326pg> y94, Y94<AbstractC20087eg> y942) {
        this.f100298a = y94;
        this.f100299b = y942;
    }

    /* renamed from: a */
    public static C26567ng m23341a(Y94<InterfaceC27326pg> y94, Y94<AbstractC20087eg> y942) {
        return new C26567ng(y94, y942);
    }

    /* renamed from: c */
    public static C26161mg m23339c(InterfaceC27326pg interfaceC27326pg, AbstractC20087eg abstractC20087eg) {
        return new C26161mg(interfaceC27326pg, abstractC20087eg);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C26161mg get() {
        return m23339c(this.f100298a.get(), this.f100299b.get());
    }
}
