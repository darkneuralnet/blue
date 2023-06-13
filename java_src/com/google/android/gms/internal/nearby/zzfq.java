package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "OnStartAdvertisingResultParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfq> CREATOR = new C34510Mj8();
    @SafeParcelable.Field(getter = "getStatusCode", m51606id = 1)

    /* renamed from: b */
    public int f71073b;
    @SafeParcelable.Field(getter = "getLocalEndpointName", m51606id = 2)

    /* renamed from: c */
    public String f71074c;

    private zzfq() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfq) {
            zzfq zzfqVar = (zzfq) obj;
            if (Objects.equal(Integer.valueOf(this.f71073b), Integer.valueOf(zzfqVar.f71073b)) && Objects.equal(this.f71074c, zzfqVar.f71074c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71073b), this.f71074c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71073b);
        SafeParcelWriter.writeString(parcel, 2, this.f71074c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfq(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str) {
        this.f71073b = i;
        this.f71074c = str;
    }
}
