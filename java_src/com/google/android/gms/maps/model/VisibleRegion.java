package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "VisibleRegionCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class VisibleRegion extends AbstractSafeParcelable {
    public static final Parcelable.Creator<VisibleRegion> CREATOR = new C45976nv9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final LatLng f71505b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final LatLng f71506c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final LatLng f71507d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final LatLng f71508e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public final LatLngBounds f71509f;

    @SafeParcelable.Constructor
    public VisibleRegion(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) LatLng latLng2, @SafeParcelable.Param(m51605id = 4) LatLng latLng3, @SafeParcelable.Param(m51605id = 5) LatLng latLng4, @SafeParcelable.Param(m51605id = 6) LatLngBounds latLngBounds) {
        this.f71505b = latLng;
        this.f71506c = latLng2;
        this.f71507d = latLng3;
        this.f71508e = latLng4;
        this.f71509f = latLngBounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleRegion)) {
            return false;
        }
        VisibleRegion visibleRegion = (VisibleRegion) obj;
        if (this.f71505b.equals(visibleRegion.f71505b) && this.f71506c.equals(visibleRegion.f71506c) && this.f71507d.equals(visibleRegion.f71507d) && this.f71508e.equals(visibleRegion.f71508e) && this.f71509f.equals(visibleRegion.f71509f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f71505b, this.f71506c, this.f71507d, this.f71508e, this.f71509f);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("nearLeft", this.f71505b).add("nearRight", this.f71506c).add("farLeft", this.f71507d).add("farRight", this.f71508e).add("latLngBounds", this.f71509f).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71505b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71506c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71507d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71508e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71509f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
