package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "StreetViewPanoramaLinkCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new C44929m99();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f71484b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final float f71485c;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLink(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) float f) {
        this.f71484b = str;
        this.f71485c = (((double) f) <= 0.0d ? (f % 360.0f) + 360.0f : f) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaLink)) {
            return false;
        }
        StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
        if (this.f71484b.equals(streetViewPanoramaLink.f71484b) && Float.floatToIntBits(this.f71485c) == Float.floatToIntBits(streetViewPanoramaLink.f71485c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71484b, Float.valueOf(this.f71485c));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.f71484b).add("bearing", Float.valueOf(this.f71485c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71484b, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71485c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
