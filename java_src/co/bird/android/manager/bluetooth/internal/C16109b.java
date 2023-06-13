package co.bird.android.manager.bluetooth.internal;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import androidx.recyclerview.widget.C11925l;
import co.bird.android.model.Command;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a(\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u0014\u0010\r\u001a\u00020\f*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000¨\u0006\u000e"}, m28432d2 = {"Landroid/bluetooth/BluetoothGatt;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "", "b", "Lco/bird/android/model/Command;", "command", "", MessageExtension.FIELD_DATA, "c", "Landroid/bluetooth/BluetoothGattService;", "service", "", C17296a.f69688o, "bluetooth_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: co.bird.android.manager.bluetooth.internal.b */
/* loaded from: classes4.dex */
public final class C16109b {
    /* renamed from: a */
    public static final void m55823a(BluetoothGatt bluetoothGatt, BluetoothGattService service) {
        boolean z;
        Intrinsics.checkNotNullParameter(bluetoothGatt, "<this>");
        Intrinsics.checkNotNullParameter(service, "service");
        for (BluetoothGattCharacteristic characteristic : service.getCharacteristics()) {
            if ((characteristic.getProperties() & 16) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bluetoothGatt.setCharacteristicNotification(characteristic, true);
                C3157HY.m103788b(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
                Intrinsics.checkNotNullExpressionValue(characteristic, "characteristic");
                C41318g46.m40151m("onDiscovered enabled: " + m55822b(bluetoothGatt, characteristic), new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public static final boolean m55822b(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic characteristic) {
        boolean writeDescriptor;
        Intrinsics.checkNotNullParameter(bluetoothGatt, "<this>");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(C16112d.f66283o.m55746a());
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        int i = 0;
        do {
            writeDescriptor = bluetoothGatt.writeDescriptor(descriptor);
            i++;
            C3157HY.m103788b(C11925l.AbstractC11930e.DEFAULT_DRAG_ANIMATION_DURATION);
            if (writeDescriptor) {
                break;
            }
        } while (i < 5);
        return writeDescriptor;
    }

    /* renamed from: c */
    public static final boolean m55821c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic characteristic, Command command, byte[] bArr) {
        Intrinsics.checkNotNullParameter(bluetoothGatt, "<this>");
        Intrinsics.checkNotNullParameter(characteristic, "characteristic");
        Intrinsics.checkNotNullParameter(command, "command");
        characteristic.setValue(C3157HY.m103789a(command.getData(), bArr));
        characteristic.setWriteType(2);
        return bluetoothGatt.writeCharacteristic(characteristic);
    }

    public static /* synthetic */ boolean write$default(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Command command, byte[] bArr, int i, Object obj) {
        if ((i & 4) != 0) {
            bArr = null;
        }
        return m55821c(bluetoothGatt, bluetoothGattCharacteristic, command, bArr);
    }
}
