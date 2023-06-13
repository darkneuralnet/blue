package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VenmoAccountNonce extends PaymentMethodNonce {
    public static final Parcelable.Creator<VenmoAccountNonce> CREATOR = new C17002a();

    /* renamed from: e */
    public String f68935e;

    /* renamed from: com.braintreepayments.api.models.VenmoAccountNonce$a */
    /* loaded from: classes2.dex */
    public static class C17002a implements Parcelable.Creator<VenmoAccountNonce> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VenmoAccountNonce createFromParcel(Parcel parcel) {
            return new VenmoAccountNonce(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VenmoAccountNonce[] newArray(int i) {
            return new VenmoAccountNonce[i];
        }
    }

    public VenmoAccountNonce(String str, String str2, String str3) {
        this.f68809b = str;
        this.f68810c = str2;
        this.f68935e = str3;
    }

    /* renamed from: g */
    public static VenmoAccountNonce m53270g(String str) throws JSONException {
        VenmoAccountNonce venmoAccountNonce = new VenmoAccountNonce();
        venmoAccountNonce.mo53264a(PaymentMethodNonce.m53328b("venmoAccounts", new JSONObject(str)));
        return venmoAccountNonce;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce
    /* renamed from: a */
    public void mo53264a(JSONObject jSONObject) throws JSONException {
        super.mo53264a(jSONObject);
        String string = jSONObject.getJSONObject("details").getString("username");
        this.f68935e = string;
        this.f68810c = string;
    }

    @Override // com.braintreepayments.api.models.PaymentMethodNonce, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68935e);
    }

    public VenmoAccountNonce() {
    }

    public VenmoAccountNonce(Parcel parcel) {
        super(parcel);
        this.f68935e = parcel.readString();
    }
}
