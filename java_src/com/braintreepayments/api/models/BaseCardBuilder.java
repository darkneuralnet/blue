package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class BaseCardBuilder<T> extends AbstractC48015rN3<T> implements Parcelable {

    /* renamed from: g */
    public String f68693g;

    /* renamed from: h */
    public String f68694h;

    /* renamed from: i */
    public String f68695i;

    /* renamed from: j */
    public String f68696j;

    /* renamed from: k */
    public String f68697k;

    /* renamed from: l */
    public String f68698l;

    /* renamed from: m */
    public String f68699m;

    /* renamed from: n */
    public String f68700n;

    /* renamed from: o */
    public String f68701o;

    /* renamed from: p */
    public String f68702p;

    /* renamed from: q */
    public String f68703q;

    /* renamed from: r */
    public String f68704r;

    /* renamed from: s */
    public String f68705s;

    /* renamed from: t */
    public String f68706t;

    public BaseCardBuilder() {
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: b */
    public void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        jSONObject2.put("number", this.f68694h);
        jSONObject2.put("cvv", this.f68697k);
        jSONObject2.put("expirationMonth", this.f68698l);
        jSONObject2.put("expirationYear", this.f68699m);
        jSONObject2.put("cardholderName", this.f68693g);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("firstName", this.f68701o);
        jSONObject3.put("lastName", this.f68702p);
        jSONObject3.put("company", this.f68695i);
        jSONObject3.put("locality", this.f68703q);
        jSONObject3.put("postalCode", this.f68704r);
        jSONObject3.put("region", this.f68705s);
        jSONObject3.put("streetAddress", this.f68706t);
        jSONObject3.put("extendedAddress", this.f68700n);
        String str = this.f68696j;
        if (str != null) {
            jSONObject3.put("countryCodeAlpha3", str);
        }
        if (jSONObject3.length() > 0) {
            jSONObject2.put("billingAddress", jSONObject3);
        }
        jSONObject.put("creditCard", jSONObject2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: e */
    public String mo2561e() {
        return "credit_cards";
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: i */
    public String mo2560i() {
        return "CreditCard";
    }

    @Override // p000.AbstractC48015rN3, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68694h);
        parcel.writeString(this.f68697k);
        parcel.writeString(this.f68698l);
        parcel.writeString(this.f68699m);
        parcel.writeString(this.f68693g);
        parcel.writeString(this.f68701o);
        parcel.writeString(this.f68702p);
        parcel.writeString(this.f68695i);
        parcel.writeString(this.f68696j);
        parcel.writeString(this.f68703q);
        parcel.writeString(this.f68704r);
        parcel.writeString(this.f68705s);
        parcel.writeString(this.f68706t);
        parcel.writeString(this.f68700n);
    }

    public BaseCardBuilder(Parcel parcel) {
        super(parcel);
        this.f68694h = parcel.readString();
        this.f68697k = parcel.readString();
        this.f68698l = parcel.readString();
        this.f68699m = parcel.readString();
        this.f68693g = parcel.readString();
        this.f68701o = parcel.readString();
        this.f68702p = parcel.readString();
        this.f68695i = parcel.readString();
        this.f68696j = parcel.readString();
        this.f68703q = parcel.readString();
        this.f68704r = parcel.readString();
        this.f68705s = parcel.readString();
        this.f68706t = parcel.readString();
        this.f68700n = parcel.readString();
    }
}
