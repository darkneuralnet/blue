package com.braintreepayments.api.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.braintreepayments.api.exceptions.BraintreeException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class CardBuilder extends BaseCardBuilder<CardBuilder> {
    public static final Parcelable.Creator<CardBuilder> CREATOR = new C16977a();

    /* renamed from: u */
    public String f68716u;

    /* renamed from: v */
    public boolean f68717v;

    /* renamed from: com.braintreepayments.api.models.CardBuilder$a */
    /* loaded from: classes2.dex */
    public static class C16977a implements Parcelable.Creator<CardBuilder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CardBuilder createFromParcel(Parcel parcel) {
            return new CardBuilder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CardBuilder[] newArray(int i) {
            return new CardBuilder[i];
        }
    }

    public CardBuilder() {
    }

    @Override // com.braintreepayments.api.models.BaseCardBuilder, p000.AbstractC48015rN3
    /* renamed from: b */
    public void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        super.mo2563b(jSONObject, jSONObject2);
        if (this.f68717v) {
            jSONObject.put("merchantAccountId", this.f68716u);
            jSONObject.put("authenticationInsight", this.f68717v);
        }
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: d */
    public void mo2562d(Context context, JSONObject jSONObject, JSONObject jSONObject2) throws BraintreeException, JSONException {
        JSONObject jSONObject3 = jSONObject2.getJSONObject("input");
        if (TextUtils.isEmpty(this.f68716u) && this.f68717v) {
            throw new BraintreeException("A merchant account ID is required when authenticationInsightRequested is true.");
        }
        if (this.f68717v) {
            jSONObject2.put("authenticationInsightInput", new JSONObject().put("merchantAccountId", this.f68716u));
        }
        jSONObject.put("query", m53388l());
        jSONObject.put("operationName", "TokenizeCreditCard");
        JSONObject put = new JSONObject().put("number", this.f68694h).put("expirationMonth", this.f68698l).put("expirationYear", this.f68699m).put("cvv", this.f68697k).put("cardholderName", this.f68693g);
        JSONObject put2 = new JSONObject().put("firstName", this.f68701o).put("lastName", this.f68702p).put("company", this.f68695i).put("countryCode", this.f68696j).put("locality", this.f68703q).put("postalCode", this.f68704r).put("region", this.f68705s).put("streetAddress", this.f68706t).put("extendedAddress", this.f68700n);
        if (put2.length() > 0) {
            put.put("billingAddress", put2);
        }
        jSONObject3.put("creditCard", put);
    }

    /* renamed from: l */
    public final String m53388l() {
        StringBuilder sb = new StringBuilder();
        sb.append("mutation TokenizeCreditCard($input: TokenizeCreditCardInput!");
        if (this.f68717v) {
            sb.append(", $authenticationInsightInput: AuthenticationInsightInput!");
        }
        sb.append(") {  tokenizeCreditCard(input: $input) {    token    creditCard {      bin      brand      expirationMonth      expirationYear      cardholderName      last4      binData {        prepaid        healthcare        debit        durbinRegulated        commercial        payroll        issuingBank        countryOfIssuance        productId      }    }");
        if (this.f68717v) {
            sb.append("    authenticationInsight(input: $authenticationInsightInput) {      customerAuthenticationRegulationEnvironment    }");
        }
        sb.append("  }}");
        return sb.toString();
    }

    @Override // com.braintreepayments.api.models.BaseCardBuilder, p000.AbstractC48015rN3, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68716u);
        parcel.writeByte(this.f68717v ? (byte) 1 : (byte) 0);
    }

    public CardBuilder(Parcel parcel) {
        super(parcel);
        this.f68716u = parcel.readString();
        this.f68717v = parcel.readByte() > 0;
    }
}
