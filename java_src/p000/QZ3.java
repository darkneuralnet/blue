package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0015"}, m28432d2 = {"LQZ3;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "()Ljava/lang/String;", "key", "", "b", "Ljava/lang/Long;", "()Ljava/lang/Long;", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "(Ljava/lang/String;Z)V", "work-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: QZ3 */
/* loaded from: classes.dex */
public final class QZ3 {

    /* renamed from: a */
    public final String f30533a;

    /* renamed from: b */
    public final Long f30534b;

    public QZ3(String key, Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30533a = key;
        this.f30534b = l;
    }

    /* renamed from: a */
    public final String m88396a() {
        return this.f30533a;
    }

    /* renamed from: b */
    public final Long m88395b() {
        return this.f30534b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QZ3) {
            QZ3 qz3 = (QZ3) obj;
            return Intrinsics.areEqual(this.f30533a, qz3.f30533a) && Intrinsics.areEqual(this.f30534b, qz3.f30534b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f30533a.hashCode() * 31;
        Long l = this.f30534b;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "Preference(key=" + this.f30533a + ", value=" + this.f30534b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QZ3(String key, boolean z) {
        this(key, Long.valueOf(z ? 1L : 0L));
        Intrinsics.checkNotNullParameter(key, "key");
    }
}
