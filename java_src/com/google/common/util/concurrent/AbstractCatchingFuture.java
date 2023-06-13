package com.google.common.util.concurrent;

import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {
    Class<X> exceptionType;
    F fallback;
    ListenableFuture<? extends V> inputFuture;

    /* loaded from: classes6.dex */
    public static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        public AsyncCatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public /* bridge */ /* synthetic */ Object doFallback(Object obj, Throwable th) throws Exception {
            return doFallback((AsyncFunction<? super AsyncFunction<? super X, ? extends V>, ? extends V>) obj, (AsyncFunction<? super X, ? extends V>) th);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public /* bridge */ /* synthetic */ void setResult(Object obj) {
            setResult((ListenableFuture) ((ListenableFuture) obj));
        }

        public ListenableFuture<? extends V> doFallback(AsyncFunction<? super X, ? extends V> asyncFunction, X x) throws Exception {
            ListenableFuture<? extends V> apply = asyncFunction.apply(x);
            EZ3.m108799p(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return apply;
        }

        public void setResult(ListenableFuture<? extends V> listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, InterfaceC50859wA1<? super X, ? extends V>, V> {
        public CatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, InterfaceC50859wA1<? super X, ? extends V> interfaceC50859wA1) {
            super(listenableFuture, cls, interfaceC50859wA1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        @ParametricNullness
        public /* bridge */ /* synthetic */ Object doFallback(Object obj, Throwable th) throws Exception {
            return doFallback((InterfaceC50859wA1<? super InterfaceC50859wA1<? super X, ? extends V>, ? extends V>) obj, (InterfaceC50859wA1<? super X, ? extends V>) th);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        public void setResult(@ParametricNullness V v) {
            set(v);
        }

        @ParametricNullness
        public V doFallback(InterfaceC50859wA1<? super X, ? extends V> interfaceC50859wA1, X x) throws Exception {
            return interfaceC50859wA1.apply(x);
        }
    }

    public AbstractCatchingFuture(ListenableFuture<? extends V> listenableFuture, Class<X> cls, F f) {
        this.inputFuture = (ListenableFuture) EZ3.m108801n(listenableFuture);
        this.exceptionType = (Class) EZ3.m108801n(cls);
        this.fallback = (F) EZ3.m108801n(f);
    }

    public static <V, X extends Throwable> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, InterfaceC50859wA1<? super X, ? extends V> interfaceC50859wA1, Executor executor) {
        CatchingFuture catchingFuture = new CatchingFuture(listenableFuture, cls, interfaceC50859wA1);
        listenableFuture.addListener(catchingFuture, MoreExecutors.rejectionPropagatingExecutor(executor, catchingFuture));
        return catchingFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public final void afterDone() {
        maybePropagateCancellationTo(this.inputFuture);
        this.inputFuture = null;
        this.exceptionType = null;
        this.fallback = null;
    }

    @ParametricNullness
    public abstract T doFallback(F f, X x) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String pendingToString() {
        String str;
        ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        Class<X> cls = this.exceptionType;
        F f = this.fallback;
        String pendingToString = super.pendingToString();
        if (listenableFuture != null) {
            String valueOf = String.valueOf(listenableFuture);
            StringBuilder sb = new StringBuilder(valueOf.length() + 16);
            sb.append("inputFuture=[");
            sb.append(valueOf);
            sb.append("], ");
            str = sb.toString();
        } else {
            str = "";
        }
        if (cls != null && f != null) {
            String valueOf2 = String.valueOf(cls);
            String valueOf3 = String.valueOf(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 29 + valueOf2.length() + valueOf3.length());
            sb2.append(str);
            sb2.append("exceptionType=[");
            sb2.append(valueOf2);
            sb2.append("], fallback=[");
            sb2.append(valueOf3);
            sb2.append("]");
            return sb2.toString();
        } else if (pendingToString != null) {
            String valueOf4 = String.valueOf(str);
            if (pendingToString.length() != 0) {
                return valueOf4.concat(pendingToString);
            }
            return new String(valueOf4);
        } else {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Class<X extends java.lang.Throwable>, F] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        boolean z2;
        Object obj;
        ListenableFuture<? extends V> listenableFuture = this.inputFuture;
        Class<X> cls = this.exceptionType;
        F f = this.fallback;
        boolean z3 = true;
        if (listenableFuture == null) {
            z = true;
        } else {
            z = false;
        }
        if (cls == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z | z2;
        if (f != null) {
            z3 = false;
        }
        if (!(z3 | z4) && !isCancelled()) {
            ?? r3 = (Class<X>) false;
            this.inputFuture = null;
            try {
                if (listenableFuture instanceof InternalFutureFailureAccess) {
                    th = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture);
                } else {
                    th = null;
                }
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause == null) {
                    String valueOf = String.valueOf(listenableFuture.getClass());
                    String valueOf2 = String.valueOf(e.getClass());
                    StringBuilder sb = new StringBuilder(valueOf.length() + 35 + valueOf2.length());
                    sb.append("Future type ");
                    sb.append(valueOf);
                    sb.append(" threw ");
                    sb.append(valueOf2);
                    sb.append(" without a cause");
                    cause = new NullPointerException(sb.toString());
                }
                th = cause;
            } catch (Throwable th) {
                th = th;
            }
            if (th == null) {
                obj = Futures.getDone(listenableFuture);
                if (th != null) {
                    set(NullnessCasts.uncheckedCastNullableTToT(obj));
                    return;
                } else if (!Platform.isInstanceOfThrowableClass(th, cls)) {
                    setFuture(listenableFuture);
                    return;
                } else {
                    try {
                        Object doFallback = doFallback(f, th);
                        this.exceptionType = null;
                        this.fallback = null;
                        setResult(doFallback);
                        return;
                    } catch (Throwable th2) {
                        try {
                            setException(th2);
                            return;
                        } finally {
                            this.exceptionType = null;
                            this.fallback = null;
                        }
                    }
                }
            }
            obj = null;
            if (th != null) {
            }
        }
    }

    public abstract void setResult(@ParametricNullness T t);

    public static <X extends Throwable, V> ListenableFuture<V> create(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        AsyncCatchingFuture asyncCatchingFuture = new AsyncCatchingFuture(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(asyncCatchingFuture, MoreExecutors.rejectionPropagatingExecutor(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }
}
