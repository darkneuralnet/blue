package com.stripe.android.networking;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.core.utils.ContextUtils;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B)\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002J#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0013J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\bH\u0002R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "displayMetrics", "Landroid/util/DisplayMetrics;", "packageName", "", "versionName", "timeZone", "(Landroid/util/DisplayMetrics;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "androidVersionString", "screen", "createFirstMap", "", "createParams", "fraudDetectionData", "Lcom/stripe/android/networking/FraudDetectionData;", "createParams$payments_core_release", "createSecondMap", "createValueMap", "value", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nFraudDetectionDataRequestParamsFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FraudDetectionDataRequestParamsFactory.kt\ncom/stripe/android/networking/FraudDetectionDataRequestParamsFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* loaded from: classes7.dex */
public final class FraudDetectionDataRequestParamsFactory {
    private static final Companion Companion = new Companion(null);
    private final String androidVersionString;
    private final DisplayMetrics displayMetrics;
    private final String packageName;
    private final String screen;
    private final String timeZone;
    private final String versionName;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/networking/FraudDetectionDataRequestParamsFactory$Companion;", "", "()V", "createTimezone", "", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createTimezone() {
            int convert = (int) TimeUnit.MINUTES.convert(TimeZone.getDefault().getRawOffset(), TimeUnit.MILLISECONDS);
            if (convert % 60 == 0) {
                return String.valueOf(convert / 60);
            }
            String bigDecimal = new BigDecimal(convert).setScale(2, 6).divide(new BigDecimal(60), new MathContext(2)).setScale(2, 6).toString();
            Intrinsics.checkNotNullExpressionValue(bigDecimal, "decHours.toString()");
            return bigDecimal;
        }

        private Companion() {
        }
    }

    public FraudDetectionDataRequestParamsFactory(DisplayMetrics displayMetrics, String packageName, String str, String timeZone) {
        Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(timeZone, "timeZone");
        this.displayMetrics = displayMetrics;
        this.packageName = packageName;
        this.versionName = str;
        this.timeZone = timeZone;
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        int i3 = displayMetrics.densityDpi;
        this.screen = i + "w_" + i2 + "h_" + i3 + "dpi";
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        int i4 = Build.VERSION.SDK_INT;
        this.androidVersionString = "Android " + str2 + " " + str3 + " " + i4;
    }

    private final Map<String, Object> createFirstMap() {
        Map<String, Object> mapOf;
        String locale = Locale.getDefault().toString();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault().toString()");
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("c", createValueMap(locale)), TuplesKt.m28425to(DateTokenConverter.CONVERTER_KEY, createValueMap(this.androidVersionString)), TuplesKt.m28425to("f", createValueMap(this.screen)), TuplesKt.m28425to("g", createValueMap(this.timeZone)));
        return mapOf;
    }

    private final Map<String, Object> createSecondMap(FraudDetectionData fraudDetectionData) {
        String str;
        String str2;
        Map mapOf;
        Map<String, Object> plus;
        Pair[] pairArr = new Pair[9];
        Map map = null;
        if (fraudDetectionData != null) {
            str = fraudDetectionData.getMuid$payments_core_release();
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = TuplesKt.m28425to(DateTokenConverter.CONVERTER_KEY, str);
        if (fraudDetectionData != null) {
            str2 = fraudDetectionData.getSid$payments_core_release();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            str3 = str2;
        }
        pairArr[1] = TuplesKt.m28425to("e", str3);
        pairArr[2] = TuplesKt.m28425to("k", this.packageName);
        pairArr[3] = TuplesKt.m28425to("o", Build.VERSION.RELEASE);
        pairArr[4] = TuplesKt.m28425to("p", Integer.valueOf(Build.VERSION.SDK_INT));
        pairArr[5] = TuplesKt.m28425to("q", Build.MANUFACTURER);
        pairArr[6] = TuplesKt.m28425to("r", Build.BRAND);
        pairArr[7] = TuplesKt.m28425to("s", Build.MODEL);
        pairArr[8] = TuplesKt.m28425to("t", Build.TAGS);
        mapOf = MapsKt__MapsKt.mapOf(pairArr);
        String str4 = this.versionName;
        if (str4 != null) {
            map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("l", str4));
        }
        if (map == null) {
            map = MapsKt__MapsKt.emptyMap();
        }
        plus = MapsKt__MapsKt.plus(mapOf, map);
        return plus;
    }

    private final Map<String, Object> createValueMap(String str) {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("v", str));
        return mapOf;
    }

    public final /* synthetic */ Map createParams$payments_core_release(FraudDetectionData fraudDetectionData) {
        Map mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("v2", 1), TuplesKt.m28425to("tag", "20.21.0"), TuplesKt.m28425to("src", "android-sdk"), TuplesKt.m28425to(C17296a.f69688o, createFirstMap()), TuplesKt.m28425to("b", createSecondMap(fraudDetectionData)));
        return mapOf;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FraudDetectionDataRequestParamsFactory(Context context) {
        this(r0, r1, r4 != null ? r4.versionName : null, Companion.createTimezone());
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "context.resources.displayMetrics");
        String packageName = context.getPackageName();
        packageName = packageName == null ? "" : packageName;
        PackageInfo packageInfo = ContextUtils.INSTANCE.getPackageInfo(context);
    }
}
