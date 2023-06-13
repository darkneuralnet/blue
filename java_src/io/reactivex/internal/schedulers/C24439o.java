package io.reactivex.internal.schedulers;

import io.reactivex.AbstractC23437E;
import io.reactivex.disposables.C23464b;
import io.reactivex.disposables.InterfaceC23465c;
import io.reactivex.internal.disposables.EnumC23502e;
import io.reactivex.plugins.C24508a;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: io.reactivex.internal.schedulers.o */
/* loaded from: classes8.dex */
public final class C24439o extends AbstractC23437E {

    /* renamed from: f */
    public static final ThreadFactoryC24431j f90995f;

    /* renamed from: g */
    public static final ScheduledExecutorService f90996g;

    /* renamed from: d */
    public final ThreadFactory f90997d;

    /* renamed from: e */
    public final AtomicReference<ScheduledExecutorService> f90998e;

    /* renamed from: io.reactivex.internal.schedulers.o$a */
    /* loaded from: classes8.dex */
    public static final class C24440a extends AbstractC23437E.AbstractC23440c {

        /* renamed from: b */
        public final ScheduledExecutorService f90999b;

        /* renamed from: c */
        public final C23464b f91000c = new C23464b();

        /* renamed from: d */
        public volatile boolean f91001d;

        public C24440a(ScheduledExecutorService scheduledExecutorService) {
            this.f90999b = scheduledExecutorService;
        }

        @Override // io.reactivex.AbstractC23437E.AbstractC23440c
        /* renamed from: c */
        public InterfaceC23465c mo32319c(Runnable runnable, long j, TimeUnit timeUnit) {
            Future<?> schedule;
            if (this.f91001d) {
                return EnumC23502e.INSTANCE;
            }
            RunnableC24435m runnableC24435m = new RunnableC24435m(C24508a.m31986w(runnable), this.f91000c);
            this.f91000c.mo32983c(runnableC24435m);
            try {
                if (j <= 0) {
                    schedule = this.f90999b.submit((Callable) runnableC24435m);
                } else {
                    schedule = this.f90999b.schedule((Callable) runnableC24435m, j, timeUnit);
                }
                runnableC24435m.m32334a(schedule);
                return runnableC24435m;
            } catch (RejectedExecutionException e) {
                dispose();
                C24508a.m31988u(e);
                return EnumC23502e.INSTANCE;
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        public void dispose() {
            if (!this.f91001d) {
                this.f91001d = true;
                this.f91000c.dispose();
            }
        }

        @Override // io.reactivex.disposables.InterfaceC23465c
        /* renamed from: e */
        public boolean mo1769e() {
            return this.f91001d;
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f90996g = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f90995f = new ThreadFactoryC24431j("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public C24439o() {
        this(f90995f);
    }

    /* renamed from: g */
    public static ScheduledExecutorService m32325g(ThreadFactory threadFactory) {
        return C24436n.m32333a(threadFactory);
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: b */
    public AbstractC23437E.AbstractC23440c mo8041b() {
        return new C24440a(this.f90998e.get());
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: e */
    public InterfaceC23465c mo32323e(Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        CallableC24434l callableC24434l = new CallableC24434l(C24508a.m31986w(runnable));
        try {
            if (j <= 0) {
                schedule = this.f90998e.get().submit(callableC24434l);
            } else {
                schedule = this.f90998e.get().schedule(callableC24434l, j, timeUnit);
            }
            callableC24434l.m32356a(schedule);
            return callableC24434l;
        } catch (RejectedExecutionException e) {
            C24508a.m31988u(e);
            return EnumC23502e.INSTANCE;
        }
    }

    @Override // io.reactivex.AbstractC23437E
    /* renamed from: f */
    public InterfaceC23465c mo32326f(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Future<?> schedule;
        Runnable m31986w = C24508a.m31986w(runnable);
        if (j2 <= 0) {
            ScheduledExecutorService scheduledExecutorService = this.f90998e.get();
            CallableC24423e callableC24423e = new CallableC24423e(m31986w, scheduledExecutorService);
            try {
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC24423e);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC24423e, j, timeUnit);
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
            runnableC24433k.m32356a(this.f90998e.get().scheduleAtFixedRate(runnableC24433k, j, j2, timeUnit));
            return runnableC24433k;
        } catch (RejectedExecutionException e2) {
            C24508a.m31988u(e2);
            return EnumC23502e.INSTANCE;
        }
    }

    @Override // io.reactivex.AbstractC23437E
    public void shutdown() {
        ScheduledExecutorService andSet;
        ScheduledExecutorService scheduledExecutorService = this.f90998e.get();
        ScheduledExecutorService scheduledExecutorService2 = f90996g;
        if (scheduledExecutorService != scheduledExecutorService2 && (andSet = this.f90998e.getAndSet(scheduledExecutorService2)) != scheduledExecutorService2) {
            andSet.shutdownNow();
        }
    }

    public C24439o(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f90998e = atomicReference;
        this.f90997d = threadFactory;
        atomicReference.lazySet(m32325g(threadFactory));
    }
}
