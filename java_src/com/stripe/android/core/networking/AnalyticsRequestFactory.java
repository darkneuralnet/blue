package com.stripe.android.core.networking;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestHeadersFactory;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 %2\u00020\u0001:\u0001%B1\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0019¢\u0006\u0004\b#\u0010$J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0002H\u0002J\u0014\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0002J\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002J$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestFactory;", "", "Lcom/stripe/android/core/networking/AnalyticsEvent;", "event", "", "", "createParams", "params", "standardParams", "Landroid/content/pm/PackageInfo;", "packageInfo", "Landroid/content/pm/PackageManager;", "packageManager", "", "getAppName", "additionalParams", "Lcom/stripe/android/core/networking/AnalyticsRequest;", "createRequest", "appDataParams$stripe_core_release", "()Ljava/util/Map;", "appDataParams", "Landroid/content/pm/PackageManager;", "Landroid/content/pm/PackageInfo;", "packageName", "Ljava/lang/String;", "LY94;", "publishableKeyProvider", "LY94;", "Ljava/util/UUID;", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "getSessionId$annotations", "()V", "<init>", "(Landroid/content/pm/PackageManager;Landroid/content/pm/PackageInfo;Ljava/lang/String;LY94;)V", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class AnalyticsRequestFactory {
    private static final String ANALYTICS_NAME = "stripe_android";
    private static final String ANALYTICS_PREFIX = "analytics";
    public static final String ANALYTICS_UA = "analytics.stripe_android-1.0";
    private static final String ANALYTICS_VERSION = "1.0";
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_TYPE = Build.MANUFACTURER + "_" + Build.BRAND + "_" + Build.MODEL;
    private final PackageInfo packageInfo;
    private final PackageManager packageManager;
    private final String packageName;
    private final Y94<String> publishableKeyProvider;
    private final UUID sessionId;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestFactory$Companion;", "", "()V", "ANALYTICS_NAME", "", "ANALYTICS_PREFIX", "ANALYTICS_UA", "ANALYTICS_VERSION", "DEVICE_TYPE", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AnalyticsRequestFactory(PackageManager packageManager, PackageInfo packageInfo, String packageName, Y94<String> publishableKeyProvider) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        this.packageManager = packageManager;
        this.packageInfo = packageInfo;
        this.packageName = packageName;
        this.publishableKeyProvider = publishableKeyProvider;
        UUID randomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(randomUUID, "randomUUID()");
        this.sessionId = randomUUID;
    }

    private final Map<String, Object> createParams(AnalyticsEvent analyticsEvent) {
        Map plus;
        Map<String, Object> plus2;
        plus = MapsKt__MapsKt.plus(standardParams(), appDataParams$stripe_core_release());
        plus2 = MapsKt__MapsKt.plus(plus, params(analyticsEvent));
        return plus2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CharSequence getAppName(PackageInfo packageInfo, PackageManager packageManager) {
        CharSequence charSequence;
        boolean z;
        boolean isBlank;
        ApplicationInfo applicationInfo;
        CharSequence charSequence2 = null;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(packageManager);
        } else {
            charSequence = null;
        }
        if (charSequence != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(charSequence);
            if (!isBlank) {
                z = false;
                if (!z) {
                    charSequence2 = charSequence;
                }
                if (charSequence2 != null) {
                    return this.packageName;
                }
                return charSequence2;
            }
        }
        z = true;
        if (!z) {
        }
        if (charSequence2 != null) {
        }
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }

    private final Map<String, String> params(AnalyticsEvent analyticsEvent) {
        Map<String, String> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("event", analyticsEvent.getEventName()));
        return mapOf;
    }

    private final Map<String, Object> standardParams() {
        Object m116783constructorimpl;
        Map<String, Object> mapOf;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = TuplesKt.m28425to(AnalyticsFields.ANALYTICS_UA, ANALYTICS_UA);
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(this.publishableKeyProvider.get());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = ApiRequest.Options.UNDEFINED_PUBLISHABLE_KEY;
        }
        pairArr[1] = TuplesKt.m28425to(AnalyticsFields.PUBLISHABLE_KEY, m116783constructorimpl);
        pairArr[2] = TuplesKt.m28425to(AnalyticsFields.OS_NAME, Build.VERSION.CODENAME);
        pairArr[3] = TuplesKt.m28425to(AnalyticsFields.OS_RELEASE, Build.VERSION.RELEASE);
        pairArr[4] = TuplesKt.m28425to(AnalyticsFields.OS_VERSION, Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[5] = TuplesKt.m28425to(AnalyticsFields.DEVICE_TYPE, DEVICE_TYPE);
        pairArr[6] = TuplesKt.m28425to(AnalyticsFields.BINDINGS_VERSION, "20.21.0");
        pairArr[7] = TuplesKt.m28425to(AnalyticsFields.IS_DEVELOPMENT, Boolean.FALSE);
        pairArr[8] = TuplesKt.m28425to(AnalyticsFields.SESSION_ID, this.sessionId);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        return mapOf;
    }

    public final Map<String, Object> appDataParams$stripe_core_release() {
        Map<String, Object> emptyMap;
        PackageInfo packageInfo;
        Map<String, Object> mapOf;
        PackageManager packageManager = this.packageManager;
        if (packageManager != null && (packageInfo = this.packageInfo) != null) {
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(AnalyticsFields.APP_NAME, getAppName(packageInfo, packageManager)), TuplesKt.m28425to(AnalyticsFields.APP_VERSION, Integer.valueOf(this.packageInfo.versionCode)));
            return mapOf;
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        return emptyMap;
    }

    public final AnalyticsRequest createRequest(AnalyticsEvent event, Map<String, ? extends Object> additionalParams) {
        Map plus;
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        plus = MapsKt__MapsKt.plus(createParams(event), additionalParams);
        return new AnalyticsRequest(plus, RequestHeadersFactory.Analytics.INSTANCE.create());
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }
}
