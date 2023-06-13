package p000;

import com.polidea.rxandroidble2.exceptions.BleDisconnectedException;
import com.polidea.rxandroidble2.exceptions.BleException;
import io.reactivex.AbstractC23437E;
import io.reactivex.InterfaceC24578y;
import io.reactivex.InterfaceC24579z;
import io.reactivex.Observable;
import io.reactivex.functions.InterfaceC23483f;
import io.reactivex.observers.AbstractC24500d;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
/* renamed from: ry0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C48368ry0 implements InterfaceC47776qy0, InterfaceC52518yy0 {

    /* renamed from: b */
    public final String f107956b;

    /* renamed from: c */
    public final InterfaceC50799w41 f107957c;

    /* renamed from: d */
    public AbstractC24500d<BleException> f107958d;

    /* renamed from: f */
    public final Future<?> f107960f;

    /* renamed from: e */
    public final C39911di3 f107959e = new C39911di3();

    /* renamed from: g */
    public volatile boolean f107961g = true;

    /* renamed from: h */
    public BleException f107962h = null;

    /* renamed from: ry0$a */
    /* loaded from: classes6.dex */
    public class RunnableC28073a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC23437E f107963b;

        /* renamed from: c */
        public final /* synthetic */ String f107964c;

        public RunnableC28073a(AbstractC23437E abstractC23437E, String str) {
            this.f107963b = abstractC23437E;
            this.f107964c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (C48368ry0.this.f107961g) {
                try {
                    C37302Yi1<?> m43872d = C48368ry0.this.f107959e.m43872d();
                    InterfaceC37295Yh3<?> interfaceC37295Yh3 = m43872d.f46315c;
                    long currentTimeMillis = System.currentTimeMillis();
                    C35098Ox2.m91157s(interfaceC37295Yh3);
                    C35098Ox2.m91159q(interfaceC37295Yh3);
                    C41047fd4 c41047fd4 = new C41047fd4();
                    m43872d.m74435b(c41047fd4, this.f107963b);
                    c41047fd4.m41097a();
                    C35098Ox2.m91162n(interfaceC37295Yh3, currentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e) {
                    synchronized (C48368ry0.this) {
                        if (!C48368ry0.this.f107961g) {
                            break;
                        }
                        C52323ye5.m3124e(e, "Error while processing connection operation queue", new Object[0]);
                    }
                }
            }
            C48368ry0.this.m14978d();
            C52323ye5.m3112q("Terminated (%s)", C35098Ox2.m91172d(this.f107964c));
        }
    }

    /* renamed from: ry0$b */
    /* loaded from: classes6.dex */
    public class C28074b implements InterfaceC24579z<T> {

        /* renamed from: b */
        public final /* synthetic */ InterfaceC37295Yh3 f107966b;

        /* renamed from: ry0$b$a */
        /* loaded from: classes6.dex */
        public class C28075a implements InterfaceC23483f {

            /* renamed from: b */
            public final /* synthetic */ C37302Yi1 f107968b;

            public C28075a(C37302Yi1 c37302Yi1) {
                this.f107968b = c37302Yi1;
            }

            @Override // io.reactivex.functions.InterfaceC23483f
            public void cancel() {
                if (C48368ry0.this.f107959e.m43873c(this.f107968b)) {
                    C35098Ox2.m91160p(C28074b.this.f107966b);
                }
            }
        }

        public C28074b(InterfaceC37295Yh3 interfaceC37295Yh3) {
            this.f107966b = interfaceC37295Yh3;
        }

        @Override // io.reactivex.InterfaceC24579z
        public void subscribe(InterfaceC24578y<T> interfaceC24578y) {
            C37302Yi1 c37302Yi1 = new C37302Yi1(this.f107966b, interfaceC24578y);
            interfaceC24578y.mo11916a(new C28075a(c37302Yi1));
            C35098Ox2.m91161o(this.f107966b);
            C48368ry0.this.f107959e.m43875a(c37302Yi1);
        }
    }

    /* renamed from: ry0$c */
    /* loaded from: classes6.dex */
    public class C28076c extends AbstractC24500d<BleException> {
        public C28076c() {
        }

        @Override // io.reactivex.InterfaceC23436D
        /* renamed from: b */
        public void onNext(BleException bleException) {
            C48368ry0.this.m14977e(bleException);
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onComplete() {
        }

        @Override // io.reactivex.InterfaceC23436D
        public void onError(Throwable th) {
        }
    }

    public C48368ry0(String str, InterfaceC50799w41 interfaceC50799w41, ExecutorService executorService, AbstractC23437E abstractC23437E) {
        this.f107956b = str;
        this.f107957c = interfaceC50799w41;
        this.f107960f = executorService.submit(new RunnableC28073a(abstractC23437E, str));
    }

    @Override // p000.InterfaceC34043Kk0
    /* renamed from: a */
    public synchronized <T> Observable<T> mo14979a(InterfaceC37295Yh3<T> interfaceC37295Yh3) {
        if (!this.f107961g) {
            return Observable.error(this.f107962h);
        }
        return Observable.create(new C28074b(interfaceC37295Yh3));
    }

    @Override // p000.InterfaceC52518yy0
    /* renamed from: b */
    public void mo2205b() {
        this.f107958d.dispose();
        this.f107958d = null;
        m14977e(new BleDisconnectedException(this.f107956b, -1));
    }

    @Override // p000.InterfaceC52518yy0
    /* renamed from: c */
    public void mo2204c() {
        this.f107958d = (AbstractC24500d) this.f107957c.mo7470a().subscribeWith(new C28076c());
    }

    /* renamed from: d */
    public synchronized void m14978d() {
        while (!this.f107959e.m43874b()) {
            this.f107959e.m43871e().f46316d.mo11914c(this.f107962h);
        }
    }

    /* renamed from: e */
    public synchronized void m14977e(BleException bleException) {
        if (this.f107962h != null) {
            return;
        }
        C52323ye5.m3126c(bleException, "Connection operations queue to be terminated (%s)", C35098Ox2.m91172d(this.f107956b));
        this.f107961g = false;
        this.f107962h = bleException;
        this.f107960f.cancel(true);
    }
}
