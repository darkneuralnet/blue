package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PaymentCardRecognitionCreator")
/* loaded from: classes6.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new C48348rv9();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public String f71981b;
    @SafeParcelable.Field(m51606id = 2)

    /* renamed from: c */
    public CreditCardExpirationDate f71982c;

    public PaymentCardRecognitionResult() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.f71981b, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.f71982c, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionResult(@SafeParcelable.Param(m51605id = 1) String str, @SafeParcelable.Param(m51605id = 2) CreditCardExpirationDate creditCardExpirationDate) {
        this.f71981b = str;
        this.f71982c = creditCardExpirationDate;
    }
}
