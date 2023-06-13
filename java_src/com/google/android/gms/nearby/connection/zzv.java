package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbSenderInfoCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C47162pv9();
    @SafeParcelable.Field(getter = "getAddress", m51606id = 1)

    /* renamed from: b */
    public byte[] f71629b;
    @SafeParcelable.Field(getter = "getChannel", m51606id = 2)

    /* renamed from: c */
    public int f71630c;
    @SafeParcelable.Field(getter = "getPreambleIndex", m51606id = 3)

    /* renamed from: d */
    public int f71631d;

    private zzv() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzv) {
            zzv zzvVar = (zzv) obj;
            if (Arrays.equals(this.f71629b, zzvVar.f71629b) && Objects.equal(Integer.valueOf(this.f71630c), Integer.valueOf(zzvVar.f71630c)) && Objects.equal(Integer.valueOf(this.f71631d), Integer.valueOf(zzvVar.f71631d))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.f71629b)), Integer.valueOf(this.f71630c), Integer.valueOf(this.f71631d));
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f71629b);
        int i = this.f71630c;
        int i2 = this.f71631d;
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 71);
        sb.append("UwbSenderInfo{address=");
        sb.append(arrays);
        sb.append(", channel=");
        sb.append(i);
        sb.append(", preambleIndex=");
        sb.append(i2);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.f71629b, false);
        SafeParcelWriter.writeInt(parcel, 2, this.f71630c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71631d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzv(@SafeParcelable.Param(m51605id = 1) byte[] bArr, @SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) int i2) {
        this.f71629b = bArr;
        this.f71630c = i;
        this.f71631d = i2;
    }
}
