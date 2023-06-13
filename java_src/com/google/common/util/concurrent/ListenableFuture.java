package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public interface ListenableFuture<V> extends Future<V> {
    void addListener(Runnable runnable, Executor executor);
}