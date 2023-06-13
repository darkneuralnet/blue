package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothManager;
import android.os.DeadObjectException;
import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import io.reactivex.AbstractC23437E;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23445I;
import io.reactivex.InterfaceC24489j;
import io.reactivex.InterfaceC24578y;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import p000.InterfaceC44023ke5;
/* renamed from: s41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48428s41 extends AbstractC38658bd4<Void> {

    /* renamed from: b */
    public final C50544ve5 f108196b;

    /* renamed from: c */
    public final C25174kX f108197c;

    /* renamed from: d */
    public final String f108198d;

    /* renamed from: e */
    public final BluetoothManager f108199e;

    /* renamed from: f */
    public final AbstractC23437E f108200f;

    /* renamed from: g */
    public final L46 f108201g;

    /* renamed from: h */
    public final InterfaceC51925xy0 f108202h;

    /* renamed from: s41$a */
    /* loaded from: classes6.dex */
    public class C28167a implements InterfaceC23445I<BluetoothGatt> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC24578y f108203b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC39862dd4 f108204c;

        public C28167a(InterfaceC24578y interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
            this.f108203b = interfaceC24578y;
            this.f108204c = interfaceC39862dd4;
        }

        @Override // io.reactivex.InterfaceC23445I
        /* renamed from: a */
        public void onSuccess(BluetoothGatt bluetoothGatt) {
            bluetoothGatt.close();
            C48428s41.this.m14811d(this.f108203b, this.f108204c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onError(Throwable th) {
            C52323ye5.m3110s(th, "Disconnect operation has been executed but finished with an error - considering disconnected.", new Object[0]);
            C48428s41.this.m14811d(this.f108203b, this.f108204c);
        }

        @Override // io.reactivex.InterfaceC23445I
        public void onSubscribe(InterfaceC23465c interfaceC23465c) {
        }
    }

    /* renamed from: s41$b */
    /* loaded from: classes6.dex */
    public static class C28168b extends AbstractC23442F<BluetoothGatt> {

        /* renamed from: b */
        public final BluetoothGatt f108206b;

        /* renamed from: c */
        public final C50544ve5 f108207c;

        /* renamed from: d */
        public final AbstractC23437E f108208d;

        /* renamed from: s41$b$a */
        /* loaded from: classes6.dex */
        public class C28169a implements InterfaceC23492o<InterfaceC44023ke5.EnumC25197a, BluetoothGatt> {
            public C28169a() {
            }

            @Override // io.reactivex.functions.InterfaceC23492o
            /* renamed from: a */
            public BluetoothGatt apply(InterfaceC44023ke5.EnumC25197a enumC25197a) {
                return C28168b.this.f108206b;
            }
        }

        /* renamed from: s41$b$b */
        /* loaded from: classes6.dex */
        public class C28170b implements InterfaceC23494q<InterfaceC44023ke5.EnumC25197a> {
            public C28170b() {
            }

            @Override // io.reactivex.functions.InterfaceC23494q
            /* renamed from: a */
            public boolean test(InterfaceC44023ke5.EnumC25197a enumC25197a) {
                return enumC25197a == InterfaceC44023ke5.EnumC25197a.DISCONNECTED;
            }
        }

        /* renamed from: s41$b$c */
        /* loaded from: classes6.dex */
        public class RunnableC28171c implements Runnable {
            public RunnableC28171c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C28168b.this.f108206b.disconnect();
            }
        }

        public C28168b(BluetoothGatt bluetoothGatt, C50544ve5 c50544ve5, AbstractC23437E abstractC23437E) {
            this.f108206b = bluetoothGatt;
            this.f108207c = c50544ve5;
            this.f108208d = abstractC23437E;
        }

        @Override // io.reactivex.AbstractC23442F
        /* renamed from: X */
        public void mo14806X(InterfaceC23445I<? super BluetoothGatt> interfaceC23445I) {
            this.f108207c.m8318d().filter(new C28170b()).firstOrError().m33157I(new C28169a()).mo33096a(interfaceC23445I);
            this.f108208d.mo8041b().mo32320b(new RunnableC28171c());
        }
    }

    public C48428s41(C50544ve5 c50544ve5, C25174kX c25174kX, String str, BluetoothManager bluetoothManager, AbstractC23437E abstractC23437E, L46 l46, InterfaceC51925xy0 interfaceC51925xy0) {
        this.f108196b = c50544ve5;
        this.f108197c = c25174kX;
        this.f108198d = str;
        this.f108199e = bluetoothManager;
        this.f108200f = abstractC23437E;
        this.f108201g = l46;
        this.f108202h = interfaceC51925xy0;
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: b */
    public void mo14813b(InterfaceC24578y<Void> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
        this.f108202h.mo4373a(InterfaceC44023ke5.EnumC25197a.DISCONNECTING);
        BluetoothGatt m28871a = this.f108197c.m28871a();
        if (m28871a == null) {
            C52323ye5.m3111r("Disconnect operation has been executed but GATT instance was null - considering disconnected.", new Object[0]);
            m14811d(interfaceC24578y, interfaceC39862dd4);
            return;
        }
        m14809f(m28871a).m33152N(this.f108200f).mo33096a(new C28167a(interfaceC24578y, interfaceC39862dd4));
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: c */
    public BleException mo14812c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f108198d, -1);
    }

    /* renamed from: d */
    public void m14811d(InterfaceC24489j<Void> interfaceC24489j, InterfaceC39862dd4 interfaceC39862dd4) {
        this.f108202h.mo4373a(InterfaceC44023ke5.EnumC25197a.DISCONNECTED);
        interfaceC39862dd4.release();
        interfaceC24489j.onComplete();
    }

    /* renamed from: e */
    public final AbstractC23442F<BluetoothGatt> m14810e(BluetoothGatt bluetoothGatt) {
        C28168b c28168b = new C28168b(bluetoothGatt, this.f108196b, this.f108200f);
        L46 l46 = this.f108201g;
        return c28168b.m33137c0(l46.f20724a, l46.f20725b, l46.f20726c, AbstractC23442F.m33158H(bluetoothGatt));
    }

    /* renamed from: f */
    public final AbstractC23442F<BluetoothGatt> m14809f(BluetoothGatt bluetoothGatt) {
        if (m14808g(bluetoothGatt)) {
            return AbstractC23442F.m33158H(bluetoothGatt);
        }
        return m14810e(bluetoothGatt);
    }

    /* renamed from: g */
    public final boolean m14808g(BluetoothGatt bluetoothGatt) {
        return this.f108199e.getConnectionState(bluetoothGatt.getDevice(), 7) == 0;
    }

    public String toString() {
        return "DisconnectOperation{" + C35098Ox2.m91172d(this.f108198d) + CoreConstants.CURLY_RIGHT;
    }
}
