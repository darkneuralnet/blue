package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new C17356a();

    /* renamed from: c */
    public final Bitmap f69863c;

    /* renamed from: d */
    public final Uri f69864d;

    /* renamed from: e */
    public final boolean f69865e;

    /* renamed from: f */
    public final String f69866f;

    /* renamed from: com.facebook.share.model.SharePhoto$a */
    /* loaded from: classes5.dex */
    public static class C17356a implements Parcelable.Creator<SharePhoto> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* renamed from: com.facebook.share.model.SharePhoto$b */
    /* loaded from: classes5.dex */
    public static final class C17357b extends ShareMedia.AbstractC17340a<SharePhoto, C17357b> {

        /* renamed from: b */
        public Bitmap f69867b;

        /* renamed from: c */
        public Uri f69868c;

        /* renamed from: d */
        public boolean f69869d;

        /* renamed from: e */
        public String f69870e;

        /* renamed from: n */
        public static List<SharePhoto> m52164n(Parcel parcel) {
            List<ShareMedia> m52234c = ShareMedia.AbstractC17340a.m52234c(parcel);
            ArrayList arrayList = new ArrayList();
            for (ShareMedia shareMedia : m52234c) {
                if (shareMedia instanceof SharePhoto) {
                    arrayList.add((SharePhoto) shareMedia);
                }
            }
            return arrayList;
        }

        /* renamed from: s */
        public static void m52159s(Parcel parcel, int i, List<SharePhoto> list) {
            ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                shareMediaArr[i2] = list.get(i2);
            }
            parcel.writeParcelableArray(shareMediaArr, i);
        }

        /* renamed from: i */
        public SharePhoto m52169i() {
            return new SharePhoto(this, null);
        }

        /* renamed from: j */
        public Bitmap m52168j() {
            return this.f69867b;
        }

        /* renamed from: k */
        public Uri m52167k() {
            return this.f69868c;
        }

        /* renamed from: l */
        public C17357b m52166l(Parcel parcel) {
            return m52165m((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        /* renamed from: m */
        public C17357b m52165m(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            return ((C17357b) super.m52235b(sharePhoto)).m52163o(sharePhoto.m52179c()).m52161q(sharePhoto.m52177e()).m52160r(sharePhoto.m52176g()).m52162p(sharePhoto.m52178d());
        }

        /* renamed from: o */
        public C17357b m52163o(Bitmap bitmap) {
            this.f69867b = bitmap;
            return this;
        }

        /* renamed from: p */
        public C17357b m52162p(String str) {
            this.f69870e = str;
            return this;
        }

        /* renamed from: q */
        public C17357b m52161q(Uri uri) {
            this.f69868c = uri;
            return this;
        }

        /* renamed from: r */
        public C17357b m52160r(boolean z) {
            this.f69869d = z;
            return this;
        }
    }

    public /* synthetic */ SharePhoto(C17357b c17357b, C17356a c17356a) {
        this(c17357b);
    }

    @Override // com.facebook.share.model.ShareMedia
    /* renamed from: a */
    public ShareMedia.EnumC17341b mo52143a() {
        return ShareMedia.EnumC17341b.PHOTO;
    }

    /* renamed from: c */
    public Bitmap m52179c() {
        return this.f69863c;
    }

    /* renamed from: d */
    public String m52178d() {
        return this.f69866f;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Uri m52177e() {
        return this.f69864d;
    }

    /* renamed from: g */
    public boolean m52176g() {
        return this.f69865e;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f69863c, 0);
        parcel.writeParcelable(this.f69864d, 0);
        parcel.writeByte(this.f69865e ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f69866f);
    }

    public SharePhoto(C17357b c17357b) {
        super(c17357b);
        this.f69863c = c17357b.f69867b;
        this.f69864d = c17357b.f69868c;
        this.f69865e = c17357b.f69869d;
        this.f69866f = c17357b.f69870e;
    }

    public SharePhoto(Parcel parcel) {
        super(parcel);
        this.f69863c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f69864d = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69865e = parcel.readByte() != 0;
        this.f69866f = parcel.readString();
    }
}
