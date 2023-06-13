package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes6.dex */
final class zzcw extends zzdf {
    public zzcw(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, Locale locale, String str, boolean z, zzez zzezVar) {
        super(findAutocompletePredictionsRequest, locale, str, false, zzezVar);
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final String zze() {
        return "autocomplete/json";
    }

    @Override // com.google.android.libraries.places.internal.zzdf
    public final Map zzf() {
        String replaceFirst;
        String str;
        HashMap hashMap = new HashMap();
        FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) zzb();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null) {
            replaceFirst = null;
        } else {
            replaceFirst = query.replaceFirst("^\\s+", "").replaceFirst("\\s+$", " ");
        }
        zzdf.zzg(hashMap, "input", replaceFirst, null);
        if (typeFilter != null) {
            str = zzdz.zza(typeFilter);
        } else {
            str = null;
        }
        zzdf.zzg(hashMap, "types", str, null);
        zzdf.zzg(hashMap, "sessiontoken", findAutocompletePredictionsRequest.getSessionToken(), null);
        zzdf.zzg(hashMap, AnalyticsRequestV2.HEADER_ORIGIN, zzdx.zzd(findAutocompletePredictionsRequest.getOrigin()), null);
        zzdf.zzg(hashMap, "locationbias", zzdx.zze(findAutocompletePredictionsRequest.getLocationBias()), null);
        zzdf.zzg(hashMap, "locationrestriction", zzdx.zzf(findAutocompletePredictionsRequest.getLocationRestriction()), null);
        zzdf.zzg(hashMap, "components", zzdx.zzb(findAutocompletePredictionsRequest.getCountries()), null);
        return hashMap;
    }
}
