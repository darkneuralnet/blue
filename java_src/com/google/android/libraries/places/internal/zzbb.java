package com.google.android.libraries.places.internal;

import android.os.SystemClock;
/* loaded from: classes6.dex */
public final class zzbb {
    private static final zzas zza = new zzav();
    private static final zzbb zzb = new zzbb(SystemClock.elapsedRealtime());

    private zzbb() {
        SystemClock.elapsedRealtime();
    }

    private zzbb(long j) {
    }

    public static zzbb zza() {
        return new zzbb(SystemClock.elapsedRealtime());
    }
}
