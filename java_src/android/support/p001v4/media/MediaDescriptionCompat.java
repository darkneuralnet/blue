package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaDescriptionCompat */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C10893a();

    /* renamed from: b */
    public final String f51324b;

    /* renamed from: c */
    public final CharSequence f51325c;

    /* renamed from: d */
    public final CharSequence f51326d;

    /* renamed from: e */
    public final CharSequence f51327e;

    /* renamed from: f */
    public final Bitmap f51328f;

    /* renamed from: g */
    public final Uri f51329g;

    /* renamed from: h */
    public final Bundle f51330h;

    /* renamed from: i */
    public final Uri f51331i;

    /* renamed from: j */
    public MediaDescription f51332j;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    /* loaded from: classes.dex */
    public class C10893a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m70683a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    /* loaded from: classes.dex */
    public static class C10894b {
        private C10894b() {
        }

        /* renamed from: a */
        public static MediaDescription m70678a(MediaDescription.Builder builder) {
            return builder.build();
        }

        /* renamed from: b */
        public static MediaDescription.Builder m70677b() {
            return new MediaDescription.Builder();
        }

        /* renamed from: c */
        public static CharSequence m70676c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        /* renamed from: d */
        public static Bundle m70675d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        /* renamed from: e */
        public static Bitmap m70674e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        /* renamed from: f */
        public static Uri m70673f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        /* renamed from: g */
        public static String m70672g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        /* renamed from: h */
        public static CharSequence m70671h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        /* renamed from: i */
        public static CharSequence m70670i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        /* renamed from: j */
        public static void m70669j(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        /* renamed from: k */
        public static void m70668k(MediaDescription.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        /* renamed from: l */
        public static void m70667l(MediaDescription.Builder builder, Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        /* renamed from: m */
        public static void m70666m(MediaDescription.Builder builder, Uri uri) {
            builder.setIconUri(uri);
        }

        /* renamed from: n */
        public static void m70665n(MediaDescription.Builder builder, String str) {
            builder.setMediaId(str);
        }

        /* renamed from: o */
        public static void m70664o(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        /* renamed from: p */
        public static void m70663p(MediaDescription.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    /* loaded from: classes.dex */
    public static class C10895c {
        private C10895c() {
        }

        /* renamed from: a */
        public static Uri m70662a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        /* renamed from: b */
        public static void m70661b(MediaDescription.Builder builder, Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    /* loaded from: classes.dex */
    public static final class C10896d {

        /* renamed from: a */
        public String f51333a;

        /* renamed from: b */
        public CharSequence f51334b;

        /* renamed from: c */
        public CharSequence f51335c;

        /* renamed from: d */
        public CharSequence f51336d;

        /* renamed from: e */
        public Bitmap f51337e;

        /* renamed from: f */
        public Uri f51338f;

        /* renamed from: g */
        public Bundle f51339g;

        /* renamed from: h */
        public Uri f51340h;

        /* renamed from: a */
        public MediaDescriptionCompat m70660a() {
            return new MediaDescriptionCompat(this.f51333a, this.f51334b, this.f51335c, this.f51336d, this.f51337e, this.f51338f, this.f51339g, this.f51340h);
        }

        /* renamed from: b */
        public C10896d m70659b(CharSequence charSequence) {
            this.f51336d = charSequence;
            return this;
        }

        /* renamed from: c */
        public C10896d m70658c(Bundle bundle) {
            this.f51339g = bundle;
            return this;
        }

        /* renamed from: d */
        public C10896d m70657d(Bitmap bitmap) {
            this.f51337e = bitmap;
            return this;
        }

        /* renamed from: e */
        public C10896d m70656e(Uri uri) {
            this.f51338f = uri;
            return this;
        }

        /* renamed from: f */
        public C10896d m70655f(String str) {
            this.f51333a = str;
            return this;
        }

        /* renamed from: g */
        public C10896d m70654g(Uri uri) {
            this.f51340h = uri;
            return this;
        }

        /* renamed from: h */
        public C10896d m70653h(CharSequence charSequence) {
            this.f51335c = charSequence;
            return this;
        }

        /* renamed from: i */
        public C10896d m70652i(CharSequence charSequence) {
            this.f51334b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f51324b = str;
        this.f51325c = charSequence;
        this.f51326d = charSequence2;
        this.f51327e = charSequence3;
        this.f51328f = bitmap;
        this.f51329g = uri;
        this.f51330h = bundle;
        this.f51331i = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static MediaDescriptionCompat m70683a(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        C10896d c10896d = new C10896d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c10896d.m70655f(C10894b.m70672g(mediaDescription));
        c10896d.m70652i(C10894b.m70670i(mediaDescription));
        c10896d.m70653h(C10894b.m70671h(mediaDescription));
        c10896d.m70659b(C10894b.m70676c(mediaDescription));
        c10896d.m70657d(C10894b.m70674e(mediaDescription));
        c10896d.m70656e(C10894b.m70673f(mediaDescription));
        Bundle m70675d = C10894b.m70675d(mediaDescription);
        if (m70675d != null) {
            m70675d = MediaSessionCompat.m70631b(m70675d);
        }
        if (m70675d != null) {
            uri = (Uri) m70675d.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri != null) {
            if (!m70675d.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || m70675d.size() != 2) {
                m70675d.remove("android.support.v4.media.description.MEDIA_URI");
                m70675d.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            }
            c10896d.m70658c(bundle);
            if (uri == null) {
                c10896d.m70654g(uri);
            } else {
                c10896d.m70654g(C10895c.m70662a(mediaDescription));
            }
            MediaDescriptionCompat m70660a = c10896d.m70660a();
            m70660a.f51332j = mediaDescription;
            return m70660a;
        }
        bundle = m70675d;
        c10896d.m70658c(bundle);
        if (uri == null) {
        }
        MediaDescriptionCompat m70660a2 = c10896d.m70660a();
        m70660a2.f51332j = mediaDescription;
        return m70660a2;
    }

    /* renamed from: b */
    public Object m70682b() {
        MediaDescription mediaDescription = this.f51332j;
        if (mediaDescription == null) {
            MediaDescription.Builder m70677b = C10894b.m70677b();
            C10894b.m70665n(m70677b, this.f51324b);
            C10894b.m70663p(m70677b, this.f51325c);
            C10894b.m70664o(m70677b, this.f51326d);
            C10894b.m70669j(m70677b, this.f51327e);
            C10894b.m70667l(m70677b, this.f51328f);
            C10894b.m70666m(m70677b, this.f51329g);
            C10894b.m70668k(m70677b, this.f51330h);
            C10895c.m70661b(m70677b, this.f51331i);
            MediaDescription m70678a = C10894b.m70678a(m70677b);
            this.f51332j = m70678a;
            return m70678a;
        }
        return mediaDescription;
    }

    /* renamed from: c */
    public String m70681c() {
        return this.f51324b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f51325c) + ", " + ((Object) this.f51326d) + ", " + ((Object) this.f51327e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m70682b()).writeToParcel(parcel, i);
    }
}
