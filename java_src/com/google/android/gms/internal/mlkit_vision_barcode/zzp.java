package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WiFiCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes5.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C34023Kh7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f70638b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f70639c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public int f70640d;

    public zzp() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f70638b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f70639c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f70640d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzp(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) int i) {
        this.f70638b = str;
        this.f70639c = str2;
        this.f70640d = i;
    }
}
