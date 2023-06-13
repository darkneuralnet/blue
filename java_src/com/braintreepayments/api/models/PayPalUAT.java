package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class PayPalUAT extends Authorization {
    public static final Parcelable.Creator<PayPalUAT> CREATOR = new C16988a();

    /* renamed from: c */
    public String f68800c;

    /* renamed from: d */
    public String f68801d;

    /* renamed from: e */
    public String f68802e;

    /* renamed from: f */
    public String f68803f;

    /* renamed from: g */
    public EnumC16989b f68804g;

    /* renamed from: com.braintreepayments.api.models.PayPalUAT$a */
    /* loaded from: classes2.dex */
    public static class C16988a implements Parcelable.Creator<PayPalUAT> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalUAT createFromParcel(Parcel parcel) {
            return new PayPalUAT(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalUAT[] newArray(int i) {
            return new PayPalUAT[i];
        }
    }

    /* renamed from: com.braintreepayments.api.models.PayPalUAT$b */
    /* loaded from: classes2.dex */
    public enum EnumC16989b {
        STAGING,
        SANDBOX,
        PRODUCTION
    }

    public PayPalUAT(String str) throws InvalidArgumentException {
        super(str);
        this.f68803f = str;
        try {
            JSONObject jSONObject = new JSONObject(m53333h(str));
            JSONArray jSONArray = jSONObject.getJSONArray("external_id");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    break;
                } else if (jSONArray.getString(i).startsWith("Braintree:")) {
                    this.f68802e = jSONArray.getString(i).split(":")[1];
                    break;
                } else {
                    i++;
                }
            }
            if (!TextUtils.isEmpty(this.f68802e)) {
                if (jSONObject.has("iss")) {
                    this.f68801d = jSONObject.getString("iss");
                    this.f68804g = m53332i();
                    this.f68800c = m53331j();
                    return;
                }
                throw new IllegalArgumentException("Does not contain issuer, or \"iss\" key.");
            }
            throw new IllegalArgumentException("Missing Braintree merchant account ID.");
        } catch (IllegalArgumentException | NullPointerException | JSONException e) {
            throw new InvalidArgumentException("PayPal UAT invalid: " + e.getMessage());
        }
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: b */
    public String mo53279b() {
        return this.f68803f;
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: c */
    public String mo53278c() {
        return this.f68800c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public final String m53333h(String str) {
        return new String(Base64.decode(str.split("[.]")[1], 0));
    }

    /* renamed from: i */
    public final EnumC16989b m53332i() throws IllegalArgumentException {
        String str = this.f68801d;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1750115095:
                if (str.equals("https://api.paypal.com")) {
                    c = 0;
                    break;
                }
                break;
            case 823203617:
                if (str.equals("https://api.msmaster.qa.paypal.com")) {
                    c = 1;
                    break;
                }
                break;
            case 1731655536:
                if (str.equals("https://api.sandbox.paypal.com")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return EnumC16989b.PRODUCTION;
            case 1:
                return EnumC16989b.STAGING;
            case 2:
                return EnumC16989b.SANDBOX;
            default:
                throw new IllegalArgumentException("PayPal issuer URL missing or unknown: " + this.f68801d);
        }
    }

    /* renamed from: j */
    public final String m53331j() {
        String str;
        EnumC16989b enumC16989b = this.f68804g;
        if (enumC16989b != EnumC16989b.STAGING && enumC16989b != EnumC16989b.SANDBOX) {
            str = "https://api.braintreegateway.com:443/merchants/";
        } else {
            str = "https://api.sandbox.braintreegateway.com:443/merchants/";
        }
        return str + this.f68802e + "/client_api/v1/configuration";
    }

    @Override // com.braintreepayments.api.models.Authorization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68800c);
        parcel.writeString(this.f68801d);
        parcel.writeString(this.f68803f);
        parcel.writeString(this.f68802e);
    }

    public PayPalUAT(Parcel parcel) {
        super(parcel);
        this.f68800c = parcel.readString();
        this.f68801d = parcel.readString();
        this.f68803f = parcel.readString();
        this.f68802e = parcel.readString();
    }
}
