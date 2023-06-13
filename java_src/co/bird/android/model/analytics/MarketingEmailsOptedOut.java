package co.bird.android.model.analytics;

import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\b"}, m28432d2 = {"Lco/bird/android/model/analytics/MarketingEmailsOptedOut;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "agreement", "", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;", "(Ljava/lang/String;Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;)V", "Source", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class MarketingEmailsOptedOut extends LegacyAnalyticsEvent {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/MarketingEmailsOptedOut$Source;", "", "(Ljava/lang/String;I)V", "EMAIL_SIGNUP", "SETTINGS", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum Source {
        EMAIL_SIGNUP,
        SETTINGS
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketingEmailsOptedOut(String agreement, Source source) {
        super(Type.MARKETING_EMAILS_OPTED_OUT, null, 2, null);
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        Intrinsics.checkNotNullParameter(source, "source");
        Map<String, Object> properties = getProperties();
        String lowerCase = source.toString().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        properties.put(Stripe3ds2AuthParams.FIELD_SOURCE, lowerCase);
        getProperties().put("agreement", agreement);
    }
}
