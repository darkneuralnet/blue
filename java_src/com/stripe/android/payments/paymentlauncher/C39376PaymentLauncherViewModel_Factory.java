package com.stripe.android.payments.paymentlauncher;

import androidx.lifecycle.C11747p;
import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.core.networking.DefaultAnalyticsRequestExecutor;
import com.stripe.android.networking.PaymentAnalyticsRequestFactory;
import com.stripe.android.networking.StripeRepository;
import com.stripe.android.payments.DefaultReturnUrl;
import com.stripe.android.payments.PaymentIntentFlowResultProcessor;
import com.stripe.android.payments.SetupIntentFlowResultProcessor;
import com.stripe.android.payments.core.authentication.PaymentAuthenticatorRegistry;
import dagger.Lazy;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
/* renamed from: com.stripe.android.payments.paymentlauncher.PaymentLauncherViewModel_Factory  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39376PaymentLauncherViewModel_Factory implements InterfaceC48812sj1<PaymentLauncherViewModel> {
    private final Y94<DefaultAnalyticsRequestExecutor> analyticsRequestExecutorProvider;
    private final Y94<ApiRequest.Options> apiRequestOptionsProvider;
    private final Y94<PaymentAuthenticatorRegistry> authenticatorRegistryProvider;
    private final Y94<DefaultReturnUrl> defaultReturnUrlProvider;
    private final Y94<Boolean> isInstantAppProvider;
    private final Y94<Boolean> isPaymentIntentProvider;
    private final Y94<PaymentAnalyticsRequestFactory> paymentAnalyticsRequestFactoryProvider;
    private final Y94<PaymentIntentFlowResultProcessor> paymentIntentFlowResultProcessorProvider;
    private final Y94<C11747p> savedStateHandleProvider;
    private final Y94<SetupIntentFlowResultProcessor> setupIntentFlowResultProcessorProvider;
    private final Y94<StripeRepository> stripeApiRepositoryProvider;
    private final Y94<Map<String, String>> threeDs1IntentReturnUrlMapProvider;
    private final Y94<CoroutineContext> uiContextProvider;

    public C39376PaymentLauncherViewModel_Factory(Y94<Boolean> y94, Y94<StripeRepository> y942, Y94<PaymentAuthenticatorRegistry> y943, Y94<DefaultReturnUrl> y944, Y94<ApiRequest.Options> y945, Y94<Map<String, String>> y946, Y94<PaymentIntentFlowResultProcessor> y947, Y94<SetupIntentFlowResultProcessor> y948, Y94<DefaultAnalyticsRequestExecutor> y949, Y94<PaymentAnalyticsRequestFactory> y9410, Y94<CoroutineContext> y9411, Y94<C11747p> y9412, Y94<Boolean> y9413) {
        this.isPaymentIntentProvider = y94;
        this.stripeApiRepositoryProvider = y942;
        this.authenticatorRegistryProvider = y943;
        this.defaultReturnUrlProvider = y944;
        this.apiRequestOptionsProvider = y945;
        this.threeDs1IntentReturnUrlMapProvider = y946;
        this.paymentIntentFlowResultProcessorProvider = y947;
        this.setupIntentFlowResultProcessorProvider = y948;
        this.analyticsRequestExecutorProvider = y949;
        this.paymentAnalyticsRequestFactoryProvider = y9410;
        this.uiContextProvider = y9411;
        this.savedStateHandleProvider = y9412;
        this.isInstantAppProvider = y9413;
    }

    public static C39376PaymentLauncherViewModel_Factory create(Y94<Boolean> y94, Y94<StripeRepository> y942, Y94<PaymentAuthenticatorRegistry> y943, Y94<DefaultReturnUrl> y944, Y94<ApiRequest.Options> y945, Y94<Map<String, String>> y946, Y94<PaymentIntentFlowResultProcessor> y947, Y94<SetupIntentFlowResultProcessor> y948, Y94<DefaultAnalyticsRequestExecutor> y949, Y94<PaymentAnalyticsRequestFactory> y9410, Y94<CoroutineContext> y9411, Y94<C11747p> y9412, Y94<Boolean> y9413) {
        return new C39376PaymentLauncherViewModel_Factory(y94, y942, y943, y944, y945, y946, y947, y948, y949, y9410, y9411, y9412, y9413);
    }

    public static PaymentLauncherViewModel newInstance(boolean z, StripeRepository stripeRepository, PaymentAuthenticatorRegistry paymentAuthenticatorRegistry, DefaultReturnUrl defaultReturnUrl, Y94<ApiRequest.Options> y94, Map<String, String> map, Lazy<PaymentIntentFlowResultProcessor> lazy, Lazy<SetupIntentFlowResultProcessor> lazy2, DefaultAnalyticsRequestExecutor defaultAnalyticsRequestExecutor, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, CoroutineContext coroutineContext, C11747p c11747p, boolean z2) {
        return new PaymentLauncherViewModel(z, stripeRepository, paymentAuthenticatorRegistry, defaultReturnUrl, y94, map, lazy, lazy2, defaultAnalyticsRequestExecutor, paymentAnalyticsRequestFactory, coroutineContext, c11747p, z2);
    }

    @Override // p000.Y94
    public PaymentLauncherViewModel get() {
        return newInstance(this.isPaymentIntentProvider.get().booleanValue(), this.stripeApiRepositoryProvider.get(), this.authenticatorRegistryProvider.get(), this.defaultReturnUrlProvider.get(), this.apiRequestOptionsProvider, this.threeDs1IntentReturnUrlMapProvider.get(), V51.m80430a(this.paymentIntentFlowResultProcessorProvider), V51.m80430a(this.setupIntentFlowResultProcessorProvider), this.analyticsRequestExecutorProvider.get(), this.paymentAnalyticsRequestFactoryProvider.get(), this.uiContextProvider.get(), this.savedStateHandleProvider.get(), this.isInstantAppProvider.get().booleanValue());
    }
}
