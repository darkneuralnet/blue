package com.google.android.libraries.places.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
/* loaded from: classes6.dex */
public final class zzkd extends zzjs {
    private static final Set zza;
    private static final zzjk zzb;
    private final String zzc;
    private final Level zzd;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(zzit.zza, zziz.zza)));
        zza = unmodifiableSet;
        zzb = zzjn.zza(unmodifiableSet).zzd();
    }

    public /* synthetic */ zzkd(String str, String str2, boolean z, boolean z2, Level level, zzkc zzkcVar) {
        super(str2);
        String str3;
        if (str2.length() > 23) {
            int i = -1;
            for (int length = str2.length() - 1; length >= 0; length--) {
                char charAt = str2.charAt(length);
                if (charAt == '.' || charAt == '$') {
                    i = length;
                    break;
                }
            }
            str2 = str2.substring(i + 1);
        }
        String valueOf = String.valueOf(str2);
        if (valueOf.length() != 0) {
            str3 = "".concat(valueOf);
        } else {
            str3 = new String("");
        }
        this.zzc = str3.substring(0, Math.min(str3.length(), 23));
        this.zzd = level;
    }
}
