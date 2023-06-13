package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class PayPalProductAttributes implements Parcelable {
    public static final Parcelable.Creator<PayPalProductAttributes> CREATOR = new C16986a();

    /* renamed from: b */
    public String f68781b;

    /* renamed from: c */
    public String f68782c;

    /* renamed from: d */
    public String f68783d;

    /* renamed from: com.braintreepayments.api.models.PayPalProductAttributes$a */
    /* loaded from: classes2.dex */
    public static class C16986a implements Parcelable.Creator<PayPalProductAttributes> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalProductAttributes createFromParcel(Parcel parcel) {
            return new PayPalProductAttributes(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalProductAttributes[] newArray(int i) {
            return new PayPalProductAttributes[i];
        }
    }

    public /* synthetic */ PayPalProductAttributes(Parcel parcel, C16986a c16986a) {
        this(parcel);
    }

    /* renamed from: a */
    public String m53356a() {
        return this.f68781b;
    }

    /* renamed from: b */
    public String m53355b() {
        return this.f68782c;
    }

    /* renamed from: c */
    public String m53354c() {
        return this.f68783d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68781b);
        parcel.writeString(this.f68782c);
        parcel.writeString(this.f68783d);
    }

    public PayPalProductAttributes() {
    }

    public PayPalProductAttributes(Parcel parcel) {
        this.f68781b = parcel.readString();
        this.f68782c = parcel.readString();
        this.f68783d = parcel.readString();
    }
}
