package com.google.android.libraries.places.api.model;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
/* loaded from: classes6.dex */
public abstract class RectangularBounds implements LocationBias, LocationRestriction {
    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLng latLng, @RecentlyNonNull LatLng latLng2) {
        return newInstance(new LatLngBounds(latLng, latLng2));
    }

    @RecentlyNonNull
    public abstract LatLng getNortheast();

    @RecentlyNonNull
    public abstract LatLng getSouthwest();

    @RecentlyNonNull
    public static RectangularBounds newInstance(@RecentlyNonNull LatLngBounds latLngBounds) {
        zzv zzvVar = new zzv();
        zzvVar.zzb(latLngBounds.f71432b);
        zzvVar.zza(latLngBounds.f71433c);
        return zzvVar.zzc();
    }
}
