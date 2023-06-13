package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WiFiParcelCreator")
/* loaded from: classes5.dex */
public final class zzsl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsl> CREATOR = new C46529or9();
    @SafeParcelable.Field(getter = "getSsid", m51606id = 1)

    /* renamed from: b */
    public final String f70715b;
    @SafeParcelable.Field(getter = "getPassword", m51606id = 2)

    /* renamed from: c */
    public final String f70716c;
    @SafeParcelable.Field(getter = "getEncryptionType", m51606id = 3)

    /* renamed from: d */
    public final int f70717d;

    @SafeParcelable.Constructor
    public zzsl(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) int i) {
        this.f70715b = str;
        this.f70716c = str2;
        this.f70717d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70715b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70716c, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f70717d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
