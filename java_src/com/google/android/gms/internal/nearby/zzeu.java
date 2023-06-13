package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "OnBandwidthChangedParamsCreator")
/* loaded from: classes5.dex */
public final class zzeu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzeu> CREATOR = new C35851Sc8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71038b;
    @SafeParcelable.Field(getter = "getQuality", m51606id = 2)

    /* renamed from: c */
    public int f71039c;
    @SafeParcelable.Field(defaultValue = "0", getter = "getMedium", m51606id = 3)

    /* renamed from: d */
    public final int f71040d;

    private zzeu() {
        this.f71040d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzeu) {
            zzeu zzeuVar = (zzeu) obj;
            if (Objects.equal(this.f71038b, zzeuVar.f71038b) && Objects.equal(Integer.valueOf(this.f71039c), Integer.valueOf(zzeuVar.f71039c)) && Objects.equal(Integer.valueOf(this.f71040d), Integer.valueOf(zzeuVar.f71040d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71038b, Integer.valueOf(this.f71039c), Integer.valueOf(this.f71040d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71038b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f71039c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71040d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzeu(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2) {
        this.f71038b = str;
        this.f71039c = i;
        this.f71040d = i2;
    }
}
