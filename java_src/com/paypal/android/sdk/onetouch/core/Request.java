package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.paypal.android.sdk.onetouch.core.Request;
/* loaded from: classes6.dex */
public abstract class Request<T extends Request<T>> implements Parcelable {

    /* renamed from: b */
    public String f74990b;

    /* renamed from: c */
    public String f74991c;

    /* renamed from: d */
    public String f74992d;

    /* renamed from: e */
    public String f74993e;

    /* renamed from: f */
    public String f74994f;

    public Request() {
    }

    /* renamed from: o */
    public static String m45883o() {
        return "onetouch/v1/";
    }

    /* renamed from: a */
    public T m45896a(String str, String str2) {
        this.f74993e = str + "://" + m45883o() + str2;
        return this;
    }

    /* renamed from: b */
    public T m45895b(String str) {
        this.f74991c = str;
        return this;
    }

    /* renamed from: c */
    public T m45894c(String str) {
        this.f74992d = str;
        return this;
    }

    /* renamed from: d */
    public T m45893d(String str) {
        this.f74990b = str;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract AbstractC45348ms4 mo45892e(C36044Sy3 c36044Sy3);

    /* renamed from: g */
    public abstract String mo45891g();

    /* renamed from: h */
    public String m45890h() {
        return this.f74993e;
    }

    /* renamed from: i */
    public String m45889i() {
        return this.f74991c;
    }

    /* renamed from: j */
    public String m45888j() {
        return this.f74992d;
    }

    /* renamed from: k */
    public String m45887k() {
        return this.f74990b;
    }

    /* renamed from: l */
    public abstract AbstractC45348ms4 mo45886l(Context context, C36044Sy3 c36044Sy3);

    /* renamed from: m */
    public String m45885m() {
        return this.f74994f;
    }

    /* renamed from: n */
    public abstract Result mo45884n(Uri uri);

    /* renamed from: p */
    public T m45882p(String str, String str2) {
        this.f74994f = str + "://" + m45883o() + str2;
        return this;
    }

    /* renamed from: q */
    public abstract void mo45881q(Context context, EnumC45489n66 enumC45489n66, S94 s94);

    /* renamed from: r */
    public abstract boolean mo45880r(Bundle bundle);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74990b);
        parcel.writeString(this.f74991c);
        parcel.writeString(this.f74992d);
        parcel.writeString(this.f74993e);
        parcel.writeString(this.f74994f);
    }

    public Request(Parcel parcel) {
        this.f74990b = parcel.readString();
        this.f74991c = parcel.readString();
        this.f74992d = parcel.readString();
        this.f74993e = parcel.readString();
        this.f74994f = parcel.readString();
    }
}
