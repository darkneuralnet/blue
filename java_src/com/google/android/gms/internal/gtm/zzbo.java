package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzbo implements Runnable {
    final /* synthetic */ zzcz zza;
    final /* synthetic */ zzbq zzb;

    public zzbo(zzbq zzbqVar, zzcz zzczVar) {
        this.zzb = zzbqVar;
        this.zza = zzczVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zzb.zza;
        zzckVar.zzf(this.zza);
    }
}
