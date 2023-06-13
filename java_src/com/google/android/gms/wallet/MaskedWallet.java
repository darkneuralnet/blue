package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
@SafeParcelable.Class(creator = "MaskedWalletCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new Lq9();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f71964b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71965c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String[] f71966d;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: e */
    public String f71967e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public zza f71968f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public zza f71969g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public LoyaltyWalletObject[] f71970h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public OfferWalletObject[] f71971i;
    @SafeParcelable.Field(m51606id = 10)

    /* renamed from: j */
    public UserAddress f71972j;
    @SafeParcelable.Field(m51606id = 11)

    /* renamed from: k */
    public UserAddress f71973k;
    @SafeParcelable.Field(m51606id = 12)

    /* renamed from: l */
    public InstrumentInfo[] f71974l;

    private MaskedWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f71964b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71965c, false);
        SafeParcelWriter.writeStringArray(parcel, 4, this.f71966d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71967e, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f71968f, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.f71969g, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.f71970h, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 9, this.f71971i, i, false);
        SafeParcelWriter.writeParcelable(parcel, 10, this.f71972j, i, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.f71973k, i, false);
        SafeParcelWriter.writeTypedArray(parcel, 12, this.f71974l, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public MaskedWallet(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) String[] strArr, @SafeParcelable.Param(m51605id = 5) String str3, @SafeParcelable.Param(m51605id = 6) zza zzaVar, @SafeParcelable.Param(m51605id = 7) zza zzaVar2, @SafeParcelable.Param(m51605id = 8) LoyaltyWalletObject[] loyaltyWalletObjectArr, @SafeParcelable.Param(m51605id = 9) OfferWalletObject[] offerWalletObjectArr, @SafeParcelable.Param(m51605id = 10) UserAddress userAddress, @SafeParcelable.Param(m51605id = 11) UserAddress userAddress2, @SafeParcelable.Param(m51605id = 12) InstrumentInfo[] instrumentInfoArr) {
        this.f71964b = str;
        this.f71965c = str2;
        this.f71966d = strArr;
        this.f71967e = str3;
        this.f71968f = zzaVar;
        this.f71969g = zzaVar2;
        this.f71970h = loyaltyWalletObjectArr;
        this.f71971i = offerWalletObjectArr;
        this.f71972j = userAddress;
        this.f71973k = userAddress2;
        this.f71974l = instrumentInfoArr;
    }
}
