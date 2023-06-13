package co.bird.android.model.constant;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/constant/ServiceCenterRoute;", "", "(Ljava/lang/String;I)V", "CHECK_IN", "REPAIR", "CHARGE", "SCRAP", "HIBERNATE", "SERVICE_COMPLETE", "UNKNOWN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum ServiceCenterRoute {
    CHECK_IN,
    REPAIR,
    CHARGE,
    SCRAP,
    HIBERNATE,
    SERVICE_COMPLETE,
    UNKNOWN;
    
    private static final Set<ServiceCenterStatus> CHECK_IN_ROUTE_STATUSES;
    public static final Companion Companion = new Companion(null);
    private static final Set<ServiceCenterStatus> REPAIR_ROUTE_STATUSES;
    private static final Set<ServiceCenterStatus> SCRAP_ROUTE_STATUSES;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/constant/ServiceCenterRoute$Companion;", "", "()V", "CHECK_IN_ROUTE_STATUSES", "", "Lco/bird/android/model/constant/ServiceCenterStatus;", "getCHECK_IN_ROUTE_STATUSES", "()Ljava/util/Set;", "REPAIR_ROUTE_STATUSES", "getREPAIR_ROUTE_STATUSES", "SCRAP_ROUTE_STATUSES", "getSCRAP_ROUTE_STATUSES", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<ServiceCenterStatus> getCHECK_IN_ROUTE_STATUSES() {
            return ServiceCenterRoute.CHECK_IN_ROUTE_STATUSES;
        }

        public final Set<ServiceCenterStatus> getREPAIR_ROUTE_STATUSES() {
            return ServiceCenterRoute.REPAIR_ROUTE_STATUSES;
        }

        public final Set<ServiceCenterStatus> getSCRAP_ROUTE_STATUSES() {
            return ServiceCenterRoute.SCRAP_ROUTE_STATUSES;
        }

        private Companion() {
        }
    }

    static {
        Set<ServiceCenterStatus> of;
        Set<ServiceCenterStatus> of2;
        Set<ServiceCenterStatus> of3;
        of = SetsKt__SetsKt.setOf((Object[]) new ServiceCenterStatus[]{null, ServiceCenterStatus.ENTRY, ServiceCenterStatus.CHECKED_IN});
        CHECK_IN_ROUTE_STATUSES = of;
        of2 = SetsKt__SetsKt.setOf((Object[]) new ServiceCenterStatus[]{ServiceCenterStatus.AWAITING_REPAIR, ServiceCenterStatus.ACTIVE_REPAIR, ServiceCenterStatus.CANT_REPAIR, ServiceCenterStatus.CANT_REPAIR_PROCESS_OR_KNOWLEDGE, ServiceCenterStatus.CANT_REPAIR_TOOLS_AND_PARTS});
        REPAIR_ROUTE_STATUSES = of2;
        of3 = SetsKt__SetsKt.setOf((Object[]) new ServiceCenterStatus[]{ServiceCenterStatus.AWAITING_SCRAP, ServiceCenterStatus.AWAITING_SCRAP_SUBMERGED, ServiceCenterStatus.AWAITING_SCRAP_INSPECTION, ServiceCenterStatus.AWAITING_SCRAP_APPROVAL, ServiceCenterStatus.SCRAP_REJECTED, ServiceCenterStatus.SCRAP_COMPLETE});
        SCRAP_ROUTE_STATUSES = of3;
    }
}
