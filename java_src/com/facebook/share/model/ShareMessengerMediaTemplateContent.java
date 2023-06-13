package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new C17346a();

    /* renamed from: h */
    public final EnumC17347b f69841h;

    /* renamed from: i */
    public final String f69842i;

    /* renamed from: j */
    public final Uri f69843j;

    /* renamed from: k */
    public final ShareMessengerActionButton f69844k;

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$a */
    /* loaded from: classes5.dex */
    public static class C17346a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerMediaTemplateContent$b */
    /* loaded from: classes5.dex */
    public enum EnumC17347b {
        IMAGE,
        VIDEO
    }

    public ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f69841h = (EnumC17347b) parcel.readSerializable();
        this.f69842i = parcel.readString();
        this.f69843j = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69844k = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public String m52216i() {
        return this.f69842i;
    }

    /* renamed from: j */
    public ShareMessengerActionButton m52215j() {
        return this.f69844k;
    }

    /* renamed from: k */
    public EnumC17347b m52214k() {
        return this.f69841h;
    }

    /* renamed from: l */
    public Uri m52213l() {
        return this.f69843j;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f69841h);
        parcel.writeString(this.f69842i);
        parcel.writeParcelable(this.f69843j, i);
        parcel.writeParcelable(this.f69844k, i);
    }
}
