package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.PayloadTransferUpdate;
@SafeParcelable.Class(creator = "OnPayloadTransferUpdateParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfo> CREATOR = new C44669lj8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71071b;
    @SafeParcelable.Field(getter = "getUpdate", m51606id = 2)

    /* renamed from: c */
    public PayloadTransferUpdate f71072c;

    private zzfo() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfo) {
            zzfo zzfoVar = (zzfo) obj;
            if (Objects.equal(this.f71071b, zzfoVar.f71071b) && Objects.equal(this.f71072c, zzfoVar.f71072c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71071b, this.f71072c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71071b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71072c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfo(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) PayloadTransferUpdate payloadTransferUpdate) {
        this.f71071b = str;
        this.f71072c = payloadTransferUpdate;
    }
}
