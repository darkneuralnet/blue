package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PhoneCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new Ly9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70632b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70633c;

    public zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70632b);
        SafeParcelWriter.writeString(parcel, 3, this.f70633c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzm(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String str) {
        this.f70632b = i;
        this.f70633c = str;
    }
}
