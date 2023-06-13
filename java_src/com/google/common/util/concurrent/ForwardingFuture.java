package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingFuture<V> extends AbstractC33927Jx1 implements Future<V> {

    /* loaded from: classes6.dex */
    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {
        private final Future<V> delegate;

        public SimpleForwardingFuture(Future<V> future) {
            this.delegate = (Future) EZ3.m108801n(future);
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture, p000.AbstractC33927Jx1
        public final Future<V> delegate() {
            return this.delegate;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    @Override // p000.AbstractC33927Jx1
    public abstract Future<? extends V> delegate();

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get() throws InterruptedException, ExecutionException {
        return delegate().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return delegate().isDone();
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return delegate().get(j, timeUnit);
    }
}
