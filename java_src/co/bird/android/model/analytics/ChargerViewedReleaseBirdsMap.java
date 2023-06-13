package co.bird.android.model.analytics;

import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/ChargerViewedReleaseBirdsMap;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "()V", "brazeKey", "", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ChargerViewedReleaseBirdsMap extends LegacyAnalyticsEvent {
    public ChargerViewedReleaseBirdsMap() {
        super(Type.CHARGER_VIEWED_RELEASE_BIRDS_MAP, null, 2, null);
    }

    @Override // co.bird.android.model.analytics.LegacyAnalyticsEvent, co.bird.android.model.analytics.BrazeableEvent
    public String brazeKey() {
        return "CHARGER_VIEWED_RELEASE_BIRDS_MAP";
    }
}
