package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PhoneParcelCreator")
/* loaded from: classes5.dex */
public final class zzsi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsi> CREATOR = new C41192fr9();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70709b;
    @SafeParcelable.Field(getter = "getNumber", m51606id = 2)

    /* renamed from: c */
    public final String f70710c;

    @SafeParcelable.Constructor
    public zzsi(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str) {
        this.f70709b = i;
        this.f70710c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70709b);
        SafeParcelWriter.writeString(parcel, 2, this.f70710c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
