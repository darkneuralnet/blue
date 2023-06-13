package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothGattCharacteristic;
import no.nordicsemi.android.ble.AbstractC26684u0;
/* renamed from: no.nordicsemi.android.ble.y0 */
/* loaded from: classes8.dex */
public abstract class AbstractC26695y0<T> extends C26693x0 {

    /* renamed from: r */
    public T f100756r;

    public AbstractC26695y0(AbstractC26684u0.EnumC26687c enumC26687c) {
        super(enumC26687c);
    }

    /* renamed from: H */
    public AbstractC26695y0<T> m22471H(T t) {
        this.f100756r = t;
        return this;
    }

    public AbstractC26695y0(AbstractC26684u0.EnumC26687c enumC26687c, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(enumC26687c, bluetoothGattCharacteristic);
    }
}
