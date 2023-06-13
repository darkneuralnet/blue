package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CollectForDebugParcelableCreator")
/* loaded from: classes5.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new UX7();
    @SafeParcelable.Field(defaultValue = "false", m51606id = 1)

    /* renamed from: b */
    public final boolean f70323b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final long f70324c;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: d */
    public final long f70325d;

    @SafeParcelable.Constructor
    public zzc(@SafeParcelable.Param(m51605id = 1) boolean z, @SafeParcelable.Param(m51605id = 3) long j, @SafeParcelable.Param(m51605id = 2) long j2) {
        this.f70323b = z;
        this.f70324c = j;
        this.f70325d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzc) {
            zzc zzcVar = (zzc) obj;
            if (this.f70323b == zzcVar.f70323b && this.f70324c == zzcVar.f70324c && this.f70325d == zzcVar.f70325d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.f70323b), Long.valueOf(this.f70324c), Long.valueOf(this.f70325d));
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.f70323b + ",collectForDebugStartTimeMillis: " + this.f70324c + ",collectForDebugExpiryTimeMillis: " + this.f70325d + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.f70323b);
        SafeParcelWriter.writeLong(parcel, 2, this.f70325d);
        SafeParcelWriter.writeLong(parcel, 3, this.f70324c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
