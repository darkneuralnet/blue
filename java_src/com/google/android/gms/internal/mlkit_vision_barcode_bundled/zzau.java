package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "GeoPointParcelCreator")
/* loaded from: classes5.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C46213oK7();
    @SafeParcelable.Field(getter = "getLat", m51606id = 1)

    /* renamed from: b */
    public final double f70782b;
    @SafeParcelable.Field(getter = "getLng", m51606id = 2)

    /* renamed from: c */
    public final double f70783c;

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m51605id = 1) double d, @SafeParcelable.Param(m51605id = 2) double d2) {
        this.f70782b = d;
        this.f70783c = d2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeDouble(parcel, 1, this.f70782b);
        SafeParcelWriter.writeDouble(parcel, 2, this.f70783c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
