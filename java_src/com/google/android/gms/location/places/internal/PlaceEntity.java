package com.google.android.gms.location.places.internal;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.stripe.android.model.PaymentMethod;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
@SafeParcelable.Class(creator = "PlaceEntityCreator")
@SafeParcelable.Reserved({1000, 2, 3, 12, 13, 16, 18})
/* loaded from: classes6.dex */
public final class PlaceEntity extends AbstractSafeParcelable implements ReflectedParcelable, Place {
    public static final Parcelable.Creator<PlaceEntity> CREATOR = new zzag();
    @SafeParcelable.Field(getter = "getLatLng", m51606id = 4)
    private final LatLng latLng;
    private Locale locale;
    @SafeParcelable.Field(getter = "getName", m51606id = 19)
    private final String name;
    @SafeParcelable.Field(getter = "getId", m51606id = 1)
    private final String zzbw;
    @SafeParcelable.Field(getter = "getLevelNumber", m51606id = 5)
    private final float zzbx;
    @SafeParcelable.Field(getter = "getViewport", m51606id = 6)
    private final LatLngBounds zzby;
    @SafeParcelable.Field(getter = "getTimeZoneId", m51606id = 7)
    private final String zzbz;
    @SafeParcelable.Field(getter = "isPermanentlyClosed", m51606id = 9)
    private final boolean zzca;
    @SafeParcelable.Field(getter = "getRating", m51606id = 10)
    private final float zzcb;
    @SafeParcelable.Field(getter = "getPriceLevel", m51606id = 11)
    private final int zzcc;
    @SafeParcelable.Field(getter = "getAttributionsList", m51606id = 17)
    private final List<String> zzcd;
    @SafeParcelable.Field(getter = "getPlaceOpeningHours", m51606id = 21)
    private final zzal zzce;
    @SafeParcelable.Field(getter = "getExtendedDetails", m51606id = 22)
    private final zzai zzcf;
    @SafeParcelable.Field(getter = "getAdrAddress", m51606id = 23)
    private final String zzcg;
    @SafeParcelable.Field(getter = "getAddress", m51606id = 14)
    private final String zzf;
    @SafeParcelable.Field(getter = "getPlaceTypes", m51606id = 20)
    private final List<Integer> zzg;
    @SafeParcelable.Field(getter = "getPhoneNumber", m51606id = 15)
    private final String zzh;
    @SafeParcelable.Field(getter = "getWebsiteUri", m51606id = 8)
    private final Uri zzi;

    /* loaded from: classes6.dex */
    public static class zzb {
        private LatLng latLng;
        private String name;
        private String zzbw;
        private float zzbx;
        private LatLngBounds zzby;
        private boolean zzca;
        private List<String> zzcd;
        private zzal zzce;
        private String zzcg;
        private List<Integer> zzch;
        private zzai zzci;
        private String zzf;
        private String zzh;
        private Uri zzi;
        private int zzcc = -1;
        private float zzcb = -1.0f;

        public final zzb zzb(String str) {
            this.zzbw = str;
            return this;
        }

        public final zzb zzc(String str) {
            this.name = str;
            return this;
        }

        public final zzb zzd(String str) {
            this.zzf = str;
            return this;
        }

        public final zzb zze(String str) {
            this.zzh = str;
            return this;
        }

        public final zzb zzf(String str) {
            this.zzcg = str;
            return this;
        }

        public final PlaceEntity zzj() {
            return new PlaceEntity(this.zzbw, this.zzch, this.name, this.zzf, this.zzh, this.zzcd, this.latLng, this.zzbx, this.zzby, null, this.zzi, this.zzca, this.zzcb, this.zzcc, this.zzce, this.zzci, this.zzcg);
        }

        public final zzb zzb(LatLng latLng) {
            this.latLng = latLng;
            return this;
        }

        public final zzb zzc(float f) {
            this.zzcb = f;
            return this;
        }

        public final zzb zzd(List<String> list) {
            this.zzcd = list;
            return this;
        }

        public final zzb zzb(float f) {
            this.zzbx = f;
            return this;
        }

        public final zzb zzc(int i) {
            this.zzcc = i;
            return this;
        }

        public final zzb zzb(LatLngBounds latLngBounds) {
            this.zzby = latLngBounds;
            return this;
        }

        public final zzb zzc(List<Integer> list) {
            this.zzch = list;
            return this;
        }

        public final zzb zzb(Uri uri) {
            this.zzi = uri;
            return this;
        }

        public final zzb zzb(boolean z) {
            this.zzca = z;
            return this;
        }

        public final zzb zzb(zzal zzalVar) {
            this.zzce = zzalVar;
            return this;
        }

