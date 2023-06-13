package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PaymentMethodTokenizationParametersCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes6.dex */
public final class PaymentMethodTokenizationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new C45864nk7();
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: b */
    public int f72006b;
    @SafeParcelable.Field(m51606id = 3)

    /* renamed from: c */
    public final Bundle f72007c;

    private PaymentMethodTokenizationParameters() {
        this.f72007c = new Bundle();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, this.f72006b);
        SafeParcelWriter.writeBundle(parcel, 3, this.f72007c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentMethodTokenizationParameters(@SafeParcelable.Param(m51605id = 2) int i, @SafeParcelable.Param(m51605id = 3) Bundle bundle) {
        new Bundle();
        this.f72006b = i;
        this.f72007c = bundle;
    }
}
