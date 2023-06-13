package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
/* loaded from: classes5.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Object> {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new C17363a();

    /* renamed from: h */
    public final String f69879h;

    /* renamed from: i */
    public final String f69880i;

    /* renamed from: j */
    public final SharePhoto f69881j;

    /* renamed from: k */
    public final ShareVideo f69882k;

    /* renamed from: com.facebook.share.model.ShareVideoContent$a */
    /* loaded from: classes5.dex */
    public static class C17363a implements Parcelable.Creator<ShareVideoContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f69879h = parcel.readString();
        this.f69880i = parcel.readString();
        SharePhoto.C17357b m52166l = new SharePhoto.C17357b().m52166l(parcel);
        if (m52166l.m52167k() == null && m52166l.m52168j() == null) {
            this.f69881j = null;
        } else {
            this.f69881j = m52166l.m52169i();
        }
        this.f69882k = new ShareVideo.C17362b().m52137g(parcel).m52138f();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public String m52134i() {
        return this.f69879h;
    }

    /* renamed from: j */
    public String m52133j() {
        return this.f69880i;
    }

    /* renamed from: k */
    public SharePhoto m52132k() {
        return this.f69881j;
    }

    /* renamed from: l */
    public ShareVideo m52131l() {
        return this.f69882k;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69879h);
        parcel.writeString(this.f69880i);
        parcel.writeParcelable(this.f69881j, 0);
        parcel.writeParcelable(this.f69882k, 0);
    }
}
