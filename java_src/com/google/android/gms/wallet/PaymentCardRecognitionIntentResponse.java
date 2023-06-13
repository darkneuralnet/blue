package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
@SafeParcelable.Class(creator = "PaymentCardRecognitionIntentResponseCreator")
/* loaded from: classes6.dex */
public class PaymentCardRecognitionIntentResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new Ay9();
    @SafeParcelable.Field(m51606id = 1)

    /* renamed from: b */
    public PendingIntent f71980b;

    public PaymentCardRecognitionIntentResponse() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.f71980b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public PaymentCardRecognitionIntentResponse(@SafeParcelable.Param(m51605id = 1) PendingIntent pendingIntent) {
        this.f71980b = pendingIntent;
    }
}
