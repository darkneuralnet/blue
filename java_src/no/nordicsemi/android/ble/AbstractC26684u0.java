package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import no.nordicsemi.android.ble.AbstractC26684u0;
/* renamed from: no.nordicsemi.android.ble.u0 */
/* loaded from: classes8.dex */
public abstract class AbstractC26684u0 {

    /* renamed from: q */
    public static final String f100690q = "u0";

    /* renamed from: a */
    public QI4 f100691a;

    /* renamed from: b */
    public L80 f100692b;

    /* renamed from: c */
    public final ConditionVariable f100693c;

    /* renamed from: d */
    public final EnumC26687c f100694d;

    /* renamed from: e */
    public final BluetoothGattCharacteristic f100695e;

    /* renamed from: f */
    public final BluetoothGattDescriptor f100696f;

    /* renamed from: g */
    public InterfaceC25132kG f100697g;

    /* renamed from: h */
    public InterfaceC52220yT5 f100698h;

    /* renamed from: i */
    public InterfaceC32397Dj1 f100699i;

    /* renamed from: j */
    public InterfaceC43123j72 f100700j;

    /* renamed from: k */
    public InterfaceC25132kG f100701k;

    /* renamed from: l */
    public InterfaceC52220yT5 f100702l;

    /* renamed from: m */
    public InterfaceC32397Dj1 f100703m;

    /* renamed from: n */
    public boolean f100704n;

    /* renamed from: o */
    public boolean f100705o;

    /* renamed from: p */
    public boolean f100706p;

    /* renamed from: no.nordicsemi.android.ble.u0$a */
    /* loaded from: classes8.dex */
    public class C26685a implements L80 {

        /* renamed from: a */
        public final /* synthetic */ Handler f100707a;

        public C26685a(Handler handler) {
            this.f100707a = handler;
        }

        @Override // p000.L80
        /* renamed from: a */
        public void mo22493a(Runnable runnable) {
            Handler handler = this.f100707a;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            } else {
                AbstractC26684u0.this.f100691a.mo22493a(runnable);
            }
        }

        @Override // p000.L80
        /* renamed from: b */
        public void mo22492b(Runnable runnable) {
            Handler handler = this.f100707a;
            if (handler != null) {
                handler.post(runnable);
            } else {
                runnable.run();
            }
        }

