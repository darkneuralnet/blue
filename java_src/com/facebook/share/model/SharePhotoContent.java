package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, C17359b> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new C17358a();

    /* renamed from: h */
    public final List<SharePhoto> f69871h;

    /* renamed from: com.facebook.share.model.SharePhotoContent$a */
    /* loaded from: classes5.dex */
    public static class C17358a implements Parcelable.Creator<SharePhotoContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhotoContent$b */
    /* loaded from: classes5.dex */
    public static class C17359b extends ShareContent.AbstractC17336a<SharePhotoContent, C17359b> {

        /* renamed from: g */
        public final List<SharePhoto> f69872g = new ArrayList();

        /* renamed from: o */
        public C17359b m52155o(SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.f69872g.add(new SharePhoto.C17357b().m52165m(sharePhoto).m52169i());
            }
            return this;
        }

        /* renamed from: p */
        public C17359b m52154p(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto sharePhoto : list) {
                    m52155o(sharePhoto);
                }
            }
            return this;
        }

        /* renamed from: q */
        public SharePhotoContent m52153q() {
            return new SharePhotoContent(this, null);
        }

        /* renamed from: r */
        public C17359b m52152r(SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((C17359b) super.m52258g(sharePhotoContent)).m52154p(sharePhotoContent.getPhotos());
        }

        /* renamed from: s */
        public C17359b m52151s(List<SharePhoto> list) {
            this.f69872g.clear();
            m52154p(list);
            return this;
        }
    }

    public /* synthetic */ SharePhotoContent(C17359b c17359b, C17358a c17358a) {
        this(c17359b);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<SharePhoto> getPhotos() {
        return this.f69871h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SharePhoto.C17357b.m52159s(parcel, i, this.f69871h);
    }

    public SharePhotoContent(C17359b c17359b) {
        super(c17359b);
        this.f69871h = Collections.unmodifiableList(c17359b.f69872g);
    }

    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        this.f69871h = Collections.unmodifiableList(SharePhoto.C17357b.m52164n(parcel));
    }
}
