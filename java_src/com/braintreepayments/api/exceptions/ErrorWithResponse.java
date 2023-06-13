package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ErrorWithResponse extends Exception implements Parcelable {
    public static final Parcelable.Creator<ErrorWithResponse> CREATOR = new C16970a();

    /* renamed from: b */
    public int f68672b;

    /* renamed from: c */
    public String f68673c;

    /* renamed from: d */
    public String f68674d;

    /* renamed from: e */
    public List<BraintreeError> f68675e;

    /* renamed from: com.braintreepayments.api.exceptions.ErrorWithResponse$a */
    /* loaded from: classes2.dex */
    public static class C16970a implements Parcelable.Creator<ErrorWithResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ErrorWithResponse createFromParcel(Parcel parcel) {
            return new ErrorWithResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ErrorWithResponse[] newArray(int i) {
            return new ErrorWithResponse[i];
        }
    }

    public ErrorWithResponse(int i, String str) {
        this.f68672b = i;
        this.f68674d = str;
        try {
            m53410d(str);
        } catch (JSONException unused) {
            this.f68673c = "Parsing error response failed";
            this.f68675e = new ArrayList();
        }
    }

    /* renamed from: a */
    public static ErrorWithResponse m53413a(String str) {
        ErrorWithResponse errorWithResponse = new ErrorWithResponse();
        errorWithResponse.f68674d = str;
        errorWithResponse.f68672b = 422;
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("errors");
            List<BraintreeError> m53418b = BraintreeError.m53418b(jSONArray);
            errorWithResponse.f68675e = m53418b;
            if (m53418b.isEmpty()) {
                errorWithResponse.f68673c = jSONArray.getJSONObject(0).getString("message");
            } else {
                errorWithResponse.f68673c = "Input is invalid.";
            }
        } catch (JSONException unused) {
            errorWithResponse.f68673c = "Parsing error response failed";
            errorWithResponse.f68675e = new ArrayList();
        }
        return errorWithResponse;
    }

    /* renamed from: b */
    public static ErrorWithResponse m53412b(String str) throws JSONException {
        ErrorWithResponse errorWithResponse = new ErrorWithResponse();
        errorWithResponse.f68674d = str;
        errorWithResponse.m53410d(str);
        return errorWithResponse;
    }

    /* renamed from: c */
    public String m53411c() {
        return this.f68674d;
    }

    /* renamed from: d */
    public final void m53410d(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        this.f68673c = jSONObject.getJSONObject("error").getString("message");
        this.f68675e = BraintreeError.m53416d(jSONObject.optJSONArray("fieldErrors"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f68673c;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "ErrorWithResponse (" + this.f68672b + "): " + this.f68673c + "\n" + this.f68675e.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68672b);
        parcel.writeString(this.f68673c);
        parcel.writeString(this.f68674d);
        parcel.writeTypedList(this.f68675e);
    }

    private ErrorWithResponse() {
    }

    public ErrorWithResponse(Parcel parcel) {
        this.f68672b = parcel.readInt();
        this.f68673c = parcel.readString();
        this.f68674d = parcel.readString();
        this.f68675e = parcel.createTypedArrayList(BraintreeError.CREATOR);
    }
}
