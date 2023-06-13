package com.google.common.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class FakeTimeLimiter implements TimeLimiter {
    @Override // com.google.common.util.concurrent.TimeLimiter
    @ParametricNullness
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException {
        return (T) callWithTimeout(callable, j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    @ParametricNullness
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws ExecutionException {
        EZ3.m108801n(callable);
        EZ3.m108801n(timeUnit);
        try {
            return callable.call();
        } catch (Error e) {
            throw new ExecutionError(e);
        } catch (RuntimeException e2) {
            throw new UncheckedExecutionException(e2);
        } catch (Exception e3) {
            throw new ExecutionException(e3);
        } catch (Throwable th) {
            throw new ExecutionException(th);
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        EZ3.m108801n(t);
        EZ3.m108801n(cls);
        EZ3.m108801n(timeUnit);
        return t;
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) {
        runWithTimeout(runnable, j, timeUnit);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) {
        EZ3.m108801n(runnable);
        EZ3.m108801n(timeUnit);
        try {
            runnable.run();
        } catch (Error e) {
            throw new ExecutionError(e);
        } catch (RuntimeException e2) {
            throw new UncheckedExecutionException(e2);
        } catch (Throwable th) {
            throw new UncheckedExecutionException(th);
        }
    }
}
