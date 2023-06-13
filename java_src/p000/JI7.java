package p000;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: JI7 */
/* loaded from: classes5.dex */
public abstract class JI7 extends AbstractC37119Xn7 implements ExecutorService {
    @Override // p000.AbstractC37119Xn7
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo1325a() {
        throw null;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return mo1324b().awaitTermination(j, timeUnit);
    }

    /* renamed from: b */
    public abstract ExecutorService mo1324b();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        mo1324b().execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) throws InterruptedException {
        return mo1324b().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) throws InterruptedException, ExecutionException {
        return mo1324b().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return mo1324b().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return mo1324b().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        mo1324b().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        return mo1324b().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return mo1324b().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return mo1324b().invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo1324b().invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return mo1324b().submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return mo1324b().submit(callable);
    }
}
