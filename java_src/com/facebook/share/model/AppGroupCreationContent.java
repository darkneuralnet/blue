package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C17325a();

    /* renamed from: b */
    public final String f69769b;

    /* renamed from: c */
    public final String f69770c;

    /* renamed from: d */
    public EnumC17326b f69771d;

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    /* loaded from: classes5.dex */
    public static class C17325a implements Parcelable.Creator<AppGroupCreationContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AppGroupCreationContent createFromParcel(Parcel parcel) {
            return new AppGroupCreationContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$b */
    /* loaded from: classes5.dex */
    public enum EnumC17326b {
        Open,
        Closed
    }

    public AppGroupCreationContent(Parcel parcel) {
        this.f69769b = parcel.readString();
        this.f69770c = parcel.readString();
        this.f69771d = (EnumC17326b) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69769b);
        parcel.writeString(this.f69770c);
        parcel.writeSerializable(this.f69771d);
    }
}
