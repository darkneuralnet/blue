package com.google.android.gms.internal.gtm;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class zzcm implements Callable<String> {
    final /* synthetic */ zzcn zza;

    public zzcm(zzcn zzcnVar) {
        this.zza = zzcnVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ String call() throws Exception {
        String zzf;
        zzf = this.zza.zzf();
        return zzf;
    }
}
