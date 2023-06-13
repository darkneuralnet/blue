package p000;

import co.bird.android.app.feature.operator.activity.LocationEnableChangeReceiver;
/* renamed from: Wv2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C36952Wv2 implements InterfaceC48812sj1<LocationEnableChangeReceiver> {

    /* renamed from: a */
    public final Y94<InterfaceC49820uQ3> f42297a;

    public C36952Wv2(Y94<InterfaceC49820uQ3> y94) {
        this.f42297a = y94;
    }

    /* renamed from: a */
    public static C36952Wv2 m77710a(Y94<InterfaceC49820uQ3> y94) {
        return new C36952Wv2(y94);
    }

    /* renamed from: c */
    public static LocationEnableChangeReceiver m77708c(InterfaceC49820uQ3 interfaceC49820uQ3) {
        return new LocationEnableChangeReceiver(interfaceC49820uQ3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public LocationEnableChangeReceiver get() {
        return m77708c(this.f42297a.get());
    }
}
