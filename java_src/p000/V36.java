package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import com.polidea.rxandroidble2.internal.BleIllegalOperationException;
/* renamed from: V36 */
/* loaded from: classes6.dex */
public class V36 extends AbstractC48686sW1 {
    public V36(C49279tW1 c49279tW1) {
        super(c49279tW1);
    }

    @Override // p000.AbstractC48686sW1
    /* renamed from: a */
    public BleIllegalOperationException mo14121a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return new BleIllegalOperationException(this.f108895a.m12257a(bluetoothGattCharacteristic, i), bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), i);
    }
}
