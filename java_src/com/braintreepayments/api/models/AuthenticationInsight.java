package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class AuthenticationInsight implements Parcelable {
    public static final Parcelable.Creator<AuthenticationInsight> CREATOR = new C16974a();

    /* renamed from: b */
    public String f68691b;

    /* renamed from: com.braintreepayments.api.models.AuthenticationInsight$a */
    /* loaded from: classes2.dex */
    public static class C16974a implements Parcelable.Creator<AuthenticationInsight> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AuthenticationInsight createFromParcel(Parcel parcel) {
            return new AuthenticationInsight(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AuthenticationInsight[] newArray(int i) {
            return new AuthenticationInsight[i];
        }
    }

    public /* synthetic */ AuthenticationInsight(Parcel parcel, C16974a c16974a) {
        this(parcel);
    }

    /* renamed from: a */
    public static AuthenticationInsight m53401a(JSONObject jSONObject) {
        String m61029a;
        if (jSONObject == null) {
            return null;
        }
        AuthenticationInsight authenticationInsight = new AuthenticationInsight();
        if (jSONObject.has("customerAuthenticationRegulationEnvironment")) {
            m61029a = C39299ci2.m61029a(jSONObject, "customerAuthenticationRegulationEnvironment", null);
        } else {
            m61029a = C39299ci2.m61029a(jSONObject, "regulationEnvironment", null);
        }
        if ("psdtwo".equalsIgnoreCase(m61029a)) {
            m61029a = "psd2";
        }
        if (m61029a != null) {
            m61029a = m61029a.toLowerCase();
        }
        authenticationInsight.f68691b = m61029a;
        return authenticationInsight;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68691b);
    }

    public AuthenticationInsight() {
    }

    public AuthenticationInsight(Parcel parcel) {
        this.f68691b = parcel.readString();
    }
}
