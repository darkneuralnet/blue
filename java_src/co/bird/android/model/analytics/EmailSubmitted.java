package co.bird.android.model.analytics;

import java.util.Map;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/EmailSubmitted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "success", "", "(Z)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class EmailSubmitted extends LegacyAnalyticsEvent {
    public EmailSubmitted(boolean z) {
        super(Type.EMAIL_SUBMITTED, null, 2, null);
        String str;
        Map<String, Object> properties = getProperties();
        if (z) {
            str = "success";
        } else {
            str = "error";
        }
        properties.put("email_registration_status", str);
    }
}
