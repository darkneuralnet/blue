package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzbm implements Runnable {
    final /* synthetic */ zzex zza;
    final /* synthetic */ zzbq zzb;

    public zzbm(zzbq zzbqVar, zzex zzexVar) {
        this.zzb = zzbqVar;
        this.zza = zzexVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zzb.zza;
        zzckVar.zzj(this.zza);
    }
}
