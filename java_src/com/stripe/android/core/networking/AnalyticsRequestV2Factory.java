package com.stripe.android.core.networking;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.utils.ContextUtils;
import com.stripe.android.core.utils.PluginDetector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ0\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0016\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000fH\u0002R\u0016\u0010\t\u001a\n \n*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "clientId", "", AnalyticsRequestV2.HEADER_ORIGIN, "pluginType", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "appContext", "kotlin.jvm.PlatformType", "createRequest", "Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "eventName", "additionalParams", "", "includeSDKParams", "", "getAppName", "", "sdkParams", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public final class AnalyticsRequestV2Factory {
    public static final Companion Companion = new Companion(null);
    public static final String PARAM_PACKAGE_NAME = "package_name";
    public static final String PARAM_PLATFORM_INFO = "platform_info";
    public static final String PARAM_PLUGIN_TYPE = "plugin_type";
    public static final String PARAM_SDK_PLATFORM = "sdk_platform";
    public static final String PARAM_SDK_VERSION = "sdk_version";
    public static final String PLUGIN_NATIVE = "native";
    private final Context appContext;
    private final String clientId;
    private final String origin;
    private final String pluginType;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2Factory$Companion;", "", "()V", "PARAM_PACKAGE_NAME", "", "PARAM_PLATFORM_INFO", "PARAM_PLUGIN_TYPE", "PARAM_SDK_PLATFORM", "PARAM_SDK_VERSION", "PLUGIN_NATIVE", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AnalyticsRequestV2Factory(Context context, String clientId, String origin, String pluginType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(pluginType, "pluginType");
        this.clientId = clientId;
        this.origin = origin;
        this.pluginType = pluginType;
        this.appContext = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnalyticsRequestV2 createRequest$default(AnalyticsRequestV2Factory analyticsRequestV2Factory, String str, Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt__MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return analyticsRequestV2Factory.createRequest(str, map, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CharSequence getAppName() {
        CharSequence charSequence;
        boolean z;
        boolean isBlank;
        ApplicationInfo applicationInfo;
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(appContext);
        CharSequence charSequence2 = null;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(this.appContext.getPackageManager());
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
                    String packageName = this.appContext.getPackageName();
                    Intrinsics.checkNotNullExpressionValue(packageName, "appContext.packageName");
                    return packageName;
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

    private final Map<String, Object> sdkParams() {
        Integer num;
        Map mapOf;
        Map<String, Object> mapOf2;
        Pair[] pairArr = new Pair[8];
        pairArr[0] = TuplesKt.m28425to(AnalyticsFields.OS_VERSION, Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[1] = TuplesKt.m28425to(PARAM_SDK_PLATFORM, "android");
        pairArr[2] = TuplesKt.m28425to(PARAM_SDK_VERSION, "20.21.0");
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        pairArr[3] = TuplesKt.m28425to(AnalyticsFields.DEVICE_TYPE, str + "_" + str2 + "_" + str3);
        pairArr[4] = TuplesKt.m28425to(AnalyticsFields.APP_NAME, getAppName());
        ContextUtils contextUtils = ContextUtils.INSTANCE;
        Context appContext = this.appContext;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        PackageInfo packageInfo = contextUtils.getPackageInfo(appContext);
        if (packageInfo != null) {
            num = Integer.valueOf(packageInfo.versionCode);
        } else {
            num = null;
        }
        pairArr[5] = TuplesKt.m28425to(AnalyticsFields.APP_VERSION, num);
        pairArr[6] = TuplesKt.m28425to(PARAM_PLUGIN_TYPE, this.pluginType);
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(PARAM_PACKAGE_NAME, this.appContext.getPackageName()));
        pairArr[7] = TuplesKt.m28425to(PARAM_PLATFORM_INFO, mapOf);
        mapOf2 = MapsKt__MapsKt.mapOf(pairArr);
        return mapOf2;
    }

    public final AnalyticsRequestV2 createRequest(String eventName, Map<String, ? extends Object> additionalParams, boolean z) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(additionalParams, "additionalParams");
        String str = this.clientId;
        String str2 = this.origin;
        if (z) {
            additionalParams = MapsKt__MapsKt.plus(additionalParams, sdkParams());
        }
        return new AnalyticsRequestV2(eventName, str, str2, additionalParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AnalyticsRequestV2Factory(Context context, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, str3);
        if ((i & 8) != 0 && (str3 = PluginDetector.INSTANCE.getPluginType()) == null) {
            str3 = PLUGIN_NATIVE;
        }
    }
}
