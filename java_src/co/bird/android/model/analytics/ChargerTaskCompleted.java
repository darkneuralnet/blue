package co.bird.android.model.analytics;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/ChargerTaskCompleted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "Lco/bird/android/model/analytics/RecurrentNthEvent;", "()V", "nthEvent", "count", "", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ChargerTaskCompleted extends LegacyAnalyticsEvent implements RecurrentNthEvent {
    public ChargerTaskCompleted() {
        super(Type.CHARGER_TASK_COMPLETED, null, 2, null);
    }

    @Override // co.bird.android.model.analytics.RecurrentNthEvent
    public LegacyAnalyticsEvent nthEvent(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 10) {
                        if (i != 40) {
                            return null;
                        }
                        return new ChargerCompletedFortiethTask();
                    }
                    return new ChargerCompletedTenthTask();
                }
                return new ChargerCompletedThirdTask();
            }
            return new ChargerCompletedSecondTask();
        }
        return new ChargerCompletedFirstTask();
    }
}
