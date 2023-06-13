package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new C17348a();

    /* renamed from: h */
    public final Uri f69848h;

    /* renamed from: i */
    public final ShareMessengerActionButton f69849i;

    /* renamed from: com.facebook.share.model.ShareMessengerOpenGraphMusicTemplateContent$a */
    /* loaded from: classes5.dex */
    public static class C17348a implements Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    }

    public ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f69848h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69849i = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public ShareMessengerActionButton m52210i() {
        return this.f69849i;
    }

    /* renamed from: j */
    public Uri m52209j() {
        return this.f69848h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f69848h, i);
        parcel.writeParcelable(this.f69849i, i);
    }
}
