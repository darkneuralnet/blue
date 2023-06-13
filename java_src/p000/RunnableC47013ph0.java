package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: ph0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class RunnableC47013ph0<I, O> extends DA1<O> implements Runnable {

    /* renamed from: d */
    public InterfaceC20537fp<? super I, ? extends O> f103913d;

    /* renamed from: e */
    public final BlockingQueue<Boolean> f103914e = new LinkedBlockingQueue(1);

    /* renamed from: f */
    public final CountDownLatch f103915f = new CountDownLatch(1);

    /* renamed from: g */
    public ListenableFuture<? extends I> f103916g;

    /* renamed from: h */
    public volatile ListenableFuture<? extends O> f103917h;

    /* renamed from: ph0$a */
    /* loaded from: classes.dex */
    public class RunnableC27328a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ListenableFuture f103918b;

        public RunnableC27328a(ListenableFuture listenableFuture) {
            this.f103918b = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    RunnableC47013ph0.this.m110819b(IA1.m102839e(this.f103918b));
                } catch (CancellationException unused) {
                    RunnableC47013ph0.this.cancel(false);
                    RunnableC47013ph0.this.f103917h = null;
                    return;
                } catch (ExecutionException e) {
                    RunnableC47013ph0.this.m110818c(e.getCause());
                }
                RunnableC47013ph0.this.f103917h = null;
            } catch (Throwable th) {
                RunnableC47013ph0.this.f103917h = null;
                throw th;
            }
        }
    }

    public RunnableC47013ph0(InterfaceC20537fp<? super I, ? extends O> interfaceC20537fp, ListenableFuture<? extends I> listenableFuture) {
        this.f103913d = (InterfaceC20537fp) HZ3.m103731g(interfaceC20537fp);
        this.f103916g = (ListenableFuture) HZ3.m103731g(listenableFuture);
    }

    @Override // p000.DA1, java.util.concurrent.Future
    public boolean cancel(boolean z) {
        if (super.cancel(z)) {
            m18992g(this.f103914e, Boolean.valueOf(z));
            m18993f(this.f103916g, z);
            m18993f(this.f103917h, z);
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void m18993f(Future<?> future, boolean z) {
        if (future != null) {
            future.cancel(z);
        }
    }

    /* renamed from: g */
    public final <E> void m18992g(BlockingQueue<E> blockingQueue, E e) {
        boolean z = false;
        while (true) {
            try {
                blockingQueue.put(e);
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
    }

    @Override // p000.DA1, java.util.concurrent.Future
    public O get() throws InterruptedException, ExecutionException {
        if (!isDone()) {
            ListenableFuture<? extends I> listenableFuture = this.f103916g;
            if (listenableFuture != null) {
                listenableFuture.get();
            }
            this.f103915f.await();
            ListenableFuture<? extends O> listenableFuture2 = this.f103917h;
            if (listenableFuture2 != null) {
                listenableFuture2.get();
            }
        }
        return (O) super.get();
    }

    /* renamed from: h */
    public final <E> E m18991h(BlockingQueue<E> blockingQueue) {
        E take;
        boolean z = false;
        while (true) {
            try {
                take = blockingQueue.take();
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
        return take;
    }

    @Override // java.lang.Runnable
    public void run() {
        ListenableFuture<? extends O> apply;
        try {
            try {
                try {
                    try {
                        apply = this.f103913d.apply(IA1.m102839e(this.f103916g));
                        this.f103917h = apply;
                    } catch (Error e) {
                        m110818c(e);
                    } catch (UndeclaredThrowableException e2) {
                        m110818c(e2.getCause());
                    }
                } catch (Throwable th) {
                    this.f103913d = null;
                    this.f103916g = null;
                    this.f103915f.countDown();
                    throw th;
                }
            } catch (CancellationException unused) {
                cancel(false);
            } catch (ExecutionException e3) {
                m110818c(e3.getCause());
            }
        } catch (Exception e4) {
            m110818c(e4);
        }
        if (isCancelled()) {
            apply.cancel(((Boolean) m18991h(this.f103914e)).booleanValue());
            this.f103917h = null;
            this.f103913d = null;
            this.f103916g = null;
            this.f103915f.countDown();
            return;
        }
        apply.addListener(new RunnableC27328a(apply), C31631Ac0.m115449a());
        this.f103913d = null;
        this.f103916g = null;
        this.f103915f.countDown();
    }

    @Override // p000.DA1, java.util.concurrent.Future
    public O get(long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException, InterruptedException {
        if (!isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            ListenableFuture<? extends I> listenableFuture = this.f103916g;
            if (listenableFuture != null) {
                long nanoTime = System.nanoTime();
                listenableFuture.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - nanoTime);
            }
            long nanoTime2 = System.nanoTime();
            if (this.f103915f.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - nanoTime2);
                ListenableFuture<? extends O> listenableFuture2 = this.f103917h;
                if (listenableFuture2 != null) {
                    listenableFuture2.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return (O) super.get(j, timeUnit);
    }
}
