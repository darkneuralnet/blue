package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "StreetViewPanoramaOrientationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class StreetViewPanoramaOrientation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaOrientation> CREATOR = new Fh9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final float f71489b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final float f71490c;

    /* renamed from: com.google.android.gms.maps.model.StreetViewPanoramaOrientation$a */
    /* loaded from: classes6.dex */
    public static final class C17621a {

        /* renamed from: a */
        public float f71491a;

        /* renamed from: b */
        public float f71492b;

        /* renamed from: a */
        public C17621a m50602a(float f) {
            this.f71491a = f;
            return this;
        }

        /* renamed from: b */
        public StreetViewPanoramaOrientation m50601b() {
            return new StreetViewPanoramaOrientation(this.f71492b, this.f71491a);
        }

        /* renamed from: c */
        public C17621a m50600c(float f) {
            this.f71492b = f;
            return this;
        }
    }

    @SafeParcelable.Constructor
    public StreetViewPanoramaOrientation(@SafeParcelable.Param(m51605id = 2) float f, @SafeParcelable.Param(m51605id = 3) float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f);
        Preconditions.checkArgument(z, sb.toString());
        this.f71489b = f + 0.0f;
        this.f71490c = (((double) f2) <= 0.0d ? (f2 % 360.0f) + 360.0f : f2) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaOrientation)) {
            return false;
        }
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = (StreetViewPanoramaOrientation) obj;
        if (Float.floatToIntBits(this.f71489b) == Float.floatToIntBits(streetViewPanoramaOrientation.f71489b) && Float.floatToIntBits(this.f71490c) == Float.floatToIntBits(streetViewPanoramaOrientation.f71490c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f71489b), Float.valueOf(this.f71490c));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("tilt", Float.valueOf(this.f71489b)).add("bearing", Float.valueOf(this.f71490c)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f71489b);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71490c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
