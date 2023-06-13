package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LoyaltyPointsBalanceCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class LoyaltyPointsBalance extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new C49088tA8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f72048b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72049c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public double f72050d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f72051e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public long f72052f;
    @SafeParcelable.Field(defaultValueUnchecked = "com.google.android.gms.wallet.wobs.LoyaltyPointsBalance.Type.UNDEFINED", m51606id = 7)

    /* renamed from: g */
    public int f72053g;

    public LoyaltyPointsBalance() {
        this.f72053g = -1;
        this.f72048b = -1;
        this.f72050d = -1.0d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f72048b);
        SafeParcelWriter.writeString(parcel, 3, this.f72049c, false);
        SafeParcelWriter.writeDouble(parcel, 4, this.f72050d);
        SafeParcelWriter.writeString(parcel, 5, this.f72051e, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f72052f);
        SafeParcelWriter.writeInt(parcel, 7, this.f72053g);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPointsBalance(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) double d, @SafeParcelable.Param(m51605id = 5) String str2, @SafeParcelable.Param(m51605id = 6) long j, @SafeParcelable.Param(m51605id = 7) int i2) {
        this.f72048b = i;
        this.f72049c = str;
        this.f72050d = d;
        this.f72051e = str2;
        this.f72052f = j;
        this.f72053g = i2;
    }
}
