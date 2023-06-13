package p000;

import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException;
import com.polidea.rxandroidble2.exceptions.BleGattCannotStartException;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC24578y;
import java.util.concurrent.TimeUnit;
/* renamed from: nB5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC45537nB5<T> extends AbstractC38658bd4<T> {

    /* renamed from: b */
    public final BluetoothGatt f99570b;

    /* renamed from: c */
    public final C50544ve5 f99571c;

    /* renamed from: d */
    public final C29202uU f99572d;

    /* renamed from: e */
    public final L46 f99573e;

    public AbstractC45537nB5(BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, C29202uU c29202uU, L46 l46) {
        this.f99570b = bluetoothGatt;
        this.f99571c = c50544ve5;
        this.f99572d = c29202uU;
        this.f99573e = l46;
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: b */
    public final void mo14813b(InterfaceC24578y<T> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
        C40454ed4 c40454ed4 = new C40454ed4(interfaceC24578y, interfaceC39862dd4);
        AbstractC23442F<T> mo2114d = mo2114d(this.f99571c);
        L46 l46 = this.f99573e;
        long j = l46.f20724a;
        TimeUnit timeUnit = l46.f20725b;
        AbstractC23437E abstractC23437E = l46.f20726c;
        mo2114d.m33137c0(j, timeUnit, abstractC23437E, mo24209f(this.f99570b, this.f99571c, abstractC23437E)).m33123k0().subscribe(c40454ed4);
        if (!mo2113e(this.f99570b)) {
            c40454ed4.cancel();
            c40454ed4.onError(new BleGattCannotStartException(this.f99570b, this.f99572d));
        }
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: c */
    public BleException mo14812c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f99570b.getDevice().getAddress(), -1);
    }

    /* renamed from: d */
    public abstract AbstractC23442F<T> mo2114d(C50544ve5 c50544ve5);

    /* renamed from: e */
    public abstract boolean mo2113e(BluetoothGatt bluetoothGatt);

    /* renamed from: f */
    public AbstractC23442F<T> mo24209f(BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, AbstractC23437E abstractC23437E) {
        return AbstractC23442F.m33100x(new BleGattCallbackTimeoutException(this.f99570b, this.f99572d));
    }

    public String toString() {
        return C35098Ox2.m91173c(this.f99570b);
    }
}
