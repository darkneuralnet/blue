package com.google.android.libraries.places.api.net;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.internal.zzen;
import com.google.android.libraries.places.internal.zzhs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes6.dex */
public abstract class FindAutocompletePredictionsRequest implements zzen {

    /* loaded from: classes6.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public FindAutocompletePredictionsRequest build() {
            setCountries(zzhs.zzk(getCountries()));
            return zza();
        }

        @RecentlyNullable
        public abstract CancellationToken getCancellationToken();

        @RecentlyNonNull
        public abstract List<String> getCountries();

        @RecentlyNullable
        public abstract LocationBias getLocationBias();

        @RecentlyNullable
        public abstract LocationRestriction getLocationRestriction();

        @RecentlyNullable
        public abstract LatLng getOrigin();

        @RecentlyNullable
        public abstract String getQuery();

        @RecentlyNullable
        public abstract AutocompleteSessionToken getSessionToken();

        @RecentlyNullable
        public abstract TypeFilter getTypeFilter();

        @RecentlyNonNull
        public abstract Builder setCancellationToken(CancellationToken cancellationToken);

        @RecentlyNonNull
        public abstract Builder setCountries(@RecentlyNonNull List<String> list);

        @RecentlyNonNull
        public Builder setCountries(@RecentlyNonNull String... strArr) {
            return setCountries(zzhs.zzl(strArr));
        }

        @RecentlyNonNull
        public Builder setCountry(String str) {
            setCountries(str == null ? zzhs.zzm() : zzhs.zzn(str));
            return this;
        }

        @RecentlyNonNull
        public abstract Builder setLocationBias(LocationBias locationBias);

        @RecentlyNonNull
        public abstract Builder setLocationRestriction(LocationRestriction locationRestriction);

        @RecentlyNonNull
        public abstract Builder setOrigin(LatLng latLng);

        @RecentlyNonNull
        public abstract Builder setQuery(String str);

        @RecentlyNonNull
        public abstract Builder setSessionToken(AutocompleteSessionToken autocompleteSessionToken);

        @RecentlyNonNull
        public abstract Builder setTypeFilter(TypeFilter typeFilter);

        public abstract FindAutocompletePredictionsRequest zza();
    }

    @RecentlyNonNull
    public static Builder builder() {
        zzi zziVar = new zzi();
        zziVar.setCountries(new ArrayList());
        return zziVar;
    }

    @RecentlyNonNull
    public static FindAutocompletePredictionsRequest newInstance(String str) {
        Builder builder = builder();
        builder.setQuery(str);
        return builder.build();
    }

    @Override // com.google.android.libraries.places.internal.zzen
    @RecentlyNullable
    public abstract CancellationToken getCancellationToken();

    @RecentlyNonNull
    public abstract List<String> getCountries();

    @RecentlyNullable
    public String getCountry() {
        Object obj;
        if (getCountries().size() <= 1) {
            Iterator<T> it = getCountries().iterator();
            if (it.hasNext()) {
                obj = it.next();
            } else {
                obj = null;
            }
            return (String) obj;
        }
        throw new UnsupportedOperationException("Multiple countries found in this request - use getCountries() instead of getCountry().");
    }

    @RecentlyNullable
    public abstract LocationBias getLocationBias();

    @RecentlyNullable
    public abstract LocationRestriction getLocationRestriction();

    @RecentlyNullable
    public abstract LatLng getOrigin();

    @RecentlyNullable
    public abstract String getQuery();

    @RecentlyNullable
    public abstract AutocompleteSessionToken getSessionToken();

    @RecentlyNullable
    public abstract TypeFilter getTypeFilter();
}
