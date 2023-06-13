package com.google.android.libraries.places.internal;

import java.util.Locale;
/* loaded from: classes6.dex */
public final class zzem {
    private volatile String zza;
    private volatile Locale zzb;
    private volatile boolean zzc;

    public final synchronized String zza() {
        zzha.zzi(zzf(), "ApiConfig must be initialized.");
        this.zza.getClass();
        return this.zza;
    }

    public final synchronized Locale zzb() {
        Locale locale;
        zzha.zzi(zzf(), "ApiConfig must be initialized.");
        if (this.zzb == null) {
            locale = Locale.getDefault();
        } else {
            locale = this.zzb;
        }
        return locale;
    }

    public final synchronized void zzc() {
        this.zza = null;
        this.zzb = null;
    }

    public final synchronized void zzd(String str, Locale locale, boolean z) {
        zzha.zzc(str, "API Key must not be null.");
        zzha.zze(!str.isEmpty(), "API Key must not be empty.");
        this.zza = str;
        this.zzb = locale;
        this.zzc = false;
    }

    public final boolean zze() {
        return false;
    }

    public final synchronized boolean zzf() {
        return this.zza != null;
    }
}
