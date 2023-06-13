package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.C26680s0;
import no.nordicsemi.android.ble.data.Data;
/* renamed from: no.nordicsemi.android.ble.s0 */
/* loaded from: classes8.dex */
public final class C26680s0 extends AbstractC26695y0<QS0> {

    /* renamed from: s */
    public int f100688s;

    /* renamed from: t */
    public boolean f100689t;

    public C26680s0(AbstractC26684u0.EnumC26687c enumC26687c) {
        super(enumC26687c);
        this.f100688s = 0;
        this.f100689t = false;
    }

    /* renamed from: N */
    public static /* synthetic */ void m22535N(QS0 qs0, BluetoothDevice bluetoothDevice, Data data) {
        try {
            qs0.mo3746b(bluetoothDevice, data);
        } catch (Throwable th) {
            Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: J */
    public C26680s0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public C26680s0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: L */
    public boolean m22537L() {
        return !this.f100689t;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: M */
    public C26680s0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: O */
    public boolean m22534O(byte[] bArr) {
        return true;
    }

    /* renamed from: P */
    public void m22533P(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final QS0 qs0 = (QS0) this.f100756r;
        if (qs0 == null) {
            this.f100689t = true;
            return;
        }
        this.f100689t = true;
        final Data data = new Data(bArr);
        this.f100692b.mo22492b(new Runnable() { // from class: Rr4
            @Override // java.lang.Runnable
            public final void run() {
                C26680s0.m22535N(QS0.this, bluetoothDevice, data);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: Q */
    public C26680s0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: R */
    public C26680s0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }

    /* renamed from: S */
    public C26680s0 m22530S(QS0 qs0) {
        super.m22471H(qs0);
        return this;
    }
}
