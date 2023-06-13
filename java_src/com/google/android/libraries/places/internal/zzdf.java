package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes6.dex */
abstract class zzdf extends zzca {
    private final Locale zza;
    private final String zzb;
    private final zzez zzc;

    public zzdf(zzen zzenVar, Locale locale, String str, boolean z, zzez zzezVar) {
        super(zzenVar);
        this.zza = locale;
        this.zzb = str;
        this.zzc = zzezVar;
    }

    public static void zzg(Map map, String str, Object obj, Object obj2) {
        String str2;
        if (obj != null) {
            str2 = obj.toString();
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzca
    public final String zzc() {
        zzdr zzdrVar = new zzdr(zze(), this.zzb);
        zzdrVar.zza(this.zza);
        zzdrVar.zzb(zzf());
        return zzdrVar.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzca
    public final Map zzd() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.zzc.zza());
        hashMap.put("X-Places-Android-Sdk", new String("2.6.0"));
        return hashMap;
    }

    public abstract String zze();

    public abstract Map zzf();
}
