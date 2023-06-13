package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, m28432d2 = {"LHJ5;", "", "", "stateRequest", "unlockRequest", "lockingRequest", C17296a.f69688o, "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "getLockingRequest", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: HJ5 */
/* loaded from: classes4.dex */
public final class HJ5 {

    /* renamed from: a */
    public final String f13264a;

    /* renamed from: b */
    public final String f13265b;

    /* renamed from: c */
    public final String f13266c;

    public HJ5(String stateRequest, String unlockRequest, String lockingRequest) {
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        this.f13264a = stateRequest;
        this.f13265b = unlockRequest;
        this.f13266c = lockingRequest;
    }

    public static /* synthetic */ HJ5 copy$default(HJ5 hj5, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hj5.f13264a;
        }
        if ((i & 2) != 0) {
            str2 = hj5.f13265b;
        }
        if ((i & 4) != 0) {
            str3 = hj5.f13266c;
        }
        return hj5.m104034a(str, str2, str3);
    }

    /* renamed from: a */
    public final HJ5 m104034a(String stateRequest, String unlockRequest, String lockingRequest) {
        Intrinsics.checkNotNullParameter(stateRequest, "stateRequest");
        Intrinsics.checkNotNullParameter(unlockRequest, "unlockRequest");
        Intrinsics.checkNotNullParameter(lockingRequest, "lockingRequest");
        return new HJ5(stateRequest, unlockRequest, lockingRequest);
    }

    /* renamed from: b */
    public final String m104033b() {
        return this.f13264a;
    }

    /* renamed from: c */
    public final String m104032c() {
        return this.f13265b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HJ5) {
            HJ5 hj5 = (HJ5) obj;
            return Intrinsics.areEqual(this.f13264a, hj5.f13264a) && Intrinsics.areEqual(this.f13265b, hj5.f13265b) && Intrinsics.areEqual(this.f13266c, hj5.f13266c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f13264a.hashCode() * 31) + this.f13265b.hashCode()) * 31) + this.f13266c.hashCode();
    }

    public String toString() {
        String str = this.f13264a;
        String str2 = this.f13265b;
        String str3 = this.f13266c;
        return "SmartlockNokeDataTokenResponse(stateRequest=" + str + ", unlockRequest=" + str2 + ", lockingRequest=" + str3 + ")";
    }
}
