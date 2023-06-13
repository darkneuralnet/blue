package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "OnDisconnectedParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfe> CREATOR = new C51160wg8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71058b;

    private zzfe() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfe) {
            return Objects.equal(this.f71058b, ((zzfe) obj).f71058b);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71058b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71058b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfe(@SafeParcelable.Param(m51605id = 1) String str) {
        this.f71058b = str;
    }
}
