package p000;

import android.content.ContentResolver;
import android.location.LocationManager;
/* renamed from: yi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C52358yi0 implements InterfaceC49405tj1<C51765xi0> {

    /* renamed from: a */
    public final Z94<ContentResolver> f120026a;

    /* renamed from: b */
    public final Z94<LocationManager> f120027b;

    public C52358yi0(Z94<ContentResolver> z94, Z94<LocationManager> z942) {
        this.f120026a = z94;
        this.f120027b = z942;
    }

    /* renamed from: a */
    public static C52358yi0 m2893a(Z94<ContentResolver> z94, Z94<LocationManager> z942) {
        return new C52358yi0(z94, z942);
    }

    /* renamed from: c */
    public static C51765xi0 m2891c(ContentResolver contentResolver, LocationManager locationManager) {
        return new C51765xi0(contentResolver, locationManager);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C51765xi0 get() {
        return m2891c(this.f120026a.get(), this.f120027b.get());
    }
}
