package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class BinData implements Parcelable {
    public static final Parcelable.Creator<BinData> CREATOR = new C16975a();

    /* renamed from: b */
    public String f68707b;

    /* renamed from: c */
    public String f68708c;

    /* renamed from: d */
    public String f68709d;

    /* renamed from: e */
    public String f68710e;

    /* renamed from: f */
    public String f68711f;

    /* renamed from: g */
    public String f68712g;

    /* renamed from: h */
    public String f68713h;

    /* renamed from: i */
    public String f68714i;

    /* renamed from: j */
    public String f68715j;

    /* renamed from: com.braintreepayments.api.models.BinData$a */
    /* loaded from: classes2.dex */
    public static class C16975a implements Parcelable.Creator<BinData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BinData createFromParcel(Parcel parcel) {
            return new BinData(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BinData[] newArray(int i) {
            return new BinData[i];
        }
    }

    public /* synthetic */ BinData(Parcel parcel, C16975a c16975a) {
        this(parcel);
    }

    /* renamed from: a */
    public static String m53394a(JSONObject jSONObject, String str) {
        if (jSONObject.has(str) && jSONObject.isNull(str)) {
            return "Unknown";
        }
        return C39299ci2.m61029a(jSONObject, str, "");
    }

    /* renamed from: b */
    public static BinData m53393b(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        BinData binData = new BinData();
        binData.f68707b = C39299ci2.m61029a(jSONObject, "prepaid", "Unknown");
        binData.f68708c = C39299ci2.m61029a(jSONObject, "healthcare", "Unknown");
        binData.f68709d = C39299ci2.m61029a(jSONObject, "debit", "Unknown");
        binData.f68710e = C39299ci2.m61029a(jSONObject, "durbinRegulated", "Unknown");
        binData.f68711f = C39299ci2.m61029a(jSONObject, "commercial", "Unknown");
        binData.f68712g = C39299ci2.m61029a(jSONObject, "payroll", "Unknown");
        binData.f68713h = m53394a(jSONObject, "issuingBank");
        binData.f68714i = m53394a(jSONObject, "countryOfIssuance");
        binData.f68715j = m53394a(jSONObject, "productId");
        return binData;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68707b);
        parcel.writeString(this.f68708c);
        parcel.writeString(this.f68709d);
        parcel.writeString(this.f68710e);
        parcel.writeString(this.f68711f);
        parcel.writeString(this.f68712g);
        parcel.writeString(this.f68713h);
        parcel.writeString(this.f68714i);
        parcel.writeString(this.f68715j);
    }

    public BinData() {
    }

    public BinData(Parcel parcel) {
        this.f68707b = parcel.readString();
        this.f68708c = parcel.readString();
        this.f68709d = parcel.readString();
        this.f68710e = parcel.readString();
        this.f68711f = parcel.readString();
        this.f68712g = parcel.readString();
        this.f68713h = parcel.readString();
        this.f68714i = parcel.readString();
        this.f68715j = parcel.readString();
    }
}
