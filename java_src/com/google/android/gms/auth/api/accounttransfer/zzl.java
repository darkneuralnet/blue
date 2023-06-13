package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzl extends BinderC51862xr7 {
    final /* synthetic */ zzm zza;

    public zzl(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // p000.BinderC51862xr7, p000.InterfaceC47170pw7
    public final void zzd(Status status) {
        this.zza.zzb.setException(new AccountTransferException(status));
    }

    @Override // p000.BinderC51862xr7, p000.InterfaceC47170pw7
    public final void zze() {
        this.zza.zzb.setResult(null);
    }
}
