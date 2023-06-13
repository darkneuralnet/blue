package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/ChargerSnoozeError;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "tasks", "", "error", "", "(ILjava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class ChargerSnoozeError extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargerSnoozeError(int i, String error) {
        super(Type.CHARGER_SNOOZE_ERROR, null, 2, null);
        Intrinsics.checkNotNullParameter(error, "error");
        getProperties().put("Number of Tasks", Integer.valueOf(i));
        getProperties().put("Error", error);
    }
}
