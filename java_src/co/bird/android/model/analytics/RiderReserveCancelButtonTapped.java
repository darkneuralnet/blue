package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lco/bird/android/model/analytics/RiderReserveCancelButtonTapped;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "reserveTime", "", "refunded", "", "price", "", "currency", "", "(IZJLjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderReserveCancelButtonTapped extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderReserveCancelButtonTapped(int i, boolean z, long j, String currency) {
        super(Type.RIDER_RESERVE_CANCEL_BUTTON_TAPPED, null, 2, null);
        Intrinsics.checkNotNullParameter(currency, "currency");
        getProperties().put("reserve_time", Integer.valueOf(i));
        getProperties().put("refunded", Boolean.valueOf(z));
        getProperties().put("price", Long.valueOf(j));
        getProperties().put("currency", currency);
    }
}
