package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class ShareMedia implements ShareModel {

    /* renamed from: b */
    public final Bundle f69823b;

    /* renamed from: com.facebook.share.model.ShareMedia$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17340a<M extends ShareMedia, B extends AbstractC17340a> {

        /* renamed from: a */
        public Bundle f69824a = new Bundle();

        /* renamed from: c */
        public static List<ShareMedia> m52234c(Parcel parcel) {
            Parcelable[] readParcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
            ArrayList arrayList = new ArrayList(readParcelableArray.length);
            for (Parcelable parcelable : readParcelableArray) {
                arrayList.add((ShareMedia) parcelable);
            }
            return arrayList;
        }

        /* renamed from: b */
        public B m52235b(M m) {
            return m == null ? this : m52233d(m.m52237b());
        }

        @Deprecated
        /* renamed from: d */
        public B m52233d(Bundle bundle) {
            this.f69824a.putAll(bundle);
            return this;
        }
    }

    /* renamed from: com.facebook.share.model.ShareMedia$b */
    /* loaded from: classes5.dex */
    public enum EnumC17341b {
        PHOTO,
        VIDEO
    }

    public ShareMedia(AbstractC17340a abstractC17340a) {
        this.f69823b = new Bundle(abstractC17340a.f69824a);
    }

    /* renamed from: a */
    public abstract EnumC17341b mo52143a();

    @Deprecated
    /* renamed from: b */
    public Bundle m52237b() {
        return new Bundle(this.f69823b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f69823b);
    }

    public ShareMedia(Parcel parcel) {
        this.f69823b = parcel.readBundle();
    }
}
