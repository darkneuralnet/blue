package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "GeoPointParcelCreator")
/* loaded from: classes5.dex */
public final class zzsg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsg> CREATOR = new C44740lq9();
    @SafeParcelable.Field(getter = "getLat", m51606id = 1)

    /* renamed from: b */
    public final double f70700b;
    @SafeParcelable.Field(getter = "getLng", m51606id = 2)

    /* renamed from: c */
    public final double f70701c;

    @SafeParcelable.Constructor
    public zzsg(@SafeParcelable.Param(m51605id = 1) double d, @SafeParcelable.Param(m51605id = 2) double d2) {
        this.f70700b = d;
        this.f70701c = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f70700b);
        SafeParcelWriter.writeDouble(parcel, 2, this.f70701c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
