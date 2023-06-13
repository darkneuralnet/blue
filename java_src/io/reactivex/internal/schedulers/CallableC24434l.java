package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;
/* renamed from: io.reactivex.internal.schedulers.l */
/* loaded from: classes8.dex */
public final class CallableC24434l extends AbstractC24410a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public CallableC24434l(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: b */
    public Void call() throws Exception {
        this.f90917c = Thread.currentThread();
        try {
            this.f90916b.run();
            return null;
        } finally {
            lazySet(AbstractC24410a.f90914d);
            this.f90917c = null;
        }
    }
}
