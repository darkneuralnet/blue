package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import no.nordicsemi.android.ble.AbstractC26599A0;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.exception.BluetoothDisabledException;
import no.nordicsemi.android.ble.exception.DeviceDisconnectedException;
import no.nordicsemi.android.ble.exception.InvalidRequestException;
import no.nordicsemi.android.ble.exception.RequestFailedException;
/* renamed from: no.nordicsemi.android.ble.A0 */
/* loaded from: classes8.dex */
public abstract class AbstractC26599A0 extends AbstractC26684u0 {

    /* renamed from: r */
    public Runnable f100536r;

    /* renamed from: s */
    public long f100537s;

    public AbstractC26599A0(AbstractC26684u0.EnumC26687c enumC26687c) {
        super(enumC26687c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m23124p(BluetoothDevice bluetoothDevice) {
        this.f100536r = null;
        if (!this.f100706p) {
            mo22521A(bluetoothDevice, -5);
            this.f100691a.mo22937f(this);
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: A */
    public void mo22521A(BluetoothDevice bluetoothDevice, int i) {
        if (!this.f100706p) {
            this.f100692b.mo22493a(this.f100536r);
            this.f100536r = null;
        }
        super.mo22521A(bluetoothDevice, i);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: B */
    public void mo22520B() {
        if (!this.f100706p) {
            this.f100692b.mo22493a(this.f100536r);
            this.f100536r = null;
        }
        super.mo22520B();
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: C */
    public void mo22519C(final BluetoothDevice bluetoothDevice) {
        if (this.f100537s > 0) {
            Runnable runnable = new Runnable() { // from class: O46
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26599A0.this.m23124p(bluetoothDevice);
                }
            };
            this.f100536r = runnable;
            this.f100692b.mo22491c(runnable, this.f100537s);
        }
        super.mo22519C(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: D */
    public boolean mo22518D(BluetoothDevice bluetoothDevice) {
        if (!this.f100706p) {
            this.f100692b.mo22493a(this.f100536r);
            this.f100536r = null;
        }
        return super.mo22518D(bluetoothDevice);
    }

    /* renamed from: I */
    public final void m23125I() throws RequestFailedException, DeviceDisconnectedException, BluetoothDisabledException, InvalidRequestException, InterruptedException {
        AbstractC26684u0.m22512e();
        InterfaceC52220yT5 interfaceC52220yT5 = this.f100698h;
        InterfaceC32397Dj1 interfaceC32397Dj1 = this.f100699i;
        try {
            this.f100693c.close();
            AbstractC26684u0.C26686b c26686b = new AbstractC26684u0.C26686b();
            mo22462j(c26686b).mo22461l(c26686b).mo22460m(c26686b).mo22507k();
            if (this.f100693c.block(this.f100537s)) {
                if (!c26686b.m22488d()) {
                    int i = c26686b.f100709a;
                    if (i != -1) {
                        if (i != -100) {
                            if (i == -1000000) {
                                throw new InvalidRequestException(this);
                            }
                            throw new RequestFailedException(this, c26686b.f100709a);
                        }
                        throw new BluetoothDisabledException();
                    }
                    throw new DeviceDisconnectedException();
                }
                return;
            }
            throw new InterruptedException();
        } finally {
            this.f100698h = interfaceC52220yT5;
            this.f100699i = interfaceC32397Dj1;
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: J */
    public AbstractC26599A0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: K */
    public AbstractC26599A0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: k */
    public final void mo22507k() {
        super.mo22507k();
    }
}
