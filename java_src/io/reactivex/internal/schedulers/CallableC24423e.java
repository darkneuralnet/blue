package io.reactivex.internal.schedulers;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23506a;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.e */
/* loaded from: classes8.dex */
public final class CallableC24423e implements Callable<Void>, InterfaceC23465c {

    /* renamed from: g */
    public static final FutureTask<Void> f90953g = new FutureTask<>(C23506a.f88246b, null);

    /* renamed from: b */
    public final Runnable f90954b;

    /* renamed from: e */
    public final ExecutorService f90957e;

    /* renamed from: f */
    public Thread f90958f;

    /* renamed from: d */
    public final AtomicReference<Future<?>> f90956d = new AtomicReference<>();

    /* renamed from: c */
    public final AtomicReference<Future<?>> f90955c = new AtomicReference<>();

    public CallableC24423e(Runnable runnable, ExecutorService executorService) {
        this.f90954b = runnable;
        this.f90957e = executorService;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a */
    public Void call() throws Exception {
        this.f90958f = Thread.currentThread();
        try {
            this.f90954b.run();
            m32348c(this.f90957e.submit(this));
            this.f90958f = null;
        } catch (Throwable th) {
            this.f90958f = null;
            C24508a.m31988u(th);
        }
        return null;
    }

    /* renamed from: b */
    public void m32349b(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f90956d.get();
            if (future2 == f90953g) {
                if (this.f90958f != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!C42482i24.m35337a(this.f90956d, future2, future));
    }

    /* renamed from: c */
    public void m32348c(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = this.f90955c.get();
            if (future2 == f90953g) {
                if (this.f90958f != Thread.currentThread()) {
                    z = true;
                } else {
                    z = false;
                }
                future.cancel(z);
                return;
            }
        } while (!C42482i24.m35337a(this.f90955c, future2, future));
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        boolean z;
        AtomicReference<Future<?>> atomicReference = this.f90956d;
        FutureTask<Void> futureTask = f90953g;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        boolean z2 = true;
        if (andSet != null && andSet != futureTask) {
            if (this.f90958f != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            andSet.cancel(z);
        }
        Future<?> andSet2 = this.f90955c.getAndSet(futureTask);
        if (andSet2 != null && andSet2 != futureTask) {
            if (this.f90958f == Thread.currentThread()) {
                z2 = false;
            }
            andSet2.cancel(z2);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f90956d.get() == f90953g;
    }
}
