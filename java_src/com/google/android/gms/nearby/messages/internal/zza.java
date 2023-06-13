package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "BleSignalImplCreator")
/* loaded from: classes6.dex */
public final class zza extends AbstractSafeParcelable implements InterfaceC4131JW {
    public static final Parcelable.Creator<zza> CREATOR = new C42583iC7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71696b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f71697c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final int f71698d;

    @SafeParcelable.Constructor
    public zza(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3) {
        this.f71696b = i;
        this.f71697c = i2;
        this.f71698d = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    @Override // p000.InterfaceC4131JW
    /* renamed from: c */
    public final int mo50558c() {
        return this.f71698d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC4131JW)) {
            return false;
        }
        InterfaceC4131JW interfaceC4131JW = (InterfaceC4131JW) obj;
        if (this.f71697c == interfaceC4131JW.getRssi() && this.f71698d == interfaceC4131JW.mo50558c()) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC4131JW
    public final int getRssi() {
        return this.f71697c;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71697c), Integer.valueOf(this.f71698d));
    }

    public final String toString() {
        int i = this.f71697c;
        int i2 = this.f71698d;
        StringBuilder sb = new StringBuilder(48);
        sb.append("BleSignal{rssi=");
        sb.append(i);
        sb.append(", txPower=");
        sb.append(i2);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71696b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71697c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71698d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
