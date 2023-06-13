package p000;

import android.bluetooth.BluetoothGatt;
import ch.qos.logback.core.CoreConstants;
import io.reactivex.AbstractC23442F;
/* renamed from: Sr4  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C35982Sr4 extends AbstractC45537nB5<Integer> {
    public C35982Sr4(C50544ve5 c50544ve5, BluetoothGatt bluetoothGatt, L46 l46) {
        super(bluetoothGatt, c50544ve5, C29202uU.f112446k, l46);
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: d */
    public AbstractC23442F<Integer> mo2114d(C50544ve5 c50544ve5) {
        return c50544ve5.m8315g().firstOrError();
    }

    @Override // p000.AbstractC45537nB5
    /* renamed from: e */
    public boolean mo2113e(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readRemoteRssi();
    }

    @Override // p000.AbstractC45537nB5
    public String toString() {
        return "ReadRssiOperation{" + super.toString() + CoreConstants.CURLY_RIGHT;
    }
}
