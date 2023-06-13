package com.polidea.rxandroidble2.exceptions;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
/* loaded from: classes6.dex */
public class BleGattCharacteristicException extends BleGattException {

    /* renamed from: e */
    public final BluetoothGattCharacteristic f75009e;

    public BleGattCharacteristicException(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, C29202uU c29202uU) {
        super(bluetoothGatt, i, c29202uU);
        this.f75009e = bluetoothGattCharacteristic;
    }
}
