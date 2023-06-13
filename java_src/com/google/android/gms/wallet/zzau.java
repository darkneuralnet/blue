package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@ShowFirstParty
@SafeParcelable.Class(creator = "WebPaymentDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C33933Jx7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72080b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public Bundle f72081c;

    private zzau() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72080b, false);
        SafeParcelWriter.writeBundle(parcel, 3, this.f72081c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public zzau(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) Bundle bundle) {
        this.f72080b = str;
        this.f72081c = bundle;
    }
}
