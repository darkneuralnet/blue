package p000;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
@KeepForSdk
/* renamed from: cV2  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39174cV2 {
    @KeepForSdk

    /* renamed from: a */
    public final AZ5 f60722a;

    /* renamed from: b */
    public final AtomicInteger f60723b;

    /* renamed from: c */
    public final AtomicBoolean f60724c;

    public AbstractC39174cV2() {
        this.f60723b = new AtomicInteger(0);
        this.f60724c = new AtomicBoolean(false);
        this.f60722a = new AZ5();
    }

    @KeepForSdk
    /* renamed from: a */
    public <T> Task<T> m61278a(final Executor executor, final Callable<T> callable, final CancellationToken cancellationToken) {
        boolean z;
        if (this.f60723b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (cancellationToken.isCancellationRequested()) {
            return Tasks.forCanceled();
        }
        final CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        this.f60722a.m115549a(new Executor() { // from class: wZ8
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Executor executor2 = executor;
                CancellationToken cancellationToken2 = cancellationToken;
                CancellationTokenSource cancellationTokenSource2 = cancellationTokenSource;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                try {
                    executor2.execute(runnable);
                } catch (RuntimeException e) {
                    if (cancellationToken2.isCancellationRequested()) {
                        cancellationTokenSource2.cancel();
                    } else {
                        taskCompletionSource2.setException(e);
                    }
                    throw e;
                }
            }
        }, new Runnable() { // from class: V49
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC39174cV2.this.m61274g(cancellationToken, cancellationTokenSource, callable, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @KeepForSdk
    /* renamed from: b */
    public abstract void mo1910b() throws MlKitException;

    @KeepForSdk
    /* renamed from: c */
    public void m61277c() {
        this.f60723b.incrementAndGet();
    }

    @KeepForSdk
    /* renamed from: d */
    public abstract void mo1909d();

    @KeepForSdk
    /* renamed from: e */
    public void m61276e(Executor executor) {
        m61275f(executor);
    }

    @KeepForSdk
    /* renamed from: f */
    public Task<Void> m61275f(Executor executor) {
        boolean z;
        if (this.f60723b.get() > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f60722a.m115549a(executor, new Runnable() { // from class: HT8
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC39174cV2.this.m61273h(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    /* renamed from: g */
    public final /* synthetic */ void m61274g(CancellationToken cancellationToken, CancellationTokenSource cancellationTokenSource, Callable callable, TaskCompletionSource taskCompletionSource) {
        try {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
                return;
            }
            try {
                if (!this.f60724c.get()) {
                    mo1910b();
                    this.f60724c.set(true);
                }
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                    return;
                }
                Object call = callable.call();
                if (cancellationToken.isCancellationRequested()) {
                    cancellationTokenSource.cancel();
                } else {
                    taskCompletionSource.setResult(call);
                }
            } catch (RuntimeException e) {
                throw new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e);
            }
        } catch (Exception e2) {
            if (cancellationToken.isCancellationRequested()) {
                cancellationTokenSource.cancel();
            } else {
                taskCompletionSource.setException(e2);
            }
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void m61273h(TaskCompletionSource taskCompletionSource) {
        boolean z;
        int decrementAndGet = this.f60723b.decrementAndGet();
        if (decrementAndGet >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        if (decrementAndGet == 0) {
            mo1909d();
            this.f60724c.set(false);
        }
        Od9.m91781a();
        taskCompletionSource.setResult(null);
    }

    @KeepForSdk
    public AbstractC39174cV2(AZ5 az5) {
        this.f60723b = new AtomicInteger(0);
        this.f60724c = new AtomicBoolean(false);
        this.f60722a = az5;
    }
}
