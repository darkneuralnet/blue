package com.google.android.gms.nearby.connection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@ShowFirstParty
@SafeParcelable.Class(creator = "UwbRangingDataCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes6.dex */
public final class zzt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzt> CREATOR = new C46539os9();
    @SafeParcelable.Field(getter = "getRawDistance", m51606id = 1)

    /* renamed from: b */
    public int f71625b;
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalAzimuth", m51606id = 2)

    /* renamed from: c */
    public int f71626c;
    @SafeParcelable.Field(getter = "getRawAngleOfArrivalPolar", m51606id = 3)

    /* renamed from: d */
    public int f71627d;
    @SafeParcelable.Field(getter = "getIsValidAngleOfArrivalData", m51606id = 4)

    /* renamed from: e */
    public boolean f71628e;

    private zzt() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzt) {
            zzt zztVar = (zzt) obj;
            if (Objects.equal(Integer.valueOf(this.f71625b), Integer.valueOf(zztVar.f71625b)) && Objects.equal(Integer.valueOf(this.f71626c), Integer.valueOf(zztVar.f71626c)) && Objects.equal(Integer.valueOf(this.f71627d), Integer.valueOf(zztVar.f71627d)) && Objects.equal(Boolean.valueOf(this.f71628e), Boolean.valueOf(zztVar.f71628e))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71625b), Integer.valueOf(this.f71626c), Integer.valueOf(this.f71627d), Boolean.valueOf(this.f71628e));
    }

    public final String toString() {
        int i = this.f71625b;
        int i2 = this.f71626c;
        int i3 = this.f71627d;
        boolean z = this.f71628e;
        StringBuilder sb = new StringBuilder(146);
        sb.append("UwbRangingData{rawDistance=");
        sb.append(i);
        sb.append(", rawAngleOfArrivalAzimuth=");
        sb.append(i2);
        sb.append(", rawAngleOfArrivalPolar=");
        sb.append(i3);
        sb.append(", isValidAngleOfArrivalData=");
        sb.append(z);
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71625b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71626c);
        SafeParcelWriter.writeInt(parcel, 3, this.f71627d);
        SafeParcelWriter.writeBoolean(parcel, 4, this.f71628e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzt(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) int i3, @SafeParcelable.Param(m51605id = 4) boolean z) {
        this.f71625b = i;
        this.f71626c = i2;
        this.f71627d = i3;
        this.f71628e = z;
    }
}
