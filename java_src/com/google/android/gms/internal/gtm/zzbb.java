package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzbb extends AbstractC47966rH8<zzbb> {
    private final List<C46090o74> zza = new ArrayList();
    private final List<C44914m84> zzb = new ArrayList();
    private final Map<String, List<C46090o74>> zzc = new HashMap();

    public final String toString() {
        HashMap hashMap = new HashMap();
        if (!this.zza.isEmpty()) {
            hashMap.put("products", this.zza);
        }
        if (!this.zzb.isEmpty()) {
            hashMap.put("promotions", this.zzb);
        }
        if (!this.zzc.isEmpty()) {
            hashMap.put("impressions", this.zzc);
        }
        hashMap.put("productAction", null);
        return AbstractC47966rH8.zza(hashMap);
    }

    @Override // p000.AbstractC47966rH8
    public final /* bridge */ /* synthetic */ void zzc(zzbb zzbbVar) {
        String str;
        zzbb zzbbVar2 = zzbbVar;
        zzbbVar2.zza.addAll(this.zza);
        zzbbVar2.zzb.addAll(this.zzb);
        for (Map.Entry<String, List<C46090o74>> entry : this.zzc.entrySet()) {
            String key = entry.getKey();
            for (C46090o74 c46090o74 : entry.getValue()) {
                if (c46090o74 != null) {
                    if (key == null) {
                        str = "";
                    } else {
                        str = key;
                    }
                    if (!zzbbVar2.zzc.containsKey(str)) {
                        zzbbVar2.zzc.put(str, new ArrayList());
                    }
                    zzbbVar2.zzc.get(str).add(c46090o74);
                }
            }
        }
    }

    public final List<C46090o74> zzd() {
        return Collections.unmodifiableList(this.zza);
    }

    public final List<C44914m84> zze() {
        return Collections.unmodifiableList(this.zzb);
    }

    public final Map<String, List<C46090o74>> zzf() {
        return this.zzc;
    }
}
