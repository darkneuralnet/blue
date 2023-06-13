package p000;

import co.bird.android.app.feature.bluetooth.BluetoothDiscoveryReceiver;
import dagger.MembersInjector;
/* renamed from: fX */
/* loaded from: classes2.dex */
public final class C20441fX implements MembersInjector<BluetoothDiscoveryReceiver> {

    /* renamed from: a */
    public final Y94<InterfaceC22677hY> f80255a;

    /* renamed from: b */
    public final Y94<InterfaceC40001dr4> f80256b;

    /* renamed from: c */
    public final Y94<C22454gl> f80257c;

    /* renamed from: d */
    public final Y94<C36207Tq4> f80258d;

    /* renamed from: a */
    public static void m41260a(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver, InterfaceC22677hY interfaceC22677hY) {
        bluetoothDiscoveryReceiver.f61319a = interfaceC22677hY;
    }

    /* renamed from: b */
    public static void m41259b(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver, InterfaceC40001dr4 interfaceC40001dr4) {
        bluetoothDiscoveryReceiver.f61320b = interfaceC40001dr4;
    }

    /* renamed from: d */
    public static void m41257d(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver, C22454gl c22454gl) {
        bluetoothDiscoveryReceiver.f61321c = c22454gl;
    }

    /* renamed from: e */
    public static void m41256e(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver, C36207Tq4 c36207Tq4) {
        bluetoothDiscoveryReceiver.f61322d = c36207Tq4;
    }

    @Override // dagger.MembersInjector
    /* renamed from: c */
    public void injectMembers(BluetoothDiscoveryReceiver bluetoothDiscoveryReceiver) {
        m41260a(bluetoothDiscoveryReceiver, this.f80255a.get());
        m41259b(bluetoothDiscoveryReceiver, this.f80256b.get());
        m41257d(bluetoothDiscoveryReceiver, this.f80257c.get());
        m41256e(bluetoothDiscoveryReceiver, this.f80258d.get());
    }
}
