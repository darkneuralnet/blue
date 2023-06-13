package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes5.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Object> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new C17342a();

    /* renamed from: h */
    public final List<ShareMedia> f69828h;

    /* renamed from: com.facebook.share.model.ShareMediaContent$a */
    /* loaded from: classes5.dex */
    public static class C17342a implements Parcelable.Creator<ShareMediaContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f69828h = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public List<ShareMedia> m52232i() {
        return this.f69828h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f69828h.toArray(), i);
    }
}
