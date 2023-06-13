package co.bird.android.model.analytics;

import co.bird.android.model.SystemSettingsReason;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/SystemSettingsNavigated;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "reason", "Lco/bird/android/model/SystemSettingsReason;", "(Lco/bird/android/model/SystemSettingsReason;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class SystemSettingsNavigated extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SystemSettingsNavigated(SystemSettingsReason reason) {
        super(Type.SYSTEM_SETTINGS_NAVIGATED, null, 2, null);
        Intrinsics.checkNotNullParameter(reason, "reason");
        getProperties().put(Stripe3ds2AuthParams.FIELD_SOURCE, reason.name());
    }
}
