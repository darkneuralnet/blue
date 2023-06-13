package p000;

import com.google.android.libraries.places.api.net.PlacesClient;
/* renamed from: mO */
/* loaded from: classes4.dex */
public final class C26080mO implements InterfaceC48812sj1<C25684lO> {

    /* renamed from: a */
    public final Y94<InterfaceC40359eT2> f97937a;

    /* renamed from: b */
    public final Y94<PlacesClient> f97938b;

    public C26080mO(Y94<InterfaceC40359eT2> y94, Y94<PlacesClient> y942) {
        this.f97937a = y94;
        this.f97938b = y942;
    }

    /* renamed from: a */
    public static C26080mO m25693a(Y94<InterfaceC40359eT2> y94, Y94<PlacesClient> y942) {
        return new C26080mO(y94, y942);
    }

    /* renamed from: c */
    public static C25684lO m25691c(InterfaceC40359eT2 interfaceC40359eT2, PlacesClient placesClient) {
        return new C25684lO(interfaceC40359eT2, placesClient);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C25684lO get() {
        return m25691c(this.f97937a.get(), this.f97938b.get());
    }
}
