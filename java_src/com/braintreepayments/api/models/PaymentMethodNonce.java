package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class PaymentMethodNonce implements Parcelable {

    /* renamed from: b */
    public String f68809b;

    /* renamed from: c */
    public String f68810c;

    /* renamed from: d */
    public boolean f68811d;

    public PaymentMethodNonce() {
    }

    /* renamed from: b */
    public static JSONObject m53328b(String str, JSONObject jSONObject) throws JSONException {
        return jSONObject.getJSONArray(str).getJSONObject(0);
    }

    /* renamed from: d */
    public static PaymentMethodNonce m53326d(String str, String str2) throws JSONException {
        return m53325e(new JSONObject(str), str2);
    }

    /* renamed from: e */
    public static PaymentMethodNonce m53325e(JSONObject jSONObject, String str) throws JSONException {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1807185524:
                if (str.equals("VenmoAccount")) {
                    c = 0;
                    break;
                }
                break;
            case -650599305:
                if (str.equals("VisaCheckoutCard")) {
                    c = 1;
                    break;
                }
                break;
            case 1212590010:
                if (str.equals("PayPalAccount")) {
                    c = 2;
                    break;
                }
                break;
            case 1428640201:
                if (str.equals("CreditCard")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (jSONObject.has("venmoAccounts")) {
                    return VenmoAccountNonce.m53270g(jSONObject.toString());
                }
                VenmoAccountNonce venmoAccountNonce = new VenmoAccountNonce();
                venmoAccountNonce.mo53264a(jSONObject);
                return venmoAccountNonce;
            case 1:
                if (jSONObject.has("visaCheckoutCards")) {
                    return VisaCheckoutNonce.m53263g(jSONObject.toString());
                }
                VisaCheckoutNonce visaCheckoutNonce = new VisaCheckoutNonce();
                visaCheckoutNonce.mo53264a(jSONObject);
                return visaCheckoutNonce;
            case 2:
                if (jSONObject.has("paypalAccounts")) {
                    return PayPalAccountNonce.m53367g(jSONObject.toString());
                }
                PayPalAccountNonce payPalAccountNonce = new PayPalAccountNonce();
                payPalAccountNonce.mo53264a(jSONObject);
                return payPalAccountNonce;
            case 3:
                if (!jSONObject.has("creditCards") && !jSONObject.has(MessageExtension.FIELD_DATA)) {
                    CardNonce cardNonce = new CardNonce();
                    cardNonce.mo53264a(jSONObject);
                    return cardNonce;
                }
                return CardNonce.m53384h(jSONObject.toString());
            default:
                return null;
        }
    }

    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        this.f68809b = jSONObject.getString("nonce");
        this.f68810c = jSONObject.getString("description");
        this.f68811d = jSONObject.optBoolean("default", false);
    }

    /* renamed from: c */
    public String m53327c() {
        return this.f68809b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68809b);
        parcel.writeString(this.f68810c);
        parcel.writeByte(this.f68811d ? (byte) 1 : (byte) 0);
    }

    public PaymentMethodNonce(Parcel parcel) {
        this.f68809b = parcel.readString();
        this.f68810c = parcel.readString();
        this.f68811d = parcel.readByte() > 0;
    }
}
