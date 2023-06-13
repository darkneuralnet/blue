package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "GeoPointCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new Hw9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public double f70623b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public double f70624c;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 2, this.f70623b);
        SafeParcelWriter.writeDouble(parcel, 3, this.f70624c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(m51605id = 2) double d, @SafeParcelable.Param(m51605id = 3) double d2) {
        this.f70623b = d;
        this.f70624c = d2;
    }
}
