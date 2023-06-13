package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
/* loaded from: classes2.dex */
public class TokenizationKey extends Authorization {
    public static final Parcelable.Creator<TokenizationKey> CREATOR = new C16998a();

    /* renamed from: c */
    public final String f68918c;

    /* renamed from: d */
    public final String f68919d;

    /* renamed from: e */
    public final String f68920e;

    /* renamed from: com.braintreepayments.api.models.TokenizationKey$a */
    /* loaded from: classes2.dex */
    public static class C16998a implements Parcelable.Creator<TokenizationKey> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TokenizationKey createFromParcel(Parcel parcel) {
            return new TokenizationKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TokenizationKey[] newArray(int i) {
            return new TokenizationKey[i];
        }
    }

    /* renamed from: com.braintreepayments.api.models.TokenizationKey$b */
    /* loaded from: classes2.dex */
    public enum EnumC16999b {
        DEVELOPMENT("development", "http://10.0.2.2:3000/"),
        SANDBOX("sandbox", "https://api.sandbox.braintreegateway.com/"),
        PRODUCTION("production", "https://api.braintreegateway.com/");
        

        /* renamed from: b */
        public String f68925b;

        /* renamed from: c */
        public String f68926c;

        EnumC16999b(String str, String str2) {
            this.f68925b = str;
            this.f68926c = str2;
        }

        /* renamed from: a */
        public static String m53275a(String str) throws InvalidArgumentException {
            EnumC16999b[] values;
            for (EnumC16999b enumC16999b : values()) {
                if (enumC16999b.f68925b.equals(str)) {
                    return enumC16999b.f68926c;
                }
            }
            throw new InvalidArgumentException("Tokenization Key contained invalid environment");
        }
    }

    public TokenizationKey(String str) throws InvalidArgumentException {
        super(str);
        String[] split = str.split("_", 3);
        String str2 = split[0];
        this.f68918c = str2;
        String str3 = split[2];
        this.f68919d = str3;
        this.f68920e = EnumC16999b.m53275a(str2) + "merchants/" + str3 + "/client_api/";
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: b */
    public String mo53279b() {
        return toString();
    }

    @Override // com.braintreepayments.api.models.Authorization
    /* renamed from: c */
    public String mo53278c() {
        return this.f68920e + "v1/configuration";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.braintreepayments.api.models.Authorization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f68918c);
        parcel.writeString(this.f68919d);
        parcel.writeString(this.f68920e);
    }

    public TokenizationKey(Parcel parcel) {
        super(parcel);
        this.f68918c = parcel.readString();
        this.f68919d = parcel.readString();
        this.f68920e = parcel.readString();
    }
}
