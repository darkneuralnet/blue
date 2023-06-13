package com.google.android.gms.internal.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PlaceAliasCreator")
@SafeParcelable.Reserved({1000})
@Deprecated
@ShowFirstParty
/* loaded from: classes5.dex */
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C45805ne8();

    /* renamed from: c */
    public static final zzg f71200c = new zzg("Home");

    /* renamed from: d */
    public static final zzg f71201d = new zzg("Work");
    @SafeParcelable.Field(getter = "getAlias", m51606id = 1)

    /* renamed from: b */
    public final String f71202b;

    @SafeParcelable.Constructor
    public zzg(@SafeParcelable.Param(m51605id = 1) String str) {
        this.f71202b = str;
    }

    @ShowFirstParty
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzg)) {
            return false;
        }
        return Objects.equal(this.f71202b, ((zzg) obj).f71202b);
    }

    @ShowFirstParty
    public final int hashCode() {
        return Objects.hashCode(this.f71202b);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("alias", this.f71202b).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71202b, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
