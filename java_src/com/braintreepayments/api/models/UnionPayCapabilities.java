package com.braintreepayments.api.models;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2.dex */
public class UnionPayCapabilities implements Parcelable {
    public static final Parcelable.Creator<UnionPayCapabilities> CREATOR = new C17000a();

    /* renamed from: b */
    public boolean f68927b;

    /* renamed from: c */
    public boolean f68928c;

    /* renamed from: d */
    public boolean f68929d;

    /* renamed from: e */
    public boolean f68930e;

    /* renamed from: com.braintreepayments.api.models.UnionPayCapabilities$a */
    /* loaded from: classes2.dex */
    public static class C17000a implements Parcelable.Creator<UnionPayCapabilities> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UnionPayCapabilities createFromParcel(Parcel parcel) {
            return new UnionPayCapabilities(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public UnionPayCapabilities[] newArray(int i) {
            return new UnionPayCapabilities[i];
        }
    }

    private UnionPayCapabilities() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f68927b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68928c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68929d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68930e ? (byte) 1 : (byte) 0);
    }

    public UnionPayCapabilities(Parcel parcel) {
        this.f68927b = parcel.readByte() > 0;
        this.f68928c = parcel.readByte() > 0;
        this.f68929d = parcel.readByte() > 0;
        this.f68930e = parcel.readByte() > 0;
    }
}
