package p000;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
/* renamed from: sY2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48705sY2 {

    /* renamed from: a */
    public BluetoothGattCallback f108957a;

    /* renamed from: a */
    public void m14051a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        }
    }

    /* renamed from: b */
    public void m14050b(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onConnectionStateChange(bluetoothGatt, i, i2);
        }
    }

    /* renamed from: c */
    public void m14049c(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    /* renamed from: d */
    public void m14048d(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    }

    @TargetApi(21)
    /* renamed from: e */
    public void m14047e(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onMtuChanged(bluetoothGatt, i, i2);
        }
    }

    /* renamed from: f */
    public void m14046f(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
    }

    /* renamed from: g */
    public void m14045g(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }

    /* renamed from: h */
    public void m14044h(BluetoothGatt bluetoothGatt, int i, int i2) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReadRemoteRssi(bluetoothGatt, i, i2);
        }
    }

    /* renamed from: i */
    public void m14043i(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onReliableWriteCompleted(bluetoothGatt, i);
        }
    }

    /* renamed from: j */
    public void m14042j(BluetoothGatt bluetoothGatt, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onServicesDiscovered(bluetoothGatt, i);
        }
    }

    /* renamed from: k */
    public void m14041k(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        BluetoothGattCallback bluetoothGattCallback = this.f108957a;
        if (bluetoothGattCallback != null) {
            bluetoothGattCallback.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
        }
    }
}
