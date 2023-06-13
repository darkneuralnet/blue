package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class AppInviteContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<AppInviteContent> CREATOR = new C17327a();

    /* renamed from: b */
    public final String f69775b;

    /* renamed from: c */
    public final String f69776c;

    /* renamed from: d */
    public final String f69777d;

    /* renamed from: e */
    public final String f69778e;

    /* renamed from: f */
    public final EnumC20094ej f69779f;

    /* renamed from: com.facebook.share.model.AppInviteContent$a */
    /* loaded from: classes5.dex */
    public static class C17327a implements Parcelable.Creator<AppInviteContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AppInviteContent createFromParcel(Parcel parcel) {
            return new AppInviteContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AppInviteContent[] newArray(int i) {
            return new AppInviteContent[i];
        }
    }

    @Deprecated
    public AppInviteContent(Parcel parcel) {
        this.f69775b = parcel.readString();
        this.f69776c = parcel.readString();
        this.f69778e = parcel.readString();
        this.f69777d = parcel.readString();
        String readString = parcel.readString();
        if (readString.length() > 0) {
            this.f69779f = EnumC20094ej.valueOf(readString);
        } else {
            this.f69779f = EnumC20094ej.FACEBOOK;
        }
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69775b);
        parcel.writeString(this.f69776c);
        parcel.writeString(this.f69778e);
        parcel.writeString(this.f69777d);
        parcel.writeString(this.f69779f.toString());
    }
}