        public final zzb zzb(zzai zzaiVar) {
            this.zzci = zzaiVar;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public PlaceEntity(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 20) List<Integer> list, @SafeParcelable.Param(m51605id = 19) String str2, @SafeParcelable.Param(m51605id = 14) String str3, @SafeParcelable.Param(m51605id = 15) String str4, @SafeParcelable.Param(m51605id = 17) List<String> list2, @SafeParcelable.Param(m51605id = 4) LatLng latLng, @SafeParcelable.Param(m51605id = 5) float f, @SafeParcelable.Param(m51605id = 6) LatLngBounds latLngBounds, @SafeParcelable.Param(m51605id = 7) String str5, @SafeParcelable.Param(m51605id = 8) Uri uri, @SafeParcelable.Param(m51605id = 9) boolean z, @SafeParcelable.Param(m51605id = 10) float f2, @SafeParcelable.Param(m51605id = 11) int i, @SafeParcelable.Param(m51605id = 21) zzal zzalVar, @SafeParcelable.Param(m51605id = 22) zzai zzaiVar, @SafeParcelable.Param(m51605id = 23) String str6) {
        this.zzbw = str;
        this.zzg = Collections.unmodifiableList(list);
        this.name = str2;
        this.zzf = str3;
        this.zzh = str4;
        this.zzcd = list2 != null ? list2 : Collections.emptyList();
        this.latLng = latLng;
        this.zzbx = f;
        this.zzby = latLngBounds;
        this.zzbz = str5 != null ? str5 : "UTC";
        this.zzi = uri;
        this.zzca = z;
        this.zzcb = f2;
        this.zzcc = i;
        this.locale = null;
        this.zzce = zzalVar;
        this.zzcf = zzaiVar;
        this.zzcg = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        if (this.zzbw.equals(placeEntity.zzbw) && Objects.equal(this.locale, placeEntity.locale)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final /* bridge */ /* synthetic */ Place freeze() {
        return this;
    }

    @Override // com.google.android.gms.location.places.Place
    public final /* synthetic */ CharSequence getAddress() {
        return this.zzf;
    }

    @Override // com.google.android.gms.location.places.Place
    public final CharSequence getAttributions() {
        return zzi.zzc(this.zzcd);
    }

    @Override // com.google.android.gms.location.places.Place
    @VisibleForTesting
    public final String getId() {
        return this.zzbw;
    }

    @Override // com.google.android.gms.location.places.Place
    public final LatLng getLatLng() {
        return this.latLng;
    }

    @Override // com.google.android.gms.location.places.Place
    public final Locale getLocale() {
        return this.locale;
    }

    @Override // com.google.android.gms.location.places.Place
    public final /* synthetic */ CharSequence getName() {
        return this.name;
    }

    @Override // com.google.android.gms.location.places.Place
    public final /* synthetic */ CharSequence getPhoneNumber() {
        return this.zzh;
    }

    @Override // com.google.android.gms.location.places.Place
    public final List<Integer> getPlaceTypes() {
        return this.zzg;
    }

    @Override // com.google.android.gms.location.places.Place
    public final int getPriceLevel() {
        return this.zzcc;
    }

    @Override // com.google.android.gms.location.places.Place
    public final float getRating() {
        return this.zzcb;
    }

    @Override // com.google.android.gms.location.places.Place
    public final LatLngBounds getViewport() {
        return this.zzby;
    }

    @Override // com.google.android.gms.location.places.Place
    public final Uri getWebsiteUri() {
        return this.zzi;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzbw, this.locale);
    }

    @Override // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @VisibleForTesting
    public final void setLocale(Locale locale) {
        this.locale = locale;
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        return Objects.toStringHelper(this).add("id", this.zzbw).add("placeTypes", this.zzg).add("locale", this.locale).add("name", this.name).add(PaymentMethod.BillingDetails.PARAM_ADDRESS, this.zzf).add("phoneNumber", this.zzh).add("latlng", this.latLng).add("viewport", this.zzby).add("websiteUri", this.zzi).add("isPermanentlyClosed", Boolean.valueOf(this.zzca)).add("priceLevel", Integer.valueOf(this.zzcc)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, getId(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getLatLng(), i, false);
        SafeParcelWriter.writeFloat(parcel, 5, this.zzbx);
        SafeParcelWriter.writeParcelable(parcel, 6, getViewport(), i, false);
        SafeParcelWriter.writeString(parcel, 7, this.zzbz, false);
        SafeParcelWriter.writeParcelable(parcel, 8, getWebsiteUri(), i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzca);
        SafeParcelWriter.writeFloat(parcel, 10, getRating());
        SafeParcelWriter.writeInt(parcel, 11, getPriceLevel());
        SafeParcelWriter.writeString(parcel, 14, (String) getAddress(), false);
        SafeParcelWriter.writeString(parcel, 15, (String) getPhoneNumber(), false);
        SafeParcelWriter.writeStringList(parcel, 17, this.zzcd, false);
        SafeParcelWriter.writeString(parcel, 19, (String) getName(), false);
        SafeParcelWriter.writeIntegerList(parcel, 20, getPlaceTypes(), false);
        SafeParcelWriter.writeParcelable(parcel, 21, this.zzce, i, false);
        SafeParcelWriter.writeParcelable(parcel, 22, this.zzcf, i, false);
        SafeParcelWriter.writeString(parcel, 23, this.zzcg, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
