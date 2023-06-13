package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.AbstractC17336a;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes5.dex */
public abstract class ShareContent<P extends ShareContent, E extends AbstractC17336a> implements ShareModel {

    /* renamed from: b */
    public final Uri f69805b;

    /* renamed from: c */
    public final List<String> f69806c;

    /* renamed from: d */
    public final String f69807d;

    /* renamed from: e */
    public final String f69808e;

    /* renamed from: f */
    public final String f69809f;

    /* renamed from: g */
    public final ShareHashtag f69810g;

    /* renamed from: com.facebook.share.model.ShareContent$a */
    /* loaded from: classes5.dex */
    public static abstract class AbstractC17336a<P extends ShareContent, E extends AbstractC17336a> {

        /* renamed from: a */
        public Uri f69811a;

        /* renamed from: b */
        public List<String> f69812b;

        /* renamed from: c */
        public String f69813c;

        /* renamed from: d */
        public String f69814d;

        /* renamed from: e */
        public String f69815e;

        /* renamed from: f */
        public ShareHashtag f69816f;

        /* renamed from: g */
        public E m52258g(P p) {
            if (p == null) {
                return this;
            }
            return (E) m52257h(p.m52271a()).m52255j(p.m52269c()).m52254k(p.m52268d()).m52256i(p.m52270b()).m52253l(p.m52267e()).m52252m(p.m52266g());
        }

        /* renamed from: h */
        public E m52257h(Uri uri) {
            this.f69811a = uri;
            return this;
        }

        /* renamed from: i */
        public E m52256i(String str) {
            this.f69814d = str;
            return this;
        }

        /* renamed from: j */
        public E m52255j(List<String> list) {
            this.f69812b = list == null ? null : Collections.unmodifiableList(list);
            return this;
        }

        /* renamed from: k */
        public E m52254k(String str) {
            this.f69813c = str;
            return this;
        }

        /* renamed from: l */
        public E m52253l(String str) {
            this.f69815e = str;
            return this;
        }

        /* renamed from: m */
        public E m52252m(ShareHashtag shareHashtag) {
            this.f69816f = shareHashtag;
            return this;
        }
    }

    public ShareContent(AbstractC17336a abstractC17336a) {
        this.f69805b = abstractC17336a.f69811a;
        this.f69806c = abstractC17336a.f69812b;
        this.f69807d = abstractC17336a.f69813c;
        this.f69808e = abstractC17336a.f69814d;
        this.f69809f = abstractC17336a.f69815e;
        this.f69810g = abstractC17336a.f69816f;
    }

    /* renamed from: a */
    public Uri m52271a() {
        return this.f69805b;
    }

    /* renamed from: b */
    public String m52270b() {
        return this.f69808e;
    }

    /* renamed from: c */
    public List<String> m52269c() {
        return this.f69806c;
    }

    /* renamed from: d */
    public String m52268d() {
        return this.f69807d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m52267e() {
        return this.f69809f;
    }

    /* renamed from: g */
    public ShareHashtag m52266g() {
        return this.f69810g;
    }

    /* renamed from: h */
    public final List<String> m52265h(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.size() == 0) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f69805b, 0);
        parcel.writeStringList(this.f69806c);
        parcel.writeString(this.f69807d);
        parcel.writeString(this.f69808e);
        parcel.writeString(this.f69809f);
        parcel.writeParcelable(this.f69810g, 0);
    }

    public ShareContent(Parcel parcel) {
        this.f69805b = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f69806c = m52265h(parcel);
        this.f69807d = parcel.readString();
        this.f69808e = parcel.readString();
        this.f69809f = parcel.readString();
        this.f69810g = new ShareHashtag.C17338b().m52246c(parcel).m52247b();
    }
}
