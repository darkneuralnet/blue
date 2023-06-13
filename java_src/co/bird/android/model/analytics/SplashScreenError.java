package co.bird.android.model.analytics;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\tB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\u00020\b*\u00020\u0005H\u0002¨\u0006\n"}, m28432d2 = {"Lco/bird/android/model/analytics/SplashScreenError;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "error", "Lco/bird/android/model/analytics/SplashScreenError$ErrorType;", "throwable", "", "(Lco/bird/android/model/analytics/SplashScreenError$ErrorType;Ljava/lang/Throwable;)V", "details", "", "ErrorType", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SplashScreenError\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SplashScreenError extends LegacyAnalyticsEvent {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m28432d2 = {"Lco/bird/android/model/analytics/SplashScreenError$ErrorType;", "", "(Ljava/lang/String;I)V", "REACTIVE_NETWORK_OFFLINE", "FAILED_CONFIG_FETCH", "FAILED_CONFIG_AND_USER_FETCH", "FAILED_CONFIG_FETCH_FOR_ONBOARDING", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes4.dex */
    public enum ErrorType {
        REACTIVE_NETWORK_OFFLINE,
        FAILED_CONFIG_FETCH,
        FAILED_CONFIG_AND_USER_FETCH,
        FAILED_CONFIG_FETCH_FOR_ONBOARDING
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenError(ErrorType error, Throwable th) {
        super(Type.SPLASH_SCREEN_ERROR, null, 2, null);
        Intrinsics.checkNotNullParameter(error, "error");
        Map<String, Object> properties = getProperties();
        String lowerCase = error.name().toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        properties.put("error", lowerCase);
        if (th != null) {
            getProperties().put("details", details(th));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r0 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String details(Throwable th) {
        String str;
        Throwable cause = th.getCause();
        if (cause != null) {
            str = " >> caused by " + cause;
        }
        str = "";
        return th + str;
    }

    public /* synthetic */ SplashScreenError(ErrorType errorType, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(errorType, (i & 2) != 0 ? null : th);
    }
}
