package com.stripe.android;

import android.content.Context;
import android.content.Intent;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.PaymentController;
import com.stripe.android.PaymentRelayStarter;
import com.stripe.android.StripePaymentController;
import com.stripe.android.core.Logger;
import com.stripe.android.core.exception.APIConnectionException;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.core.injection.NamedConstantsKt;
import com.stripe.android.core.networking.AnalyticsRequestExecutor;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.AlipayAuthResult;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.Stripe3ds2AuthParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.WeChatPayNextAction;
import com.stripe.android.networking.AlipayRepository;
import com.stripe.android.networking.DefaultAlipayRepository;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowFailureMessageFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.DefaultPaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.view.AuthActivityStarterHost;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000¨\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 {2\u00020\u0001:\u0001{Ba\u0012\u0006\u0010w\u001a\u00020v\u0012\f\u0010H\u001a\b\u0012\u0004\u0012\u00020 0G\u0012\u0006\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010M\u001a\u00020:\u0012\b\b\u0002\u0010x\u001a\u00020X\u0012\b\b\u0002\u0010P\u001a\u00020O\u0012\b\b\u0002\u0010S\u001a\u00020R\u0012\b\b\u0002\u0010V\u001a\u00020U\u0012\b\b\u0002\u0010Y\u001a\u00020X¢\u0006\u0004\by\u0010zJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 H\u0002J\u001e\u0010(\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0016J\b\u0010)\u001a\u00020\u0011H\u0016J+\u0010+\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010.\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00101\u001a\u0002002\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010\bJ3\u00105\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00102\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0096@ø\u0001\u0000¢\u0006\u0004\b5\u00106J+\u00107\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u0013J\u001a\u0010;\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010<\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u001a\u0010=\u001a\u00020:2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u00109\u001a\u0004\u0018\u000108H\u0016J\u001b\u0010>\u001a\u00020\u00172\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u00020@2\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\bA\u0010?J\u001b\u0010B\u001a\u00020\u000f2\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\bB\u0010?J+\u0010E\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\u0006\u0010\u0005\u001a\u00020\u0004H\u0097@ø\u0001\u0000¢\u0006\u0004\bE\u0010FR\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020 0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010g\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010NR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020m0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR \u0010q\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006|"}, m28432d2 = {"Lcom/stripe/android/StripePaymentController;", "Lcom/stripe/android/PaymentController;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "confirmStripeIntentParams", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "requestOptions", "Lcom/stripe/android/model/PaymentIntent;", "confirmPaymentIntent", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/ConfirmSetupIntentParams;", "Lcom/stripe/android/model/SetupIntent;", "confirmSetupIntent", "(Lcom/stripe/android/model/ConfirmSetupIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "Lcom/stripe/android/model/Source;", Stripe3ds2AuthParams.FIELD_SOURCE, "", "onSourceRetrieved", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/Source;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paymentIntent", "Lcom/stripe/android/AlipayAuthenticator;", "authenticator", "Lcom/stripe/android/PaymentIntentResult;", "authenticateAlipay", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "requestCode", "", "throwable", "handleError", "(Lcom/stripe/android/view/AuthActivityStarterHost;ILjava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "returnUrl", "logReturnUrl", "Lu5;", "activityResultCaller", "Lt5;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "activityResultCallback", "registerLaunchersWithActivityResultCaller", "unregisterLaunchers", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "startConfirmAndAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "confirmPaymentIntentParams", "confirmAndAuthenticateAlipay", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams;Lcom/stripe/android/AlipayAuthenticator;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/model/WeChatPayNextAction;", "confirmWeChatPay", "clientSecret", "Lcom/stripe/android/PaymentController$StripeIntentType;", "type", "startAuth", "(Lcom/stripe/android/view/AuthActivityStarterHost;Ljava/lang/String;Lcom/stripe/android/core/networking/ApiRequest$Options;Lcom/stripe/android/PaymentController$StripeIntentType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startAuthenticateSource", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "", "shouldHandlePaymentResult", "shouldHandleSetupResult", "shouldHandleSourceResult", "getPaymentIntentResult", "(Landroid/content/Intent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/SetupIntentResult;", "getSetupIntentResult", "getAuthenticateSourceResult", "Lcom/stripe/android/model/StripeIntent;", "stripeIntent", "handleNextAction", "(Lcom/stripe/android/view/AuthActivityStarterHost;Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/core/networking/ApiRequest$Options;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function0;", "publishableKeyProvider", "Lkotlin/jvm/functions/Function0;", "Lcom/stripe/android/networking/StripeRepository;", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", NamedConstantsKt.ENABLE_LOGGING, "Z", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lcom/stripe/android/networking/AlipayRepository;", "alipayRepository", "Lcom/stripe/android/networking/AlipayRepository;", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "failureMessageFactory", "Lcom/stripe/android/payments/PaymentFlowFailureMessageFactory;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "paymentIntentFlowResultProcessor", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "setupIntentFlowResultProcessor", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", com.stripe.android.payments.core.injection.NamedConstantsKt.IS_INSTANT_APP, "LB5;", "Lcom/stripe/android/PaymentRelayStarter$Args;", "paymentRelayLauncher", "LB5;", "Lkotlin/Function1;", "Lcom/stripe/android/PaymentRelayStarter;", "paymentRelayStarterFactory", "Lkotlin/jvm/functions/Function1;", "", "threeDs1IntentReturnUrlMap", "Ljava/util/Map;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "authenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "workContext", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lcom/stripe/android/networking/StripeRepository;ZLkotlin/coroutines/CoroutineContext;Lcom/stripe/android/core/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lcom/stripe/android/networking/AlipayRepository;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStripePaymentController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StripePaymentController.kt\ncom/stripe/android/StripePaymentController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,593:1\n1#2:594\n*E\n"})
/* loaded from: classes6.dex */
public final class StripePaymentController implements PaymentController {
    private static final long CHALLENGE_DELAY;
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    public static final int PAYMENT_REQUEST_CODE = 50000;
    private static final String REQUIRED_ERROR = "API request returned an invalid response.";
    public static final int SETUP_REQUEST_CODE = 50001;
    public static final int SOURCE_REQUEST_CODE = 50002;
    private final AlipayRepository alipayRepository;
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final PaymentAuthenticatorRegistry authenticatorRegistry;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean enableLogging;
    private final PaymentFlowFailureMessageFactory failureMessageFactory;
    private final boolean isInstantApp;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final PaymentIntentFlowResultProcessor paymentIntentFlowResultProcessor;
    private AbstractC0407B5<PaymentRelayStarter.Args> paymentRelayLauncher;
    private final Function1<AuthActivityStarterHost, PaymentRelayStarter> paymentRelayStarterFactory;
    private final Function0<String> publishableKeyProvider;
    private final SetupIntentFlowResultProcessor setupIntentFlowResultProcessor;
    private final StripeRepository stripeRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    @Metadata(m28433d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0019H\u0007J\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001dJ\u0015\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0080T¢\u0006\u0002\n\u0000¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/StripePaymentController$Companion;", "", "()V", "CHALLENGE_DELAY", "", "getCHALLENGE_DELAY$payments_core_release", "()J", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD$payments_core_release", "()Ljava/util/List;", "PAYMENT_REQUEST_CODE", "", "REQUIRED_ERROR", "SETUP_REQUEST_CODE", "SOURCE_REQUEST_CODE", "create", "Lcom/stripe/android/PaymentController;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "publishableKey", "stripeRepository", "Lcom/stripe/android/networking/StripeRepository;", NamedConstantsKt.ENABLE_LOGGING, "", "getRequestCode", "params", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "getRequestCode$payments_core_release", "intent", "Lcom/stripe/android/model/StripeIntent;", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ PaymentController create$default(Companion companion, Context context, String str, StripeRepository stripeRepository, boolean z, int i, Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            return companion.create(context, str, stripeRepository, z);
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentController create(Context context, String publishableKey, StripeRepository stripeRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            return create$default(this, context, publishableKey, stripeRepository, false, 8, null);
        }

        public final long getCHALLENGE_DELAY$payments_core_release() {
            return StripePaymentController.CHALLENGE_DELAY;
        }

        public final List<String> getEXPAND_PAYMENT_METHOD$payments_core_release() {
            return StripePaymentController.EXPAND_PAYMENT_METHOD;
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(StripeIntent intent) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            return intent instanceof PaymentIntent ? StripePaymentController.PAYMENT_REQUEST_CODE : StripePaymentController.SETUP_REQUEST_CODE;
        }

        private Companion() {
        }

        @JvmStatic
        @JvmOverloads
        public final PaymentController create(Context context, String publishableKey, StripeRepository stripeRepository, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
            Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            return new StripePaymentController(applicationContext, new StripePaymentController$Companion$create$1(publishableKey), stripeRepository, z, null, null, null, null, null, 496, null);
        }

        public final /* synthetic */ int getRequestCode$payments_core_release(ConfirmStripeIntentParams params) {
            Intrinsics.checkNotNullParameter(params, "params");
            if (params instanceof ConfirmPaymentIntentParams) {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }
            if (params instanceof ConfirmSetupIntentParams) {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaymentController.StripeIntentType.values().length];
            try {
                iArr[PaymentController.StripeIntentType.PaymentIntent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaymentController.StripeIntentType.SetupIntent.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
        EXPAND_PAYMENT_METHOD = listOf;
        CHALLENGE_DELAY = TimeUnit.SECONDS.toMillis(2L);
    }

    public StripePaymentController(Context context, Function0<String> publishableKeyProvider, StripeRepository stripeRepository, boolean z, CoroutineContext workContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext uiContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(publishableKeyProvider, "publishableKeyProvider");
        Intrinsics.checkNotNullParameter(stripeRepository, "stripeRepository");
        Intrinsics.checkNotNullParameter(workContext, "workContext");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(alipayRepository, "alipayRepository");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        this.publishableKeyProvider = publishableKeyProvider;
        this.stripeRepository = stripeRepository;
        this.enableLogging = z;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.alipayRepository = alipayRepository;
        this.uiContext = uiContext;
        this.failureMessageFactory = new PaymentFlowFailureMessageFactory(context);
        Logger.Companion companion = Logger.Companion;
        this.paymentIntentFlowResultProcessor = new PaymentIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z), workContext);
        this.setupIntentFlowResultProcessor = new SetupIntentFlowResultProcessor(context, publishableKeyProvider, stripeRepository, companion.getInstance(z), workContext);
        this.defaultReturnUrl = DefaultReturnUrl.Companion.create(context);
        boolean m40136c = C41324g52.m40136c(context);
        this.isInstantApp = m40136c;
        this.paymentRelayStarterFactory = new StripePaymentController$paymentRelayStarterFactory$1(this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.threeDs1IntentReturnUrlMap = linkedHashMap;
        this.authenticatorRegistry = DefaultPaymentAuthenticatorRegistry.Companion.createInstance(context, stripeRepository, analyticsRequestExecutor, paymentAnalyticsRequestFactory, z, workContext, uiContext, linkedHashMap, publishableKeyProvider, paymentAnalyticsRequestFactory.getDefaultProductUsageTokens$payments_core_release(), m40136c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0(Function0 tmp0) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (String) tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object authenticateAlipay(PaymentIntent paymentIntent, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super PaymentIntentResult> continuation) {
        StripePaymentController$authenticateAlipay$1 stripePaymentController$authenticateAlipay$1;
        Object coroutine_suspended;
        int i;
        StripePaymentController stripePaymentController;
        String clientSecret;
        Object retrievePaymentIntent;
        int i2;
        if (continuation instanceof StripePaymentController$authenticateAlipay$1) {
            stripePaymentController$authenticateAlipay$1 = (StripePaymentController$authenticateAlipay$1) continuation;
            int i3 = stripePaymentController$authenticateAlipay$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$authenticateAlipay$1.label = i3 - Integer.MIN_VALUE;
                Object obj = stripePaymentController$authenticateAlipay$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$authenticateAlipay$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = stripePaymentController$authenticateAlipay$1.I$0;
                            stripePaymentController = (StripePaymentController) stripePaymentController$authenticateAlipay$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            if (obj == null) {
                                PaymentIntent paymentIntent2 = (PaymentIntent) obj;
                                return new PaymentIntentResult(paymentIntent2, i2, stripePaymentController.failureMessageFactory.create(paymentIntent2, i2));
                            }
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    options = (ApiRequest.Options) stripePaymentController$authenticateAlipay$1.L$2;
                    paymentIntent = (PaymentIntent) stripePaymentController$authenticateAlipay$1.L$1;
                    stripePaymentController = (StripePaymentController) stripePaymentController$authenticateAlipay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    AlipayRepository alipayRepository = this.alipayRepository;
                    stripePaymentController$authenticateAlipay$1.L$0 = this;
                    stripePaymentController$authenticateAlipay$1.L$1 = paymentIntent;
                    stripePaymentController$authenticateAlipay$1.L$2 = options;
                    stripePaymentController$authenticateAlipay$1.label = 1;
                    obj = alipayRepository.authenticate(paymentIntent, alipayAuthenticator, options, stripePaymentController$authenticateAlipay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    stripePaymentController = this;
                }
                int outcome = ((AlipayAuthResult) obj).getOutcome();
                StripeRepository stripeRepository = stripePaymentController.stripeRepository;
                clientSecret = paymentIntent.getClientSecret();
                if (clientSecret == null) {
                    clientSecret = "";
                }
                List<String> list = EXPAND_PAYMENT_METHOD;
                stripePaymentController$authenticateAlipay$1.L$0 = stripePaymentController;
                stripePaymentController$authenticateAlipay$1.L$1 = null;
                stripePaymentController$authenticateAlipay$1.L$2 = null;
                stripePaymentController$authenticateAlipay$1.I$0 = outcome;
                stripePaymentController$authenticateAlipay$1.label = 2;
                retrievePaymentIntent = stripeRepository.retrievePaymentIntent(clientSecret, options, list, stripePaymentController$authenticateAlipay$1);
                if (retrievePaymentIntent != coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = retrievePaymentIntent;
                i2 = outcome;
                if (obj == null) {
                }
            }
        }
        stripePaymentController$authenticateAlipay$1 = new StripePaymentController$authenticateAlipay$1(this, continuation);
        Object obj2 = stripePaymentController$authenticateAlipay$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$authenticateAlipay$1.label;
        if (i == 0) {
        }
        int outcome2 = ((AlipayAuthResult) obj2).getOutcome();
        StripeRepository stripeRepository2 = stripePaymentController.stripeRepository;
        clientSecret = paymentIntent.getClientSecret();
        if (clientSecret == null) {
        }
        List<String> list2 = EXPAND_PAYMENT_METHOD;
        stripePaymentController$authenticateAlipay$1.L$0 = stripePaymentController;
        stripePaymentController$authenticateAlipay$1.L$1 = null;
        stripePaymentController$authenticateAlipay$1.L$2 = null;
        stripePaymentController$authenticateAlipay$1.I$0 = outcome2;
        stripePaymentController$authenticateAlipay$1.label = 2;
        retrievePaymentIntent = stripeRepository2.retrievePaymentIntent(clientSecret, options, list2, stripePaymentController$authenticateAlipay$1);
        if (retrievePaymentIntent != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmPaymentIntent(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super PaymentIntent> continuation) {
        StripePaymentController$confirmPaymentIntent$1 stripePaymentController$confirmPaymentIntent$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripePaymentController$confirmPaymentIntent$1) {
            stripePaymentController$confirmPaymentIntent$1 = (StripePaymentController$confirmPaymentIntent$1) continuation;
            int i2 = stripePaymentController$confirmPaymentIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmPaymentIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = stripePaymentController$confirmPaymentIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$confirmPaymentIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    StripeRepository stripeRepository = this.stripeRepository;
                    ConfirmPaymentIntentParams withShouldUseStripeSdk = confirmPaymentIntentParams.withShouldUseStripeSdk(true);
                    List<String> list = EXPAND_PAYMENT_METHOD;
                    stripePaymentController$confirmPaymentIntent$1.label = 1;
                    obj = stripeRepository.confirmPaymentIntent$payments_core_release(withShouldUseStripeSdk, options, list, stripePaymentController$confirmPaymentIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("API request returned an invalid response.".toString());
            }
        }
        stripePaymentController$confirmPaymentIntent$1 = new StripePaymentController$confirmPaymentIntent$1(this, continuation);
        obj = stripePaymentController$confirmPaymentIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$confirmPaymentIntent$1.label;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmSetupIntent(ConfirmSetupIntentParams confirmSetupIntentParams, ApiRequest.Options options, Continuation<? super SetupIntent> continuation) {
        StripePaymentController$confirmSetupIntent$1 stripePaymentController$confirmSetupIntent$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripePaymentController$confirmSetupIntent$1) {
            stripePaymentController$confirmSetupIntent$1 = (StripePaymentController$confirmSetupIntent$1) continuation;
            int i2 = stripePaymentController$confirmSetupIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmSetupIntent$1.label = i2 - Integer.MIN_VALUE;
                obj = stripePaymentController$confirmSetupIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$confirmSetupIntent$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    StripeRepository stripeRepository = this.stripeRepository;
                    ConfirmSetupIntentParams withShouldUseStripeSdk = confirmSetupIntentParams.withShouldUseStripeSdk(true);
                    List<String> list = EXPAND_PAYMENT_METHOD;
                    stripePaymentController$confirmSetupIntent$1.label = 1;
                    obj = stripeRepository.confirmSetupIntent$payments_core_release(withShouldUseStripeSdk, options, list, stripePaymentController$confirmSetupIntent$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("API request returned an invalid response.".toString());
            }
        }
        stripePaymentController$confirmSetupIntent$1 = new StripePaymentController$confirmSetupIntent$1(this, continuation);
        obj = stripePaymentController$confirmSetupIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$confirmSetupIntent$1.label;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository) {
        return Companion.create(context, str, stripeRepository);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleError(AuthActivityStarterHost authActivityStarterHost, int i, Throwable th, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object m77504g = X30.m77504g(this.uiContext, new StripePaymentController$handleError$2(this, authActivityStarterHost, th, i, null), continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return m77504g == coroutine_suspended ? m77504g : Unit.INSTANCE;
    }

    private final void logReturnUrl(String str) {
        PaymentAnalyticsEvent paymentAnalyticsEvent;
        if (Intrinsics.areEqual(str, this.defaultReturnUrl.getValue())) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlDefault;
        } else if (str == null) {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlNull;
        } else {
            paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmReturnUrlCustom;
        }
        this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, paymentAnalyticsEvent, null, null, null, null, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onSourceRetrieved(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object authenticate = this.authenticatorRegistry.getAuthenticator(source).authenticate(authActivityStarterHost, source, options, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return authenticate == coroutine_suspended ? authenticate : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r9 
      PHI: (r9v6 java.lang.Object) = (r9v5 java.lang.Object), (r9v1 java.lang.Object) binds: [B:21:0x0067, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmAndAuthenticateAlipay(ConfirmPaymentIntentParams confirmPaymentIntentParams, AlipayAuthenticator alipayAuthenticator, ApiRequest.Options options, Continuation<? super PaymentIntentResult> continuation) {
        StripePaymentController$confirmAndAuthenticateAlipay$1 stripePaymentController$confirmAndAuthenticateAlipay$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        StripePaymentController stripePaymentController;
        if (continuation instanceof StripePaymentController$confirmAndAuthenticateAlipay$1) {
            stripePaymentController$confirmAndAuthenticateAlipay$1 = (StripePaymentController$confirmAndAuthenticateAlipay$1) continuation;
            int i2 = stripePaymentController$confirmAndAuthenticateAlipay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmAndAuthenticateAlipay$1.label = i2 - Integer.MIN_VALUE;
                obj = stripePaymentController$confirmAndAuthenticateAlipay$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$confirmAndAuthenticateAlipay$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    stripePaymentController = (StripePaymentController) stripePaymentController$confirmAndAuthenticateAlipay$1.L$2;
                    options = (ApiRequest.Options) stripePaymentController$confirmAndAuthenticateAlipay$1.L$1;
                    alipayAuthenticator = (AlipayAuthenticator) stripePaymentController$confirmAndAuthenticateAlipay$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    ResultKt.throwOnFailure(obj);
                    stripePaymentController$confirmAndAuthenticateAlipay$1.L$0 = alipayAuthenticator;
                    stripePaymentController$confirmAndAuthenticateAlipay$1.L$1 = options;
                    stripePaymentController$confirmAndAuthenticateAlipay$1.L$2 = this;
                    stripePaymentController$confirmAndAuthenticateAlipay$1.label = 1;
                    obj = confirmPaymentIntent(confirmPaymentIntentParams, options, stripePaymentController$confirmAndAuthenticateAlipay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    stripePaymentController = this;
                }
                stripePaymentController$confirmAndAuthenticateAlipay$1.L$0 = null;
                stripePaymentController$confirmAndAuthenticateAlipay$1.L$1 = null;
                stripePaymentController$confirmAndAuthenticateAlipay$1.L$2 = null;
                stripePaymentController$confirmAndAuthenticateAlipay$1.label = 2;
                obj = stripePaymentController.authenticateAlipay((PaymentIntent) obj, alipayAuthenticator, options, stripePaymentController$confirmAndAuthenticateAlipay$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj;
            }
        }
        stripePaymentController$confirmAndAuthenticateAlipay$1 = new StripePaymentController$confirmAndAuthenticateAlipay$1(this, continuation);
        obj = stripePaymentController$confirmAndAuthenticateAlipay$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$confirmAndAuthenticateAlipay$1.label;
        if (i == 0) {
        }
        stripePaymentController$confirmAndAuthenticateAlipay$1.L$0 = null;
        stripePaymentController$confirmAndAuthenticateAlipay$1.L$1 = null;
        stripePaymentController$confirmAndAuthenticateAlipay$1.L$2 = null;
        stripePaymentController$confirmAndAuthenticateAlipay$1.label = 2;
        obj = stripePaymentController.authenticateAlipay((PaymentIntent) obj, alipayAuthenticator, options, stripePaymentController$confirmAndAuthenticateAlipay$1);
        if (obj != coroutine_suspended) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object confirmWeChatPay(ConfirmPaymentIntentParams confirmPaymentIntentParams, ApiRequest.Options options, Continuation<? super WeChatPayNextAction> continuation) {
        StripePaymentController$confirmWeChatPay$1 stripePaymentController$confirmWeChatPay$1;
        Object coroutine_suspended;
        int i;
        PaymentIntent paymentIntent;
        if (continuation instanceof StripePaymentController$confirmWeChatPay$1) {
            stripePaymentController$confirmWeChatPay$1 = (StripePaymentController$confirmWeChatPay$1) continuation;
            int i2 = stripePaymentController$confirmWeChatPay$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$confirmWeChatPay$1.label = i2 - Integer.MIN_VALUE;
                Object obj = stripePaymentController$confirmWeChatPay$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$confirmWeChatPay$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    stripePaymentController$confirmWeChatPay$1.label = 1;
                    obj = confirmPaymentIntent(confirmPaymentIntentParams, options, stripePaymentController$confirmWeChatPay$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                paymentIntent = (PaymentIntent) obj;
                if (!(paymentIntent.getNextActionData() instanceof StripeIntent.NextActionData.WeChatPayRedirect)) {
                    return new WeChatPayNextAction(paymentIntent, ((StripeIntent.NextActionData.WeChatPayRedirect) paymentIntent.getNextActionData()).getWeChat());
                }
                throw new IllegalArgumentException("Unable to confirm Payment Intent with WeChatPay SDK".toString());
            }
        }
        stripePaymentController$confirmWeChatPay$1 = new StripePaymentController$confirmWeChatPay$1(this, continuation);
        Object obj2 = stripePaymentController$confirmWeChatPay$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$confirmWeChatPay$1.label;
        if (i == 0) {
        }
        paymentIntent = (PaymentIntent) obj2;
        if (!(paymentIntent.getNextActionData() instanceof StripeIntent.NextActionData.WeChatPayRedirect)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAuthenticateSourceResult(Intent intent, Continuation<? super Source> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        StripePaymentController$getAuthenticateSourceResult$1 stripePaymentController$getAuthenticateSourceResult$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof StripePaymentController$getAuthenticateSourceResult$1) {
            stripePaymentController$getAuthenticateSourceResult$1 = (StripePaymentController$getAuthenticateSourceResult$1) continuation;
            int i2 = stripePaymentController$getAuthenticateSourceResult$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$getAuthenticateSourceResult$1.label = i2 - Integer.MIN_VALUE;
                obj = stripePaymentController$getAuthenticateSourceResult$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$getAuthenticateSourceResult$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    PaymentFlowResult.Unvalidated fromIntent = PaymentFlowResult.Unvalidated.Companion.fromIntent(intent);
                    String sourceId$payments_core_release = fromIntent.getSourceId$payments_core_release();
                    String str = "";
                    if (sourceId$payments_core_release == null) {
                        sourceId$payments_core_release = "";
                    }
                    String clientSecret = fromIntent.getClientSecret();
                    if (clientSecret != null) {
                        str = clientSecret;
                    }
                    ApiRequest.Options options = new ApiRequest.Options(this.publishableKeyProvider.invoke(), fromIntent.getStripeAccountId$payments_core_release(), null, 4, null);
                    this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceResult, null, null, null, null, 30, null));
                    StripeRepository stripeRepository = this.stripeRepository;
                    stripePaymentController$getAuthenticateSourceResult$1.label = 1;
                    obj = stripeRepository.retrieveSource$payments_core_release(sourceId$payments_core_release, str, options, stripePaymentController$getAuthenticateSourceResult$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (obj == null) {
                    return obj;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        stripePaymentController$getAuthenticateSourceResult$1 = new StripePaymentController$getAuthenticateSourceResult$1(this, continuation);
        obj = stripePaymentController$getAuthenticateSourceResult$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$getAuthenticateSourceResult$1.label;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    @Override // com.stripe.android.PaymentController
    public Object getPaymentIntentResult(Intent intent, Continuation<? super PaymentIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        return this.paymentIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent(intent), continuation);
    }

    @Override // com.stripe.android.PaymentController
    public Object getSetupIntentResult(Intent intent, Continuation<? super SetupIntentResult> continuation) throws AuthenticationException, InvalidRequestException, APIConnectionException, APIException, IllegalArgumentException {
        return this.setupIntentFlowResultProcessor.processResult(PaymentFlowResult.Unvalidated.Companion.fromIntent(intent), continuation);
    }

    @Override // com.stripe.android.PaymentController
    public Object handleNextAction(AuthActivityStarterHost authActivityStarterHost, StripeIntent stripeIntent, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        Object coroutine_suspended;
        Object authenticate = this.authenticatorRegistry.getAuthenticator(stripeIntent).authenticate(authActivityStarterHost, stripeIntent, options, continuation);
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return authenticate == coroutine_suspended ? authenticate : Unit.INSTANCE;
    }

    @Override // com.stripe.android.PaymentController
    public void registerLaunchersWithActivityResultCaller(InterfaceC29050u5 activityResultCaller, InterfaceC28515t5<PaymentFlowResult.Unvalidated> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "activityResultCaller");
        Intrinsics.checkNotNullParameter(activityResultCallback, "activityResultCallback");
        this.paymentRelayLauncher = activityResultCaller.registerForActivityResult(new PaymentRelayContract(), activityResultCallback);
        this.authenticatorRegistry.onNewActivityResultCaller(activityResultCaller, activityResultCallback);
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandlePaymentResult(int i, Intent intent) {
        return i == 50000 && intent != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSetupResult(int i, Intent intent) {
        return i == 50001 && intent != null;
    }

    @Override // com.stripe.android.PaymentController
    public boolean shouldHandleSourceResult(int i, Intent intent) {
        return i == 50002 && intent != null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|(2:59|(1:(1:(3:66|30|31)(2:64|65))(4:67|68|69|22))(4:70|71|72|53))(5:9|10|11|12|(1:(4:15|16|17|(1:19)(2:21|22))(3:46|47|48))(2:49|(1:51)(2:52|53)))|(5:24|25|(2:27|(1:29))(4:32|(2:34|(1:36)(2:40|41))(1:42)|37|(1:39))|30|31)(2:43|44)))|76|6|7|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:36:0x00b1, B:47:0x00dc, B:48:0x00e1, B:49:0x00ec, B:45:0x00d8), top: B:79:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1 A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:36:0x00b1, B:47:0x00dc, B:48:0x00e1, B:49:0x00ec, B:45:0x00d8), top: B:79:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuth(AuthActivityStarterHost authActivityStarterHost, String str, ApiRequest.Options options, PaymentController.StripeIntentType stripeIntentType, Continuation<? super Unit> continuation) {
        StripePaymentController$startAuth$1 stripePaymentController$startAuth$1;
        AuthActivityStarterHost authActivityStarterHost2;
        Object coroutine_suspended;
        ?? r3;
        Object m116783constructorimpl;
        StripePaymentController stripePaymentController;
        Throwable m116786exceptionOrNullimpl;
        int i;
        StripePaymentController stripePaymentController2;
        StripePaymentController stripePaymentController3;
        StripeIntent stripeIntent;
        StripePaymentController stripePaymentController4;
        int i2;
        int i3;
        AuthActivityStarterHost authActivityStarterHost3 = authActivityStarterHost;
        ApiRequest.Options options2 = options;
        PaymentController.StripeIntentType stripeIntentType2 = stripeIntentType;
        if (continuation instanceof StripePaymentController$startAuth$1) {
            stripePaymentController$startAuth$1 = (StripePaymentController$startAuth$1) continuation;
            i3 = stripePaymentController$startAuth$1.label;
            ?? r5 = -2147483648;
            r5 = -2147483648;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                int i4 = i3 - Integer.MIN_VALUE;
                stripePaymentController$startAuth$1.label = i4;
                authActivityStarterHost2 = i4;
                StripePaymentController$startAuth$1 stripePaymentController$startAuth$12 = stripePaymentController$startAuth$1;
                Object obj = stripePaymentController$startAuth$12.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r3 = stripePaymentController$startAuth$12.label;
                int i5 = 4;
                if (r3 == 0) {
                    try {
                    } catch (Throwable th) {
                        th = th;
                        stripeIntentType2 = authActivityStarterHost3;
                        options2 = r3;
                        authActivityStarterHost3 = authActivityStarterHost2;
                        i5 = 1;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        stripePaymentController = r5;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (r3 != 1) {
                        if (r3 != 2) {
                            if (r3 != 3 && r3 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        PaymentController.StripeIntentType stripeIntentType3 = (PaymentController.StripeIntentType) stripePaymentController$startAuth$12.L$3;
                        ApiRequest.Options options3 = (ApiRequest.Options) stripePaymentController$startAuth$12.L$2;
                        AuthActivityStarterHost authActivityStarterHost4 = (AuthActivityStarterHost) stripePaymentController$startAuth$12.L$1;
                        stripePaymentController3 = (StripePaymentController) stripePaymentController$startAuth$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        stripeIntentType2 = stripeIntentType3;
                        options2 = options3;
                        authActivityStarterHost3 = authActivityStarterHost4;
                        i5 = 1;
                        stripeIntent = (StripeIntent) obj;
                        stripePaymentController4 = stripePaymentController3;
                    } else {
                        PaymentController.StripeIntentType stripeIntentType4 = (PaymentController.StripeIntentType) stripePaymentController$startAuth$12.L$3;
                        ApiRequest.Options options4 = (ApiRequest.Options) stripePaymentController$startAuth$12.L$2;
                        AuthActivityStarterHost authActivityStarterHost5 = (AuthActivityStarterHost) stripePaymentController$startAuth$12.L$1;
                        stripePaymentController2 = (StripePaymentController) stripePaymentController$startAuth$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        stripeIntentType2 = stripeIntentType4;
                        options2 = options4;
                        authActivityStarterHost3 = authActivityStarterHost5;
                        i5 = 1;
                        stripeIntent = (StripeIntent) obj;
                        stripePaymentController4 = stripePaymentController2;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion2 = Result.Companion;
                        i2 = WhenMappings.$EnumSwitchMapping$0[stripeIntentType.ordinal()];
                    } catch (Throwable th2) {
                        th = th2;
                        i5 = 1;
                    }
                    try {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                StripeRepository stripeRepository = this.stripeRepository;
                                stripePaymentController$startAuth$12.L$0 = this;
                                stripePaymentController$startAuth$12.L$1 = authActivityStarterHost3;
                                stripePaymentController$startAuth$12.L$2 = options2;
                                stripePaymentController$startAuth$12.L$3 = stripeIntentType2;
                                stripePaymentController$startAuth$12.label = 2;
                                i5 = 1;
                                obj = StripeRepository.retrieveSetupIntent$default(stripeRepository, str, options, null, stripePaymentController$startAuth$12, 4, null);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                stripePaymentController3 = this;
                                stripeIntent = (StripeIntent) obj;
                                stripePaymentController4 = stripePaymentController3;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i5 = 1;
                            StripeRepository stripeRepository2 = this.stripeRepository;
                            stripePaymentController$startAuth$12.L$0 = this;
                            stripePaymentController$startAuth$12.L$1 = authActivityStarterHost3;
                            stripePaymentController$startAuth$12.L$2 = options2;
                            stripePaymentController$startAuth$12.L$3 = stripeIntentType2;
                            stripePaymentController$startAuth$12.label = 1;
                            obj = StripeRepository.retrievePaymentIntent$default(stripeRepository2, str, options, null, stripePaymentController$startAuth$12, 4, null);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripePaymentController2 = this;
                            stripeIntent = (StripeIntent) obj;
                            stripePaymentController4 = stripePaymentController2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r5 = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        stripePaymentController = r5;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                if (stripeIntent == null) {
                    m116783constructorimpl = Result.m116783constructorimpl(stripeIntent);
                    stripePaymentController = stripePaymentController4;
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        stripePaymentController$startAuth$12.L$0 = null;
                        stripePaymentController$startAuth$12.L$1 = null;
                        stripePaymentController$startAuth$12.L$2 = null;
                        stripePaymentController$startAuth$12.L$3 = null;
                        stripePaymentController$startAuth$12.label = 3;
                        if (stripePaymentController.handleNextAction(authActivityStarterHost3, (StripeIntent) m116783constructorimpl, options2, stripePaymentController$startAuth$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        int i6 = WhenMappings.$EnumSwitchMapping$0[stripeIntentType2.ordinal()];
                        if (i6 != i5) {
                            if (i6 == 2) {
                                i = SETUP_REQUEST_CODE;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i = PAYMENT_REQUEST_CODE;
                        }
                        stripePaymentController$startAuth$12.L$0 = null;
                        stripePaymentController$startAuth$12.L$1 = null;
                        stripePaymentController$startAuth$12.L$2 = null;
                        stripePaymentController$startAuth$12.L$3 = null;
                        stripePaymentController$startAuth$12.label = 4;
                        if (stripePaymentController.handleError(authActivityStarterHost3, i, m116786exceptionOrNullimpl, stripePaymentController$startAuth$12) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        stripePaymentController$startAuth$1 = new StripePaymentController$startAuth$1(this, continuation);
        authActivityStarterHost2 = i3;
        StripePaymentController$startAuth$1 stripePaymentController$startAuth$122 = stripePaymentController$startAuth$1;
        Object obj2 = stripePaymentController$startAuth$122.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r3 = stripePaymentController$startAuth$122.label;
        int i52 = 4;
        if (r3 == 0) {
        }
        if (stripeIntent == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094 A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #2 {all -> 0x004f, blocks: (B:18:0x004b, B:38:0x0094, B:39:0x009b, B:40:0x00a6), top: B:61:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009b A[Catch: all -> 0x004f, TryCatch #2 {all -> 0x004f, blocks: (B:18:0x004b, B:38:0x0094, B:39:0x009b, B:40:0x00a6), top: B:61:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startAuthenticateSource(AuthActivityStarterHost authActivityStarterHost, Source source, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        StripePaymentController$startAuthenticateSource$1 stripePaymentController$startAuthenticateSource$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        AuthActivityStarterHost authActivityStarterHost2;
        StripePaymentController stripePaymentController;
        AuthActivityStarterHost authActivityStarterHost3;
        Object m116783constructorimpl;
        Throwable m116786exceptionOrNullimpl;
        ApiRequest.Options options2 = options;
        if (continuation instanceof StripePaymentController$startAuthenticateSource$1) {
            stripePaymentController$startAuthenticateSource$1 = (StripePaymentController$startAuthenticateSource$1) continuation;
            int i2 = stripePaymentController$startAuthenticateSource$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stripePaymentController$startAuthenticateSource$1.label = i2 - Integer.MIN_VALUE;
                obj = stripePaymentController$startAuthenticateSource$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = stripePaymentController$startAuthenticateSource$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2 && i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    options2 = (ApiRequest.Options) stripePaymentController$startAuthenticateSource$1.L$2;
                    authActivityStarterHost3 = (AuthActivityStarterHost) stripePaymentController$startAuthenticateSource$1.L$1;
                    stripePaymentController = (StripePaymentController) stripePaymentController$startAuthenticateSource$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th) {
                        th = th;
                        authActivityStarterHost2 = authActivityStarterHost3;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        authActivityStarterHost3 = authActivityStarterHost2;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl == null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    this.analyticsRequestExecutor.executeAsync(PaymentAnalyticsRequestFactory.createRequest$payments_core_release$default(this.paymentAnalyticsRequestFactory, PaymentAnalyticsEvent.AuthSourceStart, null, null, null, null, 30, null));
                    try {
                        Result.Companion companion2 = Result.Companion;
                        StripeRepository stripeRepository = this.stripeRepository;
                        String id = source.getId();
                        String str = "";
                        if (id == null) {
                            id = "";
                        }
                        String clientSecret = source.getClientSecret();
                        if (clientSecret != null) {
                            str = clientSecret;
                        }
                        stripePaymentController$startAuthenticateSource$1.L$0 = this;
                        authActivityStarterHost2 = authActivityStarterHost;
                        try {
                            stripePaymentController$startAuthenticateSource$1.L$1 = authActivityStarterHost2;
                            stripePaymentController$startAuthenticateSource$1.L$2 = options2;
                            stripePaymentController$startAuthenticateSource$1.label = 1;
                            obj = stripeRepository.retrieveSource$payments_core_release(id, str, options2, stripePaymentController$startAuthenticateSource$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripePaymentController = this;
                            authActivityStarterHost3 = authActivityStarterHost2;
                        } catch (Throwable th2) {
                            th = th2;
                            stripePaymentController = this;
                            Result.Companion companion3 = Result.Companion;
                            m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                            authActivityStarterHost3 = authActivityStarterHost2;
                            m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                            if (m116786exceptionOrNullimpl == null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        authActivityStarterHost2 = authActivityStarterHost;
                    }
                }
                if (obj == null) {
                    m116783constructorimpl = Result.m116783constructorimpl((Source) obj);
                    m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                    if (m116786exceptionOrNullimpl == null) {
                        stripePaymentController$startAuthenticateSource$1.L$0 = null;
                        stripePaymentController$startAuthenticateSource$1.L$1 = null;
                        stripePaymentController$startAuthenticateSource$1.L$2 = null;
                        stripePaymentController$startAuthenticateSource$1.label = 2;
                        if (stripePaymentController.onSourceRetrieved(authActivityStarterHost3, (Source) m116783constructorimpl, options2, stripePaymentController$startAuthenticateSource$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        stripePaymentController$startAuthenticateSource$1.L$0 = null;
                        stripePaymentController$startAuthenticateSource$1.L$1 = null;
                        stripePaymentController$startAuthenticateSource$1.L$2 = null;
                        stripePaymentController$startAuthenticateSource$1.label = 3;
                        if (stripePaymentController.handleError(authActivityStarterHost3, SOURCE_REQUEST_CODE, m116786exceptionOrNullimpl, stripePaymentController$startAuthenticateSource$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        stripePaymentController$startAuthenticateSource$1 = new StripePaymentController$startAuthenticateSource$1(this, continuation);
        obj = stripePaymentController$startAuthenticateSource$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stripePaymentController$startAuthenticateSource$1.label;
        if (i == 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(9:5|6|7|(2:65|(1:(1:(3:72|37|38)(2:70|71))(4:73|74|75|49))(4:76|77|78|20))(5:9|(1:11)(5:55|(2:57|(3:59|(1:61)|(1:63)))|64|(0)|(0))|12|13|(2:15|(1:17)(2:19|20))(2:43|(2:45|(1:47)(2:48|49))(2:50|51)))|21|22|(4:24|(3:30|(1:32)|33)|34|(1:36))(2:39|(1:41))|37|38))|82|6|7|(0)(0)|21|22|(0)(0)|37|38|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r2 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // com.stripe.android.PaymentController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object startConfirmAndAuth(AuthActivityStarterHost authActivityStarterHost, ConfirmStripeIntentParams confirmStripeIntentParams, ApiRequest.Options options, Continuation<? super Unit> continuation) {
        StripePaymentController$startConfirmAndAuth$1 stripePaymentController$startConfirmAndAuth$1;
        Object coroutine_suspended;
        ?? r2;
        Object m116783constructorimpl;
        String str;
        StripePaymentController stripePaymentController;
        Throwable m116786exceptionOrNullimpl;
        String id;
        String str2;
        Object obj;
        String str3;
        Object obj2;
        StripePaymentController stripePaymentController2;
        StripeIntent stripeIntent;
        StripePaymentController stripePaymentController3;
        boolean z;
        boolean isBlank;
        if (continuation instanceof StripePaymentController$startConfirmAndAuth$1) {
            stripePaymentController$startConfirmAndAuth$1 = (StripePaymentController$startConfirmAndAuth$1) continuation;
            int i = stripePaymentController$startConfirmAndAuth$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stripePaymentController$startConfirmAndAuth$1.label = i - Integer.MIN_VALUE;
                String str4 = stripePaymentController$startConfirmAndAuth$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r2 = stripePaymentController$startConfirmAndAuth$1.label;
                ?? r5 = 2;
                r5 = 2;
                if (r2 == 0) {
                    try {
                    } catch (Throwable th) {
                        str4 = authActivityStarterHost;
                        authActivityStarterHost = r2;
                        th = th;
                        Result.Companion companion = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        stripePaymentController = r5;
                        str = str4;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            if (r2 != 3 && r2 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(str4);
                            return Unit.INSTANCE;
                        }
                        String str5 = (String) stripePaymentController$startConfirmAndAuth$1.L$4;
                        options = (ApiRequest.Options) stripePaymentController$startConfirmAndAuth$1.L$3;
                        confirmStripeIntentParams = (ConfirmStripeIntentParams) stripePaymentController$startConfirmAndAuth$1.L$2;
                        AuthActivityStarterHost authActivityStarterHost2 = (AuthActivityStarterHost) stripePaymentController$startConfirmAndAuth$1.L$1;
                        StripePaymentController stripePaymentController4 = (StripePaymentController) stripePaymentController$startConfirmAndAuth$1.L$0;
                        ResultKt.throwOnFailure(str4);
                        str3 = str5;
                        authActivityStarterHost = authActivityStarterHost2;
                        obj2 = str4;
                        stripePaymentController2 = stripePaymentController4;
                        stripeIntent = (StripeIntent) obj2;
                        r5 = stripePaymentController2;
                        str4 = str3;
                    } else {
                        String str6 = (String) stripePaymentController$startConfirmAndAuth$1.L$4;
                        options = (ApiRequest.Options) stripePaymentController$startConfirmAndAuth$1.L$3;
                        confirmStripeIntentParams = (ConfirmStripeIntentParams) stripePaymentController$startConfirmAndAuth$1.L$2;
                        AuthActivityStarterHost authActivityStarterHost3 = (AuthActivityStarterHost) stripePaymentController$startConfirmAndAuth$1.L$1;
                        StripePaymentController stripePaymentController5 = (StripePaymentController) stripePaymentController$startConfirmAndAuth$1.L$0;
                        ResultKt.throwOnFailure(str4);
                        str2 = str6;
                        authActivityStarterHost = authActivityStarterHost3;
                        obj = str4;
                        stripePaymentController3 = stripePaymentController5;
                        stripeIntent = (StripeIntent) obj;
                        r5 = stripePaymentController3;
                        str4 = str2;
                    }
                } else {
                    ResultKt.throwOnFailure(str4);
                    logReturnUrl(confirmStripeIntentParams.getReturnUrl());
                    if (this.isInstantApp) {
                        str4 = confirmStripeIntentParams.getReturnUrl();
                    } else {
                        str4 = confirmStripeIntentParams.getReturnUrl();
                        if (str4 != null) {
                            isBlank = StringsKt__StringsJVMKt.isBlank(str4);
                            if (!isBlank) {
                                z = false;
                                if (z) {
                                    str4 = null;
                                }
                                if (str4 == null) {
                                    str4 = this.defaultReturnUrl.getValue();
                                }
                            }
                        }
                        z = true;
                        if (z) {
                        }
                        if (str4 == null) {
                        }
                    }
                    try {
                        Result.Companion companion2 = Result.Companion;
                        if (confirmStripeIntentParams instanceof ConfirmPaymentIntentParams) {
                            ((ConfirmPaymentIntentParams) confirmStripeIntentParams).setReturnUrl(str4);
                            stripePaymentController$startConfirmAndAuth$1.L$0 = this;
                            stripePaymentController$startConfirmAndAuth$1.L$1 = authActivityStarterHost;
                            stripePaymentController$startConfirmAndAuth$1.L$2 = confirmStripeIntentParams;
                            stripePaymentController$startConfirmAndAuth$1.L$3 = options;
                            stripePaymentController$startConfirmAndAuth$1.L$4 = str4;
                            stripePaymentController$startConfirmAndAuth$1.label = 1;
                            obj = confirmPaymentIntent((ConfirmPaymentIntentParams) confirmStripeIntentParams, options, stripePaymentController$startConfirmAndAuth$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripePaymentController3 = this;
                            str2 = str4;
                            stripeIntent = (StripeIntent) obj;
                            r5 = stripePaymentController3;
                            str4 = str2;
                        } else if (confirmStripeIntentParams instanceof ConfirmSetupIntentParams) {
                            ((ConfirmSetupIntentParams) confirmStripeIntentParams).setReturnUrl(str4);
                            stripePaymentController$startConfirmAndAuth$1.L$0 = this;
                            stripePaymentController$startConfirmAndAuth$1.L$1 = authActivityStarterHost;
                            stripePaymentController$startConfirmAndAuth$1.L$2 = confirmStripeIntentParams;
                            stripePaymentController$startConfirmAndAuth$1.L$3 = options;
                            stripePaymentController$startConfirmAndAuth$1.L$4 = str4;
                            stripePaymentController$startConfirmAndAuth$1.label = 2;
                            obj2 = confirmSetupIntent((ConfirmSetupIntentParams) confirmStripeIntentParams, options, stripePaymentController$startConfirmAndAuth$1);
                            if (obj2 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            stripePaymentController2 = this;
                            str3 = str4;
                            stripeIntent = (StripeIntent) obj2;
                            r5 = stripePaymentController2;
                            str4 = str3;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r5 = this;
                        Result.Companion companion3 = Result.Companion;
                        m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
                        stripePaymentController = r5;
                        str = str4;
                        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                        if (m116786exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                m116783constructorimpl = Result.m116783constructorimpl(stripeIntent);
                stripePaymentController = r5;
                str = str4;
                m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
                if (m116786exceptionOrNullimpl != null) {
                    StripeIntent stripeIntent2 = (StripeIntent) m116783constructorimpl;
                    StripeIntent.NextActionData nextActionData = stripeIntent2.getNextActionData();
                    if (nextActionData != null && (nextActionData instanceof StripeIntent.NextActionData.SdkData.Use3DS1) && (id = stripeIntent2.getId()) != null) {
                        Map<String, String> map = stripePaymentController.threeDs1IntentReturnUrlMap;
                        String str7 = str;
                        if (str == null) {
                            str7 = "";
                        }
                        map.put(id, str7);
                    }
                    stripePaymentController$startConfirmAndAuth$1.L$0 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$1 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$2 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$3 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$4 = null;
                    stripePaymentController$startConfirmAndAuth$1.label = 3;
                    if (stripePaymentController.handleNextAction(authActivityStarterHost, stripeIntent2, options, stripePaymentController$startConfirmAndAuth$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int requestCode$payments_core_release = Companion.getRequestCode$payments_core_release(confirmStripeIntentParams);
                    stripePaymentController$startConfirmAndAuth$1.L$0 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$1 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$2 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$3 = null;
                    stripePaymentController$startConfirmAndAuth$1.L$4 = null;
                    stripePaymentController$startConfirmAndAuth$1.label = 4;
                    if (stripePaymentController.handleError(authActivityStarterHost, requestCode$payments_core_release, m116786exceptionOrNullimpl, stripePaymentController$startConfirmAndAuth$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        stripePaymentController$startConfirmAndAuth$1 = new StripePaymentController$startConfirmAndAuth$1(this, continuation);
        String str42 = stripePaymentController$startConfirmAndAuth$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = stripePaymentController$startConfirmAndAuth$1.label;
        ?? r52 = 2;
        r52 = 2;
        if (r2 == 0) {
        }
        m116783constructorimpl = Result.m116783constructorimpl(stripeIntent);
        stripePaymentController = r52;
        str = str42;
        m116786exceptionOrNullimpl = Result.m116786exceptionOrNullimpl(m116783constructorimpl);
        if (m116786exceptionOrNullimpl != null) {
        }
        return Unit.INSTANCE;
    }

    @Override // com.stripe.android.PaymentController
    public void unregisterLaunchers() {
        AbstractC0407B5<PaymentRelayStarter.Args> abstractC0407B5 = this.paymentRelayLauncher;
        if (abstractC0407B5 != null) {
            abstractC0407B5.mo67435c();
        }
        this.paymentRelayLauncher = null;
        this.authenticatorRegistry.onLauncherInvalidated();
    }

    @JvmStatic
    @JvmOverloads
    public static final PaymentController create(Context context, String str, StripeRepository stripeRepository, boolean z) {
        return Companion.create(context, str, stripeRepository, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ StripePaymentController(Context context, final Function0 function0, StripeRepository stripeRepository, boolean z, CoroutineContext coroutineContext, AnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, AlipayRepository alipayRepository, CoroutineContext coroutineContext2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function0, stripeRepository, r6, r7, r8, r9, (i & 128) != 0 ? new DefaultAlipayRepository(stripeRepository) : alipayRepository, (i & 256) != 0 ? T41.m84376c() : coroutineContext2);
        PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory2;
        boolean z2 = (i & 8) != 0 ? false : z;
        SC0 m84377b = (i & 16) != 0 ? T41.m84377b() : coroutineContext;
        DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor = (i & 32) != 0 ? new DefaultAnalyticsRequestExecutor(Logger.Companion.getInstance(z2), m84377b) : analyticsRequestExecutor;
        if ((i & 64) != 0) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            paymentAnalyticsRequestFactory2 = new PaymentAnalyticsRequestFactory(applicationContext, new Y94() { // from class: AS5
                @Override // p000.Y94
                public final Object get() {
                    String _init_$lambda$0;
                    _init_$lambda$0 = StripePaymentController._init_$lambda$0(Function0.this);
                    return _init_$lambda$0;
                }
            });
        } else {
            paymentAnalyticsRequestFactory2 = paymentAnalyticsRequestFactory;
        }
    }
}
