package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "UriDataCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class UriData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UriData> CREATOR = new C48128rZ8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72058b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72059c;

    public UriData() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72058b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72059c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public UriData(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f72058b = str;
        this.f72059c = str2;
    }
}
