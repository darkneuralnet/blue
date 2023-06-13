package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.C26672r0;
/* renamed from: no.nordicsemi.android.ble.r0 */
/* loaded from: classes8.dex */
public final class C26672r0 extends AbstractC26695y0<InterfaceC46281oS3> {

    /* renamed from: s */
    public final int f100668s;

    /* renamed from: t */
    public final int f100669t;

    /* renamed from: u */
    public final int f100670u;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m22561Q(BluetoothDevice bluetoothDevice) {
        Object obj = this.f100756r;
        if (obj != null) {
            try {
                ((InterfaceC46281oS3) obj).mo21044a(bluetoothDevice, 1, 1);
            } catch (Throwable th) {
                Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m22560R(BluetoothDevice bluetoothDevice, int i, int i2) {
        Object obj = this.f100756r;
        if (obj != null) {
            try {
                ((InterfaceC46281oS3) obj).mo21044a(bluetoothDevice, i, i2);
            } catch (Throwable th) {
                Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
            }
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26672r0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: L */
    public C26672r0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: M */
    public int m22565M() {
        return this.f100670u;
    }

    /* renamed from: N */
    public int m22564N() {
        return this.f100669t;
    }

    /* renamed from: O */
    public int m22563O() {
        return this.f100668s;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: P */
    public C26672r0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: S */
    public void m22559S(final BluetoothDevice bluetoothDevice) {
        this.f100692b.mo22492b(new Runnable() { // from class: qS3
            @Override // java.lang.Runnable
            public final void run() {
                C26672r0.this.m22561Q(bluetoothDevice);
            }
        });
    }

    /* renamed from: T */
    public void m22558T(final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        this.f100692b.mo22492b(new Runnable() { // from class: pS3
            @Override // java.lang.Runnable
            public final void run() {
                C26672r0.this.m22560R(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: U */
    public C26672r0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: V */
    public C26672r0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
