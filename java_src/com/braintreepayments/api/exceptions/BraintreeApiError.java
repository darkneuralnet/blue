package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class BraintreeApiError implements Parcelable {
    public static final Parcelable.Creator<BraintreeApiError> CREATOR = new C16967a();

    /* renamed from: b */
    public String f68662b;

    /* renamed from: c */
    public String f68663c;

    /* renamed from: d */
    public String f68664d;

    /* renamed from: e */
    public String f68665e;

    /* renamed from: com.braintreepayments.api.exceptions.BraintreeApiError$a */
    /* loaded from: classes2.dex */
    public static class C16967a implements Parcelable.Creator<BraintreeApiError> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BraintreeApiError createFromParcel(Parcel parcel) {
            return new BraintreeApiError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BraintreeApiError[] newArray(int i) {
            return new BraintreeApiError[i];
        }
    }

    public BraintreeApiError() {
    }

    /* renamed from: a */
    public static BraintreeApiError m53425a(JSONObject jSONObject) {
        BraintreeApiError braintreeApiError = new BraintreeApiError();
        braintreeApiError.f68662b = C39299ci2.m61029a(jSONObject, PaymentMethodOptionsParams.Blik.PARAM_CODE, null);
        braintreeApiError.f68663c = C39299ci2.m61029a(jSONObject, "developer_message", null);
        braintreeApiError.f68664d = C39299ci2.m61029a(jSONObject, "in", null);
        braintreeApiError.f68665e = C39299ci2.m61029a(jSONObject, "at", null);
        return braintreeApiError;
    }

    /* renamed from: b */
    public static List<BraintreeApiError> m53424b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m53425a(jSONArray.getJSONObject(i)));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "BraintreeApiError " + this.f68662b + " for " + this.f68664d + ": " + this.f68663c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68662b);
        parcel.writeString(this.f68663c);
        parcel.writeString(this.f68664d);
        parcel.writeString(this.f68665e);
    }

    public BraintreeApiError(Parcel parcel) {
        this.f68662b = parcel.readString();
        this.f68663c = parcel.readString();
        this.f68664d = parcel.readString();
        this.f68665e = parcel.readString();
    }
}
