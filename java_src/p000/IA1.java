package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import p000.LY1;
import p000.O80;
/* renamed from: IA1 */
/* loaded from: classes.dex */
public final class IA1 {

    /* renamed from: a */
    public static final InterfaceC51452xA1<?, ?> f14618a = new C3362b();

    /* renamed from: IA1$a */
    /* loaded from: classes.dex */
    public class C3361a implements InterfaceC20537fp<I, O> {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC51452xA1 f14619a;

        public C3361a(InterfaceC51452xA1 interfaceC51452xA1) {
            this.f14619a = interfaceC51452xA1;
        }

        @Override // p000.InterfaceC20537fp
        public ListenableFuture<O> apply(I i) {
            return IA1.m102836h(this.f14619a.apply(i));
        }
    }

    /* renamed from: IA1$b */
    /* loaded from: classes.dex */
    public class C3362b implements InterfaceC51452xA1<Object, Object> {
        @Override // p000.InterfaceC51452xA1
        public Object apply(Object obj) {
            return obj;
        }
    }

    /* renamed from: IA1$c */
    /* loaded from: classes.dex */
    public class C3363c implements CA1<I> {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f14620a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC51452xA1 f14621b;

        public C3363c(O80.C5832a c5832a, InterfaceC51452xA1 interfaceC51452xA1) {
            this.f14620a = c5832a;
            this.f14621b = interfaceC51452xA1;
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            this.f14620a.m92858f(th);
        }

        @Override // p000.CA1
        public void onSuccess(I i) {
            try {
                this.f14620a.m92861c(this.f14621b.apply(i));
            } catch (Throwable th) {
                this.f14620a.m92858f(th);
            }
        }
    }

    /* renamed from: IA1$d */
    /* loaded from: classes.dex */
    public class RunnableC3364d implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f14622b;

        public RunnableC3364d(ListenableFuture listenableFuture) {
            this.f14622b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14622b.cancel(true);
        }
    }

    /* renamed from: IA1$e */
    /* loaded from: classes.dex */
    public static final class RunnableC3365e<V> implements Runnable {

        /* renamed from: b */
        public final Future<V> f14623b;

        /* renamed from: c */
        public final CA1<? super V> f14624c;

        public RunnableC3365e(Future<V> future, CA1<? super V> ca1) {
            this.f14623b = future;
            this.f14624c = ca1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f14624c.onSuccess(IA1.m102840d(this.f14623b));
            } catch (Error e) {
                e = e;
                this.f14624c.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.f14624c.onFailure(e);
            } catch (ExecutionException e3) {
                Throwable cause = e3.getCause();
                if (cause == null) {
                    this.f14624c.onFailure(e3);
                } else {
                    this.f14624c.onFailure(cause);
                }
            }
        }

        public String toString() {
            return RunnableC3365e.class.getSimpleName() + "," + this.f14624c;
        }
    }

    private IA1() {
    }

    /* renamed from: b */
    public static <V> void m102842b(ListenableFuture<V> listenableFuture, CA1<? super V> ca1, Executor executor) {
        HZ3.m103731g(ca1);
        listenableFuture.addListener(new RunnableC3365e(listenableFuture, ca1), executor);
    }

    /* renamed from: c */
    public static <V> ListenableFuture<List<V>> m102841c(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new C37618Zr2(new ArrayList(collection), true, C31631Ac0.m115449a());
    }

    /* renamed from: d */
    public static <V> V m102840d(Future<V> future) throws ExecutionException {
        boolean isDone = future.isDone();
        HZ3.m103728j(isDone, "Future was expected to be done, " + future);
        return (V) m102839e(future);
    }

    /* renamed from: e */
    public static <V> V m102839e(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: f */
    public static <V> ListenableFuture<V> m102838f(Throwable th) {
        return new LY1.C5026a(th);
    }

    /* renamed from: g */
    public static <V> ScheduledFuture<V> m102837g(Throwable th) {
        return new LY1.ScheduledFutureC5027b(th);
    }

    /* renamed from: h */
    public static <V> ListenableFuture<V> m102836h(V v) {
        if (v == null) {
            return LY1.m96643a();
        }
        return new LY1.C5028c(v);
    }

    /* renamed from: i */
    public static /* synthetic */ Object m102835i(ListenableFuture listenableFuture, O80.C5832a c5832a) throws Exception {
        m102831m(false, listenableFuture, f14618a, c5832a, C31631Ac0.m115449a());
        return "nonCancellationPropagating[" + listenableFuture + "]";
    }

    /* renamed from: j */
    public static <V> ListenableFuture<V> m102834j(final ListenableFuture<V> listenableFuture) {
        HZ3.m103731g(listenableFuture);
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: HA1
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m102835i;
                m102835i = IA1.m102835i(ListenableFuture.this, c5832a);
                return m102835i;
            }
        });
    }

    /* renamed from: k */
    public static <V> void m102833k(ListenableFuture<V> listenableFuture, O80.C5832a<V> c5832a) {
        m102832l(listenableFuture, f14618a, c5832a, C31631Ac0.m115449a());
    }

    /* renamed from: l */
    public static <I, O> void m102832l(ListenableFuture<I> listenableFuture, InterfaceC51452xA1<? super I, ? extends O> interfaceC51452xA1, O80.C5832a<O> c5832a, Executor executor) {
        m102831m(true, listenableFuture, interfaceC51452xA1, c5832a, executor);
    }

    /* renamed from: m */
    public static <I, O> void m102831m(boolean z, ListenableFuture<I> listenableFuture, InterfaceC51452xA1<? super I, ? extends O> interfaceC51452xA1, O80.C5832a<O> c5832a, Executor executor) {
        HZ3.m103731g(listenableFuture);
        HZ3.m103731g(interfaceC51452xA1);
        HZ3.m103731g(c5832a);
        HZ3.m103731g(executor);
        m102842b(listenableFuture, new C3363c(c5832a, interfaceC51452xA1), executor);
        if (z) {
            c5832a.m92863a(new RunnableC3364d(listenableFuture), C31631Ac0.m115449a());
        }
    }

    /* renamed from: n */
    public static <V> ListenableFuture<List<V>> m102830n(Collection<? extends ListenableFuture<? extends V>> collection) {
        return new C37618Zr2(new ArrayList(collection), false, C31631Ac0.m115449a());
    }

    /* renamed from: o */
    public static <I, O> ListenableFuture<O> m102829o(ListenableFuture<I> listenableFuture, InterfaceC51452xA1<? super I, ? extends O> interfaceC51452xA1, Executor executor) {
        HZ3.m103731g(interfaceC51452xA1);
        return m102828p(listenableFuture, new C3361a(interfaceC51452xA1), executor);
    }

    /* renamed from: p */
    public static <I, O> ListenableFuture<O> m102828p(ListenableFuture<I> listenableFuture, InterfaceC20537fp<? super I, ? extends O> interfaceC20537fp, Executor executor) {
        RunnableC47013ph0 runnableC47013ph0 = new RunnableC47013ph0(interfaceC20537fp, listenableFuture);
        listenableFuture.addListener(runnableC47013ph0, executor);
        return runnableC47013ph0;
    }
}
