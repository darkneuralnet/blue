package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: J89 */
/* loaded from: classes6.dex */
public abstract class J89<V> extends AbstractC40320eO8 implements Future<V> {
    @Override // p000.AbstractC40320eO8
    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo42936a() {
        throw null;
    }

    /* renamed from: b */
    public abstract Future<? extends V> mo75540b();

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return mo75540b().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException, ExecutionException {
        return mo75540b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return mo75540b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return mo75540b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return mo75540b().get(j, timeUnit);
    }
}
