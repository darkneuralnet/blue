package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VisaCheckoutNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<VisaCheckoutNonce> CREATOR = new C17004a();

    /* renamed from: e */
    public String f68945e;

    /* renamed from: f */
    public String f68946f;

    /* renamed from: g */
    public VisaCheckoutAddress f68947g;

    /* renamed from: h */
    public VisaCheckoutAddress f68948h;

    /* renamed from: i */
    public VisaCheckoutUserData f68949i;

    /* renamed from: j */
    public String f68950j;

    /* renamed from: k */
    public BinData f68951k;

    /* renamed from: com.braintreepayments.api.models.VisaCheckoutNonce$a */
    /* loaded from: classes2.dex */
    public static class C17004a implements Parcelable.Creator<VisaCheckoutNonce> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VisaCheckoutNonce createFromParcel(Parcel parcel) {
            return new VisaCheckoutNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VisaCheckoutNonce[] newArray(int i) {
            return new VisaCheckoutNonce[i];
        }
    }

    public VisaCheckoutNonce() {
    }

    /* renamed from: g */
    public static VisaCheckoutNonce m53263g(String str) throws JSONException {
        VisaCheckoutNonce visaCheckoutNonce = new VisaCheckoutNonce();
        visaCheckoutNonce.mo53264a(PaymentMethodNonce.m53328b("visaCheckoutCards", new JSONObject(str)));
        return visaCheckoutNonce;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        super.mo53264a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("details");
        this.f68945e = jSONObject2.getString("lastTwo");
        this.f68946f = jSONObject2.getString("cardType");
        this.f68947g = VisaCheckoutAddress.m53267a(jSONObject.optJSONObject("billingAddress"));
        this.f68948h = VisaCheckoutAddress.m53267a(jSONObject.optJSONObject("shippingAddress"));
        this.f68949i = VisaCheckoutUserData.m53260a(jSONObject.optJSONObject("userData"));
        this.f68950j = C39299ci2.m61029a(jSONObject, "callId", "");
        this.f68951k = BinData.m53393b(jSONObject.optJSONObject("binData"));
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68945e);
        parcel.writeString(this.f68946f);
        parcel.writeParcelable(this.f68947g, i);
        parcel.writeParcelable(this.f68948h, i);
        parcel.writeParcelable(this.f68949i, i);
        parcel.writeString(this.f68950j);
        parcel.writeParcelable(this.f68951k, i);
    }

    public VisaCheckoutNonce(Parcel parcel) {
        super(parcel);
        this.f68945e = parcel.readString();
        this.f68946f = parcel.readString();
        this.f68947g = (VisaCheckoutAddress) parcel.readParcelable(VisaCheckoutAddress.class.getClassLoader());
        this.f68948h = (VisaCheckoutAddress) parcel.readParcelable(VisaCheckoutAddress.class.getClassLoader());
        this.f68949i = (VisaCheckoutUserData) parcel.readParcelable(VisaCheckoutUserData.class.getClassLoader());
        this.f68950j = parcel.readString();
        this.f68951k = (BinData) parcel.readParcelable(BinData.class.getClassLoader());
    }
}
