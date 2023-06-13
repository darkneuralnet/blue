package com.stripe.android.core.networking;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.ApiKeyValidator;
import com.stripe.android.core.ApiVersion;
import com.stripe.android.core.AppInfo;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.networking.RequestHeadersFactory;
import com.stripe.android.core.networking.StripeRequest;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0003EFGB_\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0005HÆ\u0003J\u0015\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007HÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\t\u00108\u001a\u00020\u0005HÂ\u0003J\t\u00109\u001a\u00020\u0005HÂ\u0003J\t\u0010:\u001a\u00020\u000fHÆ\u0003Jg\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010<\u001a\u00020\u000f2\b\u0010=\u001a\u0004\u0018\u00010>HÖ\u0003J\t\u0010?\u001a\u00020,HÖ\u0001J\b\u0010@\u001a\u00020\u0005H\u0016J\u0010\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0016R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0015\"\u0004\b'\u0010(R\u000e\u0010)\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u000e\u0010\r\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0012¨\u0006H"}, m28432d2 = {"Lcom/stripe/android/core/networking/ApiRequest;", "Lcom/stripe/android/core/networking/StripeRequest;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "baseUrl", "", "params", "", "options", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "appInfo", "Lcom/stripe/android/core/AppInfo;", "apiVersion", "sdkVersion", "shouldCache", "", "(Lcom/stripe/android/core/networking/StripeRequest$Method;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "getBaseUrl", "()Ljava/lang/String;", "headers", "getHeaders", "()Ljava/util/Map;", "headersFactory", "Lcom/stripe/android/core/networking/RequestHeadersFactory$Api;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getOptions", "()Lcom/stripe/android/core/networking/ApiRequest$Options;", "getParams", "postBodyBytes", "", "getPostBodyBytes", "()[B", "postHeaders", "getPostHeaders", "setPostHeaders", "(Ljava/util/Map;)V", "query", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "getShouldCache", "()Z", "url", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "Companion", "Factory", "Options", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nApiRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiRequest.kt\ncom/stripe/android/core/networking/ApiRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n1#2:208\n*E\n"})
/* loaded from: classes6.dex */
public final class ApiRequest extends StripeRequest {
    public static final Companion Companion = new Companion(null);
    private static volatile String apiTestHost;
    private final String apiVersion;
    private final AppInfo appInfo;
    private final String baseUrl;
    private final Map<String, String> headers;
    private final RequestHeadersFactory.Api headersFactory;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Options options;
    private final Map<String, ?> params;
    private Map<String, String> postHeaders;
    private final String query;
    private final Iterable<Integer> retryResponseCodes;
    private final String sdkVersion;
    private final boolean shouldCache;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\n¨\u0006\u000b"}, m28432d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Companion;", "", "()V", "API_HOST", "", "getAPI_HOST", "()Ljava/lang/String;", "apiTestHost", "getApiTestHost", "setApiTestHost", "(Ljava/lang/String;)V", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getAPI_HOST() {
            String apiTestHost = getApiTestHost();
            return apiTestHost == null ? "https://api.stripe.com" : apiTestHost;
        }

        public final String getApiTestHost() {
            return ApiRequest.apiTestHost;
        }

        public final void setApiTestHost(String str) {
            ApiRequest.apiTestHost = str;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J,\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000eJ6\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J6\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m28432d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Factory;", "", "appInfo", "Lcom/stripe/android/core/AppInfo;", "apiVersion", "", "sdkVersion", "(Lcom/stripe/android/core/AppInfo;Ljava/lang/String;Ljava/lang/String;)V", "createDelete", "Lcom/stripe/android/core/networking/ApiRequest;", "url", "options", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "params", "", "createGet", "shouldCache", "", "createPost", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Factory {
        private final String apiVersion;
        private final AppInfo appInfo;
        private final String sdkVersion;

        public Factory() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createDelete$default(Factory factory, String str, Options options, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return factory.createDelete(str, options, map);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createGet$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createGet(str, options, map, z);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ApiRequest createPost$default(Factory factory, String str, Options options, Map map, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                z = false;
            }
            return factory.createPost(str, options, map, z);
        }

        public final ApiRequest createDelete(String url, Options options, Map<String, ?> map) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.DELETE, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion, false, 128, null);
        }

        public final ApiRequest createGet(String url, Options options, Map<String, ?> map, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.GET, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion, z);
        }

        public final ApiRequest createPost(String url, Options options, Map<String, ?> map, boolean z) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(options, "options");
            return new ApiRequest(StripeRequest.Method.POST, url, map, options, this.appInfo, this.apiVersion, this.sdkVersion, z);
        }

        public Factory(AppInfo appInfo, String apiVersion, String sdkVersion) {
            Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            this.appInfo = appInfo;
            this.apiVersion = apiVersion;
            this.sdkVersion = sdkVersion;
        }

        public /* synthetic */ Factory(AppInfo appInfo, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : appInfo, (i & 2) != 0 ? ApiVersion.Companion.get().getCode() : str, (i & 4) != 0 ? "AndroidBindings/20.21.0" : str2);
        }
    }

    public /* synthetic */ ApiRequest(StripeRequest.Method method, String str, Map map, Options options, AppInfo appInfo, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(method, str, (i & 4) != 0 ? null : map, options, (i & 16) != 0 ? null : appInfo, (i & 32) != 0 ? ApiVersion.Companion.get().getCode() : str2, (i & 64) != 0 ? "AndroidBindings/20.21.0" : str3, (i & 128) != 0 ? false : z);
    }

    private final AppInfo component5() {
        return this.appInfo;
    }

    private final String component6() {
        return this.apiVersion;
    }

    private final String component7() {
        return this.sdkVersion;
    }

    private final byte[] getPostBodyBytes() throws UnsupportedEncodingException, InvalidRequestException {
        try {
            byte[] bytes = this.query.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        } catch (UnsupportedEncodingException e) {
            String name = Charsets.UTF_8.name();
            throw new InvalidRequestException(null, null, 0, "Unable to encode parameters to " + name + ". Please contact support@stripe.com for assistance.", e, 7, null);
        }
    }

    public final StripeRequest.Method component1() {
        return getMethod();
    }

    public final String component2() {
        return this.baseUrl;
    }

    public final Map<String, ?> component3() {
        return this.params;
    }

    public final Options component4() {
        return this.options;
    }

    public final boolean component8() {
        return getShouldCache();
    }

    public final ApiRequest copy(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion, boolean z) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        return new ApiRequest(method, baseUrl, map, options, appInfo, apiVersion, sdkVersion, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ApiRequest) {
            ApiRequest apiRequest = (ApiRequest) obj;
            return getMethod() == apiRequest.getMethod() && Intrinsics.areEqual(this.baseUrl, apiRequest.baseUrl) && Intrinsics.areEqual(this.params, apiRequest.params) && Intrinsics.areEqual(this.options, apiRequest.options) && Intrinsics.areEqual(this.appInfo, apiRequest.appInfo) && Intrinsics.areEqual(this.apiVersion, apiRequest.apiVersion) && Intrinsics.areEqual(this.sdkVersion, apiRequest.sdkVersion) && getShouldCache() == apiRequest.getShouldCache();
        }
        return false;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.Method getMethod() {
        return this.method;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public StripeRequest.MimeType getMimeType() {
        return this.mimeType;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final Map<String, ?> getParams() {
        return this.params;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Map<String, String> getPostHeaders() {
        return this.postHeaders;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public boolean getShouldCache() {
        return this.shouldCache;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        boolean z;
        List listOfNotNull;
        boolean contains$default;
        CharSequence charSequence;
        String joinToString$default;
        if (StripeRequest.Method.GET != getMethod() && StripeRequest.Method.DELETE != getMethod()) {
            return this.baseUrl;
        }
        String[] strArr = new String[2];
        strArr[0] = this.baseUrl;
        String str = this.query;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            str = null;
        }
        strArr[1] = str;
        listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) strArr);
        List list = listOfNotNull;
        contains$default = StringsKt__StringsKt.contains$default((CharSequence) this.baseUrl, (CharSequence) CallerData.f61059NA, false, 2, (Object) null);
        if (contains$default) {
            charSequence = "&";
        } else {
            charSequence = CallerData.f61059NA;
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, charSequence, null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    public int hashCode() {
        int hashCode = ((getMethod().hashCode() * 31) + this.baseUrl.hashCode()) * 31;
        Map<String, ?> map = this.params;
        int hashCode2 = (((hashCode + (map == null ? 0 : map.hashCode())) * 31) + this.options.hashCode()) * 31;
        AppInfo appInfo = this.appInfo;
        int hashCode3 = (((((hashCode2 + (appInfo != null ? appInfo.hashCode() : 0)) * 31) + this.apiVersion.hashCode()) * 31) + this.sdkVersion.hashCode()) * 31;
        boolean shouldCache = getShouldCache();
        int i = shouldCache;
        if (shouldCache) {
            i = 1;
        }
        return hashCode3 + i;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void setPostHeaders(Map<String, String> map) {
        this.postHeaders = map;
    }

    public String toString() {
        String code = getMethod().getCode();
        String str = this.baseUrl;
        return code + " " + str;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    public ApiRequest(StripeRequest.Method method, String baseUrl, Map<String, ?> map, Options options, AppInfo appInfo, String apiVersion, String sdkVersion, boolean z) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.method = method;
        this.baseUrl = baseUrl;
        this.params = map;
        this.options = options;
        this.appInfo = appInfo;
        this.apiVersion = apiVersion;
        this.sdkVersion = sdkVersion;
        this.shouldCache = z;
        this.query = QueryStringFactory.INSTANCE.createFromParamsWithEmptyValues(map);
        RequestHeadersFactory.Api api = new RequestHeadersFactory.Api(options, appInfo, null, apiVersion, sdkVersion, 4, null);
        this.headersFactory = api;
        this.mimeType = StripeRequest.MimeType.Form;
        this.retryResponseCodes = NetworkConstantsKt.getDEFAULT_RETRY_CODES();
        this.headers = api.create();
        this.postHeaders = api.createPostHeader();
    }

    @Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B)\b\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0002\u0010\u0006B%\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003J+\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006$"}, m28432d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Options;", "Landroid/os/Parcelable;", "publishableKeyProvider", "Lkotlin/Function0;", "", "stripeAccountIdProvider", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "apiKey", "stripeAccount", "idempotencyKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiKey", "()Ljava/lang/String;", "apiKeyIsUserKey", "", "getApiKeyIsUserKey", "()Z", "getIdempotencyKey", "getStripeAccount", "component1", "component2", "component3", "copy", "describeContents", "", "equals", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Options implements Parcelable {
        public static final String UNDEFINED_PUBLISHABLE_KEY = "pk_undefined";
        private final String apiKey;
        private final String idempotencyKey;
        private final String stripeAccount;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Options> CREATOR = new Creator();

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/ApiRequest$Options$Companion;", "", "()V", "UNDEFINED_PUBLISHABLE_KEY", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Options> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Options(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Options[] newArray(int i) {
                return new Options[i];
            }
        }

        public Options(String apiKey, String str, String str2) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            this.apiKey = apiKey;
            this.stripeAccount = str;
            this.idempotencyKey = str2;
            new ApiKeyValidator().requireValid(apiKey);
        }

        public static /* synthetic */ Options copy$default(Options options, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = options.apiKey;
            }
            if ((i & 2) != 0) {
                str2 = options.stripeAccount;
            }
            if ((i & 4) != 0) {
                str3 = options.idempotencyKey;
            }
            return options.copy(str, str2, str3);
        }

        public final String component1() {
            return this.apiKey;
        }

        public final String component2() {
            return this.stripeAccount;
        }

        public final String component3() {
            return this.idempotencyKey;
        }

        public final Options copy(String apiKey, String str, String str2) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            return new Options(apiKey, str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Options) {
                Options options = (Options) obj;
                return Intrinsics.areEqual(this.apiKey, options.apiKey) && Intrinsics.areEqual(this.stripeAccount, options.stripeAccount) && Intrinsics.areEqual(this.idempotencyKey, options.idempotencyKey);
            }
            return false;
        }

        public final String getApiKey() {
            return this.apiKey;
        }

        public final boolean getApiKeyIsUserKey() {
            boolean startsWith$default;
            startsWith$default = StringsKt__StringsJVMKt.startsWith$default(this.apiKey, "uk_", false, 2, null);
            return startsWith$default;
        }

        public final String getIdempotencyKey() {
            return this.idempotencyKey;
        }

        public final String getStripeAccount() {
            return this.stripeAccount;
        }

        public int hashCode() {
            int hashCode = this.apiKey.hashCode() * 31;
            String str = this.stripeAccount;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.idempotencyKey;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            String str = this.apiKey;
            String str2 = this.stripeAccount;
            String str3 = this.idempotencyKey;
            return "Options(apiKey=" + str + ", stripeAccount=" + str2 + ", idempotencyKey=" + str3 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i) {
            Intrinsics.checkNotNullParameter(out, "out");
            out.writeString(this.apiKey);
            out.writeString(this.stripeAccount);
            out.writeString(this.idempotencyKey);
        }

        public /* synthetic */ Options(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Options(Function0<String> publishableKeyProvider, Function0<String> stripeAccountIdProvider) {
            this(publishableKeyProvider.invoke(), stripeAccountIdProvider.invoke(), null, 4, null);
            Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
            Intrinsics.checkNotNullParameter(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
