package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class BraintreePaymentResult implements Parcelable {
    public static final Parcelable.Creator<BraintreePaymentResult> CREATOR = new C16976a();

    /* renamed from: com.braintreepayments.api.models.BraintreePaymentResult$a */
    /* loaded from: classes2.dex */
    public static class C16976a implements Parcelable.Creator<BraintreePaymentResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BraintreePaymentResult createFromParcel(Parcel parcel) {
            return new BraintreePaymentResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BraintreePaymentResult[] newArray(int i) {
            return new BraintreePaymentResult[i];
        }
    }

    public BraintreePaymentResult() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }

    public BraintreePaymentResult(Parcel parcel) {
    }
}
