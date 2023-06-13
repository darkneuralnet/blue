package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* renamed from: LY1 */
/* loaded from: classes.dex */
public abstract class LY1<V> implements ListenableFuture<V> {

    /* renamed from: LY1$a */
    /* loaded from: classes.dex */
    public static class C5026a<V> extends LY1<V> {

        /* renamed from: b */
        public final Throwable f21659b;

        public C5026a(Throwable th) {
            this.f21659b = th;
        }

        @Override // p000.LY1, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f21659b);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f21659b + "]]";
        }
    }

    /* renamed from: LY1$b */
    /* loaded from: classes.dex */
    public static final class ScheduledFutureC5027b<V> extends C5026a<V> implements ScheduledFuture<V> {
        public ScheduledFutureC5027b(Throwable th) {
            super(th);
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    /* renamed from: LY1$c */
    /* loaded from: classes.dex */
    public static final class C5028c<V> extends LY1<V> {

        /* renamed from: c */
        public static final LY1<Object> f21660c = new C5028c(null);

        /* renamed from: b */
        public final V f21661b;

        public C5028c(V v) {
            this.f21661b = v;
        }

        @Override // p000.LY1, java.util.concurrent.Future
        public V get() {
            return this.f21661b;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f21661b + "]]";
        }
    }

    /* renamed from: a */
    public static <V> ListenableFuture<V> m96643a() {
        return C5028c.f21660c;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        HZ3.m103731g(runnable);
        HZ3.m103731g(executor);
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            C33928Jx2.m99530d("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j, TimeUnit timeUnit) throws ExecutionException {
        HZ3.m103731g(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }
}
