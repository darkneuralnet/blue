package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.C26682t0;
/* renamed from: no.nordicsemi.android.ble.t0 */
/* loaded from: classes8.dex */
public final class C26682t0 extends AbstractC26695y0<InterfaceC39252cd5> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ void m22525M(BluetoothDevice bluetoothDevice, int i) {
        Object obj = this.f100756r;
        if (obj != null) {
            try {
                ((InterfaceC39252cd5) obj).mo22546a(bluetoothDevice, i);
            } catch (Throwable th) {
                Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
            }
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: J */
    public C26682t0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26682t0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: L */
    public C26682t0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: N */
    public void m22524N(final BluetoothDevice bluetoothDevice, final int i) {
        this.f100692b.mo22492b(new Runnable() { // from class: Ur4
            @Override // java.lang.Runnable
            public final void run() {
                C26682t0.this.m22525M(bluetoothDevice, i);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: O */
    public C26682t0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: P */
    public C26682t0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
