package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.TypeFilter;
import com.stripe.android.model.PaymentMethod;
/* loaded from: classes6.dex */
public final class zzdz {
    private static final zzhv zza;

    static {
        zzhu zzhuVar = new zzhu();
        zzhuVar.zza(TypeFilter.ADDRESS, PaymentMethod.BillingDetails.PARAM_ADDRESS);
        zzhuVar.zza(TypeFilter.CITIES, "(cities)");
        zzhuVar.zza(TypeFilter.ESTABLISHMENT, "establishment");
        zzhuVar.zza(TypeFilter.GEOCODE, "geocode");
        zzhuVar.zza(TypeFilter.REGIONS, "(regions)");
        zza = zzhuVar.zzb();
    }

    public static String zza(TypeFilter typeFilter) {
        String str = (String) zza.get(typeFilter);
        return str == null ? "" : str;
    }
}
