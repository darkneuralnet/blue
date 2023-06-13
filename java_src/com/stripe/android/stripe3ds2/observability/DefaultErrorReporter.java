package com.stripe.android.stripe3ds2.observability;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.stripe.android.core.networking.AnalyticsFields;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.stripe3ds2.transaction.Logger;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.CloseableKt;
import org.json.JSONArray;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0003,-.BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0015H\u0001¢\u0006\u0002\b\u001aJ\u0015\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u001cJ\r\u0010\u001d\u001a\u00020\rH\u0001¢\u0006\u0002\b\u001eJ\u0010\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0010H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0017H\u0002J\b\u0010(\u001a\u00020\u0013H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010*\u001a\u00020#2\u0006\u0010+\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006/"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter;", "Lcom/stripe/android/stripe3ds2/observability/ErrorReporter;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "config", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "workContext", "Lkotlin/coroutines/CoroutineContext;", "logger", "Lcom/stripe/android/stripe3ds2/transaction/Logger;", "sentryConfig", "Lcom/stripe/android/stripe3ds2/observability/SentryConfig;", "environment", "", "localeCountry", "osVersion", "", "(Landroid/content/Context;Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/stripe3ds2/transaction/Logger;Lcom/stripe/android/stripe3ds2/observability/SentryConfig;Ljava/lang/String;Ljava/lang/String;I)V", "createPostConnection", "Ljavax/net/ssl/HttpsURLConnection;", "createRequestBody", "Lorg/json/JSONObject;", "t", "", "createRequestBody$3ds2sdk_release", "createRequestContexts", "createRequestContexts$3ds2sdk_release", "createRequestStacktrace", "createRequestStacktrace$3ds2sdk_release", "createSentryAuthHeader", "createSentryAuthHeader$3ds2sdk_release", "getResponseBody", "responseStream", "Ljava/io/InputStream;", "logResponse", "", "connection", "responseCode", "onFailure", "exception", "openConnection", "reportError", "send", "requestBody", "Companion", "Config", "EmptyConfig", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class DefaultErrorReporter implements ErrorReporter {
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    @Deprecated
    private static final String HEADER_CONTENT_TYPE = "Content-Type";
    @Deprecated
    private static final String HEADER_SENTRY_AUTH = "X-Sentry-Auth";
    @Deprecated
    private static final String HEADER_USER_AGENT = "User-Agent";
    @Deprecated
    private static final String HOST = "https://errors.stripe.com";
    @Deprecated
    private static final String HTTP_METHOD = "POST";
    @Deprecated
    private static final String USER_AGENT = "Android3ds2Sdk 6.1.7";
    private final Config config;
    private final Context context;
    private final String environment;
    private final String localeCountry;
    private final Logger logger;
    private final int osVersion;
    private final SentryConfig sentryConfig;
    private final CoroutineContext workContext;
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String CHARSET = StandardCharsets.UTF_8.name();

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Companion;", "", "()V", "CHARSET", "", "kotlin.jvm.PlatformType", "CONTENT_TYPE", "HEADER_CONTENT_TYPE", "HEADER_SENTRY_AUTH", "HEADER_USER_AGENT", "HOST", "HTTP_METHOD", "USER_AGENT", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public interface Config {
        Map<String, String> getCustomTags();
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$EmptyConfig;", "Lcom/stripe/android/stripe3ds2/observability/DefaultErrorReporter$Config;", "()V", "customTags", "", "", "getCustomTags", "()Ljava/util/Map;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class EmptyConfig implements Config {
        public static final EmptyConfig INSTANCE = new EmptyConfig();
        private static final Map<String, String> customTags;

        static {
            Map<String, String> emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            customTags = emptyMap;
        }

        private EmptyConfig() {
        }

        @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
        public Map<String, String> getCustomTags() {
            return customTags;
        }
    }

    public DefaultErrorReporter(Context context, Config config, CoroutineContext workContext, Logger logger, SentryConfig sentryConfig, String environment, String localeCountry, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(sentryConfig, "sentryConfig");
        Intrinsics.checkNotNullParameter(environment, "environment");
        Intrinsics.checkNotNullParameter(localeCountry, "localeCountry");
        this.context = context;
        this.config = config;
        this.workContext = workContext;
        this.logger = logger;
        this.sentryConfig = sentryConfig;
        this.environment = environment;
        this.localeCountry = localeCountry;
        this.osVersion = i;
    }

    private final HttpsURLConnection createPostConnection() {
        Map mapOf;
        HttpsURLConnection openConnection = openConnection();
        openConnection.setRequestMethod(HTTP_METHOD);
        openConnection.setDoOutput(true);
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("Content-Type", CONTENT_TYPE), TuplesKt.m28425to("User-Agent", USER_AGENT), TuplesKt.m28425to(HEADER_SENTRY_AUTH, createSentryAuthHeader$3ds2sdk_release()));
        for (Map.Entry entry : mapOf.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        return openConnection;
    }

    private final String getResponseBody(InputStream inputStream) {
        Object m116783constructorimpl;
        String str;
        String str2 = null;
        try {
            Result.Companion companion = Result.Companion;
            Scanner useDelimiter = new Scanner(inputStream, CHARSET).useDelimiter("\\A");
            if (useDelimiter.hasNext()) {
                str = useDelimiter.next();
            } else {
                str = null;
            }
            m116783constructorimpl = Result.m116783constructorimpl(str);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m116789isFailureimpl(m116783constructorimpl)) {
            str2 = m116783constructorimpl;
        }
        String str3 = str2;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    private final void logResponse(HttpsURLConnection httpsURLConnection, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailure(Throwable th) {
        this.logger.error("Failed to send error report.", th);
    }

    private final HttpsURLConnection openConnection() {
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL("https://errors.stripe.com/api/" + this.sentryConfig.getProjectId() + "/store/").openConnection());
        Intrinsics.checkNotNull(uRLConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
        return (HttpsURLConnection) uRLConnection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void send(JSONObject jSONObject) {
        HttpsURLConnection createPostConnection = createPostConnection();
        OutputStream os = createPostConnection.getOutputStream();
        try {
            Intrinsics.checkNotNullExpressionValue(os, "os");
            Charset UTF_8 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(os, UTF_8);
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.flush();
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(outputStreamWriter, null);
            CloseableKt.closeFinally(os, null);
            createPostConnection.connect();
            logResponse(createPostConnection, createPostConnection.getResponseCode());
            createPostConnection.disconnect();
        } finally {
        }
    }

    public final /* synthetic */ JSONObject createRequestBody$3ds2sdk_release(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject put = new JSONObject().put("release", "com.stripe.android.stripe3ds2@6.1.7+24");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject put2 = new JSONObject().put("type", t.getClass().getCanonicalName());
        String message = t.getMessage();
        if (message == null) {
            message = "";
        }
        JSONObject put3 = put.put("exception", jSONObject.put("values", jSONArray.put(put2.put("value", message).put("stacktrace", createRequestStacktrace$3ds2sdk_release(t)))));
        JSONObject put4 = new JSONObject().put("locale", this.localeCountry).put("environment", this.environment).put("android_os_version", this.osVersion);
        for (Map.Entry<String, String> entry : this.config.getCustomTags().entrySet()) {
            put4.put(entry.getKey(), entry.getValue());
        }
        Unit unit = Unit.INSTANCE;
        JSONObject put5 = put3.put("tags", put4).put("contexts", createRequestContexts$3ds2sdk_release());
        Intrinsics.checkNotNullExpressionValue(put5, "JSONObject()\n           … createRequestContexts())");
        return put5;
    }

    public final /* synthetic */ JSONObject createRequestContexts$3ds2sdk_release() {
        Object m116783constructorimpl;
        CharSequence charSequence;
        ApplicationInfo applicationInfo;
        try {
            Result.Companion companion = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
        }
        String str = null;
        if (Result.m116789isFailureimpl(m116783constructorimpl)) {
            m116783constructorimpl = null;
        }
        PackageInfo packageInfo = (PackageInfo) m116783constructorimpl;
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null) {
            charSequence = applicationInfo.loadLabel(this.context.getPackageManager());
        } else {
            charSequence = null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject put = new JSONObject().put("app_identifier", this.context.getPackageName()).put(AnalyticsFields.APP_NAME, charSequence);
        if (packageInfo != null) {
            str = packageInfo.versionName;
        }
        if (str == null) {
            str = "";
        }
        JSONObject put2 = jSONObject.put(Stripe3ds2AuthParams.FIELD_APP, put.put(AnalyticsFields.APP_VERSION, str));
        JSONObject put3 = new JSONObject().put("name", "Android").put("version", Build.VERSION.RELEASE);
        String str2 = Build.TYPE;
        JSONObject put4 = put2.put("os", put3.put("type", str2).put(JsonPOJOBuilder.DEFAULT_BUILD_METHOD, Build.DISPLAY));
        JSONObject put5 = new JSONObject().put("model_id", Build.ID).put(RequestHeadersFactory.MODEL, Build.MODEL).put("manufacturer", Build.MANUFACTURER).put("type", str2);
        JSONArray jSONArray = new JSONArray();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        for (String str3 : SUPPORTED_ABIS) {
            jSONArray.put(str3);
        }
        Unit unit = Unit.INSTANCE;
        JSONObject put6 = put4.put("device", put5.put("archs", jSONArray));
        Intrinsics.checkNotNullExpressionValue(put6, "JSONObject()\n           …          )\n            )");
        return put6;
    }

    public final /* synthetic */ JSONObject createRequestStacktrace$3ds2sdk_release(Throwable t) {
        List<StackTraceElement> reversed;
        Intrinsics.checkNotNullParameter(t, "t");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        StackTraceElement[] stackTrace = t.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "t.stackTrace");
        reversed = ArraysKt___ArraysKt.reversed(stackTrace);
        for (StackTraceElement stackTraceElement : reversed) {
            jSONArray.put(new JSONObject().put("lineno", stackTraceElement.getLineNumber()).put("filename", stackTraceElement.getClassName()).put("function", stackTraceElement.getMethodName()));
        }
        Unit unit = Unit.INSTANCE;
        JSONObject put = jSONObject.put("frames", jSONArray);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n           …          }\n            )");
        return put;
    }

    public final /* synthetic */ String createSentryAuthHeader$3ds2sdk_release() {
        List listOf;
        String joinToString$default;
        List listOf2;
        String joinToString$default2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m28425to("sentry_key", this.sentryConfig.getKey()), TuplesKt.m28425to("sentry_version", this.sentryConfig.getVersion()), TuplesKt.m28425to("sentry_timestamp", this.sentryConfig.getTimestamp()), TuplesKt.m28425to("sentry_client", USER_AGENT), TuplesKt.m28425to("sentry_secret", this.sentryConfig.getSecret())});
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOf, ", ", null, null, 0, null, DefaultErrorReporter$createSentryAuthHeader$1.INSTANCE, 30, null);
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"Sentry", joinToString$default});
        joinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(listOf2, " ", null, null, 0, null, null, 62, null);
        return joinToString$default2;
    }

    @Override // com.stripe.android.stripe3ds2.observability.ErrorReporter
    public void reportError(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        Z30.m73800d(C37824aD0.m71790a(this.workContext), null, null, new DefaultErrorReporter$reportError$1(this, t, null), 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultErrorReporter(Context context, Config config, CoroutineContext coroutineContext, Logger logger, SentryConfig sentryConfig, String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, r1, r2, r3, r4, r5, r6, (i2 & 128) != 0 ? Build.VERSION.SDK_INT : i);
        String str3;
        Config config2 = (i2 & 2) != 0 ? EmptyConfig.INSTANCE : config;
        CoroutineContext m84377b = (i2 & 4) != 0 ? T41.m84377b() : coroutineContext;
        Logger logger2 = (i2 & 8) != 0 ? Logger.Noop.INSTANCE : logger;
        SentryConfig sentryConfig2 = (i2 & 16) != 0 ? DefaultSentryConfig.INSTANCE : sentryConfig;
        String str4 = (i2 & 32) != 0 ? "release" : str;
        if ((i2 & 64) != 0) {
            str3 = Locale.getDefault().getCountry();
            Intrinsics.checkNotNullExpressionValue(str3, "getDefault().country");
        } else {
            str3 = str2;
        }
    }
}
