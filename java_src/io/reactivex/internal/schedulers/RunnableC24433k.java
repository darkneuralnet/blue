package io.reactivex.internal.schedulers;

import io.reactivex.plugins.C24508a;
/* renamed from: io.reactivex.internal.schedulers.k */
/* loaded from: classes8.dex */
public final class RunnableC24433k extends AbstractC24410a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public RunnableC24433k(Runnable runnable) {
        super(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f90917c = Thread.currentThread();
        try {
            this.f90916b.run();
            this.f90917c = null;
        } catch (Throwable th) {
            this.f90917c = null;
            lazySet(AbstractC24410a.f90914d);
            C24508a.m31988u(th);
        }
    }
}
