package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzaz extends AbstractC47966rH8<zzaz> {
    private final Map<String, Object> zza = new HashMap();

    public final String toString() {
        return AbstractC47966rH8.zza(this.zza);
    }

    @Override // p000.AbstractC47966rH8
    public final /* bridge */ /* synthetic */ void zzc(zzaz zzazVar) {
        zzaz zzazVar2 = zzazVar;
        Preconditions.checkNotNull(zzazVar2);
        zzazVar2.zza.putAll(this.zza);
    }

    public final Map<String, Object> zzd() {
        return Collections.unmodifiableMap(this.zza);
    }

    public final void zze(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zza.put(str, str2);
    }
}
