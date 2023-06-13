package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
/* loaded from: classes2.dex */
public abstract class Authorization implements Parcelable {

    /* renamed from: b */
    public final String f68692b;

    public Authorization(String str) {
        this.f68692b = str;
    }

    /* renamed from: a */
    public static Authorization m53398a(String str) throws InvalidArgumentException {
        if (m53395g(str)) {
            return new TokenizationKey(str);
        }
        if (m53396e(str)) {
            return new PayPalUAT(str);
        }
        if (m53397d(str)) {
            return new ClientToken(str);
        }
        throw new InvalidArgumentException("Authorization provided is invalid: " + str);
    }

    /* renamed from: d */
    public static boolean m53397d(String str) {
        return !TextUtils.isEmpty(str) && str.matches("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)");
    }

    /* renamed from: e */
    public static boolean m53396e(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[a-zA-Z0-9]+\\.[a-zA-Z0-9]+\\.[a-zA-Z0-9_-]+$");
    }

    @Deprecated
    /* renamed from: g */
    public static boolean m53395g(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[a-zA-Z0-9]+_[a-zA-Z0-9]+_[a-zA-Z0-9_]+$");
    }

    /* renamed from: b */
    public abstract String mo53279b();

    /* renamed from: c */
    public abstract String mo53278c();

    public String toString() {
        return this.f68692b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68692b);
    }

    public Authorization(Parcel parcel) {
        this.f68692b = parcel.readString();
    }
}
