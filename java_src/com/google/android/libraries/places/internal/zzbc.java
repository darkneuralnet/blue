package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes6.dex */
final class zzbc implements Continuation {
    final /* synthetic */ zzbd zza;

    public zzbc(zzbd zzbdVar) {
        this.zza = zzbdVar;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) throws Exception {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (task.isCanceled()) {
            taskCompletionSource.trySetException(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (task.getException() == null && task.getResult() == null) {
            taskCompletionSource.trySetException(new ApiException(new Status(8, "Location unavailable.")));
        }
        if (taskCompletionSource.getTask().getException() != null) {
            return taskCompletionSource.getTask();
        }
        return task;
    }
}
