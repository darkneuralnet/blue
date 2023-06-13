package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PatternItemCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public class PatternItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PatternItem> CREATOR = new TG8();
    @SafeParcelable.Field(getter = "getType", m51606id = 2)

    /* renamed from: b */
    public final int f71453b;
    @SafeParcelable.Field(getter = "getLength", m51606id = 3)

    /* renamed from: c */
    public final Float f71454c;

    @SafeParcelable.Constructor
    public PatternItem(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(valueOf.length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        Preconditions.checkArgument(z, sb.toString());
        this.f71453b = i;
        this.f71454c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        if (this.f71453b == patternItem.f71453b && Objects.equal(this.f71454c, patternItem.f71454c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.f71453b), this.f71454c);
    }

    public String toString() {
        int i = this.f71453b;
        String valueOf = String.valueOf(this.f71454c);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f71453b);
        SafeParcelWriter.writeFloatObject(parcel, 3, this.f71454c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
