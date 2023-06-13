package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;
@SafeParcelable.Class(creator = "SignInResponseCreator")
/* loaded from: classes6.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C42115hQ6();
    @SafeParcelable.VersionField(m51603id = 1)

    /* renamed from: b */
    public final int f71791b;
    @SafeParcelable.Field(getter = "getConnectionResult", m51606id = 2)

    /* renamed from: c */
    public final ConnectionResult f71792c;
    @SafeParcelable.Field(getter = "getResolveAccountResponse", m51606id = 3)

    /* renamed from: d */
    public final zav f71793d;

    @SafeParcelable.Constructor
    public zak(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) ConnectionResult connectionResult, @SafeParcelable.Param(m51605id = 3) zav zavVar) {
        this.f71791b = i;
        this.f71792c = connectionResult;
        this.f71793d = zavVar;
    }

    /* renamed from: s */
    public final zav m50542s() {
        return this.f71793d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71791b);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71792c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71793d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final ConnectionResult zaa() {
        return this.f71792c;
    }
}
