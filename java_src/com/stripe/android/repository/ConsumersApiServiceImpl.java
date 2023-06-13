package com.stripe.android.repository;

import com.stripe.android.core.AppInfo;
import com.stripe.android.core.model.parsers.StripeErrorJsonParser;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.RequestExecutorKt;
import com.stripe.android.core.networking.StripeNetworkClient;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.parsers.ConsumerSessionJsonParser;
import com.stripe.android.model.parsers.ConsumerSessionLookupJsonParser;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ;\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J5\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ;\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/repository/ConsumersApiServiceImpl;", "Lcom/stripe/android/repository/ConsumersApiService;", "stripeNetworkClient", "Lcom/stripe/android/core/networking/StripeNetworkClient;", "apiVersion", "", "sdkVersion", "appInfo", "Lcom/stripe/android/core/AppInfo;", "(Lcom/stripe/android/core/networking/StripeNetworkClient;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/AppInfo;)V", "apiRequestFactory", "Lcom/stripe/android/core/networking/ApiRequest$Factory;", "stripeErrorJsonParser", "Lcom/stripe/android/core/model/parsers/StripeErrorJsonParser;", "confirmConsumerVerification", "Lcom/stripe/android/model/ConsumerSession;", "consumerSessionClientSecret", "verificationCode", "authSessionCookie", "requestSurface", "requestOptions", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lookupConsumerSession", "Lcom/stripe/android/model/ConsumerSessionLookup;", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startConsumerVerification", "locale", "Ljava/util/Locale;", "(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ConsumersApiServiceImpl implements ConsumersApiService {
    public static final Companion Companion = new Companion(null);
    private final ApiRequest.Factory apiRequestFactory;
    private final StripeErrorJsonParser stripeErrorJsonParser;
    private final StripeNetworkClient stripeNetworkClient;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/repository/ConsumersApiServiceImpl$Companion;", "", "()V", "confirmConsumerVerificationUrl", "", "getConfirmConsumerVerificationUrl$payments_model_release", "()Ljava/lang/String;", "consumerSessionLookupUrl", "getConsumerSessionLookupUrl$payments_model_release", "startConsumerVerificationUrl", "getStartConsumerVerificationUrl$payments_model_release", "getApiUrl", "path", "payments-model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getApiUrl(String str) {
            String api_host = ApiRequest.Companion.getAPI_HOST();
            return api_host + "/v1/" + str;
        }

        public final /* synthetic */ String getConfirmConsumerVerificationUrl$payments_model_release() {
            return getApiUrl("consumers/sessions/confirm_verification");
        }

        public final /* synthetic */ String getConsumerSessionLookupUrl$payments_model_release() {
            return getApiUrl("consumers/sessions/lookup");
        }

        public final /* synthetic */ String getStartConsumerVerificationUrl$payments_model_release() {
            return getApiUrl("consumers/sessions/start_verification");
        }

        private Companion() {
        }
    }

    public ConsumersApiServiceImpl(StripeNetworkClient stripeNetworkClient, String apiVersion, String sdkVersion, AppInfo appInfo) {
        Intrinsics.checkNotNullParameter(stripeNetworkClient, "stripeNetworkClient");
        Intrinsics.checkNotNullParameter(apiVersion, "apiVersion");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        this.stripeNetworkClient = stripeNetworkClient;
        this.stripeErrorJsonParser = new StripeErrorJsonParser();
        this.apiRequestFactory = new ApiRequest.Factory(appInfo, apiVersion, sdkVersion);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x005d, code lost:
        if (r11 == null) goto L8;
     */
    @Override // com.stripe.android.repository.ConsumersApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmConsumerVerification(String str, String str2, String str3, String str4, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        Map mapOf;
        Map mapOf2;
        Map emptyMap;
        Map plus;
        List listOf;
        Map mapOf3;
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String confirmConsumerVerificationUrl$payments_model_release = Companion.getConfirmConsumerVerificationUrl$payments_model_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", str4), TuplesKt.m28425to("credentials", mapOf), TuplesKt.m28425to("type", "SMS"), TuplesKt.m28425to(PaymentMethodOptionsParams.Blik.PARAM_CODE, str2));
        if (str3 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(str3);
            mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification_session_client_secrets", listOf));
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cookies", mapOf3));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        plus = MapsKt__MapsKt.plus(mapOf2, emptyMap);
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, confirmConsumerVerificationUrl$payments_model_release, options, plus, false, 8, null), new ConsumerSessionJsonParser(), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r11 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002d, code lost:
        if (r10 == null) goto L13;
     */
    @Override // com.stripe.android.repository.ConsumersApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object lookupConsumerSession(String str, String str2, String str3, ApiRequest.Options options, Continuation<? super ConsumerSessionLookup> continuation) {
        Map mapOf;
        Map emptyMap;
        Map plus;
        Map emptyMap2;
        Map plus2;
        List listOf;
        Map mapOf2;
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String consumerSessionLookupUrl$payments_model_release = Companion.getConsumerSessionLookupUrl$payments_model_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("request_surface", str3));
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("email_address", lowerCase));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        plus = MapsKt__MapsKt.plus(mapOf, emptyMap);
        if (str2 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
            mapOf2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification_session_client_secrets", listOf));
            emptyMap2 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cookies", mapOf2));
        }
        emptyMap2 = MapsKt__MapsKt.emptyMap();
        plus2 = MapsKt__MapsKt.plus(plus, emptyMap2);
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, consumerSessionLookupUrl$payments_model_release, options, plus2, false, 8, null), new ConsumerSessionLookupJsonParser(), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0061, code lost:
        if (r11 == null) goto L8;
     */
    @Override // com.stripe.android.repository.ConsumersApiService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startConsumerVerification(String str, Locale locale, String str2, String str3, ApiRequest.Options options, Continuation<? super ConsumerSession> continuation) {
        Map mapOf;
        Map mapOf2;
        Map emptyMap;
        Map plus;
        List listOf;
        Map mapOf3;
        StripeErrorJsonParser stripeErrorJsonParser = this.stripeErrorJsonParser;
        StripeNetworkClient stripeNetworkClient = this.stripeNetworkClient;
        ApiRequest.Factory factory = this.apiRequestFactory;
        String startConsumerVerificationUrl$payments_model_release = Companion.getStartConsumerVerificationUrl$payments_model_release();
        mapOf = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("consumer_session_client_secret", str));
        mapOf2 = MapsKt__MapsKt.mapOf(TuplesKt.m28425to("request_surface", str3), TuplesKt.m28425to("credentials", mapOf), TuplesKt.m28425to("type", "SMS"), TuplesKt.m28425to("locale", locale.toLanguageTag()));
        if (str2 != null) {
            listOf = CollectionsKt__CollectionsJVMKt.listOf(str2);
            mapOf3 = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("verification_session_client_secrets", listOf));
            emptyMap = MapsKt__MapsJVMKt.mapOf(TuplesKt.m28425to("cookies", mapOf3));
        }
        emptyMap = MapsKt__MapsKt.emptyMap();
        plus = MapsKt__MapsKt.plus(mapOf2, emptyMap);
        return RequestExecutorKt.executeRequestWithModelJsonParser(stripeNetworkClient, stripeErrorJsonParser, ApiRequest.Factory.createPost$default(factory, startConsumerVerificationUrl$payments_model_release, options, plus, false, 8, null), new ConsumerSessionJsonParser(), continuation);
    }

    public /* synthetic */ ConsumersApiServiceImpl(StripeNetworkClient stripeNetworkClient, String str, String str2, AppInfo appInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeNetworkClient, str, (i & 4) != 0 ? "AndroidBindings/20.21.0" : str2, appInfo);
    }
}
