package com.paypal.android.sdk.onetouch.core;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public class PayPalLineItem implements Parcelable {
    public static final Parcelable.Creator<PayPalLineItem> CREATOR = new C18574a();

    /* renamed from: b */
    public String f74982b;

    /* renamed from: c */
    public String f74983c;

    /* renamed from: d */
    public String f74984d;

    /* renamed from: e */
    public String f74985e;

    /* renamed from: f */
    public String f74986f;

    /* renamed from: g */
    public String f74987g;

    /* renamed from: h */
    public String f74988h;

    /* renamed from: i */
    public String f74989i;

    /* renamed from: com.paypal.android.sdk.onetouch.core.PayPalLineItem$a */
    /* loaded from: classes6.dex */
    public static class C18574a implements Parcelable.Creator<PayPalLineItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalLineItem createFromParcel(Parcel parcel) {
            return new PayPalLineItem(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalLineItem[] newArray(int i) {
            return new PayPalLineItem[i];
        }
    }

    public /* synthetic */ PayPalLineItem(Parcel parcel, C18574a c18574a) {
        this(parcel);
    }

    /* renamed from: a */
    public JSONObject m45899a() {
        try {
            return new JSONObject().putOpt("description", this.f74982b).putOpt("kind", this.f74983c).putOpt("name", this.f74984d).putOpt("product_code", this.f74985e).putOpt("quantity", this.f74986f).putOpt("unit_amount", this.f74987g).putOpt("unit_tax_amount", this.f74988h).putOpt("url", this.f74989i);
        } catch (JSONException unused) {
            return new JSONObject();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74982b);
        parcel.writeString(this.f74983c);
        parcel.writeString(this.f74984d);
        parcel.writeString(this.f74985e);
        parcel.writeString(this.f74986f);
        parcel.writeString(this.f74987g);
        parcel.writeString(this.f74988h);
        parcel.writeString(this.f74989i);
    }

    public PayPalLineItem(Parcel parcel) {
        this.f74982b = parcel.readString();
        this.f74983c = parcel.readString();
        this.f74984d = parcel.readString();
        this.f74985e = parcel.readString();
        this.f74986f = parcel.readString();
        this.f74987g = parcel.readString();
        this.f74988h = parcel.readString();
        this.f74989i = parcel.readString();
    }
}
