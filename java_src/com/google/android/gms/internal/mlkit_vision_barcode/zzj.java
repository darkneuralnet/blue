package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "EmailCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new Dv9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f70619b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70620c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f70621d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f70622e;

    public zzj() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f70619b);
        SafeParcelWriter.writeString(parcel, 3, this.f70620c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70621d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f70622e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) String str3) {
        this.f70619b = i;
        this.f70620c = str;
        this.f70621d = str2;
        this.f70622e = str3;
    }
}
