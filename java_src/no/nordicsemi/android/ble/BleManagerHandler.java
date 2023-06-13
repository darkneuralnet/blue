package no.nordicsemi.android.ble;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Keep;
import java.lang.reflect.Method;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.BleManagerHandler;
import no.nordicsemi.android.ble.C26664n0;
import no.nordicsemi.android.ble.C26697z0;
import no.nordicsemi.android.ble.data.Data;
@SuppressLint({"MissingPermission"})
/* loaded from: classes8.dex */
public abstract class BleManagerHandler extends QI4 {

    /* renamed from: A */
    public Map<BluetoothGattDescriptor, byte[]> f100541A;

    /* renamed from: B */
    public C26664n0 f100542B;

    /* renamed from: C */
    public AbstractC26684u0 f100543C;

    /* renamed from: D */
    public C26689v0 f100544D;

    /* renamed from: F */
    public InterfaceC50147uy0 f100546F;
    @Deprecated

    /* renamed from: G */
    public C32636Ej6 f100547G;

    /* renamed from: H */
    public AbstractC26635a<?> f100548H;

    /* renamed from: b */
    public BluetoothDevice f100553b;

    /* renamed from: c */
    public BluetoothGatt f100554c;

    /* renamed from: d */
    public AbstractC30179xU f100555d;

    /* renamed from: e */
    public Handler f100556e;

    /* renamed from: g */
    public Deque<AbstractC26684u0> f100558g;

    /* renamed from: h */
    public boolean f100559h;

    /* renamed from: i */
    public boolean f100560i;

    /* renamed from: j */
    public boolean f100561j;

    /* renamed from: k */
    public long f100562k;

    /* renamed from: m */
    public boolean f100564m;

    /* renamed from: n */
    public boolean f100565n;

    /* renamed from: o */
    public boolean f100566o;

    /* renamed from: p */
    public boolean f100567p;

    /* renamed from: q */
    public boolean f100568q;

    /* renamed from: t */
    public boolean f100571t;

    /* renamed from: v */
    public int f100573v;

    /* renamed from: w */
    public int f100574w;

    /* renamed from: x */
    public int f100575x;

    /* renamed from: z */
    public Map<BluetoothGattCharacteristic, byte[]> f100577z;

    /* renamed from: a */
    public final Object f100552a = new Object();

    /* renamed from: f */
    public final Deque<AbstractC26684u0> f100557f = new LinkedBlockingDeque();

    /* renamed from: l */
    public int f100563l = 0;

    /* renamed from: r */
    public int f100569r = 0;

    /* renamed from: s */
    public boolean f100570s = false;

    /* renamed from: u */
    public int f100572u = 23;
    @Deprecated

    /* renamed from: y */
    public int f100576y = -1;

    /* renamed from: E */
    public final HashMap<Object, C32636Ej6> f100545E = new HashMap<>();

    /* renamed from: I */
    public final BroadcastReceiver f100549I = new C26603a();

    /* renamed from: J */
    public final BroadcastReceiver f100550J = new C26604b();

    /* renamed from: K */
    public final BluetoothGattCallback f100551K = new C266023();

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$3 */
    /* loaded from: classes8.dex */
    public class C266023 extends BluetoothGattCallback {
        public C266023() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: A0 */
        public /* synthetic */ void m22809A0(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.m22861r2(bluetoothGatt.getDevice(), BleManagerHandler.this.f100542B);
        }

        /* renamed from: B0 */
        public static /* synthetic */ String m22807B0(int i) {
            return "Error (0x" + Integer.toHexString(i) + "): " + XA1.m77261b(i);
        }

        /* renamed from: C0 */
        public static /* synthetic */ void m22805C0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Error on connection state change", i);
        }

        /* renamed from: D0 */
        public static /* synthetic */ String m22803D0(BluetoothGatt bluetoothGatt) {
            return "Connected to " + bluetoothGatt.getDevice().getAddress();
        }

        /* renamed from: E0 */
        public static /* synthetic */ void m22801E0(BluetoothGatt bluetoothGatt, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3466b(bluetoothGatt.getDevice());
        }

        /* renamed from: F0 */
        public static /* synthetic */ void m22799F0(BluetoothGatt bluetoothGatt, InterfaceC46590oy0 interfaceC46590oy0) {
            interfaceC46590oy0.mo18377b(bluetoothGatt.getDevice());
        }

        /* renamed from: G0 */
        public static /* synthetic */ String m22797G0(int i) {
            return "wait(" + i + ")";
        }

        /* renamed from: H0 */
        public static /* synthetic */ String m22795H0() {
            return "Discovering services...";
        }

