package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m28432d2 = {"LrP2;", "", "", "url", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "b", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: rP2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48032rP2 extends Throwable {

    /* renamed from: b */
    public final String f106964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48032rP2(String url) {
        super("Failed to load Media: " + url);
        Intrinsics.checkNotNullParameter(url, "url");
        this.f106964b = url;
    }

    public static /* synthetic */ C48032rP2 copy$default(C48032rP2 c48032rP2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c48032rP2.f106964b;
        }
        return c48032rP2.m15995a(str);
    }

    /* renamed from: a */
    public final C48032rP2 m15995a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new C48032rP2(url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C48032rP2) && Intrinsics.areEqual(this.f106964b, ((C48032rP2) obj).f106964b);
    }

    public int hashCode() {
        return this.f106964b.hashCode();
    }

    @Override // java.lang.Throwable
    public String toString() {
        String str = this.f106964b;
        return "MediaLoadFailedException(url=" + str + ")";
    }
}
