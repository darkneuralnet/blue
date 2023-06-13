package com.google.android.gms.internal.gtm;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzby extends zzcw {
    final /* synthetic */ zzcc zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzby(zzcc zzccVar, zzbv zzbvVar) {
        super(zzbvVar);
        this.zza = zzccVar;
    }

    @Override // com.google.android.gms.internal.gtm.zzcw
    public final void zza() {
        zzcc zzccVar = this.zza;
        Ql9.m87996h();
        if (!zzccVar.zzg()) {
            return;
        }
        zzccVar.zzO("Inactivity, disconnecting from device AnalyticsService");
        zzccVar.zzc();
    }
}
