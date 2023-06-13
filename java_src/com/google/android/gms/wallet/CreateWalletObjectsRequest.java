package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "CreateWalletObjectsRequestCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class CreateWalletObjectsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CreateWalletObjectsRequest> CREATOR = new C48495sA8();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public LoyaltyWalletObject f71907b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public OfferWalletObject f71908c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public GiftCardWalletObject f71909d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public int f71910e;

    public CreateWalletObjectsRequest() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71907b, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.f71908c, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71909d, i, false);
        SafeParcelWriter.writeInt(parcel, 5, this.f71910e);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CreateWalletObjectsRequest(@SafeParcelable.Param(m51605id = 2) LoyaltyWalletObject loyaltyWalletObject, @SafeParcelable.Param(m51605id = 3) OfferWalletObject offerWalletObject, @SafeParcelable.Param(m51605id = 4) GiftCardWalletObject giftCardWalletObject, @SafeParcelable.Param(m51605id = 5) int i) {
        this.f71907b = loyaltyWalletObject;
        this.f71908c = offerWalletObject;
        this.f71909d = giftCardWalletObject;
        this.f71910e = i;
    }
}
