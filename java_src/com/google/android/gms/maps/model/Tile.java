package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TileCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class Tile extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Tile> CREATOR = new Ho9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final int f71496b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final int f71497c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final byte[] f71498d;

    @SafeParcelable.Constructor
    public Tile(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2, @SafeParcelable.Param(m51605id = 4) byte[] bArr) {
        this.f71496b = i;
        this.f71497c = i2;
        this.f71498d = bArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71496b);
        SafeParcelWriter.writeInt(parcel, 3, this.f71497c);
        SafeParcelWriter.writeByteArray(parcel, 4, this.f71498d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
