package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.Message;
@SafeParcelable.Class(creator = "MessageWrapperCreator")
/* loaded from: classes6.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new C44678lk7();
    @SafeParcelable.VersionField(m51603id = 1000)

    /* renamed from: b */
    public final int f71702b;
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: c */
    public final Message f71703c;

    @SafeParcelable.Constructor
    public zzae(@SafeParcelable.Param(m51605id = 1000) int i, @SafeParcelable.Param(m51605id = 1) Message message) {
        this.f71702b = i;
        this.f71703c = (Message) Preconditions.checkNotNull(message);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        return Objects.equal(this.f71703c, ((zzae) obj).f71703c);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f71703c);
    }

    public final String toString() {
        String message = this.f71703c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 24);
        sb.append("MessageWrapper{message=");
        sb.append(message);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71703c, i, false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f71702b);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
