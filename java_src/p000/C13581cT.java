package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LcT;", "Lg70;", "", "birdCode", "birdId", C17296a.f69688o, "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "eventbus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: cT */
/* loaded from: classes2.dex */
public final class C13581cT extends AbstractC41342g70 {

    /* renamed from: a */
    public final String f60685a;

    /* renamed from: b */
    public final String f60686b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13581cT(String birdCode, String birdId) {
        super(null);
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        this.f60685a = birdCode;
        this.f60686b = birdId;
    }

    public static /* synthetic */ C13581cT copy$default(C13581cT c13581cT, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c13581cT.f60685a;
        }
        if ((i & 2) != 0) {
            str2 = c13581cT.f60686b;
        }
        return c13581cT.m61295a(str, str2);
    }

    /* renamed from: a */
    public final C13581cT m61295a(String birdCode, String birdId) {
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        return new C13581cT(birdCode, birdId);
    }

    /* renamed from: b */
    public final String m61294b() {
        return this.f60685a;
    }

    /* renamed from: c */
    public final String m61293c() {
        return this.f60686b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13581cT) {
            C13581cT c13581cT = (C13581cT) obj;
            return Intrinsics.areEqual(this.f60685a, c13581cT.f60685a) && Intrinsics.areEqual(this.f60686b, c13581cT.f60686b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f60685a.hashCode() * 31) + this.f60686b.hashCode();
    }

    public String toString() {
        String str = this.f60685a;
        String str2 = this.f60686b;
        return "BirdScannedForCodeEvent(birdCode=" + str + ", birdId=" + str2 + ")";
    }
}
