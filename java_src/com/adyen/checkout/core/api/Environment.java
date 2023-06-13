package com.adyen.checkout.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.core.exception.CheckoutException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
/* loaded from: classes.dex */
public final class Environment implements Parcelable {
    public static final Parcelable.Creator<Environment> CREATOR = new C16844a();

    /* renamed from: c */
    public static final Environment f68430c;

    /* renamed from: d */
    public static final Environment f68431d;

    /* renamed from: e */
    public static final Environment f68432e;

    /* renamed from: f */
    public static final Environment f68433f;

    /* renamed from: b */
    public final URL f68434b;

    /* renamed from: com.adyen.checkout.core.api.Environment$a */
    /* loaded from: classes.dex */
    public static class C16844a implements Parcelable.Creator<Environment> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Environment createFromParcel(Parcel parcel) {
            return new Environment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Environment[] newArray(int i) {
            return new Environment[i];
        }
    }

    static {
        try {
            f68430c = new Environment(new URL("https://checkoutshopper-test.adyen.com/checkoutshopper/"));
            f68431d = new Environment(new URL("https://checkoutshopper-live.adyen.com/checkoutshopper/"));
            f68432e = new Environment(new URL("https://checkoutshopper-live-us.adyen.com/checkoutshopper/"));
            f68433f = new Environment(new URL("https://checkoutshopper-live-au.adyen.com/checkoutshopper/"));
        } catch (MalformedURLException e) {
            throw new CheckoutException("Failed to parse Environment URL.", e);
        }
    }

    public Environment(URL url) {
        this.f68434b = url;
    }

    /* renamed from: a */
    public String m53575a() {
        return this.f68434b.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Environment.class == obj.getClass()) {
            return this.f68434b.toString().equals(((Environment) obj).toString());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f68434b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f68434b);
    }

    public Environment(Parcel parcel) {
        this.f68434b = (URL) parcel.readSerializable();
    }
}
