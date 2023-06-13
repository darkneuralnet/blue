package com.google.android.libraries.places.internal;

import java.util.Arrays;
/* loaded from: classes6.dex */
public final class zzba {
    private final String zza;

    private zzba(String str) {
        this.zza = str;
    }

    public static zzba zza(zzba zzbaVar, zzba... zzbaVarArr) {
        String str;
        String valueOf = String.valueOf(zzbaVar.zza);
        String zzf = zzgv.zzc("").zzf(zzib.zza(Arrays.asList(zzbaVarArr), zzaz.zza));
        if (zzf.length() != 0) {
            str = valueOf.concat(zzf);
        } else {
            str = new String(valueOf);
        }
        return new zzba(str);
    }

    public static zzba zzb(String str) {
        return new zzba(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzba) {
            return this.zza.equals(((zzba) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
