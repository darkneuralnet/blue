package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
@ShowFirstParty
@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzba extends AbstractC47966rH8<zzba> {
    public int zza;
    public int zzb;
    private String zzc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zzc);
        hashMap.put("screenColors", 0);
        hashMap.put("screenWidth", Integer.valueOf(this.zza));
        hashMap.put("screenHeight", Integer.valueOf(this.zzb));
        hashMap.put("viewportWidth", 0);
        hashMap.put("viewportHeight", 0);
        return AbstractC47966rH8.zza(hashMap);
    }

    @Override // p000.AbstractC47966rH8
    public final /* bridge */ /* synthetic */ void zzc(zzba zzbaVar) {
        zzba zzbaVar2 = zzbaVar;
        int i = this.zza;
        if (i != 0) {
            zzbaVar2.zza = i;
        }
        int i2 = this.zzb;
        if (i2 != 0) {
            zzbaVar2.zzb = i2;
        }
        if (!TextUtils.isEmpty(this.zzc)) {
            zzbaVar2.zzc = this.zzc;
        }
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(String str) {
        this.zzc = str;
    }
}
