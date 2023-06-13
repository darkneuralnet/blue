package com.stripe.android.core.networking;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import com.stripe.android.core.networking.StripeRequest;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 02\u00020\u0001:\u000201B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0007¢\u0006\u0002\u0010\bJ\u0014\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'0\u0007H\u0002J\u001a\u0010(\u001a\u00020\u00032\u0010\u0010)\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u0007H\u0002J\"\u0010*\u001a\u00020\u00032\u000e\u0010)\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00072\b\b\u0002\u0010+\u001a\u00020!H\u0002J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0003\u0012\u0002\b\u00030\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\n¨\u00062"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lcom/stripe/android/core/networking/StripeRequest;", "eventName", "", "clientId", AnalyticsRequestV2.HEADER_ORIGIN, "params", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "headers", "getHeaders", "()Ljava/util/Map;", "method", "Lcom/stripe/android/core/networking/StripeRequest$Method;", "getMethod", "()Lcom/stripe/android/core/networking/StripeRequest$Method;", "mimeType", "Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getMimeType", "()Lcom/stripe/android/core/networking/StripeRequest$MimeType;", "getParams", "postBodyBytes", "", "getPostBodyBytes", "()[B", "postParameters", "getPostParameters$stripe_core_release$annotations", "()V", "getPostParameters$stripe_core_release", "retryResponseCodes", "", "", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "url", "getUrl", "analyticParams", "", "createParams", "map", "encodeMapParam", "level", "writePostBody", "", "outputStream", "Ljava/io/OutputStream;", "Companion", "Parameter", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nAnalyticsRequestV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnalyticsRequestV2.kt\ncom/stripe/android/core/networking/AnalyticsRequestV2\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,169:1\n215#2,2:170\n215#2,2:172\n*S KotlinDebug\n*F\n+ 1 AnalyticsRequestV2.kt\ncom/stripe/android/core/networking/AnalyticsRequestV2\n*L\n81#1:170,2\n102#1:172,2\n*E\n"})
/* loaded from: classes6.dex */
public final class AnalyticsRequestV2 extends StripeRequest {
    public static final String ANALYTICS_HOST = "https://r.stripe.com/0";
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_ORIGIN = "origin";
    private static final String INDENTATION = "  ";
    public static final int MILLIS_IN_SECOND = 1000;
    public static final String PARAM_CLIENT_ID = "client_id";
    public static final String PARAM_CREATED = "created";
    public static final String PARAM_EVENT_ID = "event_id";
    public static final String PARAM_EVENT_NAME = "event_name";
    private final String clientId;
    private final String eventName;
    private final Map<String, String> headers;
    private final StripeRequest.Method method;
    private final StripeRequest.MimeType mimeType;
    private final Map<String, ?> params;
    private final String postParameters;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2$Companion;", "", "()V", "ANALYTICS_HOST", "", "HEADER_ORIGIN", "INDENTATION", "MILLIS_IN_SECOND", "", "PARAM_CLIENT_ID", "PARAM_CREATED", "PARAM_EVENT_ID", "PARAM_EVENT_NAME", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u0006\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÂ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2$Parameter;", "", "key", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "urlEncode", "str", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Parameter {
        private final String key;
        private final String value;

        public Parameter(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.key = key;
            this.value = value;
        }

        private final String component1() {
            return this.key;
        }

        private final String component2() {
            return this.value;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = parameter.key;
            }
            if ((i & 2) != 0) {
                str2 = parameter.value;
            }
            return parameter.copy(str, str2);
        }

        private final String urlEncode(String str) throws UnsupportedEncodingException {
            String encode = URLEncoder.encode(str, Charsets.UTF_8.name());
            Intrinsics.checkNotNullExpressionValue(encode, "encode(str, Charsets.UTF_8.name())");
            return encode;
        }

        public final Parameter copy(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return new Parameter(key, value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Parameter) {
                Parameter parameter = (Parameter) obj;
                return Intrinsics.areEqual(this.key, parameter.key) && Intrinsics.areEqual(this.value, parameter.value);
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            String urlEncode = urlEncode(this.key);
            String urlEncode2 = urlEncode(this.value);
            return urlEncode + "=" + urlEncode2;
        }
    }

