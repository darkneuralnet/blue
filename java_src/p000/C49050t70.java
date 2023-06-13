package p000;

import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import java.util.Arrays;
import java.util.UUID;
/* renamed from: t70  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C49050t70<T> {

    /* renamed from: a */
    public final T f109886a;

    /* renamed from: b */
    public final byte[] f109887b;

    public C49050t70(T t, byte[] bArr) {
        this.f109886a = t;
        this.f109887b = bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C49050t70)) {
            return false;
        }
        C49050t70 c49050t70 = (C49050t70) obj;
        if (!Arrays.equals(c49050t70.f109887b, this.f109887b) || !c49050t70.f109886a.equals(this.f109886a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f109886a.hashCode() ^ Arrays.hashCode(this.f109887b);
    }

    public String toString() {
        String simpleName;
        T t = this.f109886a;
        if (t instanceof BluetoothGattCharacteristic) {
            simpleName = BluetoothGattCharacteristic.class.getSimpleName() + "(" + ((BluetoothGattCharacteristic) this.f109886a).getUuid().toString() + ")";
        } else if (t instanceof BluetoothGattDescriptor) {
            simpleName = BluetoothGattDescriptor.class.getSimpleName() + "(" + ((BluetoothGattDescriptor) this.f109886a).getUuid().toString() + ")";
        } else if (t instanceof UUID) {
            simpleName = UUID.class.getSimpleName() + "(" + this.f109886a.toString() + ")";
        } else {
            simpleName = t.getClass().getSimpleName();
        }
        return getClass().getSimpleName() + "[first=" + simpleName + ", second=" + Arrays.toString(this.f109887b) + "]";
    }
}
