package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LBK5;", "", "", "stateRequest", "unlockRequest", "lockingRequest", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "getLockingRequest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: BK5 */
/* loaded from: classes4.dex */
public final class BK5 {

    /* renamed from: a */
    public final String f2204a;

    /* renamed from: b */
    public final String f2205b;

    /* renamed from: c */
    public final String f2206c;

    public BK5(String stateRequest, String unlockRequest, String lockingRequest) {
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        this.f2204a = stateRequest;
        this.f2205b = unlockRequest;
        this.f2206c = lockingRequest;
    }

    public static /* synthetic */ BK5 copy$default(BK5 bk5, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bk5.f2204a;
        }
        if ((i & 2) != 0) {
            str2 = bk5.f2205b;
        }
        if ((i & 4) != 0) {
            str3 = bk5.f2206c;
        }
        return bk5.m114095a(str, str2, str3);
    }

    /* renamed from: a */
    public final BK5 m114095a(String stateRequest, String unlockRequest, String lockingRequest) {
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        return new BK5(stateRequest, unlockRequest, lockingRequest);
    }

    /* renamed from: b */
    public final String m114094b() {
        return this.f2204a;
    }

    /* renamed from: c */
    public final String m114093c() {
        return this.f2205b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BK5) {
            BK5 bk5 = (BK5) obj;
            return Intrinsics.areEqual(this.f2204a, bk5.f2204a) && Intrinsics.areEqual(this.f2205b, bk5.f2205b) && Intrinsics.areEqual(this.f2206c, bk5.f2206c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2204a.hashCode() * 31) + this.f2205b.hashCode()) * 31) + this.f2206c.hashCode();
    }

    public String toString() {
        String str = this.f2204a;
        String str2 = this.f2205b;
        String str3 = this.f2206c;
        return "SmartlockSolebeDataTokenResponse(stateRequest=" + str + ", unlockRequest=" + str2 + ", lockingRequest=" + str3 + ")";
    }
}
