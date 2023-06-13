package com.google.android.gms.tagmanager;

import android.util.Log;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
@ShowFirstParty
/* loaded from: classes6.dex */
public final class zzdh {
    @VisibleForTesting
    static final zzbg zzb = new zzbg();

    public static void zza(String str) {
        Log.e("GoogleTagManager", str);
    }

    public static void zzc(String str) {
        Log.w("GoogleTagManager", str);
    }

    public static void zzd(String str, Throwable th) {
        Log.w("GoogleTagManager", str, th);
    }
}
