package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@ShowFirstParty
@SafeParcelable.Class(creator = "ClearTokenRequestCreator")
/* loaded from: classes5.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new NO7();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f70394b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public String f70395c;

    public zzbw() {
        this.f70394b = 1;
    }

    /* renamed from: s */
    public final zzbw m51580s(String str) {
        this.f70395c = str;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f70394b);
        SafeParcelWriter.writeString(parcel, 2, this.f70395c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzbw(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str) {
        this.f70394b = i;
        this.f70395c = str;
    }
}
