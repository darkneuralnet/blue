package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.O80;
/* renamed from: DA1 */
/* loaded from: classes.dex */
public class DA1<V> implements ListenableFuture<V> {

    /* renamed from: b */
    public final ListenableFuture<V> f5317b;

    /* renamed from: c */
    public O80.C5832a<V> f5318c;

    /* renamed from: DA1$a */
    /* loaded from: classes.dex */
    public class C1414a implements O80.InterfaceC5834c<V> {
        public C1414a() {
        }

        @Override // p000.O80.InterfaceC5834c
        /* renamed from: a */
        public Object mo3207a(O80.C5832a<V> c5832a) {
            boolean z;
            if (DA1.this.f5318c == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The result can only set once!");
            DA1.this.f5318c = c5832a;
            return "FutureChain[" + DA1.this + "]";
        }
    }

    public DA1(ListenableFuture<V> listenableFuture) {
        this.f5317b = (ListenableFuture) HZ3.m103731g(listenableFuture);
    }

    /* renamed from: a */
    public static <V> DA1<V> m110820a(ListenableFuture<V> listenableFuture) {
        if (listenableFuture instanceof DA1) {
            return (DA1) listenableFuture;
        }
        return new DA1<>(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f5317b.addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m110819b(V v) {
        O80.C5832a<V> c5832a = this.f5318c;
        if (c5832a != null) {
            return c5832a.m92861c(v);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m110818c(Throwable th) {
        O80.C5832a<V> c5832a = this.f5318c;
        if (c5832a != null) {
            return c5832a.m92858f(th);
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.f5317b.cancel(z);
    }

    /* renamed from: d */
    public final <T> DA1<T> m110817d(InterfaceC51452xA1<? super V, T> interfaceC51452xA1, Executor executor) {
        return (DA1) IA1.m102829o(this, interfaceC51452xA1, executor);
    }

    /* renamed from: e */
    public final <T> DA1<T> m110816e(InterfaceC20537fp<? super V, T> interfaceC20537fp, Executor executor) {
        return (DA1) IA1.m102828p(this, interfaceC20537fp, executor);
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException, ExecutionException {
        return this.f5317b.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f5317b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f5317b.isDone();
    }

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f5317b.get(j, timeUnit);
    }

    public DA1() {
        this.f5317b = O80.m92864a(new C1414a());
    }
}
