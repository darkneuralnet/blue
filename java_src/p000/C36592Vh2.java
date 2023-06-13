package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0002R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r¨\u0006\u0014"}, m28432d2 = {"LVh2;", "", "", "hashCode", "", "toString", LegacyRepairType.OTHER_KEY, "", "equals", "value", C17296a.f69688o, "Ljava/lang/Object;", "getLeft", "()Ljava/lang/Object;", "left", "b", "getRight", "right", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Vh2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36592Vh2 {

    /* renamed from: a */
    public final Object f39483a;

    /* renamed from: b */
    public final Object f39484b;

    public C36592Vh2(Object obj, Object obj2) {
        this.f39483a = obj;
        this.f39484b = obj2;
    }

    /* renamed from: a */
    public final int m79556a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C36592Vh2) {
            C36592Vh2 c36592Vh2 = (C36592Vh2) obj;
            return Intrinsics.areEqual(this.f39483a, c36592Vh2.f39483a) && Intrinsics.areEqual(this.f39484b, c36592Vh2.f39484b);
        }
        return false;
    }

    public int hashCode() {
        return (m79556a(this.f39483a) * 31) + m79556a(this.f39484b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f39483a + ", right=" + this.f39484b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
