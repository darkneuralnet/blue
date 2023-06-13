package com.google.android.libraries.places.api;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.internal.zzei;
import com.google.android.libraries.places.internal.zzej;
import com.google.android.libraries.places.internal.zzek;
import com.google.android.libraries.places.internal.zzem;
import com.google.android.libraries.places.internal.zzet;
import com.google.android.libraries.places.internal.zzev;
import com.google.android.libraries.places.internal.zzha;
import java.util.Locale;
/* loaded from: classes6.dex */
public final class Places {

    /* renamed from: a */
    public static final /* synthetic */ int f72087a = 0;
    private static final zzem zza = new zzem();
    private static volatile zzek zzb;

    private Places() {
    }

    @RecentlyNonNull
    public static synchronized PlacesClient createClient(@RecentlyNonNull Context context) {
        PlacesClient zza2;
        synchronized (Places.class) {
            try {
                zzha.zzc(context, "Context must not be null.");
                zza2 = zza(context, zzet.zzd(context).zze());
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
        return zza2;
    }

    public static synchronized void deinitialize() {
        synchronized (Places.class) {
            zza.zzc();
        }
    }

    public static void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str) {
        try {
            zzb(context, str, null, false);
        } catch (Error | RuntimeException e) {
            zzev.zzb(e);
            throw e;
        }
    }

    public static synchronized boolean isInitialized() {
        boolean zzf;
        synchronized (Places.class) {
            try {
                zzf = zza.zzf();
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
        return zzf;
    }

    public static synchronized PlacesClient zza(Context context, zzet zzetVar) {
        PlacesClient zzb2;
        synchronized (Places.class) {
            try {
                zzha.zzc(context, "Context must not be null.");
                zzha.zzi(isInitialized(), "Places must be initialized first.");
                zzej zza2 = zzei.zza();
                zza2.zzc(context);
                zza2.zza(zza);
                zza2.zzb(zzetVar);
                zzb2 = zza2.zzd().zzb();
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
        return zzb2;
    }

    public static synchronized void zzb(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale, boolean z) {
        synchronized (Places.class) {
            try {
                zzha.zzc(context, "Application context must not be null.");
                zzha.zzc(str, "API Key must not be null.");
                zzha.zze(!str.isEmpty(), "API Key must not be empty.");
                zzev.zza(context.getApplicationContext(), false);
                zza.zzd(str, locale, false);
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
    }

    public static synchronized void initialize(@RecentlyNonNull Context context, @RecentlyNonNull String str, Locale locale) {
        synchronized (Places.class) {
            try {
                zzb(context, str, locale, false);
            } catch (Error | RuntimeException e) {
                zzev.zzb(e);
                throw e;
            }
        }
    }
}
