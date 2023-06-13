package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
/* loaded from: classes5.dex */
public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new C17361a();

    /* renamed from: c */
    public final Uri f69877c;

    /* renamed from: com.facebook.share.model.ShareVideo$a */
    /* loaded from: classes5.dex */
    public static class C17361a implements Parcelable.Creator<ShareVideo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareVideo$b */
    /* loaded from: classes5.dex */
    public static final class C17362b extends ShareMedia.AbstractC17340a<ShareVideo, C17362b> {

        /* renamed from: b */
        public Uri f69878b;

        /* renamed from: f */
        public ShareVideo m52138f() {
            return new ShareVideo(this, null);
        }

        /* renamed from: g */
        public C17362b m52137g(Parcel parcel) {
            return m52136h((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        /* renamed from: h */
        public C17362b m52136h(ShareVideo shareVideo) {
            return shareVideo == null ? this : ((C17362b) super.m52235b(shareVideo)).m52135i(shareVideo.m52142c());
        }

        /* renamed from: i */
        public C17362b m52135i(Uri uri) {
            this.f69878b = uri;
            return this;
        }
    }

    public /* synthetic */ ShareVideo(C17362b c17362b, C17361a c17361a) {
        this(c17362b);
    }

    @Override // com.facebook.share.model.ShareMedia
    /* renamed from: a */
    public ShareMedia.EnumC17341b mo52143a() {
        return ShareMedia.EnumC17341b.VIDEO;
    }

    /* renamed from: c */
    public Uri m52142c() {
        return this.f69877c;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f69877c, 0);
    }

    public ShareVideo(C17362b c17362b) {
        super(c17362b);
        this.f69877c = c17362b.f69878b;
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.f69877c = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
