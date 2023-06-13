package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
@SafeParcelable.Class(creator = "DistanceImplCreator")
/* loaded from: classes6.dex */
public final class zze extends AbstractSafeParcelable implements H51 {
    public static final Parcelable.Creator<zze> CREATOR = new C52326ye8();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71737b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final int f71738c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final double f71739d;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2, @SafeParcelable.Param(m51605id = 3) double d) {
        this.f71737b = i;
        this.f71738c = i2;
        this.f71739d = d;
    }

    @Override // p000.H51
    /* renamed from: A1 */
    public final double mo50557A1() {
        return this.f71739d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        if (this.f71738c == zzeVar.f71738c && compareTo(zzeVar) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71738c), Double.valueOf(this.f71739d));
    }

    @Override // java.lang.Comparable
    /* renamed from: s */
    public final int compareTo(H51 h51) {
        if (Double.isNaN(this.f71739d) && Double.isNaN(h51.mo50557A1())) {
            return 0;
        }
        return Double.compare(this.f71739d, h51.mo50557A1());
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        Object[] objArr = new Object[2];
        objArr[0] = Double.valueOf(this.f71739d);
        if (this.f71738c != 1) {
            str = "UNKNOWN";
        } else {
            str = "LOW";
        }
        objArr[1] = str;
        return String.format(locale, "(%.1fm, %s)", objArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71737b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71738c);
        SafeParcelWriter.writeDouble(parcel, 3, this.f71739d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
