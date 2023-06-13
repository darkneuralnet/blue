package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/PaymentMethodAdded;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "tokenizationMethod", "", "(Ljava/lang/String;)V", "getTokenizationMethod", "()Ljava/lang/String;", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class PaymentMethodAdded extends LegacyAnalyticsEvent {
    private final String tokenizationMethod;

    public PaymentMethodAdded() {
        this(null, 1, null);
    }

    public final String getTokenizationMethod() {
        return this.tokenizationMethod;
    }

    public PaymentMethodAdded(String str) {
        super(Type.PAYMENT_METHOD_ADDED, null, 2, null);
        this.tokenizationMethod = str;
        getProperties().put("Tokenization Method", str == null ? "" : str);
    }

    public /* synthetic */ PaymentMethodAdded(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
