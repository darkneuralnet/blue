package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u0011"}, m28432d2 = {"Lbo/app/l6;", "", "Lbo/app/t2;", C17296a.f69688o, "Lbo/app/y2;", "b", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "originalTriggerEvent", "failedTriggeredAction", "<init>", "(Lbo/app/t2;Lbo/app/y2;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.l6 */
/* loaded from: classes.dex */
public final class C12876l6 {

    /* renamed from: a */
    private final InterfaceC13145t2 f58860a;

    /* renamed from: b */
    private final InterfaceC13232y2 f58861b;

    public C12876l6(InterfaceC13145t2 originalTriggerEvent, InterfaceC13232y2 failedTriggeredAction) {
        Intrinsics.checkNotNullParameter(originalTriggerEvent, "originalTriggerEvent");
        Intrinsics.checkNotNullParameter(failedTriggeredAction, "failedTriggeredAction");
        this.f58860a = originalTriggerEvent;
        this.f58861b = failedTriggeredAction;
    }

    /* renamed from: a */
    public final InterfaceC13145t2 m63358a() {
        return this.f58860a;
    }

    /* renamed from: b */
    public final InterfaceC13232y2 m63357b() {
        return this.f58861b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12876l6) {
            C12876l6 c12876l6 = (C12876l6) obj;
            return Intrinsics.areEqual(this.f58860a, c12876l6.f58860a) && Intrinsics.areEqual(this.f58861b, c12876l6.f58861b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f58860a.hashCode() * 31) + this.f58861b.hashCode();
    }

    public String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f58860a + ", failedTriggeredAction=" + this.f58861b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
