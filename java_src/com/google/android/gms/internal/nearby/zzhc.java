package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "StopAllEndpointsParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzhc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhc> CREATOR = new C32269Cu8();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof zzhc);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }
}
