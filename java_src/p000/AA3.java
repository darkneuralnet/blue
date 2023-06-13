package p000;

import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LAA3;", "", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "media", "", "contentDescription", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "c", "()Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lco/bird/android/model/persistence/nestedstructures/AssetMedia;Ljava/lang/String;)V", "core-interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AA3 */
/* loaded from: classes2.dex */
public final class AA3 {

    /* renamed from: a */
    public final AssetMedia f227a;

    /* renamed from: b */
    public final String f228b;

    public AA3(AssetMedia media, String str) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f227a = media;
        this.f228b = str;
    }

    public static /* synthetic */ AA3 copy$default(AA3 aa3, AssetMedia assetMedia, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            assetMedia = aa3.f227a;
        }
        if ((i & 2) != 0) {
            str = aa3.f228b;
        }
        return aa3.m116042a(assetMedia, str);
    }

    /* renamed from: a */
    public final AA3 m116042a(AssetMedia media, String str) {
        Intrinsics.checkNotNullParameter(media, "media");
        return new AA3(media, str);
    }

    /* renamed from: b */
    public final String m116041b() {
        return this.f228b;
    }

    /* renamed from: c */
    public final AssetMedia m116040c() {
        return this.f227a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AA3) {
            AA3 aa3 = (AA3) obj;
            return Intrinsics.areEqual(this.f227a, aa3.f227a) && Intrinsics.areEqual(this.f228b, aa3.f228b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f227a.hashCode() * 31;
        String str = this.f228b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        AssetMedia assetMedia = this.f227a;
        String str = this.f228b;
        return "OverrideMedia(media=" + assetMedia + ", contentDescription=" + str + ")";
    }
}
