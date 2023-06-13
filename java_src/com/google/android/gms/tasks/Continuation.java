package com.google.android.gms.tasks;
/* loaded from: classes6.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> task) throws Exception;
}
