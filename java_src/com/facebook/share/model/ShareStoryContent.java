package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Object> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new C17360a();

    /* renamed from: h */
    public final ShareMedia f69873h;

    /* renamed from: i */
    public final SharePhoto f69874i;

    /* renamed from: j */
    public final List<String> f69875j;

    /* renamed from: k */
    public final String f69876k;

    /* renamed from: com.facebook.share.model.ShareStoryContent$a */
    /* loaded from: classes5.dex */
    public static class C17360a implements Parcelable.Creator<ShareStoryContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.f69873h = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f69874i = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.f69875j = m52150h(parcel);
        this.f69876k = parcel.readString();
    }

    /* renamed from: h */
    private List<String> m52150h(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public String m52149i() {
        return this.f69876k;
    }

    /* renamed from: j */
    public ShareMedia m52148j() {
        return this.f69873h;
    }

    /* renamed from: k */
    public List<String> m52147k() {
        List<String> list = this.f69875j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    /* renamed from: l */
    public SharePhoto m52146l() {
        return this.f69874i;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f69873h, 0);
        parcel.writeParcelable(this.f69874i, 0);
        parcel.writeStringList(this.f69875j);
        parcel.writeString(this.f69876k);
    }
}
