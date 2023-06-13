package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "AddressParcelCreator")
/* loaded from: classes5.dex */
public final class zzsa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzsa> CREATOR = new C53020zo9();
    @SafeParcelable.Field(getter = "getType", m51606id = 1)

    /* renamed from: b */
    public final int f70658b;
    @SafeParcelable.Field(getter = "getAddressLines", m51606id = 2)

    /* renamed from: c */
    public final String[] f70659c;

    @SafeParcelable.Constructor
    public zzsa(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String[] strArr) {
        this.f70658b = i;
        this.f70659c = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70658b);
        SafeParcelWriter.writeStringArray(parcel, 2, this.f70659c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
