package co.bird.android.model.analytics;

import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/GooglePayAuthSheetPresented;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "currency", "Ljava/util/Currency;", "price", "", "(Ljava/util/Currency;Ljava/lang/Long;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public final class GooglePayAuthSheetPresented extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GooglePayAuthSheetPresented(Currency currency, Long l) {
        super(Type.GOOGLE_PAY_AUTH_SHEET_PRESENTED, null, 2, null);
        Intrinsics.checkNotNullParameter(currency, "currency");
        Map<String, Object> properties = getProperties();
        String currencyCode = currency.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "currency.currencyCode");
        properties.put("Currency", currencyCode);
        if (l != null) {
            getProperties().put("Price", Long.valueOf(l.longValue()));
        }
    }

    public /* synthetic */ GooglePayAuthSheetPresented(Currency currency, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(currency, (i & 2) != 0 ? null : l);
    }
}
