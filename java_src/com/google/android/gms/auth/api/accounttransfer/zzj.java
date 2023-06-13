package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes5.dex */
class zzj<T> extends BinderC51862xr7 {
    final zzk<T> zzb;

    public zzj(zzk<T> zzkVar) {
        this.zzb = zzkVar;
    }

    @Override // p000.BinderC51862xr7, p000.InterfaceC47170pw7
    public final void zzd(Status status) {
        TaskCompletionSource<T> taskCompletionSource = this.zzb.zzb;
        int i = AccountTransferClient.zza;
        taskCompletionSource.setException(new AccountTransferException(status));
    }
}
