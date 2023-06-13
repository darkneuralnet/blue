package co.bird.android.model.analytics;

import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireRidePrice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m28432d2 = {"Lco/bird/android/model/analytics/RideStartFailed;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "bird", "Lco/bird/android/model/wire/WireBird;", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "isBluetooth", "", "isCellular", "duration", "", "error", "", "(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/wire/WireRidePrice;ZZDLjava/lang/Throwable;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RideStartFailed extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideStartFailed(WireBird bird, WireRidePrice ridePrice, boolean z, boolean z2, double d, Throwable error) {
        super(Type.RIDE_START_FAILED, null, 2, null);
        Intrinsics.checkNotNullParameter(bird, "bird");
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(error, "error");
        getProperties().put("birdModel", String.valueOf(bird.getModel()));
        getProperties().put("bird_code", bird.getCode());
        getProperties().put("operation_time", Double.valueOf(d));
        getProperties().put("bird_bluetooth", Boolean.valueOf(z));
        getProperties().put("bird_cellular", Boolean.valueOf(z2));
        getProperties().put("error", String.valueOf(error.getMessage()));
        getProperties().put("error_type", String.valueOf(Reflection.getOrCreateKotlinClass(error.getClass()).getSimpleName()));
        LegacyAnalyticsEventKt.addRidePrice(getProperties(), ridePrice);
    }
}
