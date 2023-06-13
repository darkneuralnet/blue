package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PayPalAccountNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<PayPalAccountNonce> CREATOR = new C16983a();

    /* renamed from: e */
    public String f68763e;

    /* renamed from: f */
    public PostalAddress f68764f;

    /* renamed from: g */
    public PostalAddress f68765g;

    /* renamed from: h */
    public String f68766h;

    /* renamed from: i */
    public String f68767i;

    /* renamed from: j */
    public String f68768j;

    /* renamed from: k */
    public String f68769k;

    /* renamed from: l */
    public String f68770l;

    /* renamed from: m */
    public PayPalCreditFinancing f68771m;

    /* renamed from: n */
    public String f68772n;

    /* renamed from: com.braintreepayments.api.models.PayPalAccountNonce$a */
    /* loaded from: classes2.dex */
    public static class C16983a implements Parcelable.Creator<PayPalAccountNonce> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalAccountNonce createFromParcel(Parcel parcel) {
            return new PayPalAccountNonce(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalAccountNonce[] newArray(int i) {
            return new PayPalAccountNonce[i];
        }
    }

    public /* synthetic */ PayPalAccountNonce(Parcel parcel, C16983a c16983a) {
        this(parcel);
    }

    /* renamed from: g */
    public static PayPalAccountNonce m53367g(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        PayPalAccountNonce payPalAccountNonce = new PayPalAccountNonce();
        if (jSONObject.has("paypalAccounts")) {
            payPalAccountNonce.mo53264a(PaymentMethodNonce.m53328b("paypalAccounts", jSONObject));
        } else if (jSONObject.has("paymentMethodData")) {
            payPalAccountNonce.mo53264a(PaymentMethodNonce.m53328b("paypalAccounts", new JSONObject(new JSONObject(str).getJSONObject("paymentMethodData").getJSONObject("tokenizationData").getString("token"))));
            JSONObject optJSONObject = jSONObject.optJSONObject("shippingAddress");
            if (optJSONObject != null) {
                payPalAccountNonce.f68765g = IY3.m101937b(optJSONObject);
            }
        } else {
            throw new JSONException("Could not parse JSON for a payment method nonce");
        }
        return payPalAccountNonce;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        super.mo53264a(jSONObject);
        this.f68772n = C39299ci2.m61029a(jSONObject, "authenticateUrl", null);
        JSONObject jSONObject2 = jSONObject.getJSONObject("details");
        this.f68769k = C39299ci2.m61029a(jSONObject2, "email", null);
        this.f68763e = C39299ci2.m61029a(jSONObject2, "correlationId", null);
        try {
            if (jSONObject2.has("creditFinancingOffered")) {
                this.f68771m = PayPalCreditFinancing.m53362a(jSONObject2.getJSONObject("creditFinancingOffered"));
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("payerInfo");
            JSONObject optJSONObject = jSONObject3.optJSONObject("billingAddress");
            if (jSONObject3.has("accountAddress")) {
                optJSONObject = jSONObject3.optJSONObject("accountAddress");
            }
            this.f68765g = IY3.m101937b(jSONObject3.optJSONObject("shippingAddress"));
            this.f68764f = IY3.m101937b(optJSONObject);
            this.f68766h = C39299ci2.m61029a(jSONObject3, "firstName", "");
            this.f68767i = C39299ci2.m61029a(jSONObject3, "lastName", "");
            this.f68768j = C39299ci2.m61029a(jSONObject3, PaymentMethod.BillingDetails.PARAM_PHONE, "");
            this.f68770l = C39299ci2.m61029a(jSONObject3, "payerId", "");
            if (this.f68769k == null) {
                this.f68769k = C39299ci2.m61029a(jSONObject3, "email", null);
            }
        } catch (JSONException unused) {
            this.f68764f = new PostalAddress();
            this.f68765g = new PostalAddress();
        }
    }

    /* renamed from: h */
    public PayPalCreditFinancing m53366h() {
        return this.f68771m;
    }

    /* renamed from: i */
    public String m53365i() {
        return this.f68769k;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68763e);
        parcel.writeParcelable(this.f68764f, i);
        parcel.writeParcelable(this.f68765g, i);
        parcel.writeString(this.f68766h);
        parcel.writeString(this.f68767i);
        parcel.writeString(this.f68769k);
        parcel.writeString(this.f68768j);
        parcel.writeString(this.f68770l);
        parcel.writeParcelable(this.f68771m, i);
        parcel.writeString(this.f68772n);
    }

    public PayPalAccountNonce() {
    }

    public PayPalAccountNonce(Parcel parcel) {
        super(parcel);
        this.f68763e = parcel.readString();
        this.f68764f = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68765g = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68766h = parcel.readString();
        this.f68767i = parcel.readString();
        this.f68769k = parcel.readString();
        this.f68768j = parcel.readString();
        this.f68770l = parcel.readString();
        this.f68771m = (PayPalCreditFinancing) parcel.readParcelable(PayPalCreditFinancing.class.getClassLoader());
        this.f68772n = parcel.readString();
    }
}
