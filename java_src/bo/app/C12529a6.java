package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\r"}, m28432d2 = {"Lbo/app/a6;", "", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lbo/app/z1;", "request", "<init>", "(Lbo/app/z1;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.a6 */
/* loaded from: classes.dex */
public final class C12529a6 {

    /* renamed from: a */
    private final InterfaceC13280z1 f58241a;

    public C12529a6(InterfaceC13280z1 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f58241a = request;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12529a6) && Intrinsics.areEqual(this.f58241a, ((C12529a6) obj).f58241a);
    }

    public int hashCode() {
        return this.f58241a.hashCode();
    }

    public String toString() {
        return "TriggerDispatchCompletedEvent(request=" + this.f58241a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
