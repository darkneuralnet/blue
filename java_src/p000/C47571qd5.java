package p000;

import android.bluetooth.BluetoothAdapter;
/* renamed from: qd5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47571qd5 implements InterfaceC49405tj1<C46978pd5> {

    /* renamed from: a */
    public final Z94<BluetoothAdapter> f105536a;

    public C47571qd5(Z94<BluetoothAdapter> z94) {
        this.f105536a = z94;
    }

    /* renamed from: a */
    public static C47571qd5 m17313a(Z94<BluetoothAdapter> z94) {
        return new C47571qd5(z94);
    }

    /* renamed from: c */
    public static C46978pd5 m17311c(BluetoothAdapter bluetoothAdapter) {
        return new C46978pd5(bluetoothAdapter);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C46978pd5 get() {
        return m17311c(this.f105536a.get());
    }
}
