package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "MessageTypeCreator")
/* loaded from: classes6.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C50586vi7();
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71699b;
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: c */
    public final String f71700c;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: d */
    public final String f71701d;

    @SafeParcelable.Constructor
    public zzac(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2) {
        this.f71699b = i;
        this.f71700c = str;
        this.f71701d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zzac) && hashCode() == obj.hashCode()) {
            zzac zzacVar = (zzac) obj;
            if (Objects.equal(this.f71700c, zzacVar.f71700c) && Objects.equal(this.f71701d, zzacVar.f71701d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71700c, this.f71701d);
    }

    public final String toString() {
        String str = this.f71700c;
        String str2 = this.f71701d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length());
        sb.append("namespace=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71700c, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71701d, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71699b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
