package co.bird.android.model.analytics;

import co.bird.android.model.BountyBirdsFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/BountyMapFilterParametersChanged;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "enableBirdTypeFilter", "", "bountyFilter", "Lco/bird/android/model/BountyBirdsFilter;", "(ZLco/bird/android/model/BountyBirdsFilter;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class BountyMapFilterParametersChanged extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BountyMapFilterParametersChanged(boolean z, BountyBirdsFilter bountyFilter) {
        super(Type.BOUNTY_MAP_FILTER_PARAMETERS_CHANGED, null, 2, null);
        Intrinsics.checkNotNullParameter(bountyFilter, "bountyFilter");
        getProperties().put("enable_bird_type_filter", Boolean.valueOf(z));
        LegacyAnalyticsEventKt.addBountyFilter(getProperties(), bountyFilter);
    }
}
