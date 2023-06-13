package com.stripe.android.payments.paymentlauncher;

import android.app.Application;
import androidx.lifecycle.C11747p;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11759u;
import co.bird.android.model.LegacyRepairType;
import com.stripe.android.StripeIntentResult;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.injection.InjectWithFallbackKt;
import com.stripe.android.core.injection.Injectable;
import com.stripe.android.core.injection.Injector;
import com.stripe.android.core.injection.UIContext;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.ConfirmSetupIntentParams;
import com.stripe.android.model.ConfirmStripeIntentParams;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import com.stripe.android.payments.core.injection.DaggerPaymentLauncherViewModelFactoryComponent;
import com.stripe.android.payments.core.injection.NamedConstantsKt;
import com.stripe.android.payments.core.injection.PaymentLauncherViewModelSubcomponent;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherContract;
import com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel;
import com.stripe.android.payments.paymentlauncher.PaymentResult;
import com.stripe.android.utils.CreationExtrasKtxKt;
import com.stripe.android.view.AuthActivityStarterHost;
import dagger.Lazy;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 U2\u00020\u0001:\u0002UVB\u0095\u0001\b\u0007\u0012\b\b\u0001\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010.\u001a\u00020-\u0012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100\u0012\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000404\u0012\f\u00109\u001a\b\u0012\u0004\u0012\u00020807\u0012\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;07\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010A\u001a\u00020@\u0012\b\b\u0001\u0010D\u001a\u00020C\u0012\u0006\u0010G\u001a\u00020F\u0012\b\b\u0001\u0010I\u001a\u00020$¢\u0006\u0004\bS\u0010TJ%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020;078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010G\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010&R \u0010L\u001a\b\u0012\u0004\u0012\u00020K0J8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006W"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel;", "LOr6;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "confirmStripeIntentParams", "", "returnUrl", "Lcom/stripe/android/model/StripeIntent;", "confirmIntent", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/StripeIntentResult;", "stripeIntentResult", "", "postResult", "logReturnUrl", "Lu5;", "caller", "register$payments_core_release", "(Lu5;)V", "register", "Lcom/stripe/android/view/AuthActivityStarterHost;", "host", "confirmStripeIntent$payments_core_release", "(Lcom/stripe/android/model/ConfirmStripeIntentParams;Lcom/stripe/android/view/AuthActivityStarterHost;)V", "confirmStripeIntent", "clientSecret", "handleNextActionForStripeIntent$payments_core_release", "(Ljava/lang/String;Lcom/stripe/android/view/AuthActivityStarterHost;)V", "handleNextActionForStripeIntent", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "onPaymentFlowResult$payments_core_release", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)V", "onPaymentFlowResult", "cleanUp$payments_core_release", "()V", "cleanUp", "", NamedConstantsKt.IS_PAYMENT_INTENT, "Z", "Lcom/stripe/android/networking/StripeRepository;", "stripeApiRepository", "Lcom/stripe/android/networking/StripeRepository;", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "authenticatorRegistry", "Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;", "Lcom/stripe/android/payments/DefaultReturnUrl;", "defaultReturnUrl", "Lcom/stripe/android/payments/DefaultReturnUrl;", "LY94;", "Lcom/stripe/android/core/networking/ApiRequest$Options;", "apiRequestOptionsProvider", "LY94;", "", "threeDs1IntentReturnUrlMap", "Ljava/util/Map;", "Ldagger/Lazy;", "Lcom/stripe/android/payments/PaymentIntentFlowResultProcessor;", "lazyPaymentIntentFlowResultProcessor", "Ldagger/Lazy;", "Lcom/stripe/android/payments/SetupIntentFlowResultProcessor;", "lazySetupIntentFlowResultProcessor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "paymentAnalyticsRequestFactory", "Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;", "Lkotlin/coroutines/CoroutineContext;", "uiContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/p;", "savedStateHandle", "Landroidx/lifecycle/p;", NamedConstantsKt.IS_INSTANT_APP, "LuX2;", "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;", "paymentLauncherResult", "LuX2;", "getPaymentLauncherResult$payments_core_release", "()LuX2;", "getHasStarted", "()Z", "hasStarted", "<init>", "(ZLcom/stripe/android/networking/StripeRepository;Lcom/stripe/android/payments/core/authentication/PaymentAuthenticatorRegistry;Lcom/stripe/android/payments/DefaultReturnUrl;LY94;Ljava/util/Map;Ldagger/Lazy;Ldagger/Lazy;Lcom/stripe/android/core/networking/DefaultAnalyticsRequestExecutor;Lcom/stripe/android/networking/PaymentAnalyticsRequestFactory;Lkotlin/coroutines/CoroutineContext;Landroidx/lifecycle/p;Z)V", "Companion", "Factory", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes7.dex */
public final class PaymentLauncherViewModel extends AbstractC35048Or6 {
    public static final Companion Companion = new Companion(null);
    private static final List<String> EXPAND_PAYMENT_METHOD;
    public static final String KEY_HAS_STARTED = "key_has_started";
    public static final String REQUIRED_ERROR = "API request returned an invalid response.";
    public static final String TIMEOUT_ERROR = "Payment fails due to time out. \n";
    public static final String UNKNOWN_ERROR = "Payment fails due to unknown error. \n";
    private final DefaultAnalyticsRequestExecutor analyticsRequestExecutor;
    private final Y94<ApiRequest.Options> apiRequestOptionsProvider;
    private final PaymentAuthenticatorRegistry authenticatorRegistry;
    private final DefaultReturnUrl defaultReturnUrl;
    private final boolean isInstantApp;
    private final boolean isPaymentIntent;
    private final Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor;
    private final Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor;
    private final PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory;
    private final C49882uX2<PaymentResult> paymentLauncherResult;
    private final C11747p savedStateHandle;
    private final StripeRepository stripeApiRepository;
    private final Map<String, String> threeDs1IntentReturnUrlMap;
    private final CoroutineContext uiContext;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0002R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Companion;", "", "()V", "EXPAND_PAYMENT_METHOD", "", "", "getEXPAND_PAYMENT_METHOD", "()Ljava/util/List;", "KEY_HAS_STARTED", "getKEY_HAS_STARTED$payments_core_release$annotations", "REQUIRED_ERROR", "TIMEOUT_ERROR", "UNKNOWN_ERROR", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getKEY_HAS_STARTED$payments_core_release$annotations() {
        }

        public final List<String> getEXPAND_PAYMENT_METHOD() {
            return PaymentLauncherViewModel.EXPAND_PAYMENT_METHOD;
        }

        private Companion() {
        }
    }

    @Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u001dB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H\u0016R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory;", "Landroidx/lifecycle/u$b;", "Lcom/stripe/android/core/injection/Injectable;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory$FallbackInitializeParam;", "LOr6;", "T", "Ljava/lang/Class;", "modelClass", "LFE0;", "extras", "create", "(Ljava/lang/Class;LFE0;)LOr6;", "arg", "Lcom/stripe/android/core/injection/Injector;", "fallbackInitialize", "Lkotlin/Function0;", "Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherContract$Args;", "argsSupplier", "Lkotlin/jvm/functions/Function0;", "LY94;", "Lcom/stripe/android/payments/core/injection/PaymentLauncherViewModelSubcomponent$Builder;", "subComponentBuilderProvider", "LY94;", "getSubComponentBuilderProvider", "()LY94;", "setSubComponentBuilderProvider", "(LY94;)V", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "FallbackInitializeParam", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* loaded from: classes7.dex */
    public static final class Factory implements C11759u.InterfaceC11763b, Injectable<FallbackInitializeParam> {
        private final Function0<PaymentLauncherContract.Args> argsSupplier;
        public Y94<PaymentLauncherViewModelSubcomponent.Builder> subComponentBuilderProvider;

        @Metadata(m28433d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0003JC\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006 "}, m28432d2 = {"Lcom/stripe/android/payments/paymentlauncher/PaymentLauncherViewModel$Factory$FallbackInitializeParam;", "", "application", "Landroid/app/Application;", com.stripe.android.core.injection.NamedConstantsKt.ENABLE_LOGGING, "", "publishableKey", "", com.stripe.android.core.injection.NamedConstantsKt.STRIPE_ACCOUNT_ID, NamedConstantsKt.PRODUCT_USAGE, "", "(Landroid/app/Application;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "getApplication", "()Landroid/app/Application;", "getEnableLogging", "()Z", "getProductUsage", "()Ljava/util/Set;", "getPublishableKey", "()Ljava/lang/String;", "getStripeAccountId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "payments-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
        /* loaded from: classes7.dex */
        public static final class FallbackInitializeParam {
            private final Application application;
            private final boolean enableLogging;
            private final Set<String> productUsage;
            private final String publishableKey;
            private final String stripeAccountId;

            public FallbackInitializeParam(Application application, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.application = application;
                this.enableLogging = z;
                this.publishableKey = publishableKey;
                this.stripeAccountId = str;
                this.productUsage = productUsage;
            }

            public static /* synthetic */ FallbackInitializeParam copy$default(FallbackInitializeParam fallbackInitializeParam, Application application, boolean z, String str, String str2, Set set, int i, Object obj) {
                if ((i & 1) != 0) {
                    application = fallbackInitializeParam.application;
                }
                if ((i & 2) != 0) {
                    z = fallbackInitializeParam.enableLogging;
                }
                boolean z2 = z;
                if ((i & 4) != 0) {
                    str = fallbackInitializeParam.publishableKey;
                }
                String str3 = str;
                if ((i & 8) != 0) {
                    str2 = fallbackInitializeParam.stripeAccountId;
                }
                String str4 = str2;
                Set<String> set2 = set;
                if ((i & 16) != 0) {
                    set2 = fallbackInitializeParam.productUsage;
                }
                return fallbackInitializeParam.copy(application, z2, str3, str4, set2);
            }

            public final Application component1() {
                return this.application;
            }

            public final boolean component2() {
                return this.enableLogging;
            }

            public final String component3() {
                return this.publishableKey;
            }

            public final String component4() {
                return this.stripeAccountId;
            }

            public final Set<String> component5() {
                return this.productUsage;
            }

            public final FallbackInitializeParam copy(Application application, boolean z, String publishableKey, String str, Set<String> productUsage) {
                Intrinsics.checkNotNullParameter(application, "application");
                Intrinsics.checkNotNullParameter(publishableKey, "publishableKey");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                return new FallbackInitializeParam(application, z, publishableKey, str, productUsage);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof FallbackInitializeParam) {
                    FallbackInitializeParam fallbackInitializeParam = (FallbackInitializeParam) obj;
                    return Intrinsics.areEqual(this.application, fallbackInitializeParam.application) && this.enableLogging == fallbackInitializeParam.enableLogging && Intrinsics.areEqual(this.publishableKey, fallbackInitializeParam.publishableKey) && Intrinsics.areEqual(this.stripeAccountId, fallbackInitializeParam.stripeAccountId) && Intrinsics.areEqual(this.productUsage, fallbackInitializeParam.productUsage);
                }
                return false;
            }

            public final Application getApplication() {
                return this.application;
            }

            public final boolean getEnableLogging() {
                return this.enableLogging;
            }

            public final Set<String> getProductUsage() {
                return this.productUsage;
            }

            public final String getPublishableKey() {
                return this.publishableKey;
            }

            public final String getStripeAccountId() {
                return this.stripeAccountId;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public int hashCode() {
                int hashCode = this.application.hashCode() * 31;
                boolean z = this.enableLogging;
                int i = z;
                if (z != 0) {
                    i = 1;
                }
                int hashCode2 = (((hashCode + i) * 31) + this.publishableKey.hashCode()) * 31;
                String str = this.stripeAccountId;
                return ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                Application application = this.application;
                boolean z = this.enableLogging;
                String str = this.publishableKey;
                String str2 = this.stripeAccountId;
                Set<String> set = this.productUsage;
                return "FallbackInitializeParam(application=" + application + ", enableLogging=" + z + ", publishableKey=" + str + ", stripeAccountId=" + str2 + ", productUsage=" + set + ")";
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory(Function0<? extends PaymentLauncherContract.Args> argsSupplier) {
            Intrinsics.checkNotNullParameter(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public /* bridge */ /* synthetic */ AbstractC35048Or6 create(Class cls) {
            return super.create(cls);
        }

        public final Y94<PaymentLauncherViewModelSubcomponent.Builder> getSubComponentBuilderProvider() {
            Y94<PaymentLauncherViewModelSubcomponent.Builder> y94 = this.subComponentBuilderProvider;
            if (y94 != null) {
                return y94;
            }
            Intrinsics.throwUninitializedPropertyAccessException("subComponentBuilderProvider");
            return null;
        }

        public final void setSubComponentBuilderProvider(Y94<PaymentLauncherViewModelSubcomponent.Builder> y94) {
            Intrinsics.checkNotNullParameter(y94, "<set-?>");
            this.subComponentBuilderProvider = y94;
        }

        @Override // androidx.lifecycle.C11759u.InterfaceC11763b
        public <T extends AbstractC35048Or6> T create(Class<T> modelClass, FE0 extras) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(extras, "extras");
            PaymentLauncherContract.Args invoke = this.argsSupplier.invoke();
            Application requireApplication = CreationExtrasKtxKt.requireApplication(extras);
            C11747p m66936a = C11750q.m66936a(extras);
            InjectWithFallbackKt.injectWithFallback(this, invoke.getInjectorKey(), new FallbackInitializeParam(requireApplication, invoke.getEnableLogging(), invoke.getPublishableKey(), invoke.getStripeAccountId(), invoke.getProductUsage()));
            boolean z = false;
            if (invoke instanceof PaymentLauncherContract.Args.IntentConfirmationArgs) {
                ConfirmStripeIntentParams confirmStripeIntentParams = ((PaymentLauncherContract.Args.IntentConfirmationArgs) invoke).getConfirmStripeIntentParams();
                if (!(confirmStripeIntentParams instanceof ConfirmPaymentIntentParams)) {
                    if (!(confirmStripeIntentParams instanceof ConfirmSetupIntentParams)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
            } else {
                if (!(invoke instanceof PaymentLauncherContract.Args.PaymentIntentNextActionArgs)) {
                    if (!(invoke instanceof PaymentLauncherContract.Args.SetupIntentNextActionArgs)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                z = true;
            }
            PaymentLauncherViewModel viewModel = getSubComponentBuilderProvider().get().isPaymentIntent(z).savedStateHandle(m66936a).build().getViewModel();
            Intrinsics.checkNotNull(viewModel, "null cannot be cast to non-null type T of com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel.Factory.create");
            return viewModel;
        }

        @Override // com.stripe.android.core.injection.Injectable
        public Injector fallbackInitialize(FallbackInitializeParam arg) {
            Intrinsics.checkNotNullParameter(arg, "arg");
            DaggerPaymentLauncherViewModelFactoryComponent.builder().context(arg.getApplication()).enableLogging(arg.getEnableLogging()).publishableKeyProvider(new PaymentLauncherViewModel$Factory$fallbackInitialize$1(arg)).stripeAccountIdProvider(new PaymentLauncherViewModel$Factory$fallbackInitialize$2(arg)).productUsage(arg.getProductUsage()).build().inject(this);
            return null;
        }
    }

    static {
        List<String> listOf;
        listOf = CollectionsKt__CollectionsJVMKt.listOf("payment_method");
        EXPAND_PAYMENT_METHOD = listOf;
    }

    public PaymentLauncherViewModel(boolean z, StripeRepository stripeApiRepository, PaymentAuthenticatorRegistry authenticatorRegistry, DefaultReturnUrl defaultReturnUrl, Y94<ApiRequest.Options> apiRequestOptionsProvider, Map<String, String> threeDs1IntentReturnUrlMap, Lazy<PaymentIntentFlowResultProcessor> lazyPaymentIntentFlowResultProcessor, Lazy<SetupIntentFlowResultProcessor> lazySetupIntentFlowResultProcessor, DefaultAnalyticsRequestExecutor analyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, @UIContext CoroutineContext uiContext, C11747p savedStateHandle, boolean z2) {
        Intrinsics.checkNotNullParameter(stripeApiRepository, "stripeApiRepository");
        Intrinsics.checkNotNullParameter(authenticatorRegistry, "authenticatorRegistry");
        Intrinsics.checkNotNullParameter(defaultReturnUrl, "defaultReturnUrl");
        Intrinsics.checkNotNullParameter(apiRequestOptionsProvider, "apiRequestOptionsProvider");
        Intrinsics.checkNotNullParameter(threeDs1IntentReturnUrlMap, "threeDs1IntentReturnUrlMap");
        Intrinsics.checkNotNullParameter(lazyPaymentIntentFlowResultProcessor, "lazyPaymentIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(lazySetupIntentFlowResultProcessor, "lazySetupIntentFlowResultProcessor");
        Intrinsics.checkNotNullParameter(analyticsRequestExecutor, "analyticsRequestExecutor");
        Intrinsics.checkNotNullParameter(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        Intrinsics.checkNotNullParameter(uiContext, "uiContext");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.isPaymentIntent = z;
        this.stripeApiRepository = stripeApiRepository;
        this.authenticatorRegistry = authenticatorRegistry;
        this.defaultReturnUrl = defaultReturnUrl;
        this.apiRequestOptionsProvider = apiRequestOptionsProvider;
        this.threeDs1IntentReturnUrlMap = threeDs1IntentReturnUrlMap;
        this.lazyPaymentIntentFlowResultProcessor = lazyPaymentIntentFlowResultProcessor;
        this.lazySetupIntentFlowResultProcessor = lazySetupIntentFlowResultProcessor;
        this.analyticsRequestExecutor = analyticsRequestExecutor;
        this.paymentAnalyticsRequestFactory = paymentAnalyticsRequestFactory;
        this.uiContext = uiContext;
        this.savedStateHandle = savedStateHandle;
        this.isInstantApp = z2;
        this.paymentLauncherResult = new C49882uX2<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmIntent(ConfirmStripeIntentParams confirmStripeIntentParams, String str, Continuation<? super StripeIntent> continuation) {
        PaymentLauncherViewModel$confirmIntent$1 paymentLauncherViewModel$confirmIntent$1;
        Object coroutine_suspended;
        int i;
        StripeIntent stripeIntent;
        if (continuation instanceof PaymentLauncherViewModel$confirmIntent$1) {
            paymentLauncherViewModel$confirmIntent$1 = (PaymentLauncherViewModel$confirmIntent$1) continuation;
            int i2 = paymentLauncherViewModel$confirmIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentLauncherViewModel$confirmIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentLauncherViewModel$confirmIntent$1.result;
                coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = paymentLauncherViewModel$confirmIntent$1.label;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                            stripeIntent = (StripeIntent) obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        stripeIntent = (StripeIntent) obj;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    confirmStripeIntentParams.setReturnUrl(str);
                    ConfirmStripeIntentParams withShouldUseStripeSdk = confirmStripeIntentParams.withShouldUseStripeSdk(true);
                    if (withShouldUseStripeSdk instanceof ConfirmPaymentIntentParams) {
                        ApiRequest.Options options = this.apiRequestOptionsProvider.get();
                        Intrinsics.checkNotNullExpressionValue(options, "apiRequestOptionsProvider.get()");
                        List<String> list = EXPAND_PAYMENT_METHOD;
                        paymentLauncherViewModel$confirmIntent$1.label = 1;
                        obj = this.stripeApiRepository.confirmPaymentIntent$payments_core_release((ConfirmPaymentIntentParams) withShouldUseStripeSdk, options, list, paymentLauncherViewModel$confirmIntent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeIntent = (StripeIntent) obj;
                    } else if (withShouldUseStripeSdk instanceof ConfirmSetupIntentParams) {
                        ApiRequest.Options options2 = this.apiRequestOptionsProvider.get();
                        Intrinsics.checkNotNullExpressionValue(options2, "apiRequestOptionsProvider.get()");
                        List<String> list2 = EXPAND_PAYMENT_METHOD;
                        paymentLauncherViewModel$confirmIntent$1.label = 2;
                        obj = this.stripeApiRepository.confirmSetupIntent$payments_core_release((ConfirmSetupIntentParams) withShouldUseStripeSdk, options2, list2, paymentLauncherViewModel$confirmIntent$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stripeIntent = (StripeIntent) obj;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                if (stripeIntent == null) {
                    return stripeIntent;
                }
                throw new IllegalArgumentException(REQUIRED_ERROR.toString());
            }
        }
        paymentLauncherViewModel$confirmIntent$1 = new PaymentLauncherViewModel$confirmIntent$1(this, continuation);
        Object obj2 = paymentLauncherViewModel$confirmIntent$1.result;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = paymentLauncherViewModel$confirmIntent$1.label;
        if (i == 0) {
        }
        if (stripeIntent == null) {
        }
    }

    private final boolean getHasStarted() {
        Boolean bool = (Boolean) this.savedStateHandle.m66947f(KEY_HAS_STARTED);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logReturnUrl(String str) {
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
    public final void postResult(StripeIntentResult<? extends StripeIntent> stripeIntentResult) {
        PaymentResult paymentResult;
        C49882uX2<PaymentResult> c49882uX2 = this.paymentLauncherResult;
        int outcome = stripeIntentResult.getOutcome();
        if (outcome != 1) {
            if (outcome != 2) {
                if (outcome != 3) {
                    if (outcome != 4) {
                        String failureMessage = stripeIntentResult.getFailureMessage();
                        paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, UNKNOWN_ERROR + failureMessage, null, 23, null));
                    } else {
                        String failureMessage2 = stripeIntentResult.getFailureMessage();
                        paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, TIMEOUT_ERROR + failureMessage2, null, 23, null));
                    }
                } else {
                    paymentResult = PaymentResult.Canceled.INSTANCE;
                }
            } else {
                paymentResult = new PaymentResult.Failed(new APIException(null, null, 0, stripeIntentResult.getFailureMessage(), null, 23, null));
            }
        } else {
            paymentResult = PaymentResult.Completed.INSTANCE;
        }
        c49882uX2.postValue(paymentResult);
    }

    public final void cleanUp$payments_core_release() {
        this.authenticatorRegistry.onLauncherInvalidated();
    }

    public final void confirmStripeIntent$payments_core_release(ConfirmStripeIntentParams confirmStripeIntentParams, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(confirmStripeIntentParams, "confirmStripeIntentParams");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentLauncherViewModel$confirmStripeIntent$1(this, confirmStripeIntentParams, host, null), 3, null);
    }

    public final C49882uX2<PaymentResult> getPaymentLauncherResult$payments_core_release() {
        return this.paymentLauncherResult;
    }

    public final void handleNextActionForStripeIntent$payments_core_release(String clientSecret, AuthActivityStarterHost host) {
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(host, "host");
        if (getHasStarted()) {
            return;
        }
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentLauncherViewModel$handleNextActionForStripeIntent$1(this, clientSecret, host, null), 3, null);
    }

    public final void onPaymentFlowResult$payments_core_release(PaymentFlowResult.Unvalidated paymentFlowResult) {
        Intrinsics.checkNotNullParameter(paymentFlowResult, "paymentFlowResult");
        Z30.m73800d(C36218Tr6.m82333a(this), null, null, new PaymentLauncherViewModel$onPaymentFlowResult$1(this, paymentFlowResult, null), 3, null);
    }

    public final void register$payments_core_release(InterfaceC29050u5 caller) {
        Intrinsics.checkNotNullParameter(caller, "caller");
        this.authenticatorRegistry.onNewActivityResultCaller(caller, new InterfaceC28515t5() { // from class: zM3
            @Override // p000.InterfaceC28515t5
            /* renamed from: a */
            public final void mo1514a(Object obj) {
                PaymentLauncherViewModel.this.onPaymentFlowResult$payments_core_release((PaymentFlowResult.Unvalidated) obj);
            }
        });
    }
}
