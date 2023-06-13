package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/UserMarkedDispatchBirdMissing;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "birdCode", "", "dispatchId", "message", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class UserMarkedDispatchBirdMissing extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserMarkedDispatchBirdMissing(String birdCode, String dispatchId, String message) {
        super(Type.USER_MARKED_DISPATCH_BIRD_MISSING, null, 2, null);
        Intrinsics.checkNotNullParameter(birdCode, "birdCode");
        Intrinsics.checkNotNullParameter(dispatchId, "dispatchId");
        Intrinsics.checkNotNullParameter(message, "message");
        getProperties().put("bird_code", birdCode);
        getProperties().put("dispatch_id", dispatchId);
        getProperties().put("message", message);
    }
}
