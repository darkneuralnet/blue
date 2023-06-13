package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AddressCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new LX7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70581b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String[] f70582c;

    public zze() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70581b);
        SafeParcelWriter.writeStringArray(parcel, 3, this.f70582c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String[] strArr) {
        this.f70581b = i;
        this.f70582c = strArr;
    }
}
