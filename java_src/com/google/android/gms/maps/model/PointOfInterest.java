package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PointOfInterestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class PointOfInterest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PointOfInterest> CREATOR = new C49798uN8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final LatLng f71455b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final String f71456c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final String f71457d;

    @SafeParcelable.Constructor
    public PointOfInterest(@SafeParcelable.Param(m51605id = 2) LatLng latLng, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2) {
        this.f71455b = latLng;
        this.f71456c = str;
        this.f71457d = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71455b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71456c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71457d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
