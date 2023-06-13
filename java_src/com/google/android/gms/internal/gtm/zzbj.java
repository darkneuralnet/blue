package com.google.android.gms.internal.gtm;
/* loaded from: classes5.dex */
final class zzbj implements Runnable {
    final /* synthetic */ zzbq zza;

    public zzbj(zzbq zzbqVar, boolean z) {
        this.zza = zzbqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzck zzckVar;
        zzckVar = this.zza.zza;
        zzckVar.zzae();
    }
}
