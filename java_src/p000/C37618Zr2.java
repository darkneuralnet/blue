package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.O80;
/* renamed from: Zr2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C37618Zr2<V> implements ListenableFuture<List<V>> {

    /* renamed from: b */
    public List<? extends ListenableFuture<? extends V>> f49395b;

    /* renamed from: c */
    public List<V> f49396c;

    /* renamed from: d */
    public final boolean f49397d;

    /* renamed from: e */
    public final AtomicInteger f49398e;

    /* renamed from: f */
    public final ListenableFuture<List<V>> f49399f = O80.m92864a(new C10417a());

    /* renamed from: g */
    public O80.C5832a<List<V>> f49400g;

    /* renamed from: Zr2$a */
    /* loaded from: classes.dex */
    public class C10417a implements O80.InterfaceC5834c<List<V>> {
        public C10417a() {
        }

        @Override // p000.O80.InterfaceC5834c
        /* renamed from: a */
        public Object mo3207a(O80.C5832a<List<V>> c5832a) {
            boolean z;
            if (C37618Zr2.this.f49400g == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "The result can only set once!");
            C37618Zr2.this.f49400g = c5832a;
            return "ListFuture[" + this + "]";
        }
    }

    /* renamed from: Zr2$b */
    /* loaded from: classes.dex */
    public class RunnableC10418b implements Runnable {
        public RunnableC10418b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C37618Zr2 c37618Zr2 = C37618Zr2.this;
            c37618Zr2.f49396c = null;
            c37618Zr2.f49395b = null;
        }
    }

    /* renamed from: Zr2$c */
    /* loaded from: classes.dex */
    public class RunnableC10419c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f49403b;

        /* renamed from: c */
        public final /* synthetic */ ListenableFuture f49404c;

        public RunnableC10419c(int i, ListenableFuture listenableFuture) {
            this.f49403b = i;
            this.f49404c = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            C37618Zr2.this.m72394e(this.f49403b, this.f49404c);
        }
    }

    public C37618Zr2(List<? extends ListenableFuture<? extends V>> list, boolean z, Executor executor) {
        this.f49395b = (List) HZ3.m103731g(list);
        this.f49396c = new ArrayList(list.size());
        this.f49397d = z;
        this.f49398e = new AtomicInteger(list.size());
        m72395d(executor);
    }

    /* renamed from: a */
    public final void m72398a() throws InterruptedException {
        List<? extends ListenableFuture<? extends V>> list = this.f49395b;
        if (list != null && !isDone()) {
            for (ListenableFuture<? extends V> listenableFuture : list) {
                while (!listenableFuture.isDone()) {
                    try {
                        listenableFuture.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.f49397d) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f49399f.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* renamed from: b */
    public List<V> get() throws InterruptedException, ExecutionException {
        m72398a();
        return this.f49399f.get();
    }

    @Override // java.util.concurrent.Future
    /* renamed from: c */
    public List<V> get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f49399f.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        List<? extends ListenableFuture<? extends V>> list = this.f49395b;
        if (list != null) {
            for (ListenableFuture<? extends V> listenableFuture : list) {
                listenableFuture.cancel(z);
            }
        }
        return this.f49399f.cancel(z);
    }

    /* renamed from: d */
    public final void m72395d(Executor executor) {
        addListener(new RunnableC10418b(), C31631Ac0.m115449a());
        if (this.f49395b.isEmpty()) {
            this.f49400g.m92861c(new ArrayList(this.f49396c));
            return;
        }
        for (int i = 0; i < this.f49395b.size(); i++) {
            this.f49396c.add(null);
        }
        List<? extends ListenableFuture<? extends V>> list = this.f49395b;
        for (int i2 = 0; i2 < list.size(); i2++) {
            ListenableFuture<? extends V> listenableFuture = list.get(i2);
            listenableFuture.addListener(new RunnableC10419c(i2, listenableFuture), executor);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public void m72394e(int i, Future<? extends V> future) {
        O80.C5832a<List<V>> c5832a;
        ArrayList arrayList;
        int decrementAndGet;
        List<V> list = this.f49396c;
        if (!isDone() && list != 0) {
            boolean z = true;
            try {
                try {
                    try {
                        try {
                            HZ3.m103728j(future.isDone(), "Tried to set value from future which is not done");
                            list.set(i, IA1.m102839e(future));
                            decrementAndGet = this.f49398e.decrementAndGet();
                            if (decrementAndGet < 0) {
                                z = false;
                            }
                            HZ3.m103728j(z, "Less than 0 remaining futures");
                        } catch (ExecutionException e) {
                            if (this.f49397d) {
                                this.f49400g.m92858f(e.getCause());
                            }
                            int decrementAndGet2 = this.f49398e.decrementAndGet();
                            if (decrementAndGet2 < 0) {
                                z = false;
                            }
                            HZ3.m103728j(z, "Less than 0 remaining futures");
                            if (decrementAndGet2 == 0) {
                                List<V> list2 = this.f49396c;
                                if (list2 != null) {
                                    c5832a = this.f49400g;
                                    arrayList = new ArrayList(list2);
                                }
                            } else {
                                return;
                            }
                        }
                    } catch (RuntimeException e2) {
                        if (this.f49397d) {
                            this.f49400g.m92858f(e2);
                        }
                        int decrementAndGet3 = this.f49398e.decrementAndGet();
                        if (decrementAndGet3 < 0) {
                            z = false;
                        }
                        HZ3.m103728j(z, "Less than 0 remaining futures");
                        if (decrementAndGet3 == 0) {
                            List<V> list3 = this.f49396c;
                            if (list3 != null) {
                                c5832a = this.f49400g;
                                arrayList = new ArrayList(list3);
                            }
                        } else {
                            return;
                        }
                    }
                } catch (Error e3) {
                    this.f49400g.m92858f(e3);
                    int decrementAndGet4 = this.f49398e.decrementAndGet();
                    if (decrementAndGet4 < 0) {
                        z = false;
                    }
                    HZ3.m103728j(z, "Less than 0 remaining futures");
                    if (decrementAndGet4 == 0) {
                        List<V> list4 = this.f49396c;
                        if (list4 != null) {
                            c5832a = this.f49400g;
                            arrayList = new ArrayList(list4);
                        }
                    } else {
                        return;
                    }
                } catch (CancellationException unused) {
                    if (this.f49397d) {
                        cancel(false);
                    }
                    int decrementAndGet5 = this.f49398e.decrementAndGet();
                    if (decrementAndGet5 < 0) {
                        z = false;
                    }
                    HZ3.m103728j(z, "Less than 0 remaining futures");
                    if (decrementAndGet5 == 0) {
                        List<V> list5 = this.f49396c;
                        if (list5 != null) {
                            c5832a = this.f49400g;
                            arrayList = new ArrayList(list5);
                        }
                    } else {
                        return;
                    }
                }
                if (decrementAndGet == 0) {
                    List<V> list6 = this.f49396c;
                    if (list6 != null) {
                        c5832a = this.f49400g;
                        arrayList = new ArrayList(list6);
                        c5832a.m92861c(arrayList);
                        return;
                    }
                    HZ3.m103729i(isDone());
                    return;
                }
                return;
            } catch (Throwable th) {
                int decrementAndGet6 = this.f49398e.decrementAndGet();
                if (decrementAndGet6 < 0) {
                    z = false;
                }
                HZ3.m103728j(z, "Less than 0 remaining futures");
                if (decrementAndGet6 == 0) {
                    List<V> list7 = this.f49396c;
                    if (list7 != null) {
                        this.f49400g.m92861c(new ArrayList(list7));
                    } else {
                        HZ3.m103729i(isDone());
                    }
                }
                throw th;
            }
        }
        HZ3.m103728j(this.f49397d, "Future was done before all dependencies completed");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f49399f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f49399f.isDone();
    }
}
