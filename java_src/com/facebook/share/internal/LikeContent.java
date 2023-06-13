package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
@Deprecated
/* loaded from: classes5.dex */
public class LikeContent implements ShareModel {
    @Deprecated
    public static final Parcelable.Creator<LikeContent> CREATOR = new C17293a();

    /* renamed from: b */
    public final String f69677b;

    /* renamed from: c */
    public final String f69678c;

    /* renamed from: com.facebook.share.internal.LikeContent$a */
    /* loaded from: classes5.dex */
    public static class C17293a implements Parcelable.Creator<LikeContent> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public LikeContent createFromParcel(Parcel parcel) {
            return new LikeContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public LikeContent[] newArray(int i) {
            return new LikeContent[i];
        }
    }

    @Deprecated
    /* renamed from: com.facebook.share.internal.LikeContent$b */
    /* loaded from: classes5.dex */
    public static class C17294b {

        /* renamed from: a */
        public String f69679a;

        /* renamed from: b */
        public String f69680b;

        @Deprecated
        /* renamed from: c */
        public LikeContent m52390c() {
            return new LikeContent(this, null);
        }

        @Deprecated
        /* renamed from: d */
        public C17294b m52389d(String str) {
            this.f69679a = str;
            return this;
        }

        @Deprecated
        /* renamed from: e */
        public C17294b m52388e(String str) {
            this.f69680b = str;
            return this;
        }
    }

    public /* synthetic */ LikeContent(C17294b c17294b, C17293a c17293a) {
        this(c17294b);
    }

    @Deprecated
    /* renamed from: a */
    public String m52396a() {
        return this.f69677b;
    }

    @Deprecated
    /* renamed from: b */
    public String m52395b() {
        return this.f69678c;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f69677b);
        parcel.writeString(this.f69678c);
    }

    public LikeContent(C17294b c17294b) {
        this.f69677b = c17294b.f69679a;
        this.f69678c = c17294b.f69680b;
    }

    @Deprecated
    public LikeContent(Parcel parcel) {
        this.f69677b = parcel.readString();
        this.f69678c = parcel.readString();
    }
}
