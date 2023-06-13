package co.bird.android.model.analytics;

import co.bird.android.model.BountyBirdsFilter;
import co.bird.android.model.BountyOption;
import co.bird.android.model.Deal;
import co.bird.android.model.ReservationPrice;
import co.bird.android.model.wire.WireRidePrice;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.joda.time.DateTime;
@Metadata(m28433d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a \u0010\t\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\u001a \u0010\u0010\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a \u0010\u0013\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a \u0010\u0016\u001a\u00020\n*\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002\u001a\u000e\u0010\u0019\u001a\u00020\f*\u0004\u0018\u00010\u001aH\u0002¨\u0006\u001b"}, m28432d2 = {"dollars", "", "cents", "", "miles", "meters", "minutes", "", "seconds", "addBountyFilter", "", "", "", "", "bountyFilter", "Lco/bird/android/model/BountyBirdsFilter;", "addDeal", "deal", "Lco/bird/android/model/Deal;", "addReservationPrice", "reservationPrice", "Lco/bird/android/model/ReservationPrice;", "addRidePrice", "ridePrice", "Lco/bird/android/model/wire/WireRidePrice;", "toString", "Lorg/joda/time/DateTime;", "model-analytics_release"}, m28431k = 2, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/LegacyAnalyticsEventKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class LegacyAnalyticsEventKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addBountyFilter(Map<String, Object> map, BountyBirdsFilter bountyBirdsFilter) {
        map.put("charge", Boolean.valueOf(bountyBirdsFilter.getIncludedBountyOptions().contains(BountyOption.CHARGE)));
        map.put("damage_charge", Boolean.valueOf(bountyBirdsFilter.getIncludedBountyOptions().contains(BountyOption.DAMAGED_CHARGE)));
        map.put("move", Boolean.valueOf(bountyBirdsFilter.getIncludedBountyOptions().contains(BountyOption.REBALANCE)));
        map.put("damage_move", Boolean.valueOf(bountyBirdsFilter.getIncludedBountyOptions().contains(BountyOption.DAMAGED_TRANSPORT)));
        map.put("lastRiddenMin", bountyBirdsFilter.getLastRiddenMillisAgo().getMin());
        map.put("lastRiddenMax", bountyBirdsFilter.getLastRiddenMillisAgo().getMax());
        map.put("lastLocatedMin", bountyBirdsFilter.getLastLocatedMillisAgo().getMin());
        map.put("lastLocatedMax", bountyBirdsFilter.getLastLocatedMillisAgo().getMax());
        map.put("priceMin", bountyBirdsFilter.getPrice().getMin());
        map.put("priceMax", bountyBirdsFilter.getPrice().getMax());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addDeal(Map<String, Object> map, Deal deal) {
        map.put("deal_id", deal.getId());
        map.put("deal_name", deal.getTitle());
        map.put("amount", Integer.valueOf(deal.getAddAmount()));
        map.put("deal_duration", Integer.valueOf(deal.getDuration()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addReservationPrice(Map<String, Object> map, ReservationPrice reservationPrice) {
        map.put("reservation_start_price", Long.valueOf(reservationPrice.getBasePrice()));
        map.put("reservation_minute_price", Long.valueOf(reservationPrice.getMinutePrice()));
        map.put("reservation_currency", reservationPrice.getCurrency());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addRidePrice(Map<String, Object> map, WireRidePrice wireRidePrice) {
        map.put("currency", wireRidePrice.getCurrency());
        map.put("start_price", Long.valueOf(wireRidePrice.getBasePrice()));
        map.put("minute_price", Long.valueOf(wireRidePrice.getMinutePrice()));
        map.put("minimum_ride_price", Long.valueOf(wireRidePrice.getMinimumPrice()));
        map.put("minutes_included", Integer.valueOf(wireRidePrice.getIncludedMinutes()));
        map.put("sales_tax", Boolean.valueOf(wireRidePrice.getSalesTax()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated(message = "This function assumes USD. We can no longer assume USD as the currency.")
    public static final double dollars(long j) {
        return j / 100.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double miles(double d) {
        return d / 1609.34d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int minutes(int i) {
        return i / 60;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String toString(DateTime dateTime) {
        return String.valueOf(dateTime != null ? Double.valueOf(dateTime.getMillis() / 1000.0d) : null);
    }
}
