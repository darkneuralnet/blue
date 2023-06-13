package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.internal.disposables.InterfaceC23500c;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
/* renamed from: io.reactivex.internal.schedulers.h */
/* loaded from: classes8.dex */
public class C24429h extends AbstractC23437E.AbstractC23440c {

    /* renamed from: b */
    public final ScheduledExecutorService f90981b;

    /* renamed from: c */
    public volatile boolean f90982c;

    public C24429h(ThreadFactory threadFactory) {
        this.f90981b = C24436n.m32333a(threadFactory);
    }

    @Override // io.reactivex.AbstractC23437E.AbstractC23440c
    /* renamed from: b */
    public InterfaceC23465c mo32320b(Runnable runnable) {
        return mo32319c(runnable, 0L, null);
    }

    @Override // io.reactivex.AbstractC23437E.AbstractC23440c
    /* renamed from: c */
    public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.f90982c) {
            return EnumC23502e.INSTANCE;
        }
        return m32339g(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    public void dispose() {
        if (!this.f90982c) {
            this.f90982c = true;
            this.f90981b.shutdownNow();
        }
    }

    @Override // io.reactivex.disposables.InterfaceC23465c
    /* renamed from: e */
    public boolean mo1769e() {
        return this.f90982c;
    }

    /* renamed from: g */
    public RunnableC24435m m32339g(Runnable runnable, long j, TimeUnit timeUnit, InterfaceC23500c interfaceC23500c) {
        Future<?> schedule;
        RunnableC24435m runnableC24435m = new RunnableC24435m(C24508a.m31986w(runnable), interfaceC23500c);
        if (interfaceC23500c != null && !interfaceC23500c.mo32983c(runnableC24435m)) {
            return runnableC24435m;
        }
        try {
            if (j <= 0) {
                schedule = this.f90981b.submit((Callable) runnableC24435m);
            } else {
                schedule = this.f90981b.schedule((Callable) runnableC24435m, j, timeUnit);
            }
            runnableC24435m.m32334a(schedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC23500c != null) {
                interfaceC23500c.mo32985a(runnableC24435m);
            }
            C24508a.m31988u(e);
        }
        return runnableC24435m;
    }

    /* renamed from: h */
    public InterfaceC23465c m32338h(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        CallableC24434l callableC24434l = new CallableC24434l(C24508a.m31986w(runnable));
        try {
            if (j <= 0) {
                schedule = this.f90981b.submit(callableC24434l);
            } else {
                schedule = this.f90981b.schedule(callableC24434l, j, timeUnit);
            }
            callableC24434l.m32356a(schedule);
            return callableC24434l;
        } catch (RejectedExecutionException e) {
            C24508a.m31988u(e);
            return EnumC23502e.INSTANCE;
        }
    }

    /* renamed from: i */
    public InterfaceC23465c m32337i(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable m31986w = C24508a.m31986w(runnable);
        if (j2 <= 0) {
            CallableC24423e callableC24423e = new CallableC24423e(m31986w, this.f90981b);
            try {
                if (j <= 0) {
                    schedule = this.f90981b.submit(callableC24423e);
                } else {
                    schedule = this.f90981b.schedule(callableC24423e, j, timeUnit);
                }
                callableC24423e.m32349b(schedule);
                return callableC24423e;
            } catch (RejectedExecutionException e) {
                C24508a.m31988u(e);
                return EnumC23502e.INSTANCE;
            }
        }
        RunnableC24433k runnableC24433k = new RunnableC24433k(m31986w);
        try {
            runnableC24433k.m32356a(this.f90981b.scheduleAtFixedRate(runnableC24433k, j, j2, timeUnit));
            return runnableC24433k;
        } catch (RejectedExecutionException e2) {
            C24508a.m31988u(e2);
            return EnumC23502e.INSTANCE;
        }
    }

    /* renamed from: j */
    public void m32336j() {
        if (!this.f90982c) {
            this.f90982c = true;
            this.f90981b.shutdown();
        }
    }
}
