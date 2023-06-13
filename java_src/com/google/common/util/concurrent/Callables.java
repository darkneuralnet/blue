package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Callables;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import java.util.concurrent.Callable;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Callables {
    private Callables() {
    }

    public static <T> AsyncCallable<T> asAsyncCallable(final Callable<T> callable, final ListeningExecutorService listeningExecutorService) {
        EZ3.m108801n(callable);
        EZ3.m108801n(listeningExecutorService);
        return new AsyncCallable() { // from class: F80
            @Override // com.google.common.util.concurrent.AsyncCallable
            public final ListenableFuture call() {
                ListenableFuture submit;
                submit = ListeningExecutorService.this.submit(callable);
                return submit;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$returning$0(Object obj) throws Exception {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$threadRenaming$2(YU5 yu5, Callable callable) throws Exception {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean trySetName = trySetName((String) yu5.get(), currentThread);
        try {
            return callable.call();
        } finally {
            if (trySetName) {
                trySetName(name, currentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$threadRenaming$3(YU5 yu5, Runnable runnable) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        boolean trySetName = trySetName((String) yu5.get(), currentThread);
        try {
            runnable.run();
        } finally {
            if (trySetName) {
                trySetName(name, currentThread);
            }
        }
    }

    public static <T> Callable<T> returning(@ParametricNullness final T t) {
        return new Callable() { // from class: C80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$returning$0;
                lambda$returning$0 = Callables.lambda$returning$0(t);
                return lambda$returning$0;
            }
        };
    }

    public static <T> Callable<T> threadRenaming(final Callable<T> callable, final YU5<String> yu5) {
        EZ3.m108801n(yu5);
        EZ3.m108801n(callable);
        return new Callable() { // from class: E80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object lambda$threadRenaming$2;
                lambda$threadRenaming$2 = Callables.lambda$threadRenaming$2(YU5.this, callable);
                return lambda$threadRenaming$2;
            }
        };
    }

    private static boolean trySetName(String str, Thread thread) {
        try {
            thread.setName(str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static Runnable threadRenaming(final Runnable runnable, final YU5<String> yu5) {
        EZ3.m108801n(yu5);
        EZ3.m108801n(runnable);
        return new Runnable() { // from class: D80
            @Override // java.lang.Runnable
            public final void run() {
                Callables.lambda$threadRenaming$3(YU5.this, runnable);
            }
        };
    }
}
