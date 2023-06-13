package p000;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m28432d2 = {"LHh3;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "<init>", "(Ljava/lang/String;)V", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Hh3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C33317Hh3 {

    /* renamed from: a */
    public final String f13770a;

    public C33317Hh3(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f13770a = key;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33317Hh3) && Intrinsics.areEqual(this.f13770a, ((C33317Hh3) obj).f13770a);
    }

    public int hashCode() {
        return this.f13770a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f13770a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
