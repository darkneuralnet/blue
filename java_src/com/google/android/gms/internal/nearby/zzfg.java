package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.zzt;
@SafeParcelable.Class(creator = "OnEndpointDistanceChangedParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfg> CREATOR = new C38702bh8();
    @SafeParcelable.Field(getter = "getEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71059b;
    @SafeParcelable.Field(getter = "getDistance", m51606id = 2)

    /* renamed from: c */
    public int f71060c;
    @SafeParcelable.Field(getter = "getUwbRangingData", m51606id = 3)

    /* renamed from: d */
    public zzt f71061d;

    private zzfg() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfg) {
            zzfg zzfgVar = (zzfg) obj;
            if (Objects.equal(this.f71059b, zzfgVar.f71059b) && Objects.equal(Integer.valueOf(this.f71060c), Integer.valueOf(zzfgVar.f71060c)) && Objects.equal(this.f71061d, zzfgVar.f71061d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71059b, Integer.valueOf(this.f71060c), this.f71061d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71059b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f71060c);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71061d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfg(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) zzt zztVar) {
        this.f71059b = str;
        this.f71060c = i;
        this.f71061d = zztVar;
    }
}
