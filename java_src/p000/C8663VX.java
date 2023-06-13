package p000;

import android.bluetooth.BluetoothManager;
/* renamed from: VX */
/* loaded from: classes6.dex */
public final class C8663VX implements InterfaceC49405tj1<C8307UX> {

    /* renamed from: a */
    public final Z94<BluetoothManager> f39187a;

    public C8663VX(Z94<BluetoothManager> z94) {
        this.f39187a = z94;
    }

    /* renamed from: a */
    public static C8663VX m79827a(Z94<BluetoothManager> z94) {
        return new C8663VX(z94);
    }

    /* renamed from: c */
    public static C8307UX m79825c(BluetoothManager bluetoothManager) {
        return new C8307UX(bluetoothManager);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C8307UX get() {
        return m79825c(this.f39187a.get());
    }
}
