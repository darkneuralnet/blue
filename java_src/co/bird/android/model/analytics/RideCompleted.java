package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRidePrice;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/analytics/RideCompleted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "Lco/bird/android/model/analytics/RecurrentNthEvent;", "Lco/bird/android/model/analytics/UserPropertyProvider;", "birdModel", "", "lat", "", "lon", "ride", "Lco/bird/android/model/wire/WireRide;", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "(Ljava/lang/String;DDLco/bird/android/model/wire/WireRide;Lco/bird/android/model/wire/WireRidePrice;)V", "brazeKey", "charge", "()Ljava/lang/Double;", "getUserProperty", "Lco/bird/android/model/analytics/PersistentPropertyEntry;", "increment", "", "nthEvent", "count", "", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideCompleted extends LegacyAnalyticsEvent implements RecurrentNthEvent, UserPropertyProvider {
    private final WireRide ride;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCompleted(String str, double d, double d2, WireRide ride, WireRidePrice ridePrice) {
        super(Type.RIDE_COMPLETED, null, 2, null);
        int minutes;
        double miles;
        double dollars;
        String legacyAnalyticsEventKt;
        String legacyAnalyticsEventKt2;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        this.ride = ride;
        Map<String, Object> properties = getProperties();
        minutes = LegacyAnalyticsEventKt.minutes(ride.durationSeconds());
        properties.put("Minutes", Integer.valueOf(minutes));
        Map<String, Object> properties2 = getProperties();
        miles = LegacyAnalyticsEventKt.miles(ride.getDistance());
        properties2.put("Miles", Double.valueOf(miles));
        Map<String, Object> properties3 = getProperties();
        dollars = LegacyAnalyticsEventKt.dollars(ride.getCost());
        properties3.put("Dollars", Double.valueOf(dollars));
        getProperties().put("birdModel", String.valueOf(str));
        getProperties().put("latitude", Double.valueOf(d));
        getProperties().put("longitude", Double.valueOf(d2));
        getProperties().put("total_price", Integer.valueOf(ride.getCost()));
        getProperties().put("distance", Double.valueOf(ride.getDistance()));
        getProperties().put("duration", Integer.valueOf(ride.durationSeconds()));
        getProperties().put("ride_id", ride.getId());
        getProperties().put("partner_id", String.valueOf(ride.getPartnerId()));
        Map<String, Object> properties4 = getProperties();
        legacyAnalyticsEventKt = LegacyAnalyticsEventKt.toString(ride.getStartedAt());
        properties4.put("start_time", legacyAnalyticsEventKt);
        Map<String, Object> properties5 = getProperties();
        DateTime completedAt = ride.getCompletedAt();
        legacyAnalyticsEventKt2 = LegacyAnalyticsEventKt.toString(completedAt == null ? ride.getCanceledAt() : completedAt);
        properties5.put("end_time", legacyAnalyticsEventKt2);
        LegacyAnalyticsEventKt.addRidePrice(getProperties(), ridePrice);
    }

    @Override // co.bird.android.model.analytics.LegacyAnalyticsEvent, co.bird.android.model.analytics.BrazeableEvent
    public String brazeKey() {
        return "mobile_ride_complete";
    }

    @Override // co.bird.android.model.analytics.LegacyAnalyticsEvent, co.bird.android.model.analytics.ChargeableEvent
    public Double charge() {
        double dollars;
        dollars = LegacyAnalyticsEventKt.dollars(this.ride.getCost());
        return Double.valueOf(dollars);
    }

    @Override // co.bird.android.model.analytics.UserPropertyProvider
    public PersistentPropertyEntry getUserProperty() {
        return new LastRideDate();
    }

    @Override // co.bird.android.model.analytics.LegacyAnalyticsEvent, co.bird.android.model.analytics.IncrementableEvent
    public Map<String, Double> increment() {
        int minutes;
        double miles;
        double dollars;
        Map<String, Double> mapOf;
        minutes = LegacyAnalyticsEventKt.minutes(this.ride.durationSeconds());
        miles = LegacyAnalyticsEventKt.miles(this.ride.getDistance());
        dollars = LegacyAnalyticsEventKt.dollars(this.ride.getCost());
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("Total Ride Minutes", Double.valueOf(minutes)), TuplesKt.m28425to("Total Ride Miles", Double.valueOf(miles)), TuplesKt.m28425to("Total Ride Dollars", Double.valueOf(dollars)));
        return mapOf;
    }

    @Override // co.bird.android.model.analytics.RecurrentNthEvent
    public LegacyAnalyticsEvent nthEvent(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 10) {
                        return null;
                    }
                    return new TenthRide();
                }
                return new ThirdRide();
            }
            return new SecondRide();
        }
        return new FirstRide();
    }
}
