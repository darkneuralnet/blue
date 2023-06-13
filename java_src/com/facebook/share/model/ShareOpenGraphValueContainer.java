package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import com.facebook.share.model.ShareOpenGraphValueContainer;
import com.facebook.share.model.ShareOpenGraphValueContainer.AbstractC17355a;
import java.util.Set;
/* loaded from: classes5.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends AbstractC17355a> implements ShareModel {

    /* renamed from: b */
    public final Bundle f69861b;

    /* renamed from: com.facebook.share.model.ShareOpenGraphValueContainer$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17355a<P extends ShareOpenGraphValueContainer, E extends AbstractC17355a> {

        /* renamed from: a */
        public Bundle f69862a = new Bundle();

        /* renamed from: b */
        public E m52181b(String str, String str2) {
            this.f69862a.putString(str, str2);
            return this;
        }

        /* renamed from: c */
        public E m52180c(P p) {
            if (p != null) {
                this.f69862a.putAll(p.m52185b());
            }
            return this;
        }
    }

    public ShareOpenGraphValueContainer(AbstractC17355a<P, E> abstractC17355a) {
        this.f69861b = (Bundle) abstractC17355a.f69862a.clone();
    }

    /* renamed from: a */
    public Object m52186a(String str) {
        return this.f69861b.get(str);
    }

    /* renamed from: b */
    public Bundle m52185b() {
        return (Bundle) this.f69861b.clone();
    }

    /* renamed from: c */
    public String m52184c(String str) {
        return this.f69861b.getString(str);
    }

    /* renamed from: d */
    public Set<String> m52183d() {
        return this.f69861b.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f69861b);
    }

    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.f69861b = parcel.readBundle(AbstractC17355a.class.getClassLoader());
    }
}
