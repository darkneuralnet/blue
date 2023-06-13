package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ThreeDSecureInfo implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureInfo> CREATOR = new C16993a();

    /* renamed from: b */
    public String f68865b;

    /* renamed from: c */
    public String f68866c;

    /* renamed from: d */
    public String f68867d;

    /* renamed from: e */
    public String f68868e;

    /* renamed from: f */
    public boolean f68869f;

    /* renamed from: g */
    public boolean f68870g;

    /* renamed from: h */
    public String f68871h;

    /* renamed from: i */
    public ThreeDSecureAuthenticationResponse f68872i;

    /* renamed from: j */
    public String f68873j;

    /* renamed from: k */
    public boolean f68874k;

    /* renamed from: l */
    public String f68875l;

    /* renamed from: m */
    public String f68876m;

    /* renamed from: n */
    public String f68877n;

    /* renamed from: o */
    public String f68878o;

    /* renamed from: p */
    public String f68879p;

    /* renamed from: q */
    public String f68880q;

    /* renamed from: r */
    public String f68881r;

    /* renamed from: s */
    public String f68882s;

    /* renamed from: t */
    public String f68883t;

    /* renamed from: u */
    public String f68884u;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureInfo$a */
    /* loaded from: classes2.dex */
    public static class C16993a implements Parcelable.Creator<ThreeDSecureInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureInfo createFromParcel(Parcel parcel) {
            return new ThreeDSecureInfo(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureInfo[] newArray(int i) {
            return new ThreeDSecureInfo[i];
        }
    }

    public /* synthetic */ ThreeDSecureInfo(Parcel parcel, C16993a c16993a) {
        this(parcel);
    }

    /* renamed from: a */
    public static ThreeDSecureInfo m53297a(JSONObject jSONObject) {
        boolean z;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        ThreeDSecureInfo threeDSecureInfo = new ThreeDSecureInfo();
        threeDSecureInfo.f68865b = jSONObject.optString("cavv");
        threeDSecureInfo.f68866c = jSONObject.optString("dsTransactionId");
        threeDSecureInfo.f68867d = jSONObject.optString("eciFlag");
        threeDSecureInfo.f68868e = jSONObject.optString("enrolled");
        threeDSecureInfo.f68869f = jSONObject.optBoolean("liabilityShifted");
        threeDSecureInfo.f68870g = jSONObject.optBoolean("liabilityShiftPossible");
        threeDSecureInfo.f68871h = jSONObject.optString("status");
        threeDSecureInfo.f68873j = jSONObject.optString("threeDSecureVersion");
        if (jSONObject.has("liabilityShifted") && jSONObject.has("liabilityShiftPossible")) {
            z = true;
        } else {
            z = false;
        }
        threeDSecureInfo.f68874k = z;
        threeDSecureInfo.f68875l = jSONObject.optString("xid");
        threeDSecureInfo.f68876m = jSONObject.optString("acsTransactionId");
        threeDSecureInfo.f68877n = jSONObject.optString("threeDSecureAuthenticationId");
        threeDSecureInfo.f68878o = jSONObject.optString("threeDSecureServerTransactionId");
        threeDSecureInfo.f68879p = jSONObject.optString("paresStatus");
        JSONObject optJSONObject = jSONObject.optJSONObject("authentication");
        if (optJSONObject != null) {
            threeDSecureInfo.f68880q = optJSONObject.optString("transStatus");
            threeDSecureInfo.f68881r = optJSONObject.optString("transStatusReason");
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("lookup");
        if (optJSONObject2 != null) {
            threeDSecureInfo.f68882s = optJSONObject2.optString("transStatus");
            threeDSecureInfo.f68883t = optJSONObject2.optString("transStatusReason");
        }
        return threeDSecureInfo;
    }

    /* renamed from: b */
    public boolean m53296b() {
        return this.f68870g;
    }

    /* renamed from: c */
    public boolean m53295c() {
        return this.f68869f;
    }

    /* renamed from: d */
    public void m53294d(String str) {
        this.f68884u = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void m53293e(ThreeDSecureAuthenticationResponse threeDSecureAuthenticationResponse) {
        this.f68872i = threeDSecureAuthenticationResponse;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68865b);
        parcel.writeString(this.f68866c);
        parcel.writeString(this.f68867d);
        parcel.writeString(this.f68868e);
        parcel.writeByte(this.f68869f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68870g ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68871h);
        parcel.writeString(this.f68873j);
        parcel.writeByte(this.f68874k ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68875l);
        parcel.writeString(this.f68880q);
        parcel.writeString(this.f68881r);
        parcel.writeString(this.f68882s);
        parcel.writeString(this.f68883t);
        parcel.writeString(this.f68877n);
    }

    public ThreeDSecureInfo() {
    }

    public ThreeDSecureInfo(Parcel parcel) {
        this.f68865b = parcel.readString();
        this.f68866c = parcel.readString();
        this.f68867d = parcel.readString();
        this.f68868e = parcel.readString();
        this.f68869f = parcel.readByte() != 0;
        this.f68870g = parcel.readByte() != 0;
        this.f68871h = parcel.readString();
        this.f68873j = parcel.readString();
        this.f68874k = parcel.readByte() != 0;
        this.f68875l = parcel.readString();
        this.f68880q = parcel.readString();
        this.f68881r = parcel.readString();
        this.f68882s = parcel.readString();
        this.f68883t = parcel.readString();
        this.f68877n = parcel.readString();
    }
}
