package com.facebook.share.model;

import android.os.Parcel;
@Deprecated
/* loaded from: classes5.dex */
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: b */
    public final String f69829b;

    public ShareMessengerActionButton(Parcel parcel) {
        this.f69829b = parcel.readString();
    }

    /* renamed from: a */
    public String m52229a() {
        return this.f69829b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69829b);
    }
}
