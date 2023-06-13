package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes6.dex */
class zzao extends AbstractBinderC42919im7 {
    private final TaskCompletionSource<Void> zza;

    public zzao(TaskCompletionSource<Void> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // p000.InterfaceC39354cn7
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        TaskUtil.setResultOrApiException(zzaaVar.getStatus(), this.zza);
    }

    public void zzc() {
    }
}
