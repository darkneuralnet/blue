package com.google.android.gms.auth.api.accounttransfer;

import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzaq;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzg extends zzk<DeviceMetaData> {
    final /* synthetic */ zzaq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(AccountTransferClient accountTransferClient, int i, zzaq zzaqVar) {
        super(1608, null);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.auth.api.accounttransfer.zzk
    public final void zza(C40657ex7 c40657ex7) throws RemoteException {
        c40657ex7.m42345c5(new zzf(this, this), this.zza);
    }
}
