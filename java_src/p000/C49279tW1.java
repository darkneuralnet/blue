package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import java.util.Locale;
/* renamed from: tW1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49279tW1 {

    /* renamed from: a */
    public final C40500ei0 f110575a;

    public C49279tW1(C40500ei0 c40500ei0) {
        this.f110575a = c40500ei0;
    }

    /* renamed from: a */
    public String m12257a(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return String.format(Locale.getDefault(), "Characteristic %s supports properties: %s (%d) does not have any property matching %s (%d)", C35098Ox2.m91169g(bluetoothGattCharacteristic.getUuid()), this.f110575a.m42613c(bluetoothGattCharacteristic.getProperties()), Integer.valueOf(bluetoothGattCharacteristic.getProperties()), this.f110575a.m42613c(i), Integer.valueOf(i));
    }
}
