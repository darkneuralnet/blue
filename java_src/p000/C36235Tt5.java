package p000;

import android.bluetooth.BluetoothGatt;
/* renamed from: Tt5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36235Tt5 implements InterfaceC49405tj1<C36001St5> {

    /* renamed from: a */
    public final Z94<InterfaceC47776qy0> f36415a;

    /* renamed from: b */
    public final Z94<BluetoothGatt> f36416b;

    /* renamed from: c */
    public final Z94<InterfaceC40503ei3> f36417c;

    public C36235Tt5(Z94<InterfaceC47776qy0> z94, Z94<BluetoothGatt> z942, Z94<InterfaceC40503ei3> z943) {
        this.f36415a = z94;
        this.f36416b = z942;
        this.f36417c = z943;
    }

    /* renamed from: a */
    public static C36235Tt5 m82300a(Z94<InterfaceC47776qy0> z94, Z94<BluetoothGatt> z942, Z94<InterfaceC40503ei3> z943) {
        return new C36235Tt5(z94, z942, z943);
    }

    /* renamed from: c */
    public static C36001St5 m82298c(InterfaceC47776qy0 interfaceC47776qy0, BluetoothGatt bluetoothGatt, InterfaceC40503ei3 interfaceC40503ei3) {
        return new C36001St5(interfaceC47776qy0, bluetoothGatt, interfaceC40503ei3);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C36001St5 get() {
        return m82298c(this.f36415a.get(), this.f36416b.get(), this.f36417c.get());
    }
}
