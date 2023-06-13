package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
/* loaded from: classes2.dex */
public class GooglePaymentException extends BraintreeException implements Parcelable {
    public static final Parcelable.Creator<GooglePaymentException> CREATOR = new C16972a();

    /* renamed from: b */
    public Status f68682b;

    /* renamed from: com.braintreepayments.api.exceptions.GooglePaymentException$a */
    /* loaded from: classes2.dex */
    public static class C16972a implements Parcelable.Creator<GooglePaymentException> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GooglePaymentException createFromParcel(Parcel parcel) {
            return new GooglePaymentException(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GooglePaymentException[] newArray(int i) {
            return new GooglePaymentException[i];
        }
    }

    public GooglePaymentException(String str, Status status) {
        super(str);
        this.f68682b = status;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getMessage());
        parcel.writeParcelable(this.f68682b, 0);
    }

    public GooglePaymentException(Parcel parcel) {
        super(parcel.readString());
        this.f68682b = (Status) parcel.readParcelable(Status.class.getClassLoader());
    }
}
