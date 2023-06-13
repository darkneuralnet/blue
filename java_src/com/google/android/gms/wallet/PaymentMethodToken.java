package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PaymentMethodTokenCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class PaymentMethodToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new C51179wi7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f72004b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public String f72005c;

    private PaymentMethodToken() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f72004b);
        SafeParcelWriter.writeString(parcel, 3, this.f72005c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodToken(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) String str) {
        this.f72004b = i;
        this.f72005c = str;
    }
}
