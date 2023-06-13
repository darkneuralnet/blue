package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRidePrice;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/analytics/RideEndFlow;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "ride", "Lco/bird/android/model/wire/WireRide;", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "isBluetooth", "", "isCellular", "duration", "", "(Lco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;ZZD)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideEndFlow extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideEndFlow(WireRide ride, WireRidePrice ridePrice, boolean z, boolean z2, double d) {
        super(Type.RIDE_END_FLOW, null, 2, null);
        String str;
        int minutes;
        double miles;
        double dollars;
        String legacyAnalyticsEventKt;
        String legacyAnalyticsEventKt2;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
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
        getProperties().put("bird_bluetooth", Boolean.valueOf(z));
        getProperties().put("bird_cellular", Boolean.valueOf(z2));
        getProperties().put("operation_time", Double.valueOf(d));
        Map<String, Object> properties3 = getProperties();
        minutes = LegacyAnalyticsEventKt.minutes(ride.durationSeconds());
        properties3.put("Minutes", Integer.valueOf(minutes));
        Map<String, Object> properties4 = getProperties();
        miles = LegacyAnalyticsEventKt.miles(ride.getDistance());
        properties4.put("Miles", Double.valueOf(miles));
        Map<String, Object> properties5 = getProperties();
        dollars = LegacyAnalyticsEventKt.dollars(ride.getCost());
        properties5.put("Dollars", Double.valueOf(dollars));
        getProperties().put("total_price", Integer.valueOf(ride.getCost()));
        getProperties().put("distance", Double.valueOf(ride.getDistance()));
        getProperties().put("duration", Integer.valueOf(ride.durationSeconds()));
        getProperties().put("ride_id", ride.getId());
        getProperties().put("partner_id", String.valueOf(ride.getPartnerId()));
        Map<String, Object> properties6 = getProperties();
        legacyAnalyticsEventKt = LegacyAnalyticsEventKt.toString(ride.getStartedAt());
        properties6.put("start_time", legacyAnalyticsEventKt);
        Map<String, Object> properties7 = getProperties();
        DateTime completedAt = ride.getCompletedAt();
        legacyAnalyticsEventKt2 = LegacyAnalyticsEventKt.toString(completedAt == null ? ride.getCanceledAt() : completedAt);
        properties7.put("end_time", legacyAnalyticsEventKt2);
    }
}
