package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m28432d2 = {"Lco/bird/android/model/analytics/PersistentType;", "", "(Ljava/lang/String;I)V", "key", "", "LAST_RIDE_DATE", "GOOGLE_PAY_ELIGIBLE", "GOOGLE_PAY_ENABLED", "NETWORK_TYPE", "NETWORK_SUBTYPE", "BLUETOOTH_STATE", "APP_NAME", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public enum PersistentType {
    LAST_RIDE_DATE,
    GOOGLE_PAY_ELIGIBLE,
    GOOGLE_PAY_ENABLED,
    NETWORK_TYPE,
    NETWORK_SUBTYPE,
    BLUETOOTH_STATE,
    APP_NAME;

    public final String key() {
        String lowerCase = name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
}
