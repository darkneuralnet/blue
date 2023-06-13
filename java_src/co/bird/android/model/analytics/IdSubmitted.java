package co.bird.android.model.analytics;

import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/analytics/IdSubmitted;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lco/bird/android/model/analytics/IdSubmitted$IdSource;", "(Lco/bird/android/model/analytics/IdSubmitted$IdSource;)V", "IdSource", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class IdSubmitted extends LegacyAnalyticsEvent {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/IdSubmitted$IdSource;", "", "(Ljava/lang/String;I)V", "SCAN", "MANUAL", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum IdSource {
        SCAN,
        MANUAL
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdSubmitted(IdSource source) {
        super(Type.ID_SUBMITTED, null, 2, null);
        Intrinsics.checkNotNullParameter(source, "source");
        getProperties().put(Stripe3ds2AuthParams.FIELD_SOURCE, source.name());
    }
}
