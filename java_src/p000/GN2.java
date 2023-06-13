package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u0004¨\u0006\u0010"}, m28432d2 = {"LGN2;", "A", "", C17296a.f69688o, "()Ljava/lang/Object;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "getA", "<init>", "(Ljava/lang/Object;)V", "mvrx-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: GN2 */
/* loaded from: classes2.dex */
public final class GN2<A> {

    /* renamed from: a */
    public final A f11812a;

    public GN2(A a) {
        this.f11812a = a;
    }

    /* renamed from: a */
    public final A m105186a() {
        return this.f11812a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GN2) && Intrinsics.areEqual(this.f11812a, ((GN2) obj).f11812a);
    }

    public int hashCode() {
        A a = this.f11812a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }

    public String toString() {
        return "MavericksTuple1(a=" + this.f11812a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
