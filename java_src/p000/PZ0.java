package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p000.QZ0;
/* renamed from: PZ0 */
/* loaded from: classes6.dex */
public class PZ0 implements ScheduledExecutorService {

    /* renamed from: b */
    public final ExecutorService f28691b;

    /* renamed from: c */
    public final ScheduledExecutorService f28692c;

    public PZ0(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f28691b = executorService;
        this.f28692c = scheduledExecutorService;
    }

    /* renamed from: m */
    public static /* synthetic */ void m90100m(Runnable runnable, QZ0.InterfaceC6801b interfaceC6801b) {
        try {
            runnable.run();
            interfaceC6801b.set(null);
        } catch (Exception e) {
            interfaceC6801b.mo88399a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m90099n(final Runnable runnable, final QZ0.InterfaceC6801b interfaceC6801b) {
        this.f28691b.execute(new Runnable() { // from class: EZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.m90100m(runnable, interfaceC6801b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ ScheduledFuture m90098o(final Runnable runnable, long j, TimeUnit timeUnit, final QZ0.InterfaceC6801b interfaceC6801b) {
        return this.f28692c.schedule(new Runnable() { // from class: LZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.this.m90099n(runnable, interfaceC6801b);
            }
        }, j, timeUnit);
    }

    /* renamed from: p */
    public static /* synthetic */ void m90097p(Callable callable, QZ0.InterfaceC6801b interfaceC6801b) {
        try {
            interfaceC6801b.set(callable.call());
        } catch (Exception e) {
            interfaceC6801b.mo88399a(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Future m90096q(final Callable callable, final QZ0.InterfaceC6801b interfaceC6801b) throws Exception {
        return this.f28691b.submit(new Runnable() { // from class: NZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.m90097p(callable, interfaceC6801b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ ScheduledFuture m90095r(final Callable callable, long j, TimeUnit timeUnit, final QZ0.InterfaceC6801b interfaceC6801b) {
        return this.f28692c.schedule(new Callable() { // from class: MZ0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Future m90096q;
                m90096q = PZ0.this.m90096q(callable, interfaceC6801b);
                return m90096q;
            }
        }, j, timeUnit);
    }

    /* renamed from: t */
    public static /* synthetic */ void m90094t(Runnable runnable, QZ0.InterfaceC6801b interfaceC6801b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC6801b.mo88399a(e);
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m90093u(final Runnable runnable, final QZ0.InterfaceC6801b interfaceC6801b) {
        this.f28691b.execute(new Runnable() { // from class: OZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.m90094t(runnable, interfaceC6801b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ ScheduledFuture m90092w(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final QZ0.InterfaceC6801b interfaceC6801b) {
        return this.f28692c.scheduleAtFixedRate(new Runnable() { // from class: JZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.this.m90093u(runnable, interfaceC6801b);
            }
        }, j, j2, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m90091x(final Runnable runnable, final QZ0.InterfaceC6801b interfaceC6801b) {
        this.f28691b.execute(new Runnable() { // from class: FZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.m90089z(runnable, interfaceC6801b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ ScheduledFuture m90090y(final Runnable runnable, long j, long j2, TimeUnit timeUnit, final QZ0.InterfaceC6801b interfaceC6801b) {
        return this.f28692c.scheduleWithFixedDelay(new Runnable() { // from class: KZ0
            @Override // java.lang.Runnable
            public final void run() {
                PZ0.this.m90091x(runnable, interfaceC6801b);
            }
        }, j, j2, timeUnit);
    }

    /* renamed from: z */
    public static /* synthetic */ void m90089z(Runnable runnable, QZ0.InterfaceC6801b interfaceC6801b) {
        try {
            runnable.run();
        } catch (Exception e) {
            interfaceC6801b.mo88399a(e);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f28691b.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f28691b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f28691b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f28691b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f28691b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f28691b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j, final TimeUnit timeUnit) {
        return new QZ0(new QZ0.InterfaceC6802c() { // from class: GZ0
            @Override // p000.QZ0.InterfaceC6802c
            /* renamed from: a */
            public final ScheduledFuture mo88398a(QZ0.InterfaceC6801b interfaceC6801b) {
                ScheduledFuture m90098o;
                m90098o = PZ0.this.m90098o(runnable, j, timeUnit, interfaceC6801b);
                return m90098o;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new QZ0(new QZ0.InterfaceC6802c() { // from class: IZ0
            @Override // p000.QZ0.InterfaceC6802c
            /* renamed from: a */
            public final ScheduledFuture mo88398a(QZ0.InterfaceC6801b interfaceC6801b) {
                ScheduledFuture m90092w;
                m90092w = PZ0.this.m90092w(runnable, j, j2, timeUnit, interfaceC6801b);
                return m90092w;
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j, final long j2, final TimeUnit timeUnit) {
        return new QZ0(new QZ0.InterfaceC6802c() { // from class: HZ0
            @Override // p000.QZ0.InterfaceC6802c
            /* renamed from: a */
            public final ScheduledFuture mo88398a(QZ0.InterfaceC6801b interfaceC6801b) {
                ScheduledFuture m90090y;
                m90090y = PZ0.this.m90090y(runnable, j, j2, timeUnit, interfaceC6801b);
                return m90090y;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f28691b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f28691b.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f28691b.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j, final TimeUnit timeUnit) {
        return new QZ0(new QZ0.InterfaceC6802c() { // from class: DZ0
            @Override // p000.QZ0.InterfaceC6802c
            /* renamed from: a */
            public final ScheduledFuture mo88398a(QZ0.InterfaceC6801b interfaceC6801b) {
                ScheduledFuture m90095r;
                m90095r = PZ0.this.m90095r(callable, j, timeUnit, interfaceC6801b);
                return m90095r;
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f28691b.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f28691b.submit(runnable);
    }
}
