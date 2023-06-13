package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes5.dex */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, Object> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new C17354a();

    /* renamed from: com.facebook.share.model.ShareOpenGraphObject$a */
    /* loaded from: classes5.dex */
    public static class C17354a implements Parcelable.Creator<ShareOpenGraphObject> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareOpenGraphObject[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }
    }

    public ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
