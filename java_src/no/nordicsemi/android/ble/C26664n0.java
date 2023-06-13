package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import no.nordicsemi.android.ble.AbstractC26684u0;
/* renamed from: no.nordicsemi.android.ble.n0 */
/* loaded from: classes8.dex */
public class C26664n0 extends AbstractC26599A0 {

    /* renamed from: t */
    public final BluetoothDevice f100654t;

    /* renamed from: u */
    public int f100655u;

    /* renamed from: v */
    public int f100656v;

    /* renamed from: w */
    public int f100657w;

    /* renamed from: x */
    public int f100658x;

    /* renamed from: y */
    public boolean f100659y;

    public C26664n0(AbstractC26684u0.EnumC26687c enumC26687c, BluetoothDevice bluetoothDevice) {
        super(enumC26687c);
        this.f100656v = 0;
        this.f100657w = 0;
        this.f100658x = 0;
        this.f100659y = false;
        this.f100654t = bluetoothDevice;
        this.f100655u = 1;
    }

    /* renamed from: L */
    public boolean m22606L() {
        int i = this.f100657w;
        if (i > 0) {
            this.f100657w = i - 1;
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public void m22605M() {
        if (this.f100705o && !this.f100706p) {
            this.f100691a.mo22951d();
        }
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: N */
    public C26664n0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: O */
    public C26664n0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: P */
    public BluetoothDevice m22602P() {
        return this.f100654t;
    }

    /* renamed from: Q */
    public int m22601Q() {
        return this.f100655u;
    }

    /* renamed from: R */
    public int m22600R() {
        return this.f100658x;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: S */
    public C26664n0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: T */
    public boolean m22598T() {
        int i = this.f100656v;
        this.f100656v = i + 1;
        return i == 0;
    }

    /* renamed from: U */
    public C26664n0 m22597U(int i, int i2) {
        this.f100657w = i;
        this.f100658x = i2;
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26599A0
    /* renamed from: V */
    public C26664n0 mo22585J(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26599A0
    /* renamed from: W */
    public C26664n0 mo22584K(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }

    /* renamed from: X */
    public boolean m22594X() {
        return this.f100659y;
    }

    /* renamed from: Y */
    public C26664n0 m22593Y(boolean z) {
        this.f100659y = z;
        return this;
    }
}
