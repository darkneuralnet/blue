package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import com.polidea.rxandroidble2.exceptions.BleCannotSetCharacteristicNotificationException;
import com.polidea.rxandroidble2.exceptions.BleConflictingNotificationAlreadySetException;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23434B;
import io.reactivex.InterfaceC23435C;
import io.reactivex.InterfaceC23496h;
import io.reactivex.InterfaceC23497i;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.subjects.C24558d;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
/* renamed from: aa3  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38034aa3 {

    /* renamed from: h */
    public static final UUID f50648h = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* renamed from: a */
    public final byte[] f50649a;

    /* renamed from: b */
    public final byte[] f50650b;

    /* renamed from: c */
    public final byte[] f50651c;

    /* renamed from: d */
    public final BluetoothGatt f50652d;

    /* renamed from: e */
    public final C50544ve5 f50653e;

    /* renamed from: f */
    public final A01 f50654f;

    /* renamed from: g */
    public final Map<C39908di0, C4692L2> f50655g = new HashMap();

    /* renamed from: aa3$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C10735a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f50656a;

        static {
            int[] iArr = new int[EnumC41046fd3.values().length];
            f50656a = iArr;
            try {
                iArr[EnumC41046fd3.COMPAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f50656a[EnumC41046fd3.QUICK_SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f50656a[EnumC41046fd3.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C38034aa3(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, A01 a01) {
        this.f50649a = bArr;
        this.f50650b = bArr2;
        this.f50651c = bArr3;
        this.f50652d = bluetoothGatt;
        this.f50653e = c50544ve5;
        this.f50654f = a01;
    }

    /* renamed from: m */
    public static /* synthetic */ void m71196m(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z) throws Exception {
        if (bluetoothGatt.setCharacteristicNotification(bluetoothGattCharacteristic, z)) {
            return;
        }
        throw new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 1, null);
    }

    /* renamed from: n */
    public static /* synthetic */ Observable m71195n(AbstractC23461c abstractC23461c, Observable observable) throws Exception {
        return observable.mergeWith(abstractC23461c.m33069Q());
    }

    /* renamed from: o */
    public static /* synthetic */ InterfaceC23434B m71194o(EnumC41046fd3 enumC41046fd3, BluetoothGattCharacteristic bluetoothGattCharacteristic, A01 a01, byte[] bArr, Observable observable) {
        int i = C10735a.f50656a[enumC41046fd3.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return m71183z(bluetoothGattCharacteristic, a01, bArr).m33043l(observable);
            }
            final AbstractC23461c ignoreElements = m71183z(bluetoothGattCharacteristic, a01, bArr).m33050h0().publish().m32089a(2).ignoreElements();
            return observable.mergeWith(ignoreElements).map(new InterfaceC23492o() { // from class: Z93
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Observable m71195n;
                    m71195n = C38034aa3.m71195n(AbstractC23461c.this, (Observable) obj);
                    return m71195n;
                }
            });
        }
        return observable;
    }

    /* renamed from: p */
    public static /* synthetic */ Observable m71193p(C24558d c24558d, Observable observable) throws Exception {
        return Observable.amb(Arrays.asList(c24558d.cast(byte[].class), observable.takeUntil(c24558d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m71192q(C24558d c24558d, C39908di0 c39908di0, BluetoothGattCharacteristic bluetoothGattCharacteristic, EnumC41046fd3 enumC41046fd3) throws Exception {
        c24558d.onComplete();
        synchronized (this.f50655g) {
            this.f50655g.remove(c39908di0);
        }
        m71187v(this.f50652d, bluetoothGattCharacteristic, false).m33038q(m71184y(this.f50654f, bluetoothGattCharacteristic, this.f50651c, enumC41046fd3)).m33055e(C23506a.f88247c, C23506a.m32967g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ InterfaceC23434B m71191r(final BluetoothGattCharacteristic bluetoothGattCharacteristic, boolean z, final EnumC41046fd3 enumC41046fd3) throws Exception {
        byte[] bArr;
        synchronized (this.f50655g) {
            final C39908di0 c39908di0 = new C39908di0(bluetoothGattCharacteristic.getUuid(), Integer.valueOf(bluetoothGattCharacteristic.getInstanceId()));
            C4692L2 c4692l2 = this.f50655g.get(c39908di0);
            boolean z2 = true;
            if (c4692l2 != null) {
                if (c4692l2.f20618b == z) {
                    return c4692l2.f20617a;
                }
                UUID uuid = bluetoothGattCharacteristic.getUuid();
                if (z) {
                    z2 = false;
                }
                return Observable.error(new BleConflictingNotificationAlreadySetException(uuid, z2));
            }
            if (z) {
                bArr = this.f50650b;
            } else {
                bArr = this.f50649a;
            }
            final C24558d m31902e = C24558d.m31902e();
            Observable m32084i = m71187v(this.f50652d, bluetoothGattCharacteristic, true).m33043l(C39871de3.m43956b(m71188u(this.f50653e, c39908di0))).compose(m71186w(this.f50654f, bluetoothGattCharacteristic, bArr, enumC41046fd3)).map(new InterfaceC23492o() { // from class: R93
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    Observable m71193p;
                    m71193p = C38034aa3.m71193p(C24558d.this, (Observable) obj);
                    return m71193p;
                }
            }).doFinally(new InterfaceC23478a() { // from class: S93
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C38034aa3.this.m71192q(m31902e, c39908di0, bluetoothGattCharacteristic, enumC41046fd3);
                }
            }).mergeWith(this.f50653e.m8311k()).replay(1).m32084i();
            this.f50655g.put(c39908di0, new C4692L2(m32084i, z));
            return m32084i;
        }
    }

    /* renamed from: s */
    public static /* synthetic */ InterfaceC23496h m71190s(EnumC41046fd3 enumC41046fd3, BluetoothGattCharacteristic bluetoothGattCharacteristic, A01 a01, byte[] bArr, AbstractC23461c abstractC23461c) {
        if (enumC41046fd3 == EnumC41046fd3.COMPAT) {
            return abstractC23461c;
        }
        return abstractC23461c.m33049i(m71183z(bluetoothGattCharacteristic, a01, bArr));
    }

    /* renamed from: t */
    public static /* synthetic */ InterfaceC23496h m71189t(BluetoothGattCharacteristic bluetoothGattCharacteristic, Throwable th) throws Exception {
        return AbstractC23461c.m33080F(new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 3, th));
    }

    /* renamed from: u */
    public static Observable<byte[]> m71188u(C50544ve5 c50544ve5, final C39908di0 c39908di0) {
        return c50544ve5.m8320b().filter(new InterfaceC23494q() { // from class: W93
            @Override // io.reactivex.functions.InterfaceC23494q
            public final boolean test(Object obj) {
                boolean equals;
                equals = ((C39297ci0) obj).equals(C39908di0.this);
                return equals;
            }
        }).map(new InterfaceC23492o() { // from class: X93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                byte[] bArr;
                bArr = ((C39297ci0) obj).f61088a;
                return bArr;
            }
        });
    }

    /* renamed from: v */
    public static AbstractC23461c m71187v(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final boolean z) {
        return AbstractC23461c.m33079G(new InterfaceC23478a() { // from class: V93
            @Override // io.reactivex.functions.InterfaceC23478a
            public final void run() {
                C38034aa3.m71196m(bluetoothGatt, bluetoothGattCharacteristic, z);
            }
        });
    }

    /* renamed from: w */
    public static InterfaceC23435C<Observable<byte[]>, Observable<byte[]>> m71186w(final A01 a01, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final EnumC41046fd3 enumC41046fd3) {
        return new InterfaceC23435C() { // from class: T93
            @Override // io.reactivex.InterfaceC23435C
            public final InterfaceC23434B apply(Observable observable) {
                InterfaceC23434B m71194o;
                m71194o = C38034aa3.m71194o(EnumC41046fd3.this, bluetoothGattCharacteristic, a01, bArr, observable);
                return m71194o;
            }
        };
    }

    /* renamed from: y */
    public static InterfaceC23497i m71184y(final A01 a01, final BluetoothGattCharacteristic bluetoothGattCharacteristic, final byte[] bArr, final EnumC41046fd3 enumC41046fd3) {
        return new InterfaceC23497i() { // from class: U93
            @Override // io.reactivex.InterfaceC23497i
            /* renamed from: a */
            public final InterfaceC23496h mo33002a(AbstractC23461c abstractC23461c) {
                InterfaceC23496h m71190s;
                m71190s = C38034aa3.m71190s(EnumC41046fd3.this, bluetoothGattCharacteristic, a01, bArr, abstractC23461c);
                return m71190s;
            }
        };
    }

    /* renamed from: z */
    public static AbstractC23461c m71183z(final BluetoothGattCharacteristic bluetoothGattCharacteristic, A01 a01, byte[] bArr) {
        BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic.getDescriptor(f50648h);
        if (descriptor == null) {
            return AbstractC23461c.m33080F(new BleCannotSetCharacteristicNotificationException(bluetoothGattCharacteristic, 2, null));
        }
        return a01.m116204a(descriptor, bArr).m33067S(new InterfaceC23492o() { // from class: Y93
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23496h m71189t;
                m71189t = C38034aa3.m71189t(bluetoothGattCharacteristic, (Throwable) obj);
                return m71189t;
            }
        });
    }

    /* renamed from: x */
    public Observable<Observable<byte[]>> m71185x(final BluetoothGattCharacteristic bluetoothGattCharacteristic, final EnumC41046fd3 enumC41046fd3, final boolean z) {
        return Observable.defer(new Callable() { // from class: Q93
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m71191r;
                m71191r = C38034aa3.this.m71191r(bluetoothGattCharacteristic, z, enumC41046fd3);
                return m71191r;
            }
        });
    }
}
