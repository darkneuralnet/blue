package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import java.util.HashMap;
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzav extends AbstractC47966rH8<zzav> {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put(NamedConstantsKt.APP_NAME, this.zza);
        hashMap.put("appVersion", this.zzb);
        hashMap.put("appId", this.zzc);
        hashMap.put("appInstallerId", this.zzd);
        return AbstractC47966rH8.zza(hashMap);
    }

    public final String zzd() {
        return this.zzc;
    }

    public final String zze() {
        return this.zzd;
    }

    public final String zzf() {
        return this.zza;
    }

    public final String zzg() {
        return this.zzb;
    }

    @Override // p000.AbstractC47966rH8
    /* renamed from: zzh */
    public final void zzc(zzav zzavVar) {
        if (!TextUtils.isEmpty(this.zza)) {
            zzavVar.zza = this.zza;
        }
        if (!TextUtils.isEmpty(this.zzb)) {
            zzavVar.zzb = this.zzb;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzavVar.zzc = this.zzc;
        }
        if (!TextUtils.isEmpty(this.zzd)) {
            zzavVar.zzd = this.zzd;
        }
    }

    public final void zzi(String str) {
        this.zzc = str;
    }

    public final void zzj(String str) {
        this.zzd = str;
    }

    public final void zzk(String str) {
        this.zza = str;
    }

    public final void zzl(String str) {
        this.zzb = str;
    }
}
