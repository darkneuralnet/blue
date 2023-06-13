package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class ThreeDSecureLookup implements Parcelable {
    public static final Parcelable.Creator<ThreeDSecureLookup> CREATOR = new C16994a();

    /* renamed from: b */
    public CardNonce f68885b;

    /* renamed from: c */
    public String f68886c;

    /* renamed from: d */
    public String f68887d;

    /* renamed from: e */
    public String f68888e;

    /* renamed from: f */
    public String f68889f;

    /* renamed from: g */
    public String f68890g;

    /* renamed from: h */
    public String f68891h;

    /* renamed from: com.braintreepayments.api.models.ThreeDSecureLookup$a */
    /* loaded from: classes2.dex */
    public static class C16994a implements Parcelable.Creator<ThreeDSecureLookup> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ThreeDSecureLookup createFromParcel(Parcel parcel) {
            return new ThreeDSecureLookup(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ThreeDSecureLookup[] newArray(int i) {
            return new ThreeDSecureLookup[i];
        }
    }

    public /* synthetic */ ThreeDSecureLookup(Parcel parcel, C16994a c16994a) {
        this(parcel);
    }

    /* renamed from: a */
    public CardNonce m53290a() {
        return this.f68885b;
    }

    /* renamed from: b */
    public String m53289b() {
        return this.f68889f;
    }

    /* renamed from: c */
    public String m53288c() {
        return this.f68891h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f68885b, i);
        parcel.writeString(this.f68886c);
        parcel.writeString(this.f68887d);
        parcel.writeString(this.f68888e);
        parcel.writeString(this.f68889f);
        parcel.writeString(this.f68890g);
        parcel.writeString(this.f68891h);
    }

    public ThreeDSecureLookup() {
    }

    public ThreeDSecureLookup(Parcel parcel) {
        this.f68885b = (CardNonce) parcel.readParcelable(CardNonce.class.getClassLoader());
        this.f68886c = parcel.readString();
        this.f68887d = parcel.readString();
        this.f68888e = parcel.readString();
        this.f68889f = parcel.readString();
        this.f68890g = parcel.readString();
        this.f68891h = parcel.readString();
    }
}
