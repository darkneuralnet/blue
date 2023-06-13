package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "OnConnectionResponseParamsCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes5.dex */
public final class zzfa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfa> CREATOR = new C46408of8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71052b;
    @SafeParcelable.Field(getter = "getStatusCode", m51606id = 2)

    /* renamed from: c */
    public int f71053c;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 3)

    /* renamed from: d */
    public byte[] f71054d;

    private zzfa() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfa) {
            zzfa zzfaVar = (zzfa) obj;
            if (Objects.equal(this.f71052b, zzfaVar.f71052b) && Objects.equal(Integer.valueOf(this.f71053c), Integer.valueOf(zzfaVar.f71053c)) && Arrays.equals(this.f71054d, zzfaVar.f71054d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71052b, Integer.valueOf(this.f71053c), Integer.valueOf(Arrays.hashCode(this.f71054d)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71052b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f71053c);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f71054d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfa(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) byte[] bArr) {
        this.f71052b = str;
        this.f71053c = i;
        this.f71054d = bArr;
    }
}
