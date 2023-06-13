package p000;

import android.location.LocationManager;
/* renamed from: lj */
/* loaded from: classes4.dex */
public final class C25769lj implements InterfaceC48812sj1<LocationManager> {

    /* renamed from: a */
    public final C22711hj f96635a;

    public C25769lj(C22711hj c22711hj) {
        this.f96635a = c22711hj;
    }

    /* renamed from: a */
    public static C25769lj m26912a(C22711hj c22711hj) {
        return new C25769lj(c22711hj);
    }

    /* renamed from: c */
    public static LocationManager m26910c(C22711hj c22711hj) {
        return (LocationManager) C51679xZ3.m5002e(c22711hj.m36001d());
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LocationManager get() {
        return m26910c(this.f96635a);
    }
}
