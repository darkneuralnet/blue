package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ThreeDSecureAuthenticationResponse implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureAuthenticationResponse> CREATOR = new C16992a();

    /* renamed from: b */
    public CardNonce f68861b;

    /* renamed from: c */
    public boolean f68862c;

    /* renamed from: d */
    public String f68863d;

    /* renamed from: e */
    public String f68864e;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse$a */
    /* loaded from: classes2.dex */
    public static class C16992a implements Parcelable.Creator<ThreeDSecureAuthenticationResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureAuthenticationResponse createFromParcel(Parcel parcel) {
            return new ThreeDSecureAuthenticationResponse(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureAuthenticationResponse[] newArray(int i) {
            return new ThreeDSecureAuthenticationResponse[i];
        }
    }

    public /* synthetic */ ThreeDSecureAuthenticationResponse(Parcel parcel, C16992a c16992a) {
        this(parcel);
    }

    /* renamed from: a */
    public static ThreeDSecureAuthenticationResponse m53304a(String str) {
        boolean z;
        ThreeDSecureAuthenticationResponse threeDSecureAuthenticationResponse = new ThreeDSecureAuthenticationResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("paymentMethod");
            if (optJSONObject != null) {
                CardNonce cardNonce = new CardNonce();
                cardNonce.mo53264a(optJSONObject);
                threeDSecureAuthenticationResponse.f68861b = cardNonce;
            }
            if (jSONObject.has("success")) {
                if (jSONObject.has("error")) {
                    threeDSecureAuthenticationResponse.f68863d = C39299ci2.m61029a(jSONObject.getJSONObject("error"), "message", null);
                }
                threeDSecureAuthenticationResponse.f68862c = jSONObject.getBoolean("success");
            } else {
                if (jSONObject.has("errors")) {
                    threeDSecureAuthenticationResponse.f68863d = C39299ci2.m61029a(jSONObject.getJSONArray("errors").getJSONObject(0), "message", null);
                }
                if (threeDSecureAuthenticationResponse.f68863d == null) {
                    z = true;
                } else {
                    z = false;
                }
                threeDSecureAuthenticationResponse.f68862c = z;
            }
        } catch (JSONException unused) {
            threeDSecureAuthenticationResponse.f68862c = false;
        }
        return threeDSecureAuthenticationResponse;
    }

    @Deprecated
    /* renamed from: d */
    public static CardNonce m53301d(String str, CardNonce cardNonce) {
        ThreeDSecureAuthenticationResponse threeDSecureAuthenticationResponse = new ThreeDSecureAuthenticationResponse();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("success")) {
                threeDSecureAuthenticationResponse.f68862c = jSONObject.getBoolean("success");
            } else if (!jSONObject.has("errors")) {
                threeDSecureAuthenticationResponse.f68862c = true;
            }
            if (threeDSecureAuthenticationResponse.f68862c) {
                JSONObject optJSONObject = jSONObject.optJSONObject("paymentMethod");
                if (optJSONObject != null) {
                    CardNonce cardNonce2 = new CardNonce();
                    try {
                        cardNonce2.mo53264a(optJSONObject);
                        cardNonce = cardNonce2;
                    } catch (JSONException e) {
                        e = e;
                        cardNonce = cardNonce2;
                        threeDSecureAuthenticationResponse.f68862c = false;
                        threeDSecureAuthenticationResponse.f68864e = e.getMessage();
                        cardNonce.m53383i().m53293e(threeDSecureAuthenticationResponse);
                        return cardNonce;
                    }
                }
            } else {
                threeDSecureAuthenticationResponse.f68863d = str;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        cardNonce.m53383i().m53293e(threeDSecureAuthenticationResponse);
        return cardNonce;
    }

    /* renamed from: b */
    public CardNonce m53303b() {
        return this.f68861b;
    }

    @Deprecated
    /* renamed from: c */
    public String m53302c() {
        return this.f68863d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    /* renamed from: e */
    public boolean m53300e() {
        return this.f68862c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f68862c ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f68861b, i);
        parcel.writeString(this.f68863d);
        parcel.writeString(this.f68864e);
    }

    public ThreeDSecureAuthenticationResponse() {
    }

    public ThreeDSecureAuthenticationResponse(Parcel parcel) {
        this.f68862c = parcel.readByte() != 0;
        this.f68861b = (CardNonce) parcel.readParcelable(CardNonce.class.getClassLoader());
        this.f68863d = parcel.readString();
        this.f68864e = parcel.readString();
    }
}
