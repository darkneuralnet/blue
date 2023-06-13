package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, m28432d2 = {"Lbo/app/e5;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/d5;", "session", "Lbo/app/d5;", C17296a.f69688o, "()Lbo/app/d5;", "<init>", "(Lbo/app/d5;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.e5 */
/* loaded from: classes.dex */
public final class C12612e5 {

    /* renamed from: a */
    private final C12584d5 f58398a;

    public C12612e5(C12584d5 session) {
        Intrinsics.checkNotNullParameter(session, "session");
        this.f58398a = session;
        if (!session.m63836y()) {
            return;
        }
        throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.".toString());
    }

    /* renamed from: a */
    public final C12584d5 m63803a() {
        return this.f58398a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12612e5) && Intrinsics.areEqual(this.f58398a, ((C12612e5) obj).f58398a);
    }

    public int hashCode() {
        return this.f58398a.hashCode();
    }

    public String toString() {
        return "SessionCreatedEvent(session=" + this.f58398a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}