package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b \b\u0086\u0001\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006!"}, m28432d2 = {"Lco/bird/android/model/constant/MapMarkerKind;", "", "(Ljava/lang/String;I)V", "CAPTIVE_RECOVERY", "CHARGE", "COLLECT", "DAMAGED", "DESIGNATED", "DOWN", "IN_RIDE", "IN_TASK", "INSPECTION", "LEGAL_PRESERVE", "LIPO", "MISSING", "MOVE", "OFFLINE", "PERIL", "PERIL_REBALANCE", "PRIVATE_PROPERTY", "PROPERTY", "RADAR", "READY", "REBALANCE_FOR_TRANSPORT", "SUBMERGED", "ULM", "DEBRAIN", "TASK_ORDER_FACILITY", "TASK_ORDER_HOLD", "TASK_ORDER_MARKET", "TASK_ORDER_KEEP", "UNKNOWN", "Companion", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum MapMarkerKind {
    CAPTIVE_RECOVERY,
    CHARGE,
    COLLECT,
    DAMAGED,
    DESIGNATED,
    DOWN,
    IN_RIDE,
    IN_TASK,
    INSPECTION,
    LEGAL_PRESERVE,
    LIPO,
    MISSING,
    MOVE,
    OFFLINE,
    PERIL,
    PERIL_REBALANCE,
    PRIVATE_PROPERTY,
    PROPERTY,
    RADAR,
    READY,
    REBALANCE_FOR_TRANSPORT,
    SUBMERGED,
    ULM,
    DEBRAIN,
    TASK_ORDER_FACILITY,
    TASK_ORDER_HOLD,
    TASK_ORDER_MARKET,
    TASK_ORDER_KEEP,
    UNKNOWN;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/constant/MapMarkerKind$Companion;", "", "()V", "from", "Lco/bird/android/model/constant/MapMarkerKind;", "string", "", "model-constant"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MapMarkerKind from(String str) {
            if (str != null) {
                try {
                    String upperCase = str.toUpperCase();
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase()");
                    MapMarkerKind valueOf = MapMarkerKind.valueOf(upperCase);
                    if (valueOf != null) {
                        return valueOf;
                    }
                } catch (IllegalArgumentException unused) {
                    return MapMarkerKind.UNKNOWN;
                }
            }
            return MapMarkerKind.UNKNOWN;
        }

        private Companion() {
        }
    }
}
