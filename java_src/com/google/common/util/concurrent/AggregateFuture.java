package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AggregateFuture<InputT, OutputT> extends AggregateFutureState<OutputT> {
    private static final Logger logger = Logger.getLogger(AggregateFuture.class.getName());
    private final boolean allMustSucceed;
    private final boolean collectsValues;
    private QY1<? extends ListenableFuture<? extends InputT>> futures;

    /* loaded from: classes6.dex */
    public enum ReleaseResourcesReason {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public AggregateFuture(QY1<? extends ListenableFuture<? extends InputT>> qy1, boolean z, boolean z2) {
        super(qy1.size());
        this.futures = (QY1) EZ3.m108801n(qy1);
        this.allMustSucceed = z;
        this.collectsValues = z2;
    }

    private static boolean addCausalChain(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void collectValueFromNonCancelledFuture(int i, Future<? extends InputT> future) {
        try {
            collectOneValue(i, Futures.getDone(future));
        } catch (ExecutionException e) {
            handleException(e.getCause());
        } catch (Throwable th) {
            handleException(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: decrementCountAndMaybeComplete */
    public void lambda$init$1(QY1<? extends Future<? extends InputT>> qy1) {
        boolean z;
        int decrementRemainingAndGet = decrementRemainingAndGet();
        if (decrementRemainingAndGet >= 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108794u(z, "Less than 0 remaining futures");
        if (decrementRemainingAndGet == 0) {
            processCompleted(qy1);
        }
    }

    private void handleException(Throwable th) {
        EZ3.m108801n(th);
        if (this.allMustSucceed && !setException(th) && addCausalChain(getOrInitSeenExceptions(), th)) {
            log(th);
        } else if (th instanceof Error) {
            log(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$0(ListenableFuture listenableFuture, int i) {
        try {
            if (listenableFuture.isCancelled()) {
                this.futures = null;
                cancel(false);
            } else {
                collectValueFromNonCancelledFuture(i, listenableFuture);
            }
        } finally {
            lambda$init$1(null);
        }
    }

    private static void log(Throwable th) {
        String str;
        if (th instanceof Error) {
            str = "Input Future failed with Error";
        } else {
            str = "Got more than one input Future failure. Logging failures after the first";
        }
        logger.log(Level.SEVERE, str, th);
    }

    private void processCompleted(QY1<? extends Future<? extends InputT>> qy1) {
        if (qy1 != null) {
            AbstractC48175re6<? extends Future<? extends InputT>> it = qy1.iterator();
            int i = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    collectValueFromNonCancelledFuture(i, next);
                }
                i++;
            }
        }
        clearSeenExceptions();
        handleAllCompleted();
        releaseResources(ReleaseResourcesReason.ALL_INPUT_FUTURES_PROCESSED);
    }

    @Override // com.google.common.util.concurrent.AggregateFutureState
    public final void addInitialException(Set<Throwable> set) {
        EZ3.m108801n(set);
        if (!isCancelled()) {
            Throwable tryInternalFastPathGetFailure = tryInternalFastPathGetFailure();
            Objects.requireNonNull(tryInternalFastPathGetFailure);
            addCausalChain(set, tryInternalFastPathGetFailure);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        boolean z;
        super.afterDone();
        QY1<? extends ListenableFuture<? extends InputT>> qy1 = this.futures;
        releaseResources(ReleaseResourcesReason.OUTPUT_FUTURE_DONE);
        boolean isCancelled = isCancelled();
        if (qy1 != null) {
            z = true;
        } else {
            z = false;
        }
        if (isCancelled & z) {
            boolean wasInterrupted = wasInterrupted();
            AbstractC48175re6<? extends ListenableFuture<? extends InputT>> it = qy1.iterator();
            while (it.hasNext()) {
                it.next().cancel(wasInterrupted);
            }
        }
    }

    public abstract void collectOneValue(int i, @ParametricNullness InputT inputt);

    public abstract void handleAllCompleted();

    public final void init() {
        final QY1<? extends ListenableFuture<? extends InputT>> qy1;
        Objects.requireNonNull(this.futures);
        if (this.futures.isEmpty()) {
            handleAllCompleted();
        } else if (this.allMustSucceed) {
            AbstractC48175re6<? extends ListenableFuture<? extends InputT>> it = this.futures.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture<? extends InputT> next = it.next();
                next.addListener(new Runnable() { // from class: com.google.common.util.concurrent.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AggregateFuture.this.lambda$init$0(next, i);
                    }
                }, MoreExecutors.directExecutor());
                i++;
            }
        } else {
            if (this.collectsValues) {
                qy1 = this.futures;
            } else {
                qy1 = null;
            }
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.b
                @Override // java.lang.Runnable
                public final void run() {
                    AggregateFuture.this.lambda$init$1(qy1);
                }
            };
            AbstractC48175re6<? extends ListenableFuture<? extends InputT>> it2 = this.futures.iterator();
            while (it2.hasNext()) {
                it2.next().addListener(runnable, MoreExecutors.directExecutor());
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final String pendingToString() {
        QY1<? extends ListenableFuture<? extends InputT>> qy1 = this.futures;
        if (qy1 != null) {
            String valueOf = String.valueOf(qy1);
            StringBuilder sb = new StringBuilder(valueOf.length() + 8);
            sb.append("futures=");
            sb.append(valueOf);
            return sb.toString();
        }
        return super.pendingToString();
    }

    public void releaseResources(ReleaseResourcesReason releaseResourcesReason) {
        EZ3.m108801n(releaseResourcesReason);
        this.futures = null;
    }
}
