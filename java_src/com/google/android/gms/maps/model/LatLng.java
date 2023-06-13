package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LatLngCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LatLng extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLng> CREATOR = new C45292mm8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final double f71430b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final double f71431c;

    @SafeParcelable.Constructor
    public LatLng(@SafeParcelable.Param(m51605id = 2) double d, @SafeParcelable.Param(m51605id = 3) double d2) {
        if (d2 >= -180.0d && d2 < 180.0d) {
            this.f71431c = d2;
        } else {
            this.f71431c = ((((d2 - 180.0d) % 360.0d) + 360.0d) % 360.0d) - 180.0d;
        }
        this.f71430b = Math.max(-90.0d, Math.min(90.0d, d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        if (Double.doubleToLongBits(this.f71430b) == Double.doubleToLongBits(latLng.f71430b) && Double.doubleToLongBits(this.f71431c) == Double.doubleToLongBits(latLng.f71431c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f71430b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f71431c);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        double d = this.f71430b;
        double d2 = this.f71431c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("lat/lng: (");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.f71430b);
        SafeParcelWriter.writeDouble(parcel, 3, this.f71431c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
