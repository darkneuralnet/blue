package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "SmsParcelCreator")
/* loaded from: classes5.dex */
public final class zzsj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsj> CREATOR = new C42971ir9();
    @SafeParcelable.Field(getter = "getMessage", m51606id = 1)

    /* renamed from: b */
    public final String f70711b;
    @SafeParcelable.Field(getter = "getPhoneNumber", m51606id = 2)

    /* renamed from: c */
    public final String f70712c;

    @SafeParcelable.Constructor
    public zzsj(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2) {
        this.f70711b = str;
        this.f70712c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f70711b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f70712c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
