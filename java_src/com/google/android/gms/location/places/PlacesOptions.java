package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import java.util.Locale;
@Deprecated
/* loaded from: classes6.dex */
public final class PlacesOptions implements Api.ApiOptions.Optional {
    private final Locale locale;
    public final String zzas;
    public final String zzat;
    public final int zzau;
    public final String zzav;

    /* loaded from: classes6.dex */
    public static class Builder {
        private int zzau = 0;

        public PlacesOptions build() {
            return new PlacesOptions(this);
        }
    }

    private PlacesOptions(Builder builder) {
        this.zzas = null;
        this.zzat = null;
        this.zzau = 0;
        this.zzav = null;
        this.locale = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PlacesOptions) || !Objects.equal(null, null) || !Objects.equal(null, null) || !Objects.equal(0, 0) || !Objects.equal(null, null) || !Objects.equal(null, null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(null, null, 0, null, null);
    }
}
