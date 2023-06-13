package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class ThreeDSecurePostalAddress implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecurePostalAddress> CREATOR = new C16995a();

    /* renamed from: b */
    public String f68892b;

    /* renamed from: c */
    public String f68893c;

    /* renamed from: d */
    public String f68894d;

    /* renamed from: e */
    public String f68895e;

    /* renamed from: f */
    public String f68896f;

    /* renamed from: g */
    public String f68897g;

    /* renamed from: h */
    public String f68898h;

    /* renamed from: i */
    public String f68899i;

    /* renamed from: j */
    public String f68900j;

    /* renamed from: k */
    public String f68901k;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecurePostalAddress$a */
    /* loaded from: classes2.dex */
    public static class C16995a implements Parcelable.Creator<ThreeDSecurePostalAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecurePostalAddress createFromParcel(Parcel parcel) {
            return new ThreeDSecurePostalAddress(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecurePostalAddress[] newArray(int i) {
            return new ThreeDSecurePostalAddress[i];
        }
    }

    public ThreeDSecurePostalAddress() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68892b);
        parcel.writeString(this.f68893c);
        parcel.writeString(this.f68894d);
        parcel.writeString(this.f68895e);
        parcel.writeString(this.f68896f);
        parcel.writeString(this.f68897g);
        parcel.writeString(this.f68898h);
        parcel.writeString(this.f68899i);
        parcel.writeString(this.f68900j);
        parcel.writeString(this.f68901k);
    }

    public ThreeDSecurePostalAddress(Parcel parcel) {
        this.f68892b = parcel.readString();
        this.f68893c = parcel.readString();
        this.f68894d = parcel.readString();
        this.f68895e = parcel.readString();
        this.f68896f = parcel.readString();
        this.f68897g = parcel.readString();
        this.f68898h = parcel.readString();
        this.f68899i = parcel.readString();
        this.f68900j = parcel.readString();
        this.f68901k = parcel.readString();
    }
}
