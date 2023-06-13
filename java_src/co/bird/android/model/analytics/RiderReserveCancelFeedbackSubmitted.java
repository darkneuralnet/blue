package co.bird.android.model.analytics;

import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/RiderReserveCancelFeedbackSubmitted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "issues", "", "", "feedback", "(Ljava/util/Set;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class RiderReserveCancelFeedbackSubmitted extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiderReserveCancelFeedbackSubmitted(Set<String> issues, String feedback) {
        super(Type.RIDER_RESERVE_CANCEL_FEEDBACK_SUBMITTED, null, 2, null);
        String joinToString$default;
        Intrinsics.checkNotNullParameter(issues, "issues");
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Map<String, Object> properties = getProperties();
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(issues, ",", null, null, 0, null, null, 62, null);
        properties.put("issues", joinToString$default);
        getProperties().put("feedback", feedback);
    }
}
