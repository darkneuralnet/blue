package p000;

import android.bluetooth.BluetoothGatt;
/* renamed from: Tr4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36216Tr4 implements InterfaceC49405tj1<C35982Sr4> {

    /* renamed from: a */
    public final Z94<C50544ve5> f36348a;

    /* renamed from: b */
    public final Z94<BluetoothGatt> f36349b;

    /* renamed from: c */
    public final Z94<L46> f36350c;

    public C36216Tr4(Z94<C50544ve5> z94, Z94<BluetoothGatt> z942, Z94<L46> z943) {
        this.f36348a = z94;
        this.f36349b = z942;
        this.f36350c = z943;
    }

    /* renamed from: a */
    public static C36216Tr4 m82353a(Z94<C50544ve5> z94, Z94<BluetoothGatt> z942, Z94<L46> z943) {
        return new C36216Tr4(z94, z942, z943);
    }

    /* renamed from: c */
    public static C35982Sr4 m82351c(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, L46 l46) {
        return new C35982Sr4(c50544ve5, bluetoothGatt, l46);
    }

    @Override // p000.Z94
    /* renamed from: b */
    public C35982Sr4 get() {
        return m82351c(this.f36348a.get(), this.f36349b.get(), this.f36350c.get());
    }
}
