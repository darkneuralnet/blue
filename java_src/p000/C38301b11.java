package p000;

import com.google.android.libraries.places.api.net.PlacesClient;
/* renamed from: b11  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C38301b11 implements InterfaceC48812sj1<Z01> {

    /* renamed from: a */
    public final Y94<PlacesClient> f56791a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f56792b;

    public C38301b11(Y94<PlacesClient> y94, Y94<InterfaceC40001dr4> y942) {
        this.f56791a = y94;
        this.f56792b = y942;
    }

    /* renamed from: a */
    public static C38301b11 m65114a(Y94<PlacesClient> y94, Y94<InterfaceC40001dr4> y942) {
        return new C38301b11(y94, y942);
    }

    /* renamed from: c */
    public static Z01 m65112c(PlacesClient placesClient, InterfaceC40001dr4 interfaceC40001dr4) {
        return new Z01(placesClient, interfaceC40001dr4);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public Z01 get() {
        return m65112c(this.f56791a.get(), this.f56792b.get());
    }
}
