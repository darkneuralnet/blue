package bo.app;

import ch.qos.logback.core.CoreConstants;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28434bv = {}, m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¨\u0006\u000f"}, m28432d2 = {"Lbo/app/n6;", "", "", "Lbo/app/y2;", C17296a.f69688o, "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "triggeredActions", "<init>", "(Ljava/util/List;)V", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: bo.app.n6 */
/* loaded from: classes.dex */
public final class C12926n6 {

    /* renamed from: a */
    private final List<InterfaceC13232y2> f58952a;

    /* JADX WARN: Multi-variable type inference failed */
    public C12926n6(List<? extends InterfaceC13232y2> triggeredActions) {
        Intrinsics.checkNotNullParameter(triggeredActions, "triggeredActions");
        this.f58952a = triggeredActions;
    }

    /* renamed from: a */
    public final List<InterfaceC13232y2> m63289a() {
        return this.f58952a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12926n6) && Intrinsics.areEqual(this.f58952a, ((C12926n6) obj).f58952a);
    }

    public int hashCode() {
        return this.f58952a.hashCode();
    }

    public String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f58952a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
