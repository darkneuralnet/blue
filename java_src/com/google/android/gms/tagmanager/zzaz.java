package com.google.android.gms.tagmanager;

import java.util.List;
/* loaded from: classes6.dex */
final class zzaz implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbe zzc;

    public zzaz(zzbe zzbeVar, List list, long j) {
        this.zzc = zzbeVar;
        this.zza = list;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzl(this.zza, this.zzb);
    }
}
