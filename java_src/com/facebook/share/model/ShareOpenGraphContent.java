package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareOpenGraphAction;
/* loaded from: classes5.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, Object> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new C17353a();

    /* renamed from: h */
    public final ShareOpenGraphAction f69859h;

    /* renamed from: i */
    public final String f69860i;

    /* renamed from: com.facebook.share.model.ShareOpenGraphContent$a */
    /* loaded from: classes5.dex */
    public static class C17353a implements Parcelable.Creator<ShareOpenGraphContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    public ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        this.f69859h = new ShareOpenGraphAction.C17352b().m52195e(parcel).m52196d();
        this.f69860i = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public ShareOpenGraphAction m52192i() {
        return this.f69859h;
    }

    /* renamed from: j */
    public String m52191j() {
        return this.f69860i;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f69859h, 0);
        parcel.writeString(this.f69860i);
    }
}
