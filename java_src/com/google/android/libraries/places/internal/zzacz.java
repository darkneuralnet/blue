package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes6.dex */
public final class zzacz {
    static final zzacz zza = new zzacz(true);
    private static volatile boolean zzb = false;
    private static volatile zzacz zzc;
    private final Map zzd;

    public zzacz() {
        this.zzd = new HashMap();
    }

    public static zzacz zza() {
        zzacz zzaczVar = zzc;
        if (zzaczVar == null) {
            synchronized (zzacz.class) {
                zzaczVar = zzc;
                if (zzaczVar == null) {
                    zzaczVar = zza;
                    zzc = zzaczVar;
                }
            }
        }
        return zzaczVar;
    }

    public zzacz(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
