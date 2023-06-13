package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WiFiParcelCreator")
/* loaded from: classes5.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new AN7();
    @SafeParcelable.Field(getter = "getSsid", m51606id = 1)

    /* renamed from: b */
    public final String f70797b;
    @SafeParcelable.Field(getter = "getPassword", m51606id = 2)

    /* renamed from: c */
    public final String f70798c;
    @SafeParcelable.Field(getter = "getEncryptionType", m51606id = 3)

    /* renamed from: d */
    public final int f70799d;

    @SafeParcelable.Constructor
    public zzaz(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) int i) {
        this.f70797b = str;
        this.f70798c = str2;
        this.f70799d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70797b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70798c, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f70799d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
