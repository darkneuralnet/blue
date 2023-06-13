package p000;

import android.bluetooth.BluetoothGatt;
/* renamed from: ky0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44218ky0 implements InterfaceC49405tj1<BluetoothGatt> {

    /* renamed from: a */
    public final Z94<C25174kX> f95290a;

    public C44218ky0(Z94<C25174kX> z94) {
        this.f95290a = z94;
    }

    /* renamed from: a */
    public static C44218ky0 m28090a(Z94<C25174kX> z94) {
        return new C44218ky0(z94);
    }

    /* renamed from: c */
    public static BluetoothGatt m28088c(C25174kX c25174kX) {
        return (BluetoothGatt) C52272yZ3.m3257d(AbstractC42439hy0.m35446c(c25174kX));
    }

    @Override // p000.Z94
    /* renamed from: b */
    public BluetoothGatt get() {
        return m28088c(this.f95290a.get());
    }
}
