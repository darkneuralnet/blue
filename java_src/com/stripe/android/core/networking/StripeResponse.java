package com.stripe.android.core.networking;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.core.networking.RequestId;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 &*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001&B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007HÆ\u0003JF\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u0016\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\t2\u0006\u0010#\u001a\u00020\bJ\t\u0010$\u001a\u00020\u0004HÖ\u0001J\b\u0010%\u001a\u00020\bH\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006'"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeResponse;", "ResponseBody", "", PaymentMethodOptionsParams.Blik.PARAM_CODE, "", "body", "headers", "", "", "", "(ILjava/lang/Object;Ljava/util/Map;)V", "getBody", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getCode", "()I", "getHeaders", "()Ljava/util/Map;", "isError", "", "()Z", "isOk", "isRateLimited", "requestId", "Lcom/stripe/android/core/networking/RequestId;", "getRequestId", "()Lcom/stripe/android/core/networking/RequestId;", "component1", "component2", "component3", "copy", "(ILjava/lang/Object;Ljava/util/Map;)Lcom/stripe/android/core/networking/StripeResponse;", "equals", LegacyRepairType.OTHER_KEY, "getHeaderValue", "key", "hashCode", "toString", "Companion", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
@SourceDebugExtension({"SMAP\nStripeResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripeResponse.kt\ncom/stripe/android/core/networking/StripeResponse\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,56:1\n288#2,2:57\n*S KotlinDebug\n*F\n+ 1 StripeResponse.kt\ncom/stripe/android/core/networking/StripeResponse\n*L\n47#1:57,2\n*E\n"})
/* loaded from: classes6.dex */
public final class StripeResponse<ResponseBody> {
    public static final Companion Companion = new Companion(null);
    public static final String HEADER_REQUEST_ID = "Request-Id";
    private final ResponseBody body;
    private final int code;
    private final Map<String, List<String>> headers;
    private final boolean isError;
    private final boolean isOk;
    private final boolean isRateLimited;
    private final RequestId requestId;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m28432d2 = {"Lcom/stripe/android/core/networking/StripeResponse$Companion;", "", "()V", "HEADER_REQUEST_ID", "", "stripe-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StripeResponse(int i, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        String str;
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.code = i;
        this.body = responsebody;
        this.headers = headers;
        this.isOk = i == 200;
        this.isError = i < 200 || i >= 300;
        this.isRateLimited = i == 429;
        RequestId.Companion companion = RequestId.Companion;
        List<String> headerValue = getHeaderValue(HEADER_REQUEST_ID);
        if (headerValue != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) headerValue);
            str = (String) firstOrNull;
        } else {
            str = null;
        }
        this.requestId = companion.fromString(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StripeResponse copy$default(StripeResponse stripeResponse, int i, Object obj, Map map, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = stripeResponse.code;
        }
        if ((i2 & 2) != 0) {
            obj = stripeResponse.body;
        }
        if ((i2 & 4) != 0) {
            map = stripeResponse.headers;
        }
        return stripeResponse.copy(i, obj, map);
    }

    public final int component1() {
        return this.code;
    }

    public final ResponseBody component2() {
        return this.body;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final StripeResponse<ResponseBody> copy(int i, ResponseBody responsebody, Map<String, ? extends List<String>> headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new StripeResponse<>(i, responsebody, headers);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StripeResponse) {
            StripeResponse stripeResponse = (StripeResponse) obj;
            return this.code == stripeResponse.code && Intrinsics.areEqual(this.body, stripeResponse.body) && Intrinsics.areEqual(this.headers, stripeResponse.headers);
        }
        return false;
    }

    public final ResponseBody getBody() {
        return this.body;
    }

    public final int getCode() {
        return this.code;
    }

    public final List<String> getHeaderValue(String key) {
        Object obj;
        boolean equals;
        Intrinsics.checkNotNullParameter(key, "key");
        Iterator<T> it = this.headers.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                equals = StringsKt__StringsJVMKt.equals((String) ((Map.Entry) obj).getKey(), key, true);
                if (equals) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestId getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.code) * 31;
        ResponseBody responsebody = this.body;
        return ((hashCode + (responsebody == null ? 0 : responsebody.hashCode())) * 31) + this.headers.hashCode();
    }

    public final boolean isError() {
        return this.isError;
    }

    public final boolean isOk() {
        return this.isOk;
    }

    public final boolean isRateLimited() {
        return this.isRateLimited;
    }

    public String toString() {
        RequestId requestId = this.requestId;
        int i = this.code;
        return "Request-Id: " + requestId + ", Status Code: " + i;
    }

    public /* synthetic */ StripeResponse(int i, Object obj, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, obj, (i2 & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map);
    }
}
