package co.bird.android.model.analytics;

import com.stripe.android.model.PaymentMethodOptionsParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m28432d2 = {"Lco/bird/android/model/analytics/FreeRideCodeEntered;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "(Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class FreeRideCodeEntered extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreeRideCodeEntered(String code) {
        super(Type.FREE_RIDE_CODE_ENTERED, null, 2, null);
        Intrinsics.checkNotNullParameter(code, "code");
        getProperties().put("Code", code);
    }
}
