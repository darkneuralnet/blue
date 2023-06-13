package com.polidea.rxandroidble2.exceptions;

import android.bluetooth.BluetoothGattCharacteristic;
/* loaded from: classes6.dex */
public class BleCannotSetCharacteristicNotificationException extends BleException {

    /* renamed from: b */
    public final BluetoothGattCharacteristic f75002b;

    /* renamed from: c */
    public final int f75003c;

    public BleCannotSetCharacteristicNotificationException(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, Throwable th) {
        super(m45874a(bluetoothGattCharacteristic, i), th);
        this.f75002b = bluetoothGattCharacteristic;
        this.f75003c = i;
    }

    /* renamed from: a */
    public static String m45874a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return m45873b(i) + " (code " + i + ") with characteristic UUID " + bluetoothGattCharacteristic.getUuid();
    }

    /* renamed from: b */
    public static String m45873b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "Unknown error" : "Cannot write client characteristic config descriptor" : "Cannot find client characteristic config descriptor" : "Cannot set local notification";
    }
}
