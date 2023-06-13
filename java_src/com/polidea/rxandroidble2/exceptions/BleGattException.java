package com.polidea.rxandroidble2.exceptions;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
/* loaded from: classes6.dex */
public class BleGattException extends BleException {

    /* renamed from: b */
    public final BluetoothGatt f75011b;

    /* renamed from: c */
    public final int f75012c;

    /* renamed from: d */
    public final C29202uU f75013d;

    public BleGattException(BluetoothGatt bluetoothGatt, int i, C29202uU c29202uU) {
        super(m45870a(bluetoothGatt, i, c29202uU));
        this.f75011b = bluetoothGatt;
        this.f75012c = i;
        this.f75013d = c29202uU;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: a */
    public static String m45870a(BluetoothGatt bluetoothGatt, int i, C29202uU c29202uU) {
        if (i == -1) {
            return String.format("GATT exception from MAC address %s, with type %s", m45868c(bluetoothGatt), c29202uU);
        }
        return String.format("GATT exception from %s, status %d (%s), type %s. (Look up status 0x%02x here %s)", C35098Ox2.m91173c(bluetoothGatt), Integer.valueOf(i), YA1.m75477a(i), c29202uU, Integer.valueOf(i), "https://cs.android.com/android/platform/superproject/+/master:packages/modules/Bluetooth/system/stack/include/gatt_api.h");
    }

    /* renamed from: c */
    public static String m45868c(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null || bluetoothGatt.getDevice() == null) {
            return null;
        }
        return bluetoothGatt.getDevice().getAddress();
    }

    /* renamed from: b */
    public C29202uU m45869b() {
        return this.f75013d;
    }

    public BleGattException(BluetoothGatt bluetoothGatt, C29202uU c29202uU) {
        this(bluetoothGatt, -1, c29202uU);
    }
}
