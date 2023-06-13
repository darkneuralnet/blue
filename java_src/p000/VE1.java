package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import p000.O80;
/* renamed from: VE1 */
/* loaded from: classes.dex */
public final class VE1 extends AbstractExecutorService implements ScheduledExecutorService {

    /* renamed from: c */
    public static ThreadLocal<ScheduledExecutorService> f38768c = new C8581a();

    /* renamed from: b */
    public final Handler f38769b;

    /* renamed from: VE1$a */
    /* loaded from: classes.dex */
    public class C8581a extends ThreadLocal<ScheduledExecutorService> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public ScheduledExecutorService initialValue() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                return C31631Ac0.m115446d();
            }
            if (Looper.myLooper() != null) {
                return new VE1(new Handler(Looper.myLooper()));
            }
            return null;
        }
    }

    /* renamed from: VE1$b */
    /* loaded from: classes.dex */
    public class CallableC8582b implements Callable<Void> {

        /* renamed from: b */
        public final /* synthetic */ Runnable f38770b;

        public CallableC8582b(Runnable runnable) {
            this.f38770b = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() {
            this.f38770b.run();
            return null;
        }
    }

    /* renamed from: VE1$c */
    /* loaded from: classes.dex */
    public static class RunnableScheduledFutureC8583c<V> implements RunnableScheduledFuture<V> {

        /* renamed from: b */
        public final AtomicReference<O80.C5832a<V>> f38772b = new AtomicReference<>(null);

        /* renamed from: c */
        public final long f38773c;

        /* renamed from: d */
        public final Callable<V> f38774d;

        /* renamed from: e */
        public final ListenableFuture<V> f38775e;

        /* renamed from: VE1$c$a */
        /* loaded from: classes.dex */
        public class C8584a implements O80.InterfaceC5834c<V> {

            /* renamed from: a */
            public final /* synthetic */ Handler f38776a;

            /* renamed from: b */
            public final /* synthetic */ Callable f38777b;

            /* renamed from: VE1$c$a$a */
            /* loaded from: classes.dex */
            public class RunnableC8585a implements Runnable {
                public RunnableC8585a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (RunnableScheduledFutureC8583c.this.f38772b.getAndSet(null) != null) {
                        C8584a c8584a = C8584a.this;
                        c8584a.f38776a.removeCallbacks(RunnableScheduledFutureC8583c.this);
                    }
                }
            }

            public C8584a(Handler handler, Callable callable) {
                this.f38776a = handler;
                this.f38777b = callable;
            }

            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public Object mo3207a(O80.C5832a<V> c5832a) throws RejectedExecutionException {
                c5832a.m92863a(new RunnableC8585a(), C31631Ac0.m115449a());
                RunnableScheduledFutureC8583c.this.f38772b.set(c5832a);
                return "HandlerScheduledFuture-" + this.f38777b.toString();
            }
        }

        public RunnableScheduledFutureC8583c(Handler handler, long j, Callable<V> callable) {
            this.f38773c = j;
            this.f38774d = callable;
            this.f38775e = O80.m92864a(new C8584a(handler, callable));
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Delayed delayed) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            return Long.compare(getDelay(timeUnit), delayed.getDelay(timeUnit));
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            return this.f38775e.cancel(z);
        }

        @Override // java.util.concurrent.Future
        public V get() throws ExecutionException, InterruptedException {
            return this.f38775e.get();
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return timeUnit.convert(this.f38773c - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f38775e.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f38775e.isDone();
        }

        @Override // java.util.concurrent.RunnableScheduledFuture
        public boolean isPeriodic() {
            return false;
        }

        @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
        public void run() {
            O80.C5832a<V> andSet = this.f38772b.getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.m92861c(this.f38774d.call());
                } catch (Exception e) {
                    andSet.m92858f(e);
                }
            }
        }

        @Override // java.util.concurrent.Future
        public V get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f38775e.get(j, timeUnit);
        }
    }

    public VE1(Handler handler) {
        this.f38769b = handler;
    }

    /* renamed from: a */
    public final RejectedExecutionException m80175a() {
        return new RejectedExecutionException(this.f38769b + " is shutting down");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(VE1.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (this.f38769b.post(runnable)) {
            return;
        }
        throw m80175a();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(new CallableC8582b(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(VE1.class.getSimpleName() + " does not yet support fixed-rate scheduling.");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException(VE1.class.getSimpleName() + " does not yet support fixed-delay scheduling.");
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException(VE1.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException(VE1.class.getSimpleName() + " cannot be shut down. Use Looper.quitSafely().");
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        long uptimeMillis = SystemClock.uptimeMillis() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        RunnableScheduledFutureC8583c runnableScheduledFutureC8583c = new RunnableScheduledFutureC8583c(this.f38769b, uptimeMillis, callable);
        return this.f38769b.postAtTime(runnableScheduledFutureC8583c, uptimeMillis) ? runnableScheduledFutureC8583c : IA1.m102837g(m80175a());
    }
}
