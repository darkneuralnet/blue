package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "EmailParcelCreator")
/* loaded from: classes5.dex */
public final class zzsf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsf> CREATOR = new C42961iq9();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70696b;
    @SafeParcelable.Field(getter = "getAddress", m51606id = 2)

    /* renamed from: c */
    public final String f70697c;
    @SafeParcelable.Field(getter = "getSubject", m51606id = 3)

    /* renamed from: d */
    public final String f70698d;
    @SafeParcelable.Field(getter = "getBody", m51606id = 4)

    /* renamed from: e */
    public final String f70699e;

    @SafeParcelable.Constructor
    public zzsf(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3) {
        this.f70696b = i;
        this.f70697c = str;
        this.f70698d = str2;
        this.f70699e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70696b);
        SafeParcelWriter.writeString(parcel, 2, this.f70697c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70698d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70699e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
