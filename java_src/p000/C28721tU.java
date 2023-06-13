package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.content.Context;
/* renamed from: tU */
/* loaded from: classes6.dex */
public class C28721tU {

    /* renamed from: a */
    public final Context f110537a;

    public C28721tU(Context context) {
        this.f110537a = context;
    }

    /* renamed from: a */
    public BluetoothGatt m12291a(BluetoothDevice bluetoothDevice, boolean z, BluetoothGattCallback bluetoothGattCallback) {
        if (bluetoothDevice == null) {
            return null;
        }
        return m12290b(bluetoothGattCallback, bluetoothDevice, z);
    }

    /* renamed from: b */
    public final BluetoothGatt m12290b(BluetoothGattCallback bluetoothGattCallback, BluetoothDevice bluetoothDevice, boolean z) {
        C52323ye5.m3112q("Connecting without reflection", new Object[0]);
        return bluetoothDevice.connectGatt(this.f110537a, z, bluetoothGattCallback, 2);
    }
}
