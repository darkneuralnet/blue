package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "MapStyleOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new C46548ot8();
    @SafeParcelable.Field(getter = "getJson", m51606id = 2)

    /* renamed from: b */
    public String f71438b;

    @SafeParcelable.Constructor
    public MapStyleOptions(@SafeParcelable.Param(m51605id = 2) String str) {
        Preconditions.checkNotNull(str, "json must not be null");
        this.f71438b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71438b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
