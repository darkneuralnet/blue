package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "WalletObjectMessageCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new C47301q99();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public String f72060b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72061c;
    @SafeParcelable.Field(m51606id = 4)

    /* renamed from: d */
    public TimeInterval f72062d;
    @SafeParcelable.Field(m51606id = 5)
    @Deprecated

    /* renamed from: e */
    public UriData f72063e;
    @SafeParcelable.Field(m51606id = 6)
    @Deprecated

    /* renamed from: f */
    public UriData f72064f;

    public WalletObjectMessage() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.f72060b, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72061c, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.f72062d, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.f72063e, i, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.f72064f, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public WalletObjectMessage(@SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2, @SafeParcelable.Param(m51605id = 4) TimeInterval timeInterval, @SafeParcelable.Param(m51605id = 5) UriData uriData, @SafeParcelable.Param(m51605id = 6) UriData uriData2) {
        this.f72060b = str;
        this.f72061c = str2;
        this.f72062d = timeInterval;
        this.f72063e = uriData;
        this.f72064f = uriData2;
    }
}
