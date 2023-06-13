package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import android.util.Log;
import java.util.Arrays;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.C26613D0;
import no.nordicsemi.android.ble.data.Data;
/* renamed from: no.nordicsemi.android.ble.D0 */
/* loaded from: classes8.dex */
public final class C26613D0 extends AbstractC26695y0<SS0> {

    /* renamed from: z */
    public static final InterfaceC37968aT0 f100584z = new C38606bY0();

    /* renamed from: s */
    public InterfaceC37968aT0 f100585s;

    /* renamed from: t */
    public final byte[] f100586t;

    /* renamed from: u */
    public final int f100587u;

    /* renamed from: v */
    public byte[] f100588v;

    /* renamed from: w */
    public byte[] f100589w;

    /* renamed from: x */
    public int f100590x;

    /* renamed from: y */
    public boolean f100591y;

    public C26613D0(AbstractC26684u0.EnumC26687c enumC26687c) {
        this(enumC26687c, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ void m22638R(BluetoothDevice bluetoothDevice, byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m22637S(BluetoothDevice bluetoothDevice) {
        Object obj = this.f100756r;
        if (obj != null) {
            try {
                ((SS0) obj).mo22543a(bluetoothDevice, new Data(this.f100586t));
            } catch (Throwable th) {
                Log.e(AbstractC26684u0.f100690q, "Exception in Value callback", th);
            }
        }
    }

    /* renamed from: K */
    public C26613D0 m22645K(InterfaceC25132kG interfaceC25132kG) {
        super.m22511f(interfaceC25132kG);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: L */
    public C26613D0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        super.mo22462j(interfaceC52220yT5);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: M */
    public C26613D0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        super.mo22461l(interfaceC32397Dj1);
        return this;
    }

    /* renamed from: N */
    public byte[] m22642N(int i) {
        byte[] bArr;
        int i2;
        InterfaceC37968aT0 interfaceC37968aT0 = this.f100585s;
        if (interfaceC37968aT0 != null && (bArr = this.f100586t) != null) {
            if (this.f100587u != 4) {
                i2 = i - 3;
            } else {
                i2 = i - 12;
            }
            byte[] bArr2 = this.f100589w;
            if (bArr2 == null) {
                bArr2 = interfaceC37968aT0.mo64381a(bArr, this.f100590x, i2);
            }
            if (bArr2 != null) {
                this.f100589w = this.f100585s.mo64381a(this.f100586t, this.f100590x + 1, i2);
            }
            if (this.f100589w == null) {
                this.f100591y = true;
            }
            this.f100588v = bArr2;
            if (bArr2 == null) {
                return new byte[0];
            }
            return bArr2;
        }
        this.f100591y = true;
        byte[] bArr3 = this.f100586t;
        this.f100588v = bArr3;
        if (bArr3 == null) {
            return new byte[0];
        }
        return bArr3;
    }

    /* renamed from: O */
    public int m22641O() {
        return this.f100587u;
    }

    /* renamed from: P */
    public boolean m22640P() {
        return !this.f100591y;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: Q */
    public C26613D0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        super.mo22460m(interfaceC43123j72);
        return this;
    }

    /* renamed from: T */
    public boolean m22636T(final BluetoothDevice bluetoothDevice, final byte[] bArr) {
        this.f100692b.mo22492b(new Runnable() { // from class: lH6
            @Override // java.lang.Runnable
            public final void run() {
                C26613D0.this.m22638R(bluetoothDevice, bArr);
            }
        });
        this.f100590x++;
        if (this.f100591y) {
            this.f100692b.mo22492b(new Runnable() { // from class: mH6
                @Override // java.lang.Runnable
                public final void run() {
                    C26613D0.this.m22637S(bluetoothDevice);
                }
            });
        }
        return Arrays.equals(bArr, this.f100588v);
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: U */
    public C26613D0 mo22470F(Handler handler) {
        super.mo22470F(handler);
        return this;
    }

    @Override // no.nordicsemi.android.ble.AbstractC26684u0
    /* renamed from: V */
    public C26613D0 mo22469G(QI4 qi4) {
        super.mo22469G(qi4);
        return this;
    }

    /* renamed from: W */
    public C26613D0 m22633W() {
        this.f100585s = f100584z;
        return this;
    }

    /* renamed from: X */
    public C26613D0 m22632X(SS0 ss0) {
        super.m22471H(ss0);
        return this;
    }

    public C26613D0(AbstractC26684u0.EnumC26687c enumC26687c, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(enumC26687c, bluetoothGattCharacteristic);
        this.f100590x = 0;
        this.f100586t = null;
        this.f100587u = 0;
        this.f100591y = true;
    }

    public C26613D0(AbstractC26684u0.EnumC26687c enumC26687c, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i, int i2, int i3) {
        super(enumC26687c, bluetoothGattCharacteristic);
        this.f100590x = 0;
        this.f100591y = false;
        this.f100586t = S70.m85979a(bArr, i, i2);
        this.f100587u = i3;
    }
}
