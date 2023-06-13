package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PayPalCreditFinancing implements Parcelable {
    public static final Parcelable.Creator<PayPalCreditFinancing> CREATOR = new C16984a();

    /* renamed from: b */
    public boolean f68773b;

    /* renamed from: c */
    public PayPalCreditFinancingAmount f68774c;

    /* renamed from: d */
    public boolean f68775d;

    /* renamed from: e */
    public int f68776e;

    /* renamed from: f */
    public PayPalCreditFinancingAmount f68777f;

    /* renamed from: g */
    public PayPalCreditFinancingAmount f68778g;

    /* renamed from: com.braintreepayments.api.models.PayPalCreditFinancing$a */
    /* loaded from: classes2.dex */
    public static class C16984a implements Parcelable.Creator<PayPalCreditFinancing> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalCreditFinancing createFromParcel(Parcel parcel) {
            return new PayPalCreditFinancing(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalCreditFinancing[] newArray(int i) {
            return new PayPalCreditFinancing[i];
        }
    }

    public /* synthetic */ PayPalCreditFinancing(Parcel parcel, C16984a c16984a) {
        this(parcel);
    }

    /* renamed from: a */
    public static PayPalCreditFinancing m53362a(JSONObject jSONObject) throws JSONException {
        PayPalCreditFinancing payPalCreditFinancing = new PayPalCreditFinancing();
        if (jSONObject == null) {
            return payPalCreditFinancing;
        }
        payPalCreditFinancing.f68773b = jSONObject.optBoolean("cardAmountImmutable", false);
        payPalCreditFinancing.f68774c = PayPalCreditFinancingAmount.m53359a(jSONObject.getJSONObject("monthlyPayment"));
        payPalCreditFinancing.f68775d = jSONObject.optBoolean("payerAcceptance", false);
        payPalCreditFinancing.f68776e = jSONObject.optInt("term", 0);
        payPalCreditFinancing.f68777f = PayPalCreditFinancingAmount.m53359a(jSONObject.getJSONObject("totalCost"));
        payPalCreditFinancing.f68778g = PayPalCreditFinancingAmount.m53359a(jSONObject.getJSONObject("totalInterest"));
        return payPalCreditFinancing;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f68773b ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f68774c, i);
        parcel.writeByte(this.f68775d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f68776e);
        parcel.writeParcelable(this.f68777f, i);
        parcel.writeParcelable(this.f68778g, i);
    }

    private PayPalCreditFinancing() {
    }

    public PayPalCreditFinancing(Parcel parcel) {
        this.f68773b = parcel.readByte() != 0;
        this.f68774c = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
        this.f68775d = parcel.readByte() != 0;
        this.f68776e = parcel.readInt();
        this.f68777f = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
        this.f68778g = (PayPalCreditFinancingAmount) parcel.readParcelable(PayPalCreditFinancingAmount.class.getClassLoader());
    }
}
