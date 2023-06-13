package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
/* loaded from: classes6.dex */
public abstract class zzjq {
    private static String zza = "com.google.android.libraries.places.internal.zzjv";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.libraries.places.internal.zzjv", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzkv.zza();
    }

    public static long zzb() {
        return zzjo.zza().zzc();
    }

    public static zzja zzd(String str) {
        return zzjo.zza().zze(str);
    }

    public static zzjc zzf() {
        return zzi().zza();
    }

    public static zzjp zzg() {
        return zzjo.zza().zzh();
    }

    public static zzke zzi() {
        return zzjo.zza().zzj();
    }

    public static zzkr zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        return zzjo.zza().zzm();
    }

    public static boolean zzn(String str, Level level, boolean z) {
        zzi().zzd(str, level, z);
        return false;
    }

    public long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    public abstract zzja zze(String str);

    public abstract zzjp zzh();

    public zzke zzj() {
        return zzke.zze();
    }

    public abstract String zzm();
}
