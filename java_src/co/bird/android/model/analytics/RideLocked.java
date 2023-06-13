package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireRide;
import co.bird.android.model.wire.WireRidePrice;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/analytics/RideLocked;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "birdModel", "", "lat", "", "lon", "ride", "Lco/bird/android/model/wire/WireRide;", "isBluetooth", "", "isCellular", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "duration", "(Ljava/lang/String;DDLco/bird/android/model/wire/WireRide;ZZLco/bird/android/model/wire/WireRidePrice;D)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideLocked extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideLocked(String str, double d, double d2, WireRide ride, boolean z, boolean z2, WireRidePrice ridePrice, double d3) {
        super(Type.RIDE_LOCKED, null, 2, null);
        String legacyAnalyticsEventKt;
        Intrinsics.checkNotNullParameter(ride, "ride");
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        getProperties().put("birdModel", String.valueOf(str));
        getProperties().put("latitude", Double.valueOf(d));
        getProperties().put("longitude", Double.valueOf(d2));
        getProperties().put("ride_id", ride.getId());
        getProperties().put("partner_id", String.valueOf(ride.getPartnerId()));
        Map<String, Object> properties = getProperties();
        legacyAnalyticsEventKt = LegacyAnalyticsEventKt.toString(ride.getStartedAt());
        properties.put("start_time", legacyAnalyticsEventKt);
        getProperties().put("bird_bluetooth", Boolean.valueOf(z));
        getProperties().put("bird_cellular", Boolean.valueOf(z2));
        getProperties().put("operation_time", Double.valueOf(d3));
        LegacyAnalyticsEventKt.addRidePrice(getProperties(), ridePrice);
    }
}
