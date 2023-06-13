package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleGattCharacteristicException;
import com.polidea.rxandroidble2.exceptions.BleGattDescriptorException;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import io.reactivex.AbstractC23437E;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23492o;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p000.InterfaceC44023ke5;
/* renamed from: ve5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50544ve5 {

    /* renamed from: a */
    public final AbstractC23437E f114430a;

    /* renamed from: b */
    public final C25174kX f114431b;

    /* renamed from: c */
    public final C50206v41 f114432c;

    /* renamed from: d */
    public final C48705sY2 f114433d;

    /* renamed from: e */
    public final C45168ma4<InterfaceC44023ke5.EnumC25197a> f114434e = C45168ma4.m25409g();

    /* renamed from: f */
    public final C29603c<C49952ue5> f114435f = new C29603c<>();

    /* renamed from: g */
    public final C29603c<C49050t70<UUID>> f114436g = new C29603c<>();

    /* renamed from: h */
    public final C29603c<C49050t70<UUID>> f114437h = new C29603c<>();

    /* renamed from: i */
    public final AbstractC37638Zt4<C39297ci0> f114438i = C45168ma4.m25409g().m72348c();

    /* renamed from: j */
    public final C29603c<C49050t70<BluetoothGattDescriptor>> f114439j = new C29603c<>();

    /* renamed from: k */
    public final C29603c<C49050t70<BluetoothGattDescriptor>> f114440k = new C29603c<>();

    /* renamed from: l */
    public final C29603c<Integer> f114441l = new C29603c<>();

    /* renamed from: m */
    public final C29603c<Integer> f114442m = new C29603c<>();

    /* renamed from: n */
    public final C29603c<Object> f114443n = new C29603c<>();

    /* renamed from: o */
    public final InterfaceC23492o<BleGattException, Observable<?>> f114444o = new C29601a();

    /* renamed from: p */
    public final BluetoothGattCallback f114445p = new C29602b();

    /* renamed from: ve5$a */
    /* loaded from: classes6.dex */
    public class C29601a implements InterfaceC23492o<BleGattException, Observable<?>> {
        public C29601a() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Observable<?> apply(BleGattException bleGattException) {
            return Observable.error(bleGattException);
        }
    }

    /* renamed from: ve5$b */
    /* loaded from: classes6.dex */
    public class C29602b extends BluetoothGattCallback {
        public C29602b() {
        }

        /* renamed from: a */
        public final boolean m8304a(int i) {
            return i == 0 || i == 3;
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            C35098Ox2.m91164l("onCharacteristicChanged", bluetoothGatt, bluetoothGattCharacteristic, true);
            C50544ve5.this.f114433d.m14051a(bluetoothGatt, bluetoothGattCharacteristic);
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            if (C50544ve5.this.f114438i.mo25411a()) {
                C50544ve5.this.f114438i.accept(new C39297ci0(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            C35098Ox2.m91166j("onCharacteristicRead", bluetoothGatt, i, bluetoothGattCharacteristic, true);
            C50544ve5.this.f114433d.m14045g(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (C50544ve5.this.f114436g.m8303a() && !C50544ve5.m8309m(C50544ve5.this.f114436g, bluetoothGatt, bluetoothGattCharacteristic, i, C29202uU.f112439d)) {
                C50544ve5.this.f114436g.f114448a.accept(new C49050t70<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            C35098Ox2.m91166j("onCharacteristicWrite", bluetoothGatt, i, bluetoothGattCharacteristic, false);
            C50544ve5.this.f114433d.m14041k(bluetoothGatt, bluetoothGattCharacteristic, i);
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (C50544ve5.this.f114437h.m8303a() && !C50544ve5.m8309m(C50544ve5.this.f114437h, bluetoothGatt, bluetoothGattCharacteristic, i, C29202uU.f112440e)) {
                C50544ve5.this.f114437h.f114448a.accept(new C49050t70<>(bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
            C35098Ox2.m91167i("onConnectionStateChange", bluetoothGatt, i, i2);
            C50544ve5.this.f114433d.m14050b(bluetoothGatt, i, i2);
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            C50544ve5.this.f114431b.m28870b(bluetoothGatt);
            if (m8304a(i2)) {
                C50544ve5.this.f114432c.m9225d(new BleDisconnectedException(bluetoothGatt.getDevice().getAddress(), i));
            } else if (i != 0) {
                C50544ve5.this.f114432c.m9224e(new BleGattException(bluetoothGatt, i, C29202uU.f112437b));
            }
            C50544ve5.this.f114434e.accept(C50544ve5.m8312j(i2));
        }

        public void onConnectionUpdated(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
            C35098Ox2.m91163m("onConnectionUpdated", bluetoothGatt, i4, i, i2, i3);
            C50544ve5.this.f114433d.m14046f(bluetoothGatt, i, i2, i3, i4);
            if (C50544ve5.this.f114443n.m8303a() && !C50544ve5.m8310l(C50544ve5.this.f114443n, bluetoothGatt, i4, C29202uU.f112448m)) {
                C50544ve5.this.f114443n.f114448a.accept(new C49554ty0(i, i2, i3));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            C35098Ox2.m91165k("onDescriptorRead", bluetoothGatt, i, bluetoothGattDescriptor, true);
            C50544ve5.this.f114433d.m14049c(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
            if (C50544ve5.this.f114439j.m8303a() && !C50544ve5.m8308n(C50544ve5.this.f114439j, bluetoothGatt, bluetoothGattDescriptor, i, C29202uU.f112443h)) {
                C50544ve5.this.f114439j.f114448a.accept(new C49050t70<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            C35098Ox2.m91165k("onDescriptorWrite", bluetoothGatt, i, bluetoothGattDescriptor, false);
            C50544ve5.this.f114433d.m14048d(bluetoothGatt, bluetoothGattDescriptor, i);
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (C50544ve5.this.f114440k.m8303a() && !C50544ve5.m8308n(C50544ve5.this.f114440k, bluetoothGatt, bluetoothGattDescriptor, i, C29202uU.f112444i)) {
                C50544ve5.this.f114440k.f114448a.accept(new C49050t70<>(bluetoothGattDescriptor, bluetoothGattDescriptor.getValue()));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
            C35098Ox2.m91167i("onMtuChanged", bluetoothGatt, i2, i);
            C50544ve5.this.f114433d.m14047e(bluetoothGatt, i, i2);
            super.onMtuChanged(bluetoothGatt, i, i2);
            if (C50544ve5.this.f114442m.m8303a() && !C50544ve5.m8310l(C50544ve5.this.f114442m, bluetoothGatt, i2, C29202uU.f112447l)) {
                C50544ve5.this.f114442m.f114448a.accept(Integer.valueOf(i));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReadRemoteRssi(BluetoothGatt bluetoothGatt, int i, int i2) {
            C35098Ox2.m91167i("onReadRemoteRssi", bluetoothGatt, i2, i);
            C50544ve5.this.f114433d.m14044h(bluetoothGatt, i, i2);
            super.onReadRemoteRssi(bluetoothGatt, i, i2);
            if (C50544ve5.this.f114441l.m8303a() && !C50544ve5.m8310l(C50544ve5.this.f114441l, bluetoothGatt, i2, C29202uU.f112446k)) {
                C50544ve5.this.f114441l.f114448a.accept(Integer.valueOf(i));
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onReliableWriteCompleted(BluetoothGatt bluetoothGatt, int i) {
            C35098Ox2.m91168h("onReliableWriteCompleted", bluetoothGatt, i);
            C50544ve5.this.f114433d.m14043i(bluetoothGatt, i);
            super.onReliableWriteCompleted(bluetoothGatt, i);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
            C35098Ox2.m91168h("onServicesDiscovered", bluetoothGatt, i);
            C50544ve5.this.f114433d.m14042j(bluetoothGatt, i);
            super.onServicesDiscovered(bluetoothGatt, i);
            if (C50544ve5.this.f114435f.m8303a() && !C50544ve5.m8310l(C50544ve5.this.f114435f, bluetoothGatt, i, C29202uU.f112438c)) {
                C50544ve5.this.f114435f.f114448a.accept(new C49952ue5(bluetoothGatt.getServices()));
            }
        }
    }

    /* renamed from: ve5$c */
    /* loaded from: classes6.dex */
    public static class C29603c<T> {

        /* renamed from: a */
        public final C45168ma4<T> f114448a = C45168ma4.m25409g();

        /* renamed from: b */
        public final C45168ma4<BleGattException> f114449b = C45168ma4.m25409g();

        /* renamed from: a */
        public boolean m8303a() {
            return this.f114448a.mo25411a() || this.f114449b.mo25411a();
        }
    }

    public C50544ve5(AbstractC23437E abstractC23437E, C25174kX c25174kX, C50206v41 c50206v41, C48705sY2 c48705sY2) {
        this.f114430a = abstractC23437E;
        this.f114431b = c25174kX;
        this.f114432c = c50206v41;
        this.f114433d = c48705sY2;
    }

    /* renamed from: i */
    public static boolean m8313i(int i) {
        return i != 0;
    }

    /* renamed from: j */
    public static InterfaceC44023ke5.EnumC25197a m8312j(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return InterfaceC44023ke5.EnumC25197a.DISCONNECTED;
                }
                return InterfaceC44023ke5.EnumC25197a.DISCONNECTING;
            }
            return InterfaceC44023ke5.EnumC25197a.CONNECTED;
        }
        return InterfaceC44023ke5.EnumC25197a.CONNECTING;
    }

    /* renamed from: l */
    public static boolean m8310l(C29603c<?> c29603c, BluetoothGatt bluetoothGatt, int i, C29202uU c29202uU) {
        return m8313i(i) && m8307o(c29603c, new BleGattException(bluetoothGatt, i, c29202uU));
    }

    /* renamed from: m */
    public static boolean m8309m(C29603c<?> c29603c, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, C29202uU c29202uU) {
        return m8313i(i) && m8307o(c29603c, new BleGattCharacteristicException(bluetoothGatt, bluetoothGattCharacteristic, i, c29202uU));
    }

    /* renamed from: n */
    public static boolean m8308n(C29603c<?> c29603c, BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i, C29202uU c29202uU) {
        return m8313i(i) && m8307o(c29603c, new BleGattDescriptorException(bluetoothGatt, bluetoothGattDescriptor, i, c29202uU));
    }

    /* renamed from: o */
    public static boolean m8307o(C29603c<?> c29603c, BleGattException bleGattException) {
        c29603c.f114449b.accept(bleGattException);
        return true;
    }

    /* renamed from: a */
    public BluetoothGattCallback m8321a() {
        return this.f114445p;
    }

    /* renamed from: b */
    public Observable<C39297ci0> m8320b() {
        return Observable.merge(this.f114432c.m9227b(), this.f114438i).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: c */
    public Observable<C49050t70<UUID>> m8319c() {
        return m8306p(this.f114437h).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: d */
    public Observable<InterfaceC44023ke5.EnumC25197a> m8318d() {
        return this.f114434e.delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: e */
    public Observable<C49050t70<BluetoothGattDescriptor>> m8317e() {
        return m8306p(this.f114440k).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: f */
    public Observable<Integer> m8316f() {
        return m8306p(this.f114442m).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: g */
    public Observable<Integer> m8315g() {
        return m8306p(this.f114441l).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: h */
    public Observable<C49952ue5> m8314h() {
        return m8306p(this.f114435f).delay(0L, TimeUnit.SECONDS, this.f114430a);
    }

    /* renamed from: k */
    public <T> Observable<T> m8311k() {
        return this.f114432c.m9227b();
    }

    /* renamed from: p */
    public final <T> Observable<T> m8306p(C29603c<T> c29603c) {
        return Observable.merge(this.f114432c.m9227b(), c29603c.f114448a, c29603c.f114449b.flatMap(this.f114444o));
    }
}
