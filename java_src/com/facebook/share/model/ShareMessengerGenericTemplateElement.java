package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class ShareMessengerGenericTemplateElement implements ShareModel {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new C17345a();

    /* renamed from: b */
    public final String f69836b;

    /* renamed from: c */
    public final String f69837c;

    /* renamed from: d */
    public final Uri f69838d;

    /* renamed from: e */
    public final ShareMessengerActionButton f69839e;

    /* renamed from: f */
    public final ShareMessengerActionButton f69840f;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateElement$a */
    /* loaded from: classes5.dex */
    public static class C17345a implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    public ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f69836b = parcel.readString();
        this.f69837c = parcel.readString();
        this.f69838d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69839e = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f69840f = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    /* renamed from: a */
    public ShareMessengerActionButton m52223a() {
        return this.f69840f;
    }

    /* renamed from: b */
    public ShareMessengerActionButton m52222b() {
        return this.f69839e;
    }

    /* renamed from: c */
    public Uri m52221c() {
        return this.f69838d;
    }

    /* renamed from: d */
    public String m52220d() {
        return this.f69837c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m52219e() {
        return this.f69836b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69836b);
        parcel.writeString(this.f69837c);
        parcel.writeParcelable(this.f69838d, i);
        parcel.writeParcelable(this.f69839e, i);
        parcel.writeParcelable(this.f69840f, i);
    }
}
