package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CreditCardExpirationDateCreator")
/* loaded from: classes6.dex */
public final class CreditCardExpirationDate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new XG8();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public int f71911b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public int f71912c;

    public CreditCardExpirationDate() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f71911b);
        SafeParcelWriter.writeInt(parcel, 2, this.f71912c);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CreditCardExpirationDate(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) int i2) {
        this.f71911b = i;
        this.f71912c = i2;
    }
}
