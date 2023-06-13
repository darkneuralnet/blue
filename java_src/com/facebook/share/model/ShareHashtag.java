package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new C17337a();

    /* renamed from: b */
    public final String f69817b;

    /* renamed from: com.facebook.share.model.ShareHashtag$a */
    /* loaded from: classes5.dex */
    public static class C17337a implements Parcelable.Creator<ShareHashtag> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareHashtag$b */
    /* loaded from: classes5.dex */
    public static class C17338b {

        /* renamed from: a */
        public String f69818a;

        /* renamed from: b */
        public ShareHashtag m52247b() {
            return new ShareHashtag(this, null);
        }

        /* renamed from: c */
        public C17338b m52246c(Parcel parcel) {
            return m52245d((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        /* renamed from: d */
        public C17338b m52245d(ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : m52244e(shareHashtag.m52251a());
        }

        /* renamed from: e */
        public C17338b m52244e(String str) {
            this.f69818a = str;
            return this;
        }
    }

    public /* synthetic */ ShareHashtag(C17338b c17338b, C17337a c17337a) {
        this(c17338b);
    }

    /* renamed from: a */
    public String m52251a() {
        return this.f69817b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69817b);
    }

    public ShareHashtag(C17338b c17338b) {
        this.f69817b = c17338b.f69818a;
    }

    public ShareHashtag(Parcel parcel) {
        this.f69817b = parcel.readString();
    }
}
