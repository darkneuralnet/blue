package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeScannerOptionsParcelCreator")
/* loaded from: classes5.dex */
public final class zzso extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzso> CREATOR = new Tp9();
    @SafeParcelable.Field(getter = "getSupportedFormats", m51606id = 1)

    /* renamed from: b */
    public final int f70733b;
    @SafeParcelable.Field(getter = "isAllPotentialBarcodesEnabled", m51606id = 2)

    /* renamed from: c */
    public final boolean f70734c;

    @SafeParcelable.Constructor
    public zzso(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) boolean z) {
        this.f70733b = i;
        this.f70734c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70733b);
        SafeParcelWriter.writeBoolean(parcel, 2, this.f70734c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
