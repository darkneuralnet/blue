package p000;

import android.bluetooth.BluetoothDevice;
/* renamed from: J21 */
/* loaded from: classes6.dex */
public final class J21 implements InterfaceC49405tj1<BluetoothDevice> {

    /* renamed from: a */
    public final Z94<String> f16675a;

    /* renamed from: b */
    public final Z94<C46978pd5> f16676b;

    public J21(Z94<String> z94, Z94<C46978pd5> z942) {
        this.f16675a = z94;
        this.f16676b = z942;
    }

    /* renamed from: a */
    public static J21 m101286a(Z94<String> z94, Z94<C46978pd5> z942) {
        return new J21(z94, z942);
    }

    /* renamed from: c */
    public static BluetoothDevice m101284c(String str, C46978pd5 c46978pd5) {
        return (BluetoothDevice) C52272yZ3.m3257d(I21.m103046a(str, c46978pd5));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public BluetoothDevice get() {
        return m101284c(this.f16675a.get(), this.f16676b.get());
    }
}
