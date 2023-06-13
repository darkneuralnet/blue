package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.places.Place;
import java.util.Collections;
import java.util.List;
@SafeParcelable.Class(creator = "PlaceExtendedDetailsEntityCreator")
/* loaded from: classes6.dex */
public final class zzai extends AbstractSafeParcelable implements Place.ExtendedDetails {
    public static final Parcelable.Creator<zzai> CREATOR = new zzah();
    @SafeParcelable.Field(getter = "getRating", m51606id = 4)
    private final float zzcb;
    @SafeParcelable.Field(getter = "getPriceLevel", m51606id = 5)
    private final int zzcc;
    @SafeParcelable.Field(getter = "getPlaceTypes", m51606id = 1)
    private final List<Integer> zzg;
    @SafeParcelable.Field(getter = "getPhoneNumber", m51606id = 2)
    private final String zzh;
    @SafeParcelable.Field(getter = "getWebsiteUri", m51606id = 3)
    private final Uri zzi;

    @SafeParcelable.Constructor
    public zzai(@SafeParcelable.Param(m51605id = 1) List<Integer> list, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) Uri uri, @SafeParcelable.Param(m51605id = 4) float f, @SafeParcelable.Param(m51605id = 5) int i) {
        this.zzg = Collections.unmodifiableList(list);
        this.zzh = str;
        this.zzi = uri;
        this.zzcb = f;
        this.zzcc = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeIntegerList(parcel, 1, this.zzg, false);
        SafeParcelWriter.writeString(parcel, 2, this.zzh, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzi, i, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.zzcb);
        SafeParcelWriter.writeInt(parcel, 5, this.zzcc);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
