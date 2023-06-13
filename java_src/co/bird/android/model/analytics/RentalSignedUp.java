package co.bird.android.model.analytics;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/analytics/RentalSignedUp;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "planId", "", "windowId", "(Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RentalSignedUp extends LegacyAnalyticsEvent {
    public RentalSignedUp(String str, String str2) {
        super(Type.RENTAL_SIGNED_UP, null, 2, null);
        getProperties().put("plan_id", String.valueOf(str));
        getProperties().put("window_id", String.valueOf(str2));
    }
}
