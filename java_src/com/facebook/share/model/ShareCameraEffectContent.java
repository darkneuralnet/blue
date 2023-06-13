package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.CameraEffectArguments;
import com.facebook.share.model.CameraEffectTextures;
/* loaded from: classes5.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, Object> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new C17335a();

    /* renamed from: h */
    public String f69802h;

    /* renamed from: i */
    public CameraEffectArguments f69803i;

    /* renamed from: j */
    public CameraEffectTextures f69804j;

    /* renamed from: com.facebook.share.model.ShareCameraEffectContent$a */
    /* loaded from: classes5.dex */
    public static class C17335a implements Parcelable.Creator<ShareCameraEffectContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f69802h = parcel.readString();
        this.f69803i = new CameraEffectArguments.C17329b().m52290c(parcel).m52291b();
        this.f69804j = new CameraEffectTextures.C17331b().m52280c(parcel).m52281b();
    }

    /* renamed from: i */
    public CameraEffectArguments m52276i() {
        return this.f69803i;
    }

    /* renamed from: j */
    public String m52275j() {
        return this.f69802h;
    }

    /* renamed from: k */
    public CameraEffectTextures m52274k() {
        return this.f69804j;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69802h);
        parcel.writeParcelable(this.f69803i, 0);
        parcel.writeParcelable(this.f69804j, 0);
    }
}
