package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.AbstractC23442F;
import p000.C35098Ox2;
/* renamed from: fi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41093fi0 extends AbstractC45537nB5<byte[]> {

    /* renamed from: f */
    public final BluetoothGattCharacteristic f80469f;

    /* renamed from: g */
    public final byte[] f80470g;

    public C41093fi0(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, L46 l46, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, c50544ve5, C29202uU.f112440e, l46);
        this.f80469f = bluetoothGattCharacteristic;
        this.f80470g = bArr;
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: d */
    public AbstractC23442F<byte[]> mo2114d(C50544ve5 c50544ve5) {
        return c50544ve5.m8319c().filter(C49643u70.m10852a(this.f80469f.getUuid())).firstOrError().m33157I(C49643u70.m10850c());
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: e */
    public boolean mo2113e(BluetoothGatt bluetoothGatt) {
        this.f80469f.setValue(this.f80470g);
        return bluetoothGatt.writeCharacteristic(this.f80469f);
    }

    @Override // p000.AbstractC45537nB5
    public String toString() {
        return "CharacteristicWriteOperation{" + super.toString() + ", characteristic=" + new C35098Ox2.C6209a(this.f80469f.getUuid(), this.f80470g, true) + CoreConstants.CURLY_RIGHT;
    }
}
