package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new C50547ve8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final LatLng f71432b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final LatLng f71433c;

    /* renamed from: com.google.android.gms.maps.model.LatLngBounds$a */
    /* loaded from: classes6.dex */
    public static final class C17620a {

        /* renamed from: a */
        public double f71434a = Double.POSITIVE_INFINITY;

        /* renamed from: b */
        public double f71435b = Double.NEGATIVE_INFINITY;

        /* renamed from: c */
        public double f71436c = Double.NaN;

        /* renamed from: d */
        public double f71437d = Double.NaN;

        /* renamed from: a */
        public LatLngBounds m50667a() {
            Preconditions.checkState(!Double.isNaN(this.f71436c), "no included points");
            return new LatLngBounds(new LatLng(this.f71434a, this.f71436c), new LatLng(this.f71435b, this.f71437d));
        }

        /* renamed from: b */
        public C17620a m50666b(LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.f71434a = Math.min(this.f71434a, latLng.f71430b);
            this.f71435b = Math.max(this.f71435b, latLng.f71430b);
            double d = latLng.f71431c;
            if (Double.isNaN(this.f71436c)) {
                this.f71436c = d;
                this.f71437d = d;
            } else {
                double d2 = this.f71436c;
                double d3 = this.f71437d;
                if (d2 > d3 ? !(d2 <= d || d <= d3) : !(d2 <= d && d <= d3)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d2 - d) + 360.0d) % 360.0d < ((d - d3) + 360.0d) % 360.0d) {
                        this.f71436c = d;
                    } else {
                        this.f71437d = d;
                    }
                }
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) LatLng latLng2) {
        boolean z;
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d = latLng2.f71430b;
        double d2 = latLng.f71430b;
        if (d >= d2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d2), Double.valueOf(latLng2.f71430b));
        this.f71432b = latLng;
        this.f71433c = latLng2;
    }

    /* renamed from: s */
    public static C17620a m50670s() {
        return new C17620a();
    }

    /* renamed from: E */
    public final boolean m50671E(double d) {
        double d2 = this.f71432b.f71431c;
        double d3 = this.f71433c.f71431c;
        int i = (d2 > d3 ? 1 : (d2 == d3 ? 0 : -1));
        int i2 = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        return i <= 0 ? i2 <= 0 && d <= d3 : i2 <= 0 || d <= d3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        if (this.f71432b.equals(latLngBounds.f71432b) && this.f71433c.equals(latLngBounds.f71433c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71432b, this.f71433c);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.f71432b).add("northeast", this.f71433c).toString();
    }

    /* renamed from: u */
    public boolean m50669u(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d = latLng2.f71430b;
        if (this.f71432b.f71430b <= d && d <= this.f71433c.f71430b && m50671E(latLng2.f71431c)) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public LatLng m50668v() {
        LatLng latLng = this.f71432b;
        double d = latLng.f71430b;
        LatLng latLng2 = this.f71433c;
        double d2 = (d + latLng2.f71430b) / 2.0d;
        double d3 = latLng2.f71431c;
        double d4 = latLng.f71431c;
        if (d4 > d3) {
            d3 += 360.0d;
        }
        return new LatLng(d2, (d3 + d4) / 2.0d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71432b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71433c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
