package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "RetrieveDataRequestCreator")
/* loaded from: classes5.dex */
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new C46123oA7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70386b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public final String f70387c;

    @SafeParcelable.Constructor
    public zzax(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str) {
        this.f70386b = 1;
        this.f70387c = (String) Preconditions.checkNotNull(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70386b);
        SafeParcelWriter.writeString(parcel, 2, this.f70387c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzax(String str) {
        this(1, str);
    }
}
