package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "StreetViewSourceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new C51804xl9();

    /* renamed from: c */
    public static final StreetViewSource f71493c = new StreetViewSource(0);

    /* renamed from: d */
    public static final StreetViewSource f71494d = new StreetViewSource(1);
    @SafeParcelable.Field(getter = "getType", m51606id = 2)

    /* renamed from: b */
    public final int f71495b;

    @SafeParcelable.Constructor
    public StreetViewSource(@SafeParcelable.Param(m51605id = 2) int i) {
        this.f71495b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StreetViewSource) && this.f71495b == ((StreetViewSource) obj).f71495b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71495b));
    }

    public String toString() {
        String str;
        int i = this.f71495b;
        if (i != 0) {
            if (i != 1) {
                str = String.format("UNKNOWN(%s)", Integer.valueOf(i));
            } else {
                str = "OUTDOOR";
            }
        } else {
            str = "DEFAULT";
        }
        return String.format("StreetViewSource:%s", str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71495b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
