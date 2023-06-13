package co.bird.android.model.analytics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/model/analytics/SplashScreenNavigation;", "Lco/bird/android/model/analytics/LegacyAnalyticsEvent;", "navigatedTo", "", "tag", "(Ljava/lang/String;Ljava/lang/String;)V", "model-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nLegacyAnalyticsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyAnalyticsEvent.kt\nco/bird/android/model/analytics/SplashScreenNavigation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1309:1\n1#2:1310\n*E\n"})
/* loaded from: classes4.dex */
public final class SplashScreenNavigation extends LegacyAnalyticsEvent {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenNavigation(String navigatedTo, String str) {
        super(Type.SPLASH_SCREEN_NAVIGATION, null, 2, null);
        Intrinsics.checkNotNullParameter(navigatedTo, "navigatedTo");
        getProperties().put("navigated_to", navigatedTo);
        if (str != null) {
            getProperties().put("tag", str);
        }
    }

    public /* synthetic */ SplashScreenNavigation(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
