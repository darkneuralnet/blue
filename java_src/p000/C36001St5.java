package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattService;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.schedulers.C24542a;
import io.reactivex.subjects.AbstractC24569h;
import io.reactivex.subjects.C24552a;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
/* renamed from: St5  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36001St5 {

    /* renamed from: a */
    public final InterfaceC47776qy0 f34401a;

    /* renamed from: b */
    public final BluetoothGatt f34402b;

    /* renamed from: c */
    public final InterfaceC40503ei3 f34403c;

    /* renamed from: d */
    public AbstractC23442F<C49952ue5> f34404d;

    /* renamed from: e */
    public final AbstractC24569h<L46> f34405e = C24552a.m31922e().m31878a();

    /* renamed from: f */
    public boolean f34406f = false;

    /* renamed from: St5$a */
    /* loaded from: classes6.dex */
    public class C7571a implements InterfaceC23484g<InterfaceC23465c> {

        /* renamed from: b */
        public final /* synthetic */ long f34407b;

        /* renamed from: c */
        public final /* synthetic */ TimeUnit f34408c;

        public C7571a(long j, TimeUnit timeUnit) {
            this.f34407b = j;
            this.f34408c = timeUnit;
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(InterfaceC23465c interfaceC23465c) {
            C36001St5.this.f34405e.onNext(new L46(this.f34407b, this.f34408c, C24542a.m31934a()));
        }
    }

    /* renamed from: St5$b */
    /* loaded from: classes6.dex */
    public class C7572b implements InterfaceC23478a {
        public C7572b() {
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            C36001St5.this.f34406f = true;
        }
    }

    /* renamed from: St5$c */
    /* loaded from: classes6.dex */
    public class C7573c implements InterfaceC23478a {
        public C7573c() {
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            C36001St5.this.m84680d();
        }
    }

    /* renamed from: St5$d */
    /* loaded from: classes6.dex */
    public class C7574d implements InterfaceC23492o<List<BluetoothGattService>, C49952ue5> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public C49952ue5 apply(List<BluetoothGattService> list) {
            return new C49952ue5(list);
        }
    }

    /* renamed from: St5$e */
    /* loaded from: classes6.dex */
    public class C7575e implements InterfaceC23494q<List<BluetoothGattService>> {
        public C7575e() {
        }

        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(List<BluetoothGattService> list) {
            return list.size() > 0;
        }
    }

    /* renamed from: St5$f */
    /* loaded from: classes6.dex */
    public class CallableC7576f implements Callable<List<BluetoothGattService>> {
        public CallableC7576f() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public List<BluetoothGattService> call() {
            return C36001St5.this.f34402b.getServices();
        }
    }

    /* renamed from: St5$g */
    /* loaded from: classes6.dex */
    public class C7577g implements InterfaceC23492o<L46, AbstractC23442F<C49952ue5>> {
        public C7577g() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public AbstractC23442F<C49952ue5> apply(L46 l46) {
            return C36001St5.this.f34401a.mo14979a(C36001St5.this.f34403c.mo41008b(l46.f20724a, l46.f20725b)).firstOrError();
        }
    }

    public C36001St5(InterfaceC47776qy0 interfaceC47776qy0, BluetoothGatt bluetoothGatt, InterfaceC40503ei3 interfaceC40503ei3) {
        this.f34401a = interfaceC47776qy0;
        this.f34402b = bluetoothGatt;
        this.f34403c = interfaceC40503ei3;
        m84680d();
    }

    /* renamed from: f */
    public static InterfaceC23492o<List<BluetoothGattService>, C49952ue5> m84678f() {
        return new C7574d();
    }

    /* renamed from: a */
    public AbstractC23442F<C49952ue5> m84683a(long j, TimeUnit timeUnit) {
        if (this.f34406f) {
            return this.f34404d;
        }
        return this.f34404d.m33102v(new C7571a(j, timeUnit));
    }

    /* renamed from: b */
    public final AbstractC24507p<List<BluetoothGattService>> m84682b() {
        return AbstractC23442F.m33161E(new CallableC7576f()).m33098z(new C7575e());
    }

    /* renamed from: c */
    public final AbstractC23442F<L46> m84681c() {
        return this.f34405e.firstOrError();
    }

    /* renamed from: d */
    public void m84680d() {
        this.f34406f = false;
        this.f34404d = m84682b().m32067H(m84678f()).m32053W(m84681c().m33165A(m84679e())).m33101w(C23506a.m32973a(new C7572b())).m33106t(C23506a.m32973a(new C7573c())).m33130h();
    }

    /* renamed from: e */
    public final InterfaceC23492o<L46, AbstractC23442F<C49952ue5>> m84679e() {
        return new C7577g();
    }
}
