package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CardNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<CardNonce> CREATOR = new C16978a();

    /* renamed from: e */
    public String f68718e;

    /* renamed from: f */
    public String f68719f;

    /* renamed from: g */
    public String f68720g;

    /* renamed from: h */
    public ThreeDSecureInfo f68721h;

    /* renamed from: i */
    public String f68722i;

    /* renamed from: j */
    public BinData f68723j;

    /* renamed from: k */
    public AuthenticationInsight f68724k;

    /* renamed from: l */
    public String f68725l;

    /* renamed from: m */
    public String f68726m;

    /* renamed from: n */
    public String f68727n;

    /* renamed from: com.braintreepayments.api.models.CardNonce$a */
    /* loaded from: classes2.dex */
    public static class C16978a implements Parcelable.Creator<CardNonce> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CardNonce createFromParcel(Parcel parcel) {
            return new CardNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CardNonce[] newArray(int i) {
            return new CardNonce[i];
        }
    }

    public CardNonce() {
    }

    /* renamed from: h */
    public static CardNonce m53384h(String str) throws JSONException {
        CardNonce cardNonce = new CardNonce();
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has(MessageExtension.FIELD_DATA)) {
            cardNonce.m53385g(jSONObject);
        } else {
            cardNonce.mo53264a(PaymentMethodNonce.m53328b("creditCards", jSONObject));
        }
        return cardNonce;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        super.mo53264a(jSONObject);
        JSONObject jSONObject2 = jSONObject.getJSONObject("details");
        this.f68719f = jSONObject2.getString("lastTwo");
        this.f68720g = jSONObject2.getString("lastFour");
        this.f68718e = jSONObject2.getString("cardType");
        this.f68721h = ThreeDSecureInfo.m53297a(jSONObject.optJSONObject("threeDSecureInfo"));
        this.f68722i = C39299ci2.m61029a(jSONObject2, "bin", "");
        this.f68723j = BinData.m53393b(jSONObject.optJSONObject("binData"));
        this.f68724k = AuthenticationInsight.m53401a(jSONObject.optJSONObject("authenticationInsight"));
        this.f68725l = C39299ci2.m61029a(jSONObject2, "expirationMonth", "");
        this.f68726m = C39299ci2.m61029a(jSONObject2, "expirationYear", "");
        this.f68727n = C39299ci2.m61029a(jSONObject2, "cardholderName", "");
    }

    /* renamed from: g */
    public final void m53385g(JSONObject jSONObject) throws JSONException {
        String substring;
        String str;
        JSONObject jSONObject2 = jSONObject.getJSONObject(MessageExtension.FIELD_DATA);
        if (jSONObject2.has("tokenizeCreditCard")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("tokenizeCreditCard");
            JSONObject jSONObject4 = jSONObject3.getJSONObject("creditCard");
            String m61029a = C39299ci2.m61029a(jSONObject4, "last4", "");
            this.f68720g = m61029a;
            if (m61029a.length() < 4) {
                substring = "";
            } else {
                substring = this.f68720g.substring(2);
            }
            this.f68719f = substring;
            this.f68718e = C39299ci2.m61029a(jSONObject4, AccountRangeJsonParser.FIELD_BRAND, "Unknown");
            this.f68721h = ThreeDSecureInfo.m53297a(null);
            this.f68722i = C39299ci2.m61029a(jSONObject4, "bin", "");
            this.f68723j = BinData.m53393b(jSONObject4.optJSONObject("binData"));
            this.f68809b = jSONObject3.getString("token");
            if (TextUtils.isEmpty(this.f68719f)) {
                str = "";
            } else {
                str = "ending in ••" + this.f68719f;
            }
            this.f68810c = str;
            this.f68811d = false;
            this.f68724k = AuthenticationInsight.m53401a(jSONObject3.optJSONObject("authenticationInsight"));
            this.f68725l = C39299ci2.m61029a(jSONObject4, "expirationMonth", "");
            this.f68726m = C39299ci2.m61029a(jSONObject4, "expirationYear", "");
            this.f68727n = C39299ci2.m61029a(jSONObject4, "cardholderName", "");
            return;
        }
        throw new JSONException("Failed to parse GraphQL response JSON");
    }

    /* renamed from: i */
    public ThreeDSecureInfo m53383i() {
        return this.f68721h;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68718e);
        parcel.writeString(this.f68719f);
        parcel.writeString(this.f68720g);
        parcel.writeParcelable(this.f68723j, i);
        parcel.writeParcelable(this.f68721h, i);
        parcel.writeParcelable(this.f68724k, i);
        parcel.writeString(this.f68725l);
        parcel.writeString(this.f68726m);
        parcel.writeString(this.f68727n);
    }

    public CardNonce(Parcel parcel) {
        super(parcel);
        this.f68718e = parcel.readString();
        this.f68719f = parcel.readString();
        this.f68720g = parcel.readString();
        this.f68723j = (BinData) parcel.readParcelable(BinData.class.getClassLoader());
        this.f68721h = (ThreeDSecureInfo) parcel.readParcelable(ThreeDSecureInfo.class.getClassLoader());
        this.f68724k = (AuthenticationInsight) parcel.readParcelable(AuthenticationInsight.class.getClassLoader());
        this.f68725l = parcel.readString();
        this.f68726m = parcel.readString();
        this.f68727n = parcel.readString();
    }
}
