package p000;

import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import com.polidea.rxandroidble2.exceptions.BleGattException;
import io.reactivex.InterfaceC23434B;
import io.reactivex.Observable;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.functions.InterfaceC23478a;
import io.reactivex.functions.InterfaceC23484g;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import p000.C45792nd5;
/* renamed from: v41  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50206v41 implements InterfaceC50799w41 {

    /* renamed from: a */
    public final C0058AG<BleException> f113488a;

    /* renamed from: b */
    public final Observable<BleException> f113489b;

    /* renamed from: c */
    public final Observable<Object> f113490c;

    /* renamed from: v41$a */
    /* loaded from: classes6.dex */
    public class C29407a implements InterfaceC23484g<Throwable> {
        public C29407a() {
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(Throwable th) {
            C52323ye5.m3124e(th, "Failed to monitor adapter state.", new Object[0]);
        }
    }

    /* renamed from: v41$b */
    /* loaded from: classes6.dex */
    public class C29408b implements InterfaceC23484g<BleException> {
        public C29408b() {
        }

        @Override // io.reactivex.functions.InterfaceC23484g
        /* renamed from: a */
        public void accept(BleException bleException) {
            C52323ye5.m3112q("An exception received, indicating that the adapter has became unusable.", new Object[0]);
        }
    }

    /* renamed from: v41$c */
    /* loaded from: classes6.dex */
    public class C29409c implements InterfaceC23492o<Boolean, BleException> {

        /* renamed from: b */
        public final /* synthetic */ String f113493b;

        public C29409c(String str) {
            this.f113493b = str;
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public BleException apply(Boolean bool) {
            return BleDisconnectedException.m45872a(this.f113493b);
        }
    }

    /* renamed from: v41$d */
    /* loaded from: classes6.dex */
    public class C29410d implements InterfaceC23478a {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC23465c f113495b;

        public C29410d(InterfaceC23465c interfaceC23465c) {
            this.f113495b = interfaceC23465c;
        }

        @Override // io.reactivex.functions.InterfaceC23478a
        public void run() {
            this.f113495b.dispose();
        }
    }

    /* renamed from: v41$e */
    /* loaded from: classes6.dex */
    public class C29411e implements InterfaceC23492o<BleException, InterfaceC23434B<?>> {
        public C29411e() {
        }

        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public InterfaceC23434B<?> apply(BleException bleException) {
            return Observable.error(bleException);
        }
    }

    /* renamed from: v41$f */
    /* loaded from: classes6.dex */
    public class C29412f implements InterfaceC23494q<Boolean> {
        @Override // io.reactivex.functions.InterfaceC23494q
        /* renamed from: a */
        public boolean test(Boolean bool) {
            return !bool.booleanValue();
        }
    }

    /* renamed from: v41$g */
    /* loaded from: classes6.dex */
    public class C29413g implements InterfaceC23492o<C45792nd5.C26559b, Boolean> {
        @Override // io.reactivex.functions.InterfaceC23492o
        /* renamed from: a */
        public Boolean apply(C45792nd5.C26559b c26559b) {
            return Boolean.valueOf(c26559b.m23401a());
        }
    }

    public C50206v41(String str, C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable) {
        C0058AG<BleException> m115951g = C0058AG.m115951g();
        this.f113488a = m115951g;
        Observable<BleException> m32089a = m115951g.firstElement().m32045d0().doOnTerminate(new C29410d(m9226c(c46978pd5, observable).map(new C29409c(str)).doOnNext(new C29408b()).subscribe(m115951g, new C29407a()))).replay().m32089a(0);
        this.f113489b = m32089a;
        this.f113490c = m32089a.flatMap(new C29411e());
    }

    /* renamed from: c */
    public static Observable<Boolean> m9226c(C46978pd5 c46978pd5, Observable<C45792nd5.C26559b> observable) {
        return observable.map(new C29413g()).startWith((Observable<R>) Boolean.valueOf(c46978pd5.m19048c())).filter(new C29412f());
    }

    @Override // p000.InterfaceC50799w41
    /* renamed from: a */
    public Observable<BleException> mo7470a() {
        return this.f113489b;
    }

    /* renamed from: b */
    public <T> Observable<T> m9227b() {
        return (Observable<T>) this.f113490c;
    }

    /* renamed from: d */
    public void m9225d(BleDisconnectedException bleDisconnectedException) {
        this.f113488a.accept(bleDisconnectedException);
    }

    /* renamed from: e */
    public void m9224e(BleGattException bleGattException) {
        this.f113488a.accept(bleGattException);
    }
}
