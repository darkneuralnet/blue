package p000;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.UUID;
import no.nordicsemi.android.ble.AbstractC26684u0;
import no.nordicsemi.android.ble.BleManagerHandler;
import no.nordicsemi.android.ble.C26613D0;
import no.nordicsemi.android.ble.C26664n0;
import no.nordicsemi.android.ble.C26668p0;
@SuppressLint({"MissingPermission"})
/* renamed from: xU */
/* loaded from: classes8.dex */
public abstract class AbstractC30179xU {

    /* renamed from: f */
    public static final UUID f117644f = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: g */
    public static final UUID f117645g = UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");

    /* renamed from: h */
    public static final UUID f117646h = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");

    /* renamed from: i */
    public static final UUID f117647i = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");

    /* renamed from: j */
    public static final UUID f117648j = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

    /* renamed from: a */
    public final Context f117649a;

    /* renamed from: b */
    public final AbstractC30181b f117650b;
    @Deprecated

    /* renamed from: c */
    public InterfaceC30597yU f117651c;

    /* renamed from: d */
    public InterfaceC46590oy0 f117652d;

    /* renamed from: e */
    public final BroadcastReceiver f117653e;

    /* renamed from: xU$a */
    /* loaded from: classes8.dex */
    public class C30180a extends BroadcastReceiver {
        public C30180a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            BluetoothDevice m22914i2 = AbstractC30179xU.this.f117650b.m22914i2();
            if (m22914i2 != null && bluetoothDevice != null && bluetoothDevice.getAddress().equals(m22914i2.getAddress())) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", -1);
                AbstractC30179xU abstractC30179xU = AbstractC30179xU.this;
                abstractC30179xU.mo3766H(3, "[Broadcast] Action received: android.bluetooth.device.action.PAIRING_REQUEST, pairing variant: " + XH3.m77156b(intExtra) + " (" + intExtra + "); key: " + intExtra2);
                AbstractC30179xU.this.m5230I(bluetoothDevice, intExtra, intExtra2);
            }
        }
    }

    /* renamed from: xU$b */
    /* loaded from: classes8.dex */
    public static abstract class AbstractC30181b extends BleManagerHandler {
    }

    public AbstractC30179xU(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m5232F(BluetoothDevice bluetoothDevice) {
        this.f117650b.m22924g5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ void m5231G(BluetoothDevice bluetoothDevice) {
        mo3766H(4, "Battery Level notifications enabled");
    }

    /* renamed from: A */
    public final int m5235A() {
        return this.f117650b.m22902k2();
    }

    /* renamed from: B */
    public final Context m5234B() {
        return this.f117649a;
    }

    /* renamed from: C */
    public abstract AbstractC30181b mo3768C();

    /* renamed from: D */
    public int mo3767D() {
        return 4;
    }

    /* renamed from: E */
    public int m5233E(boolean z) {
        return z ? 1600 : 300;
    }

    /* renamed from: H */
    public void mo3766H(int i, String str) {
    }

    /* renamed from: I */
    public void m5230I(BluetoothDevice bluetoothDevice, int i, int i2) {
    }

    @Deprecated
    /* renamed from: J */
    public void m5229J() {
        AbstractC26684u0.m22496x().mo22469G(this.f117650b).m22530S(this.f117650b.m22920h2()).mo22507k();
    }

    /* renamed from: K */
    public final void m5228K(InterfaceC46590oy0 interfaceC46590oy0) {
        this.f117652d = interfaceC46590oy0;
    }

    @Deprecated
    /* renamed from: L */
    public void mo5227L(InterfaceC30597yU interfaceC30597yU) {
        this.f117651c = interfaceC30597yU;
    }

    /* renamed from: M */
    public C32636Ej6 m5226M(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f117650b.m22896l2(bluetoothGattCharacteristic);
    }

    @Deprecated
    /* renamed from: N */
    public boolean m5225N() {
        return false;
    }

    /* renamed from: O */
    public boolean m5224O() {
        return false;
    }

    @Deprecated
    /* renamed from: P */
    public C26613D0 m5223P(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return AbstractC26684u0.m22495y(bluetoothGattCharacteristic, bArr).mo22469G(this.f117650b);
    }

    /* renamed from: Q */
    public C26613D0 m5222Q(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        return AbstractC26684u0.m22494z(bluetoothGattCharacteristic, bArr, i).mo22469G(this.f117650b);
    }

    /* renamed from: v */
    public void m5219v() {
        try {
            this.f117649a.unregisterReceiver(this.f117653e);
        } catch (Exception unused) {
        }
        this.f117650b.m22948d2();
    }

    /* renamed from: w */
    public final C26664n0 m5218w(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return AbstractC26684u0.m22510g(bluetoothDevice).m22593Y(m5225N()).mo22584K(this.f117650b);
        }
        throw new NullPointerException("Bluetooth device not specified");
    }

    /* renamed from: x */
    public final C26668p0 m5217x() {
        return AbstractC26684u0.m22508i().mo22584K(this.f117650b);
    }

    @Deprecated
    /* renamed from: y */
    public void m5216y() {
        AbstractC26684u0.m22500t().mo22469G(this.f117650b).m22645K(new InterfaceC25132kG() { // from class: vU
            @Override // p000.InterfaceC25132kG
            /* renamed from: a */
            public final void mo8611a(BluetoothDevice bluetoothDevice) {
                AbstractC30179xU.this.m5232F(bluetoothDevice);
            }
        }).mo22462j(new InterfaceC52220yT5() { // from class: wU
            @Override // p000.InterfaceC52220yT5
            /* renamed from: c */
            public final void mo3469c(BluetoothDevice bluetoothDevice) {
                AbstractC30179xU.this.m5231G(bluetoothDevice);
            }
        }).mo22507k();
    }

    /* renamed from: z */
    public C26613D0 m5215z(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return AbstractC26684u0.m22499u(bluetoothGattCharacteristic).mo22469G(this.f117650b);
    }

    public AbstractC30179xU(Context context, Handler handler) {
        C30180a c30180a = new C30180a();
        this.f117653e = c30180a;
        this.f117649a = context;
        AbstractC30181b mo3768C = mo3768C();
        this.f117650b = mo3768C;
        mo3768C.m22890m2(this, handler);
        context.registerReceiver(c30180a, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }
}
