package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "NotifyCompletionRequestCreator")
/* loaded from: classes5.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new C33942Jy7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70383b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f70384c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final int f70385d;

    @SafeParcelable.Constructor
    public zzav(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) int i2) {
        this.f70383b = 1;
        this.f70384c = (String) Preconditions.checkNotNull(str);
        this.f70385d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70383b);
        SafeParcelWriter.writeString(parcel, 2, this.f70384c, false);
        SafeParcelWriter.writeInt(parcel, 3, this.f70385d);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzav(String str, int i) {
        this(1, str, i);
    }
}
