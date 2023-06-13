package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        delegate().addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.ForwardingFuture, p000.AbstractC33927Jx1
    public abstract ListenableFuture<? extends V> delegate();

    /* loaded from: classes6.dex */
    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {
        private final ListenableFuture<V> delegate;

        public SimpleForwardingListenableFuture(ListenableFuture<V> listenableFuture) {
            this.delegate = (ListenableFuture) EZ3.m108801n(listenableFuture);
        }

        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture, p000.AbstractC33927Jx1
        public final ListenableFuture<V> delegate() {
            return this.delegate;
        }
    }
}
