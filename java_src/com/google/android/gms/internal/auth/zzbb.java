package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UserChallengeRequestCreator")
/* loaded from: classes5.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new HE7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70391b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f70392c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public final PendingIntent f70393d;

    @SafeParcelable.Constructor
    public zzbb(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) PendingIntent pendingIntent) {
        this.f70391b = 1;
        this.f70392c = (String) Preconditions.checkNotNull(str);
        this.f70393d = (PendingIntent) Preconditions.checkNotNull(pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70391b);
        SafeParcelWriter.writeString(parcel, 2, this.f70392c, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f70393d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
