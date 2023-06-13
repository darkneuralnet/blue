package co.bird.android.model.constant;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, m28432d2 = {"Lco/bird/android/model/constant/ScanStatus;", "", "(Ljava/lang/String;I)V", "toString", "", "AVAILABLE", "AWAITING_FLEET_CHANGE", "RELEASED", "FOUND", "IN_RIDE", "LOW_BATTERY", "OFFLINE", "OWNABLE", "OWNABLE_SCAN_REQUIRED", "DAMAGED", "QR_REQUIRED", "QR_DETACHED", "INVALID_CODE", "AFTER_HOURS", "WEATHER", "NO_RIDE_START", "NO_BOUNTY", "LOCATION_SERVICES_REQUIRED", "RESERVED", "ALREADY_HAS_RESERVATION", "INACCESSIBLE_PRIVATE", "OUTSIDE_SERVICE_AREA", "INSIDE_NO_RIDE_ZONE", "SUBMERGED", "TOTALED", "SHOW_PRECAPTURE_MODAL", "INCOMPATIBLE_APP", "AVAILABLE_OUTSIDE_SERVICE_AREA", "AVAILABLE_INSIDE_NO_RIDE_ZONE", "UNAVAILABLE_TO_GUEST", "AWAITING_TASK", "UNKNOWN", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum ScanStatus {
    AVAILABLE,
    AWAITING_FLEET_CHANGE,
    RELEASED,
    FOUND,
    IN_RIDE,
    LOW_BATTERY,
    OFFLINE,
    OWNABLE,
    OWNABLE_SCAN_REQUIRED,
    DAMAGED,
    QR_REQUIRED,
    QR_DETACHED,
    INVALID_CODE,
    AFTER_HOURS,
    WEATHER,
    NO_RIDE_START,
    NO_BOUNTY,
    LOCATION_SERVICES_REQUIRED,
    RESERVED,
    ALREADY_HAS_RESERVATION,
    INACCESSIBLE_PRIVATE,
    OUTSIDE_SERVICE_AREA,
    INSIDE_NO_RIDE_ZONE,
    SUBMERGED,
    TOTALED,
    SHOW_PRECAPTURE_MODAL,
    INCOMPATIBLE_APP,
    AVAILABLE_OUTSIDE_SERVICE_AREA,
    AVAILABLE_INSIDE_NO_RIDE_ZONE,
    UNAVAILABLE_TO_GUEST,
    AWAITING_TASK,
    UNKNOWN;

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
