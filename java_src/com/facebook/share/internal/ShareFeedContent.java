package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
/* loaded from: classes5.dex */
public class ShareFeedContent extends ShareContent<ShareFeedContent, Object> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new C17295a();

    /* renamed from: h */
    public final String f69681h;

    /* renamed from: i */
    public final String f69682i;

    /* renamed from: j */
    public final String f69683j;

    /* renamed from: k */
    public final String f69684k;

    /* renamed from: l */
    public final String f69685l;

    /* renamed from: m */
    public final String f69686m;

    /* renamed from: n */
    public final String f69687n;

    /* renamed from: com.facebook.share.internal.ShareFeedContent$a */
    /* loaded from: classes5.dex */
    public static class C17295a implements Parcelable.Creator<ShareFeedContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f69681h = parcel.readString();
        this.f69682i = parcel.readString();
        this.f69683j = parcel.readString();
        this.f69684k = parcel.readString();
        this.f69685l = parcel.readString();
        this.f69686m = parcel.readString();
        this.f69687n = parcel.readString();
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: i */
    public String m52387i() {
        return this.f69682i;
    }

    /* renamed from: j */
    public String m52386j() {
        return this.f69684k;
    }

    /* renamed from: k */
    public String m52385k() {
        return this.f69685l;
    }

    /* renamed from: l */
    public String m52384l() {
        return this.f69683j;
    }

    /* renamed from: m */
    public String m52383m() {
        return this.f69687n;
    }

    /* renamed from: n */
    public String m52382n() {
        return this.f69686m;
    }

    /* renamed from: o */
    public String m52381o() {
        return this.f69681h;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f69681h);
        parcel.writeString(this.f69682i);
        parcel.writeString(this.f69683j);
        parcel.writeString(this.f69684k);
        parcel.writeString(this.f69685l);
        parcel.writeString(this.f69686m);
        parcel.writeString(this.f69687n);
    }
}
