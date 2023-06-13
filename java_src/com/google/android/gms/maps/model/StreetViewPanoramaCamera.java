package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
@SafeParcelable.Class(creator = "StreetViewPanoramaCameraCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class StreetViewPanoramaCamera extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaCamera> CREATOR = new M49();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final float f71480b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final float f71481c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final float f71482d;

    /* renamed from: e */
    public final StreetViewPanoramaOrientation f71483e;

    @SafeParcelable.Constructor
    public StreetViewPanoramaCamera(@SafeParcelable.Param(m51605id = 2) float f, @SafeParcelable.Param(m51605id = 3) float f2, @SafeParcelable.Param(m51605id = 4) float f3) {
        float f4;
        boolean z = false;
        if (f2 >= -90.0f && f2 <= 90.0f) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Tilt needs to be between -90 and 90 inclusive: ");
        sb.append(f2);
        Preconditions.checkArgument(z, sb.toString());
        this.f71480b = ((double) f) <= 0.0d ? 0.0f : f;
        this.f71481c = 0.0f + f2;
        if (f3 <= 0.0d) {
            f4 = (f3 % 360.0f) + 360.0f;
        } else {
            f4 = f3;
        }
        this.f71482d = f4 % 360.0f;
        StreetViewPanoramaOrientation.C17621a c17621a = new StreetViewPanoramaOrientation.C17621a();
        c17621a.m50600c(f2);
        c17621a.m50602a(f3);
        this.f71483e = c17621a.m50601b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewPanoramaCamera)) {
            return false;
        }
        StreetViewPanoramaCamera streetViewPanoramaCamera = (StreetViewPanoramaCamera) obj;
        if (Float.floatToIntBits(this.f71480b) == Float.floatToIntBits(streetViewPanoramaCamera.f71480b) && Float.floatToIntBits(this.f71481c) == Float.floatToIntBits(streetViewPanoramaCamera.f71481c) && Float.floatToIntBits(this.f71482d) == Float.floatToIntBits(streetViewPanoramaCamera.f71482d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.f71480b), Float.valueOf(this.f71481c), Float.valueOf(this.f71482d));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("zoom", Float.valueOf(this.f71480b)).add("tilt", Float.valueOf(this.f71481c)).add("bearing", Float.valueOf(this.f71482d)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeFloat(parcel, 2, this.f71480b);
        SafeParcelWriter.writeFloat(parcel, 3, this.f71481c);
        SafeParcelWriter.writeFloat(parcel, 4, this.f71482d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
