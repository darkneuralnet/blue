package com.stripe.android.core.networking;

import android.os.Build;
import android.system.Os;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.StripeRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import zendesk.core.Constants;
@Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00182\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004J\u0016\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0014H\u0004R\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0007\"\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory;", "", "()V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "userAgent", "getUserAgent", "()Ljava/lang/String;", "xStripeUserAgent", "getXStripeUserAgent", "create", "createPostHeader", "defaultXStripeUserAgentMap", "", "Analytics", "Api", "BaseApiHeadersFactory", "Companion", "FileUpload", "FraudDetection", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes6.dex */
public abstract class RequestHeadersFactory {
    private static final String CHARSET;
    public static final Companion Companion = new Companion(null);
    public static final String KOTLIN = "kotlin";
    public static final String LANG = "lang";
    public static final String MODEL = "model";
    public static final String TYPE = "type";
    public static final String UNDETERMINED_LANGUAGE = "und";
    private Map<String, String> postHeaders;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Analytics;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "()V", "extraHeaders", "", "", "getExtraHeaders", "()Ljava/util/Map;", "userAgent", "getUserAgent", "()Ljava/lang/String;", "xStripeUserAgent", "getXStripeUserAgent", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRequestHeadersFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$Analytics\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,222:1\n125#2:223\n152#2,3:224\n*S KotlinDebug\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$Analytics\n*L\n200#1:223\n200#1:224,3\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class Analytics extends RequestHeadersFactory {
        private static final Map<String, String> extraHeaders;
        public static final Analytics INSTANCE = new Analytics();
        private static final String userAgent = RequestHeadersFactory.Companion.getUserAgent("AndroidBindings/20.21.0");

        static {
            Map<String, String> emptyMap;
            emptyMap = MapsKt__MapsKt.emptyMap();
            extraHeaders = emptyMap;
        }

        private Analytics() {
            super(null);
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getExtraHeaders() {
            return extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getUserAgent() {
            return userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getXStripeUserAgent() {
            String joinToString$default;
            Map<String, String> defaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            return "{" + joinToString$default + "}";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Companion;", "", "()V", "CHARSET", "", "getCHARSET", "()Ljava/lang/String;", "KOTLIN", "LANG", "MODEL", "TYPE", "UNDETERMINED_LANGUAGE", "getUserAgent", "sdkVersion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String getUserAgent$default(Companion companion, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "AndroidBindings/20.21.0";
            }
            return companion.getUserAgent(str);
        }

        public final String getCHARSET() {
            return RequestHeadersFactory.CHARSET;
        }

        public final String getUserAgent(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return "Stripe/v1 " + sdkVersion;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\r\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0006X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u0003X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "guid", "", "(Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "userAgent", "getUserAgent", "()Ljava/lang/String;", "xStripeUserAgent", "getXStripeUserAgent", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRequestHeadersFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,222:1\n125#2:223\n152#2,3:224\n*S KotlinDebug\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection\n*L\n184#1:223\n184#1:224,3\n*E\n"})
    /* loaded from: classes6.dex */
    public static final class FraudDetection extends RequestHeadersFactory {
        public static final Companion Companion = new Companion(null);
        public static final String HEADER_COOKIE = "Cookie";
        private final Map<String, String> extraHeaders;
        private Map<String, String> postHeaders;
        private final String userAgent;

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FraudDetection$Companion;", "", "()V", "HEADER_COOKIE", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FraudDetection(String guid) {
            super(null);
            Map<String, String> mapOf;
            Map<String, String> mapOf2;
            Intrinsics.checkNotNullParameter(guid, "guid");
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(HEADER_COOKIE, "m=" + guid));
            this.extraHeaders = mapOf;
            Companion companion = RequestHeadersFactory.Companion;
            this.userAgent = companion.getUserAgent("AndroidBindings/20.21.0");
            String code = StripeRequest.MimeType.Json.getCode();
            String charset = companion.getCHARSET();
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("Content-Type", code + "; charset=" + charset));
            this.postHeaders = mapOf2;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getExtraHeaders() {
            return this.extraHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getUserAgent() {
            return this.userAgent;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getXStripeUserAgent() {
            String joinToString$default;
            Map<String, String> defaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            return "{" + joinToString$default + "}";
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }
    }

    static {
        String name = Charsets.UTF_8.name();
        Intrinsics.checkNotNullExpressionValue(name, "UTF_8.name()");
        CHARSET = name;
    }

    public /* synthetic */ RequestHeadersFactory(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Map<String, String> create() {
        Map mapOf;
        Map<String, String> plus;
        Map<String, String> extraHeaders = getExtraHeaders();
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("User-Agent", getUserAgent()), TuplesKt.m28425to(NetworkConstantsKt.HEADER_ACCEPT_CHARSET, CHARSET), TuplesKt.m28425to(NetworkConstantsKt.HEADER_X_STRIPE_USER_AGENT, getXStripeUserAgent()));
        plus = MapsKt__MapsKt.plus(extraHeaders, mapOf);
        return plus;
    }

    public final Map<String, String> createPostHeader() {
        return getPostHeaders();
    }

    public final Map<String, String> defaultXStripeUserAgentMap() {
        Map<String, String> mutableMapOf;
        String str = Build.MANUFACTURER;
        String str2 = Build.BRAND;
        String str3 = Build.MODEL;
        mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m28425to(LANG, KOTLIN), TuplesKt.m28425to(AnalyticsFields.BINDINGS_VERSION, "20.21.0"), TuplesKt.m28425to(AnalyticsFields.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT)), TuplesKt.m28425to("type", str + "_" + str2 + "_" + str3), TuplesKt.m28425to(MODEL, str3));
        return mutableMapOf;
    }

