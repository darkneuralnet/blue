package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UrlBookmarkCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C35418Qg7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70636b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70637c;

    public zzo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70636b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70637c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzo(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f70636b = str;
        this.f70637c = str2;
    }
}
