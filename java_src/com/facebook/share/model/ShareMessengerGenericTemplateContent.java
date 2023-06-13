package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
@Deprecated
/* loaded from: classes5.dex */
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, Object> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new C17343a();

    /* renamed from: h */
    public final boolean f69830h;

    /* renamed from: i */
    public final EnumC17344b f69831i;

    /* renamed from: j */
    public final ShareMessengerGenericTemplateElement f69832j;

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$a */
    /* loaded from: classes5.dex */
    public static class C17343a implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    /* renamed from: com.facebook.share.model.ShareMessengerGenericTemplateContent$b */
    /* loaded from: classes5.dex */
    public enum EnumC17344b {
        HORIZONTAL,
        SQUARE
    }

    public ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f69830h = z;
        this.f69831i = (EnumC17344b) parcel.readSerializable();
        this.f69832j = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public ShareMessengerGenericTemplateElement m52228i() {
        return this.f69832j;
    }

    /* renamed from: j */
    public EnumC17344b m52227j() {
        return this.f69831i;
    }

    /* renamed from: k */
    public boolean m52226k() {
        return this.f69830h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f69830h ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f69831i);
        parcel.writeParcelable(this.f69832j, i);
    }
}
