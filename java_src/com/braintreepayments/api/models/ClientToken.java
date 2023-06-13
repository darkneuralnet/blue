package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class ClientToken extends Authorization {
    public static final Parcelable.Creator<ClientToken> CREATOR = new C16979a();

    /* renamed from: c */
    public String f68728c;

    /* renamed from: d */
    public String f68729d;

    /* renamed from: com.braintreepayments.api.models.ClientToken$a */
    /* loaded from: classes2.dex */
    public static class C16979a implements Parcelable.Creator<ClientToken> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ClientToken createFromParcel(Parcel parcel) {
            return new ClientToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ClientToken[] newArray(int i) {
            return new ClientToken[i];
        }
    }

    public ClientToken(String str) throws InvalidArgumentException {
        super(str);
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(str, 0)));
            this.f68728c = jSONObject.getString("configUrl");
            this.f68729d = jSONObject.getString("authorizationFingerprint");
        } catch (NullPointerException | JSONException unused) {
            throw new InvalidArgumentException("Client token was invalid");
        }
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: b */
    public String mo53279b() {
        return this.f68729d;
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: c */
    public String mo53278c() {
        return this.f68728c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: h */
    public String m53380h() {
        return this.f68729d;
    }

    @Override // com.braintreepayments.api.models.Authorization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68728c);
        parcel.writeString(this.f68729d);
    }

    public ClientToken(Parcel parcel) {
        super(parcel);
        this.f68728c = parcel.readString();
        this.f68729d = parcel.readString();
    }
}
