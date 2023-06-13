package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "ProxyCardCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes6.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C34320Lo7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public final String f72076b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final String f72077c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public final int f72078d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public final int f72079e;

    @SafeParcelable.Constructor
    public zzaj(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 5) int i2) {
        this.f72076b = str;
        this.f72077c = str2;
        this.f72078d = i;
        this.f72079e = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72076b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72077c, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f72078d);
        SafeParcelWriter.writeInt(parcel, 5, this.f72079e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
