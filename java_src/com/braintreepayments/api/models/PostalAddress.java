package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class PostalAddress implements Parcelable {
    public static final Parcelable.Creator<PostalAddress> CREATOR = new C16990a();

    /* renamed from: b */
    public String f68812b;

    /* renamed from: c */
    public String f68813c;

    /* renamed from: d */
    public String f68814d;

    /* renamed from: e */
    public String f68815e;

    /* renamed from: f */
    public String f68816f;

    /* renamed from: g */
    public String f68817g;

    /* renamed from: h */
    public String f68818h;

    /* renamed from: i */
    public String f68819i;

    /* renamed from: j */
    public String f68820j;

    /* renamed from: com.braintreepayments.api.models.PostalAddress$a */
    /* loaded from: classes2.dex */
    public static class C16990a implements Parcelable.Creator<PostalAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PostalAddress createFromParcel(Parcel parcel) {
            return new PostalAddress(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PostalAddress[] newArray(int i) {
            return new PostalAddress[i];
        }
    }

    public /* synthetic */ PostalAddress(Parcel parcel, C16990a c16990a) {
        this(parcel);
    }

    /* renamed from: a */
    public PostalAddress m53324a(String str) {
        this.f68820j = str;
        return this;
    }

    /* renamed from: b */
    public PostalAddress m53323b(String str) {
        this.f68815e = str;
        return this;
    }

    /* renamed from: c */
    public String m53322c() {
        return this.f68820j;
    }

    /* renamed from: d */
    public String m53321d() {
        return this.f68815e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m53320e() {
        return this.f68816f;
    }

    /* renamed from: g */
    public String m53319g() {
        return this.f68818h;
    }

    /* renamed from: h */
    public String m53318h() {
        return this.f68812b;
    }

    /* renamed from: i */
    public String m53317i() {
        return this.f68817g;
    }

    /* renamed from: j */
    public String m53316j() {
        return this.f68814d;
    }

    /* renamed from: k */
    public PostalAddress m53315k(String str) {
        this.f68816f = str;
        return this;
    }

    /* renamed from: l */
    public PostalAddress m53314l(String str) {
        this.f68813c = str;
        return this;
    }

    /* renamed from: m */
    public PostalAddress m53313m(String str) {
        this.f68818h = str;
        return this;
    }

    /* renamed from: n */
    public PostalAddress m53312n(String str) {
        this.f68812b = str;
        return this;
    }

    /* renamed from: o */
    public PostalAddress m53311o(String str) {
        this.f68817g = str;
        return this;
    }

    /* renamed from: p */
    public PostalAddress m53310p(String str) {
        this.f68819i = str;
        return this;
    }

    /* renamed from: q */
    public PostalAddress m53309q(String str) {
        this.f68814d = str;
        return this;
    }

    public String toString() {
        return String.format("%s\n%s\n%s\n%s, %s\n%s %s", this.f68812b, this.f68814d, this.f68815e, this.f68816f, this.f68817g, this.f68818h, this.f68820j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68814d);
        parcel.writeString(this.f68815e);
        parcel.writeString(this.f68816f);
        parcel.writeString(this.f68817g);
        parcel.writeString(this.f68818h);
        parcel.writeString(this.f68820j);
        parcel.writeString(this.f68812b);
        parcel.writeString(this.f68813c);
        parcel.writeString(this.f68819i);
    }

    public PostalAddress() {
    }

    public PostalAddress(Parcel parcel) {
        this.f68814d = parcel.readString();
        this.f68815e = parcel.readString();
        this.f68816f = parcel.readString();
        this.f68817g = parcel.readString();
        this.f68818h = parcel.readString();
        this.f68820j = parcel.readString();
        this.f68812b = parcel.readString();
        this.f68813c = parcel.readString();
        this.f68819i = parcel.readString();
    }
}
