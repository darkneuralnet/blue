package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Object> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new C17339a();
    @Deprecated

    /* renamed from: h */
    public final String f69819h;
    @Deprecated

    /* renamed from: i */
    public final String f69820i;
    @Deprecated

    /* renamed from: j */
    public final Uri f69821j;

    /* renamed from: k */
    public final String f69822k;

    /* renamed from: com.facebook.share.model.ShareLinkContent$a */
    /* loaded from: classes5.dex */
    public static class C17339a implements Parcelable.Creator<ShareLinkContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f69819h = parcel.readString();
        this.f69820i = parcel.readString();
        this.f69821j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69822k = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Deprecated
    /* renamed from: i */
    public String m52243i() {
        return this.f69819h;
    }

    @Deprecated
    /* renamed from: j */
    public String m52242j() {
        return this.f69820i;
    }

    @Deprecated
    /* renamed from: k */
    public Uri m52241k() {
        return this.f69821j;
    }

    /* renamed from: l */
    public String m52240l() {
        return this.f69822k;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69819h);
        parcel.writeString(this.f69820i);
        parcel.writeParcelable(this.f69821j, 0);
        parcel.writeString(this.f69822k);
    }
}
