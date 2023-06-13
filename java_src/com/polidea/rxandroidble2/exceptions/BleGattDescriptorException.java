package com.polidea.rxandroidble2.exceptions;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;
/* loaded from: classes6.dex */
public class BleGattDescriptorException extends BleGattException {

    /* renamed from: e */
    public final BluetoothGattDescriptor f75010e;

    public BleGattDescriptorException(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i, C29202uU c29202uU) {
        super(bluetoothGatt, i, c29202uU);
        this.f75010e = bluetoothGattDescriptor;
    }
}
