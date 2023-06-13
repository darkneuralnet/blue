package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRidePrice;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/analytics/RideRated;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "rating", "", "ride", "Lco/bird/android/model/wire/WireRide;", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "(FLco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideRated extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideRated(float f, WireRide wireRide, WireRidePrice ridePrice) {
        super(Type.RIDE_RATED, null, 2, null);
        Integer num;
        Double d;
        Integer num2;
        String str;
        String str2;
        DateTime dateTime;
        String legacyAnalyticsEventKt;
        String legacyAnalyticsEventKt2;
        DateTime completedAt;
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        DateTime dateTime2 = null;
        getProperties().put("Rating", Float.valueOf(f));
        getProperties().put("rating", Float.valueOf(f));
        Map<String, Object> properties = getProperties();
        if (wireRide != null) {
            num = Integer.valueOf(wireRide.getCost());
        } else {
            num = null;
        }
        properties.put("total_price", String.valueOf(num));
        Map<String, Object> properties2 = getProperties();
        if (wireRide != null) {
            d = Double.valueOf(wireRide.getDistance());
        } else {
            d = null;
        }
        properties2.put("distance", String.valueOf(d));
        Map<String, Object> properties3 = getProperties();
        if (wireRide != null) {
            num2 = Integer.valueOf(wireRide.durationSeconds());
        } else {
            num2 = null;
        }
        properties3.put("duration", String.valueOf(num2));
        Map<String, Object> properties4 = getProperties();
        if (wireRide != null) {
            str = wireRide.getId();
        } else {
            str = null;
        }
        properties4.put("ride_id", String.valueOf(str));
        Map<String, Object> properties5 = getProperties();
        if (wireRide != null) {
            str2 = wireRide.getPartnerId();
        } else {
            str2 = null;
        }
        properties5.put("partner_id", String.valueOf(str2));
        Map<String, Object> properties6 = getProperties();
        if (wireRide != null) {
            dateTime = wireRide.getStartedAt();
        } else {
            dateTime = null;
        }
        legacyAnalyticsEventKt = LegacyAnalyticsEventKt.toString(dateTime);
        properties6.put("start_time", legacyAnalyticsEventKt);
        Map<String, Object> properties7 = getProperties();
        if (wireRide != null && (completedAt = wireRide.getCompletedAt()) != null) {
            dateTime2 = completedAt;
        } else if (wireRide != null) {
            dateTime2 = wireRide.getCanceledAt();
        }
        legacyAnalyticsEventKt2 = LegacyAnalyticsEventKt.toString(dateTime2);
        properties7.put("end_time", legacyAnalyticsEventKt2);
        LegacyAnalyticsEventKt.addRidePrice(getProperties(), ridePrice);
    }
}
