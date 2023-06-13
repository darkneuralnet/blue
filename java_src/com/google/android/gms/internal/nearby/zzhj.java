package com.google.android.gms.internal.nearby;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "NearbyDeviceCreator")
/* loaded from: classes5.dex */
public final class zzhj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzhj> CREATOR = new C48949sw8();

    /* renamed from: e */
    public static final zzhj f71128e = new zzhj(1, "", null);
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71129b;
    @SafeParcelable.Field(getter = "getHandle", m51606id = 3)

    /* renamed from: c */
    public final String f71130c;
    @SafeParcelable.Field(getter = "getBluetoothAddress", m51606id = 6)

    /* renamed from: d */
    public final String f71131d;

    @SafeParcelable.Constructor
    public zzhj(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 6) String str2) {
        this.f71129b = ((Integer) Preconditions.checkNotNull(Integer.valueOf(i))).intValue();
        this.f71130c = str == null ? "" : str;
        this.f71131d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhj)) {
            return false;
        }
        zzhj zzhjVar = (zzhj) obj;
        if (Objects.equal(this.f71130c, zzhjVar.f71130c) && Objects.equal(this.f71131d, zzhjVar.f71131d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71130c, this.f71131d);
    }

    public final String toString() {
        String str = this.f71130c;
        String str2 = this.f71131d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(str2).length());
        sb.append("NearbyDevice{handle=");
        sb.append(str);
        sb.append(", bluetoothAddress=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 3, this.f71130c, false);
        SafeParcelWriter.writeString(parcel, 6, this.f71131d, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71129b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
