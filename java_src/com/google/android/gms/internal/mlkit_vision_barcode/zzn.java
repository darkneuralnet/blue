package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SmsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C35643Rf7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70634b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70635c;

    public zzn() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70634b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70635c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzn(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f70634b = str;
        this.f70635c = str2;
    }
}
