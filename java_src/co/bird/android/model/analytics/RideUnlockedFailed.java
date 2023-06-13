package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/analytics/RideUnlockedFailed;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "ride", "Lco/bird/android/model/wire/WireRide;", "isBluetooth", "", "isCellular", "duration", "", "error", "", "(Lco/bird/android/model/wire/WireRide;ZZDLjava/lang/Throwable;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideUnlockedFailed extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideUnlockedFailed(WireRide ride, boolean z, boolean z2, double d, Throwable error) {
        super(Type.RIDE_UNLOCKED_FAILED, null, 2, null);
        String str;
        String legacyAnalyticsEventKt;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(error, "error");
        Map<String, Object> properties = getProperties();
        WireBird bird = ride.getBird();
        if (bird != null) {
            str = bird.getModel();
        } else {
            str = null;
        }
        properties.put("birdModel", String.valueOf(str));
        Map<String, Object> properties2 = getProperties();
        WireBird bird2 = ride.getBird();
        properties2.put("bird_code", String.valueOf(bird2 != null ? bird2.getCode() : null));
        getProperties().put("ride_id", ride.getId());
        getProperties().put("partner_id", String.valueOf(ride.getPartnerId()));
        Map<String, Object> properties3 = getProperties();
        legacyAnalyticsEventKt = LegacyAnalyticsEventKt.toString(ride.getStartedAt());
        properties3.put("start_time", legacyAnalyticsEventKt);
        getProperties().put("bird_bluetooth", Boolean.valueOf(z));
        getProperties().put("bird_cellular", Boolean.valueOf(z2));
        getProperties().put("operation_time", Double.valueOf(d));
        getProperties().put("error", String.valueOf(error.getMessage()));
        getProperties().put("error_type", String.valueOf(Reflection.getOrCreateKotlinClass(error.getClass()).getSimpleName()));
    }
}
