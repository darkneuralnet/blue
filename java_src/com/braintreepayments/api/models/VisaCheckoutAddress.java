package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VisaCheckoutAddress implements Parcelable {
    public static final Parcelable.Creator<VisaCheckoutAddress> CREATOR = new C17003a();

    /* renamed from: b */
    public String f68936b;

    /* renamed from: c */
    public String f68937c;

    /* renamed from: d */
    public String f68938d;

    /* renamed from: e */
    public String f68939e;

    /* renamed from: f */
    public String f68940f;

    /* renamed from: g */
    public String f68941g;

    /* renamed from: h */
    public String f68942h;

    /* renamed from: i */
    public String f68943i;

    /* renamed from: j */
    public String f68944j;

    /* renamed from: com.braintreepayments.api.models.VisaCheckoutAddress$a */
    /* loaded from: classes2.dex */
    public static class C17003a implements Parcelable.Creator<VisaCheckoutAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VisaCheckoutAddress createFromParcel(Parcel parcel) {
            return new VisaCheckoutAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VisaCheckoutAddress[] newArray(int i) {
            return new VisaCheckoutAddress[i];
        }
    }

    public VisaCheckoutAddress() {
    }

    /* renamed from: a */
    public static VisaCheckoutAddress m53267a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        VisaCheckoutAddress visaCheckoutAddress = new VisaCheckoutAddress();
        visaCheckoutAddress.f68936b = C39299ci2.m61029a(jSONObject, "firstName", "");
        visaCheckoutAddress.f68937c = C39299ci2.m61029a(jSONObject, "lastName", "");
        visaCheckoutAddress.f68938d = C39299ci2.m61029a(jSONObject, "streetAddress", "");
        visaCheckoutAddress.f68939e = C39299ci2.m61029a(jSONObject, "extendedAddress", "");
        visaCheckoutAddress.f68940f = C39299ci2.m61029a(jSONObject, "locality", "");
        visaCheckoutAddress.f68941g = C39299ci2.m61029a(jSONObject, "region", "");
        visaCheckoutAddress.f68942h = C39299ci2.m61029a(jSONObject, "postalCode", "");
        visaCheckoutAddress.f68943i = C39299ci2.m61029a(jSONObject, "countryCode", "");
        visaCheckoutAddress.f68944j = C39299ci2.m61029a(jSONObject, "phoneNumber", "");
        return visaCheckoutAddress;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68936b);
        parcel.writeString(this.f68937c);
        parcel.writeString(this.f68938d);
        parcel.writeString(this.f68939e);
        parcel.writeString(this.f68940f);
        parcel.writeString(this.f68941g);
        parcel.writeString(this.f68942h);
        parcel.writeString(this.f68943i);
        parcel.writeString(this.f68944j);
    }

    public VisaCheckoutAddress(Parcel parcel) {
        this.f68936b = parcel.readString();
        this.f68937c = parcel.readString();
        this.f68938d = parcel.readString();
        this.f68939e = parcel.readString();
        this.f68940f = parcel.readString();
        this.f68941g = parcel.readString();
        this.f68942h = parcel.readString();
        this.f68943i = parcel.readString();
        this.f68944j = parcel.readString();
    }
}