    public abstract Map<String, String> getExtraHeaders();

    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    public abstract String getUserAgent();

    public abstract String getXStripeUserAgent();

    public void setPostHeaders(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.postHeaders = map;
    }

    private RequestHeadersFactory() {
        Map<String, String> emptyMap;
        emptyMap = MapsKt__MapsKt.emptyMap();
        this.postHeaders = emptyMap;
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\rX\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "options", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Api extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.core.networking.RequestHeadersFactory$Api$1 */
        /* loaded from: classes6.dex */
        public static final class C186211 extends Lambda implements Function0<ApiRequest.Options> {
            final /* synthetic */ ApiRequest.Options $options;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C186211(ApiRequest.Options options) {
                super(0);
                this.$options = options;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiRequest.Options invoke() {
                return this.$options;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Api(ApiRequest.Options options, AppInfo appInfo, Locale locale, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(options, r2, locale, (i & 8) != 0 ? ApiVersion.Companion.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/20.21.0" : str2);
            AppInfo appInfo2 = (i & 2) != 0 ? null : appInfo;
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Api(ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(new C186211(options), appInfo, locale, apiVersion, sdkVersion);
            Map<String, String> mapOf;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            String code = StripeRequest.MimeType.Form.getCode();
            String charset = RequestHeadersFactory.Companion.getCHARSET();
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("Content-Type", code + "; charset=" + charset));
            this.postHeaders = mapOf;
        }
    }

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u000e8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\n8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "Lcom/stripe/android/core/networking/RequestHeadersFactory;", "optionsProvider", "Lkotlin/Function0;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "(Lkotlin/jvm/functions/Function0;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)V", "extraHeaders", "", "getExtraHeaders", "()Ljava/util/Map;", "languageTag", "getLanguageTag", "()Ljava/lang/String;", "stripeClientUserAgentHeaderFactory", "Lcom/stripe/android/core/networking/StripeClientUserAgentHeaderFactory;", "userAgent", "getUserAgent", "xStripeUserAgent", "getXStripeUserAgent", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nRequestHeadersFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,222:1\n1#2:223\n125#3:224\n152#3,3:225\n*S KotlinDebug\n*F\n+ 1 RequestHeadersFactory.kt\ncom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory\n*L\n81#1:224\n81#1:225,3\n*E\n"})
    /* loaded from: classes6.dex */
    public static class BaseApiHeadersFactory extends RequestHeadersFactory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final Locale locale;
        private final Function0<ApiRequest.Options> optionsProvider;
        private final String sdkVersion;
        private final StripeClientUserAgentHeaderFactory stripeClientUserAgentHeaderFactory;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ BaseApiHeadersFactory(Function0 function0, AppInfo appInfo, Locale locale, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(function0, r2, locale, (i & 8) != 0 ? ApiVersion.Companion.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/20.21.0" : str2);
            AppInfo appInfo2 = (i & 2) != 0 ? null : appInfo;
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
        }

        private final String getLanguageTag() {
            boolean isBlank;
            String it = this.locale.toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            isBlank = StringsKt__StringsJVMKt.isBlank(it);
            boolean z = true;
            if (!((!(isBlank ^ true) || Intrinsics.areEqual(it, RequestHeadersFactory.UNDETERMINED_LANGUAGE)) ? false : false)) {
                return null;
            }
            return it;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getExtraHeaders() {
            Map mapOf;
            Map plus;
            Map emptyMap;
            Map plus2;
            Map map;
            Map plus3;
            Map map2;
            Map plus4;
            Map<String, String> plus5;
            ApiRequest.Options invoke = this.optionsProvider.invoke();
            mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("Accept", Constants.APPLICATION_JSON), TuplesKt.m28425to(NetworkConstantsKt.HEADER_STRIPE_VERSION, this.apiVersion), TuplesKt.m28425to("Authorization", "Bearer " + invoke.getApiKey()));
            plus = MapsKt__MapsKt.plus(mapOf, this.stripeClientUserAgentHeaderFactory.create(this.appInfo));
            if (invoke.getApiKeyIsUserKey()) {
                emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE, String.valueOf(true ^ Intrinsics.areEqual(Os.getenv(NetworkConstantsKt.HEADER_STRIPE_LIVEMODE), "false"))));
            } else {
                emptyMap = MapsKt__MapsKt.emptyMap();
            }
            plus2 = MapsKt__MapsKt.plus(plus, emptyMap);
            String stripeAccount = invoke.getStripeAccount();
            Map map3 = null;
            if (stripeAccount != null) {
                map = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(NetworkConstantsKt.HEADER_STRIPE_ACCOUNT, stripeAccount));
            } else {
                map = null;
            }
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            plus3 = MapsKt__MapsKt.plus(plus2, map);
            String idempotencyKey = invoke.getIdempotencyKey();
            if (idempotencyKey != null) {
                map2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to(NetworkConstantsKt.HEADER_IDEMPOTENCY_KEY, idempotencyKey));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = MapsKt__MapsKt.emptyMap();
            }
            plus4 = MapsKt__MapsKt.plus(plus3, map2);
            String languageTag = getLanguageTag();
            if (languageTag != null) {
                map3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("Accept-Language", languageTag));
            }
            if (map3 == null) {
                map3 = MapsKt__MapsKt.emptyMap();
            }
            plus5 = MapsKt__MapsKt.plus(plus4, map3);
            return plus5;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getUserAgent() {
            String str;
            List listOfNotNull;
            String joinToString$default;
            String[] strArr = new String[2];
            strArr[0] = RequestHeadersFactory.Companion.getUserAgent(this.sdkVersion);
            AppInfo appInfo = this.appInfo;
            if (appInfo != null) {
                str = appInfo.toUserAgent$stripe_core_release();
            } else {
                str = null;
            }
            strArr[1] = str;
            listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(listOfNotNull, " ", null, null, 0, null, null, 62, null);
            return joinToString$default;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public String getXStripeUserAgent() {
            String joinToString$default;
            Map<String, String> defaultXStripeUserAgentMap = defaultXStripeUserAgentMap();
            AppInfo appInfo = this.appInfo;
            if (appInfo != null) {
                defaultXStripeUserAgentMap.putAll(appInfo.toParamMap$stripe_core_release());
            }
            ArrayList arrayList = new ArrayList(defaultXStripeUserAgentMap.size());
            for (Map.Entry<String, String> entry : defaultXStripeUserAgentMap.entrySet()) {
                arrayList.add("\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"");
            }
            joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
            return "{" + joinToString$default + "}";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BaseApiHeadersFactory(Function0<ApiRequest.Options> optionsProvider, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion) {
            super(null);
            Intrinsics.checkNotNullParameter(optionsProvider, "optionsProvider");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.optionsProvider = optionsProvider;
            this.appInfo = appInfo;
            this.locale = locale;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
            this.stripeClientUserAgentHeaderFactory = new StripeClientUserAgentHeaderFactory(null, 1, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0002\u0010\fR&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eX\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/core/networking/RequestHeadersFactory$FileUpload;", "Lcom/stripe/android/core/networking/RequestHeadersFactory$BaseApiHeadersFactory;", "options", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "locale", "Ljava/util/Locale;", "apiVersion", "", "sdkVersion", "boundary", "(Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "postHeaders", "", "getPostHeaders", "()Ljava/util/Map;", "setPostHeaders", "(Ljava/util/Map;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class FileUpload extends BaseApiHeadersFactory {
        private Map<String, String> postHeaders;

        @Metadata(m28433d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m28432d2 = {"<anonymous>", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* renamed from: com.stripe.android.core.networking.RequestHeadersFactory$FileUpload$1 */
        /* loaded from: classes6.dex */
        public static final class C186221 extends Lambda implements Function0<ApiRequest.Options> {
            final /* synthetic */ ApiRequest.Options $options;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C186221(ApiRequest.Options options) {
                super(0);
                this.$options = options;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiRequest.Options invoke() {
                return this.$options;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ FileUpload(ApiRequest.Options options, AppInfo appInfo, Locale locale, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(options, r2, locale, (i & 8) != 0 ? ApiVersion.Companion.get().getCode() : str, (i & 16) != 0 ? "AndroidBindings/20.21.0" : str2, str3);
            AppInfo appInfo2 = (i & 2) != 0 ? null : appInfo;
            if ((i & 4) != 0) {
                locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            }
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public Map<String, String> getPostHeaders() {
            return this.postHeaders;
        }

        @Override // com.stripe.android.core.networking.RequestHeadersFactory
        public void setPostHeaders(Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            this.postHeaders = map;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileUpload(ApiRequest.Options options, AppInfo appInfo, Locale locale, String apiVersion, String sdkVersion, String boundary) {
            super(new C186221(options), appInfo, locale, apiVersion, sdkVersion);
            Map<String, String> mapOf;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(locale, "locale");
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            Intrinsics.checkNotNullParameter(boundary, "boundary");
            String code = StripeRequest.MimeType.MultipartForm.getCode();
            mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("Content-Type", code + "; boundary=" + boundary));
            this.postHeaders = mapOf;
        }
    }
}
