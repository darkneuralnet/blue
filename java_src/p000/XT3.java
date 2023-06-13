package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, m28432d2 = {"LXT3;", "", "", "url", "attribution", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "bird-pay_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: XT3 */
/* loaded from: classes3.dex */
public final class XT3 {

    /* renamed from: a */
    public final String f43286a;

    /* renamed from: b */
    public final String f43287b;

    public XT3(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f43286a = url;
        this.f43287b = str;
    }

    public static /* synthetic */ XT3 copy$default(XT3 xt3, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xt3.f43286a;
        }
        if ((i & 2) != 0) {
            str2 = xt3.f43287b;
        }
        return xt3.m76971a(str, str2);
    }

    /* renamed from: a */
    public final XT3 m76971a(String url, String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new XT3(url, str);
    }

    /* renamed from: b */
    public final String m76970b() {
        return this.f43287b;
    }

    /* renamed from: c */
    public final String m76969c() {
        return this.f43286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XT3) {
            XT3 xt3 = (XT3) obj;
            return Intrinsics.areEqual(this.f43286a, xt3.f43286a) && Intrinsics.areEqual(this.f43287b, xt3.f43287b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f43286a.hashCode() * 31;
        String str = this.f43287b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.f43286a;
        String str2 = this.f43287b;
        return "PlaceImage(url=" + str + ", attribution=" + str2 + ")";
    }
}
