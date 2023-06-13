package com.braintreepayments.api.models;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class UnionPayCardBuilder extends BaseCardBuilder<UnionPayCardBuilder> {
    public static final Parcelable.Creator<UnionPayCardBuilder> CREATOR = new C17001a();

    /* renamed from: u */
    public String f68931u;

    /* renamed from: v */
    public String f68932v;

    /* renamed from: w */
    public String f68933w;

    /* renamed from: x */
    public String f68934x;

    /* renamed from: com.braintreepayments.api.models.UnionPayCardBuilder$a */
    /* loaded from: classes2.dex */
    public static class C17001a implements Parcelable.Creator<UnionPayCardBuilder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UnionPayCardBuilder createFromParcel(Parcel parcel) {
            return new UnionPayCardBuilder(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UnionPayCardBuilder[] newArray(int i) {
            return new UnionPayCardBuilder[i];
        }
    }

    public UnionPayCardBuilder() {
    }

    @Override // com.braintreepayments.api.models.BaseCardBuilder, p000.AbstractC48015rN3
    /* renamed from: b */
    public void mo2563b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        super.mo2563b(jSONObject, jSONObject2);
        JSONObject optJSONObject = jSONObject2.optJSONObject("options");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
            jSONObject2.put("options", optJSONObject);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("smsCode", this.f68933w);
        jSONObject3.put("id", this.f68934x);
        optJSONObject.put("unionPayEnrollment", jSONObject3);
        jSONObject.put("creditCard", jSONObject2);
    }

    @Override // p000.AbstractC48015rN3
    /* renamed from: d */
    public void mo2562d(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
    }

    @Override // com.braintreepayments.api.models.BaseCardBuilder, p000.AbstractC48015rN3, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68931u);
        parcel.writeString(this.f68932v);
        parcel.writeString(this.f68933w);
        parcel.writeString(this.f68934x);
    }

    public UnionPayCardBuilder(Parcel parcel) {
        super(parcel);
        this.f68931u = parcel.readString();
        this.f68932v = parcel.readString();
        this.f68933w = parcel.readString();
        this.f68934x = parcel.readString();
    }
}
