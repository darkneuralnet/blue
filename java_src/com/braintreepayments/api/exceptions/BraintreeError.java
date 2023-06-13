package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class BraintreeError implements Parcelable {
    public static final Parcelable.Creator<BraintreeError> CREATOR = new C16969a();

    /* renamed from: b */
    public String f68669b;

    /* renamed from: c */
    public String f68670c;

    /* renamed from: d */
    public List<BraintreeError> f68671d;

    /* renamed from: com.braintreepayments.api.exceptions.BraintreeError$a */
    /* loaded from: classes2.dex */
    public static class C16969a implements Parcelable.Creator<BraintreeError> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BraintreeError createFromParcel(Parcel parcel) {
            return new BraintreeError(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BraintreeError[] newArray(int i) {
            return new BraintreeError[i];
        }
    }

    public BraintreeError() {
    }

    /* renamed from: a */
    public static void m53419a(List<String> list, JSONObject jSONObject, List<BraintreeError> list2) throws JSONException {
        String str = list.get(0);
        if (list.size() == 1) {
            BraintreeError braintreeError = new BraintreeError();
            braintreeError.f68669b = str;
            braintreeError.f68670c = jSONObject.getString("message");
            braintreeError.f68671d = new ArrayList();
            list2.add(braintreeError);
            return;
        }
        List<String> subList = list.subList(1, list.size());
        BraintreeError braintreeError2 = null;
        for (BraintreeError braintreeError3 : list2) {
            if (braintreeError3.f68669b.equals(str)) {
                braintreeError2 = braintreeError3;
            }
        }
        if (braintreeError2 == null) {
            braintreeError2 = new BraintreeError();
            braintreeError2.f68669b = str;
            braintreeError2.f68671d = new ArrayList();
            list2.add(braintreeError2);
        }
        m53419a(subList, jSONObject, braintreeError2.f68671d);
    }

    /* renamed from: b */
    public static List<BraintreeError> m53418b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                JSONObject optJSONObject = jSONObject.optJSONObject("extensions");
                if (optJSONObject != null && "user_error".equals(optJSONObject.optString("errorType"))) {
                    ArrayList arrayList2 = new ArrayList();
                    JSONArray jSONArray2 = optJSONObject.getJSONArray("inputPath");
                    for (int i2 = 1; i2 < jSONArray2.length(); i2++) {
                        arrayList2.add(jSONArray2.getString(i2));
                    }
                    m53419a(arrayList2, jSONObject, arrayList);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static BraintreeError m53417c(JSONObject jSONObject) {
        BraintreeError braintreeError = new BraintreeError();
        braintreeError.f68669b = C39299ci2.m61029a(jSONObject, "field", null);
        braintreeError.f68670c = C39299ci2.m61029a(jSONObject, "message", null);
        braintreeError.f68671d = m53416d(jSONObject.optJSONArray("fieldErrors"));
        return braintreeError;
    }

    /* renamed from: d */
    public static List<BraintreeError> m53416d(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(m53417c(jSONArray.getJSONObject(i)));
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
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("BraintreeError for ");
        sb.append(this.f68669b);
        sb.append(": ");
        sb.append(this.f68670c);
        sb.append(" -> ");
        List<BraintreeError> list = this.f68671d;
        if (list != null) {
            str = list.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68669b);
        parcel.writeString(this.f68670c);
        parcel.writeTypedList(this.f68671d);
    }

    public BraintreeError(Parcel parcel) {
        this.f68669b = parcel.readString();
        this.f68670c = parcel.readString();
        this.f68671d = parcel.createTypedArrayList(CREATOR);
    }
}
