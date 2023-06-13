package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.nearby.zzhj;
import com.google.android.gms.nearby.messages.Message;
import java.util.Arrays;
@SafeParcelable.Class(creator = "UpdateCreator")
/* loaded from: classes6.dex */
public class Update extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Update> CREATOR = new JS7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71689b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f71690c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final Message f71691d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public final zze f71692e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public final zza f71693f;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: g */
    public final zzhj f71694g;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: h */
    public final byte[] f71695h;

    @SafeParcelable.Constructor
    public Update(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) Message message, @SafeParcelable.Param(m51605id = 4) zze zzeVar, @SafeParcelable.Param(m51605id = 5) zza zzaVar, @SafeParcelable.Param(m51605id = 6) zzhj zzhjVar, @SafeParcelable.Param(m51605id = 7) byte[] bArr) {
        this.f71689b = i;
        boolean m50559s = m50559s(i2, 2);
        bArr = true == m50559s ? null : bArr;
        zzhjVar = true == m50559s ? null : zzhjVar;
        zzaVar = true == m50559s ? null : zzaVar;
        zzeVar = true == m50559s ? null : zzeVar;
        this.f71690c = true == m50559s ? 2 : i2;
        this.f71691d = message;
        this.f71692e = zzeVar;
        this.f71693f = zzaVar;
        this.f71694g = zzhjVar;
        this.f71695h = bArr;
    }

    /* renamed from: s */
    public static boolean m50559s(int i, int i2) {
        return (i & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Update)) {
            return false;
        }
        Update update = (Update) obj;
        if (this.f71690c == update.f71690c && Objects.equal(this.f71691d, update.f71691d) && Objects.equal(this.f71692e, update.f71692e) && Objects.equal(this.f71693f, update.f71693f) && Objects.equal(this.f71694g, update.f71694g) && Arrays.equals(this.f71695h, update.f71695h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71690c), this.f71691d, this.f71692e, this.f71693f, this.f71694g, this.f71695h);
    }

    public final String toString() {
        C30704yo c30704yo = new C30704yo();
        if (m50559s(this.f71690c, 1)) {
            c30704yo.add("FOUND");
        }
        if (m50559s(this.f71690c, 2)) {
            c30704yo.add("LOST");
        }
        if (m50559s(this.f71690c, 4)) {
            c30704yo.add("DISTANCE");
        }
        if (m50559s(this.f71690c, 8)) {
            c30704yo.add("BLE_SIGNAL");
        }
        if (m50559s(this.f71690c, 16)) {
            c30704yo.add("DEVICE");
        }
        if (m50559s(this.f71690c, 32)) {
            c30704yo.add("BLE_RECORD");
        }
        String valueOf = String.valueOf(c30704yo);
        String valueOf2 = String.valueOf(this.f71691d);
        String valueOf3 = String.valueOf(this.f71692e);
        String valueOf4 = String.valueOf(this.f71693f);
        String valueOf5 = String.valueOf(this.f71694g);
        String valueOf6 = String.valueOf(C35788Rv8.m86196a(this.f71695h));
        int length = valueOf.length();
        int length2 = valueOf2.length();
        int length3 = valueOf3.length();
        int length4 = valueOf4.length();
        StringBuilder sb = new StringBuilder(length + 68 + length2 + length3 + length4 + valueOf5.length() + valueOf6.length());
        sb.append("Update{types=");
        sb.append(valueOf);
        sb.append(", message=");
        sb.append(valueOf2);
        sb.append(", distance=");
        sb.append(valueOf3);
        sb.append(", bleSignal=");
        sb.append(valueOf4);
        sb.append(", device=");
        sb.append(valueOf5);
        sb.append(", bleRecord=");
        sb.append(valueOf6);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71689b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71690c);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71691d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71692e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71693f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71694g, i, false);
        SafeParcelWriter.writeByteArray(parcel, 7, this.f71695h, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
