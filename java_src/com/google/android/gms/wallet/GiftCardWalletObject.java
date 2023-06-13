package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
@SafeParcelable.Class(creator = "GiftCardWalletObjectCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class GiftCardWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GiftCardWalletObject> CREATOR = new Q49();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public CommonWalletObject f71924b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f71925c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public String f71926d;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: e */
    public String f71927e;
    @SafeParcelable.Field(m51606id = 6)

    /* renamed from: f */
    public long f71928f;
    @SafeParcelable.Field(m51606id = 7)

    /* renamed from: g */
    public String f71929g;
    @SafeParcelable.Field(m51606id = 8)

    /* renamed from: h */
    public long f71930h;
    @SafeParcelable.Field(m51606id = 9)

    /* renamed from: i */
    public String f71931i;

    public GiftCardWalletObject() {
        this.f71924b = CommonWalletObject.m50514s().m19822b();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71924b, i, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71925c, false);
        SafeParcelWriter.writeString(parcel, 4, this.f71926d, false);
        SafeParcelWriter.writeString(parcel, 5, this.f71927e, false);
        SafeParcelWriter.writeLong(parcel, 6, this.f71928f);
        SafeParcelWriter.writeString(parcel, 7, this.f71929g, false);
        SafeParcelWriter.writeLong(parcel, 8, this.f71930h);
        SafeParcelWriter.writeString(parcel, 9, this.f71931i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public GiftCardWalletObject(@SafeParcelable.Param(m51605id = 2) CommonWalletObject commonWalletObject, @SafeParcelable.Param(m51605id = 3) String str, @SafeParcelable.Param(m51605id = 4) String str2, @SafeParcelable.Param(m51605id = 5) String str3, @SafeParcelable.Param(m51605id = 6) long j, @SafeParcelable.Param(m51605id = 7) String str4, @SafeParcelable.Param(m51605id = 8) long j2, @SafeParcelable.Param(m51605id = 9) String str5) {
        CommonWalletObject.m50514s();
        this.f71924b = commonWalletObject;
        this.f71925c = str;
        this.f71926d = str2;
        this.f71928f = j;
        this.f71929g = str4;
        this.f71930h = j2;
        this.f71931i = str5;
        this.f71927e = str3;
    }
}
