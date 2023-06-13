package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "LoyaltyPointsCreator")
@SafeParcelable.Reserved({1, 4})
/* loaded from: classes6.dex */
public final class LoyaltyPoints extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new YG8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72045b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public LoyaltyPointsBalance f72046c;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: d */
    public TimeInterval f72047d;

    public LoyaltyPoints() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72045b, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f72046c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f72047d, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public LoyaltyPoints(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) LoyaltyPointsBalance loyaltyPointsBalance, @SafeParcelable.Param(m51605id = 5) TimeInterval timeInterval) {
        this.f72045b = str;
        this.f72046c = loyaltyPointsBalance;
        this.f72047d = timeInterval;
    }
}
