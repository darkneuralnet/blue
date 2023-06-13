package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
@SafeParcelable.Class(creator = "CardInfoCreator")
/* loaded from: classes6.dex */
public final class CardInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new C50233v68();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public String f71898b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public String f71899c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public String f71900d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public int f71901e;
    @SafeParcelable.Field(m51606id = 5)

    /* renamed from: f */
    public UserAddress f71902f;

    private CardInfo() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71898b, false);
        SafeParcelWriter.writeString(parcel, 2, this.f71899c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71900d, false);
        SafeParcelWriter.writeInt(parcel, 4, this.f71901e);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f71902f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public CardInfo(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) String str2, @SafeParcelable.Param(m51605id = 3) String str3, @SafeParcelable.Param(m51605id = 4) int i, @SafeParcelable.Param(m51605id = 5) UserAddress userAddress) {
        this.f71898b = str;
        this.f71899c = str2;
        this.f71900d = str3;
        this.f71901e = i;
        this.f71902f = userAddress;
    }
}
