package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LTC6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "workSpecId", "I", "()I", "generation", "<init>", "(Ljava/lang/String;I)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: TC6 */
/* loaded from: classes.dex */
public final class TC6 {

    /* renamed from: a */
    public final String f34913a;

    /* renamed from: b */
    public final int f34914b;

    public TC6(String workSpecId, int i) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f34913a = workSpecId;
        this.f34914b = i;
    }

    /* renamed from: a */
    public final int m84209a() {
        return this.f34914b;
    }

    /* renamed from: b */
    public final String m84208b() {
        return this.f34913a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TC6) {
            TC6 tc6 = (TC6) obj;
            return Intrinsics.areEqual(this.f34913a, tc6.f34913a) && this.f34914b == tc6.f34914b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34913a.hashCode() * 31) + Integer.hashCode(this.f34914b);
    }

    public String toString() {
        return "WorkGenerationalId(workSpecId=" + this.f34913a + ", generation=" + this.f34914b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
