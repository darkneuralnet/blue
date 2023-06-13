package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÖ\u0003R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0005R\u0017\u0010\u0006\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, m28432d2 = {"LHN2;", "A", "B", "", C17296a.f69688o, "()Ljava/lang/Object;", "b", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getA", "getB", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: HN2 */
/* loaded from: classes2.dex */
public final class HN2<A, B> {

    /* renamed from: a */
    public final A f13319a;

    /* renamed from: b */
    public final B f13320b;

    public HN2(A a, B b) {
        this.f13319a = a;
        this.f13320b = b;
    }

    /* renamed from: a */
    public final A m103929a() {
        return this.f13319a;
    }

    /* renamed from: b */
    public final B m103928b() {
        return this.f13320b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HN2) {
            HN2 hn2 = (HN2) obj;
            return Intrinsics.areEqual(this.f13319a, hn2.f13319a) && Intrinsics.areEqual(this.f13320b, hn2.f13320b);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f13319a;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f13320b;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return "MavericksTuple2(a=" + this.f13319a + ", b=" + this.f13320b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
