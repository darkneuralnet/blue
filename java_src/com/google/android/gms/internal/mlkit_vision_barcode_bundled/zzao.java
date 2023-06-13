package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AddressParcelCreator")
/* loaded from: classes5.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C49491tr7();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70740b;
    @SafeParcelable.Field(getter = "getAddressLines", m51606id = 2)

    /* renamed from: c */
    public final String[] f70741c;

    @SafeParcelable.Constructor
    public zzao(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String[] strArr) {
        this.f70740b = i;
        this.f70741c = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70740b);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f70741c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
