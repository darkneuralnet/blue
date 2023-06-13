package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;
/* loaded from: classes6.dex */
final class zzam extends zzao {
    private final zzan zza;

    public zzam(TaskCompletionSource<Void> taskCompletionSource, zzan zzanVar) {
        super(taskCompletionSource);
        this.zza = zzanVar;
    }

    @Override // com.google.android.gms.location.zzao, p000.InterfaceC39354cn7
    public final void zzc() {
        this.zza.zza();
    }
}
