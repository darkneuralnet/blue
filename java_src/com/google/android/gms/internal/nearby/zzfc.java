package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@SafeParcelable.Class(creator = "OnConnectionResultParamsCreator")
/* loaded from: classes5.dex */
public final class zzfc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfc> CREATOR = new C35878Sf8();
    @SafeParcelable.Field(getter = "getRemoteEndpointId", m51606id = 1)

    /* renamed from: b */
    public String f71055b;
    @SafeParcelable.Field(getter = "getStatusCode", m51606id = 2)

    /* renamed from: c */
    public int f71056c;
    @SafeParcelable.Field(getter = "getHandshakeData", m51606id = 3)

    /* renamed from: d */
    public byte[] f71057d;

    private zzfc() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfc) {
            zzfc zzfcVar = (zzfc) obj;
            if (Objects.equal(this.f71055b, zzfcVar.f71055b) && Objects.equal(Integer.valueOf(this.f71056c), Integer.valueOf(zzfcVar.f71056c)) && Arrays.equals(this.f71057d, zzfcVar.f71057d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71055b, Integer.valueOf(this.f71056c), Integer.valueOf(Arrays.hashCode(this.f71057d)));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71055b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f71056c);
        SafeParcelWriter.writeByteArray(parcel, 3, this.f71057d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzfc(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) byte[] bArr) {
        this.f71055b = str;
        this.f71056c = i;
        this.f71057d = bArr;
    }
}
