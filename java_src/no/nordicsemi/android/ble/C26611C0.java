package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import android.util.Log;
import no.nordicsemi.android.ble.C26611C0;
import no.nordicsemi.android.ble.data.Data;
/* renamed from: no.nordicsemi.android.ble.C0 */
/* loaded from: classes8.dex */
public final class C26611C0 extends AbstractC26635a<QS0> {

    /* renamed from: w */
    public boolean f100582w;

    /* renamed from: T */
    public static /* synthetic */ void m22652T(QS0 qs0, BluetoothDevice bluetoothDevice, Data data) {
        try {
            qs0.mo3746b(bluetoothDevice, data);
        } catch (Throwable th) {
            Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: P */
    public C26611C0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: Q */
    public C26611C0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: R */
    public C26611C0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: S */
    public boolean m22653S() {
        return this.f100582w;
    }

    /* renamed from: U */
    public boolean m22651U(byte[] bArr) {
        return true;
    }

    /* renamed from: V */
    public void m22650V(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final QS0 qs0 = (QS0) this.f100540t;
        if (qs0 == null) {
            this.f100582w = true;
            return;
        }
        this.f100582w = true;
        final Data data = new Data(bArr);
        this.f100692b.mo22492b(new Runnable() { // from class: sw6
            @Override // java.lang.Runnable
            public final void run() {
                C26611C0.m22652T(QS0.this, bluetoothDevice, data);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.AbstractC26599A0
    /* renamed from: W */
    public C26611C0 mo22585J(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26599A0
    /* renamed from: X */
    public C26611C0 mo22584K(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }
}
