package com.paypal.android.sdk.onetouch.core;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.stripe.android.model.PaymentMethodOptionsParams;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class Result implements Parcelable {
    public static final Parcelable.Creator<Result> CREATOR = new C18575a();

    /* renamed from: h */
    public static final String f74995h = "Result";

    /* renamed from: b */
    public final String f74996b;

    /* renamed from: c */
    public final EnumC42679iN4 f74997c;

    /* renamed from: d */
    public final LM4 f74998d;

    /* renamed from: e */
    public final JSONObject f74999e;

    /* renamed from: f */
    public final String f75000f;

    /* renamed from: g */
    public final Throwable f75001g;

    /* renamed from: com.paypal.android.sdk.onetouch.core.Result$a */
    /* loaded from: classes6.dex */
    public static class C18575a implements Parcelable.Creator<Result> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Result createFromParcel(Parcel parcel) {
            return new Result(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Result[] newArray(int i) {
            return new Result[i];
        }
    }

    public /* synthetic */ Result(Parcel parcel, C18575a c18575a) {
        this(parcel);
    }

    /* renamed from: a */
    public Throwable m45879a() {
        return this.f75001g;
    }

    /* renamed from: b */
    public JSONObject m45878b() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("environment", this.f74996b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT, jSONObject);
            JSONObject jSONObject3 = this.f74999e;
            if (jSONObject3 != null) {
                jSONObject2.put("response", jSONObject3);
            }
            LM4 lm4 = this.f74998d;
            if (lm4 != null) {
                jSONObject2.put("response_type", lm4.name());
            }
            if (this.f75000f != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("display_string", this.f75000f);
                jSONObject2.put("user", jSONObject4);
            }
            return jSONObject2;
        } catch (JSONException e) {
            Log.e(f74995h, "Error encoding JSON", e);
            return null;
        }
    }

    /* renamed from: c */
    public EnumC42679iN4 m45877c() {
        return this.f74997c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        parcel.writeString(this.f74996b);
        parcel.writeSerializable(this.f74997c);
        parcel.writeSerializable(this.f74998d);
        JSONObject jSONObject2 = this.f74999e;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        parcel.writeString(jSONObject);
        parcel.writeString(this.f75000f);
        parcel.writeSerializable(this.f75001g);
    }

    public Result(String str, LM4 lm4, JSONObject jSONObject, String str2) {
        this(EnumC42679iN4.Success, str, lm4, jSONObject, str2, null);
    }

    public Result(Throwable th) {
        this(EnumC42679iN4.Error, null, null, null, null, th);
    }

    public Result() {
        this(EnumC42679iN4.Cancel, null, null, null, null, null);
    }

    public Result(EnumC42679iN4 enumC42679iN4, String str, LM4 lm4, JSONObject jSONObject, String str2, Throwable th) {
        this.f74996b = str;
        this.f74997c = enumC42679iN4;
        this.f74998d = lm4;
        this.f74999e = jSONObject;
        this.f75000f = str2;
        this.f75001g = th;
    }

    public Result(Parcel parcel) {
        this.f74996b = parcel.readString();
        this.f74997c = (EnumC42679iN4) parcel.readSerializable();
        this.f74998d = (LM4) parcel.readSerializable();
        JSONObject jSONObject = null;
        try {
            String readString = parcel.readString();
            if (readString != null) {
                jSONObject = new JSONObject(readString);
            }
        } catch (JSONException e) {
            Log.e(f74995h, "Failed to read parceled JSON for mResponse", e);
        }
        this.f74999e = jSONObject;
        this.f75000f = parcel.readString();
        this.f75001g = (Throwable) parcel.readSerializable();
    }
}
