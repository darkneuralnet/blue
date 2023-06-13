package p000;

import android.content.Context;
import android.location.LocationManager;
import p000.InterfaceC41706gk0;
/* renamed from: xk0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51785xk0 implements InterfaceC49405tj1<LocationManager> {

    /* renamed from: a */
    public final Z94<Context> f118040a;

    public C51785xk0(Z94<Context> z94) {
        this.f118040a = z94;
    }

    /* renamed from: a */
    public static C51785xk0 m4762a(Z94<Context> z94) {
        return new C51785xk0(z94);
    }

    /* renamed from: c */
    public static LocationManager m4760c(Context context) {
        return (LocationManager) C52272yZ3.m3257d(InterfaceC41706gk0.AbstractC22421c.m37844q(context));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public LocationManager get() {
        return m4760c(this.f118040a.get());
    }
}
