package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class LocalPaymentResult extends PaymentMethodNonce {
    public static final Parcelable.Creator<LocalPaymentResult> CREATOR = new C16982a();

    /* renamed from: e */
    public String f68754e;

    /* renamed from: f */
    public PostalAddress f68755f;

    /* renamed from: g */
    public PostalAddress f68756g;

    /* renamed from: h */
    public String f68757h;

    /* renamed from: i */
    public String f68758i;

    /* renamed from: j */
    public String f68759j;

    /* renamed from: k */
    public String f68760k;

    /* renamed from: l */
    public String f68761l;

    /* renamed from: m */
    public String f68762m;

    /* renamed from: com.braintreepayments.api.models.LocalPaymentResult$a */
    /* loaded from: classes2.dex */
    public static class C16982a implements Parcelable.Creator<LocalPaymentResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public LocalPaymentResult createFromParcel(Parcel parcel) {
            return new LocalPaymentResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public LocalPaymentResult[] newArray(int i) {
            return new LocalPaymentResult[i];
        }
    }

    public /* synthetic */ LocalPaymentResult(Parcel parcel, C16982a c16982a) {
        this(parcel);
    }

    /* renamed from: g */
    public static LocalPaymentResult m53370g(String str) throws JSONException {
        LocalPaymentResult localPaymentResult = new LocalPaymentResult();
        localPaymentResult.mo53264a(PaymentMethodNonce.m53328b("paypalAccounts", new JSONObject(str)));
        return localPaymentResult;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        JSONObject optJSONObject;
        super.mo53264a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("details");
        this.f68760k = C39299ci2.m61029a(jSONObject2, "email", null);
        this.f68754e = C39299ci2.m61029a(jSONObject2, "correlationId", null);
        this.f68762m = C39299ci2.m61029a(jSONObject, "type", "PayPalAccount");
        try {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("payerInfo");
            if (jSONObject3.has("accountAddress")) {
                optJSONObject = jSONObject3.optJSONObject("accountAddress");
            } else {
                optJSONObject = jSONObject3.optJSONObject("billingAddress");
            }
            JSONObject optJSONObject2 = jSONObject3.optJSONObject("shippingAddress");
            this.f68755f = IY3.m101937b(optJSONObject);
            this.f68756g = IY3.m101937b(optJSONObject2);
            this.f68757h = C39299ci2.m61029a(jSONObject3, "firstName", "");
            this.f68758i = C39299ci2.m61029a(jSONObject3, "lastName", "");
            this.f68759j = C39299ci2.m61029a(jSONObject3, PaymentMethod.BillingDetails.PARAM_PHONE, "");
            this.f68761l = C39299ci2.m61029a(jSONObject3, "payerId", "");
            if (this.f68760k == null) {
                this.f68760k = C39299ci2.m61029a(jSONObject3, "email", null);
            }
        } catch (JSONException unused) {
            this.f68755f = new PostalAddress();
            this.f68756g = new PostalAddress();
        }
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68754e);
        parcel.writeParcelable(this.f68755f, i);
        parcel.writeParcelable(this.f68756g, i);
        parcel.writeString(this.f68757h);
        parcel.writeString(this.f68758i);
        parcel.writeString(this.f68760k);
        parcel.writeString(this.f68759j);
        parcel.writeString(this.f68761l);
        parcel.writeString(this.f68762m);
    }

    public LocalPaymentResult() {
    }

    public LocalPaymentResult(Parcel parcel) {
        super(parcel);
        this.f68754e = parcel.readString();
        this.f68755f = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68756g = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68757h = parcel.readString();
        this.f68758i = parcel.readString();
        this.f68760k = parcel.readString();
        this.f68759j = parcel.readString();
        this.f68761l = parcel.readString();
        this.f68762m = parcel.readString();
    }
}
