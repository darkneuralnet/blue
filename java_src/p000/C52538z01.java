package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.AbstractC23442F;
import p000.C35098Ox2;
/* renamed from: z01  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C52538z01 extends AbstractC45537nB5<byte[]> {

    /* renamed from: f */
    public final BluetoothGattDescriptor f120515f;

    /* renamed from: g */
    public final byte[] f120516g;

    /* renamed from: h */
    public final int f120517h;

    public C52538z01(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, L46 l46, int i, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, c50544ve5, C29202uU.f112444i, l46);
        this.f120517h = i;
        this.f120515f = bluetoothGattDescriptor;
        this.f120516g = bArr;
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: d */
    public AbstractC23442F<byte[]> mo2114d(C50544ve5 c50544ve5) {
        return c50544ve5.m8317e().filter(C49643u70.m10851b(this.f120515f)).firstOrError().m33157I(C49643u70.m10850c());
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: e */
    public boolean mo2113e(BluetoothGatt bluetoothGatt) {
        this.f120515f.setValue(this.f120516g);
        BluetoothGattCharacteristic characteristic = this.f120515f.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(this.f120517h);
        boolean writeDescriptor = bluetoothGatt.writeDescriptor(this.f120515f);
        characteristic.setWriteType(writeType);
        return writeDescriptor;
    }

    @Override // p000.AbstractC45537nB5
    public String toString() {
        return "DescriptorWriteOperation{" + super.toString() + ", descriptor=" + new C35098Ox2.C6209a(this.f120515f.getUuid(), this.f120516g, true) + CoreConstants.CURLY_RIGHT;
    }
}
