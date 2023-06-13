package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "OnPayloadReceivedParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfm> CREATOR = new C34033Ki8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71068b;
    @SafeParcelable.Field(getter = "getPayload", m51606id = 2)

    /* renamed from: c */
    public zzgd f71069c;
    @SafeParcelable.Field(getter = "getIsReliable", m51606id = 3)

    /* renamed from: d */
    public boolean f71070d;

    private zzfm() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfm) {
            zzfm zzfmVar = (zzfm) obj;
            if (Objects.equal(this.f71068b, zzfmVar.f71068b) && Objects.equal(this.f71069c, zzfmVar.f71069c) && Objects.equal(Boolean.valueOf(this.f71070d), Boolean.valueOf(zzfmVar.f71070d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71068b, this.f71069c, Boolean.valueOf(this.f71070d));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71068b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71069c, i, false);
        SafeParcelWriter.writeBoolean(parcel, 3, this.f71070d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfm(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) zzgd zzgdVar, @SafeParcelable.Param(m51605id = 3) boolean z) {
        this.f71068b = str;
        this.f71069c = zzgdVar;
        this.f71070d = z;
    }
}
