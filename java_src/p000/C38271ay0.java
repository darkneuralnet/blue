package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.os.DeadObjectException;
import ch.qos.logback.core.CoreConstants;
import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattCallbackTimeoutException;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23444H;
import io.reactivex.InterfaceC23446J;
import io.reactivex.InterfaceC23448L;
import io.reactivex.InterfaceC24578y;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.observers.AbstractC24501e;
import java.util.concurrent.Callable;
import p000.InterfaceC44023ke5;
/* renamed from: ay0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C38271ay0 extends AbstractC38658bd4<BluetoothGatt> {

    /* renamed from: b */
    public final BluetoothDevice f56670b;

    /* renamed from: c */
    public final C28721tU f56671c;

    /* renamed from: d */
    public final C50544ve5 f56672d;

    /* renamed from: e */
    public final C25174kX f56673e;

    /* renamed from: f */
    public final L46 f56674f;

    /* renamed from: g */
    public final boolean f56675g;

    /* renamed from: h */
    public final InterfaceC51925xy0 f56676h;

    /* renamed from: ay0$a */
    /* loaded from: classes6.dex */
    public class C12249a implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC39862dd4 f56677b;

        public C12249a(InterfaceC39862dd4 interfaceC39862dd4) {
            this.f56677b = interfaceC39862dd4;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            this.f56677b.release();
        }
    }

    /* renamed from: ay0$b */
    /* loaded from: classes6.dex */
    public class C12250b implements InterfaceC23448L<BluetoothGatt, BluetoothGatt> {
        public C12250b() {
        }

        @Override // io.reactivex.InterfaceC23448L
        /* renamed from: a */
        public AbstractC23442F<BluetoothGatt> mo33095c(AbstractC23442F<BluetoothGatt> abstractC23442F) {
            C38271ay0 c38271ay0 = C38271ay0.this;
            if (!c38271ay0.f56675g) {
                L46 l46 = c38271ay0.f56674f;
                return abstractC23442F.m33137c0(l46.f20724a, l46.f20725b, l46.f20726c, c38271ay0.m65203f());
            }
            return abstractC23442F;
        }
    }

    /* renamed from: ay0$c */
    /* loaded from: classes6.dex */
    public class CallableC12251c implements Callable<BluetoothGatt> {
        public CallableC12251c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BluetoothGatt call() {
            throw new BleGattCallbackTimeoutException(C38271ay0.this.f56673e.m28871a(), C29202uU.f112437b);
        }
    }

    /* renamed from: ay0$d */
    /* loaded from: classes6.dex */
    public class C12252d implements InterfaceC23446J<BluetoothGatt> {

        /* renamed from: ay0$d$a */
        /* loaded from: classes6.dex */
        public class C12253a implements InterfaceC23494q<InterfaceC44023ke5.EnumC25197a> {
            public C12253a() {
            }

            @Override // io.reactivex.functions.InterfaceC23494q
            /* renamed from: a */
            public boolean test(InterfaceC44023ke5.EnumC25197a enumC25197a) {
                return enumC25197a == InterfaceC44023ke5.EnumC25197a.CONNECTED;
            }
        }

        public C12252d() {
        }

        @Override // io.reactivex.InterfaceC23446J
        public void subscribe(InterfaceC23444H<BluetoothGatt> interfaceC23444H) {
            interfaceC23444H.mo4877b((AbstractC24501e) C38271ay0.this.m65205d().m33114p(C38271ay0.this.f56672d.m8318d().filter(new C12253a())).m33154L(C38271ay0.this.f56672d.m8311k().firstOrError()).m32169V().m33141Z(C47846r51.m16506b(interfaceC23444H)));
            C38271ay0.this.f56676h.mo4373a(InterfaceC44023ke5.EnumC25197a.CONNECTING);
            C38271ay0 c38271ay0 = C38271ay0.this;
            C38271ay0.this.f56673e.m28870b(c38271ay0.f56671c.m12291a(c38271ay0.f56670b, c38271ay0.f56675g, c38271ay0.f56672d.m8321a()));
        }
    }

    /* renamed from: ay0$e */
    /* loaded from: classes6.dex */
    public class CallableC12254e implements Callable<BluetoothGatt> {
        public CallableC12254e() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public BluetoothGatt call() {
            C38271ay0.this.f56676h.mo4373a(InterfaceC44023ke5.EnumC25197a.CONNECTED);
            return C38271ay0.this.f56673e.m28871a();
        }
    }

    public C38271ay0(BluetoothDevice bluetoothDevice, C28721tU c28721tU, C50544ve5 c50544ve5, C25174kX c25174kX, L46 l46, boolean z, InterfaceC51925xy0 interfaceC51925xy0) {
        this.f56670b = bluetoothDevice;
        this.f56671c = c28721tU;
        this.f56672d = c50544ve5;
        this.f56673e = c25174kX;
        this.f56674f = l46;
        this.f56675g = z;
        this.f56676h = interfaceC51925xy0;
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: b */
    public void mo14813b(InterfaceC24578y<BluetoothGatt> interfaceC24578y, InterfaceC39862dd4 interfaceC39862dd4) {
        interfaceC24578y.mo11915b((AbstractC24501e) m65204e().m33128i(m65202g()).m33110r(new C12249a(interfaceC39862dd4)).m33141Z(C47846r51.m16507a(interfaceC24578y)));
        if (this.f56675g) {
            interfaceC39862dd4.release();
        }
    }

    @Override // p000.AbstractC38658bd4
    /* renamed from: c */
    public BleException mo14812c(DeadObjectException deadObjectException) {
        return new BleDisconnectedException(deadObjectException, this.f56670b.getAddress(), -1);
    }

    /* renamed from: d */
    public AbstractC23442F<BluetoothGatt> m65205d() {
        return AbstractC23442F.m33161E(new CallableC12254e());
    }

    /* renamed from: e */
    public final AbstractC23442F<BluetoothGatt> m65204e() {
        return AbstractC23442F.m33126j(new C12252d());
    }

    /* renamed from: f */
    public AbstractC23442F<BluetoothGatt> m65203f() {
        return AbstractC23442F.m33161E(new CallableC12251c());
    }

    /* renamed from: g */
    public final InterfaceC23448L<BluetoothGatt, BluetoothGatt> m65202g() {
        return new C12250b();
    }

    public String toString() {
        return "ConnectOperation{" + C35098Ox2.m91172d(this.f56670b.getAddress()) + ", autoConnect=" + this.f56675g + CoreConstants.CURLY_RIGHT;
    }
}
