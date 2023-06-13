package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.C26670q0;
/* renamed from: no.nordicsemi.android.ble.q0 */
/* loaded from: classes8.dex */
public final class C26670q0 extends AbstractC26695y0<InterfaceC45723nW2> {

    /* renamed from: s */
    public final int f100666s;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public /* synthetic */ void m22573N(BluetoothDevice bluetoothDevice, int i) {
        Object obj = this.f100756r;
        if (obj != null) {
            try {
                ((InterfaceC45723nW2) obj).mo22553a(bluetoothDevice, i);
            } catch (Throwable th) {
                Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
            }
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: J */
    public C26670q0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26670q0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: L */
    public int m22575L() {
        return this.f100666s;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: M */
    public C26670q0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: O */
    public void m22572O(final BluetoothDevice bluetoothDevice, final int i) {
        this.f100692b.mo22492b(new Runnable() { // from class: pW2
            @Override // java.lang.Runnable
            public final void run() {
                C26670q0.this.m22573N(bluetoothDevice, i);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: P */
    public C26670q0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: Q */
    public C26670q0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
