package com.google.android.gms.internal.gtm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes5.dex */
public final class zzbq extends zzbs {
    private final zzck zza;

    public zzbq(zzbv zzbvVar, zzbw zzbwVar) {
        super(zzbvVar);
        Preconditions.checkNotNull(zzbwVar);
        this.zza = new zzck(zzbvVar, zzbwVar);
    }

    public final long zza(zzbx zzbxVar) {
        zzW();
        Preconditions.checkNotNull(zzbxVar);
        Ql9.m87996h();
        long zzb = this.zza.zzb(zzbxVar, true);
        if (zzb == 0) {
            this.zza.zzk(zzbxVar);
        }
        return zzb;
    }

    public final void zzc() {
        zzW();
        Context zzo = zzo();
        if (zzfi.zza(zzo) && zzfn.zzh(zzo)) {
            Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            intent.setComponent(new ComponentName(zzo, "com.google.android.gms.analytics.AnalyticsService"));
            zzo.startService(intent);
            return;
        }
        zze(null);
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    public final void zzd() {
        this.zza.zzX();
    }

    public final void zze(zzcz zzczVar) {
        zzW();
        zzq().m87995i(new zzbo(this, zzczVar));
    }

    public final void zzf(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzq().m87995i(new zzbk(this, str, runnable));
    }

    public final void zzh(zzex zzexVar) {
        Preconditions.checkNotNull(zzexVar);
        zzW();
        zzG("Hit delivery requested", zzexVar);
        zzq().m87995i(new zzbm(this, zzexVar));
    }

    public final void zzi() {
        Ql9.m87996h();
        this.zza.zzl();
    }

    public final void zzj() {
        Ql9.m87996h();
        this.zza.zzm();
    }

    public final void zzk() {
        zzW();
        Ql9.m87996h();
        zzck zzckVar = this.zza;
        Ql9.m87996h();
        zzckVar.zzW();
        zzckVar.zzO("Service disconnected");
    }

    public final void zzm() {
        this.zza.zzaa();
    }
}
