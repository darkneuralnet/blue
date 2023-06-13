package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "TransactionInfoCreator")
/* loaded from: classes6.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new C39422cs7();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public int f72009b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public String f72010c;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: d */
    public String f72011d;

    private TransactionInfo() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f72009b);
        SafeParcelWriter.writeString(parcel, 2, this.f72010c, false);
        SafeParcelWriter.writeString(parcel, 3, this.f72011d, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(m51605id = 1) int i, @SafeParcelable.Param(m51605id = 2) String str, @SafeParcelable.Param(m51605id = 3) String str2) {
        this.f72009b = i;
        this.f72010c = str;
        this.f72011d = str2;
    }
}
