package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes5.dex */
abstract class zzk<T> extends TaskApiCall<C41210ft7, T> {
    protected TaskCompletionSource<T> zzb;

    public /* synthetic */ zzk(int i, zzb zzbVar) {
        super(null, false, i);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(C41210ft7 c41210ft7, TaskCompletionSource taskCompletionSource) throws RemoteException {
        this.zzb = taskCompletionSource;
        zza((C40657ex7) c41210ft7.getService());
    }

    public abstract void zza(C40657ex7 c40657ex7) throws RemoteException;
}
