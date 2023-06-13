package com.google.android.gms.tasks;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes6.dex */
public final class Tasks {
    private Tasks() {
    }

    public static <TResult> TResult await(Task<TResult> task) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        zzadVar.zza();
        return (TResult) zza(task);
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(TaskExecutors.MAIN_THREAD, callable);
    }

    public static <TResult> Task<TResult> forCanceled() {
        zzw zzwVar = new zzw();
        zzwVar.zzc();
        return zzwVar;
    }

    public static <TResult> Task<TResult> forException(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zza(exc);
        return zzwVar;
    }

    public static <TResult> Task<TResult> forResult(TResult tresult) {
        zzw zzwVar = new zzw();
        zzwVar.zzb(tresult);
        return zzwVar;
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            for (Task<?> task : collection) {
                if (task == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            zzw zzwVar = new zzw();
            zzaf zzafVar = new zzaf(collection.size(), zzwVar);
            for (Task<?> task2 : collection) {
                zzb(task2, zzafVar);
            }
            return zzwVar;
        }
        return forResult(null);
    }

    public static Task<List<Task<?>>> whenAllComplete(Collection<? extends Task<?>> collection) {
        if (collection != null && !collection.isEmpty()) {
            return whenAll(collection).continueWithTask(TaskExecutors.MAIN_THREAD, new zzab(collection));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Collection<? extends Task> collection) {
        if (collection != null && !collection.isEmpty()) {
            return (Task<List<TResult>>) whenAll(collection).continueWith(TaskExecutors.MAIN_THREAD, new zzaa(collection));
        }
        return forResult(Collections.emptyList());
    }

    public static <T> Task<T> withTimeout(Task<T> task, long j, TimeUnit timeUnit) {
        boolean z;
        Preconditions.checkNotNull(task, "Task must not be null");
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Timeout must be positive");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        final zzb zzbVar = new zzb();
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(zzbVar);
        final HandlerC32592Ee7 handlerC32592Ee7 = new HandlerC32592Ee7(Looper.getMainLooper());
        handlerC32592Ee7.postDelayed(new Runnable() { // from class: com.google.android.gms.tasks.zzx
            @Override // java.lang.Runnable
            public final void run() {
                TaskCompletionSource.this.trySetException(new TimeoutException());
            }
        }, timeUnit.toMillis(j));
        task.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.tasks.zzy
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                HandlerC32592Ee7 handlerC32592Ee72 = HandlerC32592Ee7.this;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                zzb zzbVar2 = zzbVar;
                handlerC32592Ee72.removeCallbacksAndMessages(null);
                if (task2.isSuccessful()) {
                    taskCompletionSource2.trySetResult(task2.getResult());
                } else if (task2.isCanceled()) {
                    zzbVar2.zza();
                } else {
                    Exception exception = task2.getException();
                    exception.getClass();
                    taskCompletionSource2.trySetException(exception);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    private static Object zza(Task task) throws ExecutionException {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void zzb(Task task, zzae zzaeVar) {
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, zzaeVar);
        task.addOnFailureListener(executor, zzaeVar);
        task.addOnCanceledListener(executor, zzaeVar);
    }

    @Deprecated
    public static <TResult> Task<TResult> call(Executor executor, Callable<TResult> callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzz(zzwVar, callable));
        return zzwVar;
    }

    public static Task<List<Task<?>>> whenAllComplete(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllComplete(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> Task<List<TResult>> whenAllSuccess(Task... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAllSuccess(Arrays.asList(taskArr));
        }
        return forResult(Collections.emptyList());
    }

    public static <TResult> TResult await(Task<TResult> task, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(task, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return (TResult) zza(task);
        }
        zzad zzadVar = new zzad(null);
        zzb(task, zzadVar);
        if (zzadVar.zzb(j, timeUnit)) {
            return (TResult) zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task<Void> whenAll(Task<?>... taskArr) {
        if (taskArr != null && taskArr.length != 0) {
            return whenAll(Arrays.asList(taskArr));
        }
        return forResult(null);
    }
}