    public AnalyticsRequestV2(String eventName, String clientId, String origin, Map<String, ?> params) {
        Map<String, ?> plus;
        Map<String, String> mapOf;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(params, "params");
        this.eventName = eventName;
        this.clientId = clientId;
        this.params = params;
        plus = MapsKt__MapsKt.plus(params, analyticParams());
        this.postParameters = createParams(plus);
        StripeRequest.MimeType mimeType = StripeRequest.MimeType.Form;
        String code = mimeType.getCode();
        String name = Charsets.UTF_8.name();
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("Content-Type", code + "; charset=" + name), TuplesKt.m28425to(HEADER_ORIGIN, origin), TuplesKt.m28425to("User-Agent", "Stripe/v1 android/20.21.0"));
        this.headers = mapOf;
        this.method = StripeRequest.Method.POST;
        this.mimeType = mimeType;
        this.retryResponseCodes = new IntRange(NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS, NetworkConstantsKt.HTTP_TOO_MANY_REQUESTS);
        this.url = ANALYTICS_HOST;
    }

    private final Map<String, Object> analyticParams() {
        Map<String, Object> mapOf;
        mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m28425to(PARAM_CLIENT_ID, this.clientId), TuplesKt.m28425to(PARAM_CREATED, Long.valueOf(System.currentTimeMillis() / 1000)), TuplesKt.m28425to(PARAM_EVENT_NAME, this.eventName), TuplesKt.m28425to(PARAM_EVENT_ID, UUID.randomUUID().toString()));
        return mapOf;
    }

    private final String createParams(Map<String, ?> map) {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Object> entry : QueryStringFactory.INSTANCE.compactParams(map).entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new Parameter(key, encodeMapParam$default(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new Parameter(key, value.toString()));
            }
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, AnalyticsRequestV2$createParams$2.INSTANCE, 30, null);
        return joinToString$default;
    }

    private final String encodeMapParam(Map<?, ?> map, int i) {
        SortedMap sortedMap;
        String repeat;
        String str;
        boolean isBlank;
        String repeat2;
        String repeat3;
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        sortedMap = MapsKt__MapsJVMKt.toSortedMap(map, new Comparator() { // from class: Ua
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int encodeMapParam$lambda$1;
                encodeMapParam$lambda$1 = AnalyticsRequestV2.encodeMapParam$lambda$1(obj, obj2);
                return encodeMapParam$lambda$1;
            }
        });
        boolean z = true;
        for (Map.Entry entry : sortedMap.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                str = encodeMapParam((Map) value, i + 1);
            } else if (value == null) {
                str = "";
            } else {
                str = "\"" + value + "\"";
            }
            isBlank = StringsKt__StringsJVMKt.isBlank(str);
            if (!isBlank) {
                if (z) {
                    repeat2 = StringsKt__StringsJVMKt.repeat(INDENTATION, i);
                    sb.append(repeat2);
                    sb.append("  \"" + key + "\": " + str);
                    z = false;
                } else {
                    sb.append(",");
                    Intrinsics.checkNotNullExpressionValue(sb, "append(value)");
                    sb.append('\n');
                    Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
                    repeat3 = StringsKt__StringsJVMKt.repeat(INDENTATION, i);
                    sb.append(repeat3);
                    sb.append("  \"" + key + "\": " + str);
                }
            }
        }
        sb.append('\n');
        Intrinsics.checkNotNullExpressionValue(sb, "append('\\n')");
        repeat = StringsKt__StringsJVMKt.repeat(INDENTATION, i);
        sb.append(repeat);
        sb.append("}");
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static /* synthetic */ String encodeMapParam$default(AnalyticsRequestV2 analyticsRequestV2, Map map, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return analyticsRequestV2.encodeMapParam(map, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encodeMapParam$lambda$1(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] getPostBodyBytes() throws UnsupportedEncodingException {
        byte[] bytes = this.postParameters.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static /* synthetic */ void getPostParameters$stripe_core_release$annotations() {
    }

    public final String getEventName() {
        return this.eventName;
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

    public final Map<String, ?> getParams() {
        return this.params;
    }

    public final String getPostParameters$stripe_core_release() {
        return this.postParameters;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public String getUrl() {
        return this.url;
    }

    @Override // com.stripe.android.core.networking.StripeRequest
    public void writePostBody(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }
}
