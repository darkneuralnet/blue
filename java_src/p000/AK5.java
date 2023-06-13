package p000;

import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u0003\u0010\f¨\u0006\u000f"}, m28432d2 = {"LAK5;", "", "", "isLocked", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "equals", "Z", "()Z", "<init>", "(Z)V", "impl_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: AK5 */
/* loaded from: classes4.dex */
public final class AK5 {

    /* renamed from: a */
    public final boolean f397a;

    public AK5(boolean z) {
        this.f397a = z;
    }

    public static /* synthetic */ AK5 copy$default(AK5 ak5, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ak5.f397a;
        }
        return ak5.m115912a(z);
    }

    /* renamed from: a */
    public final AK5 m115912a(boolean z) {
        return new AK5(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AK5) && this.f397a == ((AK5) obj).f397a;
    }

    public int hashCode() {
        boolean z = this.f397a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        boolean z = this.f397a;
        return "SmartlockSolebeDataStateResponse(isLocked=" + z + ")";
    }
}
