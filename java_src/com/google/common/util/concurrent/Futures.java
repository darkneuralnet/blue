package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.CollectionFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.Partially;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p000.VY1;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Futures extends GwtFuturesCatchingSpecialization {

    /* loaded from: classes6.dex */
    public static final class CallbackListener<V> implements Runnable {
        final FutureCallback<? super V> callback;
        final Future<V> future;

        public CallbackListener(Future<V> future, FutureCallback<? super V> futureCallback) {
            this.future = future;
            this.callback = futureCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            Throwable tryInternalFastPathGetFailure;
            Future<V> future = this.future;
            if ((future instanceof InternalFutureFailureAccess) && (tryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) future)) != null) {
                this.callback.onFailure(tryInternalFastPathGetFailure);
                return;
            }
            try {
                this.callback.onSuccess(Futures.getDone(this.future));
            } catch (Error e) {
                e = e;
                this.callback.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                this.callback.onFailure(e);
            } catch (ExecutionException e3) {
                this.callback.onFailure(e3.getCause());
            }
        }

        public String toString() {
            return KV2.m98826c(this).m98818h(this.callback).toString();
        }
    }

    /* loaded from: classes6.dex */
    public static final class FutureCombiner<V> {
        private final boolean allMustSucceed;
        private final VY1<ListenableFuture<? extends V>> futures;

        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.futures, this.allMustSucceed, executor, callable);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
            return new CombinedFuture(this.futures, this.allMustSucceed, executor, asyncCallable);
        }

        public ListenableFuture<?> run(final Runnable runnable, Executor executor) {
            return call(new Callable<Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1
                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    runnable.run();
                    return null;
                }
            }, executor);
        }

        private FutureCombiner(boolean z, VY1<ListenableFuture<? extends V>> vy1) {
            this.allMustSucceed = z;
            this.futures = vy1;
        }
    }

    /* loaded from: classes6.dex */
    public static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {
        private InCompletionOrderState<T> state;

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.state = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (super.cancel(z)) {
                Objects.requireNonNull(inCompletionOrderState);
                inCompletionOrderState.recordOutputCancellation(z);
                return true;
            }
            return false;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            InCompletionOrderState<T> inCompletionOrderState = this.state;
            if (inCompletionOrderState != null) {
                int length = ((InCompletionOrderState) inCompletionOrderState).inputFutures.length;
                int i = ((InCompletionOrderState) inCompletionOrderState).incompleteOutputCount.get();
                StringBuilder sb = new StringBuilder(49);
                sb.append("inputCount=[");
                sb.append(length);
                sb.append("], remaining=[");
                sb.append(i);
                sb.append("]");
                return sb.toString();
            }
            return null;
        }

        private InCompletionOrderFuture(InCompletionOrderState<T> inCompletionOrderState) {
            this.state = inCompletionOrderState;
        }
    }

    /* loaded from: classes6.dex */
    public static final class InCompletionOrderState<T> {
        private volatile int delegateIndex;
        private final AtomicInteger incompleteOutputCount;
        private final ListenableFuture<? extends T>[] inputFutures;
        private boolean shouldInterrupt;
        private boolean wasCancelled;

        private void recordCompletion() {
            ListenableFuture<? extends T>[] listenableFutureArr;
            if (this.incompleteOutputCount.decrementAndGet() == 0 && this.wasCancelled) {
                for (ListenableFuture<? extends T> listenableFuture : this.inputFutures) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.shouldInterrupt);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordInputCompletion(VY1<AbstractFuture<T>> vy1, int i) {
            ListenableFuture<? extends T> listenableFuture = this.inputFutures[i];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture<? extends T> listenableFuture2 = listenableFuture;
            this.inputFutures[i] = null;
            for (int i2 = this.delegateIndex; i2 < vy1.size(); i2++) {
                if (vy1.get(i2).setFuture(listenableFuture2)) {
                    recordCompletion();
                    this.delegateIndex = i2 + 1;
                    return;
                }
            }
            this.delegateIndex = vy1.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void recordOutputCancellation(boolean z) {
            this.wasCancelled = true;
            if (!z) {
                this.shouldInterrupt = false;
            }
            recordCompletion();
        }

        private InCompletionOrderState(ListenableFuture<? extends T>[] listenableFutureArr) {
            this.wasCancelled = false;
            this.shouldInterrupt = true;
            this.delegateIndex = 0;
            this.inputFutures = listenableFutureArr;
            this.incompleteOutputCount = new AtomicInteger(listenableFutureArr.length);
        }
    }

    /* loaded from: classes6.dex */
    public static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {
        private ListenableFuture<V> delegate;

        public NonCancellationPropagatingFuture(ListenableFuture<V> listenableFuture) {
            this.delegate = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public void afterDone() {
            this.delegate = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        public String pendingToString() {
            ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                String valueOf = String.valueOf(listenableFuture);
                StringBuilder sb = new StringBuilder(valueOf.length() + 11);
                sb.append("delegate=[");
                sb.append(valueOf);
                sb.append("]");
                return sb.toString();
            }
            return null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture<V> listenableFuture = this.delegate;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }
    }

    private Futures() {
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        EZ3.m108801n(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(VY1.m79784A(listenableFutureArr), true);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, InterfaceC50859wA1<? super X, ? extends V> interfaceC50859wA1, Executor executor) {
        return AbstractCatchingFuture.create(listenableFuture, cls, interfaceC50859wA1, executor);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return AbstractCatchingFuture.create(listenableFuture, cls, asyncFunction, executor);
    }

    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.getChecked(future, cls);
    }

    @ParametricNullness
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        EZ3.m108792w(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @ParametricNullness
    public static <V> V getUnchecked(Future<V> future) {
        EZ3.m108801n(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e) {
            wrapAndThrowUnchecked(e.getCause());
            throw new AssertionError();
        }
    }

    private static <T> ListenableFuture<? extends T>[] gwtCompatibleToArray(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        Collection m79768x;
        if (iterable instanceof Collection) {
            m79768x = (Collection) iterable;
        } else {
            m79768x = VY1.m79768x(iterable);
        }
        return (ListenableFuture[]) m79768x.toArray(new ListenableFuture[0]);
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        ImmediateFuture.ImmediateCancelledFuture<Object> immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.INSTANCE;
        if (immediateCancelledFuture != null) {
            return immediateCancelledFuture;
        }
        return new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th) {
        EZ3.m108801n(th);
        return new ImmediateFuture.ImmediateFailedFuture(th);
    }

    public static <V> ListenableFuture<V> immediateFuture(@ParametricNullness V v) {
        if (v == null) {
            return (ListenableFuture<V>) ImmediateFuture.NULL;
        }
        return new ImmediateFuture(v);
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
        return ImmediateFuture.NULL;
    }

    public static <T> VY1<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        ListenableFuture[] gwtCompatibleToArray = gwtCompatibleToArray(iterable);
        final InCompletionOrderState inCompletionOrderState = new InCompletionOrderState(gwtCompatibleToArray);
        VY1.C8672a m79770v = VY1.m79770v(gwtCompatibleToArray.length);
        for (int i = 0; i < gwtCompatibleToArray.length; i++) {
            m79770v.mo42771d(new InCompletionOrderFuture(inCompletionOrderState));
        }
        final VY1<ListenableFuture<T>> m79763j = m79770v.m79763j();
        for (final int i2 = 0; i2 < gwtCompatibleToArray.length; i2++) {
            gwtCompatibleToArray[i2].addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures.3
                @Override // java.lang.Runnable
                public void run() {
                    InCompletionOrderState.this.recordInputCompletion(m79763j, i2);
                }
            }, MoreExecutors.directExecutor());
        }
        return m79763j;
    }

    public static <I, O> Future<O> lazyTransform(final Future<I> future, final InterfaceC50859wA1<? super I, ? extends O> interfaceC50859wA1) {
        EZ3.m108801n(future);
        EZ3.m108801n(interfaceC50859wA1);
        return new Future<O>() { // from class: com.google.common.util.concurrent.Futures.2
            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, O] */
            private O applyTransformation(I i) throws ExecutionException {
                try {
                    return interfaceC50859wA1.apply(i);
                } catch (Throwable th) {
                    throw new ExecutionException(th);
                }
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z) {
                return future.cancel(z);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, O] */
            @Override // java.util.concurrent.Future
            public O get() throws InterruptedException, ExecutionException {
                return applyTransformation(future.get());
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return future.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return future.isDone();
            }

            /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, O] */
            @Override // java.util.concurrent.Future
            public O get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
                return applyTransformation(future.get(j, timeUnit));
            }
        };
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture(listenableFuture);
        listenableFuture.addListener(nonCancellationPropagatingFuture, MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TrustedListenableFutureTask create = TrustedListenableFutureTask.create(asyncCallable);
        final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(create, j, timeUnit);
        create.addListener(new Runnable() { // from class: com.google.common.util.concurrent.Futures.1
            @Override // java.lang.Runnable
            public void run() {
                schedule.cancel(false);
            }
        }, MoreExecutors.directExecutor());
        return create;
    }

    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask create = TrustedListenableFutureTask.create(callable);
        executor.execute(create);
        return create;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
        TrustedListenableFutureTask create = TrustedListenableFutureTask.create(asyncCallable);
        executor.execute(create);
        return create;
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(VY1.m79784A(listenableFutureArr), false);
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, InterfaceC50859wA1<? super I, ? extends O> interfaceC50859wA1, Executor executor) {
        return AbstractTransformFuture.create(listenableFuture, interfaceC50859wA1, executor);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return AbstractTransformFuture.create(listenableFuture, asyncFunction, executor);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(false, VY1.m79784A(listenableFutureArr));
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(true, VY1.m79784A(listenableFutureArr));
    }

    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        return TimeoutFuture.create(listenableFuture, j, timeUnit, scheduledExecutorService);
    }

    private static void wrapAndThrowUnchecked(Throwable th) {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        throw new UncheckedExecutionException(th);
    }

    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.getChecked(future, cls, j, timeUnit);
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(VY1.m79768x(iterable), false);
    }

    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(false, VY1.m79768x(iterable));
    }

    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(true, VY1.m79768x(iterable));
    }

    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(VY1.m79768x(iterable), true);
    }

    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask create = TrustedListenableFutureTask.create(runnable, null);
        executor.execute(create);
        return create;
    }
}