        /* renamed from: I0 */
        public static /* synthetic */ String m22793I0() {
            return "gatt.discoverServices()";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: J0 */
        public /* synthetic */ void m22791J0(int i, BluetoothGatt bluetoothGatt) {
            if (i == BleManagerHandler.this.f100563l && BleManagerHandler.this.f100564m && !BleManagerHandler.this.f100559h && !BleManagerHandler.this.f100561j && bluetoothGatt.getDevice().getBondState() != 11) {
                BleManagerHandler.this.f100561j = true;
                BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.g0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22795H0;
                        m22795H0 = BleManagerHandler.C266023.m22795H0();
                        return m22795H0;
                    }
                });
                BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.h0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22793I0;
                        m22793I0 = BleManagerHandler.C266023.m22793I0();
                        return m22793I0;
                    }
                });
                bluetoothGatt.discoverServices();
            }
        }

        /* renamed from: K0 */
        public static /* synthetic */ String m22789K0(int i) {
            return "Error: (0x" + Integer.toHexString(i) + "): " + XA1.m77261b(i);
        }

        /* renamed from: L0 */
        public static /* synthetic */ String m22787L0(int i, int i2, int i3) {
            return "Connection parameters updated (interval: " + (i * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)";
        }

        /* renamed from: M0 */
        public static /* synthetic */ String m22785M0(int i, int i2, int i3) {
            return "Connection parameters update failed with status: UNACCEPT CONN INTERVAL (0x3b) (interval: " + (i * 1.25d) + "ms, latency: " + i2 + ", timeout: " + (i3 * 10) + "ms)";
        }

        /* renamed from: N0 */
        public static /* synthetic */ String m22783N0(int i, int i2, int i3, int i4) {
            return "Connection parameters update failed with status " + i + " (interval: " + (i2 * 1.25d) + "ms, latency: " + i3 + ", timeout: " + (i4 * 10) + "ms)";
        }

        /* renamed from: O0 */
        public static /* synthetic */ void m22781O0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Error on connection priority request", i);
        }

        /* renamed from: P0 */
        public static /* synthetic */ String m22779P0(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
            return "Read Response received from descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: Q0 */
        public static /* synthetic */ String m22777Q0(int i) {
            return "Authentication required (" + i + ")";
        }

        /* renamed from: R0 */
        public static /* synthetic */ void m22775R0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        /* renamed from: S0 */
        public static /* synthetic */ String m22773S0(BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
            return "Data written to descr. " + bluetoothGattDescriptor.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: T0 */
        public static /* synthetic */ String m22771T0() {
            return "Service Changed notifications enabled";
        }

        /* renamed from: U0 */
        public static /* synthetic */ String m22769U0() {
            return "Notifications and indications disabled";
        }

        /* renamed from: V0 */
        public static /* synthetic */ String m22767V0() {
            return "Notifications enabled";
        }

        /* renamed from: W0 */
        public static /* synthetic */ String m22765W0() {
            return "Indications enabled";
        }

        /* renamed from: X0 */
        public static /* synthetic */ String m22763X0(int i) {
            return "Authentication required (" + i + ")";
        }

        /* renamed from: Y0 */
        public static /* synthetic */ void m22761Y0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        /* renamed from: Z0 */
        public static /* synthetic */ String m22759Z0(int i) {
            return "MTU changed to: " + i;
        }

        /* renamed from: a1 */
        public static /* synthetic */ String m22756a1(int i, int i2) {
            return "PHY read (TX: " + XH3.m77152f(i) + ", RX: " + XH3.m77152f(i2) + ")";
        }

        /* renamed from: b1 */
        public static /* synthetic */ String m22753b1(int i) {
            return "PHY read failed with status " + i;
        }

        /* renamed from: c1 */
        public static /* synthetic */ void m22750c1(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Error on PHY read", i);
        }

        /* renamed from: d1 */
        public static /* synthetic */ String m22747d1(int i, int i2) {
            return "PHY updated (TX: " + XH3.m77152f(i) + ", RX: " + XH3.m77152f(i2) + ")";
        }

        /* renamed from: e1 */
        public static /* synthetic */ String m22744e1(int i) {
            return "PHY updated failed with status " + i;
        }

        /* renamed from: f1 */
        public static /* synthetic */ void m22741f1(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Error on PHY update", i);
        }

        /* renamed from: g1 */
        public static /* synthetic */ String m22738g1(int i) {
            return "Remote RSSI received: " + i + " dBm";
        }

        /* renamed from: h1 */
        public static /* synthetic */ String m22735h1(int i) {
            return "Reading remote RSSI failed with status " + i;
        }

        /* renamed from: i1 */
        public static /* synthetic */ void m22732i1(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Error on RSSI read", i);
        }

        /* renamed from: j1 */
        public static /* synthetic */ String m22729j1() {
            return "Reliable Write executed";
        }

        /* renamed from: k0 */
        public static /* synthetic */ String m22727k0() {
            return "Service Changed indication received";
        }

        /* renamed from: k1 */
        public static /* synthetic */ String m22726k1() {
            return "Reliable Write aborted";
        }

        /* renamed from: l0 */
        public static /* synthetic */ String m22724l0() {
            return "Discovering Services...";
        }

        /* renamed from: l1 */
        public static /* synthetic */ String m22723l1() {
            return "Service changed, invalidating services";
        }

        /* renamed from: m0 */
        public static /* synthetic */ String m22721m0() {
            return "gatt.discoverServices()";
        }

        /* renamed from: m1 */
        public static /* synthetic */ String m22720m1() {
            return "Discovering Services...";
        }

        /* renamed from: n0 */
        public static /* synthetic */ String m22718n0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Notification received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: n1 */
        public static /* synthetic */ String m22717n1() {
            return "gatt.discoverServices()";
        }

        /* renamed from: o0 */
        public static /* synthetic */ String m22715o0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Indication received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: o1 */
        public static /* synthetic */ String m22714o1() {
            return "Services discovered";
        }

        /* renamed from: p0 */
        public static /* synthetic */ String m22712p0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Read Response received from " + bluetoothGattCharacteristic.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: p1 */
        public static /* synthetic */ String m22711p1() {
            return "Primary service found";
        }

        /* renamed from: q0 */
        public static /* synthetic */ String m22709q0(int i) {
            return "Authentication required (" + i + ")";
        }

        /* renamed from: q1 */
        public static /* synthetic */ String m22708q1() {
            return "Secondary service found";
        }

        /* renamed from: r0 */
        public static /* synthetic */ void m22706r0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        /* renamed from: r1 */
        public static /* synthetic */ void m22705r1(BluetoothGatt bluetoothGatt, boolean z, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3460h(bluetoothGatt.getDevice(), z);
        }

        /* renamed from: s0 */
        public static /* synthetic */ String m22703s0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            return "Data written to " + bluetoothGattCharacteristic.getUuid() + ", value: " + XH3.m77155c(bArr);
        }

        /* renamed from: s1 */
        public static /* synthetic */ String m22702s1() {
            return "Device is not supported";
        }

        /* renamed from: t0 */
        public static /* synthetic */ String m22700t0(int i) {
            return "Authentication required (" + i + ")";
        }

        /* renamed from: t1 */
        public static /* synthetic */ void m22699t1(BluetoothGatt bluetoothGatt, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3463e(bluetoothGatt.getDevice());
        }

        /* renamed from: u0 */
        public static /* synthetic */ void m22697u0(BluetoothGatt bluetoothGatt, int i, InterfaceC30597yU interfaceC30597yU) {
            interfaceC30597yU.mo3459i(bluetoothGatt.getDevice(), "Phone has lost bonding information", i);
        }

        /* renamed from: v0 */
        public static /* synthetic */ String m22695v0(int i, int i2) {
            return "[Callback] Connection state changed with status: " + i + " and new state: " + i2 + " (" + XH3.m77151g(i2) + ")";
        }

        /* renamed from: w0 */
        public static /* synthetic */ String m22693w0() {
            return "gatt.close()";
        }

        /* renamed from: x0 */
        public static /* synthetic */ String m22691x0(int i) {
            return "wait(" + i + ")";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y0 */
        public /* synthetic */ void m22689y0(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.m22861r2(bluetoothGatt.getDevice(), BleManagerHandler.this.f100542B);
        }

        /* renamed from: z0 */
        public static /* synthetic */ String m22687z0() {
            return "autoConnect = false called failed; retrying with autoConnect = true";
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
            if (r1.getValue()[0] == 1) goto L48;
         */
        @Override // android.bluetooth.BluetoothGattCallback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            boolean z;
            final byte[] value = bluetoothGattCharacteristic.getValue();
            if (BleManagerHandler.this.m23001U2(bluetoothGattCharacteristic)) {
                if (Build.VERSION.SDK_INT <= 30) {
                    BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.d
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22727k0;
                            m22727k0 = BleManagerHandler.C266023.m22727k0();
                            return m22727k0;
                        }
                    });
                    BleManagerHandler.this.f100566o = true;
                    BleManagerHandler.this.mo3748c5();
                    BleManagerHandler.this.mo22981X4();
                    BleManagerHandler.this.f100557f.clear();
                    BleManagerHandler.this.f100558g = null;
                    BleManagerHandler.this.f100561j = true;
                    BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.e
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22724l0;
                            m22724l0 = BleManagerHandler.C266023.m22724l0();
                            return m22724l0;
                        }
                    });
                    BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.f
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22721m0;
                            m22721m0 = BleManagerHandler.C266023.m22721m0();
                            return m22721m0;
                        }
                    });
                    bluetoothGatt.discoverServices();
                    return;
                }
                return;
            }
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(AbstractC30179xU.f117644f);
            if (descriptor != null && descriptor.getValue() != null && descriptor.getValue().length == 2) {
                z = false;
            }
            z = true;
            if (z) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.g
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22718n0;
                        m22718n0 = BleManagerHandler.C266023.m22718n0(bluetoothGattCharacteristic, value);
                        return m22718n0;
                    }
                });
                BleManagerHandler.this.m23016R4(bluetoothGatt, bluetoothGattCharacteristic);
            } else {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.h
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22715o0;
                        m22715o0 = BleManagerHandler.C266023.m22715o0(bluetoothGattCharacteristic, value);
                        return m22715o0;
                    }
                });
                BleManagerHandler.this.m23022Q4(bluetoothGatt, bluetoothGattCharacteristic);
            }
            if (BleManagerHandler.this.f100547G != null && BleManagerHandler.this.m23036O2(bluetoothGattCharacteristic)) {
                BleManagerHandler.this.f100547G.m108553f(bluetoothGatt.getDevice(), value);
            }
            C32636Ej6 c32636Ej6 = (C32636Ej6) BleManagerHandler.this.f100545E.get(bluetoothGattCharacteristic);
            if (c32636Ej6 != null && c32636Ej6.m108555d(value)) {
                c32636Ej6.m108553f(bluetoothGatt.getDevice(), value);
            }
            if ((BleManagerHandler.this.f100548H instanceof C26611C0) && BleManagerHandler.this.f100548H.f100695e == bluetoothGattCharacteristic && !BleManagerHandler.this.f100548H.m22628N()) {
                C26611C0 c26611c0 = (C26611C0) BleManagerHandler.this.f100548H;
                if (c26611c0.m22651U(value)) {
                    c26611c0.m22650V(bluetoothGatt.getDevice(), value);
                    if (c26611c0.m22653S()) {
                        c26611c0.mo22518D(bluetoothGatt.getDevice());
                        BleManagerHandler.this.f100548H = null;
                        if (c26611c0.m22629M()) {
                            BleManagerHandler.this.m23040N4(true);
                        }
                    }
                }
            }
            if (BleManagerHandler.this.m22954c2()) {
                BleManagerHandler.this.m23040N4(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            final byte[] value = bluetoothGattCharacteristic.getValue();
            if (i == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.q
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22712p0;
                        m22712p0 = BleManagerHandler.C266023.m22712p0(bluetoothGattCharacteristic, value);
                        return m22712p0;
                    }
                });
                BleManagerHandler.this.m23011S4(bluetoothGatt, bluetoothGattCharacteristic);
                if (BleManagerHandler.this.f100543C instanceof C26680s0) {
                    C26680s0 c26680s0 = (C26680s0) BleManagerHandler.this.f100543C;
                    boolean m22534O = c26680s0.m22534O(value);
                    if (m22534O) {
                        c26680s0.m22533P(bluetoothGatt.getDevice(), value);
                    }
                    if (m22534O && !c26680s0.m22537L()) {
                        c26680s0.mo22518D(bluetoothGatt.getDevice());
                    } else {
                        BleManagerHandler.this.m22934f2(c26680s0);
                    }
                }
            } else if (i != 5 && i != 8 && i != 137) {
                Log.e("BleManager", "onCharacteristicRead error " + i);
                if (BleManagerHandler.this.f100543C instanceof C26680s0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i);
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on reading characteristic", i);
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.r
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22709q0;
                        m22709q0 = BleManagerHandler.C266023.m22709q0(i);
                        return m22709q0;
                    }
                });
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.s
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                        /* renamed from: a */
                        public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                            BleManagerHandler.C266023.m22706r0(bluetoothGatt, i, interfaceC30597yU);
                        }
                    });
                    return;
                }
                return;
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final int i) {
            final byte[] value = bluetoothGattCharacteristic.getValue();
            if (i == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.a0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22703s0;
                        m22703s0 = BleManagerHandler.C266023.m22703s0(bluetoothGattCharacteristic, value);
                        return m22703s0;
                    }
                });
                BleManagerHandler.this.m23005T4(bluetoothGatt, bluetoothGattCharacteristic);
                if (BleManagerHandler.this.f100543C instanceof C26613D0) {
                    C26613D0 c26613d0 = (C26613D0) BleManagerHandler.this.f100543C;
                    if (!c26613d0.m22636T(bluetoothGatt.getDevice(), value) && (BleManagerHandler.this.f100544D instanceof C34380Lv4)) {
                        c26613d0.mo22521A(bluetoothGatt.getDevice(), -6);
                        BleManagerHandler.this.f100544D.mo22486I();
                    } else if (c26613d0.m22640P()) {
                        BleManagerHandler.this.m22934f2(c26613d0);
                    } else {
                        c26613d0.mo22518D(bluetoothGatt.getDevice());
                    }
                }
            } else if (i != 5 && i != 8 && i != 137) {
                Log.e("BleManager", "onCharacteristicWrite error " + i);
                if (BleManagerHandler.this.f100543C instanceof C26613D0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i);
                    if (BleManagerHandler.this.f100544D instanceof C34380Lv4) {
                        BleManagerHandler.this.f100544D.mo22486I();
                    }
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on writing characteristic", i);
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.b0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22700t0;
                        m22700t0 = BleManagerHandler.C266023.m22700t0(i);
                        return m22700t0;
                    }
                });
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.c0
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                        /* renamed from: a */
                        public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                            BleManagerHandler.C266023.m22697u0(bluetoothGatt, i, interfaceC30597yU);
                        }
                    });
                    return;
                }
                return;
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i, final int i2) {
            boolean z;
            boolean z2;
            int i3;
            BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.w
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22695v0;
                    m22695v0 = BleManagerHandler.C266023.m22695v0(i, i2);
                    return m22695v0;
                }
            });
            int i4 = 4;
            boolean z3 = true;
            if (i == 0 && i2 == 2) {
                if (BleManagerHandler.this.f100553b == null) {
                    Log.e("BleManager", "Device received notification after disconnection.");
                    BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.C
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22693w0;
                            m22693w0 = BleManagerHandler.C266023.m22693w0();
                            return m22693w0;
                        }
                    });
                    try {
                        bluetoothGatt.close();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.D
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22803D0;
                        m22803D0 = BleManagerHandler.C266023.m22803D0(bluetoothGatt);
                        return m22803D0;
                    }
                });
                BleManagerHandler.this.f100564m = true;
                BleManagerHandler.this.f100562k = 0L;
                BleManagerHandler.this.f100569r = 2;
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.E
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22801E0(bluetoothGatt, interfaceC30597yU);
                    }
                });
                BleManagerHandler.this.m22931f5(new InterfaceC26608f() { // from class: no.nordicsemi.android.ble.F
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                    /* renamed from: a */
                    public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                        BleManagerHandler.C266023.m22799F0(bluetoothGatt, interfaceC46590oy0);
                    }
                });
                if (!BleManagerHandler.this.f100561j) {
                    if (bluetoothGatt.getDevice().getBondState() != 12) {
                        z3 = false;
                    }
                    final int m5233E = BleManagerHandler.this.f100555d.m5233E(z3);
                    if (m5233E > 0) {
                        BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.G
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22797G0;
                                m22797G0 = BleManagerHandler.C266023.m22797G0(m5233E);
                                return m22797G0;
                            }
                        });
                    }
                    final int m22868q1 = BleManagerHandler.m22868q1(BleManagerHandler.this);
                    BleManagerHandler.this.mo22491c(new Runnable() { // from class: no.nordicsemi.android.ble.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            BleManagerHandler.C266023.this.m22791J0(m22868q1, bluetoothGatt);
                        }
                    }, m5233E);
                    return;
                }
                return;
            }
            if (i2 == 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (BleManagerHandler.this.f100562k > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && elapsedRealtime > BleManagerHandler.this.f100562k + 20000) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i != 0) {
                    BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.J
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22789K0;
                            m22789K0 = BleManagerHandler.C266023.m22789K0(i);
                            return m22789K0;
                        }
                    });
                }
                if (i != 0 && z && !z2 && BleManagerHandler.this.f100542B != null && BleManagerHandler.this.f100542B.m22606L()) {
                    final int m22600R = BleManagerHandler.this.f100542B.m22600R();
                    if (m22600R > 0) {
                        BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.K
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22691x0;
                                m22691x0 = BleManagerHandler.C266023.m22691x0(m22600R);
                                return m22691x0;
                            }
                        });
                    }
                    BleManagerHandler.this.mo22491c(new Runnable() { // from class: no.nordicsemi.android.ble.L
                        @Override // java.lang.Runnable
                        public final void run() {
                            BleManagerHandler.C266023.this.m22689y0(bluetoothGatt);
                        }
                    }, m22600R);
                    return;
                } else if (BleManagerHandler.this.f100542B != null && BleManagerHandler.this.f100542B.m22594X() && BleManagerHandler.this.f100568q && bluetoothGatt.getDevice().getBondState() == 12) {
                    BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.y
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22687z0;
                            m22687z0 = BleManagerHandler.C266023.m22687z0();
                            return m22687z0;
                        }
                    });
                    BleManagerHandler.this.mo22492b(new Runnable() { // from class: no.nordicsemi.android.ble.z
                        @Override // java.lang.Runnable
                        public final void run() {
                            BleManagerHandler.C266023.this.m22809A0(bluetoothGatt);
                        }
                    });
                    return;
                } else {
                    BleManagerHandler.this.f100566o = true;
                    BleManagerHandler.this.f100557f.clear();
                    BleManagerHandler.this.f100558g = null;
                    BleManagerHandler.this.f100565n = false;
                    boolean z4 = BleManagerHandler.this.f100564m;
                    boolean z5 = BleManagerHandler.this.f100560i;
                    BleManagerHandler bleManagerHandler = BleManagerHandler.this;
                    BluetoothDevice device = bluetoothGatt.getDevice();
                    if (z2) {
                        i4 = 10;
                    } else if (!z5) {
                        i4 = BleManagerHandler.this.m23046M4(i);
                    }
                    bleManagerHandler.m23034O4(device, i4);
                    int i5 = -1;
                    if (BleManagerHandler.this.f100543C != null && BleManagerHandler.this.f100543C.f100694d != AbstractC26684u0.EnumC26687c.DISCONNECT && BleManagerHandler.this.f100543C.f100694d != AbstractC26684u0.EnumC26687c.REMOVE_BOND) {
                        AbstractC26684u0 abstractC26684u0 = BleManagerHandler.this.f100543C;
                        BluetoothDevice device2 = bluetoothGatt.getDevice();
                        if (i == 0) {
                            i3 = -1;
                        } else {
                            i3 = i;
                        }
                        abstractC26684u0.mo22521A(device2, i3);
                        BleManagerHandler.this.f100543C = null;
                    }
                    if (BleManagerHandler.this.f100548H != null) {
                        BleManagerHandler.this.f100548H.mo22521A(bluetoothGatt.getDevice(), -1);
                        BleManagerHandler.this.f100548H = null;
                    }
                    if (BleManagerHandler.this.f100542B != null) {
                        if (z5) {
                            i5 = -2;
                        } else if (i != 0) {
                            if (i == 133 && z2) {
                                i5 = -5;
                            } else {
                                i5 = i;
                            }
                        }
                        BleManagerHandler.this.f100542B.mo22521A(bluetoothGatt.getDevice(), i5);
                        BleManagerHandler.this.f100542B = null;
                    }
                    BleManagerHandler.this.f100566o = false;
                    if (z4 && BleManagerHandler.this.f100568q) {
                        BleManagerHandler.this.m22861r2(bluetoothGatt.getDevice(), null);
                    } else {
                        BleManagerHandler.this.f100568q = false;
                        BleManagerHandler.this.m23040N4(false);
                    }
                    if (z4 || i == 0) {
                        return;
                    }
                }
            } else if (i != 0) {
                BleManagerHandler.this.m23052L4(6, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.A
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22807B0;
                        m22807B0 = BleManagerHandler.C266023.m22807B0(i);
                        return m22807B0;
                    }
                });
            }
            BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.B
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    BleManagerHandler.C266023.m22805C0(bluetoothGatt, i, interfaceC30597yU);
                }
            });
        }

        @Keep
        public void onConnectionUpdated(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3, final int i4) {
            if (i4 == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.i0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22787L0;
                        m22787L0 = BleManagerHandler.C266023.m22787L0(i, i2, i3);
                        return m22787L0;
                    }
                });
                BleManagerHandler.this.f100573v = i;
                BleManagerHandler.this.f100574w = i2;
                BleManagerHandler.this.f100575x = i3;
                BleManagerHandler.this.m22999U4(bluetoothGatt, i, i2, i3);
                InterfaceC50147uy0 interfaceC50147uy0 = BleManagerHandler.this.f100546F;
                if (interfaceC50147uy0 != null) {
                    interfaceC50147uy0.mo9426a(bluetoothGatt.getDevice(), i, i2, i3);
                }
                if (BleManagerHandler.this.f100543C instanceof C26666o0) {
                    ((C26666o0) BleManagerHandler.this.f100543C).m22588M(bluetoothGatt.getDevice(), i, i2, i3);
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                }
            } else if (i4 == 59) {
                Log.e("BleManager", "onConnectionUpdated received status: Unacceptable connection interval, interval: " + i + ", latency: " + i2 + ", timeout: " + i3);
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.j0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22785M0;
                        m22785M0 = BleManagerHandler.C266023.m22785M0(i, i2, i3);
                        return m22785M0;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26666o0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i4);
                    BleManagerHandler.this.f100548H = null;
                }
            } else {
                Log.e("BleManager", "onConnectionUpdated received status: " + i4 + ", interval: " + i + ", latency: " + i2 + ", timeout: " + i3);
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.k0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22783N0;
                        m22783N0 = BleManagerHandler.C266023.m22783N0(i4, i, i2, i3);
                        return m22783N0;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26666o0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i4);
                    BleManagerHandler.this.f100548H = null;
                }
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.l0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22781O0(bluetoothGatt, i4, interfaceC30597yU);
                    }
                });
            }
            if (BleManagerHandler.this.f100570s) {
                BleManagerHandler.this.f100570s = false;
                BleManagerHandler.this.m22954c2();
                BleManagerHandler.this.m23040N4(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            final byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.M
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22779P0;
                        m22779P0 = BleManagerHandler.C266023.m22779P0(bluetoothGattDescriptor, value);
                        return m22779P0;
                    }
                });
                BleManagerHandler.this.m22993V4(bluetoothGatt, bluetoothGattDescriptor);
                if (BleManagerHandler.this.f100543C instanceof C26680s0) {
                    C26680s0 c26680s0 = (C26680s0) BleManagerHandler.this.f100543C;
                    c26680s0.m22533P(bluetoothGatt.getDevice(), value);
                    if (c26680s0.m22537L()) {
                        BleManagerHandler.this.m22934f2(c26680s0);
                    } else {
                        c26680s0.mo22518D(bluetoothGatt.getDevice());
                    }
                }
            } else if (i != 5 && i != 8 && i != 137) {
                Log.e("BleManager", "onDescriptorRead error " + i);
                if (BleManagerHandler.this.f100543C instanceof C26680s0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i);
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on reading descriptor", i);
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.N
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22777Q0;
                        m22777Q0 = BleManagerHandler.C266023.m22777Q0(i);
                        return m22777Q0;
                    }
                });
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.O
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                        /* renamed from: a */
                        public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                            BleManagerHandler.C266023.m22775R0(bluetoothGatt, i, interfaceC30597yU);
                        }
                    });
                    return;
                }
                return;
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(final BluetoothGatt bluetoothGatt, final BluetoothGattDescriptor bluetoothGattDescriptor, final int i) {
            final byte[] value = bluetoothGattDescriptor.getValue();
            if (i == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.i
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22773S0;
                        m22773S0 = BleManagerHandler.C266023.m22773S0(bluetoothGattDescriptor, value);
                        return m22773S0;
                    }
                });
                if (BleManagerHandler.this.m23007T2(bluetoothGattDescriptor)) {
                    BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.j
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22771T0;
                            m22771T0 = BleManagerHandler.C266023.m22771T0();
                            return m22771T0;
                        }
                    });
                } else if (BleManagerHandler.this.m23030P2(bluetoothGattDescriptor)) {
                    if (value != null && value.length == 2 && value[1] == 0) {
                        byte b = value[0];
                        if (b != 0) {
                            if (b != 1) {
                                if (b == 2) {
                                    BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.n
                                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                        /* renamed from: a */
                                        public final String mo1308a() {
                                            String m22765W0;
                                            m22765W0 = BleManagerHandler.C266023.m22765W0();
                                            return m22765W0;
                                        }
                                    });
                                }
                            } else {
                                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.l
                                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                    /* renamed from: a */
                                    public final String mo1308a() {
                                        String m22767V0;
                                        m22767V0 = BleManagerHandler.C266023.m22767V0();
                                        return m22767V0;
                                    }
                                });
                            }
                        } else {
                            BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.k
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                /* renamed from: a */
                                public final String mo1308a() {
                                    String m22769U0;
                                    m22769U0 = BleManagerHandler.C266023.m22769U0();
                                    return m22769U0;
                                }
                            });
                        }
                        BleManagerHandler.this.m22987W4(bluetoothGatt, bluetoothGattDescriptor);
                    }
                } else {
                    BleManagerHandler.this.m22987W4(bluetoothGatt, bluetoothGattDescriptor);
                }
                if (BleManagerHandler.this.f100543C instanceof C26613D0) {
                    C26613D0 c26613d0 = (C26613D0) BleManagerHandler.this.f100543C;
                    if (!c26613d0.m22636T(bluetoothGatt.getDevice(), value) && (BleManagerHandler.this.f100544D instanceof C34380Lv4)) {
                        c26613d0.mo22521A(bluetoothGatt.getDevice(), -6);
                        BleManagerHandler.this.f100544D.mo22486I();
                    } else if (c26613d0.m22640P()) {
                        BleManagerHandler.this.m22934f2(c26613d0);
                    } else {
                        c26613d0.mo22518D(bluetoothGatt.getDevice());
                    }
                }
            } else if (i != 5 && i != 8 && i != 137) {
                Log.e("BleManager", "onDescriptorWrite error " + i);
                if (BleManagerHandler.this.f100543C instanceof C26613D0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i);
                    if (BleManagerHandler.this.f100544D instanceof C34380Lv4) {
                        BleManagerHandler.this.f100544D.mo22486I();
                    }
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on writing descriptor", i);
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.o
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22763X0;
                        m22763X0 = BleManagerHandler.C266023.m22763X0(i);
                        return m22763X0;
                    }
                });
                if (bluetoothGatt.getDevice().getBondState() != 10) {
                    Log.w("BleManager", "Phone has lost bonding information");
                    BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.p
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                        /* renamed from: a */
                        public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                            BleManagerHandler.C266023.m22761Y0(bluetoothGatt, i, interfaceC30597yU);
                        }
                    });
                    return;
                }
                return;
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, final int i, int i2) {
            if (i2 == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.c
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22759Z0;
                        m22759Z0 = BleManagerHandler.C266023.m22759Z0(i);
                        return m22759Z0;
                    }
                });
                BleManagerHandler.this.f100572u = i;
                BleManagerHandler.this.m22957b5(bluetoothGatt, i);
                if (BleManagerHandler.this.f100543C instanceof C26670q0) {
                    ((C26670q0) BleManagerHandler.this.f100543C).m22572O(bluetoothGatt.getDevice(), i);
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                }
            } else {
                Log.e("BleManager", "onMtuChanged error: " + i2 + ", mtu: " + i);
                if (BleManagerHandler.this.f100543C instanceof C26670q0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i2);
                    BleManagerHandler.this.f100548H = null;
                }
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on mtu request", i2);
            }
            BleManagerHandler.this.m22954c2();
            if (BleManagerHandler.this.f100559h) {
                BleManagerHandler.this.m23040N4(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyRead(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
            if (i3 == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.I
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22756a1;
                        m22756a1 = BleManagerHandler.C266023.m22756a1(i, i2);
                        return m22756a1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26672r0) {
                    ((C26672r0) BleManagerHandler.this.f100543C).m22558T(bluetoothGatt.getDevice(), i, i2);
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.U
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22753b1;
                        m22753b1 = BleManagerHandler.C266023.m22753b1(i3);
                        return m22753b1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26672r0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i3);
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.f0
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22750c1(bluetoothGatt, i3, interfaceC30597yU);
                    }
                });
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(final BluetoothGatt bluetoothGatt, final int i, final int i2, final int i3) {
            if (i3 == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.X
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22747d1;
                        m22747d1 = BleManagerHandler.C266023.m22747d1(i, i2);
                        return m22747d1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26672r0) {
                    ((C26672r0) BleManagerHandler.this.f100543C).m22558T(bluetoothGatt.getDevice(), i, i2);
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.Y
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22744e1;
                        m22744e1 = BleManagerHandler.C266023.m22744e1(i3);
                        return m22744e1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26672r0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i3);
                    BleManagerHandler.this.f100548H = null;
                }
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.Z
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22741f1(bluetoothGatt, i3, interfaceC30597yU);
                    }
                });
            }
            if (BleManagerHandler.this.m22954c2() || (BleManagerHandler.this.f100543C instanceof C26672r0)) {
                BleManagerHandler.this.m23040N4(true);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(final BluetoothGatt bluetoothGatt, final int i, final int i2) {
            if (i2 == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.b
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22738g1;
                        m22738g1 = BleManagerHandler.C266023.m22738g1(i);
                        return m22738g1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26682t0) {
                    ((C26682t0) BleManagerHandler.this.f100543C).m22524N(bluetoothGatt.getDevice(), i);
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                }
            } else {
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.m
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22735h1;
                        m22735h1 = BleManagerHandler.C266023.m22735h1(i2);
                        return m22735h1;
                    }
                });
                if (BleManagerHandler.this.f100543C instanceof C26682t0) {
                    BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i2);
                }
                BleManagerHandler.this.f100548H = null;
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.x
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22732i1(bluetoothGatt, i2, interfaceC30597yU);
                    }
                });
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            boolean z;
            if (BleManagerHandler.this.f100543C.f100694d == AbstractC26684u0.EnumC26687c.EXECUTE_RELIABLE_WRITE) {
                z = true;
            } else {
                z = false;
            }
            BleManagerHandler.this.f100571t = false;
            if (i == 0) {
                if (z) {
                    BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.d0
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22729j1;
                            m22729j1 = BleManagerHandler.C266023.m22729j1();
                            return m22729j1;
                        }
                    });
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                } else {
                    BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.e0
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22726k1;
                            m22726k1 = BleManagerHandler.C266023.m22726k1();
                            return m22726k1;
                        }
                    });
                    BleManagerHandler.this.f100543C.mo22518D(bluetoothGatt.getDevice());
                    BleManagerHandler.this.f100544D.mo22521A(bluetoothGatt.getDevice(), -4);
                }
            } else {
                Log.e("BleManager", "onReliableWriteCompleted execute " + z + ", error " + i);
                BleManagerHandler.this.f100543C.mo22521A(bluetoothGatt.getDevice(), i);
                BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on Execute Reliable Write", i);
            }
            BleManagerHandler.this.m22954c2();
            BleManagerHandler.this.m23040N4(true);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @Keep
        public void onServiceChanged(BluetoothGatt bluetoothGatt) {
            BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.t
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22723l1;
                    m22723l1 = BleManagerHandler.C266023.m22723l1();
                    return m22723l1;
                }
            });
            BleManagerHandler.this.f100566o = true;
            BleManagerHandler.this.mo3748c5();
            BleManagerHandler.this.mo22981X4();
            BleManagerHandler.this.f100557f.clear();
            BleManagerHandler.this.f100558g = null;
            BleManagerHandler.this.f100561j = true;
            BleManagerHandler.this.f100559h = false;
            BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.u
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22720m1;
                    m22720m1 = BleManagerHandler.C266023.m22720m1();
                    return m22720m1;
                }
            });
            BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.v
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22717n1;
                    m22717n1 = BleManagerHandler.C266023.m22717n1();
                    return m22717n1;
                }
            });
            bluetoothGatt.discoverServices();
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(final BluetoothGatt bluetoothGatt, int i) {
            if (!BleManagerHandler.this.f100561j) {
                return;
            }
            boolean z = false;
            BleManagerHandler.this.f100561j = false;
            if (i == 0) {
                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.P
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22714o1;
                        m22714o1 = BleManagerHandler.C266023.m22714o1();
                        return m22714o1;
                    }
                });
                BleManagerHandler.this.f100559h = true;
                if (BleManagerHandler.this.mo3749S2(bluetoothGatt)) {
                    BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.Q
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22711p1;
                            m22711p1 = BleManagerHandler.C266023.m22711p1();
                            return m22711p1;
                        }
                    });
                    BleManagerHandler.this.f100560i = false;
                    final boolean m23018R2 = BleManagerHandler.this.m23018R2(bluetoothGatt);
                    if (m23018R2) {
                        BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.S
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22708q1;
                                m22708q1 = BleManagerHandler.C266023.m22708q1();
                                return m22708q1;
                            }
                        });
                    }
                    BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.T
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                        /* renamed from: a */
                        public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                            BleManagerHandler.C266023.m22705r1(bluetoothGatt, m23018R2, interfaceC30597yU);
                        }
                    });
                    BleManagerHandler.this.getClass();
                    BleManagerHandler.this.f100566o = true;
                    BleManagerHandler bleManagerHandler = BleManagerHandler.this;
                    bleManagerHandler.f100558g = bleManagerHandler.m22884n2(bluetoothGatt);
                    if (BleManagerHandler.this.f100558g != null) {
                        z = true;
                    }
                    if (z) {
                        for (AbstractC26684u0 abstractC26684u0 : BleManagerHandler.this.f100558g) {
                            abstractC26684u0.mo22469G(BleManagerHandler.this);
                            abstractC26684u0.f100704n = true;
                        }
                    }
                    if (BleManagerHandler.this.f100558g == null) {
                        BleManagerHandler.this.f100558g = new LinkedBlockingDeque();
                    }
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 == 26 || i2 == 27 || i2 == 28) {
                        BleManagerHandler.this.m22934f2(AbstractC26684u0.m22498v().mo22469G(BleManagerHandler.this));
                        BleManagerHandler.this.f100566o = true;
                    }
                    if (z) {
                        BleManagerHandler.this.f100555d.m5229J();
                        if (BleManagerHandler.this.f100555d.f117651c != null && BleManagerHandler.this.f100555d.f117651c.mo3458j(bluetoothGatt.getDevice())) {
                            BleManagerHandler.this.f100555d.m5216y();
                        }
                    }
                    BleManagerHandler.this.mo3747o2();
                    BleManagerHandler.this.m23040N4(true);
                    return;
                }
                BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: no.nordicsemi.android.ble.V
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22702s1;
                        m22702s1 = BleManagerHandler.C266023.m22702s1();
                        return m22702s1;
                    }
                });
                BleManagerHandler.this.f100560i = true;
                BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: no.nordicsemi.android.ble.W
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        BleManagerHandler.C266023.m22699t1(bluetoothGatt, interfaceC30597yU);
                    }
                });
                BleManagerHandler.this.m22837v2(4);
                return;
            }
            Log.e("BleManager", "onServicesDiscovered error " + i);
            BleManagerHandler.this.m22969Z4(bluetoothGatt.getDevice(), "Error on discovering services", i);
            if (BleManagerHandler.this.f100542B != null) {
                BleManagerHandler.this.f100542B.mo22521A(bluetoothGatt.getDevice(), -4);
                BleManagerHandler.this.f100542B = null;
            }
            BleManagerHandler.this.m22837v2(-1);
        }
    }

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$a */
    /* loaded from: classes8.dex */
    public class C26603a extends BroadcastReceiver {
        public C26603a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ String m22685b(int i) {
            return "[Broadcast] Action received: android.bluetooth.adapter.action.STATE_CHANGED, state changed to " + m22684c(i);
        }

        /* renamed from: c */
        public final String m22684c(int i) {
            switch (i) {
                case 10:
                    return "OFF";
                case 11:
                    return "TURNING ON";
                case 12:
                    return "ON";
                case 13:
                    return "TURNING OFF";
                default:
                    return "UNKNOWN (" + i + ")";
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
            int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", 10);
            BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: tW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22685b;
                    m22685b = BleManagerHandler.C26603a.this.m22685b(intExtra);
                    return m22685b;
                }
            });
            if (intExtra == 10 || intExtra == 13) {
                if (intExtra2 != 13 && intExtra2 != 10) {
                    BleManagerHandler.this.f100566o = true;
                    BleManagerHandler.this.f100557f.clear();
                    BleManagerHandler.this.f100558g = null;
                    BluetoothDevice bluetoothDevice = BleManagerHandler.this.f100553b;
                    if (bluetoothDevice != null) {
                        if (BleManagerHandler.this.f100543C != null && BleManagerHandler.this.f100543C.f100694d != AbstractC26684u0.EnumC26687c.DISCONNECT) {
                            BleManagerHandler.this.f100543C.mo22521A(bluetoothDevice, -100);
                            BleManagerHandler.this.f100543C = null;
                        }
                        if (BleManagerHandler.this.f100548H != null) {
                            BleManagerHandler.this.f100548H.mo22521A(bluetoothDevice, -100);
                            BleManagerHandler.this.f100548H = null;
                        }
                        if (BleManagerHandler.this.f100542B != null) {
                            BleManagerHandler.this.f100542B.mo22521A(bluetoothDevice, -100);
                            BleManagerHandler.this.f100542B = null;
                        }
                    }
                    BleManagerHandler.this.f100567p = true;
                    BleManagerHandler.this.f100566o = false;
                    if (bluetoothDevice != null) {
                        BleManagerHandler.this.m23034O4(bluetoothDevice, 1);
                        return;
                    }
                    return;
                }
                BleManagerHandler.this.m22948d2();
            }
        }
    }

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$b */
    /* loaded from: classes8.dex */
    public class C26604b extends BroadcastReceiver {
        public C26604b() {
        }

        /* renamed from: n */
        public static /* synthetic */ String m22670n(int i) {
            return "[Broadcast] Action received: android.bluetooth.device.action.BOND_STATE_CHANGED, bond state changed to: " + XH3.m77157a(i) + " (" + i + ")";
        }

        /* renamed from: p */
        public static /* synthetic */ String m22668p() {
            return "Device bonded";
        }

        /* renamed from: r */
        public static /* synthetic */ String m22666r() {
            return "Discovering services...";
        }

        /* renamed from: s */
        public static /* synthetic */ String m22665s() {
            return "gatt.discoverServices()";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: t */
        public /* synthetic */ void m22664t() {
            BluetoothGatt bluetoothGatt = BleManagerHandler.this.f100554c;
            if (!BleManagerHandler.this.f100559h && !BleManagerHandler.this.f100561j && bluetoothGatt != null) {
                BleManagerHandler.this.f100561j = true;
                BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: xW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22666r;
                        m22666r = BleManagerHandler.C26604b.m22666r();
                        return m22666r;
                    }
                });
                BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: yW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22665s;
                        m22665s = BleManagerHandler.C26604b.m22665s();
                        return m22665s;
                    }
                });
                bluetoothGatt.discoverServices();
            }
        }

        /* renamed from: u */
        public static /* synthetic */ String m22663u() {
            return "Bonding failed";
        }

        /* renamed from: v */
        public static /* synthetic */ String m22662v() {
            return "Discovering services...";
        }

        /* renamed from: w */
        public static /* synthetic */ String m22661w() {
            return "gatt.discoverServices()";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: x */
        public /* synthetic */ void m22660x() {
            BluetoothGatt bluetoothGatt = BleManagerHandler.this.f100554c;
            if (!BleManagerHandler.this.f100559h && !BleManagerHandler.this.f100561j && bluetoothGatt != null) {
                BleManagerHandler.this.f100561j = true;
                BleManagerHandler.this.m23052L4(2, new InterfaceC26609g() { // from class: vW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22662v;
                        m22662v = BleManagerHandler.C26604b.m22662v();
                        return m22662v;
                    }
                });
                BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: wW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22661w;
                        m22661w = BleManagerHandler.C26604b.m22661w();
                        return m22661w;
                    }
                });
                bluetoothGatt.discoverServices();
            }
        }

        /* renamed from: y */
        public static /* synthetic */ String m22659y() {
            return "Bond information removed";
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            final BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            final int intExtra = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", -1);
            int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", -1);
            if (BleManagerHandler.this.f100553b != null && bluetoothDevice != null && bluetoothDevice.getAddress().equals(BleManagerHandler.this.f100553b.getAddress())) {
                BleManagerHandler.this.m23052L4(3, new InterfaceC26609g() { // from class: uW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22670n;
                        m22670n = BleManagerHandler.C26604b.m22670n(intExtra);
                        return m22670n;
                    }
                });
                switch (intExtra) {
                    case 10:
                        if (intExtra2 == 11) {
                            BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: BW
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                                /* renamed from: a */
                                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                                    interfaceC30597yU.mo3462f(bluetoothDevice);
                                }
                            });
                            BleManagerHandler.this.m22945d5(new InterfaceC26606d() { // from class: zW
                            });
                            BleManagerHandler.this.m23052L4(5, new InterfaceC26609g() { // from class: CW
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                /* renamed from: a */
                                public final String mo1308a() {
                                    String m22663u;
                                    m22663u = BleManagerHandler.C26604b.m22663u();
                                    return m22663u;
                                }
                            });
                            if (BleManagerHandler.this.f100543C != null && BleManagerHandler.this.f100543C.f100694d == AbstractC26684u0.EnumC26687c.CREATE_BOND) {
                                BleManagerHandler.this.f100543C.mo22521A(bluetoothDevice, -4);
                                BleManagerHandler.this.f100543C = null;
                            }
                            if (!BleManagerHandler.this.f100559h && !BleManagerHandler.this.f100561j) {
                                BleManagerHandler.this.mo22492b(new Runnable() { // from class: DW
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BleManagerHandler.C26604b.this.m22660x();
                                    }
                                });
                                return;
                            }
                        } else if (intExtra2 == 12) {
                            BleManagerHandler.this.f100567p = true;
                            if (BleManagerHandler.this.f100543C != null && BleManagerHandler.this.f100543C.f100694d == AbstractC26684u0.EnumC26687c.REMOVE_BOND) {
                                BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: EW
                                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                    /* renamed from: a */
                                    public final String mo1308a() {
                                        String m22659y;
                                        m22659y = BleManagerHandler.C26604b.m22659y();
                                        return m22659y;
                                    }
                                });
                                BleManagerHandler.this.f100543C.mo22518D(bluetoothDevice);
                                BleManagerHandler.this.f100543C = null;
                            }
                            if (!BleManagerHandler.this.m23024Q2()) {
                                BleManagerHandler.this.m22948d2();
                                break;
                            }
                        }
                        break;
                    case 11:
                        BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: FW
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                            /* renamed from: a */
                            public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                                interfaceC30597yU.mo3461g(bluetoothDevice);
                            }
                        });
                        BleManagerHandler.this.m22945d5(new InterfaceC26606d() { // from class: zW
                        });
                        return;
                    case 12:
                        BleManagerHandler.this.m23052L4(4, new InterfaceC26609g() { // from class: GW
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22668p;
                                m22668p = BleManagerHandler.C26604b.m22668p();
                                return m22668p;
                            }
                        });
                        BleManagerHandler.this.m22938e5(new InterfaceC26607e() { // from class: HW
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                            /* renamed from: a */
                            public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                                interfaceC30597yU.mo3454n(bluetoothDevice);
                            }
                        });
                        BleManagerHandler.this.m22945d5(new InterfaceC26606d() { // from class: zW
                        });
                        if (BleManagerHandler.this.f100543C != null && BleManagerHandler.this.f100543C.f100694d == AbstractC26684u0.EnumC26687c.CREATE_BOND) {
                            BleManagerHandler.this.f100543C.mo22518D(bluetoothDevice);
                            BleManagerHandler.this.f100543C = null;
                            break;
                        } else if (!BleManagerHandler.this.f100559h && !BleManagerHandler.this.f100561j) {
                            BleManagerHandler.this.mo22492b(new Runnable() { // from class: AW
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BleManagerHandler.C26604b.this.m22664t();
                                }
                            });
                            return;
                        } else if (Build.VERSION.SDK_INT < 26 && BleManagerHandler.this.f100543C != null) {
                            BleManagerHandler bleManagerHandler = BleManagerHandler.this;
                            bleManagerHandler.m22934f2(bleManagerHandler.f100543C);
                            break;
                        } else {
                            return;
                        }
                        break;
                }
                BleManagerHandler.this.m23040N4(true);
            }
        }
    }

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$c */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C26605c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f100581a;

        static {
            int[] iArr = new int[AbstractC26684u0.EnumC26687c.values().length];
            f100581a = iArr;
            try {
                iArr[AbstractC26684u0.EnumC26687c.NOTIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.INDICATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WAIT_FOR_NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WAIT_FOR_INDICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WAIT_FOR_READ.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WAIT_FOR_WRITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.CONNECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.DISCONNECT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ENSURE_BOND.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.CREATE_BOND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.REMOVE_BOND.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.SET.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.READ.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WRITE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.READ_DESCRIPTOR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.WRITE_DESCRIPTOR.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.SET_VALUE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.SET_DESCRIPTOR_VALUE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.BEGIN_RELIABLE_WRITE.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.EXECUTE_RELIABLE_WRITE.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ABORT_RELIABLE_WRITE.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ENABLE_NOTIFICATIONS.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ENABLE_INDICATIONS.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.DISABLE_NOTIFICATIONS.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.DISABLE_INDICATIONS.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.READ_BATTERY_LEVEL.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ENABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.DISABLE_BATTERY_LEVEL_NOTIFICATIONS.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.ENABLE_SERVICE_CHANGED_INDICATIONS.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.REQUEST_MTU.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.REQUEST_CONNECTION_PRIORITY.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.SET_PREFERRED_PHY.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.READ_PHY.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.READ_RSSI.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.REFRESH_CACHE.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f100581a[AbstractC26684u0.EnumC26687c.SLEEP.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
        }
    }

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC26606d {
    }

    @Deprecated
    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$e */
    /* loaded from: classes8.dex */
    public interface InterfaceC26607e {
        /* renamed from: a */
        void mo15838a(InterfaceC30597yU interfaceC30597yU);
    }

    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$f */
    /* loaded from: classes8.dex */
    public interface InterfaceC26608f {
        /* renamed from: a */
        void mo22631a(InterfaceC46590oy0 interfaceC46590oy0);
    }

    @FunctionalInterface
    /* renamed from: no.nordicsemi.android.ble.BleManagerHandler$g */
    /* loaded from: classes8.dex */
    public interface InterfaceC26609g {
        /* renamed from: a */
        String mo1308a();
    }

    /* renamed from: C3 */
    public static /* synthetic */ String m23107C3() {
        return "gatt.disconnect()";
    }

    /* renamed from: C4 */
    public static /* synthetic */ String m23106C4() {
        return "Connection lost";
    }

    /* renamed from: D3 */
    public static /* synthetic */ String m23101D3() {
        return "Disconnected";
    }

    /* renamed from: F4 */
    public static /* synthetic */ String m23088F4(int i) {
        return "Error (0x" + Integer.toHexString(i) + "): " + XA1.m77262a(i);
    }

    /* renamed from: G3 */
    public static /* synthetic */ String m23083G3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)";
    }

    /* renamed from: H3 */
    public static /* synthetic */ String m23077H3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Enabling indications for " + bluetoothGattCharacteristic.getUuid();
    }

    /* renamed from: I3 */
    public static /* synthetic */ String m23071I3() {
        return "gatt.writeDescriptor(" + AbstractC30179xU.f117644f + ", value=0x02-00)";
    }

    /* renamed from: J3 */
    public static /* synthetic */ String m23065J3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", true)";
    }

    /* renamed from: K3 */
    public static /* synthetic */ String m23059K3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Enabling notifications for " + bluetoothGattCharacteristic.getUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K4 */
    public /* synthetic */ void m23058K4(final BluetoothDevice bluetoothDevice, Data data) {
        if (data.m22620d() == 1) {
            final int intValue = data.m22623a(17, 0).intValue();
            this.f100576y = intValue;
            m23028P4(this.f100554c, intValue);
            m22938e5(new InterfaceC26607e() { // from class: rW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3456l(bluetoothDevice, intValue);
                }
            });
        }
    }

    /* renamed from: L3 */
    public static /* synthetic */ String m23053L3() {
        return "gatt.writeDescriptor(" + AbstractC30179xU.f117644f + ", value=0x01-00)";
    }

    /* renamed from: M3 */
    public static /* synthetic */ String m23047M3() {
        return "Executing reliable write...";
    }

    /* renamed from: N3 */
    public static /* synthetic */ String m23041N3() {
        return "gatt.executeReliableWrite()";
    }

    /* renamed from: O3 */
    public static /* synthetic */ String m23035O3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Reading characteristic " + bluetoothGattCharacteristic.getUuid();
    }

    /* renamed from: P3 */
    public static /* synthetic */ String m23029P3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.readCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")";
    }

    /* renamed from: Q3 */
    public static /* synthetic */ String m23023Q3(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Reading descriptor " + bluetoothGattDescriptor.getUuid();
    }

    /* renamed from: R3 */
    public static /* synthetic */ String m23017R3(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "gatt.readDescriptor(" + bluetoothGattDescriptor.getUuid() + ")";
    }

    /* renamed from: S3 */
    public static /* synthetic */ String m23012S3() {
        return "Reading PHY...";
    }

    /* renamed from: T3 */
    public static /* synthetic */ String m23006T3() {
        return "gatt.readPhy()";
    }

    /* renamed from: U3 */
    public static /* synthetic */ String m23000U3() {
        return "Reading remote RSSI...";
    }

    /* renamed from: V2 */
    public static /* synthetic */ String m22995V2() {
        return "Cache refreshed";
    }

    /* renamed from: V3 */
    public static /* synthetic */ String m22994V3() {
        return "gatt.readRemoteRssi()";
    }

    /* renamed from: W2 */
    public static /* synthetic */ String m22989W2() {
        return "Refreshing failed";
    }

    /* renamed from: W3 */
    public static /* synthetic */ String m22988W3() {
        return "Refreshing device cache...";
    }

    /* renamed from: X2 */
    public static /* synthetic */ String m22983X2() {
        return "gatt.close()";
    }

    /* renamed from: X3 */
    public static /* synthetic */ String m22982X3() {
        return "gatt.refresh() (hidden)";
    }

    /* renamed from: Y2 */
    public static /* synthetic */ String m22977Y2() {
        return "device.createBond()";
    }

    /* renamed from: Y3 */
    public static /* synthetic */ String m22976Y3() {
        return "gatt.refresh() method not found";
    }

    /* renamed from: Z2 */
    public static /* synthetic */ String m22971Z2() {
        return "Service Changed characteristic found on a bonded device";
    }

    /* renamed from: Z3 */
    public static /* synthetic */ String m22970Z3() {
        return "Removing bond information...";
    }

    /* renamed from: a3 */
    public static /* synthetic */ String m22965a3(int i) {
        return "Battery Level received: " + i + "%";
    }

    /* renamed from: a4 */
    public static /* synthetic */ String m22964a4() {
        return "Device is not bonded";
    }

    /* renamed from: b4 */
    public static /* synthetic */ String m22958b4() {
        return "device.removeBond() (hidden)";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c3 */
    public /* synthetic */ void m22953c3(final BluetoothDevice bluetoothDevice, Data data) {
        if (data.m22620d() == 1) {
            final int intValue = data.m22623a(17, 0).intValue();
            m23052L4(4, new InterfaceC26609g() { // from class: oW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22965a3;
                    m22965a3 = BleManagerHandler.m22965a3(intValue);
                    return m22965a3;
                }
            });
            this.f100576y = intValue;
            m23028P4(this.f100554c, intValue);
            m22938e5(new InterfaceC26607e() { // from class: pW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3456l(bluetoothDevice, intValue);
                }
            });
        }
    }

    /* renamed from: c4 */
    public static /* synthetic */ String m22952c4(String str) {
        return "Requesting connection priority: " + str + "...";
    }

    /* renamed from: d3 */
    public static /* synthetic */ String m22947d3() {
        return "Aborting reliable write...";
    }

    /* renamed from: d4 */
    public static /* synthetic */ String m22946d4(String str) {
        return "gatt.requestConnectionPriority(" + str + ")";
    }

    /* renamed from: e3 */
    public static /* synthetic */ String m22940e3() {
        return "gatt.abortReliableWrite()";
    }

    /* renamed from: e4 */
    public static /* synthetic */ String m22939e4() {
        return "Requesting new MTU...";
    }

    /* renamed from: f3 */
    public static /* synthetic */ String m22933f3() {
        return "Beginning reliable write...";
    }

    /* renamed from: f4 */
    public static /* synthetic */ String m22932f4(int i) {
        return "gatt.requestMtu(" + i + ")";
    }

    /* renamed from: g3 */
    public static /* synthetic */ String m22926g3() {
        return "gatt.beginReliableWrite()";
    }

    /* renamed from: g4 */
    public static /* synthetic */ String m22925g4() {
        return "Requesting preferred PHYs...";
    }

    /* renamed from: h4 */
    public static /* synthetic */ String m22918h4(int i, int i2, int i3) {
        return "gatt.setPreferredPhy(" + XH3.m77153e(i) + ", " + XH3.m77153e(i2) + ", coding option = " + XH3.m77154d(i3) + ")";
    }

    /* renamed from: i4 */
    public static /* synthetic */ String m22912i4(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Writing characteristic " + bluetoothGattCharacteristic.getUuid() + " (" + XH3.m77150h(bluetoothGattCharacteristic.getWriteType()) + ")";
    }

    /* renamed from: j2 */
    public static BluetoothGattDescriptor m22908j2(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        if (bluetoothGattCharacteristic == null || (i & bluetoothGattCharacteristic.getProperties()) == 0) {
            return null;
        }
        return bluetoothGattCharacteristic.getDescriptor(AbstractC30179xU.f117644f);
    }

    /* renamed from: j3 */
    public static /* synthetic */ String m22907j3(int i) {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + XH3.m77153e(i) + ")";
    }

    /* renamed from: j4 */
    public static /* synthetic */ String m22906j4(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.writeCharacteristic(" + bluetoothGattCharacteristic.getUuid() + ")";
    }

    /* renamed from: k3 */
    public static /* synthetic */ String m22901k3(int i) {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE, " + XH3.m77153e(i) + ")";
    }

    /* renamed from: k4 */
    public static /* synthetic */ String m22900k4(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "Writing descriptor " + bluetoothGattDescriptor.getUuid();
    }

    /* renamed from: l3 */
    public static /* synthetic */ String m22895l3() {
        return "gatt = device.connectGatt(autoConnect = false, TRANSPORT_LE)";
    }

    /* renamed from: l4 */
    public static /* synthetic */ String m22894l4(BluetoothGattDescriptor bluetoothGattDescriptor) {
        return "gatt.writeDescriptor(" + bluetoothGattDescriptor.getUuid() + ")";
    }

    /* renamed from: m3 */
    public static /* synthetic */ String m22889m3() {
        return "gatt.close()";
    }

    /* renamed from: n3 */
    public static /* synthetic */ String m22883n3() {
        return "wait(200)";
    }

    /* renamed from: o3 */
    public static /* synthetic */ String m22878o3() {
        return "Connecting...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o4 */
    public /* synthetic */ void m22877o4(C26666o0 c26666o0, BluetoothDevice bluetoothDevice) {
        if (c26666o0.mo22518D(bluetoothDevice)) {
            this.f100570s = false;
            m23040N4(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p4 */
    public /* synthetic */ void m22871p4(AbstractC26684u0 abstractC26684u0, BluetoothDevice bluetoothDevice) {
        if (this.f100543C == abstractC26684u0) {
            abstractC26684u0.mo22521A(bluetoothDevice, -5);
            m23040N4(true);
        }
    }

    /* renamed from: q1 */
    public static /* synthetic */ int m22868q1(BleManagerHandler bleManagerHandler) {
        int i = bleManagerHandler.f100563l + 1;
        bleManagerHandler.f100563l = i;
        return i;
    }

    /* renamed from: q4 */
    public static /* synthetic */ String m22865q4() {
        return "Cache refreshed";
    }

    /* renamed from: r3 */
    public static /* synthetic */ String m22860r3() {
        return "gatt.connect()";
    }

    /* renamed from: r4 */
    public static /* synthetic */ String m22859r4() {
        return "Discovering Services...";
    }

    /* renamed from: s3 */
    public static /* synthetic */ String m22854s3(C26664n0 c26664n0) {
        return c26664n0.m22598T() ? "Connecting..." : "Retrying...";
    }

    /* renamed from: s4 */
    public static /* synthetic */ String m22853s4() {
        return "gatt.discoverServices()";
    }

    /* renamed from: t3 */
    public static /* synthetic */ String m22848t3() {
        return "Ensuring bonding...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t4 */
    public /* synthetic */ void m22847t4(AbstractC26684u0 abstractC26684u0, BluetoothDevice bluetoothDevice) {
        m23052L4(4, new InterfaceC26609g() { // from class: BV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22865q4;
                m22865q4 = BleManagerHandler.m22865q4();
                return m22865q4;
            }
        });
        abstractC26684u0.mo22518D(bluetoothDevice);
        this.f100543C = null;
        AbstractC26635a<?> abstractC26635a = this.f100548H;
        if (abstractC26635a != null) {
            abstractC26635a.mo22521A(bluetoothDevice, -3);
            this.f100548H = null;
        }
        this.f100557f.clear();
        this.f100558g = null;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (this.f100564m && bluetoothGatt != null) {
            mo3748c5();
            mo22981X4();
            this.f100561j = true;
            this.f100559h = false;
            m23052L4(2, new InterfaceC26609g() { // from class: DV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22859r4;
                    m22859r4 = BleManagerHandler.m22859r4();
                    return m22859r4;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: EV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22853s4;
                    m22853s4 = BleManagerHandler.m22853s4();
                    return m22853s4;
                }
            });
            bluetoothGatt.discoverServices();
        }
    }

    /* renamed from: u3 */
    public static /* synthetic */ String m22842u3() {
        return "Starting bonding...";
    }

    /* renamed from: u4 */
    public static /* synthetic */ String m22841u4(C26697z0 c26697z0) {
        return "sleep(" + c26697z0.m22466J() + ")";
    }

    /* renamed from: v3 */
    public static /* synthetic */ String m22836v3() {
        return "Bond information present on client, skipping bonding";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v4 */
    public /* synthetic */ void m22835v4(C26697z0 c26697z0, BluetoothDevice bluetoothDevice) {
        c26697z0.mo22518D(bluetoothDevice);
        m23040N4(true);
    }

    /* renamed from: w3 */
    public static /* synthetic */ String m22830w3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "gatt.setCharacteristicNotification(" + bluetoothGattCharacteristic.getUuid() + ", false)";
    }

    /* renamed from: w4 */
    public static /* synthetic */ String m22829w4() {
        return "Connection attempt timed out";
    }

    /* renamed from: x3 */
    public static /* synthetic */ String m22824x3(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return "Disabling notifications and indications for " + bluetoothGattCharacteristic.getUuid();
    }

    /* renamed from: y3 */
    public static /* synthetic */ String m22818y3() {
        return "gatt.writeDescriptor(" + AbstractC30179xU.f117644f + ", value=0x00-00)";
    }

    /* renamed from: z3 */
    public static /* synthetic */ String m22812z3(boolean z) {
        return z ? "Disconnecting..." : "Cancelling connection...";
    }

    /* renamed from: z4 */
    public static /* synthetic */ String m22811z4() {
        return "Disconnected";
    }

    /* renamed from: A2 */
    public final boolean m23120A2(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f100564m || (bluetoothGattCharacteristic.getProperties() & 2) == 0) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: HV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23035O3;
                m23035O3 = BleManagerHandler.m23035O3(bluetoothGattCharacteristic);
                return m23035O3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: IV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23029P3;
                m23029P3 = BleManagerHandler.m23029P3(bluetoothGattCharacteristic);
                return m23029P3;
            }
        });
        return bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
    }

    /* renamed from: B2 */
    public final boolean m23114B2(final BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && bluetoothGattDescriptor != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: lW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23023Q3;
                    m23023Q3 = BleManagerHandler.m23023Q3(bluetoothGattDescriptor);
                    return m23023Q3;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: mW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23017R3;
                    m23017R3 = BleManagerHandler.m23017R3(bluetoothGattDescriptor);
                    return m23017R3;
                }
            });
            return bluetoothGatt.readDescriptor(bluetoothGattDescriptor);
        }
        return false;
    }

    /* renamed from: C2 */
    public final boolean m23108C2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: tV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23012S3;
                    m23012S3 = BleManagerHandler.m23012S3();
                    return m23012S3;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: uV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23006T3;
                    m23006T3 = BleManagerHandler.m23006T3();
                    return m23006T3;
                }
            });
            bluetoothGatt.readPhy();
            return true;
        }
        return false;
    }

    /* renamed from: D2 */
    public final boolean m23102D2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: OV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23000U3;
                    m23000U3 = BleManagerHandler.m23000U3();
                    return m23000U3;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: PV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22994V3;
                    m22994V3 = BleManagerHandler.m22994V3();
                    return m22994V3;
                }
            });
            return bluetoothGatt.readRemoteRssi();
        }
        return false;
    }

    /* renamed from: E2 */
    public final boolean m23096E2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: SV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22988W3;
                m22988W3 = BleManagerHandler.m22988W3();
                return m22988W3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: TV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22982X3;
                m22982X3 = BleManagerHandler.m22982X3();
                return m22982X3;
            }
        });
        try {
            if (bluetoothGatt.getClass().getMethod("refresh", new Class[0]).invoke(bluetoothGatt, new Object[0]) != Boolean.TRUE) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.w("BleManager", "An exception occurred while refreshing device", e);
            m23052L4(5, new InterfaceC26609g() { // from class: UV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22976Y3;
                    m22976Y3 = BleManagerHandler.m22976Y3();
                    return m22976Y3;
                }
            });
            return false;
        }
    }

    /* renamed from: F2 */
    public final boolean m23090F2() {
        BluetoothDevice bluetoothDevice = this.f100553b;
        if (bluetoothDevice == null) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: bW
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22970Z3;
                m22970Z3 = BleManagerHandler.m22970Z3();
                return m22970Z3;
            }
        });
        if (bluetoothDevice.getBondState() == 10) {
            m23052L4(5, new InterfaceC26609g() { // from class: cW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22964a4;
                    m22964a4 = BleManagerHandler.m22964a4();
                    return m22964a4;
                }
            });
            this.f100543C.mo22518D(bluetoothDevice);
            m23040N4(true);
            return true;
        }
        try {
            Method method = bluetoothDevice.getClass().getMethod("removeBond", new Class[0]);
            m23052L4(3, new InterfaceC26609g() { // from class: dW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22958b4;
                    m22958b4 = BleManagerHandler.m22958b4();
                    return m22958b4;
                }
            });
            this.f100567p = true;
            if (method.invoke(bluetoothDevice, new Object[0]) != Boolean.TRUE) {
                return false;
            }
            return true;
        } catch (Exception e) {
            Log.w("BleManager", "An exception occurred while removing bond", e);
            return false;
        }
    }

    /* renamed from: G2 */
    public final boolean m23084G2(int i) {
        final String str;
        final String str2;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            if (i != 1) {
                if (i != 2) {
                    str = "BALANCED (30–50ms, 0, 20s)";
                    str2 = "BALANCED";
                } else {
                    str = "LOW POWER (100–125ms, 2, 20s)";
                    str2 = "LOW POWER";
                }
            } else {
                str = "HIGH (11.25–15ms, 0, 20s)";
                str2 = "HIGH";
            }
            m23052L4(2, new InterfaceC26609g() { // from class: nV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22952c4;
                    m22952c4 = BleManagerHandler.m22952c4(str);
                    return m22952c4;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: oV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22946d4;
                    m22946d4 = BleManagerHandler.m22946d4(str2);
                    return m22946d4;
                }
            });
            return bluetoothGatt.requestConnectionPriority(i);
        }
        return false;
    }

    /* renamed from: H2 */
    public final boolean m23078H2(final int i) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: JV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22939e4;
                    m22939e4 = BleManagerHandler.m22939e4();
                    return m22939e4;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: KV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22932f4;
                    m22932f4 = BleManagerHandler.m22932f4(i);
                    return m22932f4;
                }
            });
            return bluetoothGatt.requestMtu(i);
        }
        return false;
    }

    /* renamed from: I2 */
    public final boolean m23072I2(BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) {
        return false;
    }

    @Deprecated
    /* renamed from: J2 */
    public final boolean m23066J2(boolean z) {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || !this.f100564m || (service = bluetoothGatt.getService(AbstractC30179xU.f117645g)) == null) {
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(AbstractC30179xU.f117646h);
        if (z) {
            return m22825x2(characteristic);
        }
        return m22843u2(characteristic);
    }

    /* renamed from: K2 */
    public final boolean m23060K2(final int i, final int i2, final int i3) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: eW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22925g4;
                    m22925g4 = BleManagerHandler.m22925g4();
                    return m22925g4;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: fW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22918h4;
                    m22918h4 = BleManagerHandler.m22918h4(i, i2, i3);
                    return m22918h4;
                }
            });
            bluetoothGatt.setPreferredPhy(i, i2, i3);
            return true;
        }
        return false;
    }

    /* renamed from: L2 */
    public final boolean m23054L2(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f100564m || (bluetoothGattCharacteristic.getProperties() & 12) == 0) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: LV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22912i4;
                m22912i4 = BleManagerHandler.m22912i4(bluetoothGattCharacteristic);
                return m22912i4;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: MV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22906j4;
                m22906j4 = BleManagerHandler.m22906j4(bluetoothGattCharacteristic);
                return m22906j4;
            }
        });
        return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
    }

    /* renamed from: L4 */
    public final void m23052L4(int i, InterfaceC26609g interfaceC26609g) {
        if (i >= this.f100555d.mo3767D()) {
            this.f100555d.mo3766H(i, interfaceC26609g.mo1308a());
        }
    }

    /* renamed from: M2 */
    public final boolean m23048M2(final BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (this.f100554c != null && bluetoothGattDescriptor != null && this.f100564m) {
            m23052L4(2, new InterfaceC26609g() { // from class: VV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22900k4;
                    m22900k4 = BleManagerHandler.m22900k4(bluetoothGattDescriptor);
                    return m22900k4;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: WV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22894l4;
                    m22894l4 = BleManagerHandler.m22894l4(bluetoothGattDescriptor);
                    return m22894l4;
                }
            });
            return m23042N2(bluetoothGattDescriptor);
        }
        return false;
    }

    /* renamed from: M4 */
    public final int m23046M4(int i) {
        if (i != 0) {
            if (i != 8) {
                if (i != 19) {
                    return i != 22 ? -1 : 1;
                }
                return 2;
            }
            return 10;
        }
        return 0;
    }

    /* renamed from: N2 */
    public final boolean m23042N2(BluetoothGattDescriptor bluetoothGattDescriptor) {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && bluetoothGattDescriptor != null && this.f100564m) {
            BluetoothGattCharacteristic characteristic = bluetoothGattDescriptor.getCharacteristic();
            int writeType = characteristic.getWriteType();
            characteristic.setWriteType(2);
            boolean writeDescriptor = bluetoothGatt.writeDescriptor(bluetoothGattDescriptor);
            characteristic.setWriteType(writeType);
            return writeDescriptor;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0319 A[Catch: all -> 0x0372, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034e A[Catch: all -> 0x0372, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003a A[Catch: Exception -> 0x0045, all -> 0x0372, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0048 A[Catch: all -> 0x0372, TRY_ENTER, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[Catch: all -> 0x0372, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fb A[Catch: all -> 0x0372, TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:11:0x0010, B:12:0x0012, B:16:0x0018, B:18:0x001b, B:20:0x001f, B:22:0x0025, B:26:0x003a, B:28:0x003e, B:32:0x0048, B:34:0x004c, B:36:0x0057, B:37:0x0067, B:39:0x006b, B:40:0x0074, B:42:0x007d, B:45:0x0086, B:47:0x0090, B:60:0x00b4, B:63:0x00ba, B:65:0x00be, B:70:0x00ca, B:72:0x00ce, B:74:0x00d7, B:77:0x00e2, B:79:0x00ea, B:81:0x00f5, B:83:0x00fb, B:86:0x010b, B:90:0x011d, B:197:0x0348, B:204:0x035c, B:200:0x034e, B:92:0x0122, B:94:0x013c, B:96:0x0142, B:97:0x014c, B:99:0x0152, B:100:0x015e, B:102:0x0165, B:103:0x016b, B:105:0x016f, B:108:0x017a, B:110:0x0181, B:111:0x0193, B:113:0x0197, B:116:0x01a2, B:120:0x01ac, B:122:0x01b8, B:123:0x01c2, B:124:0x01c6, B:126:0x01d1, B:127:0x01db, B:129:0x01df, B:132:0x01ec, B:133:0x01f2, B:134:0x01f8, B:135:0x01fe, B:136:0x0204, B:137:0x020c, B:138:0x0214, B:139:0x021c, B:140:0x0224, B:141:0x022a, B:142:0x0230, B:144:0x0236, B:147:0x0240, B:149:0x0247, B:151:0x024b, B:153:0x0251, B:155:0x026a, B:154:0x025f, B:156:0x0272, B:158:0x0279, B:160:0x027d, B:162:0x0283, B:164:0x029c, B:163:0x0291, B:165:0x02a4, B:167:0x02ab, B:168:0x02b4, B:169:0x02ba, B:170:0x02c2, B:172:0x02c9, B:173:0x02d9, B:174:0x02de, B:175:0x02e5, B:178:0x02ee, B:179:0x02f3, B:180:0x02f8, B:181:0x02fd, B:182:0x0302, B:183:0x0312, B:185:0x0319, B:187:0x0326, B:189:0x032c, B:190:0x0335, B:194:0x0340, B:85:0x0108, B:207:0x0368, B:23:0x0030), top: B:214:0x0005, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0106  */
    /* JADX WARN: Type inference failed for: r3v2, types: [no.nordicsemi.android.ble.u0] */
    /* JADX WARN: Type inference failed for: r3v4, types: [no.nordicsemi.android.ble.u0] */
    @SuppressLint({"MissingPermission"})
    /* renamed from: N4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void m23040N4(boolean z) {
        final AbstractC26684u0 abstractC26684u0;
        boolean z2;
        int i;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        int i2;
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        C26689v0 c26689v0;
        if (z) {
            if (this.f100566o) {
                this.f100566o = this.f100548H != null;
            }
        }
        if (this.f100566o) {
            return;
        }
        final BluetoothDevice bluetoothDevice = this.f100553b;
        try {
            c26689v0 = this.f100544D;
        } catch (Exception unused) {
        }
        if (c26689v0 != null) {
            if (c26689v0.mo22482M()) {
                abstractC26684u0 = this.f100544D.mo22483L().mo22469G(this);
                if (abstractC26684u0 == null) {
                    Deque<AbstractC26684u0> deque = this.f100558g;
                    if (deque != null) {
                        abstractC26684u0 = deque.poll();
                    }
                    abstractC26684u0 = null;
                }
                if (abstractC26684u0 == null) {
                    if (this.f100558g != null) {
                        this.f100558g = null;
                        this.f100566o = true;
                        this.f100565n = true;
                        mo22975Y4();
                        if (bluetoothDevice != null) {
                            m22938e5(new InterfaceC26607e() { // from class: KU
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                                /* renamed from: a */
                                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                                    interfaceC30597yU.mo3467a(bluetoothDevice);
                                }
                            });
                            m22931f5(new InterfaceC26608f() { // from class: LU
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                                /* renamed from: a */
                                public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                                    interfaceC46590oy0.mo18378a(bluetoothDevice);
                                }
                            });
                        }
                        C26664n0 c26664n0 = this.f100542B;
                        if (c26664n0 != null) {
                            c26664n0.mo22518D(c26664n0.m22602P());
                            this.f100542B = null;
                        }
                    }
                    try {
                        abstractC26684u0 = this.f100557f.remove();
                    } catch (Exception unused2) {
                        this.f100566o = false;
                        this.f100543C = null;
                        mo22963a5();
                        return;
                    }
                }
                this.f100566o = true;
                this.f100543C = abstractC26684u0;
                if (abstractC26684u0 instanceof AbstractC26635a) {
                    z2 = false;
                } else {
                    AbstractC26635a<?> abstractC26635a = abstractC26684u0;
                    int i3 = C26605c.f100581a[abstractC26684u0.f100694d.ordinal()];
                    z2 = this.f100564m && bluetoothDevice != null && ((bluetoothGattCharacteristic2 = abstractC26635a.f100695e) == null || ((i3 != 3 ? i3 != 4 ? i3 != 5 ? i3 != 6 ? 0 : 76 : 2 : 32 : 16) & bluetoothGattCharacteristic2.getProperties()) != 0);
                    if (z2) {
                        if (abstractC26635a instanceof C26662m0) {
                            C26662m0 c26662m0 = (C26662m0) abstractC26635a;
                            if (c26662m0.m22609R()) {
                                c26662m0.mo22519C(bluetoothDevice);
                                c26662m0.mo22518D(bluetoothDevice);
                                m23040N4(true);
                                return;
                            }
                        }
                        this.f100548H = abstractC26635a;
                        if (abstractC26635a.m22630L() != null) {
                            abstractC26635a.mo22519C(bluetoothDevice);
                            abstractC26684u0 = abstractC26635a.m22630L();
                            this.f100543C = abstractC26684u0;
                        }
                    }
                }
                if (abstractC26684u0.f100694d != AbstractC26684u0.EnumC26687c.CONNECT) {
                    C26664n0 c26664n02 = abstractC26684u0;
                    c26664n02.mo22519C(c26664n02.m22602P());
                } else if (bluetoothDevice != null) {
                    abstractC26684u0.mo22519C(bluetoothDevice);
                } else {
                    abstractC26684u0.mo22520B();
                    this.f100548H = null;
                    m23040N4(true);
                    return;
                }
                i = C26605c.f100581a[abstractC26684u0.f100694d.ordinal()];
                if (i == 1 && i != 2) {
                    switch (i) {
                        case 7:
                            C26664n0 c26664n03 = abstractC26684u0;
                            this.f100542B = c26664n03;
                            this.f100543C = null;
                            z2 = m22861r2(c26664n03.m22602P(), c26664n03);
                            break;
                        case 8:
                            z2 = m22837v2(0);
                            break;
                        case 9:
                            z2 = m22855s2(true);
                            break;
                        case 10:
                            z2 = m22855s2(false);
                            break;
                        case 11:
                            z2 = m23090F2();
                            break;
                        case 12:
                            this.f100544D = (C26689v0) abstractC26684u0;
                            m23040N4(true);
                            return;
                        case 13:
                            z2 = m23120A2(abstractC26684u0.f100695e);
                            break;
                        case 14:
                            C26613D0 c26613d0 = abstractC26684u0;
                            BluetoothGattCharacteristic bluetoothGattCharacteristic3 = abstractC26684u0.f100695e;
                            if (bluetoothGattCharacteristic3 != null) {
                                bluetoothGattCharacteristic3.setValue(c26613d0.m22642N(this.f100572u));
                                bluetoothGattCharacteristic3.setWriteType(c26613d0.m22641O());
                            }
                            z2 = m23054L2(bluetoothGattCharacteristic3);
                            break;
                        case 15:
                            z2 = m23114B2(abstractC26684u0.f100696f);
                            break;
                        case 16:
                            C26613D0 c26613d02 = abstractC26684u0;
                            BluetoothGattDescriptor bluetoothGattDescriptor = abstractC26684u0.f100696f;
                            if (bluetoothGattDescriptor != null) {
                                bluetoothGattDescriptor.setValue(c26613d02.m22642N(this.f100572u));
                            }
                            z2 = m23048M2(bluetoothGattDescriptor);
                            break;
                        case 17:
                            C26691w0 c26691w0 = abstractC26684u0;
                            BluetoothGattCharacteristic bluetoothGattCharacteristic4 = c26691w0.f100695e;
                            if (bluetoothGattCharacteristic4 != null) {
                                Map<BluetoothGattCharacteristic, byte[]> map = this.f100577z;
                                if (map != null && map.containsKey(bluetoothGattCharacteristic4)) {
                                    this.f100577z.put(c26691w0.f100695e, c26691w0.m22475J(this.f100572u));
                                } else {
                                    c26691w0.f100695e.setValue(c26691w0.m22475J(this.f100572u));
                                }
                                c26691w0.mo22518D(bluetoothDevice);
                                m23040N4(true);
                                z2 = true;
                                break;
                            }
                            break;
                        case 18:
                            C26691w0 c26691w02 = abstractC26684u0;
                            BluetoothGattDescriptor bluetoothGattDescriptor2 = c26691w02.f100696f;
                            if (bluetoothGattDescriptor2 != null) {
                                Map<BluetoothGattDescriptor, byte[]> map2 = this.f100541A;
                                if (map2 != null && map2.containsKey(bluetoothGattDescriptor2)) {
                                    this.f100541A.put(c26691w02.f100696f, c26691w02.m22475J(this.f100572u));
                                } else {
                                    c26691w02.f100696f.setValue(c26691w02.m22475J(this.f100572u));
                                }
                                c26691w02.mo22518D(bluetoothDevice);
                                m23040N4(true);
                                z2 = true;
                                break;
                            }
                            break;
                        case 19:
                            z2 = m22867q2();
                            if (z2) {
                                this.f100543C.mo22518D(bluetoothDevice);
                                m23040N4(true);
                                return;
                            }
                            break;
                        case 20:
                            z2 = m22819y2();
                            break;
                        case 21:
                            z2 = m22873p2();
                            break;
                        case 22:
                            z2 = m22825x2(abstractC26684u0.f100695e);
                            break;
                        case 23:
                            z2 = m22831w2(abstractC26684u0.f100695e);
                            break;
                        case 24:
                            z2 = m22843u2(abstractC26684u0.f100695e);
                            break;
                        case 25:
                            z2 = m22849t2(abstractC26684u0.f100695e);
                            break;
                        case 26:
                            z2 = m22813z2();
                            break;
                        case 27:
                            z2 = m23066J2(true);
                            break;
                        case 28:
                            z2 = m23066J2(false);
                            break;
                        case 29:
                            z2 = m22927g2();
                            break;
                        case 30:
                            C26670q0 c26670q0 = abstractC26684u0;
                            if (this.f100572u != c26670q0.m22575L()) {
                                z2 = m23078H2(c26670q0.m22575L());
                                break;
                            } else {
                                z2 = this.f100564m;
                                if (z2) {
                                    c26670q0.m22572O(bluetoothDevice, this.f100572u);
                                    c26670q0.mo22518D(bluetoothDevice);
                                    m23040N4(true);
                                    return;
                                }
                            }
                            break;
                        case 31:
                            final C26666o0 c26666o0 = abstractC26684u0;
                            this.f100570s = Build.VERSION.SDK_INT >= 26;
                            z2 = m23084G2(c26666o0.m22590K());
                            if (z2) {
                                mo22491c(new Runnable() { // from class: MU
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BleManagerHandler.this.m22877o4(c26666o0, bluetoothDevice);
                                    }
                                }, 200L);
                                break;
                            } else {
                                this.f100570s = false;
                                break;
                            }
                        case 32:
                            C26672r0 c26672r0 = abstractC26684u0;
                            if (Build.VERSION.SDK_INT >= 26) {
                                z2 = m23060K2(c26672r0.m22563O(), c26672r0.m22564N(), c26672r0.m22565M());
                                break;
                            } else {
                                z2 = this.f100564m;
                                if (z2) {
                                    c26672r0.m22559S(bluetoothDevice);
                                    c26672r0.mo22518D(bluetoothDevice);
                                    m23040N4(true);
                                    return;
                                }
                            }
                            break;
                        case 33:
                            C26672r0 c26672r02 = abstractC26684u0;
                            if (Build.VERSION.SDK_INT >= 26) {
                                z2 = m23108C2();
                                break;
                            } else {
                                z2 = this.f100564m;
                                if (z2) {
                                    c26672r02.m22559S(bluetoothDevice);
                                    c26672r02.mo22518D(bluetoothDevice);
                                    m23040N4(true);
                                    return;
                                }
                            }
                            break;
                        case 34:
                            z2 = m23102D2();
                            if (z2) {
                                mo22491c(new Runnable() { // from class: NU
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BleManagerHandler.this.m22871p4(abstractC26684u0, bluetoothDevice);
                                    }
                                }, 1000L);
                                break;
                            }
                            break;
                        case 35:
                            z2 = m23096E2();
                            if (z2) {
                                mo22491c(new Runnable() { // from class: OU
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BleManagerHandler.this.m22847t4(abstractC26684u0, bluetoothDevice);
                                    }
                                }, 200L);
                                break;
                            }
                            break;
                        case 36:
                            final C26697z0 c26697z0 = abstractC26684u0;
                            m23052L4(3, new InterfaceC26609g() { // from class: PU
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                /* renamed from: a */
                                public final String mo1308a() {
                                    String m22841u4;
                                    m22841u4 = BleManagerHandler.m22841u4(C26697z0.this);
                                    return m22841u4;
                                }
                            });
                            mo22491c(new Runnable() { // from class: QU
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BleManagerHandler.this.m22835v4(c26697z0, bluetoothDevice);
                                }
                            }, c26697z0.m22466J());
                            z2 = true;
                            break;
                    }
                } else {
                    C26613D0 c26613d03 = abstractC26684u0;
                    bluetoothGattCharacteristic = abstractC26684u0.f100695e;
                    if (bluetoothGattCharacteristic != null) {
                        bluetoothGattCharacteristic.setValue(c26613d03.m22642N(this.f100572u));
                        Map<BluetoothGattCharacteristic, byte[]> map3 = this.f100577z;
                        if (map3 != null && map3.containsKey(bluetoothGattCharacteristic)) {
                            this.f100577z.put(bluetoothGattCharacteristic, bluetoothGattCharacteristic.getValue());
                        }
                    }
                    z2 = m23072I2(abstractC26684u0.f100695e, abstractC26684u0.f100694d != AbstractC26684u0.EnumC26687c.INDICATE);
                }
                if (!z2 && bluetoothDevice != null) {
                    if (this.f100564m) {
                        i2 = BluetoothAdapter.getDefaultAdapter().isEnabled() ? -1 : -100;
                    } else {
                        i2 = -3;
                    }
                    abstractC26684u0.mo22521A(bluetoothDevice, i2);
                    this.f100548H = null;
                    this.f100570s = false;
                    m23040N4(true);
                }
            }
            this.f100544D.mo22518D(bluetoothDevice);
            this.f100544D = null;
        }
        abstractC26684u0 = null;
        if (abstractC26684u0 == null) {
        }
        if (abstractC26684u0 == null) {
        }
        this.f100566o = true;
        this.f100543C = abstractC26684u0;
        if (abstractC26684u0 instanceof AbstractC26635a) {
        }
        if (abstractC26684u0.f100694d != AbstractC26684u0.EnumC26687c.CONNECT) {
        }
        i = C26605c.f100581a[abstractC26684u0.f100694d.ordinal()];
        if (i == 1) {
        }
        C26613D0 c26613d032 = abstractC26684u0;
        bluetoothGattCharacteristic = abstractC26684u0.f100695e;
        if (bluetoothGattCharacteristic != null) {
        }
        z2 = m23072I2(abstractC26684u0.f100695e, abstractC26684u0.f100694d != AbstractC26684u0.EnumC26687c.INDICATE);
        if (!z2) {
            if (this.f100564m) {
            }
            abstractC26684u0.mo22521A(bluetoothDevice, i2);
            this.f100548H = null;
            this.f100570s = false;
            m23040N4(true);
        }
    }

    @Deprecated
    /* renamed from: O2 */
    public final boolean m23036O2(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null && AbstractC30179xU.f117646h.equals(bluetoothGattCharacteristic.getUuid())) {
            return true;
        }
        return false;
    }

    /* renamed from: O4 */
    public final void m23034O4(final BluetoothDevice bluetoothDevice, final int i) {
        boolean z = this.f100564m;
        this.f100564m = false;
        this.f100559h = false;
        this.f100561j = false;
        this.f100560i = false;
        this.f100572u = 23;
        this.f100575x = 0;
        this.f100574w = 0;
        this.f100573v = 0;
        this.f100569r = 0;
        m22954c2();
        if (!z) {
            m23052L4(5, new InterfaceC26609g() { // from class: NV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22829w4;
                    m22829w4 = BleManagerHandler.m22829w4();
                    return m22829w4;
                }
            });
            m22948d2();
            m22938e5(new InterfaceC26607e() { // from class: YV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3455m(bluetoothDevice);
                }
            });
            m22931f5(new InterfaceC26608f() { // from class: jW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                /* renamed from: a */
                public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                    interfaceC46590oy0.mo18373f(bluetoothDevice, i);
                }
            });
        } else if (this.f100567p) {
            m23052L4(4, new InterfaceC26609g() { // from class: sW
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22811z4;
                    m22811z4 = BleManagerHandler.m22811z4();
                    return m22811z4;
                }
            });
            AbstractC26684u0 abstractC26684u0 = this.f100543C;
            if (abstractC26684u0 == null || abstractC26684u0.f100694d != AbstractC26684u0.EnumC26687c.REMOVE_BOND) {
                m22948d2();
            }
            m22938e5(new InterfaceC26607e() { // from class: DU
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3455m(bluetoothDevice);
                }
            });
            m22931f5(new InterfaceC26608f() { // from class: EU
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                /* renamed from: a */
                public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                    interfaceC46590oy0.mo18374e(bluetoothDevice, i);
                }
            });
            AbstractC26684u0 abstractC26684u02 = this.f100543C;
            if (abstractC26684u02 != null && abstractC26684u02.f100694d == AbstractC26684u0.EnumC26687c.DISCONNECT) {
                abstractC26684u02.mo22518D(bluetoothDevice);
                this.f100543C = null;
            }
        } else {
            m23052L4(5, new InterfaceC26609g() { // from class: FU
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23106C4;
                    m23106C4 = BleManagerHandler.m23106C4();
                    return m23106C4;
                }
            });
            m22938e5(new InterfaceC26607e() { // from class: GU
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3457k(bluetoothDevice);
                }
            });
            final int i2 = 2;
            if (i != 2) {
                i2 = 3;
            }
            m22931f5(new InterfaceC26608f() { // from class: HU
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                /* renamed from: a */
                public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                    interfaceC46590oy0.mo18374e(bluetoothDevice, i2);
                }
            });
        }
        for (C32636Ej6 c32636Ej6 : this.f100545E.values()) {
            c32636Ej6.m108554e();
        }
        this.f100545E.clear();
        this.f100547G = null;
        this.f100576y = -1;
        mo3748c5();
        mo22981X4();
    }

    /* renamed from: P2 */
    public final boolean m23030P2(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor != null && AbstractC30179xU.f117644f.equals(bluetoothGattDescriptor.getUuid())) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: P4 */
    public void m23028P4(BluetoothGatt bluetoothGatt, int i) {
    }

    /* renamed from: Q2 */
    public final boolean m23024Q2() {
        return this.f100564m;
    }

    @Deprecated
    /* renamed from: Q4 */
    public void m23022Q4(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* renamed from: R2 */
    public boolean m23018R2(BluetoothGatt bluetoothGatt) {
        return false;
    }

    @Deprecated
    /* renamed from: R4 */
    public void m23016R4(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* renamed from: S2 */
    public abstract boolean mo3749S2(BluetoothGatt bluetoothGatt);

    @Deprecated
    /* renamed from: S4 */
    public void m23011S4(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* renamed from: T2 */
    public final boolean m23007T2(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor != null && AbstractC30179xU.f117648j.equals(bluetoothGattDescriptor.getCharacteristic().getUuid())) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: T4 */
    public void m23005T4(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
    }

    /* renamed from: U2 */
    public final boolean m23001U2(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic != null && AbstractC30179xU.f117648j.equals(bluetoothGattCharacteristic.getUuid())) {
            return true;
        }
        return false;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: U4 */
    public void m22999U4(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
    }

    @Deprecated
    /* renamed from: V4 */
    public void m22993V4(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Deprecated
    /* renamed from: W4 */
    public void m22987W4(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor) {
    }

    @Deprecated
    /* renamed from: X4 */
    public void mo22981X4() {
    }

    /* renamed from: Y4 */
    public void mo22975Y4() {
    }

    /* renamed from: Z4 */
    public final void m22969Z4(final BluetoothDevice bluetoothDevice, final String str, final int i) {
        m23052L4(6, new InterfaceC26609g() { // from class: rV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23088F4;
                m23088F4 = BleManagerHandler.m23088F4(i);
                return m23088F4;
            }
        });
        m22938e5(new InterfaceC26607e() { // from class: CV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
            /* renamed from: a */
            public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                interfaceC30597yU.mo3459i(bluetoothDevice, str, i);
            }
        });
    }

    @Override // p000.L80
    /* renamed from: a */
    public void mo22493a(Runnable runnable) {
        this.f100556e.removeCallbacks(runnable);
    }

    /* renamed from: a5 */
    public void mo22963a5() {
    }

    @Override // p000.L80
    /* renamed from: b */
    public void mo22492b(Runnable runnable) {
        this.f100556e.post(runnable);
    }

    @Deprecated
    /* renamed from: b5 */
    public void m22957b5(BluetoothGatt bluetoothGatt, int i) {
    }

    @Override // p000.L80
    /* renamed from: c */
    public void mo22491c(Runnable runnable, long j) {
        this.f100556e.postDelayed(runnable, j);
    }

    /* renamed from: c2 */
    public final boolean m22954c2() {
        AbstractC26635a<?> abstractC26635a = this.f100548H;
        if (abstractC26635a instanceof C26662m0) {
            C26662m0 c26662m0 = (C26662m0) abstractC26635a;
            if (c26662m0.m22609R()) {
                c26662m0.mo22518D(this.f100553b);
                this.f100548H = null;
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: c5 */
    public abstract void mo3748c5();

    @Override // p000.QI4
    /* renamed from: d */
    public final void mo22951d() {
        this.f100557f.clear();
        this.f100558g = null;
        BluetoothDevice bluetoothDevice = this.f100553b;
        if (bluetoothDevice == null) {
            return;
        }
        AbstractC26635a<?> abstractC26635a = this.f100548H;
        if (abstractC26635a != null) {
            abstractC26635a.mo22521A(bluetoothDevice, -7);
        }
        AbstractC26684u0 abstractC26684u0 = this.f100543C;
        if (abstractC26684u0 != null && this.f100548H != abstractC26684u0) {
            abstractC26684u0.mo22521A(bluetoothDevice, -7);
            this.f100543C = null;
        }
        this.f100548H = null;
        C26689v0 c26689v0 = this.f100544D;
        if (c26689v0 != null) {
            c26689v0.mo22521A(bluetoothDevice, -7);
            this.f100544D = null;
        }
        C26664n0 c26664n0 = this.f100542B;
        if (c26664n0 != null) {
            c26664n0.mo22521A(bluetoothDevice, -7);
            this.f100542B = null;
            m22837v2(5);
            return;
        }
        m23040N4(true);
    }

    /* renamed from: d2 */
    public void m22948d2() {
        try {
            Context m5234B = this.f100555d.m5234B();
            m5234B.unregisterReceiver(this.f100549I);
            m5234B.unregisterReceiver(this.f100550J);
        } catch (Exception unused) {
        }
        synchronized (this.f100552a) {
            if (this.f100554c != null) {
                if (this.f100555d.m5224O()) {
                    if (m23096E2()) {
                        m23052L4(4, new InterfaceC26609g() { // from class: gW
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22995V2;
                                m22995V2 = BleManagerHandler.m22995V2();
                                return m22995V2;
                            }
                        });
                    } else {
                        m23052L4(5, new InterfaceC26609g() { // from class: hW
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22989W2;
                                m22989W2 = BleManagerHandler.m22989W2();
                                return m22989W2;
                            }
                        });
                    }
                }
                m23052L4(3, new InterfaceC26609g() { // from class: iW
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22983X2;
                        m22983X2 = BleManagerHandler.m22983X2();
                        return m22983X2;
                    }
                });
                try {
                    this.f100554c.close();
                } catch (Throwable unused2) {
                }
                this.f100554c = null;
            }
            this.f100571t = false;
            this.f100568q = false;
            this.f100557f.clear();
            this.f100558g = null;
            this.f100553b = null;
            this.f100564m = false;
        }
    }

    /* renamed from: d5 */
    public final void m22945d5(InterfaceC26606d interfaceC26606d) {
        this.f100555d.getClass();
    }

    @Override // p000.QI4
    /* renamed from: e */
    public final void mo22944e(AbstractC26684u0 abstractC26684u0) {
        Deque<AbstractC26684u0> deque = this.f100558g;
        if (deque == null) {
            deque = this.f100557f;
        }
        deque.add(abstractC26684u0);
        abstractC26684u0.f100704n = true;
        m23040N4(false);
    }

    /* renamed from: e2 */
    public final boolean m22941e2(BluetoothDevice bluetoothDevice) {
        m23052L4(3, new InterfaceC26609g() { // from class: nW
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22977Y2;
                m22977Y2 = BleManagerHandler.m22977Y2();
                return m22977Y2;
            }
        });
        return bluetoothDevice.createBond();
    }

    @Deprecated
    /* renamed from: e5 */
    public final void m22938e5(final InterfaceC26607e interfaceC26607e) {
        final InterfaceC30597yU interfaceC30597yU = this.f100555d.f117651c;
        if (interfaceC30597yU != null) {
            mo22492b(new Runnable() { // from class: IU
                @Override // java.lang.Runnable
                public final void run() {
                    BleManagerHandler.InterfaceC26607e.this.mo15838a(interfaceC30597yU);
                }
            });
        }
    }

    @Override // p000.QI4
    /* renamed from: f */
    public final void mo22937f(AbstractC26599A0 abstractC26599A0) {
        this.f100543C = null;
        this.f100548H = null;
        AbstractC26684u0.EnumC26687c enumC26687c = abstractC26599A0.f100694d;
        if (enumC26687c == AbstractC26684u0.EnumC26687c.CONNECT) {
            this.f100542B = null;
            m22837v2(10);
        } else if (enumC26687c == AbstractC26684u0.EnumC26687c.DISCONNECT) {
            m22948d2();
        } else {
            m23040N4(true);
        }
    }

    /* renamed from: f2 */
    public final void m22934f2(AbstractC26684u0 abstractC26684u0) {
        C26689v0 c26689v0 = this.f100544D;
        if (c26689v0 == null) {
            Deque<AbstractC26684u0> deque = this.f100558g;
            if (deque == null) {
                deque = this.f100557f;
            }
            deque.addFirst(abstractC26684u0);
        } else {
            c26689v0.m22487H(abstractC26684u0);
        }
        abstractC26684u0.f100704n = true;
        this.f100566o = false;
    }

    /* renamed from: f5 */
    public final void m22931f5(final InterfaceC26608f interfaceC26608f) {
        final InterfaceC46590oy0 interfaceC46590oy0 = this.f100555d.f117652d;
        if (interfaceC46590oy0 != null) {
            mo22492b(new Runnable() { // from class: JU
                @Override // java.lang.Runnable
                public final void run() {
                    BleManagerHandler.InterfaceC26608f.this.mo22631a(interfaceC46590oy0);
                }
            });
        }
    }

    /* renamed from: g2 */
    public final boolean m22927g2() {
        BluetoothGattService service;
        BluetoothGattCharacteristic characteristic;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || !this.f100564m || bluetoothGatt.getDevice().getBondState() != 12 || (service = bluetoothGatt.getService(AbstractC30179xU.f117647i)) == null || (characteristic = service.getCharacteristic(AbstractC30179xU.f117648j)) == null) {
            return false;
        }
        m23052L4(4, new InterfaceC26609g() { // from class: aW
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22971Z2;
                m22971Z2 = BleManagerHandler.m22971Z2();
                return m22971Z2;
            }
        });
        return m22831w2(characteristic);
    }

    @Deprecated
    /* renamed from: g5 */
    public void m22924g5() {
        if (this.f100547G == null) {
            this.f100547G = new C32636Ej6(this).m108551h(new QS0() { // from class: qW
                @Override // p000.QS0
                /* renamed from: b */
                public final void mo3746b(BluetoothDevice bluetoothDevice, Data data) {
                    BleManagerHandler.this.m23058K4(bluetoothDevice, data);
                }
            });
        }
    }

    @Deprecated
    /* renamed from: h2 */
    public QS0 m22920h2() {
        return new QS0() { // from class: kW
            @Override // p000.QS0
            /* renamed from: b */
            public final void mo3746b(BluetoothDevice bluetoothDevice, Data data) {
                BleManagerHandler.this.m22953c3(bluetoothDevice, data);
            }
        };
    }

    /* renamed from: i2 */
    public BluetoothDevice m22914i2() {
        return this.f100553b;
    }

    /* renamed from: k2 */
    public final int m22902k2() {
        return this.f100569r;
    }

    /* renamed from: l2 */
    public C32636Ej6 m22896l2(Object obj) {
        C32636Ej6 c32636Ej6 = this.f100545E.get(obj);
        if (c32636Ej6 == null) {
            c32636Ej6 = new C32636Ej6(this);
            if (obj != null) {
                this.f100545E.put(obj, c32636Ej6);
            }
        } else if (this.f100553b != null) {
            c32636Ej6.m108554e();
        }
        return c32636Ej6;
    }

    /* renamed from: m2 */
    public void m22890m2(AbstractC30179xU abstractC30179xU, Handler handler) {
        this.f100555d = abstractC30179xU;
        this.f100556e = handler;
    }

    @Deprecated
    /* renamed from: n2 */
    public Deque<AbstractC26684u0> m22884n2(BluetoothGatt bluetoothGatt) {
        return null;
    }

    /* renamed from: o2 */
    public void mo3747o2() {
    }

    /* renamed from: p2 */
    public final boolean m22873p2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || !this.f100564m || !this.f100571t) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: QV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22947d3;
                m22947d3 = BleManagerHandler.m22947d3();
                return m22947d3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: RV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22940e3;
                m22940e3 = BleManagerHandler.m22940e3();
                return m22940e3;
            }
        });
        bluetoothGatt.abortReliableWrite();
        return true;
    }

    /* renamed from: q2 */
    public final boolean m22867q2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null && this.f100564m) {
            if (this.f100571t) {
                return true;
            }
            m23052L4(2, new InterfaceC26609g() { // from class: FV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22933f3;
                    m22933f3 = BleManagerHandler.m22933f3();
                    return m22933f3;
                }
            });
            m23052L4(3, new InterfaceC26609g() { // from class: GV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22926g3;
                    m22926g3 = BleManagerHandler.m22926g3();
                    return m22926g3;
                }
            });
            boolean beginReliableWrite = bluetoothGatt.beginReliableWrite();
            this.f100571t = beginReliableWrite;
            return beginReliableWrite;
        }
        return false;
    }

    /* renamed from: r2 */
    public final boolean m22861r2(final BluetoothDevice bluetoothDevice, final C26664n0 c26664n0) {
        int i;
        BluetoothGatt connectGatt;
        BluetoothGatt connectGatt2;
        boolean isEnabled = BluetoothAdapter.getDefaultAdapter().isEnabled();
        if (!this.f100564m && isEnabled) {
            Context m5234B = this.f100555d.m5234B();
            synchronized (this.f100552a) {
                if (this.f100554c != null) {
                    if (!this.f100568q) {
                        m23052L4(3, new InterfaceC26609g() { // from class: RU
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22889m3;
                                m22889m3 = BleManagerHandler.m22889m3();
                                return m22889m3;
                            }
                        });
                        try {
                            this.f100554c.close();
                        } catch (Throwable unused) {
                        }
                        this.f100554c = null;
                        try {
                            m23052L4(3, new InterfaceC26609g() { // from class: UU
                                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                                /* renamed from: a */
                                public final String mo1308a() {
                                    String m22883n3;
                                    m22883n3 = BleManagerHandler.m22883n3();
                                    return m22883n3;
                                }
                            });
                            Thread.sleep(200L);
                        } catch (InterruptedException unused2) {
                        }
                    } else {
                        this.f100568q = false;
                        this.f100562k = 0L;
                        this.f100569r = 1;
                        m23052L4(2, new InterfaceC26609g() { // from class: VU
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22878o3;
                                m22878o3 = BleManagerHandler.m22878o3();
                                return m22878o3;
                            }
                        });
                        m22938e5(new InterfaceC26607e() { // from class: WU
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                            /* renamed from: a */
                            public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                                interfaceC30597yU.mo3465c(bluetoothDevice);
                            }
                        });
                        m22931f5(new InterfaceC26608f() { // from class: XU
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                            /* renamed from: a */
                            public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                                interfaceC46590oy0.mo18376c(bluetoothDevice);
                            }
                        });
                        m23052L4(3, new InterfaceC26609g() { // from class: YU
                            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                            /* renamed from: a */
                            public final String mo1308a() {
                                String m22860r3;
                                m22860r3 = BleManagerHandler.m22860r3();
                                return m22860r3;
                            }
                        });
                        this.f100554c.connect();
                        return true;
                    }
                } else if (c26664n0 != null) {
                    m5234B.registerReceiver(this.f100549I, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    m5234B.registerReceiver(this.f100550J, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                }
                if (c26664n0 == null) {
                    return false;
                }
                boolean m22594X = c26664n0.m22594X();
                this.f100567p = !m22594X;
                if (m22594X) {
                    this.f100568q = true;
                }
                this.f100553b = bluetoothDevice;
                m23052L4(2, new InterfaceC26609g() { // from class: ZU
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                    /* renamed from: a */
                    public final String mo1308a() {
                        String m22854s3;
                        m22854s3 = BleManagerHandler.m22854s3(C26664n0.this);
                        return m22854s3;
                    }
                });
                this.f100569r = 1;
                m22938e5(new InterfaceC26607e() { // from class: aV
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        interfaceC30597yU.mo3465c(bluetoothDevice);
                    }
                });
                m22931f5(new InterfaceC26608f() { // from class: bV
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                    /* renamed from: a */
                    public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                        interfaceC46590oy0.mo18376c(bluetoothDevice);
                    }
                });
                this.f100562k = SystemClock.elapsedRealtime();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 > 26) {
                    final int m22601Q = c26664n0.m22601Q();
                    m23052L4(3, new InterfaceC26609g() { // from class: cV
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22907j3;
                            m22907j3 = BleManagerHandler.m22907j3(m22601Q);
                            return m22907j3;
                        }
                    });
                    connectGatt2 = bluetoothDevice.connectGatt(m5234B, false, this.f100551K, 2, m22601Q, this.f100556e);
                    this.f100554c = connectGatt2;
                } else if (i2 == 26) {
                    final int m22601Q2 = c26664n0.m22601Q();
                    m23052L4(3, new InterfaceC26609g() { // from class: SU
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22901k3;
                            m22901k3 = BleManagerHandler.m22901k3(m22601Q2);
                            return m22901k3;
                        }
                    });
                    connectGatt = bluetoothDevice.connectGatt(m5234B, false, this.f100551K, 2, m22601Q2);
                    this.f100554c = connectGatt;
                } else {
                    m23052L4(3, new InterfaceC26609g() { // from class: TU
                        @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                        /* renamed from: a */
                        public final String mo1308a() {
                            String m22895l3;
                            m22895l3 = BleManagerHandler.m22895l3();
                            return m22895l3;
                        }
                    });
                    this.f100554c = bluetoothDevice.connectGatt(m5234B, false, this.f100551K, 2);
                }
                return true;
            }
        }
        BluetoothDevice bluetoothDevice2 = this.f100553b;
        if (isEnabled && bluetoothDevice2 != null && bluetoothDevice2.equals(bluetoothDevice)) {
            C26664n0 c26664n02 = this.f100542B;
            if (c26664n02 != null) {
                c26664n02.mo22518D(bluetoothDevice);
            }
        } else {
            C26664n0 c26664n03 = this.f100542B;
            if (c26664n03 != null) {
                if (isEnabled) {
                    i = -4;
                } else {
                    i = -100;
                }
                c26664n03.mo22521A(bluetoothDevice, i);
            }
        }
        this.f100542B = null;
        m23040N4(true);
        return true;
    }

    /* renamed from: s2 */
    public final boolean m22855s2(boolean z) {
        BluetoothDevice bluetoothDevice = this.f100553b;
        if (bluetoothDevice == null) {
            return false;
        }
        if (z) {
            m23052L4(2, new InterfaceC26609g() { // from class: pV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22848t3;
                    m22848t3 = BleManagerHandler.m22848t3();
                    return m22848t3;
                }
            });
        } else {
            m23052L4(2, new InterfaceC26609g() { // from class: qV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22842u3;
                    m22842u3 = BleManagerHandler.m22842u3();
                    return m22842u3;
                }
            });
        }
        if (!z && bluetoothDevice.getBondState() == 12) {
            m23052L4(5, new InterfaceC26609g() { // from class: sV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22836v3;
                    m22836v3 = BleManagerHandler.m22836v3();
                    return m22836v3;
                }
            });
            this.f100543C.mo22518D(bluetoothDevice);
            m23040N4(true);
            return true;
        }
        boolean m22941e2 = m22941e2(bluetoothDevice);
        if (z && !m22941e2) {
            AbstractC26684u0 mo22469G = AbstractC26684u0.m22509h().mo22469G(this);
            AbstractC26684u0 abstractC26684u0 = this.f100543C;
            mo22469G.f100698h = abstractC26684u0.f100698h;
            mo22469G.f100700j = abstractC26684u0.f100700j;
            mo22469G.f100699i = abstractC26684u0.f100699i;
            mo22469G.f100702l = abstractC26684u0.f100702l;
            mo22469G.f100703m = abstractC26684u0.f100703m;
            abstractC26684u0.f100698h = null;
            abstractC26684u0.f100700j = null;
            abstractC26684u0.f100699i = null;
            abstractC26684u0.f100702l = null;
            abstractC26684u0.f100703m = null;
            m22934f2(mo22469G);
            m22934f2(AbstractC26684u0.m22517E().mo22469G(this));
            m23040N4(true);
            return true;
        }
        return m22941e2;
    }

    /* renamed from: t2 */
    public final boolean m22849t2(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return m22843u2(bluetoothGattCharacteristic);
    }

    /* renamed from: u2 */
    public final boolean m22843u2(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor m22908j2;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f100564m || (m22908j2 = m22908j2(bluetoothGattCharacteristic, 48)) == null) {
            return false;
        }
        m23052L4(3, new InterfaceC26609g() { // from class: kV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22830w3;
                m22830w3 = BleManagerHandler.m22830w3(bluetoothGattCharacteristic);
                return m22830w3;
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, false);
        m22908j2.setValue(BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
        m23052L4(2, new InterfaceC26609g() { // from class: lV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22824x3;
                m22824x3 = BleManagerHandler.m22824x3(bluetoothGattCharacteristic);
                return m22824x3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: mV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m22818y3;
                m22818y3 = BleManagerHandler.m22818y3();
                return m22818y3;
            }
        });
        return m23042N2(m22908j2);
    }

    /* renamed from: v2 */
    public final boolean m22837v2(final int i) {
        this.f100567p = true;
        this.f100568q = false;
        this.f100565n = false;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt != null) {
            final boolean z = this.f100564m;
            this.f100569r = 3;
            m23052L4(2, new InterfaceC26609g() { // from class: dV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m22812z3;
                    m22812z3 = BleManagerHandler.m22812z3(z);
                    return m22812z3;
                }
            });
            final BluetoothDevice device = bluetoothGatt.getDevice();
            if (z) {
                m22938e5(new InterfaceC26607e() { // from class: eV
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                    /* renamed from: a */
                    public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                        interfaceC30597yU.mo3464d(device);
                    }
                });
                m22931f5(new InterfaceC26608f() { // from class: fV
                    @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                    /* renamed from: a */
                    public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                        interfaceC46590oy0.mo18375d(device);
                    }
                });
            }
            m23052L4(3, new InterfaceC26609g() { // from class: gV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23107C3;
                    m23107C3 = BleManagerHandler.m23107C3();
                    return m23107C3;
                }
            });
            bluetoothGatt.disconnect();
            if (z) {
                return true;
            }
            this.f100569r = 0;
            m23052L4(4, new InterfaceC26609g() { // from class: hV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
                /* renamed from: a */
                public final String mo1308a() {
                    String m23101D3;
                    m23101D3 = BleManagerHandler.m23101D3();
                    return m23101D3;
                }
            });
            m22948d2();
            m22938e5(new InterfaceC26607e() { // from class: iV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26607e
                /* renamed from: a */
                public final void mo15838a(InterfaceC30597yU interfaceC30597yU) {
                    interfaceC30597yU.mo3455m(device);
                }
            });
            m22931f5(new InterfaceC26608f() { // from class: jV
                @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26608f
                /* renamed from: a */
                public final void mo22631a(InterfaceC46590oy0 interfaceC46590oy0) {
                    interfaceC46590oy0.mo18374e(device, i);
                }
            });
        }
        AbstractC26684u0 abstractC26684u0 = this.f100543C;
        if (abstractC26684u0 != null && abstractC26684u0.f100694d == AbstractC26684u0.EnumC26687c.DISCONNECT) {
            BluetoothDevice bluetoothDevice = this.f100553b;
            if (bluetoothDevice == null && bluetoothGatt == null) {
                abstractC26684u0.mo22520B();
            } else {
                if (bluetoothDevice == null) {
                    bluetoothDevice = bluetoothGatt.getDevice();
                }
                abstractC26684u0.mo22518D(bluetoothDevice);
            }
        }
        m23040N4(true);
        return true;
    }

    /* renamed from: w2 */
    public final boolean m22831w2(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor m22908j2;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f100564m || (m22908j2 = m22908j2(bluetoothGattCharacteristic, 32)) == null) {
            return false;
        }
        m23052L4(3, new InterfaceC26609g() { // from class: yV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23083G3;
                m23083G3 = BleManagerHandler.m23083G3(bluetoothGattCharacteristic);
                return m23083G3;
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        m22908j2.setValue(BluetoothGattDescriptor.ENABLE_INDICATION_VALUE);
        m23052L4(2, new InterfaceC26609g() { // from class: zV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23077H3;
                m23077H3 = BleManagerHandler.m23077H3(bluetoothGattCharacteristic);
                return m23077H3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: AV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23071I3;
                m23071I3 = BleManagerHandler.m23071I3();
                return m23071I3;
            }
        });
        return m23042N2(m22908j2);
    }

    /* renamed from: x2 */
    public final boolean m22825x2(final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BluetoothGattDescriptor m22908j2;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || bluetoothGattCharacteristic == null || !this.f100564m || (m22908j2 = m22908j2(bluetoothGattCharacteristic, 16)) == null) {
            return false;
        }
        m23052L4(3, new InterfaceC26609g() { // from class: vV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23065J3;
                m23065J3 = BleManagerHandler.m23065J3(bluetoothGattCharacteristic);
                return m23065J3;
            }
        });
        bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, true);
        m22908j2.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        m23052L4(2, new InterfaceC26609g() { // from class: wV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23059K3;
                m23059K3 = BleManagerHandler.m23059K3(bluetoothGattCharacteristic);
                return m23059K3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: xV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23053L3;
                m23053L3 = BleManagerHandler.m23053L3();
                return m23053L3;
            }
        });
        return m23042N2(m22908j2);
    }

    /* renamed from: y2 */
    public final boolean m22819y2() {
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || !this.f100564m || !this.f100571t) {
            return false;
        }
        m23052L4(2, new InterfaceC26609g() { // from class: XV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23047M3;
                m23047M3 = BleManagerHandler.m23047M3();
                return m23047M3;
            }
        });
        m23052L4(3, new InterfaceC26609g() { // from class: ZV
            @Override // no.nordicsemi.android.ble.BleManagerHandler.InterfaceC26609g
            /* renamed from: a */
            public final String mo1308a() {
                String m23041N3;
                m23041N3 = BleManagerHandler.m23041N3();
                return m23041N3;
            }
        });
        return bluetoothGatt.executeReliableWrite();
    }

    @Deprecated
    /* renamed from: z2 */
    public final boolean m22813z2() {
        BluetoothGattService service;
        BluetoothGatt bluetoothGatt = this.f100554c;
        if (bluetoothGatt == null || !this.f100564m || (service = bluetoothGatt.getService(AbstractC30179xU.f117645g)) == null) {
            return false;
        }
        return m23120A2(service.getCharacteristic(AbstractC30179xU.f117646h));
    }
}
