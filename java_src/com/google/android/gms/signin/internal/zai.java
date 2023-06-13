package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;
@SafeParcelable.Class(creator = "SignInRequestCreator")
/* loaded from: classes6.dex */
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C40336eQ6();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71789b;
    @SafeParcelable.Field(getter = "getResolveAccountRequest", m51606id = 2)

    /* renamed from: c */
    public final zat f71790c;

    @SafeParcelable.Constructor
    public zai(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) zat zatVar) {
        this.f71789b = i;
        this.f71790c = zatVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71789b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71790c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
