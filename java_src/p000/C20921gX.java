package p000;

import co.bird.android.app.feature.operator.activity.BluetoothEnableChangeReceiver;
/* renamed from: gX */
/* loaded from: classes2.dex */
public final class C20921gX implements InterfaceC48812sj1<BluetoothEnableChangeReceiver> {

    /* renamed from: a */
    public final Y94<InterfaceC49820uQ3> f82380a;

    public C20921gX(Y94<InterfaceC49820uQ3> y94) {
        this.f82380a = y94;
    }

    /* renamed from: a */
    public static C20921gX m39198a(Y94<InterfaceC49820uQ3> y94) {
        return new C20921gX(y94);
    }

    /* renamed from: c */
    public static BluetoothEnableChangeReceiver m39196c(InterfaceC49820uQ3 interfaceC49820uQ3) {
        return new BluetoothEnableChangeReceiver(interfaceC49820uQ3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public BluetoothEnableChangeReceiver get() {
        return m39196c(this.f82380a.get());
    }
}
