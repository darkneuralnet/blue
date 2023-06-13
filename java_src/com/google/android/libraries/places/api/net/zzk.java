package com.google.android.libraries.places.api.net;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import java.util.List;
/* loaded from: classes6.dex */
final class zzk extends FindAutocompletePredictionsRequest {
    private final String zza;
    private final LocationBias zzb;
    private final LocationRestriction zzc;
    private final LatLng zzd;
    private final List zze;
    private final AutocompleteSessionToken zzf;
    private final TypeFilter zzg;
    private final CancellationToken zzh;

    public /* synthetic */ zzk(String str, LocationBias locationBias, LocationRestriction locationRestriction, LatLng latLng, List list, AutocompleteSessionToken autocompleteSessionToken, TypeFilter typeFilter, CancellationToken cancellationToken, zzj zzjVar) {
        this.zza = str;
        this.zzb = locationBias;
        this.zzc = locationRestriction;
        this.zzd = latLng;
        this.zze = list;
        this.zzf = autocompleteSessionToken;
        this.zzg = typeFilter;
        this.zzh = cancellationToken;
    }

    public final boolean equals(Object obj) {
        AutocompleteSessionToken autocompleteSessionToken;
        TypeFilter typeFilter;
        CancellationToken cancellationToken;
        if (obj == this) {
            return true;
        }
        if (obj instanceof FindAutocompletePredictionsRequest) {
            FindAutocompletePredictionsRequest findAutocompletePredictionsRequest = (FindAutocompletePredictionsRequest) obj;
            String str = this.zza;
            if (str != null ? str.equals(findAutocompletePredictionsRequest.getQuery()) : findAutocompletePredictionsRequest.getQuery() == null) {
                LocationBias locationBias = this.zzb;
                if (locationBias != null ? locationBias.equals(findAutocompletePredictionsRequest.getLocationBias()) : findAutocompletePredictionsRequest.getLocationBias() == null) {
                    LocationRestriction locationRestriction = this.zzc;
                    if (locationRestriction != null ? locationRestriction.equals(findAutocompletePredictionsRequest.getLocationRestriction()) : findAutocompletePredictionsRequest.getLocationRestriction() == null) {
                        LatLng latLng = this.zzd;
                        if (latLng != null ? latLng.equals(findAutocompletePredictionsRequest.getOrigin()) : findAutocompletePredictionsRequest.getOrigin() == null) {
                            if (this.zze.equals(findAutocompletePredictionsRequest.getCountries()) && ((autocompleteSessionToken = this.zzf) != null ? autocompleteSessionToken.equals(findAutocompletePredictionsRequest.getSessionToken()) : findAutocompletePredictionsRequest.getSessionToken() == null) && ((typeFilter = this.zzg) != null ? typeFilter.equals(findAutocompletePredictionsRequest.getTypeFilter()) : findAutocompletePredictionsRequest.getTypeFilter() == null) && ((cancellationToken = this.zzh) != null ? cancellationToken.equals(findAutocompletePredictionsRequest.getCancellationToken()) : findAutocompletePredictionsRequest.getCancellationToken() == null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest, com.google.android.libraries.places.internal.zzen
    public final CancellationToken getCancellationToken() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final List<String> getCountries() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationBias getLocationBias() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LocationRestriction getLocationRestriction() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final LatLng getOrigin() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final String getQuery() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final AutocompleteSessionToken getSessionToken() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest
    public final TypeFilter getTypeFilter() {
        return this.zzg;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.zza;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        LocationBias locationBias = this.zzb;
        if (locationBias == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = locationBias.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        LocationRestriction locationRestriction = this.zzc;
        if (locationRestriction == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = locationRestriction.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        LatLng latLng = this.zzd;
        if (latLng == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = latLng.hashCode();
        }
        int hashCode7 = (((i4 ^ hashCode4) * 1000003) ^ this.zze.hashCode()) * 1000003;
        AutocompleteSessionToken autocompleteSessionToken = this.zzf;
        if (autocompleteSessionToken == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = autocompleteSessionToken.hashCode();
        }
        int i5 = (hashCode7 ^ hashCode5) * 1000003;
        TypeFilter typeFilter = this.zzg;
        if (typeFilter == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = typeFilter.hashCode();
        }
        int i6 = (i5 ^ hashCode6) * 1000003;
        CancellationToken cancellationToken = this.zzh;
        if (cancellationToken != null) {
            i = cancellationToken.hashCode();
        }
        return i6 ^ i;
    }

    public final String toString() {
        String str = this.zza;
        String valueOf = String.valueOf(this.zzb);
        String valueOf2 = String.valueOf(this.zzc);
        String valueOf3 = String.valueOf(this.zzd);
        String obj = this.zze.toString();
        String valueOf4 = String.valueOf(this.zzf);
        String valueOf5 = String.valueOf(this.zzg);
        String valueOf6 = String.valueOf(this.zzh);
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        int length3 = valueOf2.length();
        int length4 = valueOf3.length();
        int length5 = valueOf4.length();
        int length6 = valueOf5.length();
        StringBuilder sb = new StringBuilder(length + 148 + length2 + length3 + length4 + obj.length() + length5 + length6 + valueOf6.length());
        sb.append("FindAutocompletePredictionsRequest{query=");
        sb.append(str);
        sb.append(", locationBias=");
        sb.append(valueOf);
        sb.append(", locationRestriction=");
        sb.append(valueOf2);
        sb.append(", origin=");
        sb.append(valueOf3);
        sb.append(", countries=");
        sb.append(obj);
        sb.append(", sessionToken=");
        sb.append(valueOf4);
        sb.append(", typeFilter=");
        sb.append(valueOf5);
        sb.append(", cancellationToken=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }
}
