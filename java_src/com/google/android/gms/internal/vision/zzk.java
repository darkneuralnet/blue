package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BarcodeDetectorOptionsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new RG8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f71347b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public boolean f71348c;

    public zzk() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71347b);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71348c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzk(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) boolean z) {
        this.f71347b = i;
        this.f71348c = z;
    }
}
