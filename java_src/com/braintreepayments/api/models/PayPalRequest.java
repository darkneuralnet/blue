package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.paypal.android.sdk.onetouch.core.PayPalLineItem;
import java.util.ArrayList;
/* loaded from: classes2.dex */
public class PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalRequest> CREATOR = new C16987a();

    /* renamed from: b */
    public String f68784b;

    /* renamed from: c */
    public String f68785c;

    /* renamed from: d */
    public String f68786d;

    /* renamed from: e */
    public String f68787e;

    /* renamed from: f */
    public boolean f68788f;

    /* renamed from: g */
    public boolean f68789g;

    /* renamed from: h */
    public PostalAddress f68790h;

    /* renamed from: i */
    public String f68791i;

    /* renamed from: j */
    public String f68792j;

    /* renamed from: k */
    public String f68793k;

    /* renamed from: l */
    public String f68794l;

    /* renamed from: m */
    public boolean f68795m;

    /* renamed from: n */
    public boolean f68796n;

    /* renamed from: o */
    public String f68797o;

    /* renamed from: p */
    public PayPalProductAttributes f68798p;

    /* renamed from: q */
    public ArrayList<PayPalLineItem> f68799q;

    /* renamed from: com.braintreepayments.api.models.PayPalRequest$a */
    /* loaded from: classes2.dex */
    public static class C16987a implements Parcelable.Creator<PayPalRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public PayPalRequest createFromParcel(Parcel parcel) {
            return new PayPalRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public PayPalRequest[] newArray(int i) {
            return new PayPalRequest[i];
        }
    }

    public PayPalRequest() {
        this.f68789g = false;
        this.f68791i = "authorize";
        this.f68793k = "";
        this.f68799q = new ArrayList<>();
        this.f68784b = null;
        this.f68788f = false;
        this.f68795m = false;
        this.f68796n = false;
    }

    /* renamed from: a */
    public String m53351a() {
        return this.f68784b;
    }

    /* renamed from: b */
    public String m53350b() {
        return this.f68787e;
    }

    /* renamed from: c */
    public String m53349c() {
        return this.f68785c;
    }

    /* renamed from: d */
    public String m53348d() {
        return this.f68794l;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m53347e() {
        return this.f68791i;
    }

    /* renamed from: g */
    public String m53346g() {
        return this.f68792j;
    }

    /* renamed from: h */
    public ArrayList<PayPalLineItem> m53345h() {
        return this.f68799q;
    }

    /* renamed from: i */
    public String m53344i() {
        return this.f68786d;
    }

    /* renamed from: j */
    public String m53343j() {
        return this.f68797o;
    }

    /* renamed from: k */
    public PayPalProductAttributes m53342k() {
        return this.f68798p;
    }

    /* renamed from: l */
    public PostalAddress m53341l() {
        return this.f68790h;
    }

    /* renamed from: m */
    public String m53340m() {
        return this.f68793k;
    }

    /* renamed from: n */
    public boolean m53339n() {
        return this.f68789g;
    }

    /* renamed from: o */
    public boolean m53338o() {
        return this.f68788f;
    }

    /* renamed from: p */
    public boolean m53337p() {
        return this.f68795m;
    }

    /* renamed from: q */
    public boolean m53336q() {
        return this.f68796n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68784b);
        parcel.writeString(this.f68785c);
        parcel.writeString(this.f68786d);
        parcel.writeString(this.f68787e);
        parcel.writeByte(this.f68788f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68789g ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f68790h, i);
        parcel.writeString(this.f68791i);
        parcel.writeString(this.f68792j);
        parcel.writeString(this.f68793k);
        parcel.writeString(this.f68794l);
        parcel.writeByte(this.f68795m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68796n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68797o);
        parcel.writeList(this.f68799q);
        parcel.writeParcelable(this.f68798p, i);
    }

    public PayPalRequest(Parcel parcel) {
        this.f68789g = false;
        this.f68791i = "authorize";
        this.f68793k = "";
        this.f68799q = new ArrayList<>();
        this.f68784b = parcel.readString();
        this.f68785c = parcel.readString();
        this.f68786d = parcel.readString();
        this.f68787e = parcel.readString();
        this.f68788f = parcel.readByte() > 0;
        this.f68789g = parcel.readByte() > 0;
        this.f68790h = (PostalAddress) parcel.readParcelable(PostalAddress.class.getClassLoader());
        this.f68791i = parcel.readString();
        this.f68792j = parcel.readString();
        this.f68793k = parcel.readString();
        this.f68794l = parcel.readString();
        this.f68795m = parcel.readByte() > 0;
        this.f68796n = parcel.readByte() > 0;
        this.f68797o = parcel.readString();
        this.f68799q = parcel.readArrayList(PayPalLineItem.class.getClassLoader());
        this.f68798p = (PayPalProductAttributes) parcel.readParcelable(PayPalProductAttributes.class.getClassLoader());
    }
}
