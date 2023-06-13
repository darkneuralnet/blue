package co.bird.android.model.analytics;

import co.bird.android.model.ReservationPrice;
import co.bird.android.model.wire.WireRidePrice;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/RiderReserveConfirmButtonTapped;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "reservationPrice", "Lco/bird/android/model/ReservationPrice;", "(Lco/bird/android/model/wire/WireRidePrice;Lco/bird/android/model/ReservationPrice;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderReserveConfirmButtonTapped extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderReserveConfirmButtonTapped(WireRidePrice ridePrice, ReservationPrice reservationPrice) {
        super(Type.RIDER_RESERVE_CONFIRM_BUTTON_TAPPED, null, 2, null);
        Intrinsics.checkNotNullParameter(ridePrice, "ridePrice");
        Intrinsics.checkNotNullParameter(reservationPrice, "reservationPrice");
        LegacyAnalyticsEventKt.addRidePrice(getProperties(), ridePrice);
        LegacyAnalyticsEventKt.addReservationPrice(getProperties(), reservationPrice);
    }
}
