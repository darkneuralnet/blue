package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class VisaCheckoutUserData implements Parcelable {
    public static final Parcelable.Creator<VisaCheckoutUserData> CREATOR = new C17005a();

    /* renamed from: b */
    public String f68952b;

    /* renamed from: c */
    public String f68953c;

    /* renamed from: d */
    public String f68954d;

    /* renamed from: e */
    public String f68955e;

    /* renamed from: f */
    public String f68956f;

    /* renamed from: com.braintreepayments.api.models.VisaCheckoutUserData$a */
    /* loaded from: classes2.dex */
    public static class C17005a implements Parcelable.Creator<VisaCheckoutUserData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VisaCheckoutUserData createFromParcel(Parcel parcel) {
            return new VisaCheckoutUserData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VisaCheckoutUserData[] newArray(int i) {
            return new VisaCheckoutUserData[i];
        }
    }

    public VisaCheckoutUserData() {
    }

    /* renamed from: a */
    public static VisaCheckoutUserData m53260a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        VisaCheckoutUserData visaCheckoutUserData = new VisaCheckoutUserData();
        visaCheckoutUserData.f68952b = C39299ci2.m61029a(jSONObject, "userFirstName", "");
        visaCheckoutUserData.f68953c = C39299ci2.m61029a(jSONObject, "userLastName", "");
        visaCheckoutUserData.f68954d = C39299ci2.m61029a(jSONObject, "userFullName", "");
        visaCheckoutUserData.f68955e = C39299ci2.m61029a(jSONObject, "userName", "");
        visaCheckoutUserData.f68956f = C39299ci2.m61029a(jSONObject, "userEmail", "");
        return visaCheckoutUserData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68952b);
        parcel.writeString(this.f68953c);
        parcel.writeString(this.f68954d);
        parcel.writeString(this.f68955e);
        parcel.writeString(this.f68956f);
    }

    public VisaCheckoutUserData(Parcel parcel) {
        this.f68952b = parcel.readString();
        this.f68953c = parcel.readString();
        this.f68954d = parcel.readString();
        this.f68955e = parcel.readString();
        this.f68956f = parcel.readString();
    }
}
