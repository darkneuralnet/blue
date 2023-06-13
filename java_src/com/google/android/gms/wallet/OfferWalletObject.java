package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wallet.wobs.CommonWalletObject;
@SafeParcelable.Class(creator = "OfferWalletObjectCreator")
/* loaded from: classes6.dex */
public final class OfferWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OfferWalletObject> CREATOR = new Tt9();
    @SafeParcelable.VersionField(getter = "getVersionCode", m51603id = 1)

    /* renamed from: b */
    public final int f71975b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public String f71976c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public String f71977d;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: e */
    public CommonWalletObject f71978e;

    public OfferWalletObject() {
        this.f71975b = 3;
    }

    /* renamed from: s */
    public int m50527s() {
        return this.f71975b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, m50527s());
        SafeParcelWriter.writeString(parcel, 2, this.f71976c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f71977d, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f71978e, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public OfferWalletObject(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) CommonWalletObject commonWalletObject) {
        this.f71975b = i;
        this.f71977d = str2;
        if (i >= 3) {
            this.f71978e = commonWalletObject;
            return;
        }
        C46734pC7 m50514s = CommonWalletObject.m50514s();
        m50514s.m19823a(str);
        this.f71978e = m50514s.m19822b();
    }
}
