package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LcL3;", "", "", "currency", "", "price", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "J", "c", "()J", "<init>", "(Ljava/lang/String;J)V", "purchase-payment_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cL3  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39085cL3 {

    /* renamed from: a */
    public final String f60432a;

    /* renamed from: b */
    public final long f60433b;

    public C39085cL3(String currency, long j) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f60432a = currency;
        this.f60433b = j;
    }

    public static /* synthetic */ C39085cL3 copy$default(C39085cL3 c39085cL3, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c39085cL3.f60432a;
        }
        if ((i & 2) != 0) {
            j = c39085cL3.f60433b;
        }
        return c39085cL3.m61548a(str, j);
    }

    /* renamed from: a */
    public final C39085cL3 m61548a(String currency, long j) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new C39085cL3(currency, j);
    }

    /* renamed from: b */
    public final String m61547b() {
        return this.f60432a;
    }

    /* renamed from: c */
    public final long m61546c() {
        return this.f60433b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39085cL3) {
            C39085cL3 c39085cL3 = (C39085cL3) obj;
            return Intrinsics.areEqual(this.f60432a, c39085cL3.f60432a) && this.f60433b == c39085cL3.f60433b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f60432a.hashCode() * 31) + Long.hashCode(this.f60433b);
    }

    public String toString() {
        String str = this.f60432a;
        long j = this.f60433b;
        return "PayData(currency=" + str + ", price=" + j + ")";
    }
}
