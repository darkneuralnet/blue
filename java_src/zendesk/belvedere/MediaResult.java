package zendesk.belvedere;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.File;
/* loaded from: classes8.dex */
public class MediaResult implements Parcelable, Comparable<MediaResult> {
    public static final Parcelable.Creator<MediaResult> CREATOR = new C31092a();

    /* renamed from: b */
    public final File f121789b;

    /* renamed from: c */
    public final Uri f121790c;

    /* renamed from: d */
    public final Uri f121791d;

    /* renamed from: e */
    public final String f121792e;

    /* renamed from: f */
    public final String f121793f;

    /* renamed from: g */
    public final long f121794g;

    /* renamed from: h */
    public final long f121795h;

    /* renamed from: i */
    public final long f121796i;

    /* renamed from: zendesk.belvedere.MediaResult$a */
    /* loaded from: classes8.dex */
    public static class C31092a implements Parcelable.Creator<MediaResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public MediaResult createFromParcel(Parcel parcel) {
            return new MediaResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public MediaResult[] newArray(int i) {
            return new MediaResult[i];
        }
    }

    public /* synthetic */ MediaResult(Parcel parcel, C31092a c31092a) {
        this(parcel);
    }

    /* renamed from: b */
    public static MediaResult m786b() {
        return new MediaResult(null, null, null, null, null, -1L, -1L, -1L);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(MediaResult mediaResult) {
        return this.f121791d.compareTo(mediaResult.m781h());
    }

    /* renamed from: c */
    public File m785c() {
        return this.f121789b;
    }

    /* renamed from: d */
    public long m784d() {
        return this.f121796i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public String m783e() {
        return this.f121793f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MediaResult mediaResult = (MediaResult) obj;
            if (this.f121794g == mediaResult.f121794g && this.f121795h == mediaResult.f121795h && this.f121796i == mediaResult.f121796i) {
                File file = this.f121789b;
                if (file == null ? mediaResult.f121789b != null : !file.equals(mediaResult.f121789b)) {
                    return false;
                }
                Uri uri = this.f121790c;
                if (uri == null ? mediaResult.f121790c != null : !uri.equals(mediaResult.f121790c)) {
                    return false;
                }
                Uri uri2 = this.f121791d;
                if (uri2 == null ? mediaResult.f121791d != null : !uri2.equals(mediaResult.f121791d)) {
                    return false;
                }
                String str = this.f121792e;
                if (str == null ? mediaResult.f121792e != null : !str.equals(mediaResult.f121792e)) {
                    return false;
                }
                String str2 = this.f121793f;
                String str3 = mediaResult.f121793f;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public String m782g() {
        return this.f121792e;
    }

    /* renamed from: h */
    public Uri m781h() {
        return this.f121791d;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        File file = this.f121789b;
        int i5 = 0;
        if (file != null) {
            i = file.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Uri uri = this.f121790c;
        if (uri != null) {
            i2 = uri.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        Uri uri2 = this.f121791d;
        if (uri2 != null) {
            i3 = uri2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str = this.f121792e;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str2 = this.f121793f;
        if (str2 != null) {
            i5 = str2.hashCode();
        }
        long j = this.f121794g;
        long j2 = this.f121795h;
        long j3 = this.f121796i;
        return ((((((i9 + i5) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    /* renamed from: i */
    public long m780i() {
        return this.f121794g;
    }

    /* renamed from: j */
    public Uri m779j() {
        return this.f121790c;
    }

    /* renamed from: k */
    public long m778k() {
        return this.f121795h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f121789b);
        parcel.writeParcelable(this.f121790c, i);
        parcel.writeString(this.f121792e);
        parcel.writeString(this.f121793f);
        parcel.writeParcelable(this.f121791d, i);
        parcel.writeLong(this.f121794g);
        parcel.writeLong(this.f121795h);
        parcel.writeLong(this.f121796i);
    }

    public MediaResult(File file, Uri uri, Uri uri2, String str, String str2, long j, long j2, long j3) {
        this.f121789b = file;
        this.f121790c = uri;
        this.f121791d = uri2;
        this.f121793f = str2;
        this.f121792e = str;
        this.f121794g = j;
        this.f121795h = j2;
        this.f121796i = j3;
    }

    public MediaResult(Parcel parcel) {
        this.f121789b = (File) parcel.readSerializable();
        this.f121790c = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f121792e = parcel.readString();
        this.f121793f = parcel.readString();
        this.f121791d = (Uri) parcel.readParcelable(MediaResult.class.getClassLoader());
        this.f121794g = parcel.readLong();
        this.f121795h = parcel.readLong();
        this.f121796i = parcel.readLong();
    }
}
