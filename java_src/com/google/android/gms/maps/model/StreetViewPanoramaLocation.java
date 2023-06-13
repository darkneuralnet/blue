package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new C44610ld9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final StreetViewPanoramaLink[] f71486b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final LatLng f71487c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final String f71488d;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@SafeParcelable.Param(m51605id = 2) StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.Param(m51605id = 3) LatLng latLng, @SafeParcelable.Param(m51605id = 4) String str) {
        this.f71486b = streetViewPanoramaLinkArr;
        this.f71487c = latLng;
        this.f71488d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLocation)) {
            return false;
        }
        StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
        if (this.f71488d.equals(streetViewPanoramaLocation.f71488d) && this.f71487c.equals(streetViewPanoramaLocation.f71487c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71487c, this.f71488d);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f71488d).add("position", this.f71487c.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f71486b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71487c, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71488d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
