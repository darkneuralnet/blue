package co.bird.android.model.analytics;

import co.bird.android.model.Deal;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/model/analytics/BonusDealScreenRejected;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "deal", "Lco/bird/android/model/Deal;", "userId", "", "secondsLeft", "", "(Lco/bird/android/model/Deal;Ljava/lang/String;I)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BonusDealScreenRejected extends LegacyAnalyticsEvent {
    public BonusDealScreenRejected(Deal deal, String str, int i) {
        super(Type.BALANCESALE_SCREEN_NOTHANKS, null, 2, null);
        if (deal != null) {
            LegacyAnalyticsEventKt.addDeal(getProperties(), deal);
        }
        if (str != null) {
            getProperties().put("user_id", str);
        }
        getProperties().put("deal_duration_left", Integer.valueOf(i));
    }
}
