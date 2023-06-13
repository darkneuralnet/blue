package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "OnConnectionRequestParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzey> CREATOR = new C35860Sd8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71049b;
    @SafeParcelable.Field(getter = "getRemoteEndpointName", m51606id = 2)

    /* renamed from: c */
    public String f71050c;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 3)

    /* renamed from: d */
    public byte[] f71051d;

    private zzey() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzey) {
            zzey zzeyVar = (zzey) obj;
            if (Objects.equal(this.f71049b, zzeyVar.f71049b) && Objects.equal(this.f71050c, zzeyVar.f71050c) && Arrays.equals(this.f71051d, zzeyVar.f71051d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71049b, this.f71050c, Integer.valueOf(Arrays.hashCode(this.f71051d)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71049b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71050c, false);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f71051d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzey(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) byte[] bArr) {
        this.f71049b = str;
        this.f71050c = str2;
        this.f71051d = bArr;
    }
}
