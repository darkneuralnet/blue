package p000;

import android.bluetooth.BluetoothDevice;
import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleAlreadyConnectedException;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23478a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.C51332wy0;
import p000.InterfaceC44023ke5;
/* renamed from: qe5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C47581qe5 implements InterfaceC45802ne5 {

    /* renamed from: a */
    public final BluetoothDevice f105563a;

    /* renamed from: b */
    public final InterfaceC33233Gy0 f105564b;

    /* renamed from: c */
    public final C0058AG<InterfaceC44023ke5.EnumC25197a> f105565c;

    /* renamed from: d */
    public final C50579vi0 f105566d;

    /* renamed from: e */
    public final AtomicBoolean f105567e = new AtomicBoolean(false);

    public C47581qe5(BluetoothDevice bluetoothDevice, InterfaceC33233Gy0 interfaceC33233Gy0, C0058AG<InterfaceC44023ke5.EnumC25197a> c0058ag, C50579vi0 c50579vi0) {
        this.f105563a = bluetoothDevice;
        this.f105564b = interfaceC33233Gy0;
        this.f105565c = c0058ag;
        this.f105566d = c50579vi0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public /* synthetic */ void m17275j() throws Exception {
        this.f105567e.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ InterfaceC23434B m17274k(C51332wy0 c51332wy0) throws Exception {
        if (this.f105567e.compareAndSet(false, true)) {
            return this.f105564b.mo96063a(c51332wy0).doFinally(new InterfaceC23478a() { // from class: pe5
                @Override // io.reactivex.functions.InterfaceC23478a
                public final void run() {
                    C47581qe5.this.m17275j();
                }
            });
        }
        return Observable.error(new BleAlreadyConnectedException(this.f105563a.getAddress()));
    }

    @Override // p000.InterfaceC45802ne5
    /* renamed from: a */
    public Observable<InterfaceC44023ke5> mo17284a(boolean z) {
        return m17277h(new C51332wy0.C29999a().m6056b(z).m6054d(true).m6057a());
    }

    @Override // p000.InterfaceC45802ne5
    /* renamed from: b */
    public InterfaceC44023ke5.EnumC25197a mo17283b() {
        return this.f105565c.getValue();
    }

    @Override // p000.InterfaceC45802ne5
    /* renamed from: c */
    public Observable<InterfaceC44023ke5> mo17282c(boolean z, K46 k46) {
        return m17277h(new C51332wy0.C29999a().m6056b(z).m6055c(k46).m6054d(true).m6057a());
    }

    @Override // p000.InterfaceC45802ne5
    /* renamed from: d */
    public BluetoothDevice mo17281d() {
        return this.f105563a;
    }

    @Override // p000.InterfaceC45802ne5
    /* renamed from: e */
    public String mo17280e() {
        return this.f105563a.getAddress();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47581qe5)) {
            return false;
        }
        return this.f105563a.equals(((C47581qe5) obj).f105563a);
    }

    @Override // p000.InterfaceC45802ne5
    public String getName() {
        return m17276i(false);
    }

    /* renamed from: h */
    public Observable<InterfaceC44023ke5> m17277h(final C51332wy0 c51332wy0) {
        return Observable.defer(new Callable() { // from class: oe5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                InterfaceC23434B m17274k;
                m17274k = C47581qe5.this.m17274k(c51332wy0);
                return m17274k;
            }
        });
    }

    public int hashCode() {
        return this.f105563a.hashCode();
    }

    /* renamed from: i */
    public final String m17276i(boolean z) {
        if (z && !this.f105566d.m8247a()) {
            return "[NO BLUETOOTH_CONNECT PERMISSION]";
        }
        return this.f105563a.getName();
    }

    public String toString() {
        return "RxBleDeviceImpl{" + C35098Ox2.m91172d(this.f105563a.getAddress()) + ", name=" + m17276i(true) + CoreConstants.CURLY_RIGHT;
    }
}
