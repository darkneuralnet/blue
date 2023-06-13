package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PayPalCreditFinancingAmount implements Parcelable {
    public static final Parcelable.Creator<PayPalCreditFinancingAmount> CREATOR = new C16985a();

    /* renamed from: b */
    public String f68779b;

    /* renamed from: c */
    public String f68780c;

    /* renamed from: com.braintreepayments.api.models.PayPalCreditFinancingAmount$a */
    /* loaded from: classes2.dex */
    public static class C16985a implements Parcelable.Creator<PayPalCreditFinancingAmount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalCreditFinancingAmount createFromParcel(Parcel parcel) {
            return new PayPalCreditFinancingAmount(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalCreditFinancingAmount[] newArray(int i) {
            return new PayPalCreditFinancingAmount[i];
        }
    }

    public /* synthetic */ PayPalCreditFinancingAmount(Parcel parcel, C16985a c16985a) {
        this(parcel);
    }

    /* renamed from: a */
    public static PayPalCreditFinancingAmount m53359a(JSONObject jSONObject) {
        PayPalCreditFinancingAmount payPalCreditFinancingAmount = new PayPalCreditFinancingAmount();
        if (jSONObject == null) {
            return payPalCreditFinancingAmount;
        }
        payPalCreditFinancingAmount.f68779b = C39299ci2.m61029a(jSONObject, "currency", null);
        payPalCreditFinancingAmount.f68780c = C39299ci2.m61029a(jSONObject, "value", null);
        return payPalCreditFinancingAmount;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return String.format("%s %s", this.f68780c, this.f68779b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68779b);
        parcel.writeString(this.f68780c);
    }

    private PayPalCreditFinancingAmount() {
    }

    public PayPalCreditFinancingAmount(Parcel parcel) {
        this.f68779b = parcel.readString();
        this.f68780c = parcel.readString();
    }
}
