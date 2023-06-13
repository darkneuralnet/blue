package com.google.common.util.concurrent;

import com.google.common.util.concurrent.SimpleTimeLimiter;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class SimpleTimeLimiter implements TimeLimiter {
    private final ExecutorService executor;

    /* renamed from: com.google.common.util.concurrent.SimpleTimeLimiter$1 */
    /* loaded from: classes6.dex */
    public class C181281 implements InvocationHandler {
        final /* synthetic */ Set val$interruptibleMethods;
        final /* synthetic */ Object val$target;
        final /* synthetic */ long val$timeoutDuration;
        final /* synthetic */ TimeUnit val$timeoutUnit;

        public C181281(Object obj, long j, TimeUnit timeUnit, Set set) {
            this.val$target = obj;
            this.val$timeoutDuration = j;
            this.val$timeoutUnit = timeUnit;
            this.val$interruptibleMethods = set;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Object lambda$invoke$0(Method method, Object obj, Object[] objArr) throws Exception {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e) {
                throw SimpleTimeLimiter.throwCause(e, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, final Method method, final Object[] objArr) throws Throwable {
            final Object obj2 = this.val$target;
            return SimpleTimeLimiter.this.callWithTimeout(new Callable() { // from class: com.google.common.util.concurrent.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Object lambda$invoke$0;
                    lambda$invoke$0 = SimpleTimeLimiter.C181281.lambda$invoke$0(method, obj2, objArr);
                    return lambda$invoke$0;
                }
            }, this.val$timeoutDuration, this.val$timeoutUnit, this.val$interruptibleMethods.contains(method));
        }
    }

    private SimpleTimeLimiter(ExecutorService executorService) {
        this.executor = (ExecutorService) EZ3.m108801n(executorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit, boolean z) throws Exception {
        EZ3.m108801n(callable);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        Future<T> submit = this.executor.submit(callable);
        try {
            if (z) {
                try {
                    return submit.get(j, timeUnit);
                } catch (InterruptedException e) {
                    submit.cancel(true);
                    throw e;
                }
            }
            return (T) Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e2) {
            throw throwCause(e2, true);
        } catch (TimeoutException e3) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e3);
        }
    }

    private static void checkPositiveTimeout(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        EZ3.m108807h(z, "timeout must be positive: %s", j);
    }

    public static SimpleTimeLimiter create(ExecutorService executorService) {
        return new SimpleTimeLimiter(executorService);
    }

    private static boolean declaresInterruptedEx(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    private static Set<Method> findInterruptibleMethods(Class<?> cls) {
        Method[] methods;
        HashSet m43489f = C40052dw5.m43489f();
        for (Method method : cls.getMethods()) {
            if (declaresInterruptedEx(method)) {
                m43489f.add(method);
            }
        }
        return m43489f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception throwCause(Exception exc, boolean z) throws Exception {
        Throwable cause = exc.getCause();
        if (cause != null) {
            if (z) {
                cause.setStackTrace((StackTraceElement[]) C33281Hd3.m103638d(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
            }
            if (!(cause instanceof Exception)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw exc;
            }
            throw ((Exception) cause);
        }
        throw exc;
    }

    private void wrapAndThrowExecutionExceptionOrError(Throwable th) throws ExecutionException {
        if (!(th instanceof Error)) {
            if (th instanceof RuntimeException) {
                throw new UncheckedExecutionException(th);
            }
            throw new ExecutionException(th);
        }
        throw new ExecutionError((Error) th);
    }

    private void wrapAndThrowRuntimeExecutionExceptionOrError(Throwable th) {
        if (th instanceof Error) {
            throw new ExecutionError((Error) th);
        }
        throw new UncheckedExecutionException(th);
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T callUninterruptiblyWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        EZ3.m108801n(callable);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        Future<T> submit = this.executor.submit(callable);
        try {
            return (T) Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            wrapAndThrowExecutionExceptionOrError(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T newProxy(T t, Class<T> cls, long j, TimeUnit timeUnit) {
        EZ3.m108801n(t);
        EZ3.m108801n(cls);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        EZ3.m108810e(cls.isInterface(), "interfaceType must be an interface type");
        return (T) newProxy(cls, new C181281(t, j, timeUnit, findInterruptibleMethods(cls)));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runUninterruptiblyWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException {
        EZ3.m108801n(runnable);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        Future<?> submit = this.executor.submit(runnable);
        try {
            Uninterruptibles.getUninterruptibly(submit, j, timeUnit);
        } catch (ExecutionException e) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e.getCause());
            throw new AssertionError();
        } catch (TimeoutException e2) {
            submit.cancel(true);
            throw e2;
        }
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public void runWithTimeout(Runnable runnable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException {
        EZ3.m108801n(runnable);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        Future<?> submit = this.executor.submit(runnable);
        try {
            submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            wrapAndThrowRuntimeExecutionExceptionOrError(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }

    private static <T> T newProxy(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    @Override // com.google.common.util.concurrent.TimeLimiter
    public <T> T callWithTimeout(Callable<T> callable, long j, TimeUnit timeUnit) throws TimeoutException, InterruptedException, ExecutionException {
        EZ3.m108801n(callable);
        EZ3.m108801n(timeUnit);
        checkPositiveTimeout(j);
        Future<T> submit = this.executor.submit(callable);
        try {
            return submit.get(j, timeUnit);
        } catch (InterruptedException e) {
            e = e;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e2) {
            wrapAndThrowExecutionExceptionOrError(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            e = e3;
            submit.cancel(true);
            throw e;
        }
    }
}
