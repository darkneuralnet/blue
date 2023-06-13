package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "EmailParcelCreator")
/* loaded from: classes5.dex */
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new C52725zJ7();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70778b;
    @SafeParcelable.Field(getter = "getAddress", m51606id = 2)

    /* renamed from: c */
    public final String f70779c;
    @SafeParcelable.Field(getter = "getSubject", m51606id = 3)

    /* renamed from: d */
    public final String f70780d;
    @SafeParcelable.Field(getter = "getBody", m51606id = 4)

    /* renamed from: e */
    public final String f70781e;

    @SafeParcelable.Constructor
    public zzat(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String str3) {
        this.f70778b = i;
        this.f70779c = str;
        this.f70780d = str2;
        this.f70781e = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70778b);
        SafeParcelWriter.writeString(parcel, 2, this.f70779c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70780d, false);
        SafeParcelWriter.writeString(parcel, 4, this.f70781e, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
