package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;
@SafeParcelable.Class(creator = "PlaceUserDataCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new PG8();
    @SafeParcelable.Field(getter = "getUserAccountName", m51606id = 1)

    /* renamed from: b */
    public final String f71203b;
    @SafeParcelable.Field(getter = "getPlaceId", m51606id = 2)

    /* renamed from: c */
    public final String f71204c;
    @SafeParcelable.Field(getter = "getPlaceAliases", m51606id = 6)

    /* renamed from: d */
    public final List<zzg> f71205d;

    @SafeParcelable.Constructor
    public zzi(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 6) List<zzg> list) {
        this.f71203b = str;
        this.f71204c = str2;
        this.f71205d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        if (this.f71203b.equals(zziVar.f71203b) && this.f71204c.equals(zziVar.f71204c) && this.f71205d.equals(zziVar.f71205d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71203b, this.f71204c, this.f71205d);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("accountName", this.f71203b).add("placeId", this.f71204c).add("placeAliases", this.f71205d).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71203b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71204c, false);
        SafeParcelWriter.writeTypedList(parcel, 6, this.f71205d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
