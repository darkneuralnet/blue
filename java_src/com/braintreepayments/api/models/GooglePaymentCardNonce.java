package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class GooglePaymentCardNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<GooglePaymentCardNonce> CREATOR = new C16980a();

    /* renamed from: e */
    public String f68730e;

    /* renamed from: f */
    public String f68731f;

    /* renamed from: g */
    public String f68732g;

    /* renamed from: h */
    public String f68733h;

    /* renamed from: i */
    public Boolean f68734i;

    /* renamed from: j */
    public PostalAddress f68735j;

    /* renamed from: k */
    public PostalAddress f68736k;

    /* renamed from: l */
    public BinData f68737l;

    /* renamed from: com.braintreepayments.api.models.GooglePaymentCardNonce$a */
    /* loaded from: classes2.dex */
    public static class C16980a implements Parcelable.Creator<GooglePaymentCardNonce> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public GooglePaymentCardNonce createFromParcel(Parcel parcel) {
            return new GooglePaymentCardNonce(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public GooglePaymentCardNonce[] newArray(int i) {
            return new GooglePaymentCardNonce[i];
        }
    }

    public /* synthetic */ GooglePaymentCardNonce(Parcel parcel, C16980a c16980a) {
        this(parcel);
    }

    /* renamed from: g */
    public static String m53377g(JSONObject jSONObject) {
        return ("" + C39299ci2.m61029a(jSONObject, "address2", "") + "\n" + C39299ci2.m61029a(jSONObject, "address3", "") + "\n" + C39299ci2.m61029a(jSONObject, "address4", "") + "\n" + C39299ci2.m61029a(jSONObject, "address5", "")).trim();
    }

    /* renamed from: h */
    public static GooglePaymentCardNonce m53376h(String str) throws JSONException {
        GooglePaymentCardNonce googlePaymentCardNonce = new GooglePaymentCardNonce();
        googlePaymentCardNonce.mo53264a(new JSONObject(str));
        return googlePaymentCardNonce;
    }

    /* renamed from: i */
    public static PostalAddress m53375i(JSONObject jSONObject) {
        PostalAddress postalAddress = new PostalAddress();
        postalAddress.m53312n(C39299ci2.m61029a(jSONObject, "name", "")).m53314l(C39299ci2.m61029a(jSONObject, "phoneNumber", "")).m53309q(C39299ci2.m61029a(jSONObject, "address1", "")).m53323b(m53377g(jSONObject)).m53315k(C39299ci2.m61029a(jSONObject, "locality", "")).m53311o(C39299ci2.m61029a(jSONObject, "administrativeArea", "")).m53324a(C39299ci2.m61029a(jSONObject, "countryCode", "")).m53313m(C39299ci2.m61029a(jSONObject, "postalCode", "")).m53310p(C39299ci2.m61029a(jSONObject, "sortingCode", ""));
        return postalAddress;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject(ON3.m92363a(jSONObject.toString()).getJSONArray("androidPayCards").get(0).toString());
        super.mo53264a(jSONObject4);
        JSONObject jSONObject5 = jSONObject4.getJSONObject("details");
        JSONObject jSONObject6 = jSONObject.getJSONObject("paymentMethodData").getJSONObject("info");
        if (jSONObject6.has("billingAddress")) {
            jSONObject2 = jSONObject6.getJSONObject("billingAddress");
        }
        if (jSONObject.has("shippingAddress")) {
            jSONObject3 = jSONObject.getJSONObject("shippingAddress");
        }
        this.f68810c = jSONObject.getJSONObject("paymentMethodData").get("description").toString();
        this.f68733h = C39299ci2.m61029a(jSONObject, "email", "");
        this.f68735j = m53375i(jSONObject2);
        this.f68736k = m53375i(jSONObject3);
        this.f68737l = BinData.m53393b(jSONObject.optJSONObject("binData"));
        this.f68731f = jSONObject5.getString("lastTwo");
        this.f68732g = jSONObject5.getString("lastFour");
        this.f68730e = jSONObject5.getString("cardType");
        this.f68734i = Boolean.valueOf(jSONObject5.optBoolean("isNetworkTokenized", false));
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68730e);
        parcel.writeString(this.f68731f);
        parcel.writeString(this.f68732g);
        parcel.writeString(this.f68733h);
        parcel.writeParcelable(this.f68735j, i);
        parcel.writeParcelable(this.f68736k, i);
        parcel.writeParcelable(this.f68737l, i);
    }

    public GooglePaymentCardNonce() {
    }

    public GooglePaymentCardNonce(Parcel parcel) {
        super(parcel);
        this.f68730e = parcel.readString();
        this.f68731f = parcel.readString();
        this.f68732g = parcel.readString();
        this.f68733h = parcel.readString();
        this.f68735j = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68736k = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68737l = (BinData) parcel.readParcelable(BinData.class.getClassLoader());
    }
}
