package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
/* renamed from: eb9  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C40439eb9<V> implements Mb9<V> {

    /* renamed from: c */
    public static final Mb9<?> f78601c = new C40439eb9(null);

    /* renamed from: d */
    public static final Logger f78602d = Logger.getLogger(C40439eb9.class.getName());

    /* renamed from: b */
    public final V f78603b;

    public C40439eb9(V v) {
        this.f78603b = v;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f78603b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // p000.Mb9
    /* renamed from: o */
    public final void mo9243o(Runnable runnable, Executor executor) {
        C52142yK8.m3662c(runnable, "Runnable was null.");
        C52142yK8.m3662c(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f78602d;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(valueOf.length() + 57 + valueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(valueOf);
            sb.append(" with executor ");
            sb.append(valueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e);
        }
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f78603b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length());
        sb.append(obj);
        sb.append("[status=SUCCESS, result=[");
        sb.append(valueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws ExecutionException {
        timeUnit.getClass();
        return this.f78603b;
    }
}
