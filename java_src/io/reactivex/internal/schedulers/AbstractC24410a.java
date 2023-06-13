package io.reactivex.internal.schedulers;

import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.functions.C23506a;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.a */
/* loaded from: classes8.dex */
public abstract class AbstractC24410a extends AtomicReference<Future<?>> implements InterfaceC23465c {

    /* renamed from: d */
    public static final FutureTask<Void> f90914d;

    /* renamed from: e */
    public static final FutureTask<Void> f90915e;
    private static final long serialVersionUID = 1811839108042568751L;

    /* renamed from: b */
    public final Runnable f90916b;

    /* renamed from: c */
    public Thread f90917c;

    static {
        Runnable runnable = C23506a.f88246b;
        f90914d = new FutureTask<>(runnable, null);
        f90915e = new FutureTask<>(runnable, null);
    }

    public AbstractC24410a(Runnable runnable) {
        this.f90916b = runnable;
    }

    /* renamed from: a */
    public final void m32356a(Future<?> future) {
        Future<?> future2;
        boolean z;
        do {
            future2 = get();
            if (future2 != f90914d) {
                if (future2 == f90915e) {
                    if (this.f90917c != Thread.currentThread()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    future.cancel(z);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public final void dispose() {
        FutureTask<Void> futureTask;
        boolean z;
        Future<?> future = get();
        if (future != f90914d && future != (futureTask = f90915e) && compareAndSet(future, futureTask) && future != null) {
            if (this.f90917c != Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            future.cancel(z);
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public final boolean mo1769e() {
        Future<?> future = get();
        if (future != f90914d && future != f90915e) {
            return false;
        }
        return true;
    }
}