        @Override // p000.L80
        /* renamed from: c */
        public void mo22491c(Runnable runnable, long j) {
            Handler handler = this.f100707a;
            if (handler != null) {
                handler.postDelayed(runnable, j);
            } else {
                AbstractC26684u0.this.f100691a.mo22491c(runnable, j);
            }
        }
    }

    /* renamed from: no.nordicsemi.android.ble.u0$b */
    /* loaded from: classes8.dex */
    public final class C26686b implements InterfaceC52220yT5, InterfaceC32397Dj1, InterfaceC43123j72 {

        /* renamed from: a */
        public int f100709a = 0;

        public C26686b() {
        }

        @Override // p000.InterfaceC32397Dj1
        /* renamed from: a */
        public void mo22490a(BluetoothDevice bluetoothDevice, int i) {
            this.f100709a = i;
            AbstractC26684u0.this.f100693c.open();
        }

        @Override // p000.InterfaceC43123j72
        /* renamed from: b */
        public void mo22489b() {
            this.f100709a = -1000000;
            AbstractC26684u0.this.f100693c.open();
        }

        @Override // p000.InterfaceC52220yT5
        /* renamed from: c */
        public void mo3469c(BluetoothDevice bluetoothDevice) {
            AbstractC26684u0.this.f100693c.open();
        }

        /* renamed from: d */
        public boolean m22488d() {
            return this.f100709a == 0;
        }
    }

    /* renamed from: no.nordicsemi.android.ble.u0$c */
    /* loaded from: classes8.dex */
    public enum EnumC26687c {
        SET,
        CONNECT,
        DISCONNECT,
        CREATE_BOND,
        ENSURE_BOND,
        REMOVE_BOND,
        WRITE,
        NOTIFY,
        INDICATE,
        READ,
        WRITE_DESCRIPTOR,
        READ_DESCRIPTOR,
        BEGIN_RELIABLE_WRITE,
        EXECUTE_RELIABLE_WRITE,
        ABORT_RELIABLE_WRITE,
        ENABLE_NOTIFICATIONS,
        ENABLE_INDICATIONS,
        DISABLE_NOTIFICATIONS,
        DISABLE_INDICATIONS,
        WAIT_FOR_NOTIFICATION,
        WAIT_FOR_INDICATION,
        WAIT_FOR_READ,
        WAIT_FOR_WRITE,
        WAIT_FOR_CONDITION,
        SET_VALUE,
        SET_DESCRIPTOR_VALUE,
        READ_BATTERY_LEVEL,
        ENABLE_BATTERY_LEVEL_NOTIFICATIONS,
        DISABLE_BATTERY_LEVEL_NOTIFICATIONS,
        ENABLE_SERVICE_CHANGED_INDICATIONS,
        REQUEST_MTU,
        REQUEST_CONNECTION_PRIORITY,
        SET_PREFERRED_PHY,
        READ_PHY,
        READ_RSSI,
        REFRESH_CACHE,
        SLEEP
    }

    public AbstractC26684u0(EnumC26687c enumC26687c) {
        this.f100694d = enumC26687c;
        this.f100695e = null;
        this.f100696f = null;
        this.f100693c = new ConditionVariable(true);
    }

    @Deprecated
    /* renamed from: E */
    public static C26693x0 m22517E() {
        return new C26693x0(EnumC26687c.REMOVE_BOND);
    }

    /* renamed from: e */
    public static void m22512e() throws IllegalStateException {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Cannot execute synchronous operation from the UI thread.");
    }

    /* renamed from: g */
    public static C26664n0 m22510g(BluetoothDevice bluetoothDevice) {
        return new C26664n0(EnumC26687c.CONNECT, bluetoothDevice);
    }

    @Deprecated
    /* renamed from: h */
    public static C26693x0 m22509h() {
        return new C26693x0(EnumC26687c.CREATE_BOND);
    }

    /* renamed from: i */
    public static C26668p0 m22508i() {
        return new C26668p0(EnumC26687c.DISCONNECT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m22506n(BluetoothDevice bluetoothDevice, int i) {
        InterfaceC32397Dj1 interfaceC32397Dj1 = this.f100699i;
        if (interfaceC32397Dj1 != null) {
            try {
                interfaceC32397Dj1.mo22490a(bluetoothDevice, i);
            } catch (Throwable th) {
                Log.e(f100690q, "Exception in Fail callback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void m22505o() {
        InterfaceC43123j72 interfaceC43123j72 = this.f100700j;
        if (interfaceC43123j72 != null) {
            try {
                interfaceC43123j72.mo22489b();
            } catch (Throwable th) {
                Log.e(f100690q, "Exception in Invalid Request callback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m22504p(BluetoothDevice bluetoothDevice) {
        InterfaceC25132kG interfaceC25132kG = this.f100697g;
        if (interfaceC25132kG != null) {
            try {
                interfaceC25132kG.mo8611a(bluetoothDevice);
            } catch (Throwable th) {
                Log.e(f100690q, "Exception in Before callback", th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m22503q(BluetoothDevice bluetoothDevice) {
        InterfaceC52220yT5 interfaceC52220yT5 = this.f100698h;
        if (interfaceC52220yT5 != null) {
            try {
                interfaceC52220yT5.mo3469c(bluetoothDevice);
            } catch (Throwable th) {
                Log.e(f100690q, "Exception in Success callback", th);
            }
        }
    }

    /* renamed from: r */
    public static C26693x0 m22502r() {
        return new C26693x0(EnumC26687c.ABORT_RELIABLE_WRITE);
    }

    /* renamed from: s */
    public static C26693x0 m22501s() {
        return new C26693x0(EnumC26687c.BEGIN_RELIABLE_WRITE);
    }

    @Deprecated
    /* renamed from: t */
    public static C26613D0 m22500t() {
        return new C26613D0(EnumC26687c.ENABLE_BATTERY_LEVEL_NOTIFICATIONS);
    }

    @Deprecated
    /* renamed from: u */
    public static C26613D0 m22499u(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new C26613D0(EnumC26687c.ENABLE_NOTIFICATIONS, bluetoothGattCharacteristic);
    }

    /* renamed from: v */
    public static C26613D0 m22498v() {
        return new C26613D0(EnumC26687c.ENABLE_SERVICE_CHANGED_INDICATIONS);
    }

    /* renamed from: w */
    public static C26693x0 m22497w() {
        return new C26693x0(EnumC26687c.EXECUTE_RELIABLE_WRITE);
    }

    @Deprecated
    /* renamed from: x */
    public static C26680s0 m22496x() {
        return new C26680s0(EnumC26687c.READ_BATTERY_LEVEL);
    }

    @Deprecated
    /* renamed from: y */
    public static C26613D0 m22495y(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        int i;
        int i2;
        EnumC26687c enumC26687c = EnumC26687c.WRITE;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i3 = i;
        if (bluetoothGattCharacteristic != null) {
            i2 = bluetoothGattCharacteristic.getWriteType();
        } else {
            i2 = 2;
        }
        return new C26613D0(enumC26687c, bluetoothGattCharacteristic, bArr, 0, i3, i2);
    }

    @Deprecated
    /* renamed from: z */
    public static C26613D0 m22494z(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        int i2;
        EnumC26687c enumC26687c = EnumC26687c.WRITE;
        if (bArr != null) {
            i2 = bArr.length;
        } else {
            i2 = 0;
        }
        return new C26613D0(enumC26687c, bluetoothGattCharacteristic, bArr, 0, i2, i);
    }

    /* renamed from: A */
    public void mo22521A(final BluetoothDevice bluetoothDevice, final int i) {
        if (!this.f100706p) {
            this.f100706p = true;
            InterfaceC32397Dj1 interfaceC32397Dj1 = this.f100703m;
            if (interfaceC32397Dj1 != null) {
                interfaceC32397Dj1.mo22490a(bluetoothDevice, i);
            }
            this.f100692b.mo22492b(new Runnable() { // from class: iI4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26684u0.this.m22506n(bluetoothDevice, i);
                }
            });
        }
    }

    /* renamed from: B */
    public void mo22520B() {
        if (!this.f100706p) {
            this.f100706p = true;
            this.f100692b.mo22492b(new Runnable() { // from class: lI4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26684u0.this.m22505o();
                }
            });
        }
    }

    /* renamed from: C */
    public void mo22519C(final BluetoothDevice bluetoothDevice) {
        if (!this.f100705o) {
            this.f100705o = true;
            InterfaceC25132kG interfaceC25132kG = this.f100701k;
            if (interfaceC25132kG != null) {
                interfaceC25132kG.mo8611a(bluetoothDevice);
            }
            this.f100692b.mo22492b(new Runnable() { // from class: kI4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26684u0.this.m22504p(bluetoothDevice);
                }
            });
        }
    }

    /* renamed from: D */
    public boolean mo22518D(final BluetoothDevice bluetoothDevice) {
        if (!this.f100706p) {
            this.f100706p = true;
            InterfaceC52220yT5 interfaceC52220yT5 = this.f100702l;
            if (interfaceC52220yT5 != null) {
                interfaceC52220yT5.mo3469c(bluetoothDevice);
            }
            this.f100692b.mo22492b(new Runnable() { // from class: jI4
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC26684u0.this.m22503q(bluetoothDevice);
                }
            });
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public AbstractC26684u0 mo22470F(Handler handler) {
        this.f100692b = new C26685a(handler);
        return this;
    }

    /* renamed from: G */
    public AbstractC26684u0 mo22469G(QI4 qi4) {
        this.f100691a = qi4;
        if (this.f100692b == null) {
            this.f100692b = qi4;
        }
        return this;
    }

    /* renamed from: f */
    public AbstractC26684u0 m22511f(InterfaceC25132kG interfaceC25132kG) {
        this.f100697g = interfaceC25132kG;
        return this;
    }

    /* renamed from: j */
    public AbstractC26684u0 mo22462j(InterfaceC52220yT5 interfaceC52220yT5) {
        this.f100698h = interfaceC52220yT5;
        return this;
    }

    /* renamed from: k */
    public void mo22507k() {
        this.f100691a.mo22944e(this);
    }

    /* renamed from: l */
    public AbstractC26684u0 mo22461l(InterfaceC32397Dj1 interfaceC32397Dj1) {
        this.f100699i = interfaceC32397Dj1;
        return this;
    }

    /* renamed from: m */
    public AbstractC26684u0 mo22460m(InterfaceC43123j72 interfaceC43123j72) {
        this.f100700j = interfaceC43123j72;
        return this;
    }

    public AbstractC26684u0(EnumC26687c enumC26687c, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.f100694d = enumC26687c;
        this.f100695e = bluetoothGattCharacteristic;
        this.f100696f = null;
        this.f100693c = new ConditionVariable(true);
    }
}
