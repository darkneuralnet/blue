package co.bird.android.library.lightbox;

import android.os.Parcel;
import android.os.Parcelable;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0019"}, m28432d2 = {"Lco/bird/android/library/lightbox/LightboxImage;", "Landroid/os/Parcelable;", "", "url", "attribution", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "lightbox_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class LightboxImage implements Parcelable {
    public static final Parcelable.Creator<LightboxImage> CREATOR = new C16044a();

    /* renamed from: b */
    public final String f66106b;

    /* renamed from: c */
    public final String f66107c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: co.bird.android.library.lightbox.LightboxImage$a */
    /* loaded from: classes3.dex */
    public static final class C16044a implements Parcelable.Creator<LightboxImage> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final LightboxImage createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LightboxImage(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final LightboxImage[] newArray(int i) {
            return new LightboxImage[i];
        }
    }

    public LightboxImage(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f66106b = url;
        this.f66107c = str;
    }

    public static /* synthetic */ LightboxImage copy$default(LightboxImage lightboxImage, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lightboxImage.f66106b;
        }
        if ((i & 2) != 0) {
            str2 = lightboxImage.f66107c;
        }
        return lightboxImage.m56032a(str, str2);
    }

    /* renamed from: a */
    public final LightboxImage m56032a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new LightboxImage(url, str);
    }

    /* renamed from: b */
    public final String m56031b() {
        return this.f66107c;
    }

    /* renamed from: c */
    public final String m56030c() {
        return this.f66106b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LightboxImage) {
            LightboxImage lightboxImage = (LightboxImage) obj;
            return Intrinsics.areEqual(this.f66106b, lightboxImage.f66106b) && Intrinsics.areEqual(this.f66107c, lightboxImage.f66107c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f66106b.hashCode() * 31;
        String str = this.f66107c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f66106b;
        String str2 = this.f66107c;
        return "LightboxImage(url=" + str + ", attribution=" + str2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66106b);
        out.writeString(this.f66107c);
    }

    public /* synthetic */ LightboxImage(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
