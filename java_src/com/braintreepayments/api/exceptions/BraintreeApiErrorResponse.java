package com.braintreepayments.api.exceptions;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class BraintreeApiErrorResponse extends Exception implements Parcelable {
    public static final Parcelable.Creator<BraintreeApiErrorResponse> CREATOR = new C16968a();

    /* renamed from: b */
    public String f68666b;

    /* renamed from: c */
    public String f68667c;

    /* renamed from: d */
    public List<BraintreeApiError> f68668d;

    /* renamed from: com.braintreepayments.api.exceptions.BraintreeApiErrorResponse$a */
    /* loaded from: classes2.dex */
    public static class C16968a implements Parcelable.Creator<BraintreeApiErrorResponse> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public BraintreeApiErrorResponse createFromParcel(Parcel parcel) {
            return new BraintreeApiErrorResponse(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public BraintreeApiErrorResponse[] newArray(int i) {
            return new BraintreeApiErrorResponse[i];
        }
    }

    public BraintreeApiErrorResponse(String str) {
        this.f68667c = str;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject("error");
            this.f68666b = C39299ci2.m61029a(jSONObject, "developer_message", "No message was returned");
            this.f68668d = BraintreeApiError.m53424b(jSONObject.optJSONArray("details"));
        } catch (JSONException unused) {
            this.f68666b = "Parsing error response failed";
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f68666b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68666b);
        parcel.writeString(this.f68667c);
        parcel.writeTypedList(this.f68668d);
    }

    public BraintreeApiErrorResponse(Parcel parcel) {
        this.f68666b = parcel.readString();
        this.f68667c = parcel.readString();
        this.f68668d = parcel.createTypedArrayList(BraintreeApiError.CREATOR);
    }
}